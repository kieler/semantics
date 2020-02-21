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

import com.google.common.collect.HashBasedTable
import com.google.common.collect.Table
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.trace.ktrace.Trace
import de.cau.cs.kieler.simulation.trace.ktrace.TraceFile
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import java.util.List
import de.cau.cs.kieler.simulation.events.TraceMismatchEvent
import de.cau.cs.kieler.simulation.SimulationHistory

/**
 * @author als
 */
@FinalFieldsConstructor
class SimulationResult {
    
    @Accessors
    val SimulationContext context

    @Accessors
    val Table<TraceFile, Trace, TraceResult> results = HashBasedTable.<TraceFile, Trace, TraceResult>create
    
    def TraceResult createNewResult(TraceFile file, Trace trace) {
        val result = new TraceResult(file, trace)
        results.put(file, trace, result)
        return result
    }
    
    def TraceResult get(TraceFile file, Trace trace) {
        results.get(file, trace)
    }
    
    def TraceResult get(TraceFile file, int traceNum) {
        results.get(file, file.traces.get(traceNum))
    }
    
    def boolean hasErrors() {
        results.values.exists[!errors.empty]
    }
    
    def Iterable<String> getErrors() {
        results.values.filter[!errors.empty].map[errors].flatten
    }
    
    def boolean hasMismatches() {
        results.values.exists[mismatch !== null]
    }
    
    def Iterable<TraceMismatchEvent> getMismatches() {
        results.values.map[mismatch].filterNull
    }
    
}

@FinalFieldsConstructor
class TraceResult {
    
    @Accessors
    val TraceFile traceFile
    
    @Accessors
    val Trace trace
    
    @Accessors
    val List<String> errors = newArrayList
    
    @Accessors
    var TraceMismatchEvent mismatch
    
    @Accessors
    var boolean finished
    
    @Accessors
    var SimulationHistory history
    
}