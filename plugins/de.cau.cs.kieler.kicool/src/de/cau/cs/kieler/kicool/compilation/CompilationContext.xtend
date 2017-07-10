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
import de.cau.cs.kieler.kicool.compilation.observer.CompilationStart
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorStart
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorFinished
import de.cau.cs.kieler.kicool.compilation.observer.CompilationFinished
import de.cau.cs.kieler.kicool.ProcessorGroup
import java.util.Observer
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorError
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable

import static extension de.cau.cs.kieler.kicool.compilation.Environment.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import org.eclipse.emf.ecore.EObject

/**
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class CompilationContext extends Observable implements IKiCoolCloneable {
    
    // Minimal requirements for compilation
    @Accessors System system
    @Accessors Object sourceModel
    @Accessors Map<de.cau.cs.kieler.kicool.ProcessorEntry, de.cau.cs.kieler.kicool.compilation.Processor<?,?>> processorMap
    @Accessors Map<de.cau.cs.kieler.kicool.ProcessorSystem, CompilationContext> subContexts
    @Accessors CompilationContext parentContext = null
    @Accessors Environment startEnvironment
    
    new() {
        processorMap = new HashMap<de.cau.cs.kieler.kicool.ProcessorEntry, de.cau.cs.kieler.kicool.compilation.Processor<?,?>>()
        subContexts = new HashMap<de.cau.cs.kieler.kicool.ProcessorSystem, CompilationContext>()
        
        startEnvironment = new Environment
        startEnvironment.setProperty(SOURCE_MODEL, sourceModel)
        startEnvironment.setProperty(COMPILATION_CONTEXT, this)
        startEnvironment.setProperty(INPLACE, false)        
        startEnvironment.setProperty(ONGOING_WORKING_COPY, true)
    }
    
    def getProcessorInstances() {
        processorMap.values.toList
    }
    
    def de.cau.cs.kieler.kicool.compilation.Processor<?,?> getCompilationUnit(de.cau.cs.kieler.kicool.ProcessorEntry entry) {
        processorMap.get(entry)
    }
    
    def de.cau.cs.kieler.kicool.compilation.Processor<?,?> getFirstProcessorInstance() {
        val processor = (system.processors as ProcessorGroup).processors.head
        if (processor instanceof ProcessorGroup) {
            val groupProcessor = processor.processors.head
            return processorMap.get(groupProcessor)
        } else {
            return processorMap.get(processor)
        }
    }
    
    public def notify(Object arg) {
        setChanged
        notifyObservers(arg)
    }
    
    def void compileAsynchronously() {
        Compile.asyncronousCompilation(this)
    }
    
    def void compile() {
        if (startEnvironment.getProperty(ONGOING_WORKING_COPY) && sourceModel instanceof EObject) {
            startEnvironment.setProperty(MODEL, (sourceModel as EObject).copy)
        } else {
            startEnvironment.setProperty(MODEL, sourceModel)
        }
        
        val metric = getSourceMetric
        if (metric != null) {
            metric.setEnvironment(startEnvironment, startEnvironment)
            metric.setMetricSourceEntity
            metric.setMetricEntity
            metric.setMetric
        }
        
        
        startEnvironment.compile        
    }
    
    // Protected is important. Should not be accessible from the outside.
    protected def Environment compile(Environment environment) {
        val processorEntry = system.processors
        
        notify(new CompilationStart(this))
        val EPrime = processorEntry.compileEntry(environment)
        notify(new CompilationFinished(this, EPrime))
              
        EPrime  
    }
    
    
    protected dispatch def Environment compileEntry(de.cau.cs.kieler.kicool.Processor processor, Environment environment) {
        val compilationUnit = processorMap.get(processor)
        environment.setProperty(PROCESSOR_REFERENCE, processor)
        environment.setProperty(PROCESSOR_INSTANCE, compilationUnit)
        val environmentPrime = environment.preparePrimeEnvironment
        
        compilationUnit.setEnvironment(environment, environmentPrime)
        
        environment.processEnvironmentSetter(processor.presets)
        
        notify(new ProcessorStart(this, processor, compilationUnit))
        val startTimestamp = java.lang.System.nanoTime
        environmentPrime.setProperty(START_TIMESTAMP, startTimestamp)
        try {
            if (compilationUnit.sourceEnvironment.getProperty(ENABLED)) { 
                compilationUnit.process
            }
        } catch (Exception e) {
            compilationUnit.environment.addError(e.toString)
            notify(new ProcessorError(e.message, this, processor, compilationUnit))
            java.lang.System.err.println("Error in processor " + processor)
            e.printStackTrace
        }
        val stopTimestamp = java.lang.System.nanoTime
        environmentPrime.setProperty(STOP_TIMESTAMP, stopTimestamp)
        environmentPrime.setProperty(PTIME, (stopTimestamp - startTimestamp) / 1000_000)
        
        // Add Metric code
        val metric = getMetric(processor)
        if (metric != null) {
            metric.setEnvironment(environment, environmentPrime)
            metric.setMetricEntity
            metric.setMetric
        }
        
        val overallTimestamp = java.lang.System.nanoTime
        environmentPrime.setProperty(OVERALL_TIMESTAMP, overallTimestamp)
        environmentPrime.setProperty(OVERALL_PTIME, (overallTimestamp - startTimestamp) / 1000_000)
        
        environmentPrime.processEnvironmentSetter(processor.postsets)
        
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
        val environmentList = <Environment> newArrayList
        for(processor : processorAlternativeGroup.processors) {
            environmentList += processor.compileEntry(environment)
        }
        var selectedEnvironment = environmentList.last
        for(e : environmentList) {
            val selMetric = selectedEnvironment.getProperty(Metric.METRIC)
            val envMetric = e.getProperty(Metric.METRIC)
            if (envMetric < selMetric) {
                selectedEnvironment = e
            }
        }
        selectedEnvironment
    }
    
    protected dispatch def Environment compileEntry(de.cau.cs.kieler.kicool.ProcessorSystem processorSystem, Environment environment) {
        val subContext = subContexts.get(processorSystem)
        subContext.compile(environment)
    }
    
    override cloneObject() {
        this
    }
    
    override isMutable() {
        false
    }
    
    override synchronized void addObserver(Observer o) {
        super.addObserver(o)
        for(sc : subContexts.values) sc.addObserver(o)
    }

    override synchronized void deleteObserver(Observer o) {
        super.deleteObserver(o)
        for(sc : subContexts.values) sc.deleteObserver(o)
    }    
    
    def CompilationContext getRootContext() {
        if (parentContext == null) return this
        else return parentContext.getRootContext
    }
    
    protected def Metric<?,?> getSourceMetric() {
        processorMap.get(system.metrics.head) as Metric<?,?>
    }
    
    protected def Metric<?,?> getMetric(de.cau.cs.kieler.kicool.Processor processor) {
        processorMap.get(system.metrics.head) as Metric<?,?>
    }
        
}