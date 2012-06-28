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
 * Exception thrown if tick is already done and someone tries to do something in the tick. This is
 * for example the case if a tick is done and the method
 * {@link de.cau.cs.kieler.sj.SJProgram#gotoB(Enum)} is called.
 * 
 * @author mhei
 * 
 */
public class CurTickAlreadyDoneException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * creates a new current-tick-not-done-exception.
     */
    public CurTickAlreadyDoneException() {
        super();
    }

    /**
     * Creates a new new current-tick-not-done-exception with a given error message.
     * 
     * @param errMessage
     *            The error message for the exception.
     */
    public CurTickAlreadyDoneException(final String errMessage) {
        super(errMessage);
    }
}
