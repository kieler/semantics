/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.lustre.test.simulation

import de.cau.cs.kieler.lustre.LustreStandaloneSetup
import de.cau.cs.kieler.test.common.simulation.AbstractSimulationTest
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.test.common.repository.TestModelData
import org.junit.Test

import static org.junit.Assume.*

/**
 * Tests if the Lustre to SCC cf transformation behaves in correspondance to the trace files. 
 * 
 * @author lgr
 */
class LustreSccControlFlowSimulationTest extends AbstractSimulationTest<LustreProgram> {
    
    public static val String LUSTRE_CONTROLFLOW_NETLIST_C_SYSTEM = "de.cau.cs.kieler.lustre.controlflow.c";
    
    static val lustreInjector = new LustreStandaloneSetup().createInjectorAndDoEMFRegistration
    
    new() {
        super(lustreInjector)
    }
    
    override filter(TestModelData modelData) {
        return modelData.hasSimulationTrace
            && modelData.modelProperties.contains("lustre")
            && !modelData.modelProperties.contains("must-fail-validation")
            && !modelData.modelProperties.contains("not-for-cf-approach")
    }
    
    @Test
    def void testSimulationSLICNetlistC(LustreProgram lustre, TestModelData modelData) {
        assumeFalse("Has 'simulation-fails' property", modelData.modelProperties.contains("simulation-fails-netlist-c") || modelData.modelProperties.contains("simulation-fails-c"))
        assumeFalse("Has 'netlist-fails' property", modelData.modelProperties.contains("netlist-fails"))
        
        startSimulationTest(LUSTRE_CONTROLFLOW_NETLIST_C_SYSTEM, lustre, modelData, "LustreSimulationSCCCFNetlistC")
    }
    
}