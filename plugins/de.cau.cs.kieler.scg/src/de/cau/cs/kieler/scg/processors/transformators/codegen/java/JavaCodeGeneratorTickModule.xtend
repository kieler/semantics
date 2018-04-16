/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.transformators.codegen.java

import de.cau.cs.kieler.scg.transformations.guardExpressions.AbstractGuardExpressions
import de.cau.cs.kieler.scg.processors.transformators.codegen.c.CCodeGeneratorTickModule

/**
 * Java Code Generator Tick Module
 * 
 * Handles the creation of the tick function.
 * 
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
class JavaCodeGeneratorTickModule extends CCodeGeneratorTickModule {
    
    var JavaCodeGeneratorStructModule struct
    var JavaCodeGeneratorLogicModule logic
    
    override configure() {
        struct = (parent as JavaCodeGeneratorModule).struct as JavaCodeGeneratorStructModule
        logic = (parent as JavaCodeGeneratorModule).logic as JavaCodeGeneratorLogicModule
    }
    
    override generateInit() {
        indent(1)
        code.append("public void ").append(getName)
        code.append("(")
        code.append(")")
        code.append(" {\n")
        indent(2)
        code.append(logic.getName).append("(").append(struct.getVariableName).append(");\n")
        code.append("\n")
    }
    
    override generateDone() {
        indent(2) 
        code.append(struct.getVariableName).append(struct.separator).append(AbstractGuardExpressions.GO_GUARD_NAME).append(" = false;\n")
        indent(1);
        code.append("}\n")
    }
    
}