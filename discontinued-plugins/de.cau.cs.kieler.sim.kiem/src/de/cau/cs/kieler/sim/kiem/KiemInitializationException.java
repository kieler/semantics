/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem;

/**
 * The Class KiemInitializationException. This exception is used by
 * DataComponents to flag errors within their initialization() and their
 * wrapup() method during the initialization and wrap-up phase. If the
 * {@link #mustStop} flag is set to true, then this means the execution
 * <B>CANNOT</B> been started and the execution manager will not do so if any
 * DataComponent throws an error with this flag.
 * 
 * @author cmot
 * @kieler.design 2009-12-08
 * @kieler.rating 2010-01-15 yellow
 */
public class KiemInitializationException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8183839879570123277L;

    /** The must stop. */
    private boolean mustStop;

    /** The cause of this Exception. */
    private Exception cause;

    /** The silent flag. */
    private boolean silent;

    // -------------------------------------------------------------------------

    /**
     * Returns the value of the silent flag.
     * 
     * @return the silent flag
     * 
     */
    public boolean isSilent() {
        return silent;
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KiemInitializationException.
     * 
     * @param message the message of this Exception to display to the user
     * @param mustStopParam the must stop flag indicating if the execution must
     *            stop
     * @param causeParam the cause of this Exception if any, or null otherwise
     * @param isSilent sets the silent flag of this Exception to true/false
     */
    public KiemInitializationException(final String message,
            final boolean mustStopParam, final Exception causeParam,
            final boolean isSilent) {
        super(message);
        this.mustStop = mustStopParam;
        this.cause = causeParam;
        silent = isSilent;
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KiemInitializationException.
     * 
     * @param message the message of this Exception to display to the user
     * @param mustStopParam the must stop flag indicating if the execution must
     *            stop
     * @param causeParam the cause of this Exception if any, or null otherwise
     */
    public KiemInitializationException(final String message,
            final boolean mustStopParam, final Exception causeParam) {
        super(message);
        this.mustStop = mustStopParam;
        this.cause = causeParam;
        silent = false;
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
