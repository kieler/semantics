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
import com.google.inject.Inject
import de.cau.cs.kieler.scg.codegen.SCG2CSerializeHRExtensions
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kicool.compilation.CodeContainer

/**
 * @author ssm
 * @kieler.design 2017-07-24 proposed 
 * @kieler.rating 2017-07-24 proposed yellow 
 * 
 */
class CCodeGeneratorLogicModule extends SCGCodeGeneratorModule {
    
    @Inject extension SCG2CSerializeHRExtensions
    
    static val LOGIC_NAME = "logic"
    
    var CCodeGeneratorStructModule struct = null 
    
    new(String baseName, SCGraphs sCGraphs, SCGraph scg, Processor<SCGraphs, CodeContainer> processorInstance, 
        Map<SCGraph, SCGCodeGeneratorModule> codeGeneratorModuleMap, SCGCodeGeneratorModule parent
    ) {
        super(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, parent)
        
        struct = (parent as CCodeGeneratorModule).struct as CCodeGeneratorStructModule
    }
    
    def getName() {
        LOGIC_NAME + baseName + suffix
    }
    
    override generateInit() {
        code.append("void ").append(getName)
        code.append("(")
        code.append(struct.getName).append("* ").append(struct.getVariableName)
        code.append(") {\n")
    }
    
    override generate() {

    }
    
    override generateDone() {
        code.append("}\n")
    }
    
}