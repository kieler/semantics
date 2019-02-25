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
import de.cau.cs.kieler.verification.processors.LineBasedParser
import java.io.File
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
import java.nio.file.Files
import java.nio.file.StandardOpenOption
import java.io.IOException
import de.cau.cs.kieler.verification.processors.RunModelCheckerProcessorBase
import java.util.Locale
import java.text.DecimalFormat

/**
 * @author aas
 *
 */
@RunWith(ModelsRepositoryTestRunner)
class SCChartsVerificationBenchmark extends AbstractVerificationTest<SCCharts> {
    
    
    public static val scchartsInjector = SCTXStandaloneSetup.doSetup

    private static var File statisticsFile

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
    public final TestRule globalTimeout = Timeout.seconds(120);
    
    /**
     * Pattern to separate the test-method name and the model of the test-method.
     */
    private val METHOD_WITH_MODEL_PATTERN = Pattern.compile('''(.*) with model (.*)''')
    
    /**
     * Pattern to read the results of the /usr/bin/time command that is issued to measure the verification resources.
     * This pattern depends on the format string used with the time command (see RunModelCheckerProcessorBase)
     */
    private val TIME_RESULT_PATTERN = Pattern.compile('''elapsed time: (\d*.\d*) seconds, max memory in RAM: (\d+) KB''')
    private var String timeCommandResultLine
    private var Double timeCommandElapsedTime
    private var Integer timeCommandMaxMemoryInRAM
        
    /**
     * The currently checked property.
     * For the benchmark the properties are checked one after the other.
     */
    protected var VerificationProperty currentVerificationProperty
    
    protected var String currentVerificationSystemId
    
    // General verification options
    protected var createCounterexamples = false
    protected var createCounterexamplesWithOutputs = false
    
    // NuSMV / nuXmv verification options
    protected var boolean smvUseIVAR = false
    protected var List<String> customSmvInvarCommands = #[]
    protected var List<String> customSmvLtlCommands = #[]
    protected var List<String> customSmvCtlCommands = #[]
    
    // Options to skip certain properties in the verification
    protected var List<String> mustHaveModelProperties = #[]
    protected var List<String> mustNotHaveModelProperties = #[]
    protected var boolean ignoreInvar = false
    protected var boolean ignoreLtl = false
    protected var boolean ignoreCtl = false
    
    new() {
        super(scchartsInjector)
    }
    
    override filter(TestModelData modelData) { 
        val modelProperties = modelData.modelProperties
        return modelData.hasVerificationProperties
            && modelProperties.contains("verification-benchmark-aas-mt")
            && modelProperties.contains("sccharts")
            && !modelProperties.contains("known-to-fail")
            && !modelProperties.contains("must-fail")
    }

    @Test
    public def void nuxmv_defaultConfig(SCCharts scc, TestModelData modelData) {
        startNuxmvVerification(scc, modelData)
    }

    @Test
    public def void spin_defaultConfig(SCCharts scc, TestModelData modelData) {
        mustNotHaveModelProperties = #["unbounded-int", "ctl-specs"]
        startSpinVerification(scc, modelData)
    }
    
    protected def void startNuxmvVerification(SCCharts scc, TestModelData modelData) {
        initializeVerification(scc, modelData)
        currentVerificationSystemId = "de.cau.cs.kieler.sccharts.verification.nuxmv"
        startVerificationOfCurrentProperties()
    }
    
    protected def void startSpinVerification(SCCharts scc, TestModelData modelData) {
        initializeVerification(scc, modelData)
        currentVerificationSystemId = "de.cau.cs.kieler.sccharts.verification.spin"
        startVerificationOfCurrentProperties()
    }
    
