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
package de.cau.cs.kieler.simulation.events

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtend.lib.annotations.ToString

/**
 * An event about the handling of the simulation
 * 
 * @author aas
 *
 */
@FinalFieldsConstructor
@ToString
class SimulationControlEvent extends SimulationEvent {
    
    /**
     * The operations to control the simulation.
     * 
     * @author aas
     *
     */
    enum SimulationOperation {
        START,
        STOP,
        RESET,
        
        MODE,
        
        PLAY,
        PAUSE,
        STEP
    }
    
    /**
     * The operation that was executed when controling the simulation.
     */
    public val SimulationOperation operation

}
