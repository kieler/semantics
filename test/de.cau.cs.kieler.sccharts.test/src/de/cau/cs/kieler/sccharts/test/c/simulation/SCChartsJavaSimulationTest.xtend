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
import de.cau.cs.kieler.simulation.backends.JavaSimulationBackend
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.TestModelData
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Compile all SCCharts to Java and simulate them with their corresponding eso files.
 * 
 * @author aas
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class SCChartsJavaSimulationTest extends SimulationTestBase {
    
    override protected createSimulationBackend() {
        return new JavaSimulationBackend() {
            override getBuildConfigOrigin() {
                return "platform:/plugin/de.cau.cs.kieler.sccharts.test/resources/sccharts-netlist-java.kibuild"
            }    
        }
    }
    
    override filter(TestModelData modelData) {
        return !modelData.tracePaths.empty
        && modelData.tracePaths.exists[fileName.toString.endsWith("eso") || fileName.toString.endsWith("ktrace")]
        && modelData.modelProperties.contains("sccharts")
        && !modelData.modelProperties.contains("must-fail")
        && !modelData.modelProperties.contains("known-to-fail")
        && !modelData.modelProperties.contains("not-asc")
        && !modelData.modelProperties.contains("not-sasc")
        && !modelData.modelProperties.contains("simulation-fails")
        && !modelData.additionalProperties.containsKey("java-simulation") // case: java-simulation = false
    }
    
    @Test
    def void testSimulationNetlistJava(SCCharts scc, TestModelData modelData) {
        if(modelData.isKnownToFail("simulation-fails-netlist-java")) {
            return
        }
        startSimulationTest(#["de.cau.cs.kieler.sccharts.netlist.java"], scc, modelData)
    }
    
//    This test seems to be very redundant with netlist-c-tts. The Java compilation is highly unlikely to add anything.
//    @Test
//    def void testSimulationNetlistJavaWithTTS(SCCharts scc, TestModelData modelData) {
//        if(modelData.isKnownToFail("simulation-fails-netlist-java")) {
//            return
//        }
//        if(modelData.isKnownToFail("simulation-fails-netlist-java-with-tts")) {
//            return
//        }
//        startSimulationTest(#["de.cau.cs.kieler.sccharts.processors.transformators.takenTransitionSignaling",
//                              "de.cau.cs.kieler.sccharts.netlist.java"], scc, modelData)
//    }

    @Test
    def void testSimulationPrioJava(SCCharts scc, TestModelData modelData) {
        if(modelData.isKnownToFail("simulation-fails-netlist-java")) {
            return
        }
        if(modelData.isKnownToFail("simulation-fails-prio-java")) {
            return
        }
        if(modelData.isKnownToFail("simulation-fails-prio-java-unreachable-code")) {
            return
        }
        startSimulationTest(#["de.cau.cs.kieler.sccharts.priority.java"], scc, modelData)
    }
    
//    @Test
//    def void testSimulationPrioJavaWithTTS(SCCharts scc, TestModelData modelData) {
//        startSimulationTest(#["de.cau.cs.kieler.sccharts.processors.transformators.takenTransitionSignaling",
//                              "de.cau.cs.kieler.sccharts.priority.java"], scc, modelData)
//    }
}
