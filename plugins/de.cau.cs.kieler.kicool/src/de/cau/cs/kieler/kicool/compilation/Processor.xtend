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
    
    
    protected def void update(double progress) {
        val compilationContext = environments.key.getCompilationContext
        val metaProcessor = environments.key.data.get(Environment.META_PROCESSOR) as de.cau.cs.kieler.kicool.Processor
        
        compilationContext.notify(
            new ProcessorProgress(progress, compilationContext, metaProcessor, this)
        )
    }
    
    abstract public def String getId()
    
    abstract public def String getName()
    
    abstract public def ProcessorType getType()
    
    abstract public def void process()
    
}