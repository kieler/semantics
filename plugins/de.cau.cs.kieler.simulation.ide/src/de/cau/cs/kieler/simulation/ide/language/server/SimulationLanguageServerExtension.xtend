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
import com.google.inject.Singleton
import de.cau.cs.kieler.kicool.KiCoolFactory
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.compilation.observer.AbstractContextNotification
import de.cau.cs.kieler.kicool.compilation.observer.CompilationFinished
import de.cau.cs.kieler.kicool.ide.language.server.KiCoolLanguageServerExtension
import de.cau.cs.kieler.language.server.ILanguageClientProvider
import de.cau.cs.kieler.language.server.KeithLanguageClient
import de.cau.cs.kieler.simulation.DataPool
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.ISimulationListener
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.ide.CentralSimulation
import de.cau.cs.kieler.simulation.ide.server.SimulationServer
import de.cau.cs.kieler.simulation.mode.DynamicTickMode
import de.cau.cs.kieler.simulation.mode.ManualMode
import de.cau.cs.kieler.simulation.mode.PeriodicMode
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Observable
import org.apache.log4j.Logger
import org.eclipse.lsp4j.services.LanguageClient
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.ide.server.ILanguageServerAccess
import org.eclipse.xtext.ide.server.ILanguageServerExtension
import org.eclipse.xtext.ide.server.concurrent.RequestManager

import static de.cau.cs.kieler.simulation.ide.CentralSimulation.*
import static de.cau.cs.kieler.simulation.ide.language.server.ClientInputs.*

/**
 * LS extension to simulate models. Supports starting, stepping, and stopping or simulations.
 * Play and pause are not supported, since a play requires to send data from the server to the client without an request.
 * Play and pause is realized on the client side via stepping.
 * 
 * @author sdo
 * 
 */
@Singleton
class SimulationLanguageServerExtension implements ILanguageServerExtension, CommandExtension, ISimulationListener, ILanguageClientProvider {

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

    /**
     * Used to send notification (or request) to the client.
     */
    public KeithLanguageClient client

    /**
     * Uri of compiled model which should be directly simulated afterwards.
     */
    var currentUri = ""
    /**
     * Simulation type with which the new simulation of an compiled model should be started.
     */
    var currentSimulationType = ""

    override initialize(ILanguageServerAccess access) {
        this.languageServerAccess = access
    }

    new() {
        // Register the class itself as simulation listener on creation.
        addListener(this)
    }

    /**
     * Uri of model which is currently being simulated.
     */
    @Accessors(PUBLIC_GETTER)
    var String currentlySimulatedModel

    /**
     * Called on client notification and starts a simulation for specified uri and simulation type.
     * @param uri uri of model
     * @param simulationType should be one of Manual, Periodic, and Dynamic
     */
    override start(String uri, String simulationType) {
        val message = startSimulation(uri, simulationType)
        // If message is not empty an error occurred. Answer the via the corresponding notification.
        // Otherwise the corresponding simulation event is caught and the client is notified about the correct start.
        if (message !== "") { 
            startedSimulation(new SimulationStartedMessage(false, message))
        }
    }

    /**
     * Sends {@code SimulationStartedMessage} to the client.
     */
    def startedSimulation(SimulationStartedMessage message) {
        client.startedSimulation(message)
    }

    /**
     * Starts the simulation thread. This will terminate all previous simulations.
     * @param uri uri of model
     * @param simulationType should be one of Manual, Periodic, and Dynamic
     * @return empty string if successful, error message otherwise.
     */
    def String startSimulation(String uri, String simulationType) {
        stepNumber = 0
        currentlySimulatedModel = uri
        // hacky way to find out if a simulation exists (TODO fix this)
        if (lastCommand === null || !lastCommand.contains("simulation")) {
            return "Last compilation command was no simulation command"
        }
        // Get simulation context and dataPool
        val List<Object> resultArray = objectMap.get(lastUri)
        val sim = resultArray.last()
        var DataPool datapool
        if (sim instanceof SimulationContext) {
            prepareSimulation(sim as SimulationContext)
            SimulationServer.start
            // Add user value processor
            val root = currentSimulation.system.processors as ProcessorGroup
            root.processors.add(0, KiCoolFactory.eINSTANCE.createProcessorReference => [
                id = UserValues.ID
            ])
            canRestartSimulation = true
            // Set simulation mode, default mode is manual mode
            setSimulationType(simulationType)
            // Start a new start which starts the simulation to be able to wait for the updates
            // TODO add try catch block
            currentSimulation.start(true)
            return ""
        } else {
            return "No simulation context could be found for this uri"
        }
    }

    /**
     * Called on client notification if a simulation step should be executed.
     * This method has to be synchronized, since no two steps shall be executed at the same time.
     * 
     * @param valuesForNextStep input values set by client
     * @param simulationType should be one of Manual, Periodic, and Dynamic
     */
    override synchronized step(JsonObject valuesForNextStep, String simulationType) {
        // Set the values used by the UserValues processor de.cau.cs.kieler.simulation.ide.language.server.uservalues
        ClientInputs.values = valuesForNextStep
        stepNumber++
        // Set simulation mode, default mode is manual mode
        setSimulationType(simulationType)
        // Execute an asynchronous simulation step
        new Thread([currentSimulation.step()]).start
    }

