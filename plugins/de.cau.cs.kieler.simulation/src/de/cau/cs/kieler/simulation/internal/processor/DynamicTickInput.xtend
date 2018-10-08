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
import de.cau.cs.kieler.core.model.DynamicTicks
import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.simulation.mode.TimedSimulationModeCountDown

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class DynamicTickInput extends TraceProcessor {
    
    public static val IProperty<Long> DELTA_T = 
        new Property<Long>("de.cau.cs.kieler.simulation.internal.dynamic.ticks.deltat", 0L)
                
    public static val ID = "de.cau.cs.kieler.simulation.internal.dynamic.ticks.input"
    
    override getId() {
        ID
    }
    
    override getName() {
        "Dynamic Tick Input"
    }
    
    override process() {
        dataPool.setValue(DynamicTicks.DELTA_T, new JsonPrimitive(DynamicTicks.millisecondsToDeltaT(environment.getProperty(DELTA_T))))
    }
    
}