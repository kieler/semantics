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
import de.cau.cs.kieler.kicool.compilation.CompilationSystem
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.compilation.observer.CompilationFinished
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.TestModelData
import de.cau.cs.kieler.test.common.simulation.AbstractVerificationTest
import de.cau.cs.kieler.verification.VerificationAssumption
import de.cau.cs.kieler.verification.VerificationProperty
import de.cau.cs.kieler.verification.VerificationPropertyChanged
import de.cau.cs.kieler.verification.VerificationPropertyStatus
import java.util.List
import java.util.Observable
import org.eclipse.emf.ecore.EObject
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

/**
 * @author aas, als
 *
 */
@RunWith(ModelsRepositoryTestRunner)
class SCChartsVerificationTest extends AbstractVerificationTest<SCCharts> {
    
    public static val scchartsInjector = new SCTXStandaloneSetup().createInjectorAndDoEMFRegistration
    
    public static val MUST_FAIL_PATTERN_KEY = "verification-must-fail"
    
    protected var String propertyAnalyzerProcessorId = "de.cau.cs.kieler.verification.processors.SCChartsVerificationPropertyAnalyzer";
    protected var CompilationContext propertyAnalyzerContext
    
    protected var String verificationMustFailPattern
    
    new() {
        super(scchartsInjector)
    }
    
    override filter(TestModelData modelData) {
        return modelData.hasVerificationProperties
            && modelData.modelProperties.contains("ao-model")
            && modelData.modelProperties.contains("sccharts")
            && !modelData.modelProperties.contains("known-to-fail")
            && !modelData.modelProperties.contains("must-fail")
    }

    @Test
    def void testSpinVerification(SCCharts scc, TestModelData modelData) {
        verificationSystemId = "de.cau.cs.kieler.sccharts.verification.spin"
        initialize(scc, modelData)
    }
    
//    @Test
//    def void testNuxmvVerification(SCCharts scc, TestModelData modelData) {
//        verificationSystemId = "de.cau.cs.kieler.sccharts.verification.nuxmv"
//        initialize(scc, modelData)
//    }
    
    private def void initialize(SCCharts scc, TestModelData modelData) {
        verificationMustFailPattern = modelData.additionalProperties.get(MUST_FAIL_PATTERN_KEY)
        // Get verification properties
        propertyAnalyzerContext = runPropertyAnalyzer(propertyAnalyzerProcessorId, scc)
        verificationProperties = propertyAnalyzerContext.startEnvironment.getProperty(Environment.VERIFICATION_PROPERTIES) as List<VerificationProperty>
        verificationAssumptions= propertyAnalyzerContext.startEnvironment.getProperty(Environment.VERIFICATION_ASSUMPTIONS) as List<VerificationAssumption>
    }
    
    private def CompilationContext runPropertyAnalyzer(String processorId, EObject model) {
        val compilationSystem = CompilationSystem.createCompilationSystem(processorId, #[processorId])
        val context = Compile.createCompilationContext(compilationSystem, model)
        context.compile
        if(context.hasErrors) {
            val exception = context.allErrors.get(0).exception
            throw exception
        }
        return context
    }
    
    override configureContext(CompilationContext verificationContext) {
        // Add options
        verificationContext.startEnvironment.setProperty(Environment.CREATE_COUNTEREXAMPLES_WITH_OUTPUTS, createCounterexampleWithOutputs)
        
        // Add nuXmv options
        verificationContext.startEnvironment.setProperty(Environment.SMV_USE_IVAR, smvUseIVAR)
        
        verificationContext.startEnvironment.setProperty(Environment.CUSTOM_INTERACTIVE_SMV_INVAR_COMMANDS, customSmvInvarCommandsList)
        verificationContext.startEnvironment.setProperty(Environment.CUSTOM_INTERACTIVE_SMV_LTL_COMMANDS, customSmvLtlCommandsList)
        verificationContext.startEnvironment.setProperty(Environment.CUSTOM_INTERACTIVE_SMV_CTL_COMMANDS, customSmvCtlCommandsList)
        
        // Add spin options
        verificationContext.startEnvironment.setProperty(Environment.CUSTOM_SPIN_COMMANDS, customSpinCommandsList)
        
        // Add observer for changed properties
        verificationContext.addObserver[ Observable o, Object arg |
            if(arg instanceof VerificationPropertyChanged) {
                onVerificationPropertyChanged(arg)
            } else if(arg instanceof CompilationFinished) {
                onVerificationFinished(arg)
            }
        ]
    }
    
    def void onVerificationPropertyChanged(VerificationPropertyChanged event) {
        val property = event.changedProperty
        switch(property.status) {
            case VerificationPropertyStatus.PASSED : {
                println('''Property '«property.name»' PASSED''')
            }
            
            case VerificationPropertyStatus.FAILED : {
                var shouldFail = false
                if(verificationMustFailPattern !== null) {
                    shouldFail = property.name.matches(verificationMustFailPattern)
                }
                if (!shouldFail) {
                    fail('''Verification Property "«property.name»" FAILED''')
                } else {
                    println('''Verification Property "«property.name»" failed as intended''')
                }
            }
            
            case VerificationPropertyStatus.RUNNING : {
                println('''VerificationProperty "«property.name»": «property.runningTaskDescription»''')
            }
            
            case VerificationPropertyStatus.EXCEPTION : {
                println('''VerificationProperty "«property.name»" had issues''')
                fail(property.cause.toString)
            }
            default : {
                // Don't care
            }
        }
    }
    
    def void onVerificationFinished(CompilationFinished event) {
        verificationContext = null
    }
 
    protected def List<String> getCustomSmvInvarCommandsList() {
        #[]
    }
    
    protected def List<String> getCustomSmvLtlCommandsList() {
        #[]
    }
    
    protected def List<String> getCustomSmvCtlCommandsList() {
        #[]
    }
    
    protected def List<String> getCustomSpinCommandsList() {
        #[]
    }
    
    protected def boolean getCreateCounterexampleWithOutputs() {
        return false
    }
    
    protected def boolean getSmvUseIVAR() {
        return false
    }
}