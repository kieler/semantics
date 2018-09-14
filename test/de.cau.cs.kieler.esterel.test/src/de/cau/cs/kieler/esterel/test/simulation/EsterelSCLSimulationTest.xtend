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
import de.cau.cs.kieler.test.common.repository.TestModelData
import de.cau.cs.kieler.test.common.simulation.AbstractSimulationTest
import org.junit.Test

import static org.junit.Assume.*

/**
 * @author als
 * 
 */
class EsterelSCLSimulationTest extends AbstractSimulationTest<EsterelProgram> {
    
    public static val String NETLIST_C_SYSTEM = null
    public static val String NETLIST_JAVA_SYSTEM = null
    public static val String PRIO_C_SYSTEM = null
    public static val String PRIO_JAVA_SYSTEM = null
    
    static val esterelInjector = EsterelStandaloneSetup.doSetup
    
    new() {
        super(esterelInjector)
    }
    
    override filter(TestModelData modelData) {
        return modelData.hasSimulationTrace
            && modelData.modelProperties.contains("esterel")
            && !modelData.modelProperties.contains("known-to-fail")
            && !modelData.modelProperties.contains("must-fail")
    }
    
    @Test
    def void testSimulationNetlistC(EsterelProgram esterel, TestModelData modelData) {
        assumeTrue("TODO Esterel simulation tests", false)
    }

//    @Test
//    def void testSimulationNetlistC(EsterelProgram esterel, TestModelData modelData) {
//        assumeFalse("Has 'simulation-fails' property", modelData.modelProperties.contains("simulation-fails-netlist-c") || modelData.modelProperties.contains("simulation-fails-c"))
//        assumeFalse("Has 'not-ASC' property", modelData.modelProperties.contains("not-asc"))
//        assumeFalse("Has 'not-SASC' property", modelData.modelProperties.contains("not-sasc"))
//        
//        startSimulationTest(NETLIST_C_SYSTEM, esterel, modelData, "EsterelSimulationNetlistC")
//    }
//    
//    @Test
//    def void testSimulationNetlistJava(EsterelProgram esterel, TestModelData modelData) {
//        assumeFalse("Has 'simulation-fails' property", modelData.modelProperties.contains("simulation-fails-netlist-java") || modelData.modelProperties.contains("simulation-fails-java"))
//        assumeFalse("Has 'not-ASC' property", modelData.modelProperties.contains("not-asc"))
//        assumeFalse("Has 'not-SASC' property", modelData.modelProperties.contains("not-sasc"))
//        
//        startSimulationTest(NETLIST_JAVA_SYSTEM, esterel, modelData, "EsterelSimulationNetlistJava")
//    }
//
//    @Test
//    def void testSimulationPrioC(EsterelProgram esterel, TestModelData modelData) {
//        assumeFalse("Has 'simulation-fails' property", modelData.modelProperties.contains("simulation-fails-prio-c") || modelData.modelProperties.contains("simulation-fails-c"))
//        assumeFalse("Has 'not-IASC' property", modelData.modelProperties.contains("not-iasc"))
//        assumeFalse("Has 'not-SIASC' property", modelData.modelProperties.contains("not-siasc"))
//        
//        startSimulationTest(PRIO_C_SYSTEM, esterel, modelData, "EsterelSimulationPrioC")
//    }
//    
//    @Test
//    def void testSimulationPrioJava(EsterelProgram esterel, TestModelData modelData) {
//        assumeFalse("Skip this test property", modelData.modelProperties.contains("simulation-fails-prio-java") || modelData.modelProperties.contains("simulation-fails-java"))
//        assumeFalse("Has not-IASC property", modelData.modelProperties.contains("not-iasc"))
//        assumeFalse("Has not-SIASC property", modelData.modelProperties.contains("not-siasc"))
//        
//        startSimulationTest(PRIO_JAVA_SYSTEM, esterel, modelData, "EsterelSimulationPrioJava")
//    }
}
