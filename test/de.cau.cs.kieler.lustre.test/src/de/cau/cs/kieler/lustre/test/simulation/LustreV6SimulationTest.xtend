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
import de.cau.cs.kieler.lustre.lustre.LustreProgram
import de.cau.cs.kieler.test.common.repository.TestModelData
import de.cau.cs.kieler.test.common.simulation.AbstractSimulationTest
import org.junit.Test

import static org.junit.Assume.*
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.lustre.compiler.LustreV6Compiler

/**
 * @author lgr
 *
 */
class LustreV6SimulationTest extends AbstractSimulationTest<LustreProgram> {
    public static val String LUSTRE_V6_SYSTEM = "de.cau.cs.kieler.lustre.v6.simulation"
    
    static val lustreInjector = new LustreStandaloneSetup().createInjectorAndDoEMFRegistration
    
    val available = (new LustreV6Compiler(new Environment)).available
    
    new() {
        super(LustreV6SimulationTest.lustreInjector)
    }
    
    override filter(TestModelData modelData) {
        return modelData.hasSimulationTrace
            && modelData.modelProperties.contains("lustre")
            && !modelData.modelProperties.contains("known-to-fail") // TODO Test them anyway?
            && !modelData.modelProperties.contains("must-fail-validation")
    }
    
    @Test
    def void testSimulationLustreV6(LustreProgram lustreProgram, TestModelData modelData) {
        assumeTrue("Lustre V6 Compiler not available", available)
        
        startSimulationTest(LUSTRE_V6_SYSTEM, lustreProgram, modelData, "LustreSimulationSLICNetlistC")
    }
    
}