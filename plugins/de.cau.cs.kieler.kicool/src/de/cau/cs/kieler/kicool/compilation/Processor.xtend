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

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import com.google.common.reflect.TypeToken
import de.cau.cs.kieler.annotations.NamedObject
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import de.cau.cs.kieler.kicool.classes.SourceTargetPair
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorProgress
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorSnapshot
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.environments.EnvironmentPair
import org.eclipse.emf.ecore.EObject

import static de.cau.cs.kieler.kicool.environments.Environment.*
import static extension de.cau.cs.kieler.kicool.compilation.internal.EnvironmentPropertyHolder.*

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kicool.registration.KiCoolRegistration
import org.eclipse.emf.ecore.util.EcoreUtil.Copier
import de.cau.cs.kieler.kicool.environments.AnnotationModel
import de.cau.cs.kieler.kicool.environments.Snapshot

/**
 * The abstract class of a processor. Every invokable unit in kico is a processor.
 * 
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
abstract class Processor<Source, Target> implements IKiCoolCloneable {
    
    /** A processor has two environments. */
    protected var EnvironmentPair environments
    
    new() {
    }
    
    new(Environment environment, Environment environmentPrime) {
       setEnvironment(environment, environmentPrime)
    }
    
    /** 
     * Set the environments after construction. 
     * However, preserve the enabled flag.
     */
    def setEnvironment(Environment environment, Environment environmentPrime) {
        if (environments !== null && environments.source !== null) {
            val enabledFlag = environments.source.getProperty(ENABLED)
            environment.setProperty(ENABLED, enabledFlag)
        }
        if (environments !== null && environments.target !== null) {
            val cancelCompilationFlag = environments.target.getProperty(CANCEL_COMPILATION)
            environmentPrime.setProperty(CANCEL_COMPILATION, cancelCompilationFlag)
        }
        this.environments = new EnvironmentPair(environment, environmentPrime)
    }
    
    /**
     * Return the prime environment.
     */
    def Environment getEnvironment() {
        return environments?.target
    }
    
    /**
     * Return the source environment.
     */
    def Environment getSourceEnvironment() {
        return environments?.source
    }
    
    /**
     * A processor is immutable.
     */
    override boolean isMutable() {
        false
    }
    
    /**
     * Since it is immutable, we can just return the object.
     */
    override IKiCoolCloneable cloneObject() {
        this
    }
    
    /** 
     * Directly return the compilation context of this processor.
     */
    def getCompilationContext() {
        environments.source.getProperty(COMPILATION_CONTEXT)
    }
    
    /**
     * Directly return the meta processor of this processor instance.
     */
    def getProcessorReference() {
        environments.source.getProperty(PROCESSOR_REFERENCE)
    }
    
    /**
     * Convenient getter to fetch properties from the environment.
     */
    def <T> T getProperty(IProperty<T> property) {
        environment.getProperty(property)
    }
    
    /**
     * Convenient setter to change properties in the environment.
     */
    def <T> void setProperty(IProperty<? super T> property, T value) {
        environment.setProperty(property, value)
    }
    
    /**
     * Protected convenient method to trigger an update notification.
     */
    protected def void updateProgress(double progress) {
        // Set the actual pTime before triggering the notification.
        val startTimestamp = environments.target.getProperty(START_TIMESTAMP).longValue
        val intermediateTimestamp = System.nanoTime
        environments.target.setProperty(PTIME, (intermediateTimestamp - startTimestamp) / 1000_000)
        
        // Create the notification.
        compilationContext.notify(
            new ProcessorProgress(progress, compilationContext, processorReference, this)
        )
    }
    
    protected def Processor<?,?> createCoProcessor(String id) {
        val p = KiCoolRegistration.getProcessorInstance(id)
        if (p !== null) {
            p.setEnvironment(environment, environment)
        } 
        p
    }
    
    protected def Processor<?,?> createCoProcessor(Class<Processor<?,?>> clazz) {
        val p = KiCoolRegistration.getInstance(clazz) as Processor<?,?>
        if (p !== null) {
            p.setEnvironment(environment, environment)
        } 
        p
    }
    
    protected def boolean executeCoProcessor(Processor<?,?> processorInstance, boolean doSnapshot, boolean isPostProcessor) {
        if (processorInstance === null) return false
        if (doSnapshot && isPostProcessor) snapshot
        processorInstance.process
        if (doSnapshot && !isPostProcessor) snapshot
        return true
    }
    
    protected def boolean executeCoProcessor(Processor<?,?> processorInstance, boolean doSnapshot) {
        executeCoProcessor(processorInstance, doSnapshot, false)
    }
    
    /**
     * Protected convenient method to trigger a snapshot.
     */
    protected  def <T> T snapshot(T model) {
        val snapshotsEnabled = environment.getProperty(SNAPSHOTS_ENABLED) 
        val inplace = environment.getProperty(INPLACE)
        if (inplace || !snapshotsEnabled) return model;
        
        val snapshots = environment.getProperty(SNAPSHOTS)
        
        // Do a copy of the given model.
        var Object snapshotModel = model
        var Copier copier = null 
        if (model instanceof EObject) {
            val snapshotModelPair = (model as EObject).copyEObjectAndReturnCopier
            snapshotModel = snapshotModelPair.key
            copier = snapshotModelPair.value
        }

        // Store the copy in the snapshot object and create a notification.      
        val snapshot = new Snapshot
        snapshot.object = snapshotModel
        if (copier !== null) snapshot.processEnvironmentSnapshot(environment, copier)
        snapshots += snapshot
        compilationContext.notify(
            new ProcessorSnapshot(snapshotModel, compilationContext, processorReference, this)
        )
        
        return model
    }
    
    /**
     * Protected convenient method to trigger a snapshot of the actual model.
     */
    protected def void snapshot() {
        targetModel?.snapshot
    }
    
    def Source getModel() {
        if (type == ProcessorType.EXOGENOUS_TRANSFORMATOR) {
            return sourceModel
        } else {
            return environment.getProperty(MODEL) as Source
        }
    }
    
    def Source getSourceModel() {
       environment.getProperty(SOURCE_MODEL) as Source
    }
    
    def Target getTargetModel() {
       environment.getProperty(MODEL) as Target
    }
    
    def Target setModel(Target model) {
        environment.setProperty(MODEL, model)
        model
    }    
    
    def boolean validateInputType() {
        val model = environment.getProperty(MODEL)
        return sourceTargetTypes.source.isInstance(model)
    }
    
    def SourceTargetPair<Class<?>, Class<?>> getSourceTargetTypes() {
        val source = new TypeToken<Source>(this.class) {}
        val target = new TypeToken<Target>(this.class) {}
        return new SourceTargetPair<Class<?>, Class<?>>(source.rawType, target.rawType)
    }    
    
    /**  
     *  Convenient method to cancel the ongoing compilation. 
     */
    synchronized def cancelCompilation() {
        environment.setProperty(CANCEL_COMPILATION, true)
    }    
    
    /**
     * Convenient getter for unique names.
     */
    def <T extends NamedObject> T uniqueName(T namedObject) {
        val nameCache = environment.getProperty(UNIQUE_NAME_CACHE)
        namedObject.name = nameCache.getNewUniqueName(namedObject.name)
        return namedObject
    }  
    
    /**
     * Convenient eObject copy method that also returns the copier.
     * This method does not support tracing and should not be used in the model chain.
     * Let the environment handle m2m mappings.
     */
    static def <T extends EObject> Pair<T, Copier> copyEObjectAndReturnCopier(T model) {
        val copier = new Copier()
        val EObject result = copier.copy(model)
        copier.copyReferences
        return new Pair(result as T, copier)
    }     
    
    /** 
     * Creates an annotation model to conveniently create annotations and add them to the environment
     * information.
     */
    def <T extends EObject> AnnotationModel<T> createAnnotationModel(T model) {
        val c = model.copyEObjectAndReturnCopier
        return new AnnotationModel(c.key, c.value, this)
    }
    
    /** 
     * Convenient toString method for debugging purposes.
     */
    override toString() {
        val name = getName
        if (name !== null) {
            return "Processor@" + hashCode + ": " + name
        } else {
            return "Processor@" + hashCode
        }
    }
    
    
    /**
     * ID of the processor.
     */
    abstract def String getId()
    
    /**
     * Give a processor a name. A processor needs a name.
     */
    abstract def String getName()
    
    /**
     * Type of the processor.
     */
    abstract def ProcessorType getType()
    
    /** 
     * The process method. It is called whenever the processor is invoked.
     */
    abstract def void process()
    
}