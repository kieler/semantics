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
package de.cau.cs.kieler.sccharts.test.c.simulation

import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.TestModelData
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import de.cau.cs.kieler.simulation.backends.CSimulationBackend

/**
 * Runs the test cases that must fail and throws an error in case they don't.
 * 
 * @author aas
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class SimulationMustFailTest extends SimulationTestBase {
    
    /**
     * {@inheritDoc}
     */
    override filter(TestModelData modelData) {
        return !modelData.tracePaths.empty
        && modelData.tracePaths.exists[fileName.toString.endsWith("eso") || fileName.toString.endsWith("ktrace")]
        && modelData.modelProperties.contains("sccharts")
        && modelData.modelProperties.contains("must-fail")
        && !modelData.modelProperties.contains("causality-problem")
    }
    
    @Test
    def void testSimulation(SCCharts scc, TestModelData modelData) {
        val context = createSimulationContext
        context.simulationBackend = new CSimulationBackend() {
            override getBuildConfigOrigin() {
                return "platform:/plugin/de.cau.cs.kieler.sccharts.test/resources/sccharts-netlist-c.kibuild"
            }        
        }
        
        var failed = false
        try {
            compileModelAndStartSimulationTest(context, scc, modelData)
        } catch (AssertionError e) {
            // The test failed and it must-fail.
            // This means everything is peachy.
            failed = true
        }
        
        if(!failed) {
            // The test did not fail, but must fail.
            // Thus we throw a new error
            fail("A test that must fail did succeed. Other test results may be invalid!\n"
               + modelData.modelPath)
        }
    }
}
