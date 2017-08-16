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
import de.cau.cs.kieler.kico.CompilationResult
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.simulation.SimulationUtil
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.test.common.repository.TestModelData
import de.cau.cs.kieler.prom.PromPlugin
import org.bson.Document
import org.eclipse.core.runtime.Path
import org.eclipse.core.resources.IResource

/**
 * @author lpe
 *
 */
class SCChartsDataflowBasedCompilationBenchmarkHighlightJitter extends AbstractXTextModelBenchmark<State> {
    
    @Inject
    extension SCChartsExtension
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
                                    
                                    "sccharts.scg",
                                    "scg.dependency",
                                    "scg.basicblock.sc",
                                    "scg.guardExpressions",
                                    "scg.guards",
                                    "scg.scheduling",
                                    "scg.sequentialize",
                                    
                                    "scg.s", 
                                    "s.c")
    
    /** Warm up flag */
    private static var warmUp = false
    
    private final val NUMBER_OF_RUNS = 100
    
    private final val N_BEST = 80
    
    //-----------------------------------------------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    override getID() {
        return "sccharts-priority-based-compilation-jitter"
    }
    
    /**
     * {@inheritDoc}
     */
    override filter(TestModelData modelData) {
        return modelData.modelProperties.contains("jitter")
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
        
        
        var tmpProject = SimulationUtil.getTemporarySimulationProject
        tmpProject.delete(true, null)
        tmpProject = SimulationUtil.getTemporarySimulationProject

        val sclLibFolder = tmpProject.getFolder(new Path("kieler-gen/sim/scl_lib"))
        if(!sclLibFolder.exists) {
            PromPlugin.initializeFolder(tmpProject, sclLibFolder.projectRelativePath.toOSString, "platform:/plugin/de.cau.cs.kieler.sc/scl")
        }
        
        
        var averageTickDuration = 0
        var tickDurations = <Integer> newLinkedList
        var x = false
        val compilationResult = SimulationUtil.compileAndSimulateModel(model, "s.c")
        for(var i = 0; i < NUMBER_OF_RUNS; i++) {
            SimulationUtil.startSimulationCompilationResult(compilationResult)
            val simMan = SimulationManager.instance
            simMan.currentPool.getVariable("x").value = x
            x = !x
            
            simMan.stepMacroTick

            val tickTime = simMan.currentPool.getVariable("tickTime").value as Integer
            simMan.stop
            

            averageTickDuration += tickTime/NUMBER_OF_RUNS
            tickDurations.add(tickTime)
        }
        tmpProject.refreshLocal(IResource.DEPTH_INFINITE, null)
        
        
        val ys = tickDurations.take((N_BEST + 1) / 2)
        ys.toList.addAll(tickDurations.reverse.take(N_BEST / 2))
        var nBestTickTimes = 0
        for(y : ys) {
            nBestTickTimes += y/(ys.size)
        }

        val maxJitter = tickDurations.max - tickDurations.min
        var avgJitter = 0
        for(t : tickDurations) {
            avgJitter += Math.abs(averageTickDuration - t)/NUMBER_OF_RUNS
        }
        
        
        val data = new Document
        val compileChain = transformations.join("!T_SIMULATIONVISUALIZATION, !T_ABORTWTO, T_", ", T_", "")[it]
        
        // Compile with KiCo
        val context = new KielerCompilerContext(compileChain, model)
        context.advancedSelect = false // Compilation has fixed chain (respecting dependencies)
        context.inplace = true // Save intermediate results
        
        var CompilationResult result = null
        
        result = KielerCompiler.compile(context)
            
        System.gc
        
        
        if(result != null) {
            val scg = result.transformationIntermediateResults.findFirst[it.id == "sccharts.scg"].result as SCGraph
            val normalizedSCChart = result.transformationIntermediateResults.findFirst[it.id == "SURFACEDEPTH"].result as State
    
            var numberOfDependencies = 0
            for(n : scg.nodes) {
                numberOfDependencies += n.dependencies.filter[it instanceof DataDependency && (it as DataDependency).isConcurrent
                                && !(it as DataDependency).isConfluent].size
            }
            val scgNodes = scg.nodes.size
            
            data.put("scgNodes", scgNodes)
            data.put("normSccNodes", normalizedSCChart.allContainedStatesList.size)
            data.put("unit", "ns")
            data.put("threads", scg.nodes.filter[it instanceof Entry].size)
            data.put("dependencies", numberOfDependencies)
            data.put("executionTime", nBestTickTimes)
            data.put("averageExecutionTime", averageTickDuration)
            data.put("maxJitter", maxJitter)
            data.put("avgJitter", avgJitter)
        } else {
            data.put("schedulable", "false")
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
    
}