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
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property

/**
 * Example processor: Delay
 * 
 * @author ssm
 * @kieler.design 2017-05-18 proposed
 * @kieler.rating 2017-05-18 proposed yellow  
 */
class Delay extends Processor<Object, Object> {

    public static val IProperty<Integer> MINIMUM_DELAY = 
        new Property<Integer>("de.cau.cs.kieler.kicool.processors.delay.minimumDelay", 500)

    public static val IProperty<Integer> MAXIMUM_DELAY = 
        new Property<Integer>("de.cau.cs.kieler.kicool.processors.delay.maximumDelay", 
            MINIMUM_DELAY.^default * 4)

    public static val IProperty<Integer> INTERVAL_LENGTH = 
        new Property<Integer>("de.cau.cs.kieler.kicool.processors.delay.intervalLength", 100)
    
    
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
        val minimumDelay = environment.getProperty(MINIMUM_DELAY)
        val maximumDelay = environment.getProperty(MAXIMUM_DELAY)
        val delay = (Math.random * (maximumDelay.intValue - minimumDelay.intValue)) as int + minimumDelay.intValue
        println("Delaying... " + delay)
        System.out.flush
        val totalSteps = (delay / environment.getProperty(INTERVAL_LENGTH)) as double
        var steps = 0
        while(steps < totalSteps) {
            Thread.sleep(environment.getProperty(INTERVAL_LENGTH).intValue)
            steps++    
            updateProgress(steps / totalSteps)
        }                    
        Thread.sleep(delay % environment.getProperty(INTERVAL_LENGTH))
    }
    
}
