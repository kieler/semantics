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

import com.google.inject.Inject
import com.google.inject.Injector
import java.util.ArrayList
import org.apache.log4j.Logger
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.ide.server.ILanguageServerAccess
import org.eclipse.xtext.ide.server.ILanguageServerExtension
import org.eclipse.xtext.ide.server.concurrent.RequestManager
import de.cau.cs.kieler.kicool.ide.language.server.KiCoolLanguageServerExtension

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
    
    override initialize(ILanguageServerAccess access) {
        this.languageServerAccess = access
    }
    
    override start(String uri, String simulationType) {
        // TODO find interface you are dealing with
        // TODO start simulation and answer with initial values according to the type of the variables.
        println("LastCommand" + lastCommand)
        if (!lastCommand.contains("simulation")) {
            return this.requestManager.runRead[ cancelIndicator |
                new SimulationStartedMessage(false, "No previous simulation", newArrayList)
            ]
        }
        val map = new ArrayList
        map.add(new SimulationStartedData("x", false, true, false))
        map.add(new SimulationStartedData("y", 0, false, false))
        map.add(new SimulationStartedData("z", #[0,0,0,0], false, true))
        map.add(new SimulationStartedData("z2", #[0], true, true))
        val message = new SimulationStartedMessage(true, "", map)
        return this.requestManager.runRead[ cancelIndicator |
            message
        ]
    }
    
    override step(SimulationData[] valuesForNextStep, String simulationType) {
        val map = new ArrayList
        valuesForNextStep.forEach[value|
            var SimulationData newValue
            if (value.value instanceof Double) { // JS numbers are always doubles
                newValue = new SimulationData(value.symbol, value.value as Double + 1)
            } else {
                newValue = value
            }
            map.add(newValue) // input or output does not matter anymore
        ]
        val result = this.requestManager.runRead[
            new SimulationStepMessage(true, "", map)
        ]
        return result
    }
    
    override stop() {
        return this.requestManager.runRead[cancelIndicator |
            new SimulationStoppedMessage(true, "Killed process")
        ]
    }
    
}
