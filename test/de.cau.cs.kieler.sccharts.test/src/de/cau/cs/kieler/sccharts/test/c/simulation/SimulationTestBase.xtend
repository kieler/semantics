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
package de.cau.cs.kieler.sccharts.test.c.simulation

import com.google.common.io.Files
import de.cau.cs.kieler.prom.build.RegisterVariablesFinder
import de.cau.cs.kieler.prom.kibuild.extensions.KiBuildExtensions
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.backends.SimulationBackend
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.events.SimulationEvent
import de.cau.cs.kieler.simulation.core.events.SimulationListener
import de.cau.cs.kieler.simulation.handlers.TraceFinishedEvent
import de.cau.cs.kieler.simulation.handlers.TraceMismatchEvent
import de.cau.cs.kieler.simulation.trace.TraceDataProvider
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.TestModelData
import java.util.List
import org.eclipse.core.internal.resources.ResourceException
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.ecore.EObject
import org.junit.runner.RunWith

import static de.cau.cs.kieler.prom.build.RegisterVariablesFinder.*
import static org.junit.Assert.*

/**
 * @author aas
 *
 */
@RunWith(ModelsRepositoryTestRunner)
abstract class SimulationTestBase extends AbstractXTextModelRepositoryTest<SCCharts> implements SimulationListener {
    
    /** Extensions */
    protected extension static val KiBuildExtensions kiBuildExtensions = new KiBuildExtensions
    
    /** Sct Parser Injector */
    protected static val resourceSetInjector = new SCTXStandaloneSetup().createInjectorAndDoEMFRegistration

    /** Error in simulation */
    protected var TraceMismatchEvent traceError = null
    /** stop flag for simulation */
    protected var boolean traceFinished = false
    
    /** The simulation backend to be used */
    protected var SimulationBackend simulationBackend = createSimulationBackend
    
    //-----------------------------------------------------------------------------------------------------------------
    
    /**
     * Constructor
     */
    new() {
        super(resourceSetInjector)
        initialize
    }
    
    /**
     * Create the simulation backend (e.g. C or Java) to be used.
     */
    abstract protected def SimulationBackend createSimulationBackend()
    
    /**
     * Only return models for semantic SCCharts tests.
     */
    override filter(TestModelData modelData) {
        return filterForSimulationTests(modelData)
    }
    
    /**
     * Only return models for semantic SCCharts tests.
     */
    protected def boolean filterForSimulationTests(TestModelData modelData) {
        return !modelData.tracePaths.empty
        && modelData.tracePaths.exists[fileName.toString.endsWith("eso") || fileName.toString.endsWith("ktrace")]
        && modelData.modelProperties.contains("sccharts")
        && !modelData.modelProperties.contains("must-fail")
        && !modelData.modelProperties.contains("known-to-fail")
    }
    
    /**
     * Only return models for semantic SCCharts tests for netlist-based compilation.
     */
    protected def boolean filterForNetlistCompilationTests(TestModelData modelData) {
        return filterForSimulationTests(modelData)
        && !modelData.modelProperties.contains("not-asc")
        && !modelData.modelProperties.contains("not-sasc")
    }
    
    /**
     * Only return models for semantic SCCharts tests for priority-based compilation.
     */
    protected def boolean filterForPriorityCompilationTests(TestModelData modelData) {
        return filterForSimulationTests(modelData)
        && !modelData.modelProperties.contains("not-iasc")
    }
    
    /**
     * Returns a simulation context that is optimized for semantic simulation tests.
     */
    protected def SimulationContext createSimulationContext() {
        val context = new SimulationContext
        context.simulationBackend = simulationBackend
        return context
    }
    
    /**
     * Configure general simulation properties.
     */
    protected def initialize() {
        // Assert that sccharts prom is loaded. Only then the SCChartsAnalyser is registered and the executable provides an interface
        assertTrue("Plugin 'de.cau.cs.kieler.sccharts.prom' is not loaded but required for SCCharts simulation",
                   Platform.getBundle("de.cau.cs.kieler.sccharts.prom") !== null)
        // Don't communicate register variables because there is no need to go back in the history
        RegisterVariablesFinder.enabled = false
        // Don't delete the temporary simulation project, because this would require its re-initialization
        SimulationContext.setDeleteTemporaryProject(false)
    }
    
