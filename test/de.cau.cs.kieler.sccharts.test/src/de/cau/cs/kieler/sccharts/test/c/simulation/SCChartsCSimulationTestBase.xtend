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

import de.cau.cs.kieler.simulation.backends.CSimulationBackend

/**
 * Compile all SCCharts to C and simulate them with their corresponding eso files.
 * 
 * @author als, aas
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
abstract class SCChartsCSimulationTestBase extends SimulationTestBase {
    
    override createSimulationBackend() {
        return new CSimulationBackend() {
            override getBuildConfigOrigin() {
                return "platform:/plugin/de.cau.cs.kieler.sccharts.test/resources/sccharts-netlist-c.kibuild"
            }
        }
    }
    
//    TODO: Implement simulation for priority based compilation (blocked by KISEMA-1300)
//    @Test
//    def void testSimulationPrioC(SCCharts scc, TestModelData modelData) {
//        startSimulationTest(#["de.cau.cs.kieler.sccharts.priority.simple"], scc, modelData)
//    }
}
				