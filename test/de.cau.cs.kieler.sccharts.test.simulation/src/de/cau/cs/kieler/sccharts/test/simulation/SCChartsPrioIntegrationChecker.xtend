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
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.TestModelData
import de.cau.cs.kieler.test.common.simulation.AbstractSimulationTest
import org.junit.runner.RunWith
import org.junit.Test
import static org.junit.Assume.*

/**
 * @author aas, als
 *
 */
@RunWith(ModelsRepositoryTestRunner)
class SCChartsPrioIntegrationChecker extends AbstractSimulationTest<SCCharts> {
    
    public static val String PRIO_C_SYSTEM = "de.cau.cs.kieler.sccharts.simulation.priority.c"
    public static val String PRIO_C_TTS_SYSTEM = "de.cau.cs.kieler.sccharts.simulation.tts.priority.c"
//    public static val String PRIO_JAVA_SYSTEM = "de.cau.cs.kieler.sccharts.simulation.priority.java"
//    public static val String PRIO_JAVA_TTS_SYSTEM = "de.cau.cs.kieler.sccharts.simulation.tts.priority.java"
    public static val String PRIO_C_LEGACY_SYSTEM = "de.cau.cs.kieler.sccharts.simulation.priority.c.legacy"
    public static val String PRIO_C_TTS_LEGACY_SYSTEM = "de.cau.cs.kieler.sccharts.simulation.tts.priority.c.legacy"
        
    public static val scchartsInjector = new SCTXStandaloneSetup().createInjectorAndDoEMFRegistration
    
    new() {
        super(scchartsInjector)
    }
    
    override filter(TestModelData modelData) {
        return modelData.hasSimulationTrace
            && modelData.modelProperties.contains("sccharts")
            && !modelData.modelProperties.contains("known-to-fail")
            && !modelData.modelProperties.contains("must-fail")
    }
    
    
//    @Test
//    def void testSimulationPrioCLegacy(SCCharts scc, TestModelData modelData) {
//        assumeFalse("Has 'simulation-fails' property", modelData.modelProperties.contains("simulation-fails-prio-c") || modelData.modelProperties.contains("simulation-fails-c"))
//        assumeFalse("Has 'not-IASC' property", modelData.modelProperties.contains("not-iasc"))
//        assumeFalse("Has 'not-SIASC' property", modelData.modelProperties.contains("not-siasc"))
//        assumeFalse("Has 'prio-fails' property", modelData.modelProperties.contains("prio-fails"))
//        
//        startSimulationTest(PRIO_C_LEGACY_SYSTEM, scc, modelData, "SCChartsSimulationPrioCLegacy")
//    }

//    @Test
//    // Test TTS only once with prio
//    def void testSimulationPrioCLegacyWithTTS(SCCharts scc, TestModelData modelData) {
//        assumeFalse("Has 'simulation-fails' property", modelData.modelProperties.contains("simulation-fails-prio-c") || modelData.modelProperties.contains("simulation-fails-prio-c-with-tts") || modelData.modelProperties.contains("simulation-fails-c"))
//        assumeFalse("Has 'not-IASC' property", modelData.modelProperties.contains("not-iasc"))
//        assumeFalse("Has 'not-SIASC' property", modelData.modelProperties.contains("not-siasc"))
//        assumeFalse("Has 'prio-fails' property", modelData.modelProperties.contains("prio-fails"))
//        
//        startSimulationTest(PRIO_C_TTS_LEGACY_SYSTEM, scc, modelData, "SCChartsSimulationPrioCTTSLegacy")
//    }    

    @Test
    def void testSimulationPrioC(SCCharts scc, TestModelData modelData) {
        assumeFalse("Has 'simulation-fails' property", modelData.modelProperties.contains("simulation-fails-prio-c") || modelData.modelProperties.contains("simulation-fails-c"))
        assumeFalse("Has 'not-IASC' property", modelData.modelProperties.contains("not-iasc"))
        assumeFalse("Has 'not-SIASC' property", modelData.modelProperties.contains("not-siasc"))
        assumeFalse("Has 'prio-fails' property", modelData.modelProperties.contains("prio-fails"))
        
        startSimulationTest(PRIO_C_SYSTEM, scc, modelData, "SCChartsSimulationPrioC")
    }

    @Test
    // Test TTS only once with prio
    def void testSimulationPrioCWithTTS(SCCharts scc, TestModelData modelData) {
        assumeFalse("Has 'simulation-fails' property", modelData.modelProperties.contains("simulation-fails-prio-c") || modelData.modelProperties.contains("simulation-fails-prio-c-with-tts") || modelData.modelProperties.contains("simulation-fails-c"))
        assumeFalse("Has 'not-IASC' property", modelData.modelProperties.contains("not-iasc"))
        assumeFalse("Has 'not-SIASC' property", modelData.modelProperties.contains("not-siasc"))
        assumeFalse("Has 'prio-fails' property", modelData.modelProperties.contains("prio-fails"))
        
        startSimulationTest(PRIO_C_TTS_SYSTEM, scc, modelData, "SCChartsSimulationPrioCTTS")
    }
    
}