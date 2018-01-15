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
import de.cau.cs.kieler.simulation.backends.CSimulationBackend
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.TestModelData
import java.util.List
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Compile all SCCharts to C and simulate them with their corresponding eso files.
 * 
 * @author als, aas
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class SCChartsCSimulationTest extends SimulationTestBase {
    
    protected val cSimulationBackend = new CSimulationBackend() {
        override getBuildConfigOrigin() {
            return "platform:/plugin/de.cau.cs.kieler.sccharts.test/resources/sccharts-netlist-c.kibuild"
        }
    }
    
    override filter(TestModelData modelData) {
        return !modelData.tracePaths.empty
        && modelData.tracePaths.exists[fileName.toString.endsWith("eso") || fileName.toString.endsWith("ktrace")]
        && modelData.modelProperties.contains("sccharts")
        && !modelData.modelProperties.contains("must-fail")
        && !modelData.modelProperties.contains("known-to-fail") // TODO Test them anyway?
        && !modelData.modelProperties.contains("not-asc")
        && !modelData.modelProperties.contains("not-sasc")
        && !modelData.modelProperties.contains("simulation-fails")
        && !modelData.additionalProperties.containsKey("c-simulation") // case: c-simulation = false
    }
    
    @Test
    def void testSimulationNetlistC(SCCharts scc, TestModelData modelData) {
        startSimulationTest(#["de.cau.cs.kieler.sccharts.netlist.simple"], scc, modelData)
    }
    
    @Test
    def void testSimulationNetlistCWithTTS(SCCharts scc, TestModelData modelData) {
        startSimulationTest(#["de.cau.cs.kieler.sccharts.processors.transformators.takenTransitionSignaling",
                              "de.cau.cs.kieler.sccharts.netlist.simple"], scc, modelData)
    }
    
//    TODO: Implement simulation for priority based compilation (blocked by KISEMA-1300)
//    @Test
//    def void testSimulationPrioC(SCCharts scc, TestModelData modelData) {
//        startSimulationTest(#["de.cau.cs.kieler.sccharts.priority.simple"], scc, modelData)
//    }
    
    def void startSimulationTest(List<String> compileChain, SCCharts scc, TestModelData modelData) {
        cSimulationBackend.buildConfig.setModelCompilerAttributeToStringList("compileChain", compileChain)
        val context = createSimulationContext
        context.simulationBackend = cSimulationBackend
        compileModelAndStartSimulationTest(context, scc, modelData)
    }
}
				