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

import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.TestModelData
import de.cau.cs.kieler.verification.VerificationContext
import de.cau.cs.kieler.verification.VerificationProperty
import de.cau.cs.kieler.verification.VerificationPropertyChanged
import de.cau.cs.kieler.verification.VerificationPropertyStatus
import de.cau.cs.kieler.verification.processors.LineBasedParser
import de.cau.cs.kieler.verification.processors.RunModelCheckerProcessorBase
import de.cau.cs.kieler.verification.processors.nuxmv.RunSmvProcessor
import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.StandardOpenOption
import java.util.List
import java.util.Locale
import java.util.regex.Pattern
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestName
import org.junit.rules.TestRule
import org.junit.rules.Timeout
import org.junit.runner.RunWith
import org.junit.runners.model.TestTimedOutException
import de.cau.cs.kieler.test.common.repository.ModelsRepository
import java.nio.file.Paths
import java.util.Map
import java.util.Collections

/**
 * @author aas
 *
 */
@RunWith(ModelsRepositoryTestRunner)
class SCChartsVerificationBenchmark extends AbstractSCChartsVerificationTest {
    
    
    public static val scchartsInjector = SCTXStandaloneSetup.doSetup

    private static var File statisticsFile

    private static var boolean isInitialWarmupDone

    /**
     * Holds the name of the test-method that is executed by JUnit
     */
    @Rule
    public TestName testName = new TestName();
    
