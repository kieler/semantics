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
import de.cau.cs.kieler.verification.VerificationProperty
import java.util.List
import java.util.regex.Pattern
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestName
import org.junit.rules.TestRule
import org.junit.rules.Timeout
import org.junit.runner.RunWith

/**
 * @author aas
 *
 */
@RunWith(ModelsRepositoryTestRunner)
class SCChartsVerificationBenchmark extends AbstractVerificationTest<SCCharts> {
    
    
    public static val scchartsInjector = SCTXStandaloneSetup.doSetup

    /**
     * Holds the name of the test-method that is executed by JUnit
     */
    @Rule
    public TestName testName = new TestName();
    
    /**
     * Timeout for tests.
     * The verification is canceled in an @AfterClass method to kill the model checking process if needed.
     */
    @Rule
    public final TestRule globalTimeout = Timeout.seconds(20);
    
    /**
     * Pattern to separate the test-method name and the model of the test-method.
     */
    private val METHOD_WITH_MODEL_PATTERN = Pattern.compile('''(.*) with model (.*)''')
    
    /**
     * The currently checked property.
     * For the benchmark the properties are checked one after the other.
     */
    protected var VerificationProperty currentVerificationProperty
    
    protected var String currentVerificationSystemId
    
    // General verification options
    protected var createCounterexampleWithOutputs = false
    
    // NuSMV / nuXmv verification options
    protected var boolean smvUseIVAR = false
    protected var List<String> customSmvInvarCommands = #[]
    protected var List<String> customSmvLtlCommands = #[]
    protected var List<String> customSmvCtlCommands = #[]
    
    // Options to skip certain properties in the verification
    protected var boolean ignoreInvar = false
    protected var boolean ignoreLtl = false
    protected var boolean ignoreCtl = false
    
    new() {
        super(scchartsInjector)
    }
    
    override filter(TestModelData modelData) {
        return modelData.hasVerificationProperties
            && modelData.modelProperties.contains("verification-benchmark-aas-mt")
            && modelData.modelProperties.contains("sccharts")
            && !modelData.modelProperties.contains("known-to-fail")
            && !modelData.modelProperties.contains("must-fail")
    }

    @Test
    public def void nuxmv_defaultConfig(SCCharts scc, TestModelData modelData) {
        startNuxmvVerification(scc, modelData)
    }

    @Test
    public def void nuxmv_defaultConfig_IVAR(SCCharts scc, TestModelData modelData) {
        smvUseIVAR = true
        
        startNuxmvVerification(scc, modelData)
    }
    
    protected def void startNuxmvVerification(SCCharts scc, TestModelData modelData) {
        initializeVerification(scc, modelData)
        
        currentVerificationSystemId = "de.cau.cs.kieler.sccharts.verification.nuxmv"
        
        for (property : verificationProperties) {
            if (!property.isIgnoredInBenchmark) {
                println('''Testing VerificationProperty "«property.name»"''')
                currentVerificationProperty = property
                startVerification(#[currentVerificationProperty], verificationAssumptions)
                recordStatistics()
                println()
            }
        }
    }
    
    override getVerificationModelFileHandle() {
        // Construct path such that the benchmark configuration makes it unique
        // and the resulting files are not overwritten by following test executions
        val testMethod = getTestMethodName
        val propertyName = currentVerificationProperty.name
        val pathString = '''«testMethod»---«verificationModelData.modelFile»---«propertyName»'''
        val path = new Path(pathString)
        // Create file handle for the path
        val workspaceRoot = ResourcesPlugin.getWorkspace.getRoot
        val project = workspaceRoot.getProject("-")
        val file = project.getFile(path)
        return file
    }
    
    override configureContext(CompilationContext verificationContext) {
        super.configureContext(verificationContext)
        
        // Add options
        verificationContext.startEnvironment.setProperty(Environment.CREATE_COUNTEREXAMPLES_WITH_OUTPUTS, createCounterexampleWithOutputs)
        
        // Add SMV options
        verificationContext.startEnvironment.setProperty(Environment.SMV_USE_IVAR, smvUseIVAR)
        verificationContext.startEnvironment.setProperty(Environment.CUSTOM_INTERACTIVE_SMV_INVAR_COMMANDS, customSmvInvarCommands)
        verificationContext.startEnvironment.setProperty(Environment.CUSTOM_INTERACTIVE_SMV_LTL_COMMANDS, customSmvLtlCommands)
        verificationContext.startEnvironment.setProperty(Environment.CUSTOM_INTERACTIVE_SMV_CTL_COMMANDS, customSmvCtlCommands)
    }
    
    override getPropertyAnalyzerProcessorId() {
        return "de.cau.cs.kieler.verification.processors.SCChartsVerificationPropertyAnalyzer" 
    }
    
    override protected getVerificationSystemId() {
        return currentVerificationSystemId
    }
    
    protected def boolean isIgnoredInBenchmark(VerificationProperty property) {
        switch(property.type) {
            case INVARIANT: {
                return ignoreInvar
            }
            case CTL: {
                // IVAR variables cannot be used in CTL properties
                return ignoreCtl || smvUseIVAR
            }
            case LTL: {
                return ignoreLtl
            }
        }
    }
    
    @Before
    public def void printTestMethodName() {
        println('''////////////////////''')
        println('''////////// «testName.methodName» ''')
        println('''////////////////////''')
        println()
    }
    
    private def void recordStatistics() {
        
    }
    
    private def String getTestMethodName() {
        val methodWithModel = testName.methodName
        val methodWithModelMatcher = METHOD_WITH_MODEL_PATTERN.matcher(methodWithModel)
        if(methodWithModelMatcher.matches) {
            val method = methodWithModelMatcher.group(1)            
            return method
        } else {
            return methodWithModel
        }
    }
}