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
import static extension de.cau.cs.kieler.kicool.compilation.Environment.*
import de.cau.cs.kieler.kicool.compilation.internal.Snapshots
import de.cau.cs.kieler.kicool.compilation.observer.ProcessorSnapshot
import static extension org.eclipse.xtext.EcoreUtil2.*
import org.eclipse.emf.ecore.EObject

/**
 * The abstract class of a processor. Every invokable unit in kico is a processor.
 * 
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
abstract class Processor implements IKiCoolCloneable {
    
    /** A processor has two environments. */
    protected var Pair<Environment, Environment> environments
    
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
        if (environments != null && environments.key != null) {
            val enabledFlag = environments.key.enabled
            environment.setEnabled(enabledFlag)
        }
        this.environments = new Pair<Environment, Environment>(environment, environmentPrime)
    }
    
    /**
     * Return the prime environment.
     */
    public def Environment getEnvironment() {
        return environments.value
    }
    
    /**
     * Return the source environment.
     */
    public def Environment getSourceEnvironment() {
        return environments.key
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
        environments.key.getCompilationContext
    }
    
    /**
     * Directly return the meta processor of this processor instance.
     */
    protected def getMetaProcessor() {
        environments.key.data.get(Environment.META_PROCESSOR) as de.cau.cs.kieler.kicool.Processor
    }
    
    /**
     * Protected convenient method to trigger an update notifiaction.
     */
    protected def void updateProgress(double progress) {
        // Set the actual pTime before triggering the notification.
        val startTimestamp = (environments.value.getData(START_TIMESTAMP, 0.0d) as Long).longValue
        val intermediateTimestamp = java.lang.System.nanoTime
        environments.value.setData(PTIME, (intermediateTimestamp - startTimestamp) / 1000_000)
        
        // Create the notification.
        compilationContext.notify(
            new ProcessorProgress(progress, compilationContext, metaProcessor, this)
        )
    }
    
    /**
     * Protected convenient method to trigger a snapshot.
     */
    protected def void snapshot(Object model) {
        // Retrieve snapshots object.
        val snapshots = environment.getData(Environment.SNAPSHOTS, null) as Snapshots
        
        // Do a copy of the given model.
        var Object snapshotModel = model 
        if (model instanceof EObject) {
            snapshotModel = model.copy
        }

        // Store the copy in the snapshot object and create a notification.         
        snapshots += snapshotModel
        compilationContext.notify(
            new ProcessorSnapshot(snapshotModel, compilationContext, metaProcessor, this)
        )
    }
    
    /**
     * Protected convenient method to trigger a snapshot of the actual model.
     */
    protected def void snapshot() {
        environment.model.snapshot
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