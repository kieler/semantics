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

import de.cau.cs.kieler.kicool.compilation.observer.ProcessorProgress
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorSnapshot
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.kicool.environments.EnvironmentPair
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable

import static extension org.eclipse.xtext.EcoreUtil2.*
import static extension de.cau.cs.kieler.kicool.environments.Environment.*
import java.lang.reflect.ParameterizedType
import de.cau.cs.kieler.kicool.environments.Environment

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
    public def setEnvironment(Environment environment, Environment environmentPrime) {
        if (environments != null && environments.source != null) {
            val enabledFlag = environments.source.getProperty(ENABLED)
            environment.setProperty(ENABLED, enabledFlag)
        }
        if (environments != null && environments.target != null) {
            val cancelCompilationFlag = environments.target.getProperty(CANCEL_COMPILATION)
            environmentPrime.setProperty(CANCEL_COMPILATION, cancelCompilationFlag)
        }
        this.environments = new EnvironmentPair(environment, environmentPrime)
    }
    
    /**
     * Return the prime environment.
     */
    public def Environment getEnvironment() {
        return environments.target
    }
    
    /**
     * Return the source environment.
     */
    public def Environment getSourceEnvironment() {
        return environments.source
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
    override Object cloneObject() {
        this
    }
    
    /** 
     * Directly return the compilation context of this processor.
     */
    protected def getCompilationContext() {
        environments.source.getProperty(COMPILATION_CONTEXT)
    }
    
    /**
     * Directly return the meta processor of this processor instance.
     */
    protected def getProcessorReference() {
        environments.source.getProperty(PROCESSOR_REFERENCE)
    }
    
    /**
     * Protected convenient method to trigger an update notifiaction.
     */
    protected def void updateProgress(double progress) {
        // Set the actual pTime before triggering the notification.
        val startTimestamp = environments.target.getProperty(START_TIMESTAMP).longValue
        val intermediateTimestamp = java.lang.System.nanoTime
        environments.target.setProperty(PTIME, (intermediateTimestamp - startTimestamp) / 1000_000)
        
        // Create the notification.
        compilationContext.notify(
            new ProcessorProgress(progress, compilationContext, processorReference, this)
        )
    }
    
    /**
     * Protected convenient method to trigger a snapshot.
     */
    protected def void snapshot(Object model) {
        val snapshotsEnabled = environment.getProperty(SNAPSHOTS_ENABLED) 
        val inplace = environment.getProperty(INPLACE)
        if (inplace || !snapshotsEnabled) return
        
        val snapshots = environment.getProperty(SNAPSHOTS)
        
        // Do a copy of the given model.
        var Object snapshotModel = model 
        if (model instanceof EObject) {
            snapshotModel = model.copy
        }

        // Store the copy in the snapshot object and create a notification.         
        snapshots += snapshotModel
        compilationContext.notify(
            new ProcessorSnapshot(snapshotModel, compilationContext, processorReference, this)
        )
    }
    
    /**
     * Protected convenient method to trigger a snapshot of the actual model.
     */
    protected def void snapshot() {
        getModel.snapshot
    }
    
    
    def Source getModel() {
//        try {
            val model = environment.getProperty(MODEL) as Source
            return model
//        } catch (ClassCastException e) {
//            return null
//        }
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
    
    def boolean validateType() {
        val ParameterizedType pt = this.getClass.getGenericSuperclass as ParameterizedType;
        val c = pt.getActualTypeArguments.get(0) as Class<?>
        val model = environment.getProperty(MODEL)
        val castable = c.isInstance(model)
        castable
    }
    
    def boolean validateInplaceType() {
        val myC = getProcessorSubClass
        val ParameterizedType pt = myC.getGenericSuperclass as ParameterizedType;
        val c1 = pt.getActualTypeArguments.get(0)
        val c2 = pt.getActualTypeArguments.get(1)
        c1 == c2
    }
    
    private def Class<?> getProcessorSubClass() {
        var Class<?> c = this.getClass
        while(!c.superclass.name.equals("de.cau.cs.kieler.kicool.compilation.Processor")) {
            c = c.superclass
        }
        c
    }
    
    
    /**  
     *  Convenient method to cancel the ongoing compilation. 
     */
    synchronized def cancelCompilation() {
        environment.setProperty(CANCEL_COMPILATION, true)
    }        
    
    
    /**
     * ID of the processor.
     */
    abstract public def String getId()
    
    /**
     * Give a processor a name. A processor needs a name.
     */
    abstract public def String getName()
    
    /**
     * Type of the processor.
     */
    abstract public def ProcessorType getType()
    
    /** 
     * The process method. It is called whenever the processor is invoked.
     */
    abstract public def void process()
    
}