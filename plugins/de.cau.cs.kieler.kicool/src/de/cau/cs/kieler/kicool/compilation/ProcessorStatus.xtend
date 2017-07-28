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
package de.cau.cs.kieler.kicool.compilation

/**
 * Status enum for processors.
 * 
 * @author ssm
 * @kieler.design 2017-05-17 proposed
 * @kieler.rating 2017-05-17 proposed yellow  
 *
 */
enum ProcessorStatus {
    /** Everything is ok */
    OK, 
    
    /** The processor encountered some warnings. */
    WARNINGS, 
    
    /** Errors were encountered during processing. */
    ERRORS    
}