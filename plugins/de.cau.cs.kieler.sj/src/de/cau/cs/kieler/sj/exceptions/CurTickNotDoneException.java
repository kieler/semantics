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
 * Exception thrown if a current tick not done. This is for example the case if the method
 * {@link de.cau.cs.kieler.sj.EmbeddedSJProgram#doTick(de.cau.cs.kieler.sj.Signal...)} is called and
 * not all threads of the current tick are terminated.
 * 
 * @author mhei
 * 
 */
public class CurTickNotDoneException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * creates a new current-tick-not-done-exception.
     */
    public CurTickNotDoneException() {
        super();
    }

    /**
     * Creates a new current-tick-not-done-exception with a given error message.
     * 
     * @param errMessage
     *            The error message for the exception.
     */
    public CurTickNotDoneException(final String errMessage) {
        super(errMessage);
    }
}
