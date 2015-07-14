/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.extensions;

/**
 * Enums for the different kinds of dependencies.
 * 
 * @author ssm
 *
 */

public enum DependencyType {
    /*
     * Unknown dependency types are not recognized or the direction of the dependency faces in the
     * wrong direction. 
     */
    UNKNOWN,
    
    /*
     * WRITEWRITE depicts a write-write conflict.
     */
    WRITEWRITE,
    
    /*
     * WRITEINCREMENT denotes a relative write conflict as described in the DATE paper.
     */
    WRITEINCREMENT,
    
    /*
     * WRITEREAD describes a write-read dependency. 
     */
    WRITEREAD,
    
    /*
     * Same as WRITEINCREMENT for reads.
     */
    READINCREMENT,
}
