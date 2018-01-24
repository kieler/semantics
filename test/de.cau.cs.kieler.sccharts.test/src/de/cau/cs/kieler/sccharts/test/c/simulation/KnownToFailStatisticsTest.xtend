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
import de.cau.cs.kieler.test.common.repository.TestModelData
import java.util.List
import org.junit.Test

/**
 * Prints out the semantic simulation tests that are known to fail.
 * 
 * @author aas
 *
 */
class KnownToFailStatisticsTest extends SCChartsCSimulationTestBase {
    
    private static val knownToFailTests = <String, List<TestModelData>>newHashMap
    
    private val knownToFailProperties = #["known-to-fail",
                                          "simulation-fails-netlist-c",
                                          "simulation-fails-netlist-c-with-tts",
                                          "simulation-fails-netlist-java",
                                          "simulation-fails-prio-java"]
    
    override filter(TestModelData modelData) {
        var boolean isKnownToFail = true
        for(p : knownToFailProperties) {
            if(modelData.modelProperties.contains(p)) {
                isKnownToFail = true
            }
        }
        return !modelData.tracePaths.empty
        && modelData.tracePaths.exists[fileName.toString.endsWith("eso") || fileName.toString.endsWith("ktrace")]
        && modelData.modelProperties.contains("sccharts")
        && isKnownToFail
    }
    
//      No need to run this on the server
//    @Test
//    def void testKnownToFailStatistics(SCCharts scc, TestModelData modelData) {
//        for(p : knownToFailProperties) {
//            if(modelData.modelProperties.contains(p)) {
//                addKnownToFailTest(p, modelData)
//            }
//        }
//        
//        // TODO: This should only be called once after ALL tests are done,
//        // but there is no hook in the TestRunner to do so
//        printStatistics
//    }
    
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