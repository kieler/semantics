/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2024 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server.simulation.data

import com.google.gson.JsonObject
import org.eclipse.xtend.lib.annotations.Data

/**
 * Data class to hold the parameters and results of the keith/simulation/start message.
 * 
 * @author nre
 */
@Data
class SimulationStartParam {
    
    /**
     * uri of model
     */
    String uri
    
    /**
     * should be one of Manual, Periodic, and Dynamic
     */
    String simulationType
    
}

/**
 * Data class to hold the parameters and results of the keith/simulation/step message.
 * 
 * @author nre
 */
@Data
class SimulationStepParam {
    
    /**
     * input values set by client
     */
    JsonObject valuesForNextStep
    
    /**
     * should be one of Manual, Periodic, and Dynamic
     */
    String simulationType
    
}

/**
 * Data class to hold the parameters and results of the keith/simulation/addCoSimulation message.
 * 
 * @author nre
 */
@Data
class AddCoSimulationParam {
    
    String clientId
    
    String fileUri
    
}
