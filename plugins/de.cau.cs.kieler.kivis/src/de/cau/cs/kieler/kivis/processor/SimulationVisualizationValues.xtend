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
package de.cau.cs.kieler.kivis.processor

import de.cau.cs.kieler.kivis.KiVisConstants
import de.cau.cs.kieler.simulation.internal.processor.SimulationProcessor

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SimulationVisualizationValues extends SimulationProcessor {
    
    public static val ID = "de.cau.cs.kieler.kivis.internal.values"
    
    override getId() {
        ID
    }
    
    override getName() {
        "Visualization Values"
    }
    
    override process() {
        val patch = environment.getProperty(KiVisConstants.VISUALIZATION_INPUTS)
        if (patch !== null) {
            synchronized (patch) {
                dataPool.setValues(patch)
                patch.clear
            }
        }
    }
    
}
