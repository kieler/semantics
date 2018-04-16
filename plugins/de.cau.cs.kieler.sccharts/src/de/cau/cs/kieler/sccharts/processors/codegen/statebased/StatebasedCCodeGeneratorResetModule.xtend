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
package de.cau.cs.kieler.sccharts.processors.codegen.statebased

import com.google.inject.Inject

/**
 * C Code Generator Reset Module
 * 
 * Handles the creation of the reset function.
 * 
 * @author ssm
 * @kieler.design 2017-07-24 proposed 
 * @kieler.rating 2017-07-24 proposed yellow 
 * 
 */
class StatebasedCCodeGeneratorResetModule extends SCChartsCodeGeneratorModule {
    
    static val RESET_NAME = "reset"
    
    @Inject StatebasedCCodeGeneratorStructModule struct
    
    override configure() {
        struct = (parent as StatebasedCCodeGeneratorModule).struct as StatebasedCCodeGeneratorStructModule
    }    
    
    def getName() {
        RESET_NAME + baseName + suffix
    }
    
    override generateInit() {
        code.append("void ").append(getName)
        code.append("(")
        code.append(struct.getName).append("* ").append(struct.getVariableName)
        code.append(")")
        
        struct.forwardDeclarations.append(code).append(";\n")
        
        code.append(" {\n")
        
        indent 
//        code.append(struct.getVariableName).append("->").append(AbstractGuardExpressions.GO_GUARD_NAME).append(" = 1;\n")
        indent
//        code.append(struct.getVariableName).append("->").append(AbstractGuardTransformation.TERM_GUARD_NAME).append(" = 0;\n")
    }
    
    override generate() {
    }
    
    override generateDone() {
        code.append("}\n")
    }
    
}