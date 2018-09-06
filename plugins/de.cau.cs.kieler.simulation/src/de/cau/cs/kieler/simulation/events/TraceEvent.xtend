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

import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.trace.ktrace.Trace
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Base class for events that are fired by traces.
 * 
 * @author aas, als
 *
 */
@FinalFieldsConstructor
abstract class TraceEvent extends SimulationEvent {

    /**
     * The trace
     */
    @Accessors
    val Trace trace
    /**
     * The tick for which the event occurs
     */
    @Accessors
    val int step

}
