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

import java.util.ArrayList;

import de.cau.cs.kieler.sj.SJLogger.LogMsgTyp;
import de.cau.cs.kieler.sj.exceptions.CurTickAlreadyDoneException;
import de.cau.cs.kieler.sj.exceptions.CurTickNotDoneException;
import de.cau.cs.kieler.sj.exceptions.PriorityException;
import de.cau.cs.kieler.sj.exceptions.ProgramAlreadyTerminatedException;
import de.cau.cs.kieler.sj.exceptions.SignalAlreadyDeclaredException;
import de.cau.cs.kieler.sj.exceptions.SignalNotDeclaredException;
import de.cau.cs.kieler.sj.exceptions.ThreadException;
import de.cau.cs.kieler.sj.util.PriorityQueue;

import static de.cau.cs.kieler.sj.SJLogger.LogMsgTyp.*;

/**
 * Basic class for synchronous programming in java. Use this class via <code>extends</code> to write
 * a synchronous java program. This class contains the methods to control the program.
 * 
 * 
 * @author mhei
 * 
 * @param <StateLabel>
 *            This parameter is used to tell the program all labels existing in the concrete SJ
 *            program. By using this parameter we are able to make sure that every label we working
 *            with is existing in the enumeration of labels in the sub class.
 * 
 * @see de.cau.cs.kieler.sj.examples.EmbeddedABRO
 */
public abstract class EmbeddedSJProgram<StateLabel extends Enum<?>> {

    /**
     * List of signals used in this program.
     */
    private ArrayList<Signal> signals;

    /**
     * The number of the current tick. Every program starts with tick 0.
     */
    private int tickNr;

    /**
     * List of threads that have to be executed in the current tick.
     */
    private PriorityQueue<SJThread<StateLabel>> threadsCurTick;

    /**
     * List of threads that have to be executed in the next tick.
     */
    private PriorityQueue<SJThread<StateLabel>> threadsNextTick;

    /**
     * The thread which is currently running. If there is no active thread this should be null.
     */
    private SJThread<StateLabel> curThread;

    /**
     * Logger to log all the action done by the program and its methods.
     */
    private SJLogger logger;

    /**
     * Needed for the JSON trace. Information which labels will execute in a tick
     */
    private String labelsToExecute;

    /**
     * Value of the tickNr if the program is in the initial tick.
     */
    public static final int INITIAL_TICK = -1;

    /**
     * Boolean that tells if signals should check the causality.
     */
    private boolean checkCausality;

    /**
     * The constructor to start a new SJ-program. Using this constructor should always be the first
     * then you start a SJ-program. The normal place to use the constructor should be in the
     * constructor of the sub class.
     * 
     * 
     * @param startLabel
     *            The label at which the program should start.
     * @param prio
     *            The priority the program should start with.
     */
    public EmbeddedSJProgram(final StateLabel startLabel, final int prio) {
        this(startLabel, prio, null);
    }

    /**
     * The constructor to start a new SJ-program. Using this constructor should always be the first
     * then you start a SJ-program. The normal place to use the constructor should be in the
     * constructor of the sub class. To get the logging information about the program and process
     * them you can use a logger.
     * 
     * @param startLabel
     *            The label at which the program should start.
     * @param prio
     *            The priority the program should start with.
     * @param myLogger
     *            The logger to process the logging informations. If you set this to
     *            <code>null</code> there will be no logging.
     */
    public EmbeddedSJProgram(final StateLabel startLabel, final int prio, final SJLogger myLogger) {
        // creates a empty list of threads for the current tick and adds the
        // thread to start with.
        threadsCurTick = new PriorityQueue<SJThread<StateLabel>>();
        threadsCurTick.add(new SJThread<StateLabel>(startLabel, prio));

        // create a empty list for the threads to execute at the next tick
        threadsNextTick = new PriorityQueue<SJThread<StateLabel>>();

        // at the creation of a thread we are in no tick
        tickNr = INITIAL_TICK;

        // there is no thread running at the moment
        curThread = null;

        // use given signals as the declared signal for the program
        signals = new ArrayList<Signal>();

        //
        checkCausality = false;

        // defining the logger
        this.logger = myLogger;

        if (myLogger != null) {
            myLogger.log(PROGRAM_INFO, "\"programName\":\"" + this.getClass().toString() + "\"");

            myLogger.log(TICK_INFO, "\"ticklabels\":[\"" + startLabel.name() + "\"]");
        }
        labelsToExecute = "\"ticklabels\":[";

    }

