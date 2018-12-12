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

import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kexpressions.ValueType

/**
 * Promela Code Generator Variables Module
 * 
 * Handles the creation and initialization of variables.
 * 
 * @author aas
 * 
 */
class PromelaCodeGeneratorVariablesModule extends SCGCodeGeneratorModule {
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension PromelaCodeSerializeHRExtensions serializer
    
    override getName() {
        return "My name"
    }
    
    override generateInit() {
        // Nothing to do
    }
    
    override generate() {
        // Add the declarations of the model.
        for (declaration : scg.declarations) {
            for (valuedObject : declaration.valuedObjects) {
                if (declaration instanceof VariableDeclaration) {
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
    
    override generateDone() {
        // Nothing to do
    }
}