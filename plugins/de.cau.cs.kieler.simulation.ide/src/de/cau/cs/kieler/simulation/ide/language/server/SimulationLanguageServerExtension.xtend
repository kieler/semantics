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
import com.google.inject.Injector
import de.cau.cs.kieler.kicool.KiCoolFactory
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kicool.ide.language.server.KiCoolLanguageServerExtension
import de.cau.cs.kieler.simulation.DataPool
import de.cau.cs.kieler.simulation.SimulationContext
import java.util.List
import org.apache.log4j.Logger
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.ide.server.ILanguageServerAccess
import org.eclipse.xtext.ide.server.ILanguageServerExtension
import org.eclipse.xtext.ide.server.concurrent.RequestManager

import static de.cau.cs.kieler.simulation.ide.SimulationIDE.*
import de.cau.cs.kieler.simulation.mode.ManualMode

/**
 * @author sdo
 *
 */
class SimulationLanguageServerExtension implements ILanguageServerExtension, CommandExtension {

    protected static val LOG = Logger.getLogger(SimulationLanguageServerExtension)
    protected extension ILanguageServerAccess languageServerAccess
    
    @Inject @Accessors(PUBLIC_GETTER) RequestManager requestManager
    
    @Inject extension KiCoolLanguageServerExtension
    
    @Inject
    Injector injector
    
    package var JsonObject userValues
    
    override initialize(ILanguageServerAccess access) {
        this.languageServerAccess = access
    }
    
    override start(String uri, String simulationType) {
        // hacky way to find out if a simulation exists (TODO fix this)
        if (lastCommand === null || !lastCommand.contains("simulation")) {
            return this.requestManager.runRead[ cancelIndicator |
                new SimulationStartedMessage(false, "No previous simulation", null, null)
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
            currentSimulation.mode = ManualMode
            currentSimulation.start(true)
            datapool = currentSimulation.dataPool
        } else {
            return this.requestManager.runRead[ cancelIndicator |
                new SimulationStartedMessage(false, "No previous simulation", null, null)
            ]
        }
        val message = new SimulationStartedMessage(true, "", datapool.pool, datapool.input)
        return this.requestManager.runRead[ cancelIndicator |
            message
        ]
    }
    
    override step(JsonObject valuesForNextStep, String simulationType) {
        // TODO this does only set the inputs for the next tick, not the current one
        ClientInputs.values = valuesForNextStep
        currentSimulation.step()
        val datapool = currentSimulation.dataPool
        val result = this.requestManager.runRead[
            new SimulationStepMessage(true, "", datapool.pool)
        ]
        return result
    }
    
    override stop() {
        stopAndRemoveSimulation
        return this.requestManager.runRead[cancelIndicator |
            new SimulationStoppedMessage(true, "Killed process")
        ]
    }
    
}