    /**
     * Returns the Number of the current tick. Every program starts with tick 0. If you use a method
     * to go to the next tick the tick number will be increment.
     * 
     * @return The number of the current tick. The method will return -1 if the program is in the
     *         initial tick.
     * @see #doTick(Signal...)
     */
    public int getTickNr() {
        return tickNr;
    }

    /**
     * Gives you a information if the program is in the initial tick and not has been started.
     * 
     * @return Returns <code>true</code> if the program is in an initial tick else
     *         <code>false</code>.
     */
    public boolean isInInitialTick() {
        return (tickNr == INITIAL_TICK);
    }

    /**
     * Tells us if a SJ program is terminated.
     * 
     * @return <code>true</code> if the program is terminated else <code>false</code>.
     */
    public boolean isTerminated() {
        return (threadsCurTick.isEmpty() && threadsNextTick.isEmpty() && (curThread == null));
    }

    /**
     * Return true if the current tick is Done. That means that every threads is either in a PAUSE
     * statement (may hidden in a statement like await) or is Terminated. To run the next tick use
     * {@link #doTick(Signal...)}.
     * 
     * @return A boolean that is <code>true</code> if the current tick is done. Otherwise the
     *         boolean is <code>false</code>.
     * 
     * @see #doTick(Signal...)
     * @see #tick()
     */
    public boolean isTickDone() {
        return threadsCurTick.isEmpty() && (curThread == null);
    }

    /**
     * Tells us if at the moment a thread is running.
     * 
     * @return Returns <code>true</code> if a thread is running.
     */
    public boolean isThreadRunning() {
        return (curThread != null);
    }

    /**
     * Function that should be implemented with a SJ-Program. It should contain the behaver of the
     * program. Every time the method is called it should do exactly one tick an then terminate.
     * 
     * Use this method only to override it if you want to execute a tick use
     * {@link #doTick(Signal...)}
     * 
     * @see #doTick(Signal...)
     */
    public abstract void tick();

    /**
     * Returns the next state (also called thread) to execute of a program. If all states are done
     * or the program has terminated a runtime exception will be thrown. You should check this
     * first.
     * 
     * @return the next state to execute
     */
    public StateLabel state() {
        if (isTerminated()) {
            throw new ProgramAlreadyTerminatedException(
                    "You can not get the next state of a already terminated program");
        } else if (curThread != null) {
            throw new ThreadException(
                    "You are not allowed to get the next thread. Threre is already the thread "
                            + curThread.getLabel().name() + " executing.");
        } else if (isTickDone()) {
            throw new CurTickAlreadyDoneException(
                    "There are no more Threads to execute in this tick.");
        } else {
            curThread = threadsCurTick.poll();
            return curThread.getLabel();

        }
    }

    /**
     * Method to declare signal used by SJ. Declared signals are reseted automatically at the
     * beginning of the next tick. You have to declare all signals you use in your ptogram.
     * 
     * @param declaredSignals
     *            The signal you want to declare.
     */
    public void addSignals(final Signal... declaredSignals) {

        String logMsg = "";
        if (logger != null) {
            logMsg += "\"addedSignals\":[";
        }
        for (int i = 0; i < declaredSignals.length; i++) {
            if (this.signals.contains(declaredSignals[i])) {
                throw new SignalAlreadyDeclaredException(
                        "You are not allowed to define a Signal twice in a global context");
            } else {
                this.signals.add(declaredSignals[i]);
                declaredSignals[i].declared(this);
                if (logger != null) {
                    logMsg += declaredSignals[i].toJSONString();
                    if (i < (declaredSignals.length - 1)) {
                        logMsg += ",";
                    }
                }
            }
        }
        if (logger != null) {
            logMsg += "]";
            logger.log(PROGRAM_INFO, logMsg);
        }
    }

