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
package de.cau.cs.kieler.kicool.compilation

import de.cau.cs.kieler.kicool.System
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.Observable
import java.util.Map
import java.util.HashMap

import static extension de.cau.cs.kieler.kicool.compilation.internal.EnvironmentManager.*
import de.cau.cs.kieler.kicool.compilation.observer.CompilationStart
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorStart
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorFinished
import de.cau.cs.kieler.kicool.compilation.observer.CompilationFinished
import static extension de.cau.cs.kieler.kicool.compilation.Environment.*
import de.cau.cs.kieler.kicool.ProcessorGroup

/**
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class CompilationContext extends Observable implements IKiCoolCloneable {
    
    // Minimal requirements for compilation
    @Accessors System system
    @Accessors Object sourceModel
    @Accessors Map<de.cau.cs.kieler.kicool.ProcessorEntry, de.cau.cs.kieler.kicool.compilation.Processor> processorMap
    
    new() {
        processorMap = new HashMap<de.cau.cs.kieler.kicool.ProcessorEntry, de.cau.cs.kieler.kicool.compilation.Processor>()
    }
    
    def getProcessorInstances() {
        processorMap.values.toList
    }
    
    def de.cau.cs.kieler.kicool.compilation.Processor getCompilationUnit(de.cau.cs.kieler.kicool.ProcessorEntry entry) {
        processorMap.get(entry)
    }
    
    def de.cau.cs.kieler.kicool.compilation.Processor getFirstProcessorInstance() {
        val processor = (system.processors as ProcessorGroup).processors.head
        processorMap.get(processor)
    }
    
    public def notify(Object arg) {
        setChanged
        notifyObservers(arg)
    }
    
    def void compileAsynchronously() {
        Compile.asyncronousCompilation(this)
    }
    
    def void compile() {
        val processorEntry = system.processors
        
        val environment = new Environment
        environment.sourceModel = sourceModel
        environment.model = sourceModel
        environment.compilationContext = this
        
        // Add metric code for initial model
        
        environment.inplaceCompilation = false
        
        notify(new CompilationStart(this))
        val EPrime = processorEntry.compileEntry(environment)
        notify(new CompilationFinished(this, EPrime))        
    }
    
    
    protected dispatch def Environment compileEntry(de.cau.cs.kieler.kicool.Processor processor, Environment environment) {
        val compilationUnit = processorMap.get(processor)
        environment.data.put(Environment.META_PROCESSOR, processor)
        environment.data.put(Environment.COMPILATION_UNIT, compilationUnit)
        val environmentPrime = environment.preparePrimeEnvironment
        
        compilationUnit.setEnvironment(environment, environmentPrime)
        
        notify(new ProcessorStart(this, processor, compilationUnit))
        val startTimestamp = java.lang.System.nanoTime
        environmentPrime.setData(START_TIMESTAMP, startTimestamp)
        compilationUnit.process
        val stopTimestamp = java.lang.System.nanoTime
        environmentPrime.setData(STOP_TIMESTAMP, stopTimestamp)
        environmentPrime.setData(PTIME, (stopTimestamp - startTimestamp) / 1000_000)
        
        
        // Add Metric code
        
        notify(new ProcessorFinished(this, processor, compilationUnit))
        
        environmentPrime
    }
    
    protected dispatch def Environment compileEntry(de.cau.cs.kieler.kicool.ProcessorGroup processorGroup, Environment environment) {
        var Environment environmentPrime = environment
        for(processor : processorGroup.processors) {
             environmentPrime = processor.compileEntry(environmentPrime)
        }
        environmentPrime
    }

    protected dispatch def Environment compileEntry(de.cau.cs.kieler.kicool.ProcessorAlternativeGroup processorAlternativeGroup, Environment environment) {
        val environmentLists = <Environment> newArrayList
        for(processor : processorAlternativeGroup.processors) {
            environmentLists += processor.compileEntry(environment)
        }
        environmentLists.last
    }
    
    override cloneObject() {
        this
    }
    
    override isMutable() {
        false
    }
        
}