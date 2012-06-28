/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sj.exceptions;

/**
 * Thrown if there is something wrong with the priority for a thread. This could be the case if a
 * priority is redundant or negative.
 * 
 * The SC name for this exception is <code>SC_ERROR_PRIORITY</code>. 
 * 
 * @author mhei
 * 
 */
public class PriorityException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates an new priority exception.
     */
    public PriorityException() {
        super();
    }

    /**
     * Creates a new priority exception with a given error message.
     * 
     * @param errMessage
     *            The error message for the exception.
     */
    public PriorityException(final String errMessage) {
        super(errMessage);
    }
}
