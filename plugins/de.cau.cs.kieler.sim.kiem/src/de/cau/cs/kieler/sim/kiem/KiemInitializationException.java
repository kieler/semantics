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

package de.cau.cs.kieler.sim.kiem;

/**
 * The Class KiemInitializationException. This exception is used by DataComponents to flag errors
 * within their initialization() and their wrapup() method during the initialization and wrap-up
 * phase. If the {@link #mustStop} flag is set to true, then this means the execution <B>CANNOT</B>
 * been started and the execution manager will not do so if any DataComponent throws an error with
 * this flag.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2009-01-15 yellow
 */
public class KiemInitializationException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8183839879570123277L;

    /** The must stop. */
    private boolean mustStop;

    /** The cause of this Exception. */
    private Exception cause;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KiemInitializationException.
     * 
     * @param message
     *            the message of this Exception to display to the user
     * @param mustStopParam
     *            the must stop flag indicating if the execution must stop
     * @param causeParam
     *            the cause of this Exception if any, or null otherwise
     */
    public KiemInitializationException(final String message, 
                                       final boolean mustStopParam, 
                                       final Exception causeParam) {
        super(message);
        this.mustStop = mustStopParam;
        this.cause = causeParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if the execution must stop when this Exception occurs.
     * 
     * @return true, if execution must stop
     */
    public boolean isMustStop() {
        return this.mustStop;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the cause of this Exception.
     * 
     * @return the cause of this Exception, if any
     */
    public Exception getCause() {
        return cause;
    }

}
