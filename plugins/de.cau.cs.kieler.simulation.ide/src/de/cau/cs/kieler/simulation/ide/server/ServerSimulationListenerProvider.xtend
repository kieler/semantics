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
package de.cau.cs.kieler.simulation.ide.server

import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.ISimulationListener
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.ide.ISimulationListenerProvider

/**
 * @author als
 */
class ServerSimulationListenerProvider implements ISimulationListenerProvider {
    
    static val EVENT_FORWARDING = new ISimulationListener() {

        override getName() {
            "Simulation Server"
        }
    
        override canBeDisabled() {
            return false
        }
        
        override update(SimulationContext context, SimulationEvent e) {
            if (e instanceof SimulationControlEvent) {
                SimulationCommunication.broadcastControlEvent(e, context)
            }
        }
        
    }
    
    /**
     * Provide static simulation listeners.
     */
    override getListeners() {
        return newArrayList(EVENT_FORWARDING)
    }
}