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

import java.util.List;

import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemEvent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
import de.cau.cs.kieler.sim.kiem.internal.EventManager;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * The Class Execution. This is the base class for the whole execution. It creates and manages the
 * worker threads for pure observer and pure producer components. It also implements the scheduling
 * between all components. Additionally it manages a timeout component that checks whether a
 * component-method exceeds the maximum timeout and then terminates all executions w/ an error log
 * message.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2009-01-15 proposed yellow
 * 
 */
public class Execution extends Job {

    /** Timeout for DataComponents. */
    private TimeoutThread timeout;

    /** The Constant TIMEOUT multiplicity. 10x times the aimed step duration. */
    private static final int TIMEOUTMULTIPLICITY = 10;

    /** The Constant HEAPERRORMESSAGE as an error message when threads cannot be created. */
    private static final String HEAPERRORMESSAGE = "Out of heap memory. Cannot create dynamic execution" 
                                                 + " threads. You're suggested to restart the program.";

    // /** The TIMEOUT for DataComponents. */
    // private static int TIMEOUT;
    // currently calculated on the fly, see getTimeout()

    /** Delay to wait in paused state in ms. */
    private static final int PAUSE_DEYLAY = 50;

    /** Defines the number of steps in run mode. */
    private static final int INFINITY_STEPS = -2;

    /** Defines the number of steps of normal forward step. */
    private static final int FORWARD_STEP = 1;

    /** Defines the number of steps when user makes step backwards. */
    private static final int BACKWARD_STEP = -1;

    /** Defines the number of steps in pause mode. */
    private static final int NO_STEPS = 0;

    /** The job monitor (Progress view) that can be canceled by the user. */
    private IProgressMonitor executionProgressMonitor;

    /**
     * The Constant SECOND_WAITTIMEOUT indicates how long to sleep until changes in aimed step
     * durations are guaranteed to be processed.
     */
    private static final int SECOND_WAITTIMEOUT = 1000;

    /**
     * Basic DataComponentList of all enabled (and disabled) DataComponents.
     */
    private List<DataComponentWrapper> dataComponentWrapperList;

    /** The Intended duration of a step. */
    private int aimedStepDuration;

    /** While execution is up and running isRunning is true. */
    private boolean isStarted = false;

    /**
     * The step to perform can be NO_STEPS in pause mode or INFINITY_STEPS in run mode or
     * FORWARD_STEP / BACKWARD_STEP.
     */
    private long steps;

    /** The step when to pause execution. -1 if never pause */
    private long stepToPause;

    /** Indicates paused command. */
    private boolean pausedCommand;

    /** Flag that indicates the termination (from outside). */
    private boolean stop;

    /** The step duration (for time measurement). */
    private int stepDuration;

    /** The maximum step duration (for time measurement). */
    private int maximumStepDuration;

    /** The minimum step duration (for time measurement). */
    private int minimumStepDuration;

    /** The weighted average step duration (for time measurement). */
    private int weightedAverageStepDuration;

    /** The accumulated step durations (for time measurement). */
    private long accumulatedStepDurations;

    /** The accumulated pause durations (for time measurement). */
    private long accumulatedPlauseDurations;

    /** The execution start time (for time measurement). */
    private long executionStartTime;

    /** The step counter. Is advanced in {@link #FORWARD_STEP} */
    private long stepCounter;

    /**
     * The step counter max. By default this is equal to stepCounter. In case of history steps:
     * stepCount <= stepCounterMax.
     */
    private long stepCounterMax;

    /** Remember whether last step was the most current step. */
    private boolean lastStepIsMostCurrent;

    /** The data pool. */
    private JSONDataPool dataPool;

    /** Threads for observers. */
    private ObserverExecution[] observerExecutionArray;

    /** Threads for producers. */
    private ProducerExecution[] producerExecutionArray;

    /** The event manager to handle notification of DataComponents. */
    private EventManager eventManager;

    // -------------------------------------------------------------------------

    /**
     * Checks whether isStarted is true. This is the case whenever the execution is up an running
     * (already initialized and not aborted yet).
     * 
     * @return true, if is started
     */
    public boolean isStarted() {
        return this.isStarted;
    }

    // -------------------------------------------------------------------------

