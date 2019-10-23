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
import de.cau.cs.kieler.simulation.ide.processor.RemoteSimulationValues
import de.cau.cs.kieler.kicool.KiCoolFactory
import com.google.gson.JsonElement
import de.cau.cs.kieler.kicool.ProcessorGroup

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
            if (SimulationServer.running) {
                if (e instanceof SimulationControlEvent) {
                    SimulationCommunication.broadcastControlEvent(e, context)
                }
            }
        }
        
    }
    
    /**
     * Provide static simulation listeners.
     */
    override getListeners() {
        return newArrayList(EVENT_FORWARDING)
    }
    
    /**
     * Add remote value processor
     */
    override prepareNewSimulation(SimulationContext ctx) {
        val root = ctx.system.processors as ProcessorGroup
        if (!root.processors.exists[RemoteSimulationValues.ID.equals(id)]) {
            root.processors.add(0, KiCoolFactory.eINSTANCE.createProcessorReference => [
                id = RemoteSimulationValues.ID
            ])
        }
        ctx.startEnvironment.setProperty(RemoteSimulationValues.VALUES, <String, JsonElement>newHashMap);
    }
    
}