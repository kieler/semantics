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
import de.cau.cs.kieler.test.common.repository.TestModelData
import de.cau.cs.kieler.test.common.simulation.AbstractSimulationTest
import java.util.List
import org.junit.Test

/**
 * Prints out the semantic simulation tests that are known to fail.
 * 
 * @author aas
 *
 */
class KnownToFailStatistics extends AbstractSimulationTest<SCCharts> {

    private static val knownToFailTests = <String, List<TestModelData>>newHashMap
    
    private val knownToFailProperties = #["known-to-fail",
                                          "simulation-fails-netlist-c",
                                          "simulation-fails-netlist-c-with-tts",
                                          "simulation-fails-netlist-java",
                                          "simulation-fails-netlist-java-with-tts",
                                          "simulation-fails-prio-java",
                                          "simulation-fails-prio-java-with-tts"]
    
    protected static val scchartsInjector = SCTXStandaloneSetup.doSetup
    
    new() {
        super(scchartsInjector)
    }
    
    override filter(TestModelData modelData) {
        var boolean isKnownToFail = true
        for(p : knownToFailProperties) {
            if(modelData.modelProperties.contains(p)) {
                isKnownToFail = true
            }
        }
        return isKnownToFail
        && modelData.hasSimulationTrace
        && modelData.modelProperties.contains("sccharts")
    }
    
    @Test
    def void testKnownToFailStatistics(SCCharts scc, TestModelData modelData) {
        for(p : knownToFailProperties) {
            if(modelData.modelProperties.contains(p)) {
                addKnownToFailTest(p, modelData)
            }
        }
        
        // TODO: This should only be called once after ALL tests are done,
        // but there is no hook in the TestRunner to do so
        printStatistics
    }
    
    def static void printStatistics() {
        // TODO: Call this after ALL tests are done
        for(entry : knownToFailTests.entrySet) {
            val knownToFailList = entry.value
            System.err.println(knownToFailList.size+" known to fail tests of property '"+entry.key+"':")
            for(modelData : knownToFailList) {
                System.err.println("\t'"+modelData.modelPath+"'")
            }
        }
    }
    
    private def void addKnownToFailTest(String property, TestModelData modelData) {
        val knownToFailList = knownToFailTests.getOrDefault(property, newArrayList)
        knownToFailList.add(modelData)
        knownToFailTests.put(property, knownToFailList)
    }
}