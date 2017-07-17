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

import com.mongodb.BasicDBObject
import de.cau.cs.kieler.benchmark.common.AbstractXTextModelBenchmark
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.test.common.repository.TestModelData
import de.cau.cs.kieler.scg.SCGraph
import org.bson.Document
import de.cau.cs.kieler.kico.CompilationResult
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import java.awt.font.NumericShaper

/**
 * @author lpe
 *
 */
class SCChartsPriorityBasedCompilationBenchmark extends AbstractXTextModelBenchmark<State> {
    
    @Inject
    extension SCChartsExtension
    
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
    
    private final val N_BEST = 5
    
    //-----------------------------------------------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    override getID() {
        return "sccharts-priority-based-compilation"
    }
    
    /**
     * {@inheritDoc}
     */
    override filter(TestModelData modelData) {
        return modelData.modelProperties.contains("benchmark") && !modelData.modelProperties.contains("must-fail") 
                && !modelData.modelProperties.contains("known-to-fail") && !modelData.modelProperties.contains("not-siasc")
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
            
            overallDuration += (System.nanoTime - startTime)/10
            
            var long duration = 0
            if(result.postponedErrors.empty) {
                for (iResult : result.transformationIntermediateResults.filter[it.id == "scg.scgPrio" || it.id == "sclp.sclpTrans"]) {
                    duration += iResult.duration
                    downstreamResults.add(iResult.duration)
                }
                
                          
            } else {
                result = null;
                
                throw new Exception("Could not compile SCCharts model into Core SCCharts form. Compilation error occurred!
                                        At " + modelData.modelPath, result.postponedErrors.head)                
            }
            
            averageDownstreamDuration += duration/NUMBER_OF_RUNS
                        
            if(i != NUMBER_OF_RUNS - 1) {
                result = null                
            }
            System.gc
        }
        if(result != null) {
            val scg = result.transformationIntermediateResults.findFirst[it.id == "sccharts.scg"].result as SCGraph
            val normalizedSCChart = result.transformationIntermediateResults.findFirst[it.id == "SURFACEDEPTH"].result as State
    
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
            
            data.put("scgNodes", scg.nodes.size)
            data.put("normSccNodes", normalizedSCChart.allContainedStatesList.size)
            data.put("duration", overallDuration)
            data.put("unit", "ns")
            data.put("averageDownstreamDuration", averageDownstreamDuration)   
            data.put("nBestDownstreamDuration", nBestDownstreamDuration)     
            data.put("size",(result.object as String).length)    
            data.put("numberOfVariables", numberOfVariables)            
        } else {
            data.put("schedulable", "false")
        }

        
        return data
    }
}