    /**
     * Removes signals and so undeclare them.
     * 
     * @param declaredSignals
     *            The signals to remove
     */
    public void removeSignals(final Signal... declaredSignals) {

        String logMsg = "";
        if (logger != null) {
            logMsg += "\"removedSignals\":[";
        }
        for (int i = 0; i < declaredSignals.length; i++) {
            if (this.signals.contains(declaredSignals[i])) {
                this.signals.remove(declaredSignals[i]);
                declaredSignals[i].undeclare();
                if (logger != null) {
                    logMsg += declaredSignals[i].toJSONString();
                    if (i < (declaredSignals.length - 1)) {
                        logMsg += ",";
                    }
                }
            } else {
                throw new SignalNotDeclaredException("You can not end a signal that is not defined");
            }
        }
        if (logger != null) {
            logMsg += "]";
            logger.log(PROGRAM_INFO, logMsg);
        }
    }

    /**
     * Do a tick in the SJ program. Executes {@link #tick()} and does all the management like
     * incrementing the tick number and logging.
     * 
     * 
     * @param inputs
     *            The input signals.
     * @return All signals of the program with the status after executing the tick.
     */
    public Signal[] doTick(final Signal... inputs) {

        if (isInInitialTick()) {
            tickNr = 0;
        } else {

            // if a program i terminated you can not execute a tick anymore
            if (isTerminated()) {
                throw new ProgramAlreadyTerminatedException(
                        "You can not do a tick from a program that has already terminated");
            } else if (!isTickDone()) {
                // NiceToHave: Better error message
                throw new CurTickNotDoneException(
                        "You cannot go to the next tick before the current tick is done");
            }

            // set all signals to absent an making sure that pre works.
            for (Signal s : signals) {
                s.nextTick();
            }

            // We use a temporary queue to swap the elements. The do not use new
            // because some garbage collectors are not very efficient.
            PriorityQueue<SJThread<StateLabel>> tmpQueue = threadsCurTick;
            threadsCurTick = threadsNextTick;
            threadsNextTick = tmpQueue;

            tickNr++;
        }

        for (Signal s : inputs) {
            s.emit();
        }

        // logging
        if (logger != null) {
            logger.log(TICK_INFO, "\"ticknr\":" + tickNr);

            String signalString = "\"signals\":[";
            for (Signal s : signals) {
                
                // ################################################################################
                // --------------------------------- changed by ybe -------------------------------
                //
                // Entries in JSON-Arrays must be comma separated!
                //
                // signalString += s.toJSONString();
            // }
            // signalString += "]";
                // --------------------------------------------------------------------------------
                signalString += s.toJSONString() + ",";
            }
            signalString = signalString.substring(0, signalString.length()-1) + "]";
            // ####################################################################################
            
            logger.log(SIGNALS, signalString);
        }

        tick();

        if (logger != null) {
            // the logging stuff
            String signalString = "\"signals\":[";
            for (Signal s : signals) {
                
                // ################################################################################
                // --------------------------------- changed by ybe -------------------------------
                //
                // Entries in JSON-Arrays must be comma separated!
                //
                // signalString += s.toJSONString();
            // }
            // signalString += "]";
                // --------------------------------------------------------------------------------
                signalString += s.toJSONString() + ",";
            }
            signalString = signalString.substring(0, signalString.length()-1) + "]";
            // ####################################################################################
            
            logger.log(SIGNALS, signalString);

            // if the string with the labels ends with ',' then ...
            if (labelsToExecute.charAt(labelsToExecute.length() - 1) == ',') {
                labelsToExecute = labelsToExecute.substring(0, (labelsToExecute.length() - 1));
            }
            logger.log(TICK_INFO, labelsToExecute + "]");
        }
        labelsToExecute = "\"ticklabels\":[";

        Signal[] ret = new Signal[signals.size()];
        ret = signals.toArray(ret);
        return ret;

    }

