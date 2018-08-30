/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.internal.processor

import de.cau.cs.kieler.core.model.properties.IProperty
import de.cau.cs.kieler.core.model.properties.Property
import de.cau.cs.kieler.simulation.events.TraceFinishedEvent
import de.cau.cs.kieler.simulation.events.TraceMismatchEvent
import de.cau.cs.kieler.simulation.trace.TraceDataProvider

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class CheckTrace extends TraceProcessor {

    public static val IProperty<Boolean> MATCH = 
        new Property<Boolean>("de.cau.cs.kieler.simulation.internal.trace.match", false)
            
    public static val ID = "de.cau.cs.kieler.simulation.internal.trace.check"
    
    override getId() {
        ID
    }
    
    override getName() {
        "Check against Trace"
    }
    
    override process() {
        val context = simulationContext
        val traceProvider = traceDataProvider

        if (traceProvider !== null) {
            traceProvider.applyTraceOutputs(context.stepNumber)
            val mm = traceProvider.mismatches(dataPool)
            if (!mm.empty) {
                context.notify(new TraceMismatchEvent(context, traceProvider.trace, context.stepNumber, mm.entries.map[new Pair(key, value)].toSet))
            }
        }

        if (traceProvider.trace.ticks.size <= context.stepNumber + 1) {
            // Trace finished
            context.notify(new TraceFinishedEvent(context, traceProvider.trace, context.stepNumber))
        }
    }
    
}