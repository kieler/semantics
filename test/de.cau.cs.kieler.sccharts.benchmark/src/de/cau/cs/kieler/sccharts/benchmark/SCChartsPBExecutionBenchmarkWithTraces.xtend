/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.benchmark

import com.google.inject.Inject
import de.cau.cs.kieler.benchmark.common.AbstractXTextModelBenchmark
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.simulation.SimulationUtil
import de.cau.cs.kieler.simulation.core.SimulationEvent
import de.cau.cs.kieler.simulation.core.SimulationEventType
import de.cau.cs.kieler.simulation.core.SimulationListener
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.StepAction
import de.cau.cs.kieler.simulation.handlers.EsoUtil
import de.cau.cs.kieler.simulation.handlers.ExecutableSimulator
import de.cau.cs.kieler.simulation.handlers.Trace
import de.cau.cs.kieler.simulation.handlers.TraceFinishedEvent
import de.cau.cs.kieler.simulation.handlers.TraceMismatchEvent
import de.cau.cs.kieler.test.common.repository.TestModelData
import java.util.LinkedList
import org.bson.Document
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.Path
import java.util.List

/**
 * @author lpe
 *
 */
class SCChartsPBExecutionBenchmarkWithTraces extends AbstractXTextModelBenchmark<State> implements SimulationListener {
    
    @Inject
    extension SCGThreadExtensions
    
    // List of all transformations
    // in an order that respects dependencies.
    private val transformations = newArrayList(
                                    "REFERENCE",        // Expansion
                                    "CONST",
                                    "MAP",
                                    "FOR",
        
                                    "HISTORY",          // SCADE / QUARTZ / Esterel
                                    "WEAKSUSPEND",
                                    "STATIC",
                                    "DEFERRED",
                                    
                                    "SIGNAL",           // SyncCharts
                                    "SUSPEND",
                                    "PRE",
                                    "COUNTDELAY",
                                    
                                    "DURING",           // Statecharts
                                    "COMPLEXFINALSTATE",
                                    "ABORT",
                                    "INITIALIZATION",
                                    "EXIT",
                                    "ENTRY",
                                    "CONNECTOR",
                                    
                                    "TRIGGEREFFECT",    // CORE
                                    "SURFACEDEPTH",
                                    
                                    "sccharts.scg",     // SCG and Code Creation
                                    "scg.dependency",
                                    "scg.scgPrio",
                                    "sclp.sclpTrans")
    
    /** Warm up flag */
    private static var warmUp = false
    
    private final val NUMBER_OF_RUNS = 10
    
    private final val N_BEST = 0.8
    
    var boolean traceFinished = false
    
    var TraceMismatchEvent traceError = null
    
