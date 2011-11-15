/*
 * SJ - Synchronous Java.
 *
 * http://www.informatik.uni-kiel.de/rtsys/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sj;

import static de.cau.cs.kieler.sj.SJLogger.LogMsgTyp.INSTRUCTION;
import de.cau.cs.kieler.sj.exceptions.CausalityException;
import de.cau.cs.kieler.sj.exceptions.NoPreSignalException;
import de.cau.cs.kieler.sj.exceptions.SignalNotDeclaredException;
import de.cau.cs.kieler.sj.exceptions.ThreadException;

/**
 * 
 * Class that represents a signal as a part of a synchronous java (SJ) program. The represented
 * signal is similar to the signal used in SyncCharts.
 * 
 * 
 * @author mhei
 * 
 */
public class Signal {

    /**
     * One of the two possible status of a signal.
     * 
     * @see #ABSENT
     */
    public static final boolean PRESENT = true;

    /**
     * One of the two possible status of a signal.
     * 
     * @see #PRESENT
     */
    public static final boolean ABSENT = false;

    /**
     * The name of the signal.
     */
    private String name;

    /**
     * The current state of the signal.
     */
    protected boolean present;

    /**
     * The last assignment of the signal used to get older states of the signal.
     */
    protected Boolean[] lastSignalAssignments;

    /**
     * Index to manage the last signal assignments.
     */
    protected int index;

    /**
     * To assure that a signal is only emited once during a tick every signal must belong to a
     * SJProgram. If it does not a signal can not be modified. This is only relevant if the
     * causality check of the belonging sj-program is active.
     * 
     * @see EmbeddedSJProgram#isCausalityCheckActive()
     * @see EmbeddedSJProgram#activateCausalityCheck()
     */
    private boolean isDeclared;

    /**
     * Used for a causality check to find out if a signal status is first checked and then emitted
     * in the same tick.
     */
    protected boolean hasStateChecked;

    /**
     * The program that belongs to the signal.
     * 
     */
    protected EmbeddedSJProgram<?> program;

    /**
     * Creates a new signal with a given name. The state of a new signal is always {@link #ABSENT}
     * and if you want to get the last state you will get an Exception.
     * 
     * @param signalName
     *            The name of the created signal
     */
    public Signal(final String signalName) {
        this(signalName, 0);
    }

    /**
     * Creates a new signal. The default state is {@link #ABSENT}. The previous signal states you
     * are able to ask for is the history length.
     * 
     * @param signalName
     *            The name of the created signal.
     * @param historyLength
     *            The length we need for the signal history.
     * @see #pre()
     */
    public Signal(final String signalName, final int historyLength) {

        this.name = signalName;
        this.present = ABSENT;
        if (historyLength > 0) {
            this.lastSignalAssignments = new Boolean[historyLength];
            index = 0;
        } else {
            this.lastSignalAssignments = null;
        }
        this.isDeclared = false;
        this.hasStateChecked = false;

    }

    /**
     * Creates a new signal.
     * 
     * @param signalName
     *            The name of the signal.
     * @param state
     *            The state of the signal
     * @param myProgram
     *            The program belonging to the signal.
     * @param myLastSignalAssignments
     *            The last signal assignments belonging to the signal.
     */
    protected Signal(final String signalName, final boolean state,
            final EmbeddedSJProgram<?> myProgram, final Boolean[] myLastSignalAssignments) {
        this.name = signalName;
        this.present = state;
        this.lastSignalAssignments = myLastSignalAssignments;
        this.index = 0;
        this.isDeclared = true;
        this.hasStateChecked = true;
        this.program = myProgram;

    }

    /**
     * Returns the name of a the signal.
     * 
     * @return the name of this signal
     */
    public String getName() {
        return this.name;
    }

