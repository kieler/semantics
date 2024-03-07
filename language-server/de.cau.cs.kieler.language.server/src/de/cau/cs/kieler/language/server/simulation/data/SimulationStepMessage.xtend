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
package de.cau.cs.kieler.language.server.simulation.data

import com.google.gson.JsonObject
import org.eclipse.xtend.lib.annotations.Data

/**
 * Message to be send to the client after a step.
 * Includes new values and error string as well as success boolean.
 * 
 * @author sdo
 */
@Data class SimulationStepMessage {
    
    boolean successful
    String error
    JsonObject values
}
