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

import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import com.google.gson.JsonPrimitive
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationControlEvent.SimulationOperation
import de.cau.cs.kieler.simulation.ide.CentralSimulation
import de.cau.cs.kieler.simulation.ide.processor.RemoteSimulationValues
import java.util.Map
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.xtend.lib.annotations.Accessors

import static de.cau.cs.kieler.simulation.SimulationCommunicationAPI.*

/**
 * @author als
 */
class SimulationCommunication {
    
    @Accessors
    static val clients = <SimulationSocket>newArrayList
    static val serializer = new Gson
    
    static def broadcastControlEvent(SimulationControlEvent event, SimulationContext context) {
        val op = event.operation
        val msgObj = new JsonObject
        
        msgObj.addProperty(EVENT_KEY, switch(op) {
            case SimulationOperation.START: EVENT_START_KEY
            case SimulationOperation.STOP: EVENT_STOP_KEY
            case SimulationOperation.PAUSE: EVENT_PAUSE_KEY
            case SimulationOperation.STEP: EVENT_STEP_KEY
            default: "unknown"
        })
        if (op == SimulationOperation.START || op == SimulationOperation.RESET || op == SimulationOperation.STEP) {
            msgObj.add(POOL_KEY, context.dataPool.rawData)
        }
        if (op == SimulationOperation.STEP) {
            msgObj.add(TICK_KEY, new JsonPrimitive(context.stepNumber))
        }
        
        val msg = serializer.toJson(msgObj)
        for (client : clients) {
            client.remote.sendString(msg)
        }
    }
    
    static def handleMessage(String msg) {
        try {
            val sim = CentralSimulation.currentSimulation
            if (sim !== null) {
                val msgElem = JsonParser.parseString(msg)
                if (msgElem !== null && msgElem.isJsonObject) {
                    val msgObj = msgElem.asJsonObject
                    if (msgObj.has(ACTION_KEY)) {
                        val action = msgObj.get(ACTION_KEY).asString
                        val pool = msgObj.get(POOL_KEY)?.asJsonObject
                        if (pool !== null && (ACTION_SET_KEY.equals(action) || ACTION_PATCH_KEY.equals(action))) {
                            val values = sim.startEnvironment.getProperty(RemoteSimulationValues.VALUES)
                            if (values !== null) {
                                val tick = msgObj.get(TICK_KEY)
                                if (tick !== null && tick.asInt !== sim.stepNumber) return // Abort when ticks differ
                                val Map<String, JsonElement> newValues = if (ACTION_PATCH_KEY.equals(action)) {
                                    val patch = sim.dataPool.createPatch(pool)
                                    patch.entrySet.removeIf[values.containsKey(it.key)] // Dont reset unprocessed action indicators
                                    patch
                                } else {
                                    pool.entrySet.toMap([key],[value])
                                }
                                synchronized (values) {
                                    values.putAll(newValues)
                                }
                            }
                        } else {
                            new Job("Simulation Remote Action") {
                                
                                override protected run(IProgressMonitor monitor) {
                                    switch (action) {
                                        case ACTION_STEP_KEY: sim.step
                                        case ACTION_PLAY_KEY: sim.play
                                        case ACTION_PAUSE_KEY: sim.pause
                                        case ACTION_STOP_KEY: sim.stop
                                    }
                                    return Status.OK_STATUS
                                }
                                
                            }.schedule
                        }
                    }
                } else {
                    println("Failed to decode simulation message. Illegal format in: " + msg)
                }
            }
        } catch(Exception e) {
            println("Failed to decode simulation message: " + msg)
            e.printStackTrace
        }
    }
    
}