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
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.scg.SCGraph
import java.util.Map
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import de.cau.cs.kieler.kicool.compilation.CodeContainer

/**
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
class CCodeGeneratorModule extends SCGCodeGeneratorModule {
    
    @Accessors var SCGCodeGeneratorModule struct
    @Accessors var SCGCodeGeneratorModule tick
    @Accessors var SCGCodeGeneratorModule reset 
    @Accessors var SCGCodeGeneratorModule logic
    
    new(String baseName, SCGraphs sCGraphs, SCGraph scg, Processor<SCGraphs, CodeContainer> processorInstance, 
        Map<SCGraph, SCGCodeGeneratorModule> codeGeneratorModuleMap, SCGCodeGeneratorModule parent
    ) {
        super(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, parent)
        
        struct = new CCodeGeneratorStructModule(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, this)
        reset = new CCodeGeneratorResetModule(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, this)  
        logic = new CCodeGeneratorLogicModule(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, this)
        tick = new CCodeGeneratorTickModule(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, this)  
    }
    
    override generateInit() {
        struct.generateInit
        reset.generateInit
        logic.generateInit
        tick.generateInit
    }
    
    override generate() {
        struct.generate
        reset.generate
        logic.generate
        tick.generate
    }
    
    
    override generateDone() {
        struct.generateDone
        reset.generateDone
        logic.generateDone
        tick.generateDone
        
        code.append(struct.code).append("\n")
        code.append(reset.code).append("\n")
        code.append(logic.code).append("\n")
        code.append(tick.code)
    }
    
}