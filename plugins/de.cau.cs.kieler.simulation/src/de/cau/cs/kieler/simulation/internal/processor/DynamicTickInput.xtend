/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.internal.processor

import com.google.gson.JsonPrimitive
import de.cau.cs.kieler.core.definitions.DynamicTicks
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class DynamicTickInput extends TraceProcessor {
    
    public static val IProperty<Long> DELTA_T = 
        new Property<Long>("de.cau.cs.kieler.simulation.internal.dynamic.ticks.deltat", 0L)
        
    public static val IProperty<Boolean> MSEC = 
        new Property<Boolean>("de.cau.cs.kieler.simulation.internal.dynamic.ticks.deltat.msec", false)
                
    public static val ID = "de.cau.cs.kieler.simulation.internal.dynamic.ticks.input"
    
    override getId() {
        ID
    }
    
    override getName() {
        "Dynamic Tick Input"
    }
    
    override process() {
        val deltaT = environment.getProperty(DELTA_T)
        val converted = environment.getProperty(MSEC) ? deltaT: DynamicTicks.millisecondsToDeltaT(deltaT)
        dataPool.setValue(DynamicTicks.DELTA_T, new JsonPrimitive(converted))
    }
    
}