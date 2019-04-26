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
package de.cau.cs.kieler.simulation.ide.language.server

import com.google.gson.JsonObject
import com.google.inject.Inject
import de.cau.cs.kieler.kicool.KiCoolFactory
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.ide.language.server.KiCoolLanguageServerExtension
import de.cau.cs.kieler.simulation.DataPool
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.events.SimulationListener
import de.cau.cs.kieler.simulation.mode.DynamicTickMode
import de.cau.cs.kieler.simulation.mode.ManualMode
import de.cau.cs.kieler.simulation.mode.PeriodicMode
import java.util.HashSet
import java.util.List
import org.apache.log4j.Logger
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.ide.server.ILanguageServerAccess
import org.eclipse.xtext.ide.server.ILanguageServerExtension
import org.eclipse.xtext.ide.server.concurrent.RequestManager

import static de.cau.cs.kieler.simulation.ide.SimulationIDE.*
import static de.cau.cs.kieler.simulation.ide.language.server.ClientInputs.*
import java.util.HashMap
import java.util.ArrayList

/**
 * LS extension to simulate models. Supports starting, stepping, and stopping or simulations.
 * Play and pause are not supported, since a play requires to send data from the server to the client without an request.
 * 
 * @author sdo
 *
 */
class SimulationLanguageServerExtension implements ILanguageServerExtension, CommandExtension, SimulationListener {

    protected static val LOG = Logger.getLogger(SimulationLanguageServerExtension)
    protected extension ILanguageServerAccess languageServerAccess
    
    @Inject @Accessors(PUBLIC_GETTER) RequestManager requestManager
    
    /**
     * Compiler LS extension to access the compilation snapshots, namely the simulation executable.
     */
    @Inject extension KiCoolLanguageServerExtension
    
    /**
     * Data pool that will be send to the client in start of step function.
     */
    var DataPool nextDataPool
    
    /**
     * Counts the steps of a simulation. -1 for no simulation running.
     */
    var int stepNumber = -1
    
    override initialize(ILanguageServerAccess access) {
        this.languageServerAccess = access
    }
    
    override synchronized start(String uri, String simulationType) {
        stepNumber = 0
        stopAndRemoveSimulation
        registerObserver(this)
        // hacky way to find out if a simulation exists (TODO fix this)
        if (lastCommand === null || !lastCommand.contains("simulation")) {
            return this.requestManager.runRead[ cancelIndicator |
                new SimulationStartedMessage(false, "No previous simulation")
            ]
        }
        // Get simulation context and dataPool
        val List<Object> resultArray = objectMap.get(lastUri)
        val sim = resultArray.last()
        var DataPool datapool
        if (sim instanceof SimulationContext) {
            startSimulation(sim as SimulationContext)
            // Add user value processor
            val root = currentSimulation.system.processors as ProcessorGroup
            root.processors.add(0, KiCoolFactory.eINSTANCE.createProcessorReference => [
                id = UserValues.ID
            ])
            canRestartSimulation = true
            // Set simulation mode, default mode is manual mode
            setSimulationType(simulationType)
            // Start a new start which starts the simulation to be able to wait for the updates
            new Thread([currentSimulation.start(true)]).start
            // Wait for the update function to write the initial data pool
            wait()
            datapool = this.nextDataPool
        } else {
            return this.requestManager.runRead[ cancelIndicator |
                new SimulationStartedMessage(false, "No previous simulation")
            ]
        }
        val finalPool = datapool
        // Get properties categories additional to input and output (e.g. guard, ...)
        var properties = datapool.entries.entrySet.map[value.combinedProperties].flatten.filter[!"input".equals(it.toLowerCase) && !"output".equals(it.toLowerCase)].toSet
        val propertyFilter = <String, Boolean>newHashMap
        for (property : properties) {
            val key = property.toLowerCase
            if (!propertyFilter.containsKey(key)) {
                propertyFilter.put(property, true)
            }
        }
        // Add all properties with their respective elements
        val HashMap<String, ArrayList<String>> propertySet  = newHashMap
        propertyFilter.forEach[key, value|
            propertySet.put(key, newArrayList)
        ]
        propertySet.forEach[key, list|
            val infos = finalPool.entries
            for (entry : finalPool.entries.entrySet) {
                val combinedProperties = infos.get(entry.key)?.combinedProperties
                if (combinedProperties !== null && combinedProperties.contains(key)) {
                    list.add(entry.key)
                }
            }
            propertySet.put(key, list)
        ]
        // Return the whole data pool, the inputs, the outputs, and properties with their respective elements
        val message = new SimulationStartedMessage(true, "", datapool.pool, datapool.input, datapool.output, propertySet)
        return this.requestManager.runRead[ cancelIndicator |
            message
        ]
    }
    
    override synchronized step(JsonObject valuesForNextStep, String simulationType) {
        // Set the values used by the UserValues processor de.cau.cs.kieler.simulation.ide.language.server.uservalues
        ClientInputs.values = valuesForNextStep
        stepNumber++
        // Set simulation mode, default mode is manual mode
        setSimulationType(simulationType)
        // Execute an asynchronous simulation step
        new Thread([currentSimulation.step()]).start
        // Wait for the update function to write to the next data pool
        wait()
        val result = this.requestManager.runRead[
            new SimulationStepMessage(true, "", this.nextDataPool.pool)
        ]
        return result
    }
    
    override stop() {
        // Stop the running simulation and remove listeners
        stopAndRemoveSimulation
        stepNumber = -1
        return this.requestManager.runRead[cancelIndicator |
            new SimulationStoppedMessage(true, "Stopped simulation")
        ]
    }
    
    override synchronized update(SimulationContext ctx, SimulationEvent e) {
        if (e instanceof SimulationControlEvent) {
            if (stepNumber >= 0) {
                this.nextDataPool = ctx.dataPool
                notify()
            }
        }
    }
    
    override getName() {
        return this.class.simpleName
    }
    
    def setSimulationType(String simulationType) {        
        // Set simulation mode, default mode is manual mode
        switch(simulationType) {
            case "Manual" :
                currentSimulation.mode = ManualMode
            case "Periodic" :
                currentSimulation.mode = PeriodicMode
            case "Dynamic" :
                currentSimulation.mode = DynamicTickMode
            default : currentSimulation.mode = ManualMode
        }
    }
    
}
