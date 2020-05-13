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
package de.cau.cs.kieler.simulation.testing

import com.google.gson.JsonArray
import com.google.gson.JsonNull
import com.google.gson.JsonObject
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.SimulationHistory
import de.cau.cs.kieler.simulation.events.TraceMismatchEvent
import de.cau.cs.kieler.simulation.trace.ktrace.Trace
import de.cau.cs.kieler.simulation.trace.ktrace.TraceFile
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

/**
 * @author als
 */
@FinalFieldsConstructor
class SimulationResult {
    
    @Accessors
    val SimulationContext context

    @Accessors
    val List<TraceResult> results = newArrayList
    
    def TraceResult createNewResult(TraceFile file, Trace trace, int run) {
        val result = new TraceResult(file, trace, run)
        results += result
        return result
    }
    
    def boolean hasErrors() {
        results.exists[!errors.empty]
    }
    
    def Iterable<String> getErrors() {
        results.filter[!errors.empty].map[errors].flatten
    }
    
    def boolean hasMismatches() {
        results.exists[mismatch !== null]
    }
    
    def Iterable<TraceMismatchEvent> getMismatches() {
        results.map[mismatch].filterNull
    }
    
    def JsonArray toJson() {
        val arr = new JsonArray(results.size)
        for (result : results) {
            val obj = new JsonObject
            
            if (result.traceFile.eResource?.URI !== null) {
                val name = result.traceFile.eResource.URI.segments.last
                if (!name.nullOrEmpty) {
                    obj.addProperty("traceFile", name)
                }
            }
            obj.addProperty("traceNum", result.traceFile.traces.indexOf(result.trace))
            if (context.startEnvironment.getProperty(TraceSimulation.RUNS) > 1) {
                obj.addProperty("run", result.run)
            }
            if (result.errors.size > 0) {
                val errArr = new JsonArray(result.errors.size)
                for (err : result.errors) {
                    errArr.add(err)
                }
                obj.add("errors", errArr)
            }
            if (result.mismatch !== null) {
                obj.addProperty("mismatch", result.mismatch.toString)
            }
            if (!result.finished) {
                obj.addProperty("aborted", true)
            }
            if (result.history.last.entries.containsKey("#ticktime")) {
                val timeArr = new JsonArray(result.history.size)
                for (tick : result.history.reverseIterator.toIterable) { // Starting with fist tick
                    val entry = tick.entries.get("#ticktime")
                    if (entry !== null) {
                        timeArr.add(entry.rawValue)
                    } else {
                        timeArr.add(JsonNull.INSTANCE)
                    }
                }
                obj.add("ticktimes", timeArr)
            }
            
            arr.add(obj)
        }
        return arr
    }
    
}

@FinalFieldsConstructor
class TraceResult {
    
    @Accessors
    val TraceFile traceFile
    
    @Accessors
    val Trace trace
    
    @Accessors
    val int run    
    
    @Accessors
    val List<String> errors = newArrayList
    
    @Accessors
    var TraceMismatchEvent mismatch
    
    @Accessors
    var boolean finished
    
    @Accessors
    var SimulationHistory history
    
}