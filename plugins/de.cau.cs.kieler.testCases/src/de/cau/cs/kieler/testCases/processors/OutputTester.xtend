/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2023 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.testCases.processors

import de.cau.cs.kieler.simulation.DataPool
import de.cau.cs.kieler.simulation.internal.processor.SimulationProcessor

/**
 * @author jep
 *
 */
class OutputTester extends SimulationProcessor {
    
    public static val ID = "de.cau.cs.kieler.testCases.processors.outputTester"
    
    override getId() {
        ID
    }

    override getName() {
        "OutputTester"
    }

    override process() {
//        val context = simulationContext
        setModel(model.transform)
    }

    def DataPool transform(DataPool data) {
        return data
    }
    
}