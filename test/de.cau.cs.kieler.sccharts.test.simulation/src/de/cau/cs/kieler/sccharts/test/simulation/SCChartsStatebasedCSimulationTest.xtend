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
package de.cau.cs.kieler.sccharts.test.simulation

import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.test.common.repository.TestModelData
import org.junit.Test
import org.junit.runner.RunWith
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.simulation.AbstractSimulationTest
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import static org.junit.Assume.*

/**
 * @author ssm
 *
 */
 @RunWith(ModelsRepositoryTestRunner)
class SCChartsStatebasedCSimulationTest extends AbstractSimulationTest<SCCharts> {
    
    public static val STATEBASED_SIMULATION_SYSTEM = "de.cau.cs.kieler.sccharts.simulation.statebased.c"
    public static val STATEBASED_SIMULATION_SYSTEM_TTS = "de.cau.cs.kieler.sccharts.simulation.tts.statebased.c"
    public static val STATEBASED_LEAN_SIMULATION_SYSTEM = "de.cau.cs.kieler.sccharts.simulation.statebased.lean.c"
    public static val STATEBASED_LEAN_SIMULATION_SYSTEM_TTS = "de.cau.cs.kieler.sccharts.simulation.tts.statebased.lean.c"

        
    public static val scchartsInjector = new SCTXStandaloneSetup().createInjectorAndDoEMFRegistration
    
    new() {
        super(scchartsInjector)
    }    
    
    override filter(TestModelData modelData) {
        return modelData.modelProperties.contains("statebased")
        && !modelData.modelProperties.contains("not-core")
        && !modelData.modelProperties.contains("simulation-fails-netlist-c")
        && !modelData.modelProperties.contains("simulation-fails-statebased-c")
    }
    
    @Test
    def void testSimulationStatebasedC(SCCharts scc, TestModelData modelData) {
        assumeFalse("Has 'simulation-fails' property", modelData.modelProperties.contains("simulation-fails-statebased-c"))
        
        startSimulationTest(STATEBASED_SIMULATION_SYSTEM, scc, modelData, "State-based Simulation Test (C)")
    }
    
    @Test
    def void testSimulationStatebasedCTTS(SCCharts scc, TestModelData modelData) {
        assumeFalse("Has 'simulation-fails' property", modelData.modelProperties.contains("simulation-fails-statebased-c"))
        
        startSimulationTest(STATEBASED_SIMULATION_SYSTEM_TTS, scc, modelData, "State-based Simulation Test (C, TTS)")
    }

    @Test
    def void testSimulationStatebasedLeanC(SCCharts scc, TestModelData modelData) {
        assumeTrue("Missing property lean", modelData.modelProperties.contains("lean"))
        assumeFalse("Has 'simulation-fails' property", modelData.modelProperties.contains("simulation-fails-statebased-lean-c"))
        
        startSimulationTest(STATEBASED_LEAN_SIMULATION_SYSTEM, scc, modelData, "State-based Lean Simulation Test (C)")
    }
    
    @Test
    def void testSimulationStatebasedLeanCTTS(SCCharts scc, TestModelData modelData) {
        assumeTrue("Missing property lean", modelData.modelProperties.contains("lean"))
        assumeFalse("Has 'simulation-fails' property", modelData.modelProperties.contains("simulation-fails-statebased-lean-c"))
        
        startSimulationTest(STATEBASED_LEAN_SIMULATION_SYSTEM_TTS, scc, modelData, "State-based Lean Simulation Test (C, TTS)")
    }
    
}