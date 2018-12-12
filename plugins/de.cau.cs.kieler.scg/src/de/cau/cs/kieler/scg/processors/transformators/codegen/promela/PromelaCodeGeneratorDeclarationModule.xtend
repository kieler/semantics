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
        // Nothing to do
    }
    
    override generate() {
        // Add the declarations of the model.
        for (declaration : scg.declarations) {
            for (valuedObject : declaration.valuedObjects) {
                if (declaration instanceof VariableDeclaration) {
                    if(!isGuard(valuedObject) && !isConditionGuard(valuedObject)) {
                        val declarationType = if (declaration.type != ValueType.HOST || declaration.hostType.nullOrEmpty) 
                            declaration.type.serializeHR
                            else declaration.hostType
                        code.append(declarationType)
                        code.append(" ")
                        code.append(valuedObject.name)
                        code.append(";\n")
                    }
                }
            }
        }
        
        // Add pre guards
        val store = VariableStore.get(processorInstance.environment)
        for(entry : store.variables.entries) {
            val variableInformation = entry.value
            if(variableInformation.properties.contains("preGuard")) {
                val preGuardName = entry.key
                appendIndentation()
                code.append("bool ").append(preGuardName).append(" = 0;\n")
            }
        }
    }
    
    override generateDone() {
        // Nothing to do
    }
}