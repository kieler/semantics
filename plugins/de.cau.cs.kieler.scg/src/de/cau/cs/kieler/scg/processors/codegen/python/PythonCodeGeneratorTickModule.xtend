/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.codegen.python

import de.cau.cs.kieler.scg.processors.SimpleGuardExpressions
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGeneratorTickModule

/**
 * Python Code Generator Tick Module
 * 
 * Handles the creation of the tick function.
 * 
 * @author als
 * 
 */
class PythonCodeGeneratorTickModule extends CCodeGeneratorTickModule {
    
    var PythonCodeGeneratorStructModule struct
    var PythonCodeGeneratorLogicModule logic
    
    override configure() {
        struct = (parent as PythonCodeGeneratorModule).struct as PythonCodeGeneratorStructModule
        logic = (parent as PythonCodeGeneratorModule).logic as PythonCodeGeneratorLogicModule
    }
    
    override generateInit() {
        indent(1)
        code.append("def ").append(getName).append("(self):\n")
        indent(2)
        code.append(struct.getVariableName).append(struct.separator).append(logic.getName).append("()\n")
        code.append("\n")
    }
    
    override generateDone() {
        indent(2) 
        code.append(struct.getVariableName).append(struct.separator).append(SimpleGuardExpressions.GO_GUARD_NAME).append(" = False\n")
        indent(1);
    }
    
}