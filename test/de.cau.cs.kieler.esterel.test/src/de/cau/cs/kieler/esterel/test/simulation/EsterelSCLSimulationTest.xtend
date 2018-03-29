/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.esterel.test.simulation

import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.simulation.core.events.SimulationListener
import de.cau.cs.kieler.test.common.repository.TestModelData
import org.junit.Test

import static org.junit.Assume.*

/**
 * @author aas
 * 
 */
class EsterelSCLSimulationTest extends EsterelSimulationTestBase implements SimulationListener {
    
    override createSimulationBackend() {
        return super.createCSimulationBackend
    }
    
    override filter(TestModelData modelData) {
        return modelData.isNetlistCompilationTests
        && modelData.isEsterelTest
        && !modelData.modelProperties.contains("simulation-fails-esterel-scl")
    }
    
    @Test//(timeout=60000)
    def void testSimulationEsterelScl(EsterelProgram est, TestModelData modelData) {
        assumeFalse(true) // Do nothing !!
        
        startSimulationTest(#["de.cau.cs.kieler.esterel.scest.scl.netlist"], est, modelData)
    }
}
