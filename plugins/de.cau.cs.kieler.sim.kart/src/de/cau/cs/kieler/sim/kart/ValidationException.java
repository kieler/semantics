/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kart;

/**
 * This exception is raised whenever a validation error is encountered.
 * It contains extended information pertaining to the validation error.
 *
 * @author ssc
 * @kieler.rating 2012-01-24 red
 */
public class ValidationException extends Exception {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1646882469325859198L;
    
    //-------------------------------------------------------------------------
    
    /**
     * The extended information pertaining to the validation error.
     */
    private String message;
    
    //-------------------------------------------------------------------------

    /**
     * Create a new exception including some extended information.
     * 
     * @param message the extended information
     */
    public ValidationException(final String message) {
        this.message = message;
    }
    
    //-------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public String toString() {
        return message;
    }

    //-------------------------------------------------------------------------
    
}
