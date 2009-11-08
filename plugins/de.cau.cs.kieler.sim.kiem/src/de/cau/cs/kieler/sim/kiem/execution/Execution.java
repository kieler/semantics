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
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.json.JSONException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

/**
 * The Class Execution. This is the base class for the whole execution. It creates and manages the
 * worker threads for pure observer and pure producer components. It also implements the scheduling
 * between all components. Additionally it manages a timeout component that checks whether a
 * component-method exceeds the maximum timeout and then terminates all executions w/ an error log
 * message.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public class Execution implements Runnable {

    /** Timeout for DataComponents. */
    TimeoutThread timeout;

    /** The Constant TIMEOUT. 5 seconds. */
    private static final int TIMEOUT = 5000;

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
    
    /** The Constant SECOND_WAITTIMEOUT indicates how long to sleep
     * until changes in aimed step durations are guaranteed to be
     * processed. */
    private static final int SECOND_WAITTIMEOUT = 1000;

    /**
     * Basic DataComponentList of all enabled (and disabled) DataComponents.
     */
    private List<DataComponentEx> dataComponentExList;

    /** The Intended duration of a step. */
    private int aimedStepDuration;

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

    // -------------------------------------------------------------------------

    /**
     * Instantiates and starts a new execution (thread).
     * 
     * @param dataComponentExListParam
     *            the current DataComponentExList
     */
    public Execution(final List<DataComponentEx> dataComponentExListParam) {
        this.stepDuration = KiemPlugin.AIMED_STEP_DURATION_DEFAULT;
        this.stop = false;
        this.pausedCommand = false;
        this.steps = NO_STEPS; // == paused
        this.stepToPause = -1;
        this.dataComponentExList = dataComponentExListParam;
        this.dataPool = new JSONDataPool();
        // start the timeout worker thread
        this.timeout = new TimeoutThread();
        this.timeout.start();
        observerExecutionArray = new ObserverExecution[this.dataComponentExList.size()];
        producerExecutionArray = new ProducerExecution[this.dataComponentExList.size()];
        // for each pure observer ... create ObserverExecution Thread
        // for each pure producer ... create ProducerExecution Thread
        for (int c = 0; c < dataComponentExListParam.size(); c++) {
            DataComponentEx dataComponentEx = dataComponentExListParam.get(c);
            timeout.timeout(TIMEOUT, "isEnabled, isObserver, isProducer", dataComponentEx, this);
            if (dataComponentEx.isEnabled()) {
                if (dataComponentEx.isObserverOnly()) {
                    // pure Observer
                    observerExecutionArray[c] = new ObserverExecution(dataComponentEx
                            .getDataComponent(), this);
                    (new Thread(observerExecutionArray[c])).start();
                } else if (dataComponentEx.isProducerOnly()) {
                    // pure Producer
                    producerExecutionArray[c] = new ProducerExecution(dataComponentEx
                            .getDataComponent(), this);
                    (new Thread(producerExecutionArray[c])).start();
                }
            }
            timeout.abortTimeout();
        }
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
        return (int) (this.accumulatedStepDurations / this.stepCounter);
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
     * {@link #getSteps()}), unless the current step is a history step.
     * 
     * @return the maximum step
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
            KiemPlugin.getDefault().updateViewAsync();
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
     * is a step number back in the history, then just jump to it. If this is a step number forward
     * in the history, then also run to it.
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
            KiemPlugin.getDefault().updateViewAsync();
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

        synchronized (this) {
            if (this.steps == NO_STEPS) {
                // notify components
                for (int c = 0; c < this.dataComponentExList.size(); c++) {
                    DataComponentEx dataComponentEx = dataComponentExList.get(c);
                    timeout.timeout(TIMEOUT, "isEnabled, isHistoryObserver", dataComponentEx, this);
                    if (dataComponentEx.isEnabled()
                    // HISTORY COMPONENTS ONLY//
                            && dataComponentEx.isHistoryObserver()) {
                        timeout.timeout(TIMEOUT, "commandStep", dataComponentEx, this);
                        dataComponentEx.getDataComponent().commandStep();
                    }
                    timeout.abortTimeout();
                }
                // make one step backward
                this.steps = BACKWARD_STEP;
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

        synchronized (this) {
            if (this.steps == NO_STEPS) {
                // notify components
                for (int c = 0; c < this.dataComponentExList.size(); c++) {
                    DataComponentEx dataComponentEx = dataComponentExList.get(c);
                    timeout.timeout(TIMEOUT, "isEnabled", dataComponentEx, this);
                    if (dataComponentEx.isEnabled()) {
                        timeout.timeout(TIMEOUT, "commandStep", dataComponentEx, this);
                        dataComponentEx.getDataComponent().commandStep();
                    }
                    timeout.abortTimeout();
                }
                // make one step forward
                this.steps = FORWARD_STEP;
            } else {
                return false; // skip in this case make NO step
            }
        }
        return true;
    }

    // -------------------------------------------------------------------------

    // TODO: implement macro step execution
    /**
     * Macro step execution sync.
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
        pausedCommand = true;

        synchronized (this) {
            // notify components
            for (int c = 0; c < this.dataComponentExList.size(); c++) {
                DataComponentEx dataComponentEx = dataComponentExList.get(c);
                timeout.timeout(TIMEOUT, "isEnabled", dataComponentEx, this);
                if (dataComponentEx.isEnabled()) {
                    timeout.timeout(TIMEOUT, "commandPause", dataComponentEx, this);
                    dataComponentEx.getDataComponent().commandPause();
                }
                timeout.abortTimeout();
            }
            this.steps = NO_STEPS;
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Runs the execution. The pausedCommand flag is set to false and the steps are being set to
     * infinity, which is interpreted by the {@link #run()} method. Before that is done the
     * DataComponents are informed about the run command.
     */
    public synchronized void runExecutionSync() {
        pausedCommand = false;

        synchronized (this) {
            // notify components
            for (int c = 0; c < this.dataComponentExList.size(); c++) {
                DataComponentEx dataComponentEx = dataComponentExList.get(c);
                timeout.timeout(TIMEOUT, "isEnabled", dataComponentEx, this);
                if (dataComponentEx.isEnabled()) {
                    timeout.timeout(TIMEOUT, "commandRun", dataComponentEx, this);
                    dataComponentEx.getDataComponent().commandRun();
                }
                timeout.abortTimeout();
            }
        }
        this.steps = INFINITY_STEPS; // indicates run mode
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
            for (int c = 0; c < this.dataComponentExList.size(); c++) {
                DataComponentEx dataComponentEx = dataComponentExList.get(c);
                timeout.timeout(TIMEOUT, "isEnabled", dataComponentEx, this);
                if (dataComponentEx.isEnabled()) {
                    timeout.abortTimeout();
                    timeout.timeout(TIMEOUT, "commandStop", dataComponentEx, this);
                    dataComponentEx.getDataComponent().commandStop();
                    timeout.abortTimeout();
                }
                timeout.abortTimeout();
            }

            // for safety reasons do this synchronized again
            this.stop = true;
            this.steps = NO_STEPS;
            // stop all child execution threads
            for (int c = 0; c < this.dataComponentExList.size(); c++) {
                // reset delta index
                this.dataComponentExList.get(c).setDeltaIndex(0);
                // reset pool indices
                this.dataComponentExList.get(c).resetPoolIndices();
                if (this.observerExecutionArray[c] != null) {
                    this.observerExecutionArray[c].stopExecution();
                }
                if (this.producerExecutionArray[c] != null) {
                    this.producerExecutionArray[c].stopExecution();
                }
            }
        }
        // wrapup components
        wrapupComponents();

        // stop timeout thread
        this.timeout.terminate();
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
        KiemPlugin.getDefault().execution = null;
        // update the view
        KiemPlugin.getDefault().updateViewAsync();
        // try to stop all components, no blocking stopExecution() call
        for (int c = 0; c < this.dataComponentExList.size(); c++) {
            if (this.observerExecutionArray[c] != null) {
                this.observerExecutionArray[c].stopExecution();
                this.observerExecutionArray[c] = null;
            }
            if (this.producerExecutionArray[c] != null) {
                this.producerExecutionArray[c].stopExecution();
                this.observerExecutionArray[c] = null;
            }
        }
    }

    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#finalize()
     */
    @Override
    protected void finalize() {
        errorTerminate();
    }

    // -------------------------------------------------------------------------

    /**
     * Wrap-up components after execution was stopped.
     */
    public synchronized void wrapupComponents() {
        for (int c = 0; c < this.dataComponentExList.size(); c++) {
            DataComponentEx dataComponentEx = dataComponentExList.get(c);
            if (dataComponentEx.isEnabled()) {
                timeout.timeout(TIMEOUT, "wrapup", dataComponentEx, this);
                try {
                    dataComponentEx.getDataComponent().wrapup();
                } catch (KiemInitializationException e) {
                    timeout.abortTimeout();
                    KiemPlugin.getDefault().handleComponentError(
                            dataComponentEx.getDataComponent(), e);
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
     * @param dataComponentEx
     *            DataComponent to get the data for
     * 
     * @return the input data
     * 
     * @throws JSONException
     *             a JSONException
     */
    private JSONObject getInputData(final DataComponentEx dataComponentEx) throws JSONException {
        timeout.timeout(TIMEOUT, "provideFilterKeys", dataComponentEx, this);
        String[] filterKeys = dataComponentEx.provideFilterKeys();
        timeout.abortTimeout();

        JSONObject oldData = null;

        long lastPoolCounter = dataComponentEx.getDeltaIndex();

        if (this.isHistoryStep()) {
            // flag as a history step
            dataComponentEx.setHistoryStep(true);

            // this is a history step - always send full data
            long oldPoolCounter = dataComponentEx.getPoolIndex(this.getSteps());
            oldData = this.dataPool.getData(filterKeys, oldPoolCounter);
        } else {
            // flag as NOT history step
            dataComponentEx.setHistoryStep(false);

            // this is a new step
            if (dataComponentEx.isDeltaObserver()) {
                oldData = this.dataPool.getDeltaData(filterKeys, lastPoolCounter);
            } else {
                oldData = this.dataPool.getData(filterKeys);
            }

            // set pool index (for later going back in history)
            dataComponentEx.addPoolIndex(this.dataPool.getPoolCounter(), this.getSteps());
        }

        return oldData;
    }

    // -------------------------------------------------------------------------

    /**
     * Makes step of an observer AND producer data component. This is not sourced out into a
     * separate thread because it is made in a blocking sense.
     * 
     * @param dataComponentEx
     *            the data component which should make a step
     * 
     * @throws JSONException
     *             a JSONException
     */
    private void makeStepObserverProducer(final DataComponentEx dataComponentEx)
            throws JSONException {
        JSONObject oldData;

        // get the current input data according to the current step
        oldData = getInputData(dataComponentEx);
        // System.out.println(dataComponentEx.getName() + ":" + oldData.toString());

        // decide to make a step depending on the type of component
        // (JSONString or JSONObject)
        timeout.timeout(TIMEOUT, "step", dataComponentEx, this);
        if (dataComponentEx.isJSON()) {
            // JSONObject component
            JSONObject newData = null;
            try {
                newData = ((JSONObjectDataComponent) dataComponentEx.getDataComponent())
                        .step(oldData);
            } catch (KiemExecutionException e) {
                timeout.abortTimeout();
                KiemPlugin.getDefault().handleComponentError(dataComponentEx.getDataComponent(), e);
            }

            // only put in data pool if no history step
            if (!this.isHistoryStep()) {
                this.dataPool.putData(newData);
            }
        } else {
            // JSONString component
            String newData = null;
            try {
                newData = ((JSONStringDataComponent) dataComponentEx.getDataComponent())
                        .step(oldData.toString());
            } catch (KiemExecutionException e) {
                timeout.abortTimeout();
                KiemPlugin.getDefault().handleComponentError(dataComponentEx.getDataComponent(), e);
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
    }

    // -------------------------------------------------------------------------

    /**
     * Checks all DataComponents for a pause flag. If any pause flag is found, this leads to a
     * paused execution.
     */
    private void checkForPauseFlag() {
        // pause if pause step is reached
        if (this.stepCounter == this.stepToPause) {
            // cancel stepPause
            this.stepToPause = -1;
            this.pauseExecutionSync();
            // update the GUI
            KiemPlugin.getDefault().updateViewAsync();
            return;
        }

        // test only if we have to make a step (1) or if we are
        // in running mode (-1)
        if ((steps == INFINITY_STEPS) || (steps > NO_STEPS)) {
            // iff any isPauseFlag() returns true, pause execution
            for (int c = 0; c < this.dataComponentExList.size(); c++) {
                DataComponentEx dataComponentEx = dataComponentExList.get(c);
                timeout.timeout(TIMEOUT, "isEnabled, isPauseFlag", dataComponentEx, this);
                if (dataComponentEx.isEnabled() && dataComponentEx.isPauseFlag()) {
                    // cancel stepPause
                    this.stepToPause = -1;
                    this.pauseExecutionSync();
                    // update the GUI
                    KiemPlugin.getDefault().updateViewAsync();
                    timeout.abortTimeout();
                    return;
                }
                timeout.abortTimeout();
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void run() {
        synchronized (this) {
            // this returns stepCounter and historyStepCounter and all other
            // timing variables
            resetTimingVariables();
        }

        while (!this.stop) {

            long starttime = System.currentTimeMillis();
            long endtime = System.currentTimeMillis();

            synchronized (this) {
                // iff *ANY* isPauseFlag() returns true, pause execution
                checkForPauseFlag();

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

                    // motify about steps
                    for (int c = 0; c < this.dataComponentExList.size(); c++) {
                        dataComponentExList.get(c).getDataComponent().notifyStep(this.stepCounter,
                                this.stepCounterMax);
                    }

                    // update steps in kiem view
                    KiemPlugin.getDefault().updateStepsAsync();

                    // System.out.println("-- execution step -------------------------------");

                    // ===========================================//
                    // == P U R E P R O D U C E R (CALL) ==//
                    // ===========================================//
                    // only if this is not a history step
                    if (!this.isHistoryStep()) {
                        for (int c = 0; c < this.dataComponentExList.size(); c++) {
                            // call all pure producers first
                            DataComponentEx dataComponentEx = dataComponentExList.get(c);
                            timeout.timeout(TIMEOUT, "isEnabled, isProducer, isObserver",
                                    dataComponentEx, this);
                            if (dataComponentEx.isEnabled() && dataComponentEx.isProducerOnly()) {
                                // System.out.println(c + ") " + dataComponentEx.getName() +
                                // " (Pure Producer) call");
                                // make a step (within producerExecution's monitor)
                                timeout.timeout(TIMEOUT, "step (call)", dataComponentEx, this);
                                // should normally not happen (if no errors)
                                try {
                                    producerExecutionArray[c].blockingStep();
                                } catch (Exception e) {
                                    if (!stop) {
                                        KiemPlugin.getDefault().showWarning(null,
                                                KiemPlugin.PLUGIN_ID, e);
                                    }
                                }
                            }
                            timeout.abortTimeout();
                        } //next pure producer
                    } //end if not history step

                    // make a step - according to the dataComponentExList order
                    for (int c = 0; c < this.dataComponentExList.size(); c++) {
                        DataComponentEx dataComponentEx = dataComponentExList.get(c);

                        // check whether DataComponent is DISABLED
                        timeout.timeout(TIMEOUT, "isEnabled", dataComponentEx, this);
                        if (!dataComponentEx.isEnabled()) {
                            timeout.abortTimeout();
                            continue;
                        }
                        timeout.abortTimeout();

                        // check whether DataComponent can handle HISTORY STEPS
                        if (this.isHistoryStep()) {
                            timeout.timeout(TIMEOUT, "isHistoryObserver", dataComponentEx, this);
                            if (!dataComponentEx.isHistoryObserver()) {
                                timeout.abortTimeout();
                                continue;
                            }
                            timeout.timeout(TIMEOUT, "isProducer, isObserver", dataComponentEx,
                                    this);
                            if (dataComponentEx.isProducerOnly()) {
                                timeout.abortTimeout();
                                continue;
                            }
                            timeout.abortTimeout();
                        }

                        // ===========================================//
                        // == C O N S U M E R / P R O D U C E R ==//
                        // ===========================================//
                        timeout.timeout(TIMEOUT, "isProducer, isObserver", dataComponentEx, this);
                        if (dataComponentEx.isProducerObserver()) {
                            // System.out.println(c + ") " +dataComponentEx.getName() +
                            // " (Norm Producer) call");
                            // Observer AND Producer => blocking
                            try {
                                // make a step
                                makeStepObserverProducer(dataComponentEx);
                                // save current pool index for next invokation
                                // only iff no history step
                                if (!this.isHistoryStep()) {
                                    dataComponentEx.setDeltaIndex(this.dataPool.getPoolCounter());
                                }
                            } catch (Exception e) {
                                if (!stop) {
                                    KiemPlugin.getDefault().showWarning(null, KiemPlugin.PLUGIN_ID,
                                            e);
                                }
                            }
                            // System.out.println(dataComponentEx.getName() +
                            // " (Norm Producer) return");
                        } else if (dataComponentEx.isObserverOnly()) {
                            // ===========================================//
                            // == P U R E C O N S U M E R ==//
                            // ===========================================//
                            // System.out.println(c + ") " +dataComponentEx.getName() +
                            // " (Pure Observer) call");
                            // pure Observer
                            // set current data
                            try {
                                // get the current input data according to the current step
                                JSONObject oldData = getInputData(dataComponentEx);
                                // System.out.println(dataComponentEx.getName() + ": " +
                                // oldData.toString());
                                // set the oldData
                                observerExecutionArray[c].setData(oldData);
                            } catch (Exception e) {
                                if (!stop) {
                                    KiemPlugin.getDefault().showWarning(null, KiemPlugin.PLUGIN_ID,
                                            e);
                                }
                            }
                            // call async method - no timeout
                            try {
                                if ((observerExecutionArray[c].step())) {
                                    // ONLY if the step was successful
                                    // == component was not skipped

                                    // save current pool index for next invokation
                                    // only iff no history step
                                    if (!this.isHistoryStep()) {
                                        dataComponentEx.setDeltaIndex(this.dataPool
                                                .getPoolCounter());
                                    }
                                }
                            } catch (Exception e) {
                                if (!stop) {
                                    KiemPlugin.getDefault().showWarning(e.getLocalizedMessage(),
                                            KiemPlugin.PLUGIN_ID, e);
                                }
                            }
                        } else if ((!this.isHistoryStep()) && dataComponentEx.isProducerOnly()) {
                            // ===========================================//
                            // == P U R E P R O D U C E R (REAP) ==//
                            // ===========================================//
                            // only if not a history step
                            timeout.timeout(TIMEOUT, "step (reap)", dataComponentEx, this);
                            try {
                                // System.out.println(c + ") " +dataComponentEx.getName() +
                                // " (Pure Producer) wait");
                                // pure Producer
                                // get blocking result
                                producerExecutionArray[c].blockingWaitUntilDone();
                                // now reap the results
                                // note that due to sequential order we always FIRST
                                // reap the producer and only in the next iteration
                                // THEN call him again
                            } catch (Exception e) {
                                if (!stop) {
                                    KiemPlugin.getDefault().showWarning(null, KiemPlugin.PLUGIN_ID,
                                            e);
                                }
                            }

                            // escape if stopped
                            timeout.abortTimeout();
                            if (this.stop) {
                                return;
                            }

                            // System.out.println(c + ") " +dataComponentEx.getName() +
                            // " (Pure Producer) done");
                            try {
                                JSONObject newData = producerExecutionArray[c].getData();
                                if (newData != null) {
                                    this.dataPool.putData(newData);
                                }
                            } catch (Exception e) {
                                if (!stop) {
                                    KiemPlugin.getDefault().showWarning(null, KiemPlugin.PLUGIN_ID,
                                            e);
                                }
                            }

                        }
                    } // next producer/Observer
                    timeout.abortTimeout();

                    // calculate execution timings (and current step Duration)
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
                        this.weightedAverageStepDuration = (this.weightedAverageStepDuration 
                                                            + this.stepDuration) / 2;
                    }
                    this.accumulatedStepDurations += this.stepDuration;

                    // indicate step is done hence
                    // reduce number of steps
                    if (steps != INFINITY_STEPS) {
                        steps = NO_STEPS;
                    }

                } // end if - make a step

                // got async pause command!
                if (pausedCommand) {
                    pausedCommand = false;
                    steps = NO_STEPS;
                }

            } // end synchronized

            // escape if stopped
            if (this.stop) {
                return;
            }

            // delay if time of step is left (in run mode only)
            if (steps == INFINITY_STEPS) {
                int timeToDelay = this.aimedStepDuration - this.stepDuration;
                if (timeToDelay > 0) {
                    // remember aimed step duration
                    int backupAimedStepDuration = this.aimedStepDuration;
                    // do not delay the WHOLE amount of time if lager than a second!
                    while (timeToDelay > SECOND_WAITTIMEOUT) {
                        try {
                            Thread.sleep(SECOND_WAITTIMEOUT);
                        } catch (Exception e) {
                            // will try to sleep again anyways
                        }
                        timeToDelay -= SECOND_WAITTIMEOUT;
                        if (backupAimedStepDuration != this.aimedStepDuration) {
                            // if user changed aimedStepDuration during count down,
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
                            KiemPlugin.getDefault().showWarning(null, KiemPlugin.PLUGIN_ID, e);
                        }
                    }
                }

            }

            if (steps == NO_STEPS) {
                // cancel stepPause
                this.stepToPause = -1;
            }

            // escape if stopped
            if (this.stop) {
                return;
            }

            // delay while paused
            while (steps == NO_STEPS) {
                starttime = System.currentTimeMillis();
                // System.out.println(">>PAUSED<<");
                try {
                    Thread.sleep(PAUSE_DEYLAY);
                } catch (Exception e) {
                    if (!stop) {
                        KiemPlugin.getDefault().showWarning(null, KiemPlugin.PLUGIN_ID, e);
                    }
                }
                // if stop is requested, jump out
                if (this.stop) {
                    return;
                }
                endtime = System.currentTimeMillis();
                accumulatedPlauseDurations += endtime - starttime;
            }

        } // next while not stop
    }

    // -------------------------------------------------------------------------

    /**
     * A proxy method for showing an error from within an {@link ObserverExecution}, a
     * {@link ProducerExecution} or the {@link TimeoutThread}.
     * 
     * @param textMessage
     *            the text message to display
     * @param pluginID
     *            the plug-in id
     * @param e
     *            the original Exception
     */
    public void showError(final String textMessage, final String pluginID, final Exception e) {
        KiemPlugin.getDefault().showError(textMessage, pluginID, e);
    }

    // -------------------------------------------------------------------------

    /**
     * A proxy method for showing a warning from within an {@link ObserverExecution}, a
     * {@link ProducerExecution} or the {@link TimeoutThread}.
     * 
     * @param textMessage
     *            the text message to display
     * @param pluginID
     *            the plug-in id
     * @param e
     *            the original Exception
     */
    public void showWarning(final String textMessage, final String pluginID, final Exception e) {
        KiemPlugin.getDefault().showWarning(textMessage, pluginID, e);
    }

}
