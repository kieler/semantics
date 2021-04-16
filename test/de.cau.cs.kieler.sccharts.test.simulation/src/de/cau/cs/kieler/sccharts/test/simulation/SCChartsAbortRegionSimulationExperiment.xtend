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

import de.cau.cs.kieler.core.properties.MapPropertyHolder
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.simulation.testing.TestModelData
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.simulation.AbstractSimulationTest
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assume.*

/**
 * Tests SCCharts simulation with new abort regions.
 * Named experiment to exclude it from CI automatic tests.
 * 
 * @author als
 *
 */
@RunWith(ModelsRepositoryTestRunner)
class SCChartsAbortRegionSimulationExperiment extends AbstractSimulationTest<SCCharts> {
    
    public static val String NETLIST_C_SYSTEM = "de.cau.cs.kieler.sccharts.simulation.netlist.c"
        
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

    @Test
    def void testSimulationNetlistC(SCCharts scc, TestModelData modelData) {
        assumeFalse("Has 'simulation-fails' property", modelData.modelProperties.contains("simulation-fails-netlist-c") || modelData.modelProperties.contains("simulation-fails-c"))
        assumeFalse("Has 'not-ASC' property", modelData.modelProperties.contains("not-asc"))
        assumeFalse("Has 'not-SASC' property", modelData.modelProperties.contains("not-sasc"))
        assumeFalse("Has 'netlist-fails' property", modelData.modelProperties.contains("netlist-fails"))
        
        val props = new MapPropertyHolder
        props.setProperty(new Property("de.cau.cs.kieler.sccharts.abort.abortRegions"), true)
        props.setProperty(new Property("de.cau.cs.kieler.scg.opt.smartRegisterAllocation"), false)
        
        startSimulationTest(NETLIST_C_SYSTEM, scc, modelData, "SCChartsAbortRegionSimulation", props)
    }
    
}