    /**
     * Starts a simulation test of the model and the model data.
     * If the compile chain is not null, the compile chain of the build config will be overwritten to use this instead.
     */
    protected def void startSimulationTest(List<String> compileChain, SCCharts scc, TestModelData modelData) {
        if(compileChain !== null) {
            simulationBackend.buildConfig.setModelCompilerAttributeToStringList("compileChain", compileChain)    
        }
        val context = createSimulationContext
        context.customCompileChain = compileChain.join(",")
        compileModelAndStartSimulationTest(context, scc, modelData)
    }
    
    /**
     * Checks if the model data has the given attribute
     * and, if so, prints a message that the test is known to fail.
     */
    protected def boolean isKnownToFail(TestModelData modelData, String knownToFailProperty) {
        // Check if all models in this directory are known to fail
        var knownToFail = modelData.modelProperties.contains(knownToFailProperty)
        if(!knownToFail) {
            // Check if there are some specific models that are known to fail
            val failingModelsCSV = modelData.additionalProperties.get(knownToFailProperty)
            if(!failingModelsCSV.isNullOrEmpty) {
                val failingModels = failingModelsCSV.replaceAll("\\s*", "").split(",")
                if(!failingModels.isNullOrEmpty) {
                    val fileBasename = Files.getNameWithoutExtension(modelData.modelFileBasename)
                    for(m : failingModels) {
                        if(m == fileBasename) {
                            knownToFail = true
                        }
                    }
                }
            }
        }
        if(knownToFail) {
            System.err.println("Warning: Skipping known-to-fail test '" + modelData.modelPath + "' (property '" + knownToFailProperty + "'):")
        }
        return knownToFail
    }
    
    /**
     * Compiles the given model for compilation and starts the simulation test with the traces in the test data.
     * If the compilation fails or does not generate a new executable then the test fails.
     */
    protected def void compileModelAndStartSimulationTest(SimulationContext context, EObject model, TestModelData modelData) {
        // Build the simulation executable
        try {
            context.compileModelForSimulation(model)
        } catch (Exception e) {
            fail(e.message)
        }
        assertFalse("Build failed to create executable", context.executableFiles.isNullOrEmpty)
        // In the following, the compiled executable simulation for the model has been created successfully
        startSimulationTest(context, modelData)
    }
    
    /**
     * Starts the simulation test with the traces in the test data.
     * If a trace mismatch occurs then the test fails.
     */
    protected def void startSimulationTest(SimulationContext context, TestModelData modelData) {
        traceError = null
        val project = context.temporaryProject
        try {
            // Register for events
            SimulationManager.add(this)
            
            // Iterate over trance files and run each
            for (traceFilePath : modelData.tracePaths.filter[fileName.toString.endsWith("eso") || fileName.toString.endsWith("ktrace")]) {
                val traceFile = project.getFile(traceFilePath.fileName.toString)
                traceFile.createLink(modelData.repositoryPath.resolve(traceFilePath).toUri, IResource.ALLOW_MISSING_LOCAL, null)
                assertTrue("Could not link to trace file", traceFile.exists)
                val trace = TraceDataProvider.loadTraceFile(traceFile)
                
                // Run each trace in the trace file
                for (var i = 0; i < trace.traces.size; i++) {
                    traceFinished = false

                    // Configure trace
                    context.traceFile = traceFile
                    context.traceNumber = i
                    // Start simulation
                    context.startSimulation
                    
                    // Run simulation until end of trace
                    val sim = SimulationManager.instance
                    while(!traceFinished) {
                        sim.stepMacroTick
                        if (traceError !== null) {
                            sim.stop
                            fail(traceError.message)
                        }
                    }
                    // Stop the simulation
                    sim.stop
                }
            }
        } finally {
            SimulationManager.remove(this)
            try {
                project?.delete(true, true, null)
            } catch(ResourceException e) {
                // There is maybe still a lock on the resource (Windows). Give it a little bit more time and try again.
                Thread.sleep(3000)
                project?.delete(true, true, null)
            }
        }
    }
    
    /**
     * Implementation of SimulationListener.
     * Looks for trace mismatches.
     */
    override update(SimulationEvent e) {
        if (e instanceof TraceMismatchEvent) {
            traceError = e
        } else if (e instanceof TraceFinishedEvent) {
            traceFinished = true
        }
    }
    
    /**
     * Implementation of SimulationListener.
     * Returns the name of this listener.
     */
    override getName() {
        return class.simpleName
    }
}