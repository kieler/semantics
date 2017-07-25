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
package de.cau.cs.kieler.scg.processors.transformators.codegen.c

import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.scg.SCGraph
import java.util.Map
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import de.cau.cs.kieler.kicool.compilation.CodeContainer
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
    
    static val TICK_NAME = "tick"
    
    var CCodeGeneratorStructModule struct
    var CCodeGeneratorLogicModule logic
    
    override configure(String baseName, SCGraphs sCGraphs, SCGraph scg, Processor<SCGraphs, CodeContainer> processorInstance, 
        Map<SCGraph, SCGCodeGeneratorModule> codeGeneratorModuleMap, SCGCodeGeneratorModule parent
    ) {
        super.configure(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, parent)
        
        struct = (parent as CCodeGeneratorModule).struct
        logic = (parent as CCodeGeneratorModule).logic
        
        return this
    }
    
    def getName() {
        TICK_NAME + baseName + suffix
    }
    
    override generateInit() {
        code.append("void ").append(getName)
        code.append("(")
        code.append(struct.getName).append("* ").append(struct.getVariableName)
        code.append(") {\n")
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