    /**
     * Returns all signals known by the program.
     * 
     * @return Returns the signals of the program.
     */
    public Signal[] getSignals() {
        Signal[] ret = new Signal[signals.size()];
        ret = signals.toArray(ret);
        return ret;
    }

    /**
     * Returns the name of the program.
     * 
     * @return The name of this program.
     */
    public String getName() {
        return this.getClass().toString();
    }

    /**
     * Set the logger to log the JSON informations about the program. If you set the logger to the
     * value <code>null</code> there will be no logging.
     * 
     * @param myLogger
     *            The new logger.
     * @see #getLogger()
     */
    public void setLogger(final SJLogger myLogger) {
        this.logger = myLogger;
    }

    /**
     * Returns the logger used by this program. If this method returns <code>null</code> no logger
     * is used.
     * 
     * @return The current logger of the program.
     */
    public SJLogger getLogger() {
        return this.logger;
    }

    /**
     * Activates the causality check for all signals of the program.
     */
    public void activateCausalityCheck() {
        checkCausality = true;
    }

    /**
     * Tells if the causality check is active.
     * 
     * @return <code>true</code> if the check is active else false.
     * 
     */
    public boolean isCausalityCheckActive() {
        return checkCausality;
    }

    @Override
    public String toString() {
        String s;

        s = "The SJ program " + "" + this.getClass().toString() + " is at tick " + tickNr + ".\n";
        s +=
                ((curThread == null) ? "There is cuurenty no thread running"
                        : "Currently the thread " + curThread.getLabel().name() + " is running")
                        + ".\n";

        s +=
                (threadsCurTick.isEmpty()) ? "Threre are no threads to execute in this tick.\n"
                        : "Threads to execute in this tick:\n";
        for (SJThread<StateLabel> t : threadsCurTick) {
            s += t.toString();
            // s += t.getName() + " " + t.getPriority() + "\n";
        }

        s +=
                (threadsNextTick.isEmpty()) ? "Threre are no threads to execute in the next tick.\n"
                        : "Threads to execute in the next tick:\n";
        for (SJThread<StateLabel> t : threadsNextTick) {
            s += t.toString();
            // s += t.getName() + " " + t.getPriority() + "\n";
        }

        return s;
    }

    SJThread<StateLabel> getCurThread() {
        return this.curThread;
    }

    /*
     * =========================================================================
     * ============================== SJ-commands ==============================
     * =========================================================================
     */

    /**
     * Does a abort to all descendant created by the thread currently running. A descendant is
     * created with {@link #fork(Enum, int)} and {@link #forkEB(Enum)}.
     * 
     * @see #suspend()
     */
    public void abort() {
        if (curThread != null) {
            if (curThread.getDescendants() != null && !curThread.getDescendants().isEmpty()) {
                // abort all descendant of the current thread
                for (SJThread<StateLabel> descendantThread : curThread.getDescendants()) {
                    abort(descendantThread);
                }
                // delete all descendants because they are no longer existing
                curThread.deleteAllDescendants();

                // creating a JSON string representation
                if (logger != null) {
                    logger.log(LogMsgTyp.INSTRUCTION,
                            "\"abort\":" + "{\"label\":\"" + curThread.getLabel().name() + "\","
                                    + "\"prio\":" + curThread.getPriority() + "}");
                }
            }
        } else {
            throw new ThreadException(
                    "You can not abort the descendants of a threads if threre is no thread running");
        }
    }

