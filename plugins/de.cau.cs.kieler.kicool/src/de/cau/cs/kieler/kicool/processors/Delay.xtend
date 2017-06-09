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
package de.cau.cs.kieler.kicool.processors

import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType

/**
 * @author ssm
 * @kieler.design 2017-05-18 proposed
 * @kieler.rating 2017-05-18 proposed yellow  
 */
class Delay extends Processor {
    
    static val MINIMUM_DELAY = "minimumDelay"
    static val MAXIMUM_DELAY = "maximumDelay"
    static int DEFAULT_MINIMUM_DELAY = 500
    static int DEFAULT_MAXIMUM_DELAY = DEFAULT_MINIMUM_DELAY * 4
    static int INTERVAL_LENGTH = 100
    
    override getId() {
        "de.cau.cs.kieler.kicool.processors.delay"
    }
    
    override getName() {
        "Delay"
    }
    
    override getType() {
        ProcessorType.DEVELOPER
    }
    
    override process() {
        val minimumDelay = environment.getData(MINIMUM_DELAY, new Integer(DEFAULT_MINIMUM_DELAY)) as Integer
        val maximumDelay = environment.getData(MAXIMUM_DELAY, new Integer(DEFAULT_MAXIMUM_DELAY)) as Integer
        val delay = (Math.random * (maximumDelay.intValue - minimumDelay.intValue)) as int + minimumDelay.intValue
        println("Delaying... " + delay)
        System.out.flush
        val totalSteps = (delay / INTERVAL_LENGTH) as double
        var steps = 0
        while(steps < totalSteps) {
            Thread.sleep(INTERVAL_LENGTH)
            steps++    
            updateProgress(steps / totalSteps)
        }                    
        Thread.sleep(delay % INTERVAL_LENGTH)
    }
    
}