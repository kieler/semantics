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

import com.google.inject.Inject
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.EsterelStandaloneSetup
import de.cau.cs.kieler.esterel.Signal
import de.cau.cs.kieler.esterel.TypeIdentifier
import de.cau.cs.kieler.esterel.compiler.InriaEsterelCompiler
import de.cau.cs.kieler.esterel.extensions.EsterelExtensions
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.test.common.repository.TestModelData
import de.cau.cs.kieler.test.common.simulation.AbstractSimulationTest
import org.junit.Test

import static org.junit.Assume.*

/**
 * @author als
 * 
 */
class BerryEsterelSimulationTest extends AbstractSimulationTest<EsterelProgram> {
    
    public static val String INRIA_ESTEREL_SYSTEM = "de.cau.cs.kieler.esterel.compiler.inria.simulation"
    
    static val esterelInjector = new EsterelStandaloneSetup().createInjectorAndDoEMFRegistration
    
    @Inject
    extension EsterelExtensions
    
    new() {
        super(esterelInjector)
    }
    
    override filter(TestModelData modelData) {
        return modelData.hasSimulationTrace
            && modelData.modelProperties.contains("esterel")
            && !modelData.modelProperties.contains("known-to-fail")
            && !modelData.modelProperties.contains("must-fail")
            && !modelData.modelProperties.contains("hostcode")
            && !modelData.modelProperties.contains("iec-simulation-fails")
            && !modelData.modelProperties.contains("not-berry-constructive")
            //&& !modelData.modelProperties.contains("bad-sc-trace") // Some traces test even after termination but the the signal reset is not present and the tests fails
    }
    
    @Test
    def void testSimulationInriaEsterel(EsterelProgram esterel, TestModelData modelData) {
        assumeTrue("Program contains unsupported data types", esterel.hasUnsupportedType) // skip if program includes esterel type
        
        startSimulationTest(INRIA_ESTEREL_SYSTEM, esterel, modelData, "EsterelSimulationBerry")
    }
    
    /**
     * An EsterelProgram with an interface other than signals/valued signals with simple types or any hostcode is not yet supported
     */
    def boolean hasUnsupportedType(EsterelProgram est) {
        val signals = est.eAllContents.filter(Signal).toList
        for (s : signals) {
            if ( s.idType !== null ) {
                return false
            }
        }
        val types = est.eAllContents.filter(TypeIdentifier).toList
        for (t : types) {
            if ( t.idType !== null || t.esterelType !== null) {
                return false
            }
        }
        return true
    }
}
