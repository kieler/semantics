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
package de.cau.cs.kieler.language.server

import java.util.List
import java.util.LinkedList

/**
 * Utility class to send description of compilation snapshots to the Theia client.
 * 
 * @author sdo
 */
class CompilationResults {
    public List<SnapshotDescription> files = new LinkedList
    
    new() {
        this.files = new LinkedList
    }
    
    new (List<SnapshotDescription> files) {
        this.files = files
    }
}