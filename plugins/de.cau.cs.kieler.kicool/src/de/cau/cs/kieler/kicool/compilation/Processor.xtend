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
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
abstract class Processor implements IKiCoolCloneable {
    
    protected var Pair<Environment, Environment> environments
    
    new() {
    }
    
    new(Environment environment, Environment environmentPrime) {
       setEnvironment(environment, environmentPrime)
    }
    
    public def setEnvironment(Environment environment, Environment environmentPrime) {
        this.environments = new Pair<Environment, Environment>(environment, environmentPrime)
    }
    
    public def Environment getEnvironment() {
        return environments.value
    }
    
    override boolean isMutable() {
        false
    }
    
    override Object cloneObject() {
        this
    }
    
    protected def getCompilationContext() {
        environments.key.getCompilationContext
    }
    
    protected def getMetaProcessor() {
        environments.key.data.get(Environment.META_PROCESSOR) as de.cau.cs.kieler.kicool.Processor
    }
    
    protected def void updateProgress(double progress) {
        val startTimestamp = (environments.value.getData(START_TIMESTAMP, 0.0d) as Long).longValue
        val intermediateTimestamp = java.lang.System.nanoTime
        environments.value.setData(PTIME, (intermediateTimestamp - startTimestamp) / 1000_000)
        
        compilationContext.notify(
            new ProcessorProgress(progress, compilationContext, metaProcessor, this)
        )
    }
    
    protected def void snapshot(Object model) {
        val snapshots = environment.getData(Environment.SNAPSHOTS, null) as Snapshots
        
        var Object snapshotModel = model 
        if (model instanceof EObject) {
            snapshotModel = model.copy
        }
        
        snapshots += snapshotModel
        compilationContext.notify(
            new ProcessorSnapshot(snapshotModel, compilationContext, metaProcessor, this)
        )
    }
    
    protected def void snapshot() {
        environment.model.snapshot
    }
    
    abstract public def String getId()
    
    abstract public def String getName()
    
    abstract public def ProcessorType getType()
    
    abstract public def void process()
    
}