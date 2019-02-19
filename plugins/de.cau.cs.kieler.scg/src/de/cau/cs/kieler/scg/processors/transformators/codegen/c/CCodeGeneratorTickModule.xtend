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
package de.cau.cs.kieler.scg.processors.transformators.codegen.c

import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import de.cau.cs.kieler.scg.transformations.guardExpressions.AbstractGuardExpressions

/**
 * C Code Generator Tick Module
 * 
 * Handles the creation of the tick function.
 * 
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
class CCodeGeneratorTickModule extends SCGCodeGeneratorModule {
    
    var CCodeGeneratorStructModule struct
    var CCodeGeneratorLogicModule logic
    
    override configure() {
        struct = (parent as CCodeGeneratorModule).struct as CCodeGeneratorStructModule
        logic = (parent as CCodeGeneratorModule).logic as CCodeGeneratorLogicModule
    }
    
    override generateInit() {
        code.append("void ").append(getName)
        code.append("(")
        code.append(struct.getName).append("* ").append(struct.getVariableName)
        code.append(")")
        
        struct.forwardDeclarations.append(code).append(";\n")
        
        code.append(" {\n")
        code.append(indentation).append(logic.getName).append("(").append(struct.getVariableName).append(");\n")
        code.append("\n")
    }
    
    override generate() {

    }
    
    override generateDone() {
        indent 
        code.append(struct.getVariableName).append("->").append(AbstractGuardExpressions.GO_GUARD_NAME).append(" = 0;\n")
        code.append("}\n")
    }
    
}