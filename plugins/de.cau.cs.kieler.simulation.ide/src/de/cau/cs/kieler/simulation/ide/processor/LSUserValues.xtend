/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.ide.processor

import de.cau.cs.kieler.simulation.internal.processor.SimulationProcessor

/**
 * User values processor to be used in a LS setup. Allows to set user values by the client.
 * 
 * @author sdo
 */
class LSUserValues extends SimulationProcessor {
    
    public static val ID = "de.cau.cs.kieler.simulation.ide.language.server.uservalues"
    
    override getId() {
        ID
    }
    
    override getName() {
        "User Values for LS"
    }
    
    override process() {
        val values = ClientInputs.values
        if (values !== null) {
            ClientInputs.values = null
            values.entrySet.forEach[entry|
                dataPool.setValue(entry.key, entry.value)
            ]
        }
    }
    
}
