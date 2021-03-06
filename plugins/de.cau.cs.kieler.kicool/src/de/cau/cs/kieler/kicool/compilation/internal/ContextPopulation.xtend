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
package de.cau.cs.kieler.kicool.compilation.internal

import de.cau.cs.kieler.kicool.IntermediateReference
import de.cau.cs.kieler.kicool.ProcessorAlternativeGroup
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.kicool.ProcessorSystem
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration

/**
 * Internal class that creates all necessary instances of a compilation context.
 * 
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class ContextPopulation {
    
    /**
     * Create instances for all processors (including metrics).
     */
    static def void populateContext(CompilationContext cc) {
        cc.processorMap.clear
        cc.processorInstancesSequence.clear
        cc.system.processors.populate(cc)     
        cc.system.intermediates.forEach[ it.populate(cc) ]
        EnvironmentPropertyHolder.processEnvironmentConfig(cc.startEnvironment, cc.system.startConfig)
        EnvironmentPropertyHolder.processEnvironmentConfig(cc.startEnvironment, cc.system.config)
    }
    
    static dispatch def void populate(ProcessorReference processorReference, CompilationContext cc) {
        val processorInstance = KiCoolRegistration.getProcessorInstance(processorReference.id)
        if (processorInstance === null) {
            System.err.println("The context cannot find a compilation unit for the processor " + processorReference)
            return
        }
        val env = new Environment()
        val envP = new Environment()
        env.setProperty(Environment.ENABLED, true)
        
        processorInstance.setEnvironment(env, envP)
        
        cc.processorMap.put(processorReference, processorInstance)
        cc.processorInstancesSequence.add(processorInstance)
    }

    static dispatch def void populate(IntermediateReference intermediateReference, CompilationContext cc) {
        val processorInstance = KiCoolRegistration.getProcessorInstance(intermediateReference.id)
        if (processorInstance === null) {
            System.err.println("The context cannot find a compilation unit for the metric " + intermediateReference)
            return
        }
        val env = new Environment()
        val envP = new Environment()
        
        processorInstance.setEnvironment(env, envP)
        
        cc.processorMap.put(intermediateReference, processorInstance)
    }
    
    static dispatch def void populate(ProcessorGroup processorGroup, CompilationContext cc) {
        for(processor : processorGroup.processors) {
            processor.populate(cc)
        }        
    }

    static dispatch def void populate(ProcessorAlternativeGroup processorAlternativeGroup, CompilationContext cc) {
        for(processor : processorAlternativeGroup.processors) {
            processor.populate(cc)
        }
    }
    
    static dispatch def void populate(ProcessorSystem processorSystem, CompilationContext cc) {
        throw new IllegalArgumentException("A context should not contain ProcessorSystem entries. See SystemTransformation.")
    }
    
    
}

