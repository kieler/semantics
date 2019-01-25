/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.transformators.codegen.promela

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.sccharts.verification.VerificationProperty
import de.cau.cs.kieler.sccharts.verification.VerificationPropertyType
import java.util.List

/**
 * Handles the declaration of variables.
 * 
 * @author aas
 * 
 */
class PromelaCodeGeneratorDeclarationModule extends PromelaCodeGeneratorModuleBase {
    
    @Inject extension PromelaCodeSerializeHRExtensions serializer
    
    override getName() {
        return class.simpleName;
    }
    
    override generateInit() {
    }
    
    override generate() {
        // Add ltl properties
        val verificationProperties = getVerificationProperties()
        if(!verificationProperties.isNullOrEmpty) {
            val property = verificationProperties.head
            if(property.type == VerificationPropertyType.LTL) {
                val pmlFormula = property.formula.toPmlLtlFormula
                appendIndentedLine('''ltl «property.name.replace(" ", "_")» { «pmlFormula» }''')
                code.append("\n")
            } else if(property.type == VerificationPropertyType.CTL) {
                val exception = new Exception("Promela does not support specification of CTL properties")
                processorInstance.environment.errors.add(exception)
            }
        }
        
        // Add the declarations of the model.
        for (declaration : scg.declarations) {
            for (valuedObject : declaration.valuedObjects) {
                if(valuedObject.name != "_GO") {
                    if (declaration instanceof VariableDeclaration) {
                        val declarationType = if (declaration.type != ValueType.HOST || declaration.hostType.nullOrEmpty) 
                            declaration.type.serializeHR
                            else declaration.hostType
                        appendIndentedLine('''«declarationType» «valuedObject.name»;''')
                    }    
                }
            }
        }
        
        // Add pre guards
        val store = VariableStore.get(processorInstance.environment)
        for(entry : store.variables.entries) {
            val variableInformation = entry.value
            if(variableInformation.properties.contains(PromelaCodeGeneratorModule.PROPERTY_PREGUARD)) {
                val preGuardName = entry.key
                appendIndentedLine('''bool «preGuardName» = 0;''')
            }
        }
        
        // Add _GO signal
        appendIndentedLine('''bool _GO = 1;''')
        
        // Add end-of-tick flag
        appendIndentedLine('''bool «TICK_END_FLAG_NAME» = 0;''')
    }
    
    override generateDone() {
    }
    
    private def List<VerificationProperty> getVerificationProperties() {
        return processorInstance.compilationContext.startEnvironment.getProperty(Environment.VERIFICATION_PROPERTIES) as List<VerificationProperty>
    }
    
    private def String toPmlLtlFormula(String ltlFormula) {
        return ltlFormula.replace("G", "[]").replace("F", "<>").replace("R", "V")
    }
}