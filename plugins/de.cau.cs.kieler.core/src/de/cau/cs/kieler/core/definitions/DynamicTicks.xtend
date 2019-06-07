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
package de.cau.cs.kieler.core.definitions

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class DynamicTicks {
    // Util only
    private new(){}
    
    public static val IProperty<Boolean> DYNAMIC_TICK_COMPILATION = 
        new Property<Boolean>("de.cau.cs.kieler.core.dynamic.ticks", false)
    
    public static val TAG = "dynamic-ticks"
    public static val SLEEP_T = "sleepT"
    public static val DELTA_T = "deltaT"
    public static val TYPE = "float"
    
    // Current time format: seconds in float
    
    def static long sleepTtoMilliseconds(Number number) {
        return (number.doubleValue * 1000) as long
    }
    
    def static float millisecondsToDeltaT(long milli) {
        return ((milli as double) / 1000) as float
    }
    
}
