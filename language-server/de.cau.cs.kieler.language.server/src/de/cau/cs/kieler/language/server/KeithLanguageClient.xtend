/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019-2024 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server

import com.google.gson.JsonObject
import de.cau.cs.kieler.klighd.lsp.KGraphLanguageClient
import de.cau.cs.kieler.language.server.kicool.data.DidCompileParam
import de.cau.cs.kieler.language.server.kicool.data.SendCompilationSystemsParam
import org.eclipse.lsp4j.jsonrpc.services.JsonNotification
import org.eclipse.lsp4j.jsonrpc.services.JsonSegment
import org.eclipse.lsp4j.services.LanguageClient

/**
 * LanguageClient that implements additional methods necessary for server client communication in KEITH.
 * Notifications are preferred, since they allow more asynchronity and the server should not depend on the client to answer him.
 * 
 * @author sdo
 *
 */
 @JsonSegment("keith")
interface KeithLanguageClient extends KGraphLanguageClient, LanguageClient {
    /**
     * The result object should have the type de.cau.cs.kieler.language.server.kicool.CompilationResults
     */
    @JsonNotification("kicool/didCompile")
    def void didCompile(DidCompileParam param);
    
    @JsonNotification("kicool/cancel-compilation")
    def void cancelCompilation(boolean success);
    
    /**
     * Both objects should be List<de.cau.cs.kieler.language.server.kicool.SystemDescription>
     */
    @JsonNotification("kicool/compilation-systems")
    def void sendCompilationSystems(SendCompilationSystemsParam param)
    
    /**
     * Send to client if not the client itself invoked the simulation step.
     * The send object should be of type {@code de.cau.cs.kieler.simulation.ide.language.server.SimulationStepMessage}
     */
    @JsonNotification("simulation/didStep")
    def void sendSimulationStepData(Object stepMessage)
    
    /**
     * Send to client if not the client itself some input value is changed by the an external source.
     * This done for the Kviz view.
     */
    @JsonNotification("simulation/valuesForNextStep")
    def void sendExternalSimulationUserData(JsonObject values)
    
    /**
     * Something stopped the simulation. Report this to the client.
     * TODO actually use this
     */
    @JsonNotification("simulation/externalStop")
    def void sendExternalStopSimulation()
    
    /**
     * Send to client if a simulation was started. Argument should be {@code SimulationStartedMessage}.
     */
    @JsonNotification("simulation/started")
    def void startedSimulation(Object message)
    
    /**
     * Send to client if verification properties were requested.
     * The send object should be {@code VerificationPropertiesMessage}.
     */
    @JsonNotification("verification/properties")
    def void sendVerificationProperties(Object props)   
        
    /**
     * Send to client if verification properties are updated due to running the model checker.
     */
    @JsonNotification("verification/update-property-status")
    def void sendPropertyStatus(Object id, Object status, Object counterexampleUri)
}
