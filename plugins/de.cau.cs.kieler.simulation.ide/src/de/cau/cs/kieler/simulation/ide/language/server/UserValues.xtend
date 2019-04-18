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
package de.cau.cs.kieler.simulation.ide.language.server

import de.cau.cs.kieler.simulation.internal.processor.SimulationProcessor

/**
 * @author sdo
 */
class UserValues extends SimulationProcessor {
    
    public static val ID = "de.cau.cs.kieler.simulation.ide.language.server.uservalues"
    
    override getId() {
        ID
    }
    
    override getName() {
        "User Values for LS"
    }
    
    override process() {
        val values = ClientInputs.values
        if (values === null) {
            println("Vlaues are null")
            return
        }
        ClientInputs.values = null
        values.entrySet.forEach[entry|
            dataPool.setValue(entry.key, entry.value)
        ]
    }
    
}
