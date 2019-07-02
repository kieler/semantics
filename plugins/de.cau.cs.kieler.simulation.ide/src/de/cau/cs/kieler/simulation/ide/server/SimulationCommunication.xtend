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
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import org.eclipse.xtend.lib.annotations.Accessors
import com.google.gson.JsonObject
import de.cau.cs.kieler.simulation.events.SimulationControlEvent.SimulationOperation
import com.google.gson.Gson
import com.google.gson.JsonParser

/**
 * @author als
 */
class SimulationCommunication {
    
    @Accessors
    static val clients = <SimulationSocket>newArrayList
    static val serializer = new Gson
    static val parser = new JsonParser
    
    
    static def broadcastControlEvent(SimulationControlEvent event, SimulationContext context) {
        val op = event.operation
        val msgObj = new JsonObject
        
        msgObj.addProperty("event", op.toString)
        if (op == SimulationOperation.START || op == SimulationOperation.RESET || op == SimulationOperation.STEP) {
            msgObj.add("pool", context.dataPool.rawData)
        }
        
        val msg = serializer.toJson(msgObj)
        for (client : clients) {
            client.remote.sendString(msg)
        }
    }
    
    static def handleMessage(String msg) {
        try {
            val msgObj = parser.parse(msg)
            if (msgObj !== null && msgObj.isJsonObject) {
                // TODO
            } else {
                println("Failed to decode simulation message. Illegal format in: " + msg)
            }
        } catch(Exception e) {
            println("Failed to decode simulation message: " + msg)
            e.printStackTrace
        }
    }
    
}