    /**
     * Does a abort to all descendants of a given {@link SJThread} an then remove the thread form
     * all execution lists. The method does also abort and remove recursive the descendants of the
     * descendants and so on ...
     * 
     * @param thread
     *            The thread with the descendants to abort.
     */
    private void abort(final SJThread<StateLabel> thread) {
        if (thread.getDescendants() == null || thread.getDescendants().isEmpty()) {
            // if all descendants are aborted remove the pointer to the given
            // threads in the execution lists.
            threadsCurTick.remove(thread);
            threadsNextTick.remove(thread);
        } else {
            // abort all child's
            for (SJThread<StateLabel> decendantThread : thread.getDescendants()) {
                abort(decendantThread);
            }
            // abort all nodes
            threadsCurTick.remove(thread);
            threadsNextTick.remove(thread);
        }
    }

    /**
     * Waits for a signal after an initial pause. If the signal is present and an initial pause is
     * already done this method will return <code>true</code>. Otherwise it will do a pause checked
     * in the next tick again and return false. For the check of await in the next tick
     * await has to be the first statement after a case so that we can return exactly to this
     * statement in the next tick.
     * 
     * @param signal
     *            the signal to check
     * @return <code>true</code> if signal present and an initial pause done otherwise
     *         <code>false</code>
     * 
     */
    public boolean awaitCB(final Signal signal) {

        if (curThread == null) { // there must be a running thread
            throw new ThreadException(
                    "You are not allowed to execute the await stement if no thread is running.");

        } else if (!signals.contains(signal)) { // and the given signal has to
            // be part of our signal list
            throw new SignalNotDeclaredException("The given signal has not been defined");

        } else {
            // the return value
            boolean ret, initialExecution;
            
            // ####################################################################################
            // ----------------------------------- changed by ybe ---------------------------------
            //
            // Due to internal use of Signal.isPresent(), the logging for this internally used
            // method has to be disabled. In order to do so, the logger of the Signal class is
            // temporary saved in a local variable, and the logger variable in the Signal class
            // is set to null.
            // This prevents the logging in Signal.isPresent(), or in any other methods of the
            // Signal class, since logging is only done, iff the logger variable in the Signal
            // class has been set.
            // After the internally used method Signal.isPresent() returns, the logger variable
            // in the Signal class is to be set back, using the logger saved in the local variable.
            SJLogger curLogger = signal.program.getLogger();
            signal.program.setLogger(null);
            // ####################################################################################

            if (!curThread.isInitialPauseDone()) {
                // If no initial pause is done then do the initial pause for
                // this thread.
                curThread.doInitialPause();
                // add the thread to the list of threads executed in the next
                // tick
                threadsNextTick.add(curThread);
                labelsToExecute += "\"" + curThread.getLabel().name() + "\",";
                // and tell that we have to execute await in the next tick again
                // because it is not done
                ret = false;
                // This is the initial execution for this await statement. We
                // need this to know for logging
                initialExecution = true;
                
            } else if (signal.isPresent()) { // initial pause is done and given
                // signal present

                // initial pause has to executed again if await is reached the
                // next time
                curThread.setInitialPauseDone(false);
                // await has been done and has not to be executed in the next
                // tick again
                ret = true;
                // This is not the initial execution for this await statement.
                // We
                // need this to know for logging
                initialExecution = false;
            } else { // if initial tick is done but the given signal is not
                // PRESENT
                // do await in the next tick again
                threadsNextTick.add(curThread);
                labelsToExecute += "\"" + curThread.getLabel().name() + "\",";
                // return that await is not done
                ret = false;
                // This is not the initial execution for this await statement.
                // We
                // need this to know for logging
                initialExecution = false;
            }
            
            // ####################################################################################
            // ----------------------------------- changed by ybe ---------------------------------
            //
            // Setting the logger of the Signal class to the way it was prior the internal use of
            // Signal.isPresent(). For details v.s.
            signal.program.setLogger(curLogger);
            // ####################################################################################
            
            // creating JSON string
            if (logger != null) {
                logger.log(INSTRUCTION, "\"await\":" + "{\"label\":\""
                        + curThread.getLabel().name() + "\",\"prio\":" + curThread.getPriority()
                        + ",\"initialExcecution\":" + ((initialExecution) ? "true" : "false")
                        + ",\"param\":[" + signal.toJSONString() + "],\"retval\":"
                        + ((ret) ? "true" : "false") + "}");
            }
            // if there is no await done we have to terminate the current
            // thread.
            if (!ret) {
                curThread = null;
            }
            return ret;
        }
    }

