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

import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.simulation.trace.ktrace.Trace
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.trace.TraceDataProvider
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.ISimulationListener

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
abstract class TraceProcessor extends SimulationProcessor {
    
    public static val IProperty<TraceDataProvider> TRACE = 
        new Property<TraceDataProvider>("de.cau.cs.kieler.simulation.internal.trace", null)
        
    static def prepareTraceInformation(SimulationContext ctx, Trace trace, boolean allowLoops) {
        ctx.startEnvironment.setProperty(TRACE, new TraceDataProvider(trace, allowLoops))
    }
    
    static def resetTraceInformation(SimulationContext ctx) {
        ctx?.startEnvironment?.getProperty(TRACE)?.reset()
    }
    
    def getTraceDataProvider() {
        return environment.getProperty(TRACE)
    }
}