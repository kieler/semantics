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
import java.util.Observer
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorError
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable

import static extension de.cau.cs.kieler.kicool.environments.Environment.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.kicool.ProcessorSystem
import java.util.List
import java.util.ArrayList
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.kitt.tracing.Tracing
import de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingIntegration

import static extension de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingIntegration.isTracingActive
import static extension de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingIntegration.addTracingProperty
import com.google.inject.Inject
import de.cau.cs.kieler.kicool.compilation.internal.EnvironmentPropertyHolder

/**
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class CompilationContext extends Observable implements IKiCoolCloneable {
    
    // Minimal requirements for compilation
    @Accessors System system
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
        
        result = null
    }
    
    def getProcessorInstances() {
        processorMap.values.toList
    }
    
    def de.cau.cs.kieler.kicool.compilation.Processor<?,?> getProcessorInstance(ProcessorReference processorReference) {
        processorMap.get(processorReference)
    }
    
    def de.cau.cs.kieler.kicool.compilation.Processor<?,?> getFirstProcessorInstance() {
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
        
        if (startEnvironment.getProperty(ONGOING_WORKING_COPY) && originalModel instanceof EObject) {
            val modelCopy = EnvironmentPropertyHolder.tracingCopy((originalModel as EObject), startEnvironment)
            
            startEnvironment.setProperty(MODEL, modelCopy)
        } else {
            startEnvironment.setProperty(MODEL, originalModel)
        }
        
        for(intermediateProcessor : getIntermediateProcessors) {
            intermediateProcessor.setEnvironment(startEnvironment, startEnvironment)
            if (intermediateProcessor.validateType) {
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
            java.lang.System.err.println("An instance for processor reference " + processorReference + " was not found!")
            return environment;    
        }
        
        environment.setProperty(INPLACE_VALID, processorInstance.validateInplaceType)
        val environmentPrime = environment.preparePrimeEnvironment
        environmentPrime.setProperty(SOURCE_MODEL, environmentPrime.getProperty(MODEL))
        
        processorInstance.setEnvironment(environment, environmentPrime)
        
        environment.processEnvironmentSetter(processorReference.presets)
        
        notify(new ProcessorStart(this, processorReference, processorInstance))
        
        for(intermediateProcessor : getIntermediateProcessors(processorReference)) {
            intermediateProcessor.setEnvironment(environment, environmentPrime)
            if (intermediateProcessor.validateType) intermediateProcessor.processBefore
        }
        
        val startTimestamp = java.lang.System.nanoTime
        environmentPrime.setProperty(START_TIMESTAMP, startTimestamp)
        try {
            if (processorInstance.sourceEnvironment.getProperty(ENABLED)) { 
                processorInstance.process
            }
        } catch (Exception e) {
            processorInstance.environment.errors.add(e)
            notify(new ProcessorError(e.message, this, processorReference, processorInstance))
            java.lang.System.err.println("Error in processor " + processorReference)
            e.printStackTrace
        }
        val stopTimestamp = java.lang.System.nanoTime
        environmentPrime.setProperty(STOP_TIMESTAMP, stopTimestamp)
        environmentPrime.setProperty(PTIME, (stopTimestamp - startTimestamp) / 1000_000)
        
        for(intermediateProcessor : getIntermediateProcessors(processorReference)) {
            intermediateProcessor.setEnvironment(environmentPrime, environmentPrime)
            if (intermediateProcessor.validateType) intermediateProcessor.process
        }
        
        val overallTimestamp = java.lang.System.nanoTime
        environmentPrime.setProperty(OVERALL_TIMESTAMP, overallTimestamp)
        environmentPrime.setProperty(OVERALL_PTIME, (overallTimestamp - startTimestamp) / 1000_000)
        
        environmentPrime.processEnvironmentSetter(processorReference.postsets)
        
        notify(new ProcessorFinished(this, processorReference, processorInstance))
        
        environmentPrime
    }
    
    protected dispatch def Environment compileEntry(de.cau.cs.kieler.kicool.ProcessorGroup processorGroup, Environment environment) {
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