    //-----------------------------------------------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    override getID() {
        return "sccharts-priority-based-execution-traces"
    }
    
    /**
     * {@inheritDoc}
     */
    override filter(TestModelData modelData) {
        return modelData.modelProperties.contains("benchmark") && !modelData.modelProperties.contains("must-fail")
                && !modelData.modelProperties.contains("known-to-fail") && !modelData.modelProperties.contains("not-siasc")
                && modelData.tracePaths.exists[fileName.toString.endsWith("eso")]
    }
    
    /**
     * {@inheritDoc}
     */
    override prepare(TestModelData modelData) {
        super.prepare(modelData)
        // Warm up KiCo
        if (!warmUp) {
            try {
                KielerCompiler.compile(new KielerCompilerContext("", model))
            } catch (Exception e) {
                // may fail but causes the ClassLoader in load all related classes
            }
            warmUp = true
        }
    }    
    
    //-----------------------------------------------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    override Document perform(State model, TestModelData modelData) {
        if (model === null) return null
        
        var couldNotSimulate = false
        var averageTickDuration = 0
        var nBestTickTimes = 0
        var maxJitter = 0
        var avgJitter = 0
        var List<Integer> ys2
        try {
            var tmpProject = SimulationUtil.getTemporarySimulationProject
            tmpProject?.delete(true, true, null)
            tmpProject = SimulationUtil.getTemporarySimulationProject
    
            val sclLibFolder = tmpProject.getFolder(new Path("kieler-gen/sim/scl_lib"))
            if(!sclLibFolder.exists) {
                PromPlugin.initializeFolder(tmpProject, sclLibFolder.projectRelativePath.toOSString, "platform:/plugin/de.cau.cs.kieler.sc/scl")
            }
            
            
            var tickDurations = <Integer> newLinkedList
            SimulationManager.addListener(this)
            for(traceFilePath : modelData.tracePaths.filter[fileName.toString.endsWith("eso")]) {
                val traceFile = tmpProject.getFile(traceFilePath.fileName.toString)
                traceFile.createLink(modelData.repositoryPath.resolve(traceFilePath).toUri, IResource.ALLOW_MISSING_LOCAL, null)
                
                val eso = new EsoUtil(traceFile)
                for(var j = 0; j < eso.getTraces().size; j++) {
                    for(var i = 0; i < NUMBER_OF_RUNS; i++) {
                
                        val compilationResult = SimulationUtil.compileAndSimulateModel(model, "T_scg.dependency, T_scg.scgPrio, T_sclp.sclpTrans")
                        traceFinished = false
                        
                        // Create Executable
                        val exeSimulator = new ExecutableSimulator
                        exeSimulator.executableFile = compilationResult.createdFiles.head
                        
                        // Create Trace
                        val trace = new Trace()
                        trace.tracePath.value = traceFile.fullPath.toOSString
                        trace.currentTraceNumber.value = j
                        trace.checkOutputs.value = false
                        
//                        SimulationUtil.startSimulationCompilationResult(compilationResult)
                        val sim = SimulationManager.instance
                        sim.addAction(StepAction.Method.WRITE, trace)
                        sim.addAction(StepAction.Method.WRITE, exeSimulator)
//                        sim.addAction(StepAction.Method.READ, trace)
                        
                        sim.initialize
                        while(!traceFinished) {
                            sim.stepMacroTick
                            if(traceError !== null) {
                                println(traceError.message)
                            }
                        }
                        val tickTime = sim.currentPool.getVariable("tickTime").value as Integer
                        sim.stop
                        
                        averageTickDuration += tickTime
                        tickDurations.add(tickTime)
                        
                    }
                }
                
//                SimulationUtil.startSimulationCompilationResult(compilationResult)
//                val simMan = SimulationManager.instance
//                simMan.stepMacroTick
//    
//                val tickTime = simMan.currentPool.getVariable("tickTime").value as Integer
//                simMan.stop
//    
//                averageTickDuration += tickTime/NUMBER_OF_RUNS
//                tickDurations.add(tickTime)
            }
            tmpProject.refreshLocal(IResource.DEPTH_INFINITE, null)
            
            val n = (tickDurations.size * N_BEST).intValue
            val ys = tickDurations.take((n + 1) / 2)
            ys2 = ys.toList
            ys2.addAll(tickDurations.reverse.take(n / 2))
            for(y : ys2) {
                nBestTickTimes += y/(ys2.size)
            }
            averageTickDuration /= tickDurations.size
            maxJitter = tickDurations.max - tickDurations.min
            for(t : tickDurations) {
                avgJitter += Math.abs(averageTickDuration - t)/tickDurations.size
            }
            
        } catch (Exception e) {
            couldNotSimulate = true
            e.printStackTrace
        } finally {
            SimulationManager.removeListener(this)
        }
        
        
        val data = new Document
        
        if(!couldNotSimulate) {
            data.put("executionTime", nBestTickTimes)
            data.put("times", ys2)
            data.put("averageExecutionTime", averageTickDuration)
            data.put("maxJitter", maxJitter)
            data.put("avgJitter", avgJitter)
        } else {
            data.put("simulatable", false)
        }

        
        return data
    }
    
    
    private def int calculateMaxWidth(Entry thread) {
        val forks = thread.shallowThreadNodes.filter[it instanceof Fork]
        var width = 1
        
        for(fork : forks) {
            var widthOfFork = 0
            for(forkCF : (fork as Fork).next) {
                widthOfFork += calculateMaxWidth(forkCF.target as Entry)
            }
            width = Math.max(width, widthOfFork)
        }
        
        return width
    }
    
    override update(SimulationEvent e) {
        if(e.type == SimulationEventType.TRACE) {
            if(e instanceof TraceMismatchEvent) {
                traceError = e
            } else if (e instanceof TraceFinishedEvent) {
                traceFinished = true
            }
        }
    }
    
}