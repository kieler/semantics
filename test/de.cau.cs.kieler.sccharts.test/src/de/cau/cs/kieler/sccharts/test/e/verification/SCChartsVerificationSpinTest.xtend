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
package de.cau.cs.kieler.sccharts.test.e.verification

import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.TestModelData
import de.cau.cs.kieler.verification.VerificationContext
import de.cau.cs.kieler.verification.VerificationPropertyType
import java.util.List
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.rules.Timeout
import org.junit.runner.RunWith

/**
 * @author aas
 *
 */
@RunWith(ModelsRepositoryTestRunner)
class SCChartsVerificationSpinTest extends AbstractSCChartsVerificationTest {
    
    public static val scchartsInjector = SCTXStandaloneSetup.doSetup
    
    /**
     * Timeout for tests.
     * The verification is canceled in an @After method to kill the model checking process if needed.
     */
    @Rule
    public final TestRule globalTimeout = Timeout.seconds(60);
    
    // General verification options
    private val createCounterexampleWithOutputs = false
    
    new() {
        super(scchartsInjector)
    }
    
    override filter(TestModelData modelData) {
        return modelData.hasVerificationProperties
            && modelData.modelProperties.contains("verification-test")
            && modelData.modelProperties.contains("sccharts")
            && !modelData.modelProperties.contains("spin-known-to-fail")
            && !modelData.modelProperties.contains("known-to-fail")
            && !modelData.modelProperties.contains("must-fail")
            && false // disable
    }

    @Test
    def void testSpinVerification(SCCharts scc, TestModelData modelData) {
        initializeVerification(scc, modelData)
        
        println('''>>>>> testSpinVerification «modelData.modelFile» <<<<<''')
        println()
        
        for(property : verificationProperties) {
            if(property.type !== VerificationPropertyType.CTL) {
                println('''Testing VerificationProperty "«property.name»"''')
                startVerification(#[property], verificationAssumptions)    
                println()
            }
        }
    }
    
    override configureContext(VerificationContext verificationContext) {
        super.configureContext(verificationContext)
        
        // Add options
        verificationContext.createCounterexamplesWithOutputs = createCounterexampleWithOutputs
        
        // Add spin options
        verificationContext.customSpinCommands = customSpinCommands
    }
    
    override protected getVerificationSystemId() {
        return "de.cau.cs.kieler.sccharts.verification.spin"
    }
    
    protected def List<String> getCustomSpinCommands() {
        // Increased max search depth
         return #["-m100000"]
    }
}
