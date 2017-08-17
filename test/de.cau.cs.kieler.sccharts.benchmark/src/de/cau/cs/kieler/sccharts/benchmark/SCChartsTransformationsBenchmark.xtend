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
package de.cau.cs.kieler.sccharts.benchmark

import de.cau.cs.kieler.benchmark.common.AbstractXTextModelBenchmark
import de.cau.cs.kieler.kico.CompilationResult
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.simulation.SimulationUtil
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.test.common.repository.TestModelData
import org.bson.Document
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.Path

/**
 * Tests if all intermediate results of an SCCharts compilation fullfill basic sanity properties.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SCChartsTransformationsBenchmark extends AbstractXTextModelBenchmark<State> {
    
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
        return "sccharts-normalization-transformations"
    }
    
    /**
     * {@inheritDoc}
     */
    override filter(TestModelData modelData) {
        return !modelData.modelProperties.contains("must-fail") && modelData.modelProperties.contains("benchmark")
                && !modelData.modelProperties.contains("known-to-fail") && !modelData.modelProperties.contains("not-sasc") 
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
//    override Document perform(State model, TestModelData modelData) {
//        if (model === null) return null
//        
//        val data = new Document
//        val compileChain = transformations.join("!T_SIMULATIONVISUALIZATION, !T_ABORTWTO, T_", ", T_", "")[it]
//        
//        // Compile with KiCo
//        val context = new KielerCompilerContext(compileChain, model)
//        context.advancedSelect = false // Compilation has fixed chain (respecting dependencies)
//        context.inplace = true // Save intermediate results
//        
//        var overallDuration = System.nanoTime
//        val result = KielerCompiler.compile(context)
//        data.put("duration", System.nanoTime - overallDuration)
//        data.put("unit", "ns")
//        
//        data.put("size",(result.object as String).length)
//        
//        if (!result.postponedErrors.empty) {
//            throw new Exception("Could not compile SCCharts model into Core SCCharts form. Compilation error occurred!", result.postponedErrors.head)
//        }
//        val sequentializedScg = result.transformationIntermediateResults.findFirst[it.id == "scg.sequentialize"].result as SCGraph
//        val transformations = new BasicDBObject 
//        // Check all intermediate results
//        var long duration = 0
//        for (iResult : result.transformationIntermediateResults.filter[it.id == "scg.basicblock.sc" || it.id == "scg.guardExpressions" || it.id == "scg.guards"
//                                        || it.id == "scg.scheduling" || it.id == "scg.sequentialize" || it.id == "scg.s" || it.id == "s.c"]) {
//            duration += iResult.duration
//        }
//        var numberOfVariables = 0
//        val pres = <ValuedObject> newArrayList 
//        sequentializedScg.eAllContents.filter(typeof(OperatorExpression)).filter[operator == OperatorType::PRE].forEach[
//            it.eAllContents.filter(typeof(ValuedObjectReference)).forEach[ pres += it.valuedObject ]    
//        ]
//        for(declarations : sequentializedScg.declarations) {
//            numberOfVariables += declarations.valuedObjects.size
//            for(vo : declarations.valuedObjects) {
//                if(pres.contains(vo)) {
//                    numberOfVariables++
//                }
//            }
//        }
//        
//        data.put("CodeCompilation", duration)
//        data.put("numberOfVariables", numberOfVariables)
//        
//        return data
//    }
    
    override Document perform(State model, TestModelData modelData) {
        if (model === null) return null
        
        
        var couldNotSimulate = false
        var averageTickDuration = 0
        var nBestTickTimes = 0
        var maxJitter = 0
        var avgJitter = 0
        
        try {
            var tmpProject = SimulationUtil.getTemporarySimulationProject
            tmpProject.delete(true, null)
            tmpProject = SimulationUtil.getTemporarySimulationProject
    
            val sclLibFolder = tmpProject.getFolder(new Path("kieler-gen/sim/scl_lib"))
            if(!sclLibFolder.exists) {
                PromPlugin.initializeFolder(tmpProject, sclLibFolder.projectRelativePath.toOSString, "platform:/plugin/de.cau.cs.kieler.sc/scl")
            }
            
            
            var tickDurations = <Integer> newLinkedList
            val compilationResult = SimulationUtil.compileAndSimulateModel(model, "T_scg.dependency, T_scg.scgPrio, T_sclp.sclpTrans")
            for(var i = 0; i < NUMBER_OF_RUNS; i++) {
                SimulationUtil.startSimulationCompilationResult(compilationResult)
                val simMan = SimulationManager.instance
                simMan.stepMacroTick
    
                val tickTime = simMan.currentPool.getVariable("tickTime").value as Integer
                simMan.stop
    
                averageTickDuration += tickTime/NUMBER_OF_RUNS
                tickDurations.add(tickTime)
            }
            tmpProject.refreshLocal(IResource.DEPTH_INFINITE, null)
            
            
            val ys = tickDurations.take((N_BEST + 1) / 2)
            ys.toList.addAll(tickDurations.reverse.take(N_BEST / 2))
            for(y : ys) {
                nBestTickTimes += y/(ys.size)
            }
    
            maxJitter = tickDurations.max - tickDurations.min
            for(t : tickDurations) {
                avgJitter += Math.abs(averageTickDuration - t)/NUMBER_OF_RUNS
            }
            
        } catch (Exception e) {
            couldNotSimulate = true
        }
        
        val data = new Document
        val compileChain = transformations.join("!T_SIMULATIONVISUALIZATION, !T_ABORTWTO, T_", ", T_", "")[it]
        
        // Compile with KiCo
        val context = new KielerCompilerContext(compileChain, model)
        context.advancedSelect = false // Compilation has fixed chain (respecting dependencies)
        context.inplace = true // Save intermediate results
        
        var CompilationResult result = null
        var overallDuration = 0l
        var averageDownstreamDuration = 0l
        var downstreamResults = <Long> newLinkedList
        
        for(var i = 0; i < NUMBER_OF_RUNS; i++) {
            val startTime = System.nanoTime
            result = KielerCompiler.compile(context)
            
            overallDuration += (System.nanoTime - startTime)/NUMBER_OF_RUNS
            
            var long duration = 0
            if(result.postponedErrors.empty) {
                for (iResult : result.transformationIntermediateResults.filter[it.id == "scg.basicblock.sc" || it.id == "scg.guardExpressions" || it.id == "scg.guards"
                                        || it.id == "scg.scheduling" || it.id == "scg.sequentialize" || it.id == "scg.s" || it.id == "s.c"]) {
                    duration += iResult.duration
                    downstreamResults.add(iResult.duration)
                }
                
                          
            } else {
                result = null;
                
//                throw new Exception("Could not compile SCCharts model into Core SCCharts form. Compilation error occurred!
//                                        At " + modelData.modelPath, result.postponedErrors.head)                
            }
            
            averageDownstreamDuration += duration/NUMBER_OF_RUNS
                        
            if(i != NUMBER_OF_RUNS - 1) {
                result = null                
            }
            System.gc
        }
        if(result != null) {
            val scg = result.transformationIntermediateResults.findFirst[it.id == "sccharts.scg"].result as SCGraph
    
            downstreamResults.sort
            val xs = downstreamResults.take((N_BEST + 1) / 2)
            xs.toList.addAll(downstreamResults.reverse.take(N_BEST / 2))
            var nBestDownstreamDuration = 0l
            for(x : xs) {
                nBestDownstreamDuration += x/(xs.size)
            }
            
            var numberOfVariables = 0
            for(declarations : scg.declarations) {
                numberOfVariables += declarations.valuedObjects.size
            }
            var numberOfDependencies = 0
            for(n : scg.nodes) {
                numberOfDependencies += n.dependencies.filter[it instanceof DataDependency && (it as DataDependency).isConcurrent
                                && !(it as DataDependency).isConfluent].size
            }
            
//            data.put("scgNodes", scgNodes)
//            data.put("normSccNodes", normalizedSCChart.allContainedStatesList.size)
            data.put("duration", overallDuration)
//            data.put("unit", "ns")
            data.put("averageDownstreamDuration", averageDownstreamDuration)   
            data.put("nBestDownstreamDuration", nBestDownstreamDuration)     
            data.put("size",(result.object as String).length)    
            data.put("numberOfVariables", numberOfVariables)
//            data.put("threads", scg.nodes.filter[it instanceof Entry].size)
//            data.put("maxParallelThreads", maxWidth)
//            data.put("dependencies", numberOfDependencies)
            // Preliminary "complexity" of a model
//            data.put("complexity", numberOfDependencies * numberOfVariables + maxWidth * scgNodes)
            if(!couldNotSimulate) {
                data.put("executionTime", nBestTickTimes)
                data.put("averageExecutionTime", averageTickDuration)
                data.put("maxJitter", maxJitter)
                data.put("avgJitter", avgJitter)
            } else {
                data.put("simulatable", false)
            }
        } else {
            data.put("schedulable", "false")
        }

        
        return data
    }
    
      
}
		