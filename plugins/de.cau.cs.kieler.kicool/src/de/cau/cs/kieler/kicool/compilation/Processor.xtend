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

/**
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
abstract class Processor {
    
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
    
    abstract public def String getID()
    
    abstract public def String getName()
    
    abstract public def ProcessorType getType()
    
    abstract public def void process()
    
}