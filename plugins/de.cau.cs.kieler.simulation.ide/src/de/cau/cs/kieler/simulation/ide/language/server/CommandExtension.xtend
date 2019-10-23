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
import java.util.concurrent.CompletableFuture
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest
import org.eclipse.lsp4j.jsonrpc.services.JsonSegment
import org.eclipse.lsp4j.jsonrpc.services.JsonNotification

/**
 * Interface to the LSP extension commands
 * 
 * @author sdo
 *
 */
@JsonSegment('keith/simulation')
interface CommandExtension {
    
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
}