    /**
     * Checks if a <em>Signal</em> is {@link #PRESENT}.
     * 
     * Can used like this: ... if(signal1.present()){ ... }else{ ... }
     * 
     * Attention: Your are not allowed to change the state anymore after calling this method. This
     * is because a signal what checked as <b>not</b> present in a tick is not allowed to be present
     * during that tick.
     * 
     * @return A Boolean that tells you if the signal is present( <code>true</code>) or not
     *         <code>false</code>.
     */
    public boolean isPresent() {
        if (!isDeclared) {
            throw new SignalNotDeclaredException(
                    "The signal has not declared in the SJProgram that belongs to the signal");
        } else {
            hasStateChecked = true;
            if (program.isThreadRunning() && program.getLogger() != null) {
                program.getLogger().log(
                        INSTRUCTION,
                        "\"present\":" + "{\"label\":\"" + program.getCurThread().getLabel().name()
                                + "\",\"prio\":" + program.getCurThread().getPriority()
                                + ",\"param\":[" + toJSONString() + "],\"retval\":"
                                + ((present) ? "true" : "false") + "}");
            }
            return present;
        }
    }
    
    
    // ############################################################################################
    // --------------------------------------- added by ybe ---------------------------------------
    /**
     * Checks if a <em>Signal</em> is {@link #PRESENT}.
     * Does NOT log the check! Used internally by EmbeddedSJProgram.awaitDoneCB() to check the state
     * of a signal without logging the check itself!
     * 
     * @return A Boolean that tells you if the signal is present( <code>true</code>) or not
     *         <code>false</code>.
     */
    protected boolean isPresentNoLog() {
        if (!isDeclared) {
            throw new SignalNotDeclaredException(
                    "The signal has not declared in the SJProgram that belongs to the signal");
        } else {
            hasStateChecked = true;
            return present;
        }
    }
    // ############################################################################################

    
    /**
     * Emits a signal. Changes the status of the signal for the current tick to to {@link #PRESENT}.
     * It will <b>not</b> be checked if a signal is emitted twice in a tick or has more than one
     * status during a tick.
     * 
     */
    public void emit() {
        if (!isDeclared) {
            throw new SignalNotDeclaredException(
                    "The Signal has not declared in the SJProgram that belongs to the Signal");
        } else if (hasStateChecked && program.isCausalityCheckActive()) {
            throw new CausalityException(
                    "You are not allowed to emit a signal that already has been read in this tick");
        } else {
            
        	// ####################################################################################
            // --------------------------------- changed by ybe -----------------------------------
            //
        	// Signal must be set to PRESENT prior status logging!
        	//
            // if (program.isThreadRunning() && program.getLogger() != null) {
                // program.getLogger().log(
                        // INSTRUCTION,
                        // "\"emit\":" + "{\"label\":\"" + program.getCurThread().getLabel().name()
                                // + "\",\"prio\":" + program.getCurThread().getPriority()
                                // + ",\"param\":[" + toJSONString() + "]}");
            // }
            // this.present = PRESENT;
        	// ------------------------------------------------------------------------------------
        	this.present = PRESENT;
        	if (program.isThreadRunning() && program.getLogger() != null) {
                program.getLogger().log(
                        INSTRUCTION,
                        "\"emit\":" + "{\"label\":\"" + program.getCurThread().getLabel().name()
                                + "\",\"prio\":" + program.getCurThread().getPriority()
                                + ",\"param\":[" + toJSONString() + "]}");
            }
            // ####################################################################################
            
        }
    }

    /**
     * Sustains the signal. That means that this signal is emitted in every following tick until
     * this is aborted.
     * 
     * The <b>C</b> means that this statement has to be the first after a <code>case</code>. The
     * <b>B</b> means that the next statement has to be a <code>break</code>.
     */
    public void sustainCB() {

        SJLogger curLogger = program.getLogger();
        program.setLogger(null);

        if (curLogger != null) {
            curLogger.log(INSTRUCTION, "\"sustain\":" + "{\"label\":\""
                    + program.getCurThread().getLabel().name() + "\",\"prio\":"
                    + program.getCurThread().getPriority() + "\",\"param\":[" + toJSONString()
                    + "]}");
        }

        emit();

        try {
            program.haltCB(); // pauseB(curThread.getLabel());
        } catch (ThreadException e) {
            throw new ThreadException("You can not substain a signal if no thread is running.");
        }

        program.setLogger(curLogger);

    }

