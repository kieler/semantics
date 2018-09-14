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
package de.cau.cs.kieler.sccharts.test.simulation

import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.test.simulation.SCChartsSimulationTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.TestModelData
import de.cau.cs.kieler.test.common.simulation.AbstractSimulationTest
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

/**
 * Runs the test cases that must fail and throws an error in case they don't.
 * 
 * @author aas
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class SCChartsSimulationMustFailTest extends AbstractSimulationTest<SCCharts> {

    val SCChartsSimulationTest delegate = new SCChartsSimulationTest()
    
    new() {
        super(SCChartsSimulationTest.scchartsInjector)
    }
    
    override filter(TestModelData modelData) {
        return modelData.hasSimulationTrace
        && modelData.modelProperties.contains("sccharts")
        && modelData.modelProperties.contains("must-fail")
        && !modelData.modelProperties.contains("causality-problem")
    }
    
    @Test
    def void testSimulationNetlistC(SCCharts scc, TestModelData modelData) {
        var failed = false
        try {
            delegate.testSimulationNetlistC(scc, modelData)
        } catch (AssertionError e) {
            // The test failed and it must-fail.
            // This means everything is peachy.
            failed = true
        }
        
        if(!failed) {
            // The test did not fail, but must fail.
            // Thus we throw a new error
            fail("A test that must fail did succeed. Other test results may be invalid!\n"
               + modelData.modelPath)
        }
    }
    
    @Test
    def void testSimulationNetlistJava(SCCharts scc, TestModelData modelData) {
        var failed = false
        try {
            delegate.testSimulationNetlistJava(scc, modelData)
        } catch (AssertionError e) {
            // The test failed and it must-fail.
            // This means everything is peachy.
            failed = true
        }
        
        if(!failed) {
            // The test did not fail, but must fail.
            // Thus we throw a new error
            fail("A test that must fail did succeed. Other test results may be invalid!\n"
               + modelData.modelPath)
        }
    }

    @Test
    def void testSimulationPrioC(SCCharts scc, TestModelData modelData) {
        var failed = false
        try {
            delegate.testSimulationPrioC(scc, modelData)
        } catch (AssertionError e) {
            // The test failed and it must-fail.
            // This means everything is peachy.
            failed = true
        }
        
        if(!failed) {
            // The test did not fail, but must fail.
            // Thus we throw a new error
            fail("A test that must fail did succeed. Other test results may be invalid!\n"
               + modelData.modelPath)
        }
    }
    
    @Test
    def void testSimulationPrioJava(SCCharts scc, TestModelData modelData) {
        var failed = false
        try {
            delegate.testSimulationPrioJava(scc, modelData)
        } catch (AssertionError e) {
            // The test failed and it must-fail.
            // This means everything is peachy.
            failed = true
        }
        
        if(!failed) {
            // The test did not fail, but must fail.
            // Thus we throw a new error
            fail("A test that must fail did succeed. Other test results may be invalid!\n"
               + modelData.modelPath)
        }
    }
}
