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
package de.cau.cs.kieler.sim.kiem.automated.execution;

import org.eclipse.core.runtime.IProgressMonitor;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;

/**
 * Manager for everything related to the premature termination of the current
 * execution run.
 * 
 * @author soh
 * @kieler.rating 2010-02-08 proposed yellow
 */
public final class CancelManager {

    /** Singleton instance. */
    private static CancelManager instance = null;

    /** The default timeout after which to cancel processing of a step. */
    private static final int DEFAULT_TIMEOUT = 4800;

    /**
     * The displacement from the KIEMs timeout, in order to cancel before KIEM
     * does.
     */
    public static final int DISPLACEMENT = 200;

    /** The timeout after which to cancel processing a step. */
    private static int timeout;

    /** True if the iteration was canceled by the user. */
    private boolean userCanceledIteration = false;
    /** True if the model file was canceled by the user. */
    private boolean userCanceledModelFile = false;
    /** True if the execution file was canceled by the user. */
    private boolean userCanceledExecutionFile = false;
    /** True if the execution was canceled by the user. */
    private boolean userCanceledExecution = false;

    /** The progress monitor that the user might use to cancel. */
    private IProgressMonitor monitor = null;

    // --------------------------------------------------------------------------

    /** Create a new instance. */
    private CancelManager() {

    }

    // --------------------------------------------------------------------------

    /**
     * Getter for the singleton instance.
     * 
     * @return the instance
     */
    public static synchronized CancelManager getInstance() {
        if (instance == null) {
            instance = new CancelManager();
        }
        return instance;
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * Cancel the currently running iteration.
     */
    public void cancelIteration() {
        if (AutomationManager.getInstance().isRunning()) {
            userCanceledIteration = true;
        }
    }

    /**
     * Determine whether or not the current iteration should be skipped.
     * 
     * @return true if it should be skipped
     */
    protected boolean isIterationCanceled() {
        return isModelFileCanceled() || userCanceledIteration;
    }

    /**
     * Reset the cancel conditions.
     */
    protected void resetIterationCancel() {
        userCanceledIteration = false;
    }

    // --------------------------------------------------------------------------

    /**
     * Cancel the currently running model file.
     */
    public void cancelModelFile() {
        if (AutomationManager.getInstance().isRunning()) {
            userCanceledModelFile = true;
        }
    }

    /**
     * Determine whether or not the current model file should be skipped.
     * 
     * @return true if it should be skipped
     */
    protected boolean isModelFileCanceled() {
        return isExecutionFileCanceled() || userCanceledModelFile;
    }

    /**
     * Reset the cancel conditions.
     */
    protected void resetModelFileCancel() {
        userCanceledModelFile = false;
    }

    // --------------------------------------------------------------------------

    /**
     * Cancel the currently running execution file.
     */
    public void cancelExecutionFile() {
        if (AutomationManager.getInstance().isRunning()) {
            userCanceledExecutionFile = true;
        }
    }

    /**
     * Determine whether or not the current execution file should be skipped.
     * 
     * @return true if it should be skipped
     */
    protected boolean isExecutionFileCanceled() {
        return isExecutionCanceled() || userCanceledExecutionFile;
    }

    /**
     * Reset the cancel conditions.
     */
    protected void resetExecutionFileCancel() {
        userCanceledExecutionFile = false;
    }

    // --------------------------------------------------------------------------

    /**
     * Cancel the currently running execution.
     */
    public void cancelExecution() {
        if (AutomationManager.getInstance().isRunning()) {
            userCanceledExecution = true;
        }
    }

    /**
     * Determine whether or not the entire execution should be canceled.
     * 
     * @return true if it should be canceled
     */
    protected boolean isExecutionCanceled() {
        return monitor.isCanceled() || userCanceledExecution;
    }

    /**
     * Reset the cancel conditions.
     */
    protected void resetExecutionCancel() {
        userCanceledExecution = false;
    }

    /**
     * Setter for the monitor.
     * 
     * @param monitorParam
     *            the monitor to set
     */
    public void setMonitor(final IProgressMonitor monitorParam) {
        this.monitor = monitorParam;
    }

    // --------------------------------------------------------------------------

    /**
     * Load the timeout from the KiemPlugin or use default value.
     * 
     */
    protected static void loadTimeout() {
        Integer providedTimeout = KiemPlugin.getDefault()
                .getIntegerValueFromProviders(KiemPlugin.TIMEOUT_ID);
        if (providedTimeout != null) {
            timeout = Math.max(providedTimeout - DISPLACEMENT, DISPLACEMENT);
        } else {
            timeout = DEFAULT_TIMEOUT;
        }
    }

    // --------------------------------------------------------------------------
    // --------------------------------------------------------------------------

    /**
     * This thread checks whether the user canceled the monitor while a step was
     * being processed. As soon as the user cancels the monitor it notifies the
     * main thread to come out of sleep which will then start the process of
     * deferred cancellation.
     * 
     * @author soh
     * @kieler.rating 2010-02-02 proposed yellow
     */
    public static class MonitorChecker extends Thread {

        /** The interval at which the monitor is checked. */
        private static final int CHECK_INTERVAL = 100;

        /** True if a deferred cancellation should happen. */
        private boolean canceled = false;

        /** The time at which the thread started to check for timeout. */
        private long startTime = System.currentTimeMillis();

        /**
         * 
         * {@inheritDoc}
         */
        @Override
        public void run() {
            boolean aborted = false;
            while (!aborted) {
                long dif = System.currentTimeMillis() - startTime;
                aborted = CancelManager.getInstance().isExecutionCanceled()
                        || canceled || dif > timeout;

                try {
                    // wait a while before trying again
                    Thread.sleep(CHECK_INTERVAL);
                } catch (InterruptedException e0) {
                    // don't want to cause a lock-up
                    aborted = true;
                }
            }
            if (!canceled) {
                AutomationManager.getInstance().notifyOnStepFinished();
            }
        }

        /**
         * Deferred cancellation of this thread.
         */
        public void cancel() {
            canceled = true;
        }

        /**
         * Reset the timer for measuring the timeout.
         */
        public void reset() {
            startTime = System.currentTimeMillis();
        }
    }

}
