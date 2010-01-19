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
 * The Class KiemExecutionException. This exception is used by DataComponents to flag errors within
 * their step() method during the execution. If the {@link #mustStop} flag is set to true, then this
 * means the execution *MUST* stop, and will be immediately stopped by the execution manager. Note
 * that the execution manager tries to stop all threads but cannot guarantee that they really
 * terminate (e.g., when a deadlock occurred). In the latter case there will be zombie threads but
 * the execution manager and the eclipse instance is not affected as long as the left memory is
 * still enough.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class KiemExecutionException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1645050957113020503L;

    /** The must stop flag indicating that the execution <B>MUST</B> be stopped. */
    private boolean mustStop;

    /** The must pause flag indicating that the execution <B>MUST</B> be paused. */
    private boolean mustPause;

    /**
     * The silent flag indicates that the component handles the "error" and KIEM should not display
     * any error or warning message.
     */
    private boolean silent;

    /** The cause of this Exception. */
    private Exception cause;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KiemExecutionException.
     * 
     * @param message
     *            the message of this Exception to display to the user
     * @param mustStopParam
     *            the must stop flag indicating if the execution must stop
     * @param causeParam
     *            the cause of this Exception if any, or null otherwise
     * @param mustPauseParam
     *            the must pause flag indicating if the execution must pause
     * @param silentParam
     *            the silent param flags that KIEM omits any message dialog
     */
    public KiemExecutionException(final String message, final boolean mustStopParam,
            final boolean mustPauseParam, final boolean silentParam, final Exception causeParam) {
        super(message);
        this.mustStop = mustStopParam;
        this.mustPause = mustPauseParam;
        this.silent = silentParam;
        this.cause = causeParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KiemExecutionException.
     * 
     * @param message
     *            the message of this Exception to display to the user
     * @param mustStopParam
     *            the must stop flag indicating if the execution must stop
     * @param causeParam
     *            the cause of this Exception if any, or null otherwise
     */
    public KiemExecutionException(final String message, final boolean mustStopParam,
            final Exception causeParam) {
        super(message);
        this.mustStop = mustStopParam;
        this.mustPause = false;
        this.silent = false;
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

    // -------------------------------------------------------------------------

    /**
     * Checks if the execution must pause when this Exception occurs.
     * 
     * @return true, if execution must stop
     */
    public boolean isMustPause() {
        return this.mustPause;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if KIEM should omit an error or warning message dialog when this Exception occurs.
     * 
     * @return true, if KIEM should omit any message dialog
     */
    public boolean isSilent() {
        return this.silent;
    }

    // -------------------------------------------------------------------------
}
