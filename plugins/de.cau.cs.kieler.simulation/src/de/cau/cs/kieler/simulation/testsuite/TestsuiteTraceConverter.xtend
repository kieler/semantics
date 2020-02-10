/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.testsuite

import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.ExogenousProcessor
import de.cau.cs.kieler.kicool.deploy.Logger
import de.cau.cs.kieler.simulation.DataPool
import de.cau.cs.kieler.simulation.trace.TraceDataProvider
import de.cau.cs.kieler.simulation.trace.ktrace.Trace
import de.cau.cs.kieler.simulation.trace.ktrace.TraceFile

/**
 * @author mek
 *
 */
class TestsuiteTraceConverter extends ExogenousProcessor<TraceFile, CodeContainer> {
    
    override getId() {
        "de.cau.cs.kieler.simulation.testsuite.traceconverter"
    }
    
    override getName() {
        "Trace Converter"
    }
    
    override process() {
        val traces = model.traces
        
        // Do one pass to get all input and output names.
        // This is required since the given pool has no information about any input or output.
        // (data-provider mainly gets the information about inputs/outputs/signals from the given data-pool)
        val inputNames = <String>newHashSet
        val outputNames = <String>newHashSet
        for (Trace trace : traces) {
            val ticks = trace.ticks
            val max = ticks.size
            
            val provider = new TraceDataProvider(trace, false)
            for (var i = 0; i<max; i++) {
                provider.applyTraceInputs(i)
                provider.applyTraceOutputs(i)
            }
        
            inputNames += provider.inputNames
            outputNames += provider.outputNames
        }


        // With inputs and outputs known, create the JSON trace.
        val out = new Logger
        var first = true
        for (Trace trace : traces) {
            // place a JSON String "reset" between traces
            if (!first) out.println("\"reset\"") else first = false
            
            val ticks = trace.ticks
            val max = ticks.size
            
            val provider = new TraceDataProvider(trace, false)
            provider.addInputNames(inputNames)
            provider.addOutputNames(outputNames)
            
            // create the JSON simulation trace
            val pool  = new DataPool
            for (var i = 0; i<max; i++) {
                // get inputs to set
                pool.clear
                provider.applyTraceInputs(i)
                provider.passInputs(pool)
                out.print(pool.rawData)
                out.print(" => ")
                
                // get outputs to check
                pool.clear
                provider.applyTraceOutputs(i)
                provider.passExpectedOutputs(pool);
                out.println(pool.rawData)
            }
       }
        
        model = out.closeLog("main.test.json")
    }
    
}