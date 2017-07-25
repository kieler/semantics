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
import com.google.inject.Inject
import com.google.inject.Injector
import com.google.inject.Guice

/**
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
class CCodeGeneratorModule extends SCGCodeGeneratorModule {
    
    val Injector injector = Guice.createInjector
    
    @Accessors var CCodeGeneratorStructModule struct
    @Accessors var CCodeGeneratorResetModule reset 
    @Accessors var CCodeGeneratorTickModule tick
    @Accessors var CCodeGeneratorLogicModule logic
    
    override configure(String baseName, SCGraphs sCGraphs, SCGraph scg, Processor<SCGraphs, CodeContainer> processorInstance, 
        Map<SCGraph, SCGCodeGeneratorModule> codeGeneratorModuleMap, SCGCodeGeneratorModule parent
    ) {
        super.configure(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, parent)
        
        struct = injector.getInstance(typeof(CCodeGeneratorStructModule)).
            configure(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, this) as CCodeGeneratorStructModule
            
        reset = injector.getInstance(CCodeGeneratorResetModule).
            configure(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, this) as CCodeGeneratorResetModule
            
            
            
        tick = injector.getInstance(CCodeGeneratorTickModule).
            configure(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, this) as CCodeGeneratorTickModule  
        logic = injector.getInstance(CCodeGeneratorLogicModule).
            configure(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, this) as CCodeGeneratorLogicModule
            
        return this
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