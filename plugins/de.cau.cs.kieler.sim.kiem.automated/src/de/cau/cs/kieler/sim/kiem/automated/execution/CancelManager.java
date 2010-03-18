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
import de.cau.cs.kieler.sim.kiem.automated.KiemAutomatedPlugin;
import de.cau.cs.kieler.sim.kiem.config.data.KiemPropertyKeyWrapper;
import de.cau.cs.kieler.sim.kiem.config.managers.ConfigurationManager;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyException;

/**
 * Manager for everything related to the premature termination of the current
 * execution run.
 * 
 * @author soh
 * @kieler.rating 2010-02-08 proposed yellow
 */
public final class CancelManager {

    /**
     * The status of the operation.
     * 
     * @author soh
     * @kieler.rating 2010-02-17 proposed yellow
     */
    public enum CancelStatus {

        /** The operation was not canceled. */
        NOT_CANCELED,

        /** The user canceled the operation. */
        USER_CANCELED,

        /** The operation was canceled due to an error. */
        ERROR_CANCELED;
    }

    /** Singleton instance. */
    private static CancelManager instance = null;

    /**
     * The displacement from the KIEMs timeout, in order to cancel before KIEM
     * does.
     */
    public static final int DISPLACEMENT = 200;

    /** The timeout after which to cancel processing a step. */
    private static int timeout;

    /** True if the iteration was canceled by the user. */
    private CancelStatus userCanceledIteration = CancelStatus.NOT_CANCELED;
    /** True if the model file was canceled by the user. */
    private CancelStatus userCanceledModelFile = CancelStatus.NOT_CANCELED;
    /** True if the execution file was canceled by the user. */
    private CancelStatus userCanceledExecutionFile = CancelStatus.NOT_CANCELED;
    /** True if the execution was canceled by the user. */
    private CancelStatus userCanceledExecution = CancelStatus.NOT_CANCELED;

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
     * 
     * @param status
     *            the status that the operation was canceled with.
     */
    public void cancelIteration(final CancelStatus status) {

        if (AutomationManager.getInstance().isRunning()) {
            userCanceledIteration = status;
        }
    }

    /**
     * Determine whether or not the current iteration should be skipped.
     * 
     * @return the status of the operation
     */
    protected CancelStatus isIterationCanceled() {
        CancelStatus result = isModelFileCanceled();
        if (result == CancelStatus.NOT_CANCELED) {
            result = userCanceledIteration;
        }
        return result;
    }

    /**
     * Reset the cancel conditions.
     */
    protected void resetIterationCancel() {
        userCanceledIteration = CancelStatus.NOT_CANCELED;
    }

    // --------------------------------------------------------------------------

    /**
     * Cancel the currently running model file.
     * 
     * @param status
     *            the status of the operation
     */
    public void cancelModelFile(final CancelStatus status) {
        if (AutomationManager.getInstance().isRunning()) {
            userCanceledModelFile = status;
        }
    }

    /**
     * Determine whether or not the current model file should be skipped.
     * 
     * @return the status of the operation
     */
    protected CancelStatus isModelFileCanceled() {
        CancelStatus result = isExecutionFileCanceled();
        if (result == CancelStatus.NOT_CANCELED) {
            result = userCanceledModelFile;
        }
        return result;
    }

    /**
     * Reset the cancel conditions.
     */
    protected void resetModelFileCancel() {
        userCanceledModelFile = CancelStatus.NOT_CANCELED;
    }

    // --------------------------------------------------------------------------

    /**
     * Cancel the currently running execution file.
     * 
     * @param status
     *            the status of the operation
     */
    public void cancelExecutionFile(final CancelStatus status) {
        if (AutomationManager.getInstance().isRunning()) {
            userCanceledExecutionFile = status;
        }
    }

    /**
     * Determine whether or not the current execution file should be skipped.
     * 
     * @return the status of the operation
     */
    protected CancelStatus isExecutionFileCanceled() {
        CancelStatus result = isExecutionCanceled();
        if (result == CancelStatus.NOT_CANCELED) {
            result = userCanceledExecutionFile;
        }
        return result;
    }

    /**
     * Reset the cancel conditions.
     */
    protected void resetExecutionFileCancel() {
        userCanceledExecutionFile = CancelStatus.NOT_CANCELED;
    }

    // --------------------------------------------------------------------------

    /**
     * Cancel the currently running execution.
     * 
     * @param status
     *            the status of the operation
     */
    public void cancelExecution(final CancelStatus status) {
        if (AutomationManager.getInstance().isRunning()) {
            userCanceledExecution = status;
        }
    }

    /**
     * Determine whether or not the entire execution should be canceled.
     * 
     * @return the status of the operation
     */
    protected CancelStatus isExecutionCanceled() {
        CancelStatus result = monitor.isCanceled() ? CancelStatus.USER_CANCELED
                : CancelStatus.NOT_CANCELED;
        if (result == CancelStatus.NOT_CANCELED) {
            result = userCanceledExecution;
        }
        return result;
    }

    /**
     * Reset the cancel conditions.
     */
    protected void resetExecutionCancel() {
        userCanceledExecution = CancelStatus.NOT_CANCELED;
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

    /** The saved timeout. */
    private static int oldTimeout = -1;

    /**
     * Load the timeout from the KiemPlugin or use default value.
     * 
     */
    protected static void loadTimeout() {
        Integer providedTimeout = KiemPlugin.getDefault()
                .getIntegerValueFromProviders(KiemPlugin.TIMEOUT_ID);
        try {
            String ourTimeout = ConfigurationManager.getInstance()
                    .findPropertyValue(
                            new KiemPropertyKeyWrapper(
                                    KiemAutomatedPlugin.AUTO_TIMEOUT_ID),
                            KiemAutomatedPlugin.AUTO_TIMEOUT_DEFAULT + "");
            timeout = Integer.parseInt(ourTimeout);
        } catch (KiemPropertyException e0) {
            // can't happen as default value is supplied
        }
        if (providedTimeout != null) {
            oldTimeout = providedTimeout;
        }
        KiemPlugin.getDefault().notifyConfigurationProviders(
                KiemPlugin.TIMEOUT_ID, timeout + "");
        timeout -= DISPLACEMENT;
    }

    /**
     * Restore the saved timeout in KIEM.
     */
    protected static void restoreTimeout() {
        if (oldTimeout != -1) {
            KiemPlugin.getDefault().notifyConfigurationProviders(
                    KiemPlugin.TIMEOUT_ID, oldTimeout + "");
        }
        KiemPlugin.getDefault().getKIEMViewInstance().setDirty(false);
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
                CancelStatus status = CancelManager.getInstance()
                        .isExecutionCanceled();
                boolean cancel = status != CancelStatus.NOT_CANCELED;

                aborted = cancel || canceled || dif > timeout;

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
