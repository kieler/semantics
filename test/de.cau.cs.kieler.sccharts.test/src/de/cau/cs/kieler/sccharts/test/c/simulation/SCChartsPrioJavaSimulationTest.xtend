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

import de.cau.cs.kieler.simulation.backends.JavaSimulationBackend
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.TestModelData
import org.junit.runner.RunWith

/**
 * Tests all SCCharts compiled to C executables with their eso files.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class SCChartsPrioJavaSimulationTest extends SCChartsNetlistSimulationTest {
    
    override initializeSimulationBackend() {
        simBackend = new JavaSimulationBackend() {
            override getBuildConfigOrigin() {
                return "platform:/plugin/de.cau.cs.kieler.sccharts.test/resources/sccharts-prio-java.kibuild"
            }
        }
    }
    
    /**
     * {@inheritDoc}
     */
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
}