    protected def void startVerificationOfCurrentProperties() {
        for (property : verificationProperties) {
            if (property.isIgnoredInBenchmark) {
                println('''Skipping VerificationProperty "«property.name»"''')
            } else {
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
        val fullyQualifiedTestPathString = getFullyQualifiedTestPath(currentVerificationProperty)
        val path = new Path(fullyQualifiedTestPathString.replace("/", "---"))
        // Create file handle for the path
        val workspaceRoot = ResourcesPlugin.getWorkspace.getRoot
        val project = workspaceRoot.getProject("-")
        val file = project.getFile(path)
        return file
    }
    
    override configureContext(CompilationContext verificationContext) {
        super.configureContext(verificationContext)
        
        // Add options
        verificationContext.startEnvironment.setProperty(Environment.CREATE_COUNTEREXAMPLES_WITH_OUTPUTS, createCounterexamplesWithOutputs)
        verificationContext.startEnvironment.setProperty(Environment.CREATE_COUNTEREXAMPLES_WITH_OUTPUTS, createCounterexamples)
        
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
        // Check must have modelProperties
        for(p : mustHaveModelProperties) {
            if(!verificationModelData.modelProperties.contains(p)) {
                return false
            }
        }
        // Check must NOT have modelProperties
        for(p : mustNotHaveModelProperties) {
            if(verificationModelData.modelProperties.contains(p)) {
                return false
            }
        }
        // Check property type
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
        val propertyName = currentVerificationProperty.name
        val modelFile = verificationModelData.modelFile
        
        // Get results of time command
        val processOutputFile = currentVerificationProperty.processOutputFile
        val lineBasedParser = new LineBasedParser() {
            override parseLine(String line) {
                val timeCommandMatcher = TIME_RESULT_PATTERN.matcher(line)
                if(timeCommandMatcher.matches) {
                    stopParsing = true
                    timeCommandResultLine = line
                    timeCommandElapsedTime = Double.valueOf( timeCommandMatcher.group(1) )
                    timeCommandMaxMemoryInRAM = Integer.valueOf( timeCommandMatcher.group(2) )
                }
            }
        }
        lineBasedParser.parse(processOutputFile)
        val maxMemInRamMB = timeCommandMaxMemoryInRAM / 1000.0
        
        // Get time needed to translate SCChart to model checker input.
        // The last processor is for running the model checker. The ones before are creating the code.
        var overallTimeNanons = 0l
        for(processor : currentVerificationContext.processorInstances) {
            if(!(processor instanceof RunModelCheckerProcessorBase)) {
                println("summing up "+processor)
                val env = processor.environment
                overallTimeNanons += env.getProperty(Environment.OVERALL_TIME)                
            } else {
                println("skipping "+processor)
            }
        }
        val codeGenTimeSecs = overallTimeNanons / 1000_000_000.0
        
        // Create combined statistics in CSV format
        val newStats = '''"«testMethodName»", "«modelFile»", "«propertyName»", "«codeGenTimeSecs.twoDigitsAfterComma»", "«timeCommandElapsedTime.twoDigitsAfterComma»", "«maxMemInRamMB.twoDigitsAfterComma»"'''
        
        // Append information to statistics file
        if(statisticsFile === null) {
            val workspaceRoot = ResourcesPlugin.getWorkspace.getRoot
            statisticsFile = new File('''«workspaceRoot.location.toOSString»/stats.csv''')
            // Overwrite existing file
            try {
                statisticsFile.delete    
            } catch(Exception e) {
                e.printStackTrace
            }
            statisticsFile.createNewFile
            // Add header line
            val statsHeader = '''"Test", "Model", "Property", "Code Gen Time (sec)", "Model Checking Time (sec)", "Model Checking Memory (MB)"'''
            appendToFile(statisticsFile, statsHeader+"\n")
        }
        appendToFile(statisticsFile, newStats+"\n")
    }
    
    private def String getFullyQualifiedTestPath(VerificationProperty property) {
        val path = '''«testMethodName»/«verificationModelData.modelFile»/«property.name»'''
        return path
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
    
    private def void appendToFile(File file, String text) {
        try {
            Files.write(statisticsFile.toPath, text.getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            e.printStackTrace
        }
    }
    
    private def String twoDigitsAfterComma(Double x) {
        return String.format(Locale.US, "%.2f", x)
    }
}