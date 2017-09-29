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

import com.google.inject.Inject
import de.cau.cs.kieler.kicool.ProcessorAlternativeGroup
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.kicool.ProcessorSystem
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import de.cau.cs.kieler.kicool.compilation.observer.CompilationFinished
import de.cau.cs.kieler.kicool.compilation.observer.CompilationStart
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorError
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorFinished
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorStart
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingIntegration
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Observable
import java.util.Observer
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors

import static de.cau.cs.kieler.kicool.environments.Environment.*

import static extension de.cau.cs.kieler.kicool.compilation.internal.EnvironmentPropertyHolder.*
import static extension de.cau.cs.kieler.kicool.compilation.internal.UniqueNameCachePopulation.populateNameCache
import static extension de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingIntegration.addTracingProperty
import static extension de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingIntegration.isTracingActive

/**
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class CompilationContext extends Observable implements IKiCoolCloneable {
    
    // Minimal requirements for compilation
    @Accessors de.cau.cs.kieler.kicool.System system
    @Accessors(PUBLIC_GETTER) Object originalModel
    @Accessors Map<ProcessorReference, Processor<?,?>> processorMap
    @Accessors List<Processor<?,?>> processorInstancesSequence 
    @Accessors Map<ProcessorSystem, CompilationContext> subContexts
    @Accessors CompilationContext parentContext = null
    @Accessors Environment startEnvironment
    @Accessors Environment result
    
    new() {
        processorMap = new HashMap<ProcessorReference, Processor<?,?>>()
        processorInstancesSequence = new ArrayList<Processor<?,?>>()
        subContexts = new HashMap<ProcessorSystem, CompilationContext>()
        
        startEnvironment = new Environment
        startEnvironment.setProperty(COMPILATION_CONTEXT, this)
        startEnvironment.setProperty(INPLACE, false)        
        startEnvironment.setProperty(ONGOING_WORKING_COPY, false)
        startEnvironment.setProperty(ORIGINAL_MODEL, null)
        startEnvironment.setProperty(UNIQUE_NAME_CACHE_ENABLED, true)
        
        result = null
    }
    
    def getProcessorInstances() {
        processorMap.values.toList
    }
    
    def Processor<?,?> getProcessorInstance(ProcessorReference processorReference) {
        processorMap.get(processorReference)
    }
    
    def Processor<?,?> getFirstProcessorInstance() {
        processorInstancesSequence.head
    }
    
    def setOriginalModel(Object originalModel) {
        this.originalModel = originalModel
        startEnvironment.setProperty(ORIGINAL_MODEL, originalModel)
    }
    
    public def notify(Object arg) {
        setChanged
        notifyObservers(arg)
    }
    
    def void compileAsynchronously() {
        Compile.asyncronousCompilation(this)
    }
    
    def Environment compile() {
        startEnvironment.addTracingProperty
        
        val modelCopy = TracingIntegration.copy((originalModel as EObject), startEnvironment)
        startEnvironment.setProperty(MODEL, modelCopy)
        
        if (startEnvironment.getProperty(UNIQUE_NAME_CACHE_ENABLED) == true) {
            originalModel.populateNameCache(startEnvironment.getProperty(UNIQUE_NAME_CACHE))
        }
        
        for(intermediateProcessor : getIntermediateProcessors) {
            intermediateProcessor.setEnvironment(startEnvironment, startEnvironment)
            if (intermediateProcessor.validateInputType) {
                if (intermediateProcessor instanceof Metric<?,?>) {
                    intermediateProcessor.setMetricSourceEntity
                    intermediateProcessor.process
                }
            }
        }
        
        result = startEnvironment.compile
        result        
    }
    
    // Protected is important. Should not be accessible from the outside.
    protected def Environment compile(Environment environment) {
        val processorEntry = system.processors
        
        notify(new CompilationStart(this))
        val EPrime = processorEntry.compileEntry(environment)
        notify(new CompilationFinished(this, EPrime))

        result = EPrime              
        EPrime  
    }
    
    
    protected dispatch def Environment compileEntry(ProcessorReference processorReference, Environment environment) {
        val processorInstance = processorMap.get(processorReference)
        environment.setProperty(PROCESSOR_REFERENCE, processorReference)
        environment.setProperty(PROCESSOR_INSTANCE, processorInstance)
        if (processorInstance == null) {
            System.err.println("An instance for processor reference " + processorReference + " was not found!")
            return environment;    
        }
        
        val environmentPrime = environment.preparePrimeEnvironment
        
        processorInstance.setEnvironment(environment, environmentPrime)
        
        environment.processEnvironmentSetter(processorReference.presets)
        
        notify(new ProcessorStart(this, processorReference, processorInstance))
        
        for(intermediateProcessor : getIntermediateProcessors(processorReference)) {
            intermediateProcessor.setEnvironment(environment, environmentPrime)
            if (intermediateProcessor.validateInputType) intermediateProcessor.processBefore
        }
        
        val startTimestamp = System.nanoTime
        environmentPrime.setProperty(START_TIMESTAMP, startTimestamp)
        try {
            if (processorInstance.sourceEnvironment.getProperty(ENABLED)) { 
                processorInstance.process
            }
        } catch (Exception e) {
            processorInstance.environment.errors.add(e)
            notify(new ProcessorError(e.message, this, processorReference, processorInstance))
            System.err.println("Error in processor " + processorReference)
            e.printStackTrace
        }
        val stopTimestamp = System.nanoTime
        environmentPrime.setProperty(STOP_TIMESTAMP, stopTimestamp)
        environmentPrime.setProperty(PTIME, (stopTimestamp - startTimestamp) / 1000_000)
        
        for(intermediateProcessor : getIntermediateProcessors(processorReference)) {
            intermediateProcessor.setEnvironment(environmentPrime, environmentPrime)
            if (intermediateProcessor.validateInputType) intermediateProcessor.process
        }
        
        val overallTimestamp = System.nanoTime
        environmentPrime.setProperty(OVERALL_TIMESTAMP, overallTimestamp)
        environmentPrime.setProperty(OVERALL_PTIME, (overallTimestamp - startTimestamp) / 1000_000)
        
        environmentPrime.processEnvironmentSetter(processorReference.postsets)
        
        notify(new ProcessorFinished(this, processorReference, processorInstance))
        
        environmentPrime
    }
    
    protected dispatch def Environment compileEntry(ProcessorGroup processorGroup, Environment environment) {
        var Environment environmentPrime = environment
        var cancel = false
        for(processor : processorGroup.processors) {
             if (!cancel) {
                 environmentPrime = processor.compileEntry(environmentPrime)
                 cancel = environmentPrime.getProperty(CANCEL_COMPILATION)
             }
        }
        environmentPrime
    }

    protected dispatch def Environment compileEntry(ProcessorAlternativeGroup processorAlternativeGroup, Environment environment) {
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
    
    protected dispatch def Environment compileEntry(ProcessorSystem processorSystem, Environment environment) {
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
    
    @Inject TracingIntegration tracingIntegrationInstance
    
    protected def List<IntermediateProcessor<?,?>> getIntermediateProcessors() {
        val processors = system.intermediates.map[ processorMap.get(it) as IntermediateProcessor<?,?> ]
        
        if (startEnvironment.isTracingActive) {
            return <IntermediateProcessor<?,?>> newLinkedList => [
                    addAll(processors) 
                    add(tracingIntegrationInstance)
                ]
        }
        
        processors
    }
    
    protected def List<IntermediateProcessor<?,?>> getIntermediateProcessors(ProcessorReference processorReference) {
        if (processorReference.metric != null) {
            return (system.intermediates.filter[ !(processorMap.get(it) instanceof Metric<?,?>) ].toList => [
                it += processorReference.metric
            ]).map[ processorMap.get(it) as IntermediateProcessor<?,?> ]    
        } 
        return getIntermediateProcessors        
    }
        
}