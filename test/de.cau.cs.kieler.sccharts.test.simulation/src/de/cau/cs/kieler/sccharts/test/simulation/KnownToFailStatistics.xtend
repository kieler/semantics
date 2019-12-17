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
import java.util.List
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Prints out the semantic simulation tests that are known to fail.
 * 
 * @author aas
 *
 */
@RunWith(ModelsRepositoryTestRunner)
class KnownToFailStatistics extends AbstractSimulationTest<SCCharts> {

    private static val Thread shutdownHook = createAndRegisterShutdownHookToPrintStatistics

    private static val knownToFailTests = <String, List<TestModelData>>newHashMap
    
    private val knownToFailProperties = #["known-to-fail",
                                          "simulation-fails-netlist-c",
                                          "simulation-fails-netlist-c-with-tts",
                                          "simulation-fails-netlist-java",
                                          "simulation-fails-netlist-java-with-tts",
                                          "simulation-fails-prio-java",
                                          "simulation-fails-prio-java-with-tts",
                                          "simulation-fails-statebased-c",
                                          "simulation-fails-statebased-java",
                                          "netlist-fails",
                                          "prio-fails"]
    
    protected static val scchartsInjector = new SCTXStandaloneSetup().createInjectorAndDoEMFRegistration
    
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
    }

    private def void addKnownToFailTest(String property, TestModelData modelData) {
        val knownToFailList = knownToFailTests.getOrDefault(property, newArrayList)
        knownToFailList.add(modelData)
        knownToFailTests.put(property, knownToFailList)
    }
    
    
    public def static void printStatistics() {
        //This should be called after ALL tests are finished
        println()
        println(" == RESULTS ==")
        for(entry : knownToFailTests.entrySet) {
            val knownToFailList = entry.value
            println(knownToFailList.size+" known to fail tests of property '"+entry.key+"':")
            for(modelData : knownToFailList) {
                println("\t'"+modelData.modelPath+"'")
            }
        }
    }
    
    /**
     * Adds a shutdown hook to the JVM (if not done yet)
     * to print the statistics after all tests have been finished.
     * 
     * This should be executed in a static initializer, such that it is executed only once.
     */
    public def static Thread createAndRegisterShutdownHookToPrintStatistics() {
        val shutdownHook = new Thread{
            override run(){
                printStatistics
            }
        }
        Runtime.getRuntime().addShutdownHook(shutdownHook);
        return shutdownHook
    }
}