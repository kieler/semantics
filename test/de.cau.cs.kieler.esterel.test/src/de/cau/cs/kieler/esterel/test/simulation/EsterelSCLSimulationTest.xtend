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
package de.cau.cs.kieler.esterel.test.simulation

import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.EsterelStandaloneSetup
import de.cau.cs.kieler.simulation.testing.TestModelData
import de.cau.cs.kieler.test.common.simulation.AbstractSimulationTest
import org.junit.Test

import static org.junit.Assume.*

import static extension de.cau.cs.kieler.esterel.test.compiler.EsterelSCLCompilationTest.hasNoEsterelType

/**
 * @author als
 * 
 */
class EsterelSCLSimulationTest extends AbstractSimulationTest<EsterelProgram> {
    
    public static val String SLIC_NETLIST_C_SYSTEM = "de.cau.cs.kieler.esterel.scest.scl.slic.simulation.netlist.c"
    public static val String SLIC_NETLIST_JAVA_SYSTEM = "de.cau.cs.kieler.esterel.scest.scl.slic.simulation.netlist.java"
    public static val String SLIC_PRIO_C_SYSTEM = "de.cau.cs.kieler.esterel.scest.scl.slic.simulation.priority.c"
    public static val String SLIC_PRIO_JAVA_SYSTEM = "de.cau.cs.kieler.esterel.scest.scl.slic.simulation.priority.java"
    public static val String DYNAMIC_NETLIST_C_SYSTEM = "de.cau.cs.kieler.esterel.scest.scl.simulation.netlist.c"
    public static val String DYNAMIC_NETLIST_JAVA_SYSTEM = "de.cau.cs.kieler.esterel.scest.scl.simulation.netlist.java"
    public static val String DYNAMIC_PRIO_C_SYSTEM = "de.cau.cs.kieler.esterel.scest.scl.simulation.priority.c"
    public static val String DYNAMIC_PRIO_JAVA_SYSTEM = "de.cau.cs.kieler.esterel.scest.scl.simulation.priority.java"
    
    static val esterelInjector = new EsterelStandaloneSetup().createInjectorAndDoEMFRegistration
    
    new() {
        super(esterelInjector)
    }
    
    override filter(TestModelData modelData) {
        return modelData.hasSimulationTrace
            && modelData.modelProperties.contains("esterel")
            && !modelData.modelProperties.contains("known-to-fail")
            && !modelData.modelProperties.contains("must-fail")
            && !modelData.modelProperties.contains("scest-fails")
            && !modelData.modelProperties.contains("hostcode")
            && !modelData.modelProperties.contains("scest-simulation-fails")
            && !modelData.modelProperties.contains("bad-sc-trace") // Some traces test even after termination but the the signal reset is not present and the tests fails
    }
    
    @Test
    def void testSimulationSLICNetlistC(EsterelProgram esterel, TestModelData modelData) {
        assumeFalse("Has 'scest-slic-fails' property", modelData.modelProperties.contains("scest-slic-fails"))
        assumeTrue("Program contains unsupported data types", esterel.hasNoEsterelType) // skip if program includes esterel type
        assumeFalse("Has 'simulation-fails' property", modelData.modelProperties.contains("simulation-fails-netlist-c") || modelData.modelProperties.contains("simulation-fails-c"))
        assumeFalse("Has 'netlist-fails' property", modelData.modelProperties.contains("netlist-fails"))
        
        startSimulationTest(SLIC_NETLIST_C_SYSTEM, esterel, modelData, "EsterelSimulationSLICNetlistC")
    }
    
    @Test
    def void testSimulationSLICNetlistJava(EsterelProgram esterel, TestModelData modelData) {
        assumeFalse("Has 'scest-slic-fails' property", modelData.modelProperties.contains("scest-slic-fails"))
        assumeTrue("Program contains unsupported data types", esterel.hasNoEsterelType) // skip if program includes esterel type
        assumeFalse("Has 'simulation-fails' property", modelData.modelProperties.contains("simulation-fails-netlist-java") || modelData.modelProperties.contains("simulation-fails-java"))
        assumeFalse("Has 'netlist-fails' property", modelData.modelProperties.contains("netlist-fails"))
        
        startSimulationTest(SLIC_NETLIST_JAVA_SYSTEM, esterel, modelData, "EsterelSimulationSLICNetlistJava")
    }

    @Test
    def void testSimulationSLICPrioC(EsterelProgram esterel, TestModelData modelData) {
        assumeFalse("Has 'scest-slic-fails' property", modelData.modelProperties.contains("scest-slic-fails"))
        assumeTrue("Program contains unsupported data types", esterel.hasNoEsterelType) // skip if program includes esterel type
        assumeFalse("Has 'simulation-fails' property", modelData.modelProperties.contains("simulation-fails-prio-c") || modelData.modelProperties.contains("simulation-fails-c"))
        assumeFalse("Has 'prio-fails' property", modelData.modelProperties.contains("prio-fails"))
        
        startSimulationTest(SLIC_PRIO_C_SYSTEM, esterel, modelData, "EsterelSimulationSLICPrioC")
    }
    
    @Test
    def void testSimulationSLICPrioJava(EsterelProgram esterel, TestModelData modelData) {
        assumeFalse("Has 'scest-slic-fails' property", modelData.modelProperties.contains("scest-slic-fails"))
        assumeTrue("Program contains unsupported data types", esterel.hasNoEsterelType) // skip if program includes esterel type
        assumeFalse("Skip this test property", modelData.modelProperties.contains("simulation-fails-prio-java") || modelData.modelProperties.contains("simulation-fails-java"))
        assumeFalse("Has 'prio-fails' property", modelData.modelProperties.contains("prio-fails"))
        
        startSimulationTest(SLIC_PRIO_JAVA_SYSTEM, esterel, modelData, "EsterelSimulationSLICPrioJava")
    }
    
    @Test
    def void testSimulationDynamicNetlistC(EsterelProgram esterel, TestModelData modelData) {
        assumeFalse("Has 'scest-dynamic-fails' property", modelData.modelProperties.contains("scest-dynamic-fails"))
        assumeTrue("Program contains unsupported data types", esterel.hasNoEsterelType) // skip if program includes esterel type
        assumeFalse("Has 'simulation-fails' property", modelData.modelProperties.contains("simulation-fails-netlist-c") || modelData.modelProperties.contains("simulation-fails-c"))
        assumeFalse("Has 'netlist-fails' property", modelData.modelProperties.contains("netlist-fails"))
        
        startSimulationTest(DYNAMIC_NETLIST_C_SYSTEM, esterel, modelData, "EsterelSimulationDynamicNetlistC")
    }

    @Test
    def void testSimulationDynamicPrioC(EsterelProgram esterel, TestModelData modelData) {
        assumeFalse("Has 'scest-dynamic-fails' property", modelData.modelProperties.contains("scest-dynamic-fails"))
        assumeTrue("Program contains unsupported data types", esterel.hasNoEsterelType) // skip if program includes esterel type
        assumeFalse("Has 'simulation-fails' property", modelData.modelProperties.contains("simulation-fails-prio-c") || modelData.modelProperties.contains("simulation-fails-c"))
        assumeFalse("Has 'prio-fails' property", modelData.modelProperties.contains("prio-fails"))
        
        startSimulationTest(DYNAMIC_PRIO_C_SYSTEM, esterel, modelData, "EsterelSimulationDynamicPrioC")
    }
}
