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
 * Exception which should be thrown if a causality problem is detected and the causality check is
 * active. The SC name for this Exception is <code>_SC_ERROR_CAUSALITY</code>.
 * 
 * @author mhei
 * @see de.cau.cs.kieler.sj.SJProgram#activateCausalityCheck()
 * @see de.cau.cs.kieler.sj.SJProgram#isCausalityCheckActive()
 */
public class CausalityException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates a new CausalityException.
     */
    public CausalityException() {
        super();
    }

    /**
     * Creates a new causality exception with a given error message.
     * 
     * @param errMessage
     *            The error message for the exception.
     */
    public CausalityException(final String errMessage) {
        super(errMessage);
    }
}
