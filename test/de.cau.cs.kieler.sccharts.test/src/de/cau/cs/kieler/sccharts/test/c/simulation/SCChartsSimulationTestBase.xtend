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
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.test.common.repository.TestModelData
import org.eclipse.core.runtime.Platform

import static org.junit.Assert.*

/**
 * @author aas
 *
 */
abstract class SCChartsSimulationTestBase extends SimulationTestBase<SCCharts> {
    protected static val scchartsInjector = new SCTXStandaloneSetup().createInjectorAndDoEMFRegistration
    
    protected def boolean isSCChartsTest(TestModelData modelData) {
        return modelData.modelProperties.contains("sccharts")
    }
    
    new() {
        super(scchartsInjector)
    }
    
    override initialize() {
        super.initialize
        // Assert that prom is loaded. Only then the SCChartsAnalyser is registered and the executable provides an interface
        assertTrue("Plugin 'de.cau.cs.kieler.sccharts.prom' is not loaded but required for SCCharts simulation",
                   Platform.getBundle("de.cau.cs.kieler.sccharts.prom") !== null)
    }
}