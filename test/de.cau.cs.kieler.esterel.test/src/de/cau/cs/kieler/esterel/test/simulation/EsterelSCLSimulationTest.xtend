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

import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.EsterelStandaloneSetup
import de.cau.cs.kieler.prom.build.RegisterVariablesFinder
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
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.Platform
import org.junit.Test
import org.junit.runner.RunWith

import static de.cau.cs.kieler.prom.build.RegisterVariablesFinder.*
import static org.junit.Assert.*
import static org.junit.Assume.*

/**
 * Tests if all sensible intermediate results of the Esterel to SCL compilation fullfill basic sanity properties.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class EsterelSCLSimulationTest extends AbstractXTextModelRepositoryTest<EsterelProgram> implements SimulationListener {
    
    /** Sct Parser Injector */
    static val esterelInjector = new EsterelStandaloneSetup().createInjectorAndDoEMFRegistration
    /** Error in simulation */
    var TraceMismatchEvent traceError = null
    /** stop flag for simulation */
    var boolean traceFinished = false    
    //-----------------------------------------------------------------------------------------------------------------
    
    /**
     * Constructor
     */
    new() {
        super(esterelInjector)
    }
    
    /**
     * {@inheritDoc}
     */
    override filter(TestModelData modelData) {
        return !modelData.tracePaths.empty
        && modelData.tracePaths.exists[fileName.toString.endsWith("eso") || fileName.toString.endsWith("ktrace")]
        && modelData.modelProperties.contains("esterel")
        && !modelData.modelProperties.contains("known-to-fail") // TODO Test them anyway?
        && !modelData.modelProperties.contains("must-fail")
        && !modelData.modelProperties.contains("simulation-fails")
    }
    
    @Test//(timeout=60000)
    def void testSimulation(EsterelProgram est, TestModelData modelData) {
        assumeFalse(true); // Do nothing !!
        
        traceError = null
        // Assert that sccharts prom is loaded. Only then the SCChartsAnalyser is registered and the executable provides an interface
        assertTrue("Plugin 'de.cau.cs.kieler.esterel.prom' is not loaded but required for Esterel simulation", Platform.getBundle("de.cau.cs.kieler.esterel.prom") !== null)
        
        // Don't communicate register variables, because this is not needed for the tests and significantly slower
        RegisterVariablesFinder.enabled = false
        // Custom backend that compiles from sctx to c without transition signaling.
        val simBackend = new CSimulationBackend() {
            override getBuildConfigOrigin() {
                return "platform:/plugin/de.cau.cs.kieler.esterel.test/resources/esterel-test.kibuild"
            }
        }
        
        val context = new SimulationContext
        SimulationContext.setDeleteTemporaryProject(false)
        context.simulationBackend = simBackend
        context.overwriteCompileChain = false
        // Setup simulation project
        val IProject project = context.temporaryProject
        try {
            // Build the simulation executable
            try {
                context.compileModelForSimulation(est)
            } catch (Exception e) {
                fail(e.message)
            }
            assertTrue("Build failed to create executable", !context.executableFiles.isNullOrEmpty)
            
            // In the following, the compiled executable simulation for the model has been created successfully

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
    
    //-----------------------------------------------------------------------------------------------------------------
    
    override update(SimulationEvent e) {
        if (e instanceof TraceMismatchEvent) {
            traceError = e
        } else if (e instanceof TraceFinishedEvent) {
            traceFinished = true
        }
    }
    
    override getName() {
        return class.simpleName
    }
      
}
														