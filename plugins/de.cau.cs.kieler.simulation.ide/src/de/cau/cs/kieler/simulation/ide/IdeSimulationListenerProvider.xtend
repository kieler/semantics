/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.ide

import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.events.ISimulationListener

/**
 * @author als
 */
class IdeSimulationListenerProvider implements ISimulationListenerProvider {
    
    static val RESET_LISTENER = new ISimulationListener() {

        override getName() {
            "Reset on stop"
        }
    
        override canBeDisabled() {
            return false
        }
        
        override update(SimulationContext context, SimulationEvent e) {
            if (e instanceof SimulationControlEvent) {
                switch (e.operation) {
                    case STOP: {
                        context.reset
                    }
                    default: { // nothing
                    }
                }
            }
        }
    }
    
    /**
     * Provide static simulation listeners.
     */
    override getListeners() {
        return newArrayList(RESET_LISTENER)
    }
}