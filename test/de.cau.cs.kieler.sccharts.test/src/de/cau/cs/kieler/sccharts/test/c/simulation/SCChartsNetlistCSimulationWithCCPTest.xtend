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
package de.cau.cs.kieler.sccharts.test.c.simulation

import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.test.common.repository.TestModelData
import org.junit.Test

/**
 * @author als
 *
 */
class SCChartsNetlistCSimulationWithCCPTest extends SCChartsCSimulationTestBase {
    override filter(TestModelData modelData) {
        return filterForNetlistCompilationTests(modelData)
        && !modelData.modelProperties.contains("simulation-fails-netlist-c")
    }
    
    @Test
    def void testSimulationNetlistC(SCCharts scc, TestModelData modelData) {
        startSimulationTest(#["de.cau.cs.kieler.sccharts.netlist.sccp"], scc, modelData)
    }
}