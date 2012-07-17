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
 * Exception thrown if a signal used by an SJ program is not declared.
 * 
 * @author mhei
 * @see de.cau.cs.kieler.sj.Signal
 * @see de.cau.cs.kieler.sj.EmbeddedSJProgram#addSignals(de.cau.cs.kieler.sj.Signal...)
 * @see de.cau.cs.kieler.sj.SJProgram#initSignals()
 * 
 */
public class SignalNotDeclaredException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates a new signal-not-declared exception.
     */
    public SignalNotDeclaredException() {
        super();
    }

    /**
     * Creates a new signal-not-declared exception with a given error message.
     * 
     * @param errMessage
     *            The error message for the exception.
     */
    public SignalNotDeclaredException(final String errMessage) {
        super(errMessage);
    }
}
