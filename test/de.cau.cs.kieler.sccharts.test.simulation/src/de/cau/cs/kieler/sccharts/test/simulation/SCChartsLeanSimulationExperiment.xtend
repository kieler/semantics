/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2026 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.test.simulation

import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.simulation.testing.TestModelData
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.simulation.AbstractSimulationTest
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assume.*
import de.cau.cs.kieler.core.properties.MapPropertyHolder

/**
 * @author als
 *
 */
@RunWith(ModelsRepositoryTestRunner)
class SCChartsLeanSimulationExperiment extends AbstractSimulationTest<SCCharts> {
    
    public static val String MODERN_STATEBASED = "de.cau.cs.kieler.sccharts.simulation.statebased.modern.lean.c"
        
    public static val scchartsInjector = new SCTXStandaloneSetup().createInjectorAndDoEMFRegistration
    
    new() {
        super(scchartsInjector)
    }
    
    override filter(TestModelData modelData) {
        return modelData.hasSimulationTrace
            && modelData.modelProperties.contains("sccharts")
            && !modelData.modelProperties.contains("large")
            && !modelData.modelProperties.contains("known-to-fail")
            && !modelData.modelProperties.contains("must-fail")
    }

    @Test
    def void testSimulationModernLeanStatebasedC(SCCharts scc, TestModelData modelData) {
        assumeFalse("Has 'simulation-fails' property", modelData.modelProperties.contains("simulation-fails-c"))
        
        val props = new MapPropertyHolder
        props.setProperty(new de.cau.cs.kieler.core.properties.Property("de.cau.cs.kieler.kicool.codegen.statebased.modern.lean.c.onlyWarn"), true)
        
        startSimulationTest(MODERN_STATEBASED, scc, modelData, "SCChartsLeamSimulationC", props)
    }
}