    /**
     * Part of a Process to execute 2 Program parts in a simulated parallel way. This method adds a
     * new thread to the list of threads to execute in this tick.
     * 
     * @param label
     *            The label for the new thread created with fork.
     * @param prio
     *            The priority for the new thread created with fork.
     */
    public void fork(final StateLabel label, final int prio) {
        if (curThread == null) {
            throw new ThreadException("You are not allowed to use fork "
                    + "if no thread is executing.");
        }
        for (SJThread<StateLabel> t : threadsCurTick) {
            if (prio == t.getPriority()) {
                throw new PriorityException("Every Priority of a thread has to be unique.");
            }
        }
        for (SJThread<StateLabel> t : threadsNextTick) {
            if (prio == t.getPriority()) {
                throw new PriorityException("Every Priority of a thread has to be unique.");
            }
        }
        SJThread<StateLabel> thread = new SJThread<StateLabel>(label, prio);
        threadsCurTick.add(thread);

        // The created thread is a child of the current thread. We have to add
        // him to the list of descendants of the current thread
        curThread.addDescendant(thread);

        if (logger != null) {
            logger.log(
                    INSTRUCTION,
                    "\"fork\":" + "{\"label\":\"" + curThread.getLabel().name() + "\","
                            + "\"prio\":" + curThread.getPriority() + ",\"param\":[\""
                            + label.name() + "\"," + prio + "]}");
        }

    }

    /**
     * Ends a number of forks and says there this thread should continue after the forks. The
     * <b>B</b> means we need a break after this command. The break should cause a new schedule.
     * 
     * The name forkE stands for "fork end".
     * 
     * @param label
     *            The label to continue after the forks.
     * @see #fork(Enum, int)
     */
    public void forkEB(final StateLabel label) {
        if (curThread == null) {
            throw new ThreadException("There is no thread running.");
        } else if (!curThread.getDescendants().isEmpty()) {
            
            // ####################################################################################
            // ----------------------------------- changed by ybe ---------------------------------
            // 
            // Save the old label of the current thread. Needed for the logger in order to be able
            // to log the correct label. Label of the current thread is changed just bellow this
            // block.
            String oldLabel = curThread.getLabel().name();
            // ####################################################################################

            // NiceToHave: more Comments here
            curThread.setLabel(label);

            threadsCurTick.add(curThread);

            // ####################################################################################
            // ----------------------------------- changed by ybe ---------------------------------
            //
            // if (logger != null) {
            //     logger.log(
            //             INSTRUCTION,
            //             "\"forke\":" + "{\"label\":\"" + curThread.getLabel().name() + "\","
            //                     + "\"prio\":" + curThread.getPriority() + ",\"param\":[\""
            //                     + label.name() + "\"]}");
            // }
            // ------------------------------------------------------------------------------------
            if (logger != null) {
                logger.log(
                        INSTRUCTION,
                        "\"forke\":" + "{\"label\":\"" + oldLabel + "\","
                                + "\"prio\":" + curThread.getPriority() + ",\"param\":[\""
                                + label.name() + "\"]}");
            }
            // ####################################################################################
            
            curThread = null;
        } else {
            throw new ThreadException("You can not use forke without a fork before.");
        }
    }

