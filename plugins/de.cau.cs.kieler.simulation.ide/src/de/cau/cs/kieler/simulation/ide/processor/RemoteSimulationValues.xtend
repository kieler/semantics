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
package de.cau.cs.kieler.simulation.ide.processor

import com.google.gson.JsonElement
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.simulation.internal.processor.SimulationProcessor
import java.util.Map
import de.cau.cs.kieler.simulation.ide.server.SimulationServer

/**
 * @author als
 */
class RemoteSimulationValues extends SimulationProcessor {
    
    public static val IProperty<Map<String, JsonElement>> VALUES = 
        new Property<Map<String, JsonElement>>("de.cau.cs.kieler.simulation.ide.remoteValues", null)
    
    public static val ID = "de.cau.cs.kieler.simulation.ide.remoteValues"
    
    override getId() {
        ID
    }
    
    override getName() {
        "Remote Simulation Values"
    }
    
    override process() {
        val patch = environment.getProperty(VALUES)
        if (patch !== null && SimulationServer.running) {
            synchronized (patch) {
                dataPool.setValues(patch)
                patch.clear
            }
        }
    }
    
}
