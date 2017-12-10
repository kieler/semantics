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
package de.cau.cs.kieler.sccharts.test.c.simulation

import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.backends.CSimulationBackend
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.events.SimulationEvent
import de.cau.cs.kieler.simulation.core.events.SimulationListener
import de.cau.cs.kieler.simulation.handlers.TraceFinishedEvent
import de.cau.cs.kieler.simulation.handlers.TraceMismatchEvent
import de.cau.cs.kieler.simulation.trace.TraceDataProvider
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.TestModelData
import org.eclipse.core.internal.resources.ResourceException
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.Platform
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

/**
 * Tests all SCCharts compiled to C executables with their eso files.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class SCChartsNetlistSimulationTest extends AbstractXTextModelRepositoryTest<SCCharts> implements SimulationListener {
    
    /** Sct Parser Injector */
    static val resourceSetInjector = new SCTXStandaloneSetup().createInjectorAndDoEMFRegistration
    /** Error in simulation */
    var TraceMismatchEvent traceError = null
    /** stop flag for simulation */
    var boolean traceFinished = false
    
    //-----------------------------------------------------------------------------------------------------------------
    
    /**
     * Constructor
     */
    new() {
        super(resourceSetInjector)
    }
    
    /**
     * {@inheritDoc}
     */
    override filter(TestModelData modelData) {
        return !modelData.tracePaths.empty
        && modelData.tracePaths.exists[fileName.toString.endsWith("eso") || fileName.toString.endsWith("ktrace")]
        && modelData.modelProperties.contains("sccharts")
        && !modelData.modelProperties.contains("must-fail")
        && !modelData.modelProperties.contains("known-to-fail") // TODO Test them anyway?
        && !modelData.modelProperties.contains("not-asc")
        && !modelData.modelProperties.contains("not-sasc")
        && !modelData.modelProperties.contains("simulation-fails")
        && !modelData.additionalProperties.containsKey("c-simulation") // case: c-simulation = false
    }
    
    @Test
    def void testSimulation(SCCharts scc, TestModelData modelData) {
        traceError = null
        // Assert that sccharts prom is loaded. Only then the SCChartsAnalyser is registered and the executable provides an interface
        assertTrue("Plugin 'de.cau.cs.kieler.sccharts.prom' is not loaded but required for SCCharts simulation", Platform.getBundle("de.cau.cs.kieler.sccharts.prom") !== null)
        
        // Custom backend that compiles from sctx to c without additional frontend and transition signaling
        // and without communication of register variables.
        val simBackend = new CSimulationBackend() {
            override getBuildConfigOrigin() {
                return "platform:/plugin/de.cau.cs.kieler.sccharts.test/resources/sccharts-test.kibuild"
            }
        }
        
        val context = new SimulationContext
        SimulationContext.setDeleteTemporaryProject(false)
        context.simulationBackend = simBackend
        // Setup simulation project
        val project = context.temporaryProject
        try {
            // Build the simulation executable
            try {
                context.compileModelForSimulation(scc)
            } catch (Exception e) {
                fail(e.message)
            }
            assertTrue("Build failed to create executable", !context.executableFiles.isNullOrEmpty)
            
            // In the following, the compiled executable simulation for the model has been created successfully

            // Register for events
            SimulationManager.addListener(this)
            
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
            SimulationManager.removeListener(this)
            try {
                project?.delete(true, true, null)
            } catch(ResourceException e) {
                // There is maybe still a lock on the resource (Windows). Give it a little bit more time and try again.
                Thread.sleep(3000)
                project?.delete(true, true, null)
            }
        }
    }
    
    override update(SimulationEvent e) {
        if (e instanceof TraceMismatchEvent) {
            traceError = e
        } else if (e instanceof TraceFinishedEvent) {
            traceFinished = true
        }
    }
}
				