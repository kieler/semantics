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
package de.cau.cs.kieler.scg.processors.codegen.smv

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.verification.RangeAssumption
import de.cau.cs.kieler.verification.VerificationAssumption
import java.util.List

import static extension de.cau.cs.kieler.verification.VerificationContextExtensions.*
import de.cau.cs.kieler.scg.processors.ssa.SSACoreExtensions

/**
 * @author aas
 * 
 */
class SmvCodeGeneratorDeclarationsModule extends SmvCodeGeneratorModuleBase {

    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension SSACoreExtensions
    @Inject extension SmvCodeSerializeHRExtensions serializer
    
    var List<VerificationAssumption> assumptions
    var boolean useIVARinSmvModels = false
    
    override getName() {
        return class.simpleName;
    }

    override generateInit() {
    }

    override generate() {
        assumptions = verificationContext?.verificationAssumptions
        useIVARinSmvModels = verificationContext?.smvUseIVAR
        
        incIndentationLevel
        if(useIVARinSmvModels) {
            appendIndentedLine("IVAR")
        } else {
            appendIndentedLine("VAR")
        }
        
        // Add inputs of model
        for (decl : scg.declarations) {
            for (valuedObject : decl.valuedObjects) {
                if (decl instanceof VariableDeclaration) {
                    if(decl.isInput) {
                        val declType = decl.getSmvType(valuedObject)
                        appendIndentation
                        code.append(valuedObject.name).append(" : ").append(declType).append(";\n")    
                    }
                }
            }
        }
        
        // Add pre guards
        if(useIVARinSmvModels) {
            appendIndentedLine("VAR")
        } else {
            // The VAR keyword was already added for the input variables
        }
        
        appendIndentedLine("_GO : boolean;");
        val store = VariableStore.get(processorInstance.environment)
        for(entry : store.variables.entries) {
            val variableInformation = entry.value
            if(variableInformation.properties.contains(SmvCodeGeneratorModule.PROPERTY_PREGUARD)) {
                val preGuardName = entry.key
                val predValuedObject = variableInformation.valuedObject
                val declType = predValuedObject.variableDeclaration.getSmvType(predValuedObject)
                appendIndentation()
                code.append(preGuardName).append(" : ").append(declType).append(";\n")
            }
        }
    }

    override generateDone() {
        
    }
    
    private def CharSequence getSmvType(VariableDeclaration decl, ValuedObject valuedObject) {
        // If this is a variable introduced by SSA, then we use the assumptions for the original variable.
        val origValuedObject = if(decl.isSSA) decl.ssaOrigVO else valuedObject
        val rangeAssumption = getRangeAssumption(origValuedObject)
        if(rangeAssumption !== null && !verificationContext.isSmvIgnoreRangeAssumptions) {
            return rangeAssumption.minValue+".."+rangeAssumption.maxValue
        }
        if (decl.type == ValueType.HOST && !decl.hostType.isNullOrEmpty) {
            return decl.hostType
        }
        return decl.type.serializeHR
    }
    
    private def RangeAssumption getRangeAssumption(ValuedObject valuedObject) {
        if(!assumptions.isNullOrEmpty) {
            return assumptions.filter(RangeAssumption).findFirst [
                it.valuedObject.name == valuedObject.name
            ]
        }
    }
}
