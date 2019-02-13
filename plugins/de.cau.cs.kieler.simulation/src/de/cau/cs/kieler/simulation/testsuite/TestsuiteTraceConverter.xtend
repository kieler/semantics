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
package de.cau.cs.kieler.simulation.testsuite

import com.google.gson.JsonObject
import de.cau.cs.kieler.kicool.deploy.Logger
import de.cau.cs.kieler.kicool.deploy.processor.AbstractDeploymentProcessor
import de.cau.cs.kieler.simulation.DataPool
import de.cau.cs.kieler.simulation.DataPoolEntry
import de.cau.cs.kieler.simulation.trace.TraceDataProvider
import de.cau.cs.kieler.simulation.trace.ktrace.Trace
import de.cau.cs.kieler.simulation.trace.ktrace.TraceFile

/**
 * @author mek
 *
 */
class TestsuiteTraceConverter extends AbstractDeploymentProcessor<TraceFile> {
    
    override getId() {
        "de.cau.cs.kieler.simulation.testsuite.traceconverter"
    }
    
    override getName() {
        "Trace Converter"
    }
    
    override process() {
        
        val out = new Logger
        var first = true
        
        val data = model
        val traces = data.traces
        for (Trace trace : traces) {
            // place a JSON String "reset" between traces
            if (!first) out.println("\"reset\"") else first = false
            
            val ticks = trace.ticks
            val max = ticks.size
            
            val provider = new TraceDataProvider(trace, false)
            
            val pool = new DataPool
            
            // extract inputs to set and outputs to check for each tick
            if (provider.signalSemantics) {
                val outputPool = new DataPool
                for (var i = 0; i<max; i++) {
                    provider.applyTraceInputs(i)
                    provider.passInputs(pool)
                    out.print(pool.rawData)
                    out.print(" => ")
                    
                    provider.applyTraceOutputs(i)
                    val mm = provider.mismatches(outputPool)
                    for (DataPoolEntry e : mm.entries.map[value]) {
                        outputPool.setValue(e.name, e.rawValue)
                    }
                    out.println(outputPool.rawData)
                }
            } else {
                val emptyPool = new DataPool
                for (var i = 0; i<max; i++) {
                    provider.applyTraceInputs(i)
                    provider.passInputs(pool)
                    out.print(pool.rawData)
                    out.print(" => ")
                    
                    provider.applyTraceOutputs(i)
                    val mm = provider.mismatches(emptyPool)
                    val JsonObject js = new JsonObject
                    for (DataPoolEntry e : mm.entries.map[value]) {
                        js.add(e.name, e.rawValue)
                    }
                    out.println(js)
                }
            }
        }
        
        model = out.closeLog("main.test.json")
    }
    
}