    /**
     * Called on client request to stop the simulation.
     * Answers with true if this was successful.
     */
    override stop() {
        // Stop the running simulation and remove listeners
        stopAndRemoveSimulation
        SimulationServer.stop()
        stepNumber = -1
        currentlySimulatedModel = null
        return this.requestManager.runRead [ cancelIndicator |
            new SimulationStoppedMessage(true, "Stopped simulation")
        ]
    }

    /**
     * Handle compilation events.
     * @param o observable compilation of simulation context
     * @param e AbstractContextNotification for compilation listener or SimulationControlEvent for simulation listener
     */
    override synchronized update(Observable o, Object e) {
        if (e instanceof AbstractContextNotification) { // Handle compilation events
            switch e {
                // Case a snapshot was compiled, for simulation, since currentUri and currentSimulationtype are set.
                CompilationFinished: {
                    if (currentUri !== "" && currentSimulationType !== "") {
                        val message = startSimulation(currentUri, currentSimulationType)
                        if (message !== "") {
                            startedSimulation(new SimulationStartedMessage(false, message))
                        }
                        currentUri = ""
                        currentSimulationType = ""
                        removeObserOnCompilation(this)
                    }
                }
            }
        } else if (e instanceof SimulationControlEvent && o instanceof SimulationContext) { // Handle simulation events
            if (stepNumber >= 0) {
                this.doChangeDatapool((o as SimulationContext).dataPool)
            }
            switch ((e as SimulationControlEvent).operation) {
                case STEP: { // Send step data if a step occurred.
                    try {
                        this.client.sendSimulationStepData(
                            new SimulationStepMessage(true, "", CentralSimulation.currentSimulation.dataPool.pool)
                        )
                    } catch (Exception exp) {
                        exp.printStackTrace
                        // TODO send notification that LS has to be restarted
                    } 
                }
                case START: { // Start the simulation. Send corresponding message to client.
                    var datapool = this.nextDataPool

                    val finalPool = datapool
                    // Get properties categories additional to input and output (e.g. guard, ...)
                    var properties = datapool.entries.entrySet.map[value.combinedProperties].flatten.toSet
                    val propertyFilter = <String, Boolean>newHashMap
                    for (property : properties) {
                        val key = property.toLowerCase
                        if (!propertyFilter.containsKey(key)) {
                            propertyFilter.put(property, true)
                        }
                    }
                    // Add all properties with their respective elements
                    val HashMap<String, ArrayList<String>> propertySet = newHashMap
                    propertyFilter.forEach [ key, value |
                        propertySet.put(key, newArrayList)
                    ]
                    propertySet.forEach [ key, list |
                        val infos = finalPool.entries
                        for (entry : finalPool.entries.entrySet) {
                            val combinedProperties = infos.get(entry.key)?.combinedProperties
                            if (combinedProperties !== null && combinedProperties.contains(key)) {
                                list.add(entry.key)
                            }
                        }
                        propertySet.put(key, list)
                    ]
                    // Return the whole data pool, and properties with their respective elements (this includes inputs and outputs)
                    startedSimulation(new SimulationStartedMessage(true, "", datapool.pool, propertySet))
                }
            }
        } else { // Handle unknown events, log the classes for which this is executed.
            println(e.class + ", " + o.class)
        }
    }

    /**
     * Set new data pool and notify observers about it.
     */
    def synchronized doChangeDatapool(DataPool datapool) {
        this.nextDataPool = datapool
        notify()
    }

    /**
     * Called on client notification to simulate a snapshot.
     * Such a snapshot has to be compiled first. Starting of the simulation is done by the registered listener.
     * TODO uri and command might be obsolete, since this should be saved in the diagramLSExt
     * @param uri rui of model
     * @param clientId id of diagram server
     * @param command compilation system id
     * @param simulationType should be one of Manual, Periodic, and Dynamic
     */
    override simulateCurrentlyOpenedModel(String uri, String clientId, String command, String simulationType) {
        // Registers itself as compilation listener to continue after compilation is finished.
        registerObserverOnCompilation(this)
        // Save data to be used by simulation.
        this.currentSimulationType = simulationType
        this.currentUri = uri
        // Start compilation process.
        compile(uri, clientId, command, true, false)
    }

    override getName() {
        return this.class.simpleName
    }

    /**
     * Set simulation type according to string send by the client
     * @param simulationType should be one of Manual, Periodic, and Dynamic
     */
    def setSimulationType(String simulationType) {
        // Set simulation mode, default mode is manual mode
        switch (simulationType) {
            case "Manual":
                currentSimulation.mode = ManualMode
            case "Periodic":
                currentSimulation.mode = PeriodicMode
            case "Dynamic":
                currentSimulation.mode = DynamicTickMode
            default:
                currentSimulation.mode = ManualMode
        }
    }

    override setLanguageClient(LanguageClient client) {
        this.client = client as KeithLanguageClient
    }

    override getLanguageClient() {
        return this.client
    }

    /**
     * Is overridden by by Observer interface, should be called.
     */
    override update(SimulationContext ctx, SimulationEvent e) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }

}
