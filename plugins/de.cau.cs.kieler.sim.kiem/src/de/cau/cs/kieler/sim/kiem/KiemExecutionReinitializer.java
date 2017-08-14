/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem;

/**
 * The KiemExecutionReinitializer class is able to reinitialize the execution if this was requested
 * before the last execution has finished.
 * 
 * @author cmot
 * @kieler.design 2012-12-08 proposed
 * @kieler.rating 2012-01-15 proposed
 * 
 */
public class KiemExecutionReinitializer implements Runnable {

    /** The cancelled flag. */
    private boolean cancelled = false;

    /**
     * A falg that tries to remember iff KIEM was paused. If KIEM was running then this flag should
     * be false, in this case KIEM will be started in run mode.
     */
    private boolean wasKiemExecutionPreviouslyPaused = true;

    /** While waiting sleep for SLEEP_WAIT milliseconds. */
    private static final int SLEEP_WAIT = 50;

    /** While waiting sleep for SLEEP_WAIT milliseconds. */
    private static final int SLEEP_WAIT_LONG = 1000;

    // -------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    public void run() {
        while (!cancelled) {
            pause();
            if (!cancelled) {
                // Check if KiemExecution is still running
                if (KiemPlugin.getDefault() != null) {
                    if (KiemPlugin.getDefault().getExecution() == null) {
                        // We now detected that KIEM has finished execution.
                        // Reset the flag and then initialize Kiem again
                        KiemPlugin.getDefault().resetRequestReRun(false);
                        pauseLong();
                        if (!cancelled) {
                            if (KiemPlugin.getDefault().initExecution()) {
                                if (!wasKiemExecutionPreviouslyPaused) {
                                    pauseLong();
                                    KiemPlugin.getDefault().getExecution().runExecutionSync();
                                }
                            }
                        }
                        // We have successfully re-started KIEM execution an can exit here
                        return;
                    } else {
                        wasKiemExecutionPreviouslyPaused = KiemPlugin.getDefault().getExecution()
                                .isPaused();
                    }
                }
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Pause the thread for SLEEP_WAIT milliseconds.
     */
    private void pause() {
        try {
            Thread.sleep(SLEEP_WAIT);
        } catch (InterruptedException e) {
            // Ignore sleep errors
        }

    }
    
    // -------------------------------------------------------------------------

    /**
     * Pause the thread for SLEEP_WAIT milliseconds.
     */
    private void pauseLong() {
        try {
            Thread.sleep(SLEEP_WAIT_LONG);
        } catch (InterruptedException e) {
            // Ignore sleep errors
        }

    }
    // -------------------------------------------------------------------------

    /**
     * Checks if is cancelled.
     * 
     * @return the cancelled
     */
    public boolean isCancelled() {
        return cancelled;
    }

    // -------------------------------------------------------------------------

    /**
     * Cancel the re-initialization request.
     * 
     */
    public void cancel() {
        this.cancelled = true;
    }

    // -------------------------------------------------------------------------
}
