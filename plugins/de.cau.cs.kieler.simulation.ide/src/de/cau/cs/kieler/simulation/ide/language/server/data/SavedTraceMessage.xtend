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
package de.cau.cs.kieler.simulation.ide.language.server.data

import org.eclipse.xtend.lib.annotations.Data

/**
 * Message to send the content of the trace file to be saved by the client.
 * 
 * @author nre
 */
@Data class SavedTraceMessage {
    
    /** The trace object loaded into the system. */
    String fileContent
    /** If saving the trace was successful. */
    boolean successful
    /** Human-readable reason why saving failed (if it failed). */
    String reason
}
