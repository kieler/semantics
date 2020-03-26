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
package de.cau.cs.kieler.kicool.compilation

import com.google.inject.Inject
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.kicool.KiCoolFactory
import de.cau.cs.kieler.kicool.ProcessorAlternativeGroup
import de.cau.cs.kieler.kicool.ProcessorEntry
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.kicool.ProcessorSystem
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import de.cau.cs.kieler.kicool.compilation.observer.AbstractContextNotification
import de.cau.cs.kieler.kicool.compilation.observer.CompilationChanged
import de.cau.cs.kieler.kicool.compilation.observer.CompilationFinished
import de.cau.cs.kieler.kicool.compilation.observer.CompilationStart
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorError
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorFinished
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorStart
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.environments.UniqueClonableNameCache
import de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingIntegration
import java.util.List
import java.util.Map
import java.util.Observable
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors

import static de.cau.cs.kieler.kicool.environments.Environment.*

import static extension com.google.common.base.Preconditions.*
import static extension de.cau.cs.kieler.kicool.compilation.internal.ContextPopulation.*
import static extension de.cau.cs.kieler.kicool.compilation.internal.EnvironmentPropertyHolder.*
import static extension de.cau.cs.kieler.kicool.compilation.internal.UniqueNameCachePopulation.populateNameCache
import static extension de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingIntegration.addTracingProperty
import static extension de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingIntegration.isTracingActive