    /**
     * Goes to a label and continue with the code at this label. The classical jump or goto for this
     * switch-case state-machine.
     * 
     * Attention: The B in the method name means that after using this method you have to write a
     * <code>break;</code> in your program.
     * 
     * @param label
     *            The label to continue at.
     */
    public void gotoB(final StateLabel label) {
        if (curThread == null) {
            throw new ThreadException(
                    "You can not go from one label to another if no thread is running");
        } else {
            if (logger != null) {
                logger.log(
                        INSTRUCTION,
                        "\"goto\":" + "{\"label\":\"" + curThread.getLabel().name() + "\","
                                + "\"prio\":" + curThread.getPriority() + ",\"param\":[\""
                                + label.name() + "\"]}");
            }
            curThread.setLabel(label);
            threadsCurTick.add(curThread);
            curThread = null;
        }
    }

    /**
     * Halts at the current position.
     * 
     */
    public void haltCB() {
        if (curThread == null) {
            throw new ThreadException("You can not halt a thread if no thread running");
        } else {

            if (logger != null) {
                logger.log(INSTRUCTION, "\"halt\":" + "{\"label\":\"" + curThread.getLabel().name()
                        + "\"," + "\"prio\":" + curThread.getPriority() + "}");
            }

            curThread.setLabel(curThread.getLabel());
            threadsNextTick.add(curThread);
            labelsToExecute += "\"" + curThread.getLabel().name() + "\",";
            curThread = null;
        }
    }

    /**
     * Joins threads by checking if all created descendants of the current thread are executed
     * successful.
     * 
     * @return A boolean value that tells if all in from the executing thread created descendants
     *         terminated.
     * 
     */
    public boolean joinDoneCB() {
        if (curThread == null) {
            throw new ThreadException("You can not use join if there is no thread running.");
        }
        boolean ret = true;

        for (SJThread<StateLabel> thread : curThread.getDescendants()) {
            // if there is a descendant still alive
            if (threadsCurTick.contains(thread) || threadsNextTick.contains(thread)) {
                // do joinDone in the next tick again
                threadsNextTick.add(curThread);
                labelsToExecute += "\"" + curThread.getLabel().name() + "\",";
                ret = false;
                break;
            }
        }

        // creating JSON string
        if (logger != null) {
            logger.log(INSTRUCTION, "\"joinDone\":" + "{\"label\":\"" + curThread.getLabel().name()
                    + "\"," + "\"prio\":" + curThread.getPriority() + ",\"retval\":"
                    + ((ret) ? "true" : "false") + "}");
        }

        // if there is no join done we have to terminate the currentThread.
        if (!ret) {
            curThread = null;
        }
        return ret;
    }

    /**
     * Stops the execution of the state in which it is used for the current tick. In the next tick
     * this thread will continue at the label given as a parameter with the same priority. This has
     * no effect on the execution of parallel threads.
     * 
     * Attention: The B in the method name means that after using this method you have to write a
     * <code>break;</code> in your program.
     * 
     * Child threads are <b>not</b> destroyed by pause.
     * 
     * 
     * @param resumeLabel
     *            - the label this thread will resume at in the next tick.
     */
    public void pauseB(final StateLabel resumeLabel) {

        // throws a exception if no thread running
        if (curThread == null) {
            throw new ThreadException("You can not pause a thread if there is no thread running.");
        }

        curThread.setLabel(resumeLabel);
        threadsNextTick.add(curThread);
        labelsToExecute += "\"" + curThread.getLabel().name() + "\",";
        // creating JSON string
        if (logger != null) {
            logger.log(INSTRUCTION, "\"pause\":" + "{\"label\":\"" + curThread.getLabel().name()
                    + "\"," + "\"prio\":" + curThread.getPriority() + ",\"param\":[\""
                    + resumeLabel.name() + "\"]}");
        }
        curThread = null;

    }

