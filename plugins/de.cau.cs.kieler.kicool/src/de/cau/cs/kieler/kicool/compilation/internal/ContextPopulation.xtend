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
package de.cau.cs.kieler.kicool.compilation.internal

import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import de.cau.cs.kieler.kicool.compilation.Environment
import de.cau.cs.kieler.kicool.compilation.Compile

/**
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class ContextPopulation {
    
     static def void populateContext(CompilationContext cc) {
        cc.system.processors.populate(cc)     
        cc.system.metrics.forEach[ it.populate(cc) ]
    }
    
    static dispatch def void populate(de.cau.cs.kieler.kicool.Processor processor, CompilationContext cc) {
        val processorCompilationUnit = KiCoolRegistration.getProcessorInstance(processor.id)
        if (processorCompilationUnit == null) {
            System.err.println("The context cannot find a compilation unit for the processor " + processor)
            return
        }
        val env = new Environment()
        val envP = new Environment()
        
        processorCompilationUnit.setEnvironment(env, envP)
        
        cc.processorMap.put(processor, processorCompilationUnit)
    }

    static dispatch def void populate(de.cau.cs.kieler.kicool.Metric metric, CompilationContext cc) {
        val processorCompilationUnit = KiCoolRegistration.getProcessorInstance(metric.id)
        if (processorCompilationUnit == null) {
            System.err.println("The context cannot find a compilation unit for the metric " + metric)
            return
        }
        val env = new Environment()
        val envP = new Environment()
        
        processorCompilationUnit.setEnvironment(env, envP)
        
        cc.processorMap.put(metric, processorCompilationUnit)
    }
    
    static dispatch def void populate(de.cau.cs.kieler.kicool.ProcessorGroup processorGroup, CompilationContext cc) {
        for(processor : processorGroup.processors) {
            processor.populate(cc)
        }        
    }

    static dispatch def void populate(de.cau.cs.kieler.kicool.ProcessorAlternativeGroup processorAlternativeGroup, CompilationContext cc) {
        for(processor : processorAlternativeGroup.processors) {
            processor.populate(cc)
        }
    }
    
    static dispatch def void populate(de.cau.cs.kieler.kicool.ProcessorSystem processorSystem, CompilationContext cc) {
        val subContext = Compile.createCompilationContext(processorSystem.id, null) => [
            parentContext = cc
        ]
        
        cc.subContexts.put(processorSystem, subContext)
    }
    
    
}

