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
class StatebasedCCodeGeneratorTickModule extends SCChartsCodeGeneratorModule {
    
    protected static val TICK_NAME = "tick"
    
    var StatebasedCCodeGeneratorStructModule struct
    var StatebasedCCodeGeneratorLogicModule logic
    
    override configure() {
        struct = (parent as StatebasedCCodeGeneratorModule).struct as StatebasedCCodeGeneratorStructModule
        logic = (parent as StatebasedCCodeGeneratorModule).logic as StatebasedCCodeGeneratorLogicModule
    }
    
    def getName() {
        TICK_NAME + baseName + suffix
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
//        code.append(struct.getVariableName).append("->").append(AbstractGuardExpressions.GO_GUARD_NAME).append(" = 0;\n")
        code.append("}\n")
    }
    
}