    /**
     * Changes the priority of a thread and cause a new schedule. The thread with the highest
     * priority will always execute at the next scheduling.
     * 
     * 
     * @param label
     *            the label to continue at the next time executing this thread
     * @param prio
     *            the new priority of this thread
     */
    public void prioB(final StateLabel label, final int prio) {
        if (curThread == null) {
            throw new ThreadException("You can not change the priority of a thread "
                    + "if there is currently no thread running.");
        } else {

            // checking if the priority already exists
            for (SJThread<StateLabel> t : threadsCurTick) {
                if (prio == t.getPriority()) {
                    throw new PriorityException("Every Priority of a thread has to be unique.");
                }
            }
            for (SJThread<StateLabel> t : threadsNextTick) {
                if (prio == t.getPriority()) {
                    throw new PriorityException("Every Priority of a thread has to be unique.");
                }
            }

            // creating JSON string
            if (logger != null) {
                logger.log(
                        INSTRUCTION,
                        "\"prio\":" + "{\"label\":\"" + curThread.getLabel().name() + "\","
                                + "\"prio\":" + curThread.getPriority() + ",\"param\":[\""
                                + label.name() + "\"," + prio + "]}");
            }

            curThread.setLabel(label);
            curThread.setPriority(prio);
            threadsCurTick.add(curThread);
            curThread = null;
        }
    }

    /**
     * Suspends all descendants threads of the current thread.
     * 
     * @see #abort()
     */
    public void suspend() {
        if (curThread != null) {
            if (curThread.getDescendants() != null) {
                for (SJThread<StateLabel> descendantThread : curThread.getDescendants()) {
                    suspend(descendantThread);
                }
            }
            // creating a JSON string representation
            if (logger != null) {
                logger.log(INSTRUCTION,
                        "\"suspend\":" + "{\"label\":\"" + curThread.getLabel().name() + "\","
                                + "\"prio\":" + curThread.getPriority() + "}");
            }
        } else {
            throw new ThreadException("You can not suspend threads if threre is no thread running.");
        }
    }

    /**
     * Suspend recursive all child threads of the given thread and then the given thread itself.
     * 
     * @param thread
     *            The thread to suspend.
     */
    private void suspend(final SJThread<StateLabel> thread) {
        if (thread.getDescendants() != null) {
            for (SJThread<StateLabel> descendantThread : thread.getDescendants()) {
                suspend(descendantThread);
            }
        }

        if (threadsCurTick.contains(thread)) {
            threadsCurTick.remove(thread);
            threadsNextTick.add(thread);
            labelsToExecute += "\"" + thread.getLabel().name() + "\",";
        }
    }

    /**
     * Terminates the current Thread. This execution should always be used if all execution of the
     * thread are done.
     * 
     * <b>Attention:</b> The B in the method name means that after using this method you have to
     * write a <code>break;</code> in your program.
     * 
     */
    public void termB() {
        if (curThread == null) {
            throw new ThreadException("You can not terminate a thread that is already terminated");
        } else {
            // creating JSON string
            if (logger != null) {
                logger.log(INSTRUCTION, "\"term\":" + "{\"label\":\"" + curThread.getLabel().name()
                        + "\"," + "\"prio\":" + curThread.getPriority() + "}");
            }
            curThread = null;
        }
    }

    /**
     * 
     * Aborts all descendants and their descendants of the executing thread. After that the
     * scheduler is advised to go to the given label next time {@link #state()} is used.
     * 
     * This method is a shorthand for {@link #abort()} + {@link #gotoB(Enum)}.
     * 
     * @param label
     *            the label to go to
     * @see #abort()
     * @see #gotoB(Enum)
     */
    public void transB(final StateLabel label) {
        if (curThread == null) {
            throw new ThreadException(
                    "You can not abort the descendants of a threads if threre is no thread running.");

        } else {
            // abort all descendant of the current thread
            for (SJThread<StateLabel> t : curThread.getDescendants()) {
                abort(t);
            }
            // create JSON string
            if (logger != null) {
                logger.log(
                        INSTRUCTION,
                        "\"trans\":" + "{\"label\":\"" + curThread.getLabel().name() + "\","
                                + "\"prio\":" + curThread.getPriority() + ",\"param\":[\""
                                + label.name() + "\"]}");
            }
            // goto label
            curThread.setLabel(label);
            threadsCurTick.add(curThread);
            curThread = null;

        }

    }

}
