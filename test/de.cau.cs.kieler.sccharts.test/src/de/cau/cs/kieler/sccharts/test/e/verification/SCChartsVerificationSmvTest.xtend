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

import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.TestModelData
import de.cau.cs.kieler.test.common.simulation.AbstractVerificationTest
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
class SCChartsVerificationSmvTest extends AbstractVerificationTest<SCCharts> {
    
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
            && !modelData.modelProperties.contains("known-to-fail")
            && !modelData.modelProperties.contains("must-fail")
    }

    @Test
    def void testNuxmvVerification(SCCharts scc, TestModelData modelData) {
        initializeVerification(scc, modelData)
        
        println('''>>>>> testNuxmvVerification «modelData.modelFile» <<<<<''')
        println()
        
        println('''Testing VerificationProperties "«verificationProperties.map[ '''"«it.name»"''' ]»"''')
        startVerification(verificationProperties, verificationAssumptions)    
        println()
    }
    
    override configureContext(CompilationContext verificationContext) {
        super.configureContext(verificationContext)
        
        // Add options
        verificationContext.startEnvironment.setProperty(Environment.CREATE_COUNTEREXAMPLES_WITH_OUTPUTS, createCounterexampleWithOutputs)
        
        // Add SMV options
        verificationContext.startEnvironment.setProperty(Environment.SMV_USE_IVAR, smvUseIVAR)
        val customSmvInvarCommands = getCustomSmvInvarCommands()
        verificationContext.startEnvironment.setProperty(Environment.CUSTOM_INTERACTIVE_SMV_INVAR_COMMANDS, customSmvInvarCommands)
        val customSmvLtlCommands = getCustomSmvLtlCommands()
        verificationContext.startEnvironment.setProperty(Environment.CUSTOM_INTERACTIVE_SMV_LTL_COMMANDS, customSmvLtlCommands)
        val customSmvCtlCommands = getCustomSmvCtlCommands()
        verificationContext.startEnvironment.setProperty(Environment.CUSTOM_INTERACTIVE_SMV_CTL_COMMANDS, customSmvCtlCommands)
    }
    
    override getPropertyAnalyzerProcessorId() {
        return "de.cau.cs.kieler.verification.processors.SCChartsVerificationPropertyAnalyzer" 
    }
    
    override protected getVerificationSystemId() {
        return "de.cau.cs.kieler.sccharts.verification.nuxmv"
    }
    
    protected def boolean getSmvUseIVAR() {
        // IVAR does not work when there are input variables in CTL properties
        if(verificationProperties.exists[ it.type == VerificationPropertyType.CTL ]) {
            return false
        } else {
            return true
        }
    }
    
    protected def List<String> getCustomSmvInvarCommands() {
        if(verificationModelData.modelProperties.contains("unbound-int")) {
            // Use algorithm that can handle infinite domains
            return #["go_msat", "check_invar_ic3 -i -P ${PROPERTY_NAME}", "quit"]    
        } else {
            return #[]
        }
    }
    
    protected def List<String> getCustomSmvLtlCommands() {
        if(verificationModelData.modelProperties.contains("unbound-int")) {
            // Use algorithm that can handle infinite domains
            return #["go_msat", "check_ltlspec_klive -i -P ${PROPERTY_NAME}", "quit"]
        } else {
            return #[]
        }
    }
    
    protected def List<String> getCustomSmvCtlCommands() {
    }
}