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
class LustreSccSimulationTest extends AbstractSimulationTest<LustreProgram> {
    public static val String LUSTRE_LV6_SYSTEM = "de.cau.cs.kieler.lustre.compiler.v6.simulation"
    
    static val lustreInjector = new LustreStandaloneSetup().createInjectorAndDoEMFRegistration
    
    val available = (new LustreV6Compiler(new Environment)).available
    
    new() {
        super(LustreSccSimulationTest.lustreInjector)
    }
    
    override filter(TestModelData modelData) {
        return modelData.hasSimulationTrace
            && modelData.modelProperties.contains("lustre")
            && !modelData.modelProperties.contains("known-to-fail") // TODO Test them anyway?
            && !modelData.modelProperties.contains("must-fail-validation")
    }
    
    @Test
    def void testSimulationLustreLv6(LustreProgram lustreProgram, TestModelData modelData) {
        assumeTrue("Lustre Lv6 Compiler not available", available)
        assumeTrue("Program contains unsupported data types", lustreProgram.hasUnsupportedType)
        
        startSimulationTest(LUSTRE_LV6_SYSTEM, lustreProgram, modelData, "LustreSimulationSLICNetlistC")
    }
    
    /**
     * An LustreProgram with an interface other than signals/valued signals with simple types or any hostcode is not yet supported
     */
    def boolean hasUnsupportedType(LustreProgram lus) {
//        val signals = est.eAllContents.filter(Signal).toList
//        for (s : signals) {
//            if ( s.idType !== null ) {
//                return false
//            }
//        }
//        val types = est.eAllContents.filter(TypeIdentifier).toList
//        for (t : types) {
//            if ( t.idType !== null || t.esterelType !== null) {
//                return false
//            }
//        }
//        return true
        return false
    }
}