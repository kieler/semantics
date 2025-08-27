/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sj.exceptions;

/**
 * Exception thrown if someone tries to interact with a terminates SJ program.
 * 
 * @author mhei
 * @kieler.ignore (excluded from review process)
 * 
 */
public class ProgramAlreadyTerminatedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates a new program-already-terminated exception.
     */
    public ProgramAlreadyTerminatedException() {
        super();
    }

    /**
     * Creates a new program-already-terminated exception with a given error message.
     * 
     * @param errMessage
     *            The error message for the exception.
     */
    public ProgramAlreadyTerminatedException(final String errMessage) {
        super(errMessage);
    }
}
