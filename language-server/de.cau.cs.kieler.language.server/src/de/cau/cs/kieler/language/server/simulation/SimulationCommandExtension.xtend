/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019,2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server.simulation

import com.google.gson.JsonObject
import de.cau.cs.kieler.language.server.simulation.data.LoadedTraceMessage
import de.cau.cs.kieler.language.server.simulation.data.SavedTraceMessage
import de.cau.cs.kieler.language.server.simulation.data.SimulationStoppedMessage
import java.util.concurrent.CompletableFuture
import org.eclipse.lsp4j.jsonrpc.services.JsonNotification
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest
import org.eclipse.lsp4j.jsonrpc.services.JsonSegment

/**
 * Interface to the LSP extension commands
 * 
 * @author sdo
 *
 */
@JsonSegment('keith/simulation')
interface SimulationCommandExtension {
    
    /**
     * Simulates a model given by uri. It is assumed that the model was compiled via a simulation CS before.
     * The client should take care that this happened.
     */
    @JsonNotification('start')
    def void start(String uri, String simulationType);
    
    /**
     * Performs a step.
     */
    @JsonNotification('step')
    def void step(JsonObject valuesForNextStep, String simulationType)
    
    /**
     * Stops a running simulation.
     */
    @JsonRequest('stop')
    def CompletableFuture<SimulationStoppedMessage> stop()
    
    
    @JsonNotification('addCoSimulation')
    def void addCoSimulation(String clientId, String file);
    
    /**
     * Loads the trace from the file uri given in this message.
     */
    @JsonRequest('loadTrace')
    def CompletableFuture<LoadedTraceMessage> loadTrace(String fileUri);
    
    /**
     * Saves the trace in the current simulation and notifies the client if the trace generated from the current
     * simulation context is saved successfully.
     */
    @JsonRequest('saveTrace')
    def CompletableFuture<SavedTraceMessage> saveTrace(String fileUri);
    
    @JsonNotification('startVisualizationServer')
    def void startVisualizationServer();
}