    /**
     * Timeout for tests.
     * The verification is canceled in an @After method to kill the model checking process if needed.
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
    private var Integer timeCommandMaxMemoryInRamKB
    private var Double timeCommandMaxMemoryInRamMB
    
    private var Double codeGenTimeSecs
    
    private var Boolean failedToProve
    private var Boolean timedOut
    
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
    
    protected var int maxSmvIterations = 150
    
    // Spin verification options
    protected var List<String> customSpinCommands = #["-m100000"]
    
    // Options to skip certain properties in the verification
    protected var List<String> mustHaveModelProperties = #[]
    protected var List<String> mustNotHaveModelProperties = #[]
    protected var boolean ignoreInvar = false
    protected var boolean ignoreLtl = false
    protected var boolean ignoreCtl = false
    
    new() {
        super(scchartsInjector)
    }
    
    //////////////////////////////////////////////////////////////////////
    // nuXmv - go (invar)
    //////////////////////////////////////////////////////////////////////
    @Test
    public def void nuxmv_go_check_invar(SCCharts scc, TestModelData modelData) {
        prepareNuxmvInvarTest( #['''go''', '''check_invar -P «smvPropertyPlaceholder»'''] )
        mustNotHaveModelProperties = #["unbounded-int"]
        startNuxmvVerification(scc, modelData)
    }
    
    @Test
    public def void nuxmv_go_check_invar_inc_coi_bdd(SCCharts scc, TestModelData modelData) {
        prepareNuxmvInvarTest( #['''go''', '''check_invar_inc_coi_bdd -P «smvPropertyPlaceholder»'''] )
        mustNotHaveModelProperties = #["unbounded-int"]
        startNuxmvVerification(scc, modelData)
    }
    
//    public def void nuxmv_go_check_invar_guided(SCCharts scc, TestModelData modelData) {
//        customSmvInvarCommands =  #['''go''', '''check_invar_guided -P «smvPropertyPlaceholder»''']
//        mustNotHaveModelProperties = #["unbounded-int"]
//        ignoreLtl = true
//        ignoreCtl = true
//        startNuxmvVerification(scc, modelData)
//    }
    
//    public def void nuxmv_go_check_invar_inc_local(SCCharts scc, TestModelData modelData) {
//        prepareNuxmvInvarTest( #['''go''', '''check_invar_local -P «smvPropertyPlaceholder»'''] )
//        mustNotHaveModelProperties = #["unbounded-int"]
//        startNuxmvVerification(scc, modelData)
//    }
    
    //////////////////////////////////////////////////////////////////////
    // nuXmv - go (ltl)
    //////////////////////////////////////////////////////////////////////
    @Test
    public def void nuxmv_go_check_ltlspec(SCCharts scc, TestModelData modelData) {
        prepareNuxmvLtlTest( #['''go''', '''check_ltlspec -P «smvPropertyPlaceholder»'''] )
        mustNotHaveModelProperties = #["unbounded-int"]
        startNuxmvVerification(scc, modelData)
    }
    
    @Test
    public def void nuxmv_go_check_ltlspec_inc_coi_bdd(SCCharts scc, TestModelData modelData) {
        prepareNuxmvLtlTest( #['''go''', '''check_ltlspec_inc_coi_bdd -P «smvPropertyPlaceholder»'''] )
        mustNotHaveModelProperties = #["unbounded-int"]
        startNuxmvVerification(scc, modelData)
    }
    
    @Test
    public def void nuxmv_go_check_ltlspec_simplify(SCCharts scc, TestModelData modelData) {
        prepareNuxmvLtlTest( #['''go''', '''check_ltlspec_simplify -P «smvPropertyPlaceholder»'''] )
        mustNotHaveModelProperties = #["unbounded-int"]
        startNuxmvVerification(scc, modelData)
    }
    
//    public def void nuxmv_go_check_ltlspec_compositional(SCCharts scc, TestModelData modelData) {
//        prepareNuxmvLtlTest( #['''go''', '''check_ltlspec_compositional -t bdd -P «smvPropertyPlaceholder»'''] )
//        mustNotHaveModelProperties = #["unbounded-int"]
//        startNuxmvVerification(scc, modelData)
//    }
    
    //////////////////////////////////////////////////////////////////////
    // nuXmv - go_bmc (invar)
    //////////////////////////////////////////////////////////////////////
//    @Test
    // Bad performance already in aas-traffic-light
    public def void nuxmv_gobmc_check_invar_bmc(SCCharts scc, TestModelData modelData) {
//        prepareNuxmvInvarTest( #['''go_bmc''', '''check_invar_bmc -P «smvPropertyPlaceholder»'''] )
        prepareNuxmvInvarTest( #['''go_bmc''', '''check_invar_bmc -a een-sorensson -k «maxSmvIterations» -P «smvPropertyPlaceholder»'''] )
        mustNotHaveModelProperties = #["unbounded-int"]
        startNuxmvVerification(scc, modelData)
    }
    
//    @Test
    public def void nuxmv_gobmc_check_invar_bmc_inc(SCCharts scc, TestModelData modelData) {
        prepareNuxmvInvarTest( #['''go_bmc''', '''check_invar_bmc_inc -k «maxSmvIterations» -P «smvPropertyPlaceholder»'''] )
        mustNotHaveModelProperties = #["unbounded-int"]
        startNuxmvVerification(scc, modelData)
    }
    
//    @Test
    public def void nuxmv_gobmc_check_invar_ic3(SCCharts scc, TestModelData modelData) {
        prepareNuxmvInvarTest( #['''go_bmc''', '''check_invar_ic3 -P «smvPropertyPlaceholder»'''] )
        mustNotHaveModelProperties = #["unbounded-int"]
        startNuxmvVerification(scc, modelData)
    }
    
//    @Test
    public def void nuxmv_gobmc_check_invar_inc_coi_bmc(SCCharts scc, TestModelData modelData) {
        prepareNuxmvInvarTest( #['''go_bmc''', '''check_invar_inc_coi_bmc -k «maxSmvIterations» -P «smvPropertyPlaceholder»'''] )
        mustNotHaveModelProperties = #["unbounded-int"]
        startNuxmvVerification(scc, modelData)
    }
    
    // Gives counterexample claiming that (o==false||o==true) is false although o is a boolean
//    public def void nuxmv_gobmc_check_invar_bmc_itp(SCCharts scc, TestModelData modelData) {
//        prepareNuxmvInvarTest( #['''go_bmc''', '''check_invar_bmc_itp -k «maxSmvIterations» -P «smvPropertyPlaceholder»'''] )
//        mustNotHaveModelProperties = #["unbounded-int"]
//        startNuxmvVerification(scc, modelData)
//    }
    
    //////////////////////////////////////////////////////////////////////
    // nuXmv - go_bmc (ltl)
    //////////////////////////////////////////////////////////////////////
//    @Test    
    // Failed already in aas-traffic-light
    public def void nuxmv_gobmc_check_ltlspec_bmc(SCCharts scc, TestModelData modelData) {
        prepareNuxmvLtlTest( #['''go_bmc''', '''check_ltlspec_bmc -k «maxSmvIterations» -P «smvPropertyPlaceholder»'''] )
        mustNotHaveModelProperties = #["unbounded-int"]
        startNuxmvVerification(scc, modelData)
    }
    
//    @Test
    // Failed already in aas-traffic-light
    public def void nuxmv_gobmc_check_ltlspec_bmc_inc(SCCharts scc, TestModelData modelData) {
        prepareNuxmvLtlTest( #['''go_bmc''', '''check_ltlspec_bmc_inc -k «maxSmvIterations» -P «smvPropertyPlaceholder»'''] )
        mustNotHaveModelProperties = #["unbounded-int"]
        startNuxmvVerification(scc, modelData)
    }
    
//    @Test
    // Failed already in aas-traffic-light
    public def void nuxmv_gobmc_check_ltlspec_inc_coi_bmc(SCCharts scc, TestModelData modelData) {
        prepareNuxmvLtlTest( #['''go_bmc''', '''check_ltlspec_inc_coi_bmc -k «maxSmvIterations» -P «smvPropertyPlaceholder»'''] )
        mustNotHaveModelProperties = #["unbounded-int"]
        startNuxmvVerification(scc, modelData)
    }
    
//    @Test
    public def void nuxmv_gobmc_check_ltlspec_klive(SCCharts scc, TestModelData modelData) {
        prepareNuxmvLtlTest( #['''go_bmc''', '''check_ltlspec_klive -P «smvPropertyPlaceholder»'''] )
        mustNotHaveModelProperties = #["unbounded-int"]
        startNuxmvVerification(scc, modelData)
    }
    
//    @Test
    // Failed already in aas-traffic-light
    public def void nuxmv_gobmc_check_ltlspec_sbmc(SCCharts scc, TestModelData modelData) {
        prepareNuxmvLtlTest( #['''go_bmc''', '''check_ltlspec_sbmc -k «maxSmvIterations» -P «smvPropertyPlaceholder»'''] )
        mustNotHaveModelProperties = #["unbounded-int"]
        startNuxmvVerification(scc, modelData)
    }
    
//    @Test
    // Failed already in aas-traffic-light
    public def void nuxmv_gobmc_check_ltlspec_sbmc_inc(SCCharts scc, TestModelData modelData) {
        prepareNuxmvLtlTest( #['''go_bmc''', '''check_ltlspec_sbmc_inc -k «maxSmvIterations» -P «smvPropertyPlaceholder»'''] )
        mustNotHaveModelProperties = #["unbounded-int"]
        startNuxmvVerification(scc, modelData)
    }
    
//    public def void nuxmv_gobmc_check_ltlspec_bmc_onepb(SCCharts scc, TestModelData modelData) {
//        prepareNuxmvLtlTest( #['''go_bmc''', '''check_ltlspec_bmc_onepb -P «smvPropertyPlaceholder»'''] )
//        mustNotHaveModelProperties = #["unbounded-int"]
//        startNuxmvVerification(scc, modelData)
//    }
    
    //////////////////////////////////////////////////////////////////////
    // nuXmv - go_msat (invar)
    //////////////////////////////////////////////////////////////////////
    
    @Test
    // Gives the answer for a property where o is replaced by its definition (in ao.smv)
    public def void nuxmv_gomsat_check_invar_cegar_predabs(SCCharts scc, TestModelData modelData) {
        prepareNuxmvInvarTest( #['''go_msat''', '''check_invar_cegar_predabs -P «smvPropertyPlaceholder»'''] )
        startNuxmvVerification(scc, modelData)
    }
    
    @Test
    // Failed already in aas-traffic-light
    public def void nuxmv_gomsat_msat_check_invar_bmc(SCCharts scc, TestModelData modelData) {
        prepareNuxmvInvarTest( #['''go_msat''', '''msat_check_invar_bmc -P «smvPropertyPlaceholder»'''] )
        startNuxmvVerification(scc, modelData)
    }
    
    @Test
    // Failed already in aas-traffic-light
    public def void nuxmv_gomsat_msat_check_invar_bmc_cegar_implabs(SCCharts scc, TestModelData modelData) {
        prepareNuxmvInvarTest( #['''go_msat''', '''msat_check_invar_bmc_cegar_implabs -k «maxSmvIterations» -P «smvPropertyPlaceholder»'''] )
        startNuxmvVerification(scc, modelData)
    }
    
    @Test
    // Failed already in aas-traffic-light
    public def void nuxmv_gomsat_msat_check_invar_bmc_implabs(SCCharts scc, TestModelData modelData) {
        prepareNuxmvInvarTest( #['''go_msat''', '''msat_check_invar_bmc_implabs -k «maxSmvIterations» -P «smvPropertyPlaceholder»'''] )
        startNuxmvVerification(scc, modelData)
    }
    
    @Test
    public def void nuxmv_gomsat_msat_check_invar_ic3(SCCharts scc, TestModelData modelData) {
        prepareNuxmvInvarTest( #['''go_msat''', '''build_boolean_model''', '''check_invar_ic3 -P «smvPropertyPlaceholder»'''] )
        mustNotHaveModelProperties = #["unbounded-int"]
        startNuxmvVerification(scc, modelData)
    }
    
    @Test
    public def void nuxmv_gomsat_msat_check_invar_ic3_infinite(SCCharts scc, TestModelData modelData) {
        prepareNuxmvInvarTest( #['''go_msat''', '''check_invar_ic3 -i -P «smvPropertyPlaceholder»'''] )
        mustHaveModelProperties = #["unbounded-int"]
        startNuxmvVerification(scc, modelData)
    }
    
    @Test
    // Bad performance already in aas-traffic-light
    public def void nuxmv_gomsat_msat_check_invar_inc_coi(SCCharts scc, TestModelData modelData) {
        prepareNuxmvInvarTest( #['''go_msat''', '''msat_check_invar_inc_coi -k «maxSmvIterations» -P «smvPropertyPlaceholder»'''] )
        startNuxmvVerification(scc, modelData)
    }
    
    //////////////////////////////////////////////////////////////////////
    // nuXmv - go_msat (ltl)
    //////////////////////////////////////////////////////////////////////
    
    @Test
    public def void nuxmv_gomsat_check_ltlspec_klive(SCCharts scc, TestModelData modelData) {
        prepareNuxmvLtlTest( #['''go_msat''', '''build_boolean_model''', '''check_ltlspec_klive -P «smvPropertyPlaceholder»'''] )
        mustNotHaveModelProperties = #["unbounded-int"]
        startNuxmvVerification(scc, modelData)
    }
    
    @Test
    public def void nuxmv_gomsat_check_ltlspec_klive_infinite(SCCharts scc, TestModelData modelData) {
        prepareNuxmvLtlTest( #['''go_msat''', '''check_ltlspec_klive -i -P «smvPropertyPlaceholder»'''] )
        mustHaveModelProperties = #["unbounded-int"]
        startNuxmvVerification(scc, modelData)
    }
    
    @Test
    // Failed already in aas-traffic-light
    public def void nuxmv_gomsat_msat_check_ltlspec_bmc(SCCharts scc, TestModelData modelData) {
        prepareNuxmvLtlTest( #['''go_msat''', '''msat_check_ltlspec_bmc -k «maxSmvIterations» -P «smvPropertyPlaceholder»'''] )
        startNuxmvVerification(scc, modelData)
    }
    
    @Test
    // Failed already in aas-traffic-light
    public def void nuxmv_gomsat_msat_check_ltlspec_inc_coi(SCCharts scc, TestModelData modelData) {
        prepareNuxmvLtlTest( #['''go_msat''', '''msat_check_ltlspec_inc_coi -k «maxSmvIterations» -P «smvPropertyPlaceholder»'''] )
        startNuxmvVerification(scc, modelData)
    }
    
//    @Test
    // Failed already in aas-traffic-light
    public def void nuxmv_gomsat_msat_check_ltlspec_sbmc_inc(SCCharts scc, TestModelData modelData) {
        prepareNuxmvLtlTest( #['''go_msat''', '''msat_check_ltlspec_sbmc_inc -k «maxSmvIterations» -P «smvPropertyPlaceholder»'''] )
        startNuxmvVerification(scc, modelData)
    }
    
    //////////////////////////////////////////////////////////////////////
    // SPIN
    //////////////////////////////////////////////////////////////////////
    @Test
    // Failed in modulo-3int-8bit-par
    public def void spin_bfs(SCCharts scc, TestModelData modelData) {
        mustNotHaveModelProperties = #["unbounded-int", "ctl-specs"]
        customSpinCommands = #["-bfs"]
        startSpinVerification(scc, modelData)
    }
    
    @Test
    // Failed in modulo-3int-8bit-par
    public def void spin_default(SCCharts scc, TestModelData modelData) {
        mustNotHaveModelProperties = #["unbounded-int", "ctl-specs"]
        startSpinVerification(scc, modelData)
    }
    
    //////////////////////////////////////////////////////////////////////
    // JUnit config
    //////////////////////////////////////////////////////////////////////
    @Before
    public def void printTestMethodName() {
        println('''////////////////////''')
        println('''////////// «testName.methodName» ''')
        println('''////////////////////''')
        println()
    }
    
    @Before
    public def void doInitialWarmupIfNotDoneYet() {
        if(!isInitialWarmupDone) {
            doInitialWarmup()
            isInitialWarmupDone = true
        }
    }
    
    //////////////////////////////////////////////////////////////////////
    // Other methods
    //////////////////////////////////////////////////////////////////////
    
    override filter(TestModelData modelData) { 
        val modelProperties = modelData.modelProperties
        return modelData.hasVerificationProperties
            && modelProperties.contains("verification-benchmark-aas-mt")
            && modelProperties.contains("sccharts")
            && !modelProperties.contains("known-to-fail")
            && !modelProperties.contains("must-fail")
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
    
    override configureContext(VerificationContext verificationContext) {
        super.configureContext(verificationContext)
        
        // Add options
        verificationContext.createCounterexamplesWithOutputs = createCounterexamplesWithOutputs
        verificationContext.createCounterexamples = createCounterexamples
        
        // Add SMV options
        verificationContext.smvUseIVAR = smvUseIVAR
        verificationContext.customInteractiveSmvInvarCommands = customSmvInvarCommands
        verificationContext.customInteractiveSmvLtlCommands = customSmvLtlCommands
        verificationContext.customInteractiveSmvCtlCommands = customSmvCtlCommands
        
        // Add Spin options
        verificationContext.customSpinCommands = customSpinCommands
    }
    
    override protected getVerificationSystemId() {
        return currentVerificationSystemId
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
                currentVerificationProperty = null
            } else {
                println('''Testing VerificationProperty "«property.name»"''')
                currentVerificationProperty = property
                startVerification( #[currentVerificationProperty], verificationAssumptions)    
//                recordStatistics()
                println()
            }
        }
    }
    
    protected def boolean isIgnoredInBenchmark(VerificationProperty property) {
        // Check must have modelProperties
        for(p : mustHaveModelProperties) {
            if(!verificationModelData.modelProperties.contains(p)) {
                return true
            }
        }
        // Check must NOT have modelProperties
        for(p : mustNotHaveModelProperties) {
            if(verificationModelData.modelProperties.contains(p)) {
                return true
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
    
    override onVerificationPropertyChanged(VerificationPropertyChanged event) {
        val property = event.changedProperty
        if(property.status == VerificationPropertyStatus.EXCEPTION) {
            failedToProve = true
            if(property.cause instanceof TestTimedOutException) {
                failedToProve = false
                timedOut = true
            }
        }
        super.onVerificationPropertyChanged(event)
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
    
    private def String getSmvPropertyPlaceholder() {
        return RunSmvProcessor.PROPERTY_NAME_PLACEHOLDER
    }
    
    @After
    public def void recordStatistics() {
        if(currentVerificationProperty === null) {
            return
        }
        
        val propertyName = currentVerificationProperty.name
        val modelFile = verificationModelData.modelFile
        
        // Get results of time command
        fetchStatisticsOfTimeCommand
        
        // Get time needed to translate SCChart to model checker input.
        // The last processor is for running the model checker. The ones before are creating the code.
        fetchStatisticsOfCodeGeneration
        
        // Create combined statistics in CSV format
        val newStats = '''"«testMethodName»", "«modelFile»", "«propertyName»", "«codeGenTimeSecs.twoDigitsAfterComma»", "«timeCommandElapsedTime.twoDigitsAfterComma»", "«timeCommandMaxMemoryInRamMB.twoDigitsAfterComma»", "«failedToProve.toCsvMarker»", "«timedOut.toCsvMarker»"'''
        
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
            val statsHeader = '''"Test", "Model", "Property", "Code Gen Time (sec)", "Model Checking Time (sec)", "Model Checking Memory (MB)", "Failed to Prove", "Timed Out"'''
            appendToFile(statisticsFile, statsHeader+"\n")
        }
        appendToFile(statisticsFile, newStats+"\n")
    }
    
    private def void fetchStatisticsOfTimeCommand() {
        timeCommandResultLine = null
        timeCommandElapsedTime = null
        timeCommandMaxMemoryInRamKB = null
        timeCommandMaxMemoryInRamMB = null
        val processOutputFile = currentVerificationProperty.processOutputFile
        if(processOutputFile === null || !processOutputFile.exists) {
            return
        }
        
        val lineBasedParser = new LineBasedParser() {
            override parseLine(String line) {
                val timeCommandMatcher = TIME_RESULT_PATTERN.matcher(line)
                if(timeCommandMatcher.matches) {
                    stopParsing = true
                    timeCommandResultLine = line
                    timeCommandElapsedTime = Double.valueOf( timeCommandMatcher.group(1) )
                    timeCommandMaxMemoryInRamKB = Integer.valueOf( timeCommandMatcher.group(2) )
                    timeCommandMaxMemoryInRamMB = timeCommandMaxMemoryInRamKB / 1000.0
                }
            }
        }
        lineBasedParser.parse(processOutputFile)
    }
    
    private def void fetchStatisticsOfCodeGeneration() {
        var overallTimeNanons = 0l
        for(processor : currentVerificationContext.processorInstances) {
            if(!(processor instanceof RunModelCheckerProcessorBase)) {
                val env = processor.environment
                overallTimeNanons += env.getProperty(Environment.OVERALL_TIME)                
            }
        }
        codeGenTimeSecs = overallTimeNanons / 1000_000_000.0
    }
    
    private def void appendToFile(File file, String text) {
        try {
            Files.write(statisticsFile.toPath, text.getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            e.printStackTrace
        }
    }
    
    private def String toCsvMarker(Boolean b) {
        if(b === null){
            return ""
        }
        return if(b) { "x" } else { "" }
    }
    
    private def String twoDigitsAfterComma(Double x) {
        if(x === null) {
            return ""
        }
        return String.format(Locale.US, "%.2f", x)
    }
    
    private def void prepareNuxmvLtlTest(List<String> ltlCommands) {
        customSmvLtlCommands = newArrayList(ltlCommands)
        ignoreInvar = true
        ignoreCtl = true
    }
    
    private def void prepareNuxmvInvarTest(List<String> invarCommands) {
        customSmvInvarCommands = newArrayList(invarCommands)
        ignoreLtl= true
        ignoreCtl = true
    }
    
    private def void doInitialWarmup() {
        // Use nuXmv and SPIN on some model before the tests are executed
        // to prevent a lag in the first test
        println(">>>>>>>>>> starting initial verification warmup")
        
        // Setup TestModelData for warmup model
        val relWarmupModelPathString =  "sccharts/verification/aas/benchmark/warmup.sctx"
        
        val repositoryPathString = System.getenv(ModelsRepository.MODELS_REPOSITORY_KEY)
        val repositoryPath = Paths.get(repositoryPathString)
        val relModelPath = Paths.get(relWarmupModelPathString)
        val modelData = new TestModelData(
            repositoryPath,
            relModelPath,
            Collections.EMPTY_LIST,
            null,
            #[relModelPath].toSet,
            #["verification-benchmark-aas-mt", "sccharts"].toSet,
            Collections.EMPTY_MAP,
            false
        )
        
        // Load the EObject from the model data
        val scc = loadModel(modelData)
        
        // Do some dummy verifications on the warmup model
        println(">>>>>>>>>> doing warmup of SMV")
        prepareNuxmvInvarTest( #['''go''', '''check_invar -P «smvPropertyPlaceholder»'''] )
        startNuxmvVerification(scc, modelData)
        
        println(">>>>>>>>>> doing warmup of SPIN")
        ignoreInvar = false
        ignoreLtl = false
        ignoreCtl = true
        mustNotHaveModelProperties = #["unbounded-int", "ctl-specs"]
        startSpinVerification(scc, modelData)
        
        println(">>>>>>>>>> initial verification warmup done")
    }
}