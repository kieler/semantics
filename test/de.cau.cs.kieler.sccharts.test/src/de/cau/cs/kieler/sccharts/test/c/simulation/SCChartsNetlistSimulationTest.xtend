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
import de.cau.cs.kieler.simulation.core.SimulationEvent
import de.cau.cs.kieler.simulation.core.SimulationEventType
import de.cau.cs.kieler.simulation.core.SimulationListener
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.StepAction
import de.cau.cs.kieler.simulation.handlers.ExecutableSimulator
import de.cau.cs.kieler.simulation.handlers.TraceFinishedEvent
import de.cau.cs.kieler.simulation.handlers.TraceHandler
import de.cau.cs.kieler.simulation.handlers.TraceMismatchEvent
import de.cau.cs.kieler.simulation.trace.TraceDataProvider
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.TestModelData
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.Platform
import org.junit.Test
import org.junit.runner.RunWith

import static de.cau.cs.kieler.simulation.StandaloneSimulationEnvironment.*
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
        
        // Setup simulation project
        val standaloneSim = createCSimulationEnvironment
        try {
            // Setup model file
            val modelFile = standaloneSim.project.getFile(modelData.modelPath.fileName.toString)
            modelFile.createLink(modelData.repositoryPath.resolve(modelData.modelPath).toUri, IResource.ALLOW_MISSING_LOCAL, null)
            standaloneSim.modelFile = modelFile
            
            // Build simulation code
            standaloneSim.build(scc)
            if (standaloneSim.buildResult.problems.exists[error]) {
                fail("Build problem(s) occured: \n- " + standaloneSim.buildResult.problems.filter[error].map[toString].join("\n- "))
            }
            assertTrue("Build failed to create executable", !standaloneSim.buildResult.createdFiles.isNullOrEmpty)

            // Register for events    
            SimulationManager.addListener(this)
            
            for (traceFilePath : modelData.tracePaths.filter[fileName.toString.endsWith("eso") || fileName.toString.endsWith("ktrace")]) {
                val traceFile = standaloneSim.project.getFile(traceFilePath.fileName.toString)
                traceFile.createLink(modelData.repositoryPath.resolve(traceFilePath).toUri, IResource.ALLOW_MISSING_LOCAL, null)
                assertTrue("Could not link to trace file", traceFile.exists)
                val trace = TraceDataProvider.loadTraceFile(traceFile)
                
                for (var i = 0; i < trace.traces.size; i++) {
                    traceFinished = false

                    // executable
                    val exeSimulator = new ExecutableSimulator
                    exeSimulator.executableFile = standaloneSim.buildResult.createdFiles.head
                    
                    // Create trace from eso file
                    val traceHandler = new TraceHandler()
                    traceHandler.tracePath.value = traceFile.fullPath.toOSString
                    traceHandler.traceNumber.value = i
                    
                    // Create new simulation with the trace
                    val sim = new SimulationManager
                    sim.addAction(StepAction.Method.WRITE, traceHandler)
                    sim.addAction(StepAction.Method.WRITE, exeSimulator)
                    sim.addAction(StepAction.Method.READ, traceHandler)
                    sim.initialize
                    
                    // Run simulation until end of trace
                    while(!traceFinished) {
                        SimulationManager.instance.stepMacroTick
                        if (traceError !== null) {
                            fail(traceError.message)
                        }
                    }
                }
            }
        } finally {
            SimulationManager.removeListener(this)
            standaloneSim?.project?.delete(true, true, null)
        }
        
    }
    
    override update(SimulationEvent e) {
        if (e.type == SimulationEventType.TRACE) {
            if (e instanceof TraceMismatchEvent) {
                traceError = e
            } else if (e instanceof TraceFinishedEvent) {
                traceFinished = true
            }
        }
    }
      
}
				