/**
 * A compilation context is the central compilation unit. Once you prepared a context, you can
 * invoke the whole compilation process with {@code compile}. The context is an observable and 
 * you can register observers for various events such as compilation/processor start and finish
 * events. 
 * You can create contexts conveniently with the {@link Compile} class. It provides various 
 * static methods for context creation.
 * 
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
class CompilationContext extends Observable implements IKiCoolCloneable {

    /** The compilation system that will be used and worked on. */    
    @Accessors de.cau.cs.kieler.kicool.System system
    /** The original compilation system. Do not change this one! */
    @Accessors de.cau.cs.kieler.kicool.System originalSystem
    /** The mapping between original system and working copy. */
    @Accessors Map<ProcessorEntry, ProcessorEntry> systemMap
    @Accessors(PUBLIC_GETTER) Object originalModel
    /** Maps processor references in the system to processor instances. */
    @Accessors(PUBLIC_GETTER) Map<ProcessorReference, Processor<?,?>> processorMap
    /** The ordered list of all processor instances of this context */
    @Accessors(PUBLIC_GETTER) List<Processor<?,?>> processorInstancesSequence 
    /** The environment that will be prepared at startup before compilation. */
    @Accessors(PUBLIC_GETTER) Environment startEnvironment
    /** A reference to the target environment of the last processor to enable quick access. */
    @Accessors(PUBLIC_GETTER) Environment result
    /** Recording of the notifications if enabled. */
    @Accessors(PUBLIC_GETTER) List<AbstractContextNotification> notifications
    /** Stops compilation if any error occurs */
    @Accessors boolean stopOnError = false
    
    var Processor<?,?> actualProcessor = null
    
    new() {
        systemMap = <ProcessorEntry, ProcessorEntry> newHashMap
        processorMap = <ProcessorReference, Processor<?,?>> newLinkedHashMap
        processorInstancesSequence = <Processor<?,?>> newArrayList
        notifications = <AbstractContextNotification> newLinkedList
        
        // This is the default start configuration.
        startEnvironment = new Environment
        startEnvironment.setProperty(COMPILATION_CONTEXT, this)
        startEnvironment.setProperty(INPLACE, false)        
        startEnvironment.setProperty(ONGOING_WORKING_COPY, false)
        startEnvironment.setProperty(ORIGINAL_MODEL, null)
        startEnvironment.setProperty(UNIQUE_NAME_CACHE_ENABLED, true)
        startEnvironment.setProperty(UNIQUE_NAME_CACHE, new UniqueClonableNameCache)
        
        result = null
    }
    
    /** Invoke this method if you want to compile asynchronously. */
    def void compileAsynchronously() {
        Compile.asyncronousCompilation(this)
    }
    
    /** Invoke the compilation process. */
    def Environment compile() {
        startEnvironment.addTracingProperty
        
        val modelCopy = if (originalModel instanceof EObject) {
            TracingIntegration.copy(originalModel, startEnvironment)
        } else if (originalModel instanceof IKiCoolCloneable) {
            originalModel.cloneObject
        } else {
            originalModel
        }
        startEnvironment.setProperty(MODEL, modelCopy)
        
        if (startEnvironment.getProperty(UNIQUE_NAME_CACHE_ENABLED)) {
            originalModel.populateNameCache(startEnvironment.getProperty(UNIQUE_NAME_CACHE))
        }
        
        for(intermediateProcessor : getIntermediateProcessors(startEnvironment)) {
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
    
    /** Takes the first processor entry and proceeds the compilation with the given environment. */
    // Protected is important. Should not be accessible from the outside.
    protected def Environment compile(Environment environment) {
        val processorEntry = system.processors
        
        notify(new CompilationStart(this))
        
        val startTimestamp = System.nanoTime
        environment.setProperty(COMPILATION_TIME_START, startTimestamp)
        
        val EPrime = processorEntry.compileEntry(environment)
        
        val endTimestamp = System.nanoTime
        EPrime.setProperty(COMPILATION_TIME, (endTimestamp - startTimestamp))
        
        notify(new CompilationFinished(this, EPrime))

        result = EPrime
        EPrime
    }
    
    /** Prepares the environments of the given processor reference and invoke the processor's process. */
    protected dispatch def Environment compileEntry(ProcessorReference processorReference, Environment environment) {
        val processorInstance = processorMap.get(processorReference)
        environment.setProperty(PROCESSOR_REFERENCE, processorReference)
        environment.setProperty(PROCESSOR_INSTANCE, processorInstance)
        if (processorInstance === null) {
            notify(new ProcessorError("An instance for processor reference " + processorReference + " was not found!", 
                this, processorReference, null))
            System.err.println("An instance for processor reference " + processorReference + " was not found!")
            return environment
        }
        actualProcessor = processorInstance;
        
        // Set environment information that come from the outside, e.g. the system.
        environment.processEnvironmentConfig(processorReference.preconfig)
        
        val environmentPrime = environment.preparePrimeEnvironment
        
        processorInstance.setEnvironment(environment, environmentPrime)
        
        val startTimestamp = System.nanoTime
        environmentPrime.setProperty(TRANSFORMATION_TIME_START, startTimestamp)
        
        notify(new ProcessorStart(this, processorReference, processorInstance))
        
        for (intermediateProcessor : getIntermediateProcessors(processorReference, environmentPrime)) {
            intermediateProcessor.setEnvironment(environment, environmentPrime)
            if (intermediateProcessor.validateInputType) intermediateProcessor.processBefore
        }
        
        processorInstance.executeCoProcessors(processorReference.preprocesses, false)
        
        val pStartTimestamp = System.nanoTime
        try {
            if (processorInstance.sourceEnvironment.getProperty(ENABLED) && (!stopOnError || environmentPrime.errors.empty)) { 
                processorInstance.process
            }
        } catch (Exception e) {
            processorInstance.environment.errors.add(e)
            notify(new ProcessorError(e.message, this, processorReference, processorInstance))
            System.err.println("Error in processor " + processorReference)
            e.printStackTrace
        }
        val pEndTimestamp = System.nanoTime
        environmentPrime.setProperty(PROCESSOR_TIME, (pEndTimestamp - pStartTimestamp))
        
        processorInstance.executeCoProcessors(processorReference.postprocesses, true)
        
        for (intermediateProcessor : getIntermediateProcessors(processorReference, environmentPrime)) {
            intermediateProcessor.setEnvironment(environmentPrime, environmentPrime)
            if (intermediateProcessor.validateInputType) intermediateProcessor.process
        }
        
        val endTimestamp = System.nanoTime
        environmentPrime.setProperty(TRANSFORMATION_TIME, (endTimestamp - startTimestamp))
        
        // Set post data that come from the outside, e.g. the system.
        environmentPrime.processEnvironmentConfig(processorReference.postconfig)
        
        notify(new ProcessorFinished(this, processorReference, processorInstance))
        
        environmentPrime
    }
        
    /** For a processor group, call compile for each entry. You can cancel a compilation if the cancel property is set. */
    protected dispatch def Environment compileEntry(ProcessorGroup processorGroup, Environment environment) {
        var Environment environmentPrime = environment
        var cancel = false
        var idx = 0
        while (idx < processorGroup.processors.size) {
            val processor = processorGroup.processors.get(idx)
            if (!cancel) {
                environmentPrime = processor.compileEntry(environmentPrime)
                cancel = environmentPrime.getProperty(CANCEL_COMPILATION) || (stopOnError && !environmentPrime.errors.empty)
            }
            idx++
        }
        environmentPrime
    }

    /** Compile each entry of the group. However, select the next environment for the ongoing compilation depending on the metric. */
    protected dispatch def Environment compileEntry(ProcessorAlternativeGroup processorAlternativeGroup, Environment environment) {
        val environmentList = <Environment> newArrayList
        for (processor : processorAlternativeGroup.processors) {
            environmentList += processor.compileEntry(environment)
        }
        var selectedEnvironment = environmentList.last
        for (e : environmentList) {
            val selMetric = selectedEnvironment.getProperty(Metric.METRIC)
            val envMetric = e.getProperty(Metric.METRIC)
            if (envMetric < selMetric) {
                selectedEnvironment = e
            }
        }
        selectedEnvironment
    }
    
    protected dispatch def Environment compileEntry(ProcessorSystem processorSystem, Environment environment) {
        throw new IllegalArgumentException("A context should not contain ProcessorSystem entries. See SystemTransformation.")
    }
    
    def Processor<?,?> getProcessorFor(IProperty<?> property, Object object) {
        for (processor : processorInstancesSequence) {
            val p = processor.environment.getProperty(property)
            if (p == object) return processor
        }
        return null
    }
    
    def Environment getResultForModel(Object model) {
        for (processor : processorInstancesSequence) {
            val p = processor.environment.getProperty(MODEL)
            if (p == model) {
                return processor.environment
            }
            
            val snapshots = processor.environment.getProperty(SNAPSHOTS)
            for (snapshot : snapshots) {
                if (snapshot.object == model) {
                    return processor.environment
                }
            }
            
            val errors = processor.environment.getProperty(ERRORS)
            if (errors.keySet.contains(model)) {
                return processor.environment
            }
            
            val warnings = processor.environment.getProperty(WARNINGS)
            if (warnings.keySet.contains(model)) {
                return processor.environment
            }
            
            val infos = processor.environment.getProperty(INFOS)
            if (infos.keySet.contains(model)) {
                return processor.environment
            }
            
        }
        return null
    }
    
    def hasErrors() {
        return !startEnvironment.errors.empty || processorInstancesSequence.map[environment?.errors].filterNull.exists[!empty]
    }
    
    def getAllErrors() {
        val errors = newLinkedHashSet(startEnvironment.errors)
        errors.addAll(processorInstancesSequence.map[environment?.errors].filterNull)
        return errors.map[allMessages].flatten.toList
    }
    
    def hasWarings() {
        return !startEnvironment.warnings.empty || processorInstancesSequence.map[environment?.warnings].filterNull.exists[!empty]
    }

    def getAllWarnings() {
        val warnings = newLinkedHashSet(startEnvironment.warnings)
        warnings.addAll(processorInstancesSequence.map[environment?.warnings].filterNull)
        return warnings.map[allMessages].flatten.toList
    }
    
    override cloneObject() {
        this
    }
    
    override isMutable() {
        false
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
    
    def notify(Object arg) {
        setChanged
        notifyObservers(arg)
        if (startEnvironment.getProperty(Environment.DYNAMIC_PROCESSOR_SYSTEM)) {
            notifications += arg as AbstractContextNotification
        }
    }   
    
    def ProcessorEntry getOriginalProcessorEntry(ProcessorEntry processorEntry) {
        return systemMap.get(processorEntry)
    }
    
    /** 
     * Adds a single processor entry at the end of the root processor group.
     * Adding processor systems is not supported at the moment.
     */
    def void addProcessorEntry(ProcessorEntry processorEntry) {
        val processorEntryPoint = system.processors
        if (processorEntryPoint instanceof ProcessorGroup) {
            processorEntryPoint.processors += processorEntry
            processorEntry.populate(this)
            notify(new CompilationChanged(this, system, processorEntry))
        } else {
            throw new IllegalStateException("Tried to add a processor programmatically, but there was no processor group.")
        }
    }
    
    def void addProcessorEntry(String processorId) {
        processorId.checkNotNull("Illegal processor ID: null")
        val processorEntry = KiCoolFactory.eINSTANCE.createProcessorReference => [
            it.id = processorId
        ]
        processorEntry.addProcessorEntry 
    }
 
    /** 
     * Adds a list of processor entries at the given position of the root processor group.
     * Adding processor systems is not supported at the moment.
     */
    def void addProcessorEntries(Processor<?,?> position, List<ProcessorEntry> processorEntries) {
        val posProcessor = processorMap.entrySet.findFirst[value == position]?.key
        if (posProcessor === null) {
            throw new IllegalArgumentException("Given position processor does not exist.")
        }
        val processorEntryPoint = system.eAllContents.filter(ProcessorGroup).findFirst[processors.contains(posProcessor)]
        if (processorEntryPoint !== null) {
            for (newEntry : processorEntries.reverseView) {
                val idx = processorEntryPoint.processors.indexOf(posProcessor)
                if (idx == -1) {
                    throw new IllegalArgumentException("Given position processor does not exist in the processor group.")
                }
                processorEntryPoint.processors.add(idx + 1, newEntry)
                newEntry.populate(this)
                // Fix order in processor instance sequence
                val newInstance = processorMap.get(newEntry)
                processorInstancesSequence.remove(newInstance)
                processorInstancesSequence.add(processorInstancesSequence.indexOf(position) + 1, newInstance)
                notify(new CompilationChanged(this, system, newEntry))
            }
        } else {
            throw new IllegalStateException("Tried to add a processor programmatically, but there was no processor group.")
        }
    }
    
    def void addProcessorEntries(Processor<?,?> position, String... processorIds) {
        position.addProcessorEntries(processorIds.map[ id |
            (KiCoolFactory.eINSTANCE.createProcessorReference => [
                it.id = id
            ]) as ProcessorEntry
        ])
    }
    
    @Inject TracingIntegration tracingIntegrationInstance
    
    protected def List<IntermediateProcessor<?,?>> getIntermediateProcessors(Environment environment) {
        val processors = system.intermediates.map[ processorMap.get(it) as IntermediateProcessor<?,?> ]
        
        if (environment.isTracingActive) {
            return <IntermediateProcessor<?,?>> newLinkedList => [
                addAll(processors) 
                add(tracingIntegrationInstance)
            ]
        }
        
        processors
    }
    
    protected def List<IntermediateProcessor<?,?>> getIntermediateProcessors(ProcessorReference processorReference, Environment environment) {
        val intermediateProcessors = getIntermediateProcessors(environment)
        if (processorReference.metric !== null) {
            val metricProcessor = processorMap.get(processorReference.metric) as IntermediateProcessor<?,?>
            if (metricProcessor !== null) {
                intermediateProcessors.add(metricProcessor)
            }
        }
        return intermediateProcessors
    }
    
    protected def void executeCoProcessors(Processor<?, ?> processor, List<ProcessorReference> processorReferences, boolean isPostProcessor) {
        for (processorReference : processorReferences) {
            processor.environment.processEnvironmentConfig(processorReference.preconfig)
            if (!stopOnError || processor.environment.errors.empty) {
                processor.executeCoProcessor(processor.createCoProcessor(processorReference.id), !processorReference.silent, isPostProcessor)
            }
            processor.environment.processEnvironmentConfig(processorReference.postconfig)
        }
    }
    
    
    def Processor<?,?> getLastProcessorForResultType(Class<?> clazz) {
        for(p : processorInstancesSequence.reverse) {
            val result = p.environment.model
            if (clazz.isInstance(result)) return p
        }
        return null
    } 
    
    /** 
     * Convenient toString method mainly for debugging purposes.
     */
    override toString() {
        val text = new StringBuilder
        text.append("CompilationContext@")
        text.append(hashCode)
        if (actualProcessor !== null) {
            text.append(": ")
            text.append(actualProcessor.toString)
        }
        return text.toString
    }
    
    /** 
     * Convenient toString method printing the complete processor list mainly for debugging purposes.
     */
    def String toStringComplete() {
        val text = new StringBuilder
        text.append("CompilationContext@")
        text.append(hashCode)
        if (actualProcessor !== null) {
            text.append(": ")
            text.append(actualProcessor.toString)
        }
        if (!processorInstancesSequence.empty) {
            text.append("\n[")
            for (p : processorInstancesSequence.indexed) {
                if (p.key != 0) {
                    text.append(", ")
                }
                text.append(p.value.toString)
            }
            text.append("]")
        }
        return text.toString
    }
    
       
}