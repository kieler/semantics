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

import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.environments.EnvironmentPair
import de.cau.cs.kieler.kicool.environments.Environment

/**
 * An intermediate processor is a specialized processor. 
 * It can be tasked with various tasks. 
 * However, an intermediate processor does not use its own environment. 
 * It uses the one from its predecessor. 
 * 
 * @author ssm
 * @kieler.design 2017-02-19 proposed
 * @kieler.rating 2017-02-19 proposed yellow  
 */
abstract class IntermediateProcessor<Source, Target> extends Processor<Source, Target> {
    
    /**
     * Override to environment setter to be able to set the processor environments
     * regardless of any pre or post processing.
     */
    override setEnvironment(Environment environment, Environment environmentPrime) {
        this.environments = new EnvironmentPair(environment, environmentPrime)
    }    
    
    /** 
     * The process method. It is called whenever the processor is invoked.
     */    
    public def void processBefore() {}    
    
}