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
 * Exception thrown if a previous status of a signal is not available. This is for example the case
 * if a signal history is too small or a previous tick does not exists.
 * 
 * @author mhei
 * 
 */
public class NoPreSignalException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates a new no-previous-signal exception.
     */
    public NoPreSignalException() {
        super();
    }

    /**
     * Creates a new no-previous-signal exception with a given error message.
     * 
     * @param errMessage
     *            The error message for the exception.
     */
    public NoPreSignalException(final String errMessage) {
        super(errMessage);
    }
}
