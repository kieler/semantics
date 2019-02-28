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
package de.cau.cs.kieler.scg.processors.codegen.java

import com.google.inject.Inject
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGeneratorResetModule
import de.cau.cs.kieler.scg.processors.SimpleGuardExpressions

/**
 * Java Code Generator Reset Module
 * 
 * Handles the creation of the reset function.
 * 
 * @author ssm
 * @kieler.design 2017-10-04 proposed 
 * @kieler.rating 2017-10-04 proposed yellow 
 * 
 */
class JavaCodeGeneratorResetModule extends CCodeGeneratorResetModule {
    
    @Inject JavaCodeGeneratorStructModule struct
    
    override configure() {
        struct = (parent as JavaCodeGeneratorModule).struct as JavaCodeGeneratorStructModule
    }    
    
    override generateInit() {
        indent
        code.append("public void ").append(getName)
        code.append("(")
        code.append(")")
        
        code.append(" {\n")
        
        indent(2) 
        code.append(struct.getVariableName).append(struct.separator).append(SimpleGuardExpressions.GO_GUARD_NAME).append(" = true;\n")
        indent(2)
        code.append(struct.getVariableName).append(struct.separator).append(SimpleGuardExpressions.TERM_GUARD_NAME).append(" = false;\n")
    }
    
    override generateDone() {
        indent
        code.append("}\n")
    }
    
}