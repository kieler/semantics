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
package de.cau.cs.kieler.simulation.mode

import com.google.inject.Guice

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SimulationModes {
    
    public static val MANUAL = ManualMode
    public static val PERIODIC = PeriodicMode
    public static val DYNAMIC = DynamicTickMode  
      
    private static val MODES = <Class<? extends SimulationMode>>newHashSet(MANUAL, PERIODIC, DYNAMIC)
    
    static def allModes() {
        return MODES.unmodifiableView
    }
    
    static def allModesMap() {
        val injector = Guice.createInjector
        return MODES.toMap[(injector.getInstance(it) as SimulationMode).name]
    }
    
    static def registerMode(Class<? extends SimulationMode> mode) {
        // TODO Maybe support extension point in the future
        MODES += mode
    }    
    
    // Util only
    private new(){}
}