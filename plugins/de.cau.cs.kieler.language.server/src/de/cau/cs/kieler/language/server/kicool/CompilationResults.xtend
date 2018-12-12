/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server.kicool

import java.util.LinkedList
import java.util.List

/**
 * Utility class to send description of compilation snapshots to the Theia client.
 * 
 * @author sdo
 */
class CompilationResults {
    public List<SnapshotDescription> files = new LinkedList
    
    new(List<SnapshotDescription> descriptions) {
        this.files = descriptions
    }
    
}