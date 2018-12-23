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
package de.cau.cs.kieler.scg.processors.transformators.codegen.smv

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kicool.compilation.VariableStore

/**
 * @author aas
 * 
 */
class SmvCodeGeneratorDeclarationsModule extends SmvCodeGeneratorModuleBase {

    @Inject extension SmvCodeSerializeHRExtensions serializer

    override getName() {
        return class.simpleName;
    }

    override generateInit() {
    }

    override generate() {
        incIndentationLevel
        appendIndentedLine("VAR")
        // Add the declarations of the model.
        for (declaration : scg.declarations) {
            for (valuedObject : declaration.valuedObjects) {
                if (declaration instanceof VariableDeclaration) {
                    val declarationType = if (declaration.type != ValueType.HOST || declaration.hostType.nullOrEmpty) 
                        declaration.type.serializeHR
                        else declaration.hostType
                    appendIndentation
                    code.append(valuedObject.name)
                    code.append(" : ")
                    code.append(declarationType)
                    code.append(";\n")
                }
            }
        }
        
        // Add pre guards
        val store = VariableStore.get(processorInstance.environment)
        for(entry : store.variables.entries) {
            val variableInformation = entry.value
            if(variableInformation.properties.contains(SmvCodeGeneratorModule.PROPERTY_PREGUARD)) {
                val preGuardName = entry.key
                appendIndentation()
                code.append(preGuardName).append(" : boolean;\n")
            }
        }
    }

    override generateDone() {
        
    }
}
