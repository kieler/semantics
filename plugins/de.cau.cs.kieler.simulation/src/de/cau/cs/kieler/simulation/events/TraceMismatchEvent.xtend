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
package de.cau.cs.kieler.simulation.events

import de.cau.cs.kieler.simulation.DataPoolEntry
import de.cau.cs.kieler.simulation.trace.ktrace.TraceFile
import java.util.Collection
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

/**
 * Event that is fired when the current simulation diverges from a previous trace.
 * 
 * @author aas
 *
 */
@FinalFieldsConstructor
class TraceMismatchEvent extends TraceEvent {

    /**
     * All mismatches between actual output (left/key) and expected trace value (right/value).
     */
    @Accessors
    val Collection<Pair<DataPoolEntry, DataPoolEntry>> mismatches
    
    override toString() {
        val b =new StringBuilder()
        b.append("Trace mismatch")
        if (mismatches.size > 1) b.append("es")
        b.append(" in tick ")
        b.append(step)
        if (trace.eContainer !== null) {
            val traceFile = trace.eContainer as TraceFile
            b.append(" of trace ")
            b.append(traceFile.traces.indexOf(trace))
            b.append("!\n")
            if (traceFile.eResource !== null && traceFile.eResource.URI !== null) {
                b.append("TraceFile: ")
                b.append(traceFile.eResource.URI.lastSegment.toString)
                b.append("\n")
            }
        }
        for (var i = 0; i < mismatches.size; i++) {
            val mismatch = mismatches.get(i)
            if (mismatches.size > 1) {
                b.append(i)
                b.append(":\n")
            }
            b.append("  Variable name: ")
            if (mismatch.key !== null) {
                b.append(mismatch.key.name)
                if (mismatch.key.name.equals(mismatch.value.name) && mismatch.value.name.endsWith("_val")) {
                    b.append(" (value part)")
                }
            } else {
                b.append(mismatch.value.name)   
            }
            b.append("\n")
            b.append("  Expected value: ")
            b.append(mismatch.value.rawValue.toString)   
            b.append("\n")
            if (mismatch.key !== null) {
                b.append("  Produced value: ")
                b.append(mismatch.key.rawValue.toString) 
            } else {
                b.append("  No output produced")
            }
            b.append("\n")       
        }
        
        return b .toString()
    }

}
