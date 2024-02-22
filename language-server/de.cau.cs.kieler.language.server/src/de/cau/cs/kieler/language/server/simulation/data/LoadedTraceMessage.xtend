/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server.simulation.data

import de.cau.cs.kieler.simulation.trace.ktrace.Trace
import org.eclipse.xtend.lib.annotations.Data

/**
 * Message to send the trace loaded from file to the client.
 * 
 * @author nre
 */
@Data class LoadedTraceMessage {
    
    /** The trace object loaded into the system. */
    Trace trace
    /** If loading the trace was successful. */
    boolean successful
    /** Human-readable reason why loading failed (if it failed). */
    String reason
}
