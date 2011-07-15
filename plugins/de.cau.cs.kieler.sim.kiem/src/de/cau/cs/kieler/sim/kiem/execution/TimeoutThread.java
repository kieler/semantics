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

package de.cau.cs.kieler.sim.kiem.execution;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.Messages;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;

/**
 * The Class TimeoutThread. It is used to handle timeouts of methods implemented by DataComponents
 * during the execution. An instance of this class is designed to run in a concurrent worker thread.
 * Whenever the timeout method is called the timeout is activated. <BR>
 * <BR>
 * There are two possibilities to stop or deactivate the timeout when the component finished in
 * time:<BR>
 * 1. set another new timeout by calling
 * {@link #timeout(int, String, DataComponentWrapper, Execution)} again.<BR>
 * 2. reset the timeout by calling {@link #abortTimeout()}.<BR>
 * <BR>
 * <BR>
 * When a timeout is triggered then an error message is generated and the execution is stopped
 * immediately. Note that the execution manager only tries to stop all concurrent threads but cannot
 * guarantee that they really terminate in the end. <BR>
 * <BR>
 * If a timeout is triggered and the execution is stopped, the timeout thread itself also
 * terminates. <BR>
 * <BR>
 * A timeout must be at least 100ms (reasonable).
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2009-01-15 proposed yellow
 * 
 */
public class TimeoutThread extends Thread {

    /** The timeout lower bound. Ensures a reasonable timeout of >100ms. */
    private static final int TIMEOUT_LOWER_BOUND = 100;

    /** The timeout lower bound fragment. */
    private static final int TIMEOUT_FRAGMENT = 10;
    
    /** The timeout to count down (ms). */
    private int timeout;

    /** The active flag indicates that the timeout is active. */
    private boolean active;

    /** The execution link for stopping it in case of a triggered timeout. */
    private Execution execution;

    /**
     * The stop time is the time when the timeout will be triggered if not deactivated before.
     */
    private long stopTime;

    /** The abort flag indicates that the timeout should not be triggered. */
    private boolean abort;

    /**
     * The job description for the generated error message. This should be the job that is actually
     * encapsulated by the timeout.
     */
    private String jobDescription;

    /** The DataComponentWrapper which is observed by this timeout. */
    private DataComponentWrapper dataComponentWrapper;

    /** The terminate. Indicates that this thread should terminate. */
    private boolean terminate;

    /** Flag is true if currently awaiting user response. */
    private static boolean awaitUserResponse;


    // -------------------------------------------------------------------------

    /**
     * Instantiates a new timeout thread.
     */
    public TimeoutThread() {
        this.active = false;
        this.timeout = 0;
    }
    
    // -------------------------------------------------------------------------

    /**
     * Sets the await user repsonse flag. USE WITH CAUTION - this deactivates
     * any timeouts! 
     * 
     * @param awaitUserResponseParam
     *            the new await user repsonse
     */
    public static void setAwaitUserRepsonse(final boolean awaitUserResponseParam) {
        TimeoutThread.awaitUserResponse = awaitUserResponseParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether await user response is true.
     * 
     * @return true, if is await user response
     */
    public static boolean isAwaitUserResponse() {
        return TimeoutThread.awaitUserResponse;
    }

    // -------------------------------------------------------------------------

    /**
     * Activate as a new timeout. The jobDescription should hold information about the called
     * methods of the DataComponentWrapper.
     * 
     * @param timeoutParam
     *            the timeout in ms
     * @param jobDescriptionParam
     *            the job description
     * @param dataComponentWrapperParam
     *            the affected DataComponentWrapper
     * @param executionParam
     *            a link to the execution
     */
    public synchronized void timeout(final int timeoutParam, final String jobDescriptionParam,
            final DataComponentWrapper dataComponentWrapperParam, final Execution executionParam) {
        this.timeout = timeoutParam;
        // ensure timeout is reasonable! (not too small)
        if (this.timeout < TIMEOUT_LOWER_BOUND) {
            this.timeout = TIMEOUT_LOWER_BOUND;
        }
        this.execution = executionParam;
        this.abort = false;
        this.jobDescription = jobDescriptionParam;
        this.dataComponentWrapper = dataComponentWrapperParam;
        this.active = true;
        stopTime = System.currentTimeMillis() + this.timeout;
        this.notifyAll();
    }

    // -------------------------------------------------------------------------

    /**
     * Abort a timeout. This aborts the current timeout. Another way to abort a timeout is to simply
     * set a new one by calling the method
     * {@link #timeout(int, String, DataComponentWrapper, Execution)} .
     */
    public void abortTimeout() {
        this.abort = true;
    }

    // -------------------------------------------------------------------------

    /**
     * Terminates this thread by awaking it (if it is suspended). The {@link #run()} method will
     * terminate if it sees the {@link #terminate} flag to be true.
     */
    public synchronized void terminate() {
        this.terminate = true;
        this.notifyAll();
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Thread#run()
     */
    @Override
    public void run() {
        while (!terminate) {

            synchronized (this) {
                // only fall asleep if non-active
                // this prevents waiting when abortTimeout not was called
                // before a new call of the timeout method
                if (!this.active) {
                    try {
                        this.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // at this point timeout() was called and this.timeout has
                    // a value > 100
                }
            }

            while (!terminate && active) {
                // sleep for a tenth amount of time of the timeout
                try {
                    Thread.sleep(this.timeout / TIMEOUT_LOWER_BOUND);
                } catch (Exception e) {
                    // will otherwise try to sleep again
                }
                
                if (this.abort) {
                    // timeout aborted
                    this.active = false;
                } else if (this.terminate) {
                    // timeout thrad terminated
                    return;
                } else if (this.execution.getExecutionProgressMonitor().isCanceled()) {
                    this.execution.abortExecutionAsync();
                    // this also stops this thread
                    return;
                } else if (TimeoutThread.awaitUserResponse) {
                    // check if currently deactivated then reset time
                    while (TimeoutThread.awaitUserResponse) {
                        try {
                            Thread.sleep(TIMEOUT_FRAGMENT);
                        } catch (InterruptedException e) {
                            // Ignore thread errors because they are irrelevant here.
                        }
                        // set new stop time
                        stopTime = System.currentTimeMillis() + this.timeout;
                        continue;
                    }
                    
                } else if (System.currentTimeMillis() > stopTime) {
                    // timeout is triggered
                    this.execution.showError(
                            Messages.mErrorTimeoutExecution.replace("%JOBDESCRIPTION",
                                    this.jobDescription).replace("%COMPONENTNAME",
                                    dataComponentWrapper.getName()), KiemPlugin.PLUGIN_ID, null);
                    this.execution.errorTerminate();
                    // this also stops this thread
                    return;
                }
            } // end while active
        } // next while not terminated
    }

}