    /**
     * Tries to get the Timeout from the plugins content providers. <BR>
     * <BR>
     * If that fails the timeout is the TIMEOUTMULTIPLICITY x aimedStepDuration but minimally a
     * timeout of Execution.SECOND_WAITTIMEOUT. In this case the plugins content providers are
     * notified of the default timeout value.
     * 
     * author: soh
     * 
     * @return the timeout
     */
    private int getTimeout() {
        try {
            Integer providedTimeout = KiemPlugin.getDefault().getIntegerValueFromProviders(
                    KiemPlugin.TIMEOUT_ID);
            if (providedTimeout != null) {
                return providedTimeout;
            } else {
                int aimedStepDurationTmp = KiemPlugin.getDefault().getAimedStepDuration();
                int returnValue = Execution.TIMEOUTMULTIPLICITY * aimedStepDurationTmp;
                if (returnValue < Execution.SECOND_WAITTIMEOUT) {
                    returnValue = Execution.SECOND_WAITTIMEOUT;
                }
                KiemPlugin.getDefault().notifyConfigurationProviders(KiemPlugin.TIMEOUT_ID,
                        returnValue + "");
                return (returnValue);
            }
        } catch (Exception e) {
            return Execution.SECOND_WAITTIMEOUT;
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates and starts a new execution (thread).
     *
     * @param dataComponentWrapperListParam the current DataComponentWrapper
     * @param eventManagerParam the evenet manager param
     * @throws KiemInitializationException the kiem initialization exception
     */
    public Execution(final List<DataComponentWrapper> dataComponentWrapperListParam,
            final EventManager eventManagerParam) throws KiemInitializationException {
        super("KIEM Execution");

        // suggest calling the garbage collector: this may
        // remove any DataComponent threads still running (but not
        // linked==needed any more)
        System.gc();

        isStarted = false;
        this.eventManager = eventManagerParam;
        this.aimedStepDuration = KiemPlugin.AIMED_STEP_DURATION_DEFAULT;
        this.stop = false;
        this.pausedCommand = false;
        this.steps = NO_STEPS; // == paused
        this.stepToPause = -1;
        this.dataComponentWrapperList = dataComponentWrapperListParam;
        this.dataPool = new JSONDataPool();
        // start the timeout worker thread
        this.timeout = new TimeoutThread();
        this.timeout.start();
        observerExecutionArray = new ObserverExecution[this.dataComponentWrapperList.size()];
        producerExecutionArray = new ProducerExecution[this.dataComponentWrapperList.size()];

        try {
            // for each pure observer ... create ObserverExecution Thread
            // for each pure producer ... create ProducerExecution Thread
            for (int c = 0; c < dataComponentWrapperListParam.size(); c++) {
                DataComponentWrapper dataComponentWrapper = dataComponentWrapperListParam.get(c);
                // reset delta index
                this.dataComponentWrapperList.get(c).setDeltaIndex(0);
                // reset pool indices
                this.dataComponentWrapperList.get(c).resetPoolIndices();
                timeout.timeout(getTimeout(), "isEnabled, isObserver, isProducer",
                        dataComponentWrapper, this);
                if (dataComponentWrapper.isEnabled()) {
                    if (dataComponentWrapper.isObserverOnly()) {
                        // pure Observer
                        observerExecutionArray[c] = new ObserverExecution(
                                dataComponentWrapper.getDataComponent(), this);
                        (new Thread(observerExecutionArray[c])).start();
                    } else if (dataComponentWrapper.isProducerOnly()) {
                        // pure Producer
                        producerExecutionArray[c] = new ProducerExecution(
                                dataComponentWrapper.getDataComponent(), this);
                        (new Thread(producerExecutionArray[c])).start();
                    }
                }
                timeout.abortTimeout();
            }
            // update the depending views
            eventManager.notify(new KiemEvent(KiemEvent.VIEW_REFRESH));
            // execution starts
            eventManager.notify(new KiemEvent(KiemEvent.EXECUTION_START));
        } catch (OutOfMemoryError e) {
            KiemPlugin.getDefault().showError(HEAPERRORMESSAGE, KiemPlugin.PLUGIN_ID,
                    new Exception(e), false);
            errorCleanUp();
            throw new KiemInitializationException(HEAPERRORMESSAGE, true, new Exception(e));
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the data pool. Be careful with using the DataPool after starting the thread!
     * 
     * @return the data pool
     */
    public JSONDataPool getDataPool() {
        return this.dataPool;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the currently set aimed step duration.
     * 
     * @return the step duration
     */
    public int getStepDuration() {
        return stepDuration;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the measured maximum step duration.
     * 
     * @return the maximum step duration
     */
    public int getMaximumStepDuration() {
        return maximumStepDuration;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the measured minimum step duration.
     * 
     * @return the minimum step duration
     */
    public int getMinimumStepDuration() {
        return minimumStepDuration;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the measured weighted average step duration.
     * 
     * @return the weighted average step duration
     */
    public int getWeightedAverageStepDuration() {
        return weightedAverageStepDuration;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the measured average step duration.
     * 
     * @return the average step duration
     */
    public int getAverageStepDuration() {
        int returnValue;
        try {
            returnValue = (int) (this.accumulatedStepDurations / this.stepCounter);
        } catch (Exception e) {
            // handle null case
            returnValue = 0;
        }
        return returnValue;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the execution start time.
     * 
     * @return the execution start time
     */
    public long getExecutionStartTime() {
        return executionStartTime;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the execution duration.
     * 
     * @return the execution duration
     */
    public long getExecutionDuration() {
        return System.currentTimeMillis() - executionStartTime - accumulatedPlauseDurations;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the current step.
     * 
     * @return the step
     */
    public long getSteps() {
        return this.stepCounter;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the maximum step. This usually not differs by more than 1 from the current step (
     * 
     * @return the maximum step {@link #getSteps()}), unless the current step is a history step.
     */
    public long getMaximumSteps() {
        return this.stepCounterMax;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether the current step is a history step.
     * 
     * @return true, if the current step is a history step
     */
    public boolean isHistoryStep() {
        if (lastStepIsMostCurrent) {
            return (this.stepCounter < this.stepCounterMax);
        } else {
            return (this.stepCounter <= this.stepCounterMax);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the aimed step duration. This is usually called from outside during the execution, if
     * the user modifies the value in the GUI.
     * 
     * @param aimedStepDurationParam
     *            the new aimed step duration
     */
    public void setAimedStepDuration(final int aimedStepDurationParam) {
        this.aimedStepDuration = aimedStepDurationParam;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the last set and currently used aimed step duration.
     * 
     * @return the aimed step duration
     */
    public int getAimedStepDuration() {
        return this.aimedStepDuration;
    }

    // -------------------------------------------------------------------------

    /**
     * Step execution to the specific, user defined step number and pause. If this is a step number
     * in the future then run the execution until the stepCounter has reached this number. If this
     * is a step number in the history, then just jump (backwards/forwards) to it.
     * 
     * @param step
     *            the step to jump/run to
     * 
     * @return true, if step is being processed
     */
    public boolean stepExecutionPause(final long step) {
        // if invalid step number return false
        if (step < 1) {
            return false;
        }
        if (this.stop) {
            return false;
        }
        // if this is already the current step
        if (step == this.stepCounter) {
            return true;
        }
        if (step > this.stepCounterMax) {
            if (step == this.stepCounter + 1) {
                // if just one step to make and return
                return this.stepExecutionSync();
            }

            if (this.stepCounter < this.stepCounterMax) {
                // first go to most current step
                // do this so that delta observers do not get confused!
                this.stepCounter = this.stepCounterMax - 1;
                this.stepExecutionSync();
                this.steps = NO_STEPS;
            }
            // run (forward steps) until step is reached
            this.stepToPause = step;
            this.runExecutionSync();
            // update the GUI
            eventManager.notify(new KiemEvent(KiemEvent.VIEW_REFRESH));
            return true;
        } else if (step == this.stepCounterMax) {
            // this is the most current step
            // walk until just before and then make a forward step
            this.stepCounter = step - 1;
            return this.stepExecutionSync();
        } else {
            // this is any step before the most current one
            // walk just behind it and then make a backward step
            this.stepCounter = step + 1;
            return this.stepBackExecutionSync();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Run execution to the specific, user defined step number and pause. If this is a step number
     * in the future then run the execution until the stepCounter has reached this number. If this
     * is a step number back in the history, then just jump to it. If this is a step number
     * somewhere later in the history, then also run to it.
     * 
     * @param step
     *            the step to jump/run to
     * 
     * @return true, if step is being processed
     */
    public boolean runExecutionPause(final long step) {
        // if invalid step number return false
        if (step < 0) {
            return false;
        }
        if (this.stop) {
            return false;
        }
        // if this is already the current step
        if (step == this.stepCounter) {
            return true;
        }
        if (step > this.stepCounter) {
            if (step == this.stepCounter + 1) {
                // if just one step to make and return
                return this.stepExecutionSync();
            }

            // run (forward steps) until step is reached
            this.stepToPause = step;
            this.runExecutionSync();
            // update the GUI
            eventManager.notify(new KiemEvent(KiemEvent.VIEW_REFRESH));
            return true;
        } else {
            // JUMP backwards here because we cant run backwards
            // this is any step before the most current one
            // walk just behind it and then make a backward step
            this.stepCounter = step + 1;
            return this.stepBackExecutionSync();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Make a backward execution step. Because we do not want to block the GUI or a calling master
     * component, if the currently processed step is not yet done, this method returns false and no
     * processes another step. Otherwise, if the last step was already processed, the method will
     * schedule the next step but will return asynchronously. It will first synchronously inform all
     * components about the step command.
     * 
     * @return true, if step is being processed
     */
    public boolean stepBackExecutionSync() {
        // cannot make steps back in this case
        if (this.getSteps() <= 1) {
            return false;
        }

        // do not block if currently doing step
        if (this.steps != NO_STEPS) {
            return false;
        }
        if (this.stop) {
            return false;
        }

        synchronized (this) {
            if (this.steps == NO_STEPS) {
                // notify components
                // TODO: dubious code, to be deleted
                // for (int c = 0; c < this.dataComponentWrapperList.size();
                // c++) {
                // DataComponentWrapper dataComponentWrapper =
                // dataComponentWrapperList.get(c);
                // timeout.timeout(getTimeout(), "isEnabled, isHistoryObserver",
                // dataComponentWrapper, this);
                // if (dataComponentWrapper.isEnabled()
                // // HISTORY COMPONENTS ONLY//
                // && dataComponentWrapper.isHistoryObserver()) {
                // timeout.timeout(getTimeout(), "commandStep",
                // dataComponentWrapper, this);
                // // dataComponentWrapper.getDataComponent().commandStep();
                // }
                // timeout.abortTimeout();
                // }
                if (eventManager != null) {
                    eventManager.notify(KiemEvent.CMD_STEP_BACK);
                }
                // make one step backward
                this.steps = BACKWARD_STEP;
                // update the GUI
                eventManager.notify(new KiemEvent(KiemEvent.VIEW_REFRESH));
            } else {
                return false; // skip in this case make NO step
            }
        }
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * Make a forward execution step. Because we do not want to block the GUI or a calling master
     * component, if the currently processed step is not yet done, this method returns false and no
     * processes another step. Otherwise, if the last step was already processed, the method will
     * schedule the next step but will return asynchronously. It will first synchronously inform all
     * components about the step command.
     * 
     * @return true, if step is being processed
     */
    public boolean stepExecutionSync() {
        // do not block if currently doing step
        if (this.steps != NO_STEPS) {
            return false;
        }
        if (this.stop) {
            return false;
        }

        synchronized (this) {
            if (this.steps == NO_STEPS) {
                if (eventManager != null) {
                    eventManager.notify(KiemEvent.CMD_STEP);
                }
                // make one step forward
                this.steps = FORWARD_STEP;
                // update the GUI
                eventManager.notify(new KiemEvent(KiemEvent.VIEW_REFRESH));
            } else {
                return false; // skip in this case make NO step
            }
        }
        return true;
    }

    // -------------------------------------------------------------------------

    // TODO: implement macro step execution
    /**
     * Macro step execution sync. <BR>
     * <BR>
     * <B>NOTE: This method has not been implemented yet!</B>
     */
    public void macroStepExecutionSync() {
        this.stepExecutionSync();
    }

    // -------------------------------------------------------------------------

    /**
     * Pauses the execution. The pauseCommand flag is set to true to immediately pause the
     * execution. Before the steps are being set to {@link #NO_STEPS} the DataComponents are
     * informed about the pause command.
     */
    public void pauseExecutionSync() {
        if (this.stop) {
            return;
        }
        pausedCommand = true;

        synchronized (this) {
            // notify components
            // TODO: dubious code, to be deleted
            // for (int c = 0; c < this.dataComponentWrapperList.size(); c++) {
            // DataComponentWrapper dataComponentWrapper =
            // dataComponentWrapperList.get(c);
            // timeout.timeout(getTimeout(), "isEnabled", dataComponentWrapper,
            // this);
            // if (dataComponentWrapper.isEnabled()) {
            // timeout.timeout(getTimeout(), "commandPause",
            // dataComponentWrapper, this);
            // // dataComponentWrapper.getDataComponent().commandPause();
            // }
            // timeout.abortTimeout();
            // }
            if (eventManager != null) {
                eventManager.notify(KiemEvent.CMD_PAUSE);
            }
            this.steps = NO_STEPS;
            // update the GUI
            eventManager.notify(new KiemEvent(KiemEvent.VIEW_REFRESH));
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Runs the execution. The pausedCommand flag is set to false and the steps are being set to
     * infinity, which is interpreted by the
     * {@link de.cau.cs.kieler.sim.kiem.execution.Execution#run(IProgressMonitor)} method. Before
     * that is done the DataComponents are informed about the run command.
     */
    public synchronized void runExecutionSync() {
        if (this.stop) {
            return;
        }
        pausedCommand = false;

        synchronized (this) {
            // notify components
            // TODO: dubious code, to be deleted
            // for (int c = 0; c < this.dataComponentWrapperList.size(); c++) {
            // DataComponentWrapper dataComponentWrapper =
            // dataComponentWrapperList.get(c);
            // timeout.timeout(getTimeout(), "isEnabled", dataComponentWrapper,
            // this);
            // if (dataComponentWrapper.isEnabled()) {
            // timeout.timeout(getTimeout(), "commandRun", dataComponentWrapper,
            // this);
            // // dataComponentWrapper.getDataComponent().commandRun();
            // }
            // timeout.abortTimeout();
            // }
            if (eventManager != null) {
                eventManager.notify(KiemEvent.CMD_RUN);
            }
        }
        this.steps = INFINITY_STEPS; // indicates run mode
        // update the GUI
        eventManager.notify(new KiemEvent(KiemEvent.VIEW_REFRESH));
    }

    // -------------------------------------------------------------------------

    /**
     * Stops the execution. In this case the stop flag is immediately set so that no further step is
     * made. The data components are then being informed about the stop command. For safety reasons
     * we again set the stop flag in synchronized monitor of this object and then stop all worker
     * threads that where started. The latter includes the timeout thread.
     */
    public void stopExecutionSync() {
        // not synchronized to stop immediately w/o queuing
        this.steps = NO_STEPS;
        this.stop = true;
        this.stepToPause = -1;

        synchronized (this) {
            // notify components
            // TODO: dubious code, to be deleted
            // for (int c = 0; c < this.dataComponentWrapperList.size(); c++) {
            // DataComponentWrapper dataComponentWrapper =
            // dataComponentWrapperList.get(c);
            // timeout.timeout(getTimeout(), "isEnabled", dataComponentWrapper,
            // this);
            // if (dataComponentWrapper.isEnabled()) {
            // timeout.abortTimeout();
            // timeout.timeout(getTimeout(), "commandStop",
            // dataComponentWrapper, this);
            // // dataComponentWrapper.getDataComponent().commandStop();
            // timeout.abortTimeout();
            // }
            // timeout.abortTimeout();
            // }
            if (eventManager != null) {
                eventManager.notify(KiemEvent.CMD_STOP);
            }

            // for safety reasons do this synchronized again
            this.stop = true;
            this.steps = NO_STEPS;
            // stop all child execution threads
            for (int c = 0; c < this.dataComponentWrapperList.size(); c++) {
                // reset delta index
                this.dataComponentWrapperList.get(c).setDeltaIndex(0);
                // reset pool indices
                this.dataComponentWrapperList.get(c).resetPoolIndices();
                if (this.observerExecutionArray[c] != null) {
                    this.observerExecutionArray[c].stopExecution();
                }
                if (this.producerExecutionArray[c] != null) {
                    this.producerExecutionArray[c].stopExecution();
                }
            }
        }

        // (Job {
        // public void run() {
        // wrapup components
        wrapupComponents(false);
        // }
        // };).s

        // stop timeout thread
        this.timeout.terminate();

        // must notify the view here, because job can be canceled directly (or
        // remotely by other
        // plug-in)
        KiemPlugin.getDefault().setExecution(null);
        // execution stops
        eventManager.notify(new KiemEvent(KiemEvent.EXECUTION_STOP));
        // update the GUI
        eventManager.notify(new KiemEvent(KiemEvent.VIEW_REFRESH));

        errorCleanUp();
    }

    // -------------------------------------------------------------------------

    /**
     * Aborts the execution. In this case the stop flag is immediately set so that no further step
     * is made. The data components are then being informed about the stop command. For safety
     * reasons we again set the stop flag in synchronized monitor of this object and then stop all
     * worker threads that where started. The latter includes the timeout thread.
     */
    public void abortExecutionAsync() {
        // stop timeout thread
        this.timeout.terminate();

        // terminate
        this.errorTerminate();

        // must notify the view here, because job can be canceled directly (or
        // remotely by other
        // plug-in)
        KiemPlugin.getDefault().setExecution(null);
        // update the GUI
        eventManager.notify(new KiemEvent(KiemEvent.VIEW_REFRESH));
        // execution stops
        eventManager.notify(new KiemEvent(KiemEvent.EXECUTION_STOP));
    }

    // -------------------------------------------------------------------------

    // public void stepExecutionAsync() {
    // Thread asyncStep = new Thread() {
    // public void run() {
    // stepExecutionSync();
    // }
    // };
    // asyncStep.start();
    // }
    //
    // public void macroStepExecutionAsync() {
    // Thread asyncStep = new Thread() {
    // public void run() {
    // macroStepExecutionSync();
    // }
    // };
    // asyncStep.start();
    // }
    //
    // public void runExecutionAsync() {
    // Thread asyncStep = new Thread() {
    // public void run() {
    // runExecutionSync();
    // }
    // };
    // asyncStep.start();
    // }
    //
    // public void pauseExecutionAsync() {
    // Thread asyncStep = new Thread() {
    // public void run() {
    // pauseExecutionSync();
    // }
    // };
    // asyncStep.start();
    // }
    //
    // public void stopExecutionAsync() {
    // Thread asyncStep = new Thread() {
    // public void run() {
    // stopExecutionSync();
    // }
    // };
    // asyncStep.start();
    // }

    // -------------------------------------------------------------------------

    /**
     * Only returns true if no more steps have to be done (forward AND backward). This is *NOT*
     * necessary equivalent to the term "!isRunning()"!
     * 
     * @return true, if is no further steps have to be done
     */
    public boolean isPaused() {
        return (steps == NO_STEPS);
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if the execution is in run mode. This means forward steps are produced automatically
     * with the given (aimed) step duration.
     * 
     * @return true, if execution is running
     */
    public boolean isRunning() {
        return (steps == INFINITY_STEPS);
    }

    // -------------------------------------------------------------------------

    /**
     * Terminates the execution in case of an error. This will also (try) to terminate all created
     * helper threads. They may not finish immediately and in case of a deadlock they won't do so
     * ever, but the user will get a response. This function is called by the TimeoutThread. Hence
     * the call of this method should only happen during the development of a new component.
     */
    public void errorTerminate() {
        // stop this execution thread immediately
        this.steps = NO_STEPS;
        this.stop = true;
        // release the object
        KiemPlugin.getDefault().setExecution(null);
        // execution stops
        eventManager.notify(new KiemEvent(KiemEvent.EXECUTION_STOP));
        // update the view
        eventManager.notify(new KiemEvent(KiemEvent.VIEW_REFRESH));
        // wrapup components
        wrapupComponents(true);
        // try to stop all components, no blocking stopExecution() call
        for (int c = 0; c < this.dataComponentWrapperList.size(); c++) {
            dataComponentWrapperList.get(c).setDeltaIndex(0);
            if (this.observerExecutionArray[c] != null) {
                this.observerExecutionArray[c].stopExecution();
            }
            if (this.producerExecutionArray[c] != null) {
                this.producerExecutionArray[c].stopExecution();
            }
        }
        errorCleanUp();
    }

    // -------------------------------------------------------------------------

    private void errorCleanUp() {
        // try to stop all components, no blocking stopExecution() call
        for (int c = 0; c < this.dataComponentWrapperList.size(); c++) {
            if (this.observerExecutionArray[c] != null) {
                this.observerExecutionArray[c] = null;
            }
            if (this.producerExecutionArray[c] != null) {
                this.observerExecutionArray[c] = null;
            }
        }
        // suggest calling the garbage collector: this may
        // remove any DataComponent threads still running (but not
        // linked==needed any more)
        System.gc();
    }

    // -------------------------------------------------------------------------

//TODO: is this always right? It seems to be wrong to depend on the garbage 
// collector (cmot, 11.06.2012)
//    /*
//     * (non-Javadoc)
//     * 
//     * @see java.lang.Object#finalize()
//     */
//    @Override
//    protected void finalize() {
//        errorTerminate();
//    }

    // -------------------------------------------------------------------------

    /**
     * Wrap-up components after execution was stopped. The quietmode should only be used if the
     * wrapupComponents is called by the handleComponentError to not get any recusive call!
     * 
     * @param quietmode
     *            the quiet mode omits any errors
     */
    public synchronized void wrapupComponents(final boolean quietmode) {
        for (int c = 0; c < this.dataComponentWrapperList.size(); c++) {
            DataComponentWrapper dataComponentWrapper = dataComponentWrapperList.get(c);
            if (dataComponentWrapper.isEnabled()) {
                timeout.timeout(getTimeout(), "wrapup", dataComponentWrapper, this);
                try {
                    dataComponentWrapper.getDataComponent().wrapup();
                } catch (KiemInitializationException e) {
                    timeout.abortTimeout();
                    if (!quietmode) {
                        KiemPlugin.handleComponentError(dataComponentWrapper.getDataComponent(), e);
                    }
                }
                timeout.abortTimeout();
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Reset all timing variables.
     */
    private void resetTimingVariables() {
        this.executionStartTime = System.currentTimeMillis();
        this.maximumStepDuration = 0;
        this.minimumStepDuration = -1; // infinity
        this.weightedAverageStepDuration = 0;
        this.accumulatedStepDurations = 0;
        this.accumulatedPlauseDurations = 0;
        this.stepCounter = 0;
        this.stepCounterMax = 0;
        this.stepDuration = 0;
        this.lastStepIsMostCurrent = true;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the input data for a DataComponent that is an observer. If the history flag is set
     * (hence the current step is a history step) then this component will get the full data.
     * Otherwise the isDeltaObserver() method is inspected to find out if the DataComponent only
     * wants the delta data between the last call.
     * 
     * @param dataComponentWrapper
     *            DataComponent to get the data for
     * 
     * @return the input data
     * 
     * @throws JSONException
     *             a JSONException
     */
    private JSONObject getInputData(final DataComponentWrapper dataComponentWrapper)
            throws JSONException {
        timeout.timeout(getTimeout(), "provideFilterKeys", dataComponentWrapper, this);
        String[] filterKeys = dataComponentWrapper.provideFilterKeys();
        timeout.abortTimeout();

        JSONObject oldData = null;

        long lastPoolCounter = dataComponentWrapper.getDeltaIndex();

        if (this.isHistoryStep()) {
            // flag as a history step
            dataComponentWrapper.setHistoryStep(true);

            // this is a history step - always send full data
            long oldPoolCounter = dataComponentWrapper.getPoolIndex(this.getSteps());
            oldData = this.dataPool.getData(filterKeys, oldPoolCounter);
        } else {
            // flag as NOT history step
            dataComponentWrapper.setHistoryStep(false);

            // this is a new step
            if (dataComponentWrapper.isDeltaObserver()) {
                oldData = this.dataPool.getDeltaData(filterKeys, lastPoolCounter);
            } else {
                oldData = this.dataPool.getData(filterKeys);
            }

            // set pool index (for later going back in history)
            dataComponentWrapper.addPoolIndex(this.dataPool.getPoolCounter(), this.getSteps());
        }

        return oldData;
    }

    // -------------------------------------------------------------------------

    /**
     * Makes step of an observer AND producer data component. This is not sourced out into a
     * separate thread because it is made in a blocking sense.
     * 
     * @param dataComponentWrapper
     *            the data component which should make a step
     * @return true, if successful
     * @throws JSONException
     *             a JSONException
     */
    private boolean makeStepObserverProducer(final DataComponentWrapper dataComponentWrapper)
            throws JSONException {
        JSONObject oldData;

        // get the current input data according to the current step
        oldData = getInputData(dataComponentWrapper);
        // System.out.println(dataComponentWrapper.getName() + ":" +
        // oldData.toString());

        // decide to make a step depending on the type of component
        // (JSONString or JSONObject)
        timeout.timeout(getTimeout(), "step", dataComponentWrapper, this);
        if (dataComponentWrapper.isJSON()) {
            // JSONObject component
            JSONObject newData = null;
            try {
                newData = ((JSONObjectDataComponent) dataComponentWrapper.getDataComponent())
                        .step(oldData);
            } catch (KiemExecutionException e) {
                timeout.abortTimeout();
                KiemPlugin.handleComponentError(dataComponentWrapper.getDataComponent(), e);
                return false;
            }

            // only put in data pool if no history step
            if (!this.isHistoryStep()) {
                this.dataPool.putData(newData);
            }
        } else {
            // JSONString component
            String newData = null;
            try {
                newData = ((JSONStringDataComponent) dataComponentWrapper.getDataComponent())
                        .step(oldData.toString());
            } catch (KiemExecutionException e) {
                timeout.abortTimeout();
                KiemPlugin.handleComponentError(dataComponentWrapper.getDataComponent(), e);
                return false;
            }
            JSONObject newJsonData = null;
            if (newData != null && newData != "") {
                newJsonData = new JSONObject(newData);
            }

            // only put in data pool if no history step
            if (!this.isHistoryStep()) {
                this.dataPool.putData(newJsonData);
            }
        }
        timeout.abortTimeout();
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the progress monitor.that the user may have canceled.
     * 
     * @return the progress monitor
     */
    public IProgressMonitor getExecutionProgressMonitor() {
        return this.executionProgressMonitor;
    }

    // -------------------------------------------------------------------------

    /**
     * Run.
     * 
     * @param monitor
     *            the monitor
     * @return the i status {@inheritDoc}
     */
    protected IStatus run(final IProgressMonitor monitor) {
        this.executionProgressMonitor = monitor;

        synchronized (this) {
            // this returns stepCounter and historyStepCounter and all other
            // timing variables
            resetTimingVariables();
        }

        // here it is eligible to assume that initialization passed w/o any
        // errors
        isStarted = true;

        try {
            while (!this.stop) {

                long starttime = System.currentTimeMillis();
                long endtime = System.currentTimeMillis();

                synchronized (this) {
                    // pause if pause step is reached
                    if (this.stepCounter == this.stepToPause) {
                        // cancel stepPause
                        this.stepToPause = -1;
                        this.pauseExecutionSync();
                        // update the GUI
                        eventManager.notify(new KiemEvent(KiemEvent.VIEW_REFRESH));
                    }

                    // test if we have to make a step (1) or if we are
                    // in running mode (-1)
                    // System.out.println("steps = "+steps);
                    if ((steps == INFINITY_STEPS) || (steps != NO_STEPS)) {

                        // make a step forward or backward according to steps
                        if ((steps == FORWARD_STEP) || (steps == INFINITY_STEPS)) {
                            if (this.stepCounter == this.stepCounterMax) {
                                lastStepIsMostCurrent = true;
                            } else {
                                lastStepIsMostCurrent = false;
                            }
                            // make a step forward
                            this.stepCounter++;
                        } else {
                            lastStepIsMostCurrent = false;
                            // make a step backward
                            this.stepCounter--;
                        }

                        // update stepCounterMax
                        if (this.stepCounter > this.stepCounterMax) {
                            this.stepCounterMax = this.stepCounter;
                        }

                        // --------------------------------------------------

                        // notify about steps
                        for (int c = 0; c < this.dataComponentWrapperList.size(); c++) {
                            KiemEvent infoEvent = new KiemEvent(KiemEvent.STEP_INFO,
                                    new Pair<Long, Long>(this.stepCounter, this.stepCounterMax));
                            if (eventManager != null) {
                                eventManager.notify(infoEvent);
                            }
                            // dataComponentWrapperList.get(c).getDataComponent()
                            // .notifyStep(this.stepCounter,this.stepCounterMax);
                        }

                        // update steps in kiem view
                        // KiemPlugin.getDefault().updateStepsAsync();
                        // is now done by listening to the STEP_INFO event

                        // System.out.println("-- execution step -------------------------------");

                        // ===========================================//
                        // == P U R E P R O D U C E R (CALL) ==//
                        // ===========================================//
                        // only if this is not a history step
                        if (!this.isHistoryStep()) {
                            for (int c = 0; c < this.dataComponentWrapperList.size(); c++) {
                                // call all pure producers first
                                DataComponentWrapper dataComponentWrapper = dataComponentWrapperList
                                        .get(c);
                                timeout.timeout(getTimeout(), "isEnabled, isProducer, isObserver",
                                        dataComponentWrapper, this);
                                if (dataComponentWrapper.isEnabled()
                                        && dataComponentWrapper.isProducerOnly()) {
                                    // System.out.println(c + ") " +
                                    // dataComponentWrapper.getName() +
                                    // " (Pure Producer) call");
                                    // make a step (within producerExecution's
                                    // monitor)
                                    timeout.timeout(getTimeout(), "step (call)",
                                            dataComponentWrapper, this);
                                    // should normally not happen (if no errors)
                                    try {
                                        producerExecutionArray[c].blockingStep();
                                    } catch (Exception e) {
                                        if (!stop) {
                                            KiemPlugin.getDefault().showWarning(null,
                                                    KiemPlugin.PLUGIN_ID, e, false);
                                        }
                                    }
                                }
                                timeout.abortTimeout();
                            } // next pure producer
                        } // end if not history step

                        // make a step - according to the
                        // dataComponentWrapperList
                        // order
                        for (int c = 0; c < this.dataComponentWrapperList.size(); c++) {
                            DataComponentWrapper dataComponentWrapper = dataComponentWrapperList
                                    .get(c);

                            // check whether DataComponent is DISABLED
                            timeout.timeout(getTimeout(), "isEnabled", dataComponentWrapper, this);
                            if (!dataComponentWrapper.isEnabled()) {
                                timeout.abortTimeout();
                                continue;
                            }
                            timeout.abortTimeout();

                            // check whether DataComponent can handle HISTORY
                            // STEPS
                            if (this.isHistoryStep()) {
                                timeout.timeout(getTimeout(), "isHistoryObserver",
                                        dataComponentWrapper, this);
                                if (!dataComponentWrapper.isHistoryObserver()) {
                                    timeout.abortTimeout();
                                    continue;
                                }
                                timeout.timeout(getTimeout(), "isProducer, isObserver",
                                        dataComponentWrapper, this);
                                if (dataComponentWrapper.isProducerOnly()) {
                                    timeout.abortTimeout();
                                    continue;
                                }
                                timeout.abortTimeout();
                            }

                            // ===========================================//
                            // == C O N S U M E R / P R O D U C E R ==//
                            // ===========================================//
                            timeout.timeout(getTimeout(), "isProducer, isObserver",
                                    dataComponentWrapper, this);
                            if (dataComponentWrapper.isProducerObserver()) {
                                // System.out.println(c + ") "
                                // +dataComponentWrapper.getName() +
                                // " (Norm Producer) call");
                                // Observer AND Producer => blocking
                                try {
                                    // make a step
                                    if (!makeStepObserverProducer(dataComponentWrapper)) {
                                        errorTerminate();
                                        isStarted = false;
                                        return Status.CANCEL_STATUS;
                                    }
                                    // save current pool index for next
                                    // invocation
                                    // only iff no history step
                                    if (!this.isHistoryStep()) {
                                        dataComponentWrapper.setDeltaIndex(this.dataPool
                                                .getPoolCounter());
                                    }
                                } catch (Exception e) {
                                    if (!stop) {
                                        KiemPlugin.getDefault().showWarning(null,
                                                KiemPlugin.PLUGIN_ID, e, false);
                                    }
                                }
                                // System.out.println(dataComponentWrapper.getName()
                                // +
                                // " (Norm Producer) return");
                            } else if (dataComponentWrapper.isObserverOnly()) {
                                // ===========================================//
                                // == P U R E C O N S U M E R ==//
                                // ===========================================//
                                // System.out.println(c + ") "
                                // +dataComponentWrapper.getName() +
                                // " (Pure Observer) call");
                                // pure Observer
                                // set current data
                                try {
                                    // get the current input data according to
                                    // the
                                    // current step
                                    JSONObject oldData = getInputData(dataComponentWrapper);
                                    // System.out.println(dataComponentWrapper.getName()
                                    // + ": " +
                                    // oldData.toString());
                                    // set the oldData
                                    observerExecutionArray[c].setData(oldData);
                                } catch (Exception e) {
                                    if (!stop) {
                                        KiemPlugin.getDefault().showWarning(null,
                                                KiemPlugin.PLUGIN_ID, e, false);
                                    }
                                }
                                // call async method - no timeout
                                try {
                                    if ((observerExecutionArray[c].step())) {
                                        // ONLY if the step was successful
                                        // == component was not skipped

                                        // save current pool index for next
                                        // invokation
                                        // only iff no history step
                                        if (!this.isHistoryStep()) {
                                            dataComponentWrapper.setDeltaIndex(this.dataPool
                                                    .getPoolCounter());
                                        }
                                    }
                                } catch (Exception e) {
                                    if (!stop) {
                                        KiemPlugin.getDefault().showWarning(
                                                e.getLocalizedMessage(), KiemPlugin.PLUGIN_ID, e,
                                                false);
                                    }
                                }
                            } else if ((!this.isHistoryStep())
                                    && dataComponentWrapper.isProducerOnly()) {
                                // ===========================================//
                                // == P U R E P R O D U C E R (REAP) ==//
                                // ===========================================//
                                // only if not a history step
                                timeout.timeout(getTimeout(), "step (reap)", dataComponentWrapper,
                                        this);
                                try {
                                    // System.out.println(c + ") "
                                    // +dataComponentWrapper.getName() +
                                    // " (Pure Producer) wait");
                                    // pure Producer
                                    // get blocking result
                                    producerExecutionArray[c].blockingWaitUntilDone();
                                    // now reap the results
                                    // note that due to sequential order we
                                    // always
                                    // FIRST
                                    // reap the producer and only in the next
                                    // iteration
                                    // THEN call him again
                                } catch (Exception e) {
                                    if (!stop) {
                                        KiemPlugin.getDefault().showWarning(null,
                                                KiemPlugin.PLUGIN_ID, e, false);
                                    }
                                }

                                // escape if stopped
                                timeout.abortTimeout();
                                if (this.stop) {
                                    isStarted = false;
                                    return Status.CANCEL_STATUS;
                                }

                                // System.out.println(c + ") "
                                // +dataComponentWrapper.getName() +
                                // " (Pure Producer) done");
                                try {
                                    JSONObject newData = producerExecutionArray[c].getData();
                                    if (newData != null) {
                                        this.dataPool.putData(newData);
                                    }
                                } catch (Exception e) {
                                    if (!stop) {
                                        KiemPlugin.getDefault().showWarning(null,
                                                KiemPlugin.PLUGIN_ID, e, false);
                                    }
                                }

                            }
                        } // next producer/Observer
                        timeout.abortTimeout();

                        // calculate execution timings (and current step
                        // Duration)
                        // do not floor => add 1ms
                        endtime = System.currentTimeMillis();
                        this.stepDuration = (int) (endtime - starttime) + 1;
                        if (this.maximumStepDuration < this.stepDuration) {
                            this.maximumStepDuration = this.stepDuration;
                        }
                        if ((this.minimumStepDuration > this.stepDuration)
                                || (this.minimumStepDuration == -1)) {
                            this.minimumStepDuration = this.stepDuration;
                        }
                        if (this.weightedAverageStepDuration == 0) {
                            // frist tick
                            this.weightedAverageStepDuration = this.stepDuration;
                        } else {
                            // other ticks
                            this.weightedAverageStepDuration += this.stepDuration;
                            this.weightedAverageStepDuration /= 2;
                        }
                        this.accumulatedStepDurations += this.stepDuration;

                        // indicate step is done hence
                        // reduce number of steps
                        if (steps != INFINITY_STEPS) {
                            steps = NO_STEPS;
                        }

                        // notify about the finished step (STEP_DONE)
                        if (eventManager != null) {
                            eventManager.notify(new KiemEvent(KiemEvent.STEP_DONE));
                        }

                    } // end if - make a step

                    // got async pause command!
                    if (pausedCommand) {
                        pausedCommand = false;
                        steps = NO_STEPS;
                    }

                } // end synchronized

                // stop if monitor is canceled
                if (monitor.isCanceled()) {
                    // this.stopExecutionSync();
                    this.abortExecutionAsync();
                }
                // escape if stopped
                if (this.stop) {
                    isStarted = false;
                    return Status.OK_STATUS;
                }

                // delay if time of step is left (in run mode only)
                if (steps == INFINITY_STEPS) {
                    int timeToDelay = this.aimedStepDuration - this.stepDuration;
                    if (timeToDelay > 0) {
                        // remember aimed step duration
                        int backupAimedStepDuration = this.aimedStepDuration;
                        // do not delay the WHOLE amount of time if lager than a
                        // second!
                        while (timeToDelay > SECOND_WAITTIMEOUT) {
                            try {
                                Thread.sleep(SECOND_WAITTIMEOUT);
                            } catch (Exception e) {
                                // will try to sleep again anyways
                            }
                            timeToDelay -= SECOND_WAITTIMEOUT;
                            if (backupAimedStepDuration != this.aimedStepDuration) {
                                // if user changed aimedStepDuration during
                                // count
                                // down,
                                // then we do not wait any longer in this step!
                                timeToDelay = 0;
                                break;
                            }
                        }
                        // delay the rest if necessary
                        try {
                            Thread.sleep(timeToDelay);
                        } catch (Exception e) {
                            if (!stop) {
                                KiemPlugin.getDefault().showWarning(null, KiemPlugin.PLUGIN_ID, e,
                                        false);
                            }
                        }
                    }

                }

                if (steps == NO_STEPS) {
                    // cancel stepPause
                    this.stepToPause = -1;
                }

                // stop if monitor is cancelled
                if (monitor.isCanceled()) {
                    // this.stopExecutionSync();
                    this.abortExecutionAsync();
                }
                // escape if stopped
                if (this.stop) {
                    isStarted = false;
                    return Status.OK_STATUS;
                }

                // delay while paused
                while (steps == NO_STEPS) {
                    starttime = System.currentTimeMillis();
                    // System.out.println(">>PAUSED<<");
                    try {
                        Thread.sleep(PAUSE_DEYLAY);
                    } catch (Exception e) {
                        if (!stop) {
                            KiemPlugin.getDefault().showWarning(null, KiemPlugin.PLUGIN_ID, e,
                                    false);
                        }
                    }
                    // stop if monitor is cancelled
                    if (monitor.isCanceled()) {
                        // this.stopExecutionSync();
                        this.abortExecutionAsync();
                    }
                    // if stop is requested, jump out
                    if (this.stop) {
                        isStarted = false;
                        return Status.OK_STATUS;
                    }
                    endtime = System.currentTimeMillis();
                    accumulatedPlauseDurations += endtime - starttime;
                }

            } // next while not stop
        } catch (Exception e) {
            // This should not happen during normal operation but may happen if
            // Eclipse is terminated unexpectedly.
            isStarted = false;
            return Status.OK_STATUS;
        }

        isStarted = false;
        return Job.ASYNC_FINISH;
    }

    // -------------------------------------------------------------------------

    /**
     * A proxy method for showing an error from within an {@link ObserverExecution}, a.
     * 
     * @param textMessage
     *            the text message to display
     * @param pluginID
     *            the plug-in id
     * @param e
     *            the original Exception {@link ProducerExecution} or the {@link TimeoutThread}.
     */
    public void showError(final String textMessage, final String pluginID, final Exception e) {
        KiemPlugin.getDefault().showError(textMessage, pluginID, e, false);
    }

    // -------------------------------------------------------------------------

    /**
     * A proxy method for showing a warning from within an {@link ObserverExecution}, a.
     * 
     * @param textMessage
     *            the text message to display
     * @param pluginID
     *            the plug-in id
     * @param e
     *            the original Exception {@link ProducerExecution} or the {@link TimeoutThread}.
     */
    public void showWarning(final String textMessage, final String pluginID, final Exception e) {
        KiemPlugin.getDefault().showWarning(textMessage, pluginID, e, false);
    }

}
