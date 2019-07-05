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
import java.util.ArrayList
import java.util.HashMap
import org.eclipse.xtend.lib.annotations.Data

/**
 * @author sdo
 *
 */
@Data class SimulationStartedMessage {
    
    
    boolean successful
    String error
    JsonObject dataPool
    HashMap<String, ArrayList<String>> propertySet
    
    new(boolean successful, String error) {
        this.successful = successful
        this.error = error
        this.dataPool = null
        this.propertySet = null
    }
    
    new(boolean successful, String error, JsonObject dataPool, HashMap<String, ArrayList<String>> propertySet) {
        this.successful = successful
        this.error = error
        this.dataPool = dataPool
        this.propertySet = propertySet
    }
}