    /**
     * Returns the previous instance of a signal. In other words how it was at the last tick. To use
     * this the historyLength must be greater than 0.
     * 
     * 
     * The command <code>s.pre().pre()</code> is possible.
     * 
     * @return The signal with the status from the last tick.
     * @see #Signal(String, int)
     */
    public Signal pre() {
        if (!isDeclared) {
            throw new SignalNotDeclaredException(
                    "The Signal has not declared in the SJProgram that belongs to the Signal");
        } else if (lastSignalAssignments == null || lastSignalAssignments.length == 0) {
            throw new NoPreSignalException(
                    "There is no pre signal existing. Your history is too small");
        } else if (lastSignalAssignments[(index + lastSignalAssignments.length - 1)
                % lastSignalAssignments.length] == null) {
            throw new NoPreSignalException(
                    "There is no pre signal existing. Not enougth ticks done");
        } else {
            Boolean[] history;
            if ((lastSignalAssignments.length) - 1 <= 0) {
                // if there is only 1 element in the history thats the one pre
                // will return and we do not need a history for that element.
                history = null;
            } else {
                // create a history for the signal pre returns
                history = new Boolean[lastSignalAssignments.length - 1];
                for (int i = 0; i < (lastSignalAssignments.length - 1); i++) {
                    history[(history.length - i) % history.length] =
                            lastSignalAssignments[(index - 2 - i + 2 * lastSignalAssignments.length)
                                    % lastSignalAssignments.length];

                }
            }

            Signal retVal =
                    new Signal(name,
                            lastSignalAssignments[(index + lastSignalAssignments.length - 1)
                                    % lastSignalAssignments.length], program, history);

            // JSON logging
            if (program.isThreadRunning() && program.getLogger() != null) {
                program.getLogger().log(
                        INSTRUCTION,
                        "\"pre\":" + "{\"label\":\"" + program.getCurThread().getLabel().name()
                                + "\",\"prio\":" + program.getCurThread().getPriority()
                                + "\",\"param\":[" + toJSONString() + "],\"retval\":"
                                + retVal.toJSONString() + "}");
            }

            return retVal;
        }
    }

    void nextTick() {
        if (!isDeclared) {
            throw new SignalNotDeclaredException(
                    "You can not work with a signal which has not been declared.");
        }

        // if we want to use a history
        if (lastSignalAssignments != null) {
            lastSignalAssignments[index] = present;
            index = (index + 1) % lastSignalAssignments.length;
        }
        // reset signal values to default
        this.present = ABSENT;
        this.hasStateChecked = false;

    }

    void declared(final EmbeddedSJProgram<?> myProgram) {
        this.program = myProgram;
        isDeclared = true;
    }

    void undeclare() {
        this.program = null;
        isDeclared = false;
    }

    boolean isDeclared() {
        return isDeclared;
    }

    /**
     * Returns a simple java script object notation for this object. This representation can be used
     * for example for logging or sending debug informations.
     * 
     * @return Returns a simple JSON representation of this object
     */
    public String toJSONString() {
        return "{\"" + name + "\"" + ":{\"present\":" + ((present) ? "true" : "false") + "}}";
    }

    /**
     * Returns a string representation of the signal.
     * 
     * @return The string representation of the signal.
     */
    @Override
    public String toString() {
        return "Signalname: " + name + " Status: " + ((present) ? "PRESENT" : "ABSENT")
                + " Has last signal assignment: "
                + ((lastSignalAssignments == null) ? "No" : "Yes");
    }

}
