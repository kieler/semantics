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
package de.cau.cs.kieler.simulation.ui.internal.processor

import de.cau.cs.kieler.simulation.internal.processor.SimulationProcessor
import de.cau.cs.kieler.simulation.ui.view.pool.DataPoolView
import java.util.HashMap

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class UserValues extends SimulationProcessor {
    
    public static val ID = "de.cau.cs.kieler.simulation.ui.internal.uservalues"
    
    override getId() {
        ID
    }
    
    override getName() {
        "User Values"
    }
    
    override process() {
        val view = DataPoolView.instance
        if (view !== null) {
            val values = new HashMap(view.userValues)
            view.userValues.clear
            dataPool.setValues(values)
        }
    }
    
}
