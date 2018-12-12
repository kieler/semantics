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

import de.cau.cs.kieler.kexpressions.VariableDeclaration

/**
 * Adds the code for the init process.
 * 
 * @author aas
 * 
 */
class PromelaCodeGeneratorInitModule extends PromelaCodeGeneratorModuleBase {

    override getName() {
        return class.simpleName;
    }

    override generateInit() {
        
    }

    override generate() {
        code.append("init {\n")
        incIndentationLevel
        
        // Add the initialization of _GO and pre-guards
        appendIndentation()
        code.append("_GO = 1;\n")
        for (declaration : scg.declarations) {
            for (valuedObject : declaration.valuedObjects) {
                if (declaration instanceof VariableDeclaration) {
                    if (isPreGuard(valuedObject)) {
                        appendIndentation()
                        code.append(valuedObject.name).append(" = 0").append(";\n")
                    }
                }
            }
        }
        // Run the tick loop
        appendIndentedLine('''run «TICK_LOOP_FUNCTION_NAME»();''')
        
        decIndentationLevel
        appendIndentedLine("}")
    }

    override generateDone() {
        
    }
}
