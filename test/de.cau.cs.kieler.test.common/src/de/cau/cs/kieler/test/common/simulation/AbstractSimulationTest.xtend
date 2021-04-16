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
package de.cau.cs.kieler.test.common.simulation

import com.google.common.io.Files
import com.google.inject.Injector
import de.cau.cs.kieler.core.Platform
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.deploy.ProjectInfrastructure
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.testing.TestModelData
import de.cau.cs.kieler.simulation.testing.TraceSimulation
import de.cau.cs.kieler.simulation.trace.TraceFileUtil
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import java.io.PrintWriter
import java.io.StringWriter
import org.eclipse.emf.ecore.EObject
import org.junit.runner.RunWith

import static org.junit.Assert.*
import de.cau.cs.kieler.core.properties.MapPropertyHolder
import de.cau.cs.kieler.core.properties.IPropertyHolder

/**
 * @author aas, als
 *
 */
@RunWith(ModelsRepositoryTestRunner)
abstract class AbstractSimulationTest<T extends EObject> extends AbstractXTextModelRepositoryTest<T> {
    
    /**
     * Constructor
     */
    new(Injector resourceSetInjector) {
        super(resourceSetInjector)
    }
    
    /**
     * Checks if the model data has an associated eso or ktrace file.
     */
    protected def boolean hasSimulationTrace(TestModelData modelData) {
        return !modelData.tracePaths.isEmpty
        && modelData.tracePaths.exists[fileName.toString.endsWith("eso") || fileName.toString.endsWith("ktrace")]
    }
    
    /**
     * Starts a simulation test of the model and the model data.
     */
    protected def void startSimulationTest(String system, EObject model, TestModelData modelData, String testID) {
        startSimulationTest(system, model, modelData, testID, null)
    }
    
    /**
     * Starts a simulation test of the model and the model data with an additinal environment configuration.
     */
    protected def void startSimulationTest(String system, EObject model, TestModelData modelData, String testID, IPropertyHolder properties ) {
        val ccontext = Compile.createCompilationContext(system, model)
        ccontext.startEnvironment.setProperty(Environment.INPLACE, true)
        ccontext.startEnvironment.setProperty(ProjectInfrastructure.TEMPORARY_PROJECT_NAME, 
            (if (!Platform.isWindows) this.class.simpleName + "-" else "") + testID
        )
        if (properties !== null) ccontext.startEnvironment.copyProperties(properties)
        val simContext = ccontext.createSimulationContext
        simContext.runSimulationTraces(modelData)
    }
    
    /**
     * Comopiles the simulation context from the given compilation context.
     */
    protected def SimulationContext createSimulationContext(CompilationContext ccontext) {
        // Compile
        ccontext.compile
      
        // Check all intermediate results
        for (iResult : ccontext.processorInstancesSequence) {
            // Check compiler errors
            if (!iResult.environment.errors.empty) {
                val msg = new StringBuilder
                msg.append("Error in compilation for simulation (").append(iResult.id).append("): \n")
                for (err : iResult.environment.errors.get(Environment.REPORT_ROOT)) {
                    msg.append("- ")
                    if (err.exception !== null) {
                        msg.append(((new StringWriter) => [err.exception.printStackTrace(new PrintWriter(it))]).toString())
                    } else {
                        msg.append(err.message)
                    }
                    msg.append("\n")
                }
                // Find logs
                if (iResult.environment.logs !== null && !iResult.environment.logs.files.empty) {
                    for (log : iResult.environment.logs.files) {
                        msg.append("Related log file ")
                        msg.append(log.fileName).append(":\n")
                        msg.append(log.code).append("\n")
                    }
                }
                
                fail(msg.toString)
            }
        }
        
        val result = ccontext.result?.model
        assertTrue("Simulation compilation did not produce a simulation context!", result instanceof SimulationContext)
        
        return result as SimulationContext            
    }    
    
    /**
     * Starts the simulation test with the traces in the test data.
     * If a trace mismatch occurs then the test fails.
     */
    private def void runSimulationTraces(SimulationContext context, TestModelData modelData) {
        // Prepare traces
        val traceFilePaths = modelData.tracePaths.filter[fileName.toString.endsWith("eso") || fileName.toString.endsWith("ktrace")].toList
        traceFilePaths.forEach[assertTrue("Could not find trace file " + it, it.toFile.isFile)]
        
        // We do not need a history for testing
        context.startEnvironment.setProperty(SimulationContext.MAX_HISTORY_LENGTH, 1)
        
        val runner = new TraceSimulation(context, traceFilePaths.map[TraceFileUtil.loadTraceFile(it.toFile)])        
        val result = runner.simulate()
        
        if (result.hasErrors) {
            fail("Error(s) in simulation: \n- " + result.errors.toList)
        }
        if (result.hasMismatches) {
            fail(result.mismatches.join("\n")[toString])
        }
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

}
			