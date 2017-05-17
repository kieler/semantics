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

import com.mongodb.BasicDBObject
import de.cau.cs.kieler.benchmark.common.AbstractXTextModelBenchmark
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.test.common.repository.TestModelData
import org.bson.Document

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
                                    "SURFACEDEPTH")
    
    static var warmUp = false
    
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
        return modelData.modelProperties.contains("sccharts")
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
    override Document perform(TestModelData modelData) {
        if (model === null) return null
        
        val data = new Document
        val compileChain = transformations.join("!T_SIMULATIONVISUALIZATION, !T_ABORTWTO, T_", ", T_", "")[it]
        
        // Compile with KiCo
        val context = new KielerCompilerContext(compileChain, model)
        context.advancedSelect = false // Compilation has fixed chain (respecting dependencies)
        context.inplace = true // Save intermediate results
        
        var overallDuration = System.nanoTime
        val result = KielerCompiler.compile(context)
        data.put("duration", System.nanoTime - overallDuration)
        data.put("unit", "ns")
        
        if (!result.postponedErrors.empty) {
            throw new Exception("Could not compile SCCharts model into Core SCCharts form. Compilation error occurred!", result.postponedErrors.head)
        }
        
        val transformations = new BasicDBObject 
        // Check all intermediate results
        for (iResult : result.transformationIntermediateResults.filter[!it.id.nullOrEmpty]) {
            transformations.put(iResult.id, iResult.duration)
        }
        data.put("transformations", transformations)
        
        return data
    }
      
}
		