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
package de.cau.cs.kieler.esterel.test.simulation

import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.EsterelStandaloneSetup
import de.cau.cs.kieler.sccharts.test.c.simulation.SimulationTestBase
import de.cau.cs.kieler.test.common.repository.TestModelData
import org.eclipse.core.runtime.Platform

import static org.junit.Assert.*

/**
 * @author aas
 *
 */
abstract class EsterelSimulationTestBase extends SimulationTestBase<EsterelProgram> {
    static val esterelInjector = new EsterelStandaloneSetup().createInjectorAndDoEMFRegistration
    
    new() {
        super(esterelInjector)
    }
    
    protected def boolean isEsterelTest(TestModelData modelData) {
        return modelData.modelProperties.contains("esterel")
    }
    
    override initialize() {
        super.initialize
        // Assert that prom is loaded. Only then the model analyzer for Esterel is registered and the executable provides an interface
        assertTrue("Plugin 'de.cau.cs.kieler.esterel.prom' is not loaded but required for Esterel simulation",
                   Platform.getBundle("de.cau.cs.kieler.esterel.prom") !== null)
    }
}