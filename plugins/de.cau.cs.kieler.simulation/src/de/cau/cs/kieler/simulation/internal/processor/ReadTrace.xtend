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

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class ReadTrace extends TraceProcessor {
        
    public static val ID = "de.cau.cs.kieler.simulation.internal.trace.read"
    
    override getId() {
        ID
    }
    
    override getName() {
        "Read from Trace"
    }
    
    override process() {
        val context = simulationContext

        val traceProvider = traceDataProvider
        if (traceProvider !== null && traceProvider.isNextInputTick(context.stepNumber)) {
            traceProvider.applyTraceInputs(context.stepNumber)
            traceProvider.passInputs(dataPool)
        }
    }
    
}