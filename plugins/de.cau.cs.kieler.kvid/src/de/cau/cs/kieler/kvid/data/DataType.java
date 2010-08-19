/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kvid.data;

/**
 * 
 * Enum for data types known and processed by KViD.
 * 
 * Use STRING as a default if you have data in string representation.
 * 
 * @author jjc
 *
 */
public enum DataType {
    
    /** Value for integer data. */
    INT, 
    
    /** Value for floating point data. */
    FLOAT, 
    
    /** Value for data represented by a string.
     *  Can be used if data type is unknown to proceed data unprocessed.
     */
    STRING, 
    
    /** Value for data represented as boolean. */
    BOOLEAN

}
