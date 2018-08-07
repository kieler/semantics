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

/**
 * @author sdo
 * 
 */
class Snapshot {

    public String groupId
    public String name
    public int snapshotIndex
    
    new (String groupId, String name, int snapshotIndex) {
        this.groupId = groupId
        this.name = name
        this.snapshotIndex = snapshotIndex
    }
}
