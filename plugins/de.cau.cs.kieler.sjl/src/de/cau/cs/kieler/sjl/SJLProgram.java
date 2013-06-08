/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sjl;

import java.util.ArrayList;

/**
 * The SJLProgram implements a light version of SynchronousJava (SJ) Programs.
 * 
 * @author cmot
 * @kieler.design 2013-05-23 proposed cmot
 * @kieler.rating 2013-05-23 proposed
 * 
 */
abstract public class SJLProgram<State extends Enum<?>> {

    /** A flag indicating debug output should be collected. */
    private boolean debug = false;

    /** The debug message of the latest executed tick. */
    private String debugMessage = "";

    /** Active means NOT-paused for a tick. */
    private PriorityQueue<Thread> activeThreads;

    /** Alive means NOT-aborted and NOT-terminated. */
    private PriorityQueue<Thread> aliveThreads;

    /** The current thread that is executed. */
    private Thread currentThread;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new SJLProgram.
     * 
     * @param startState
     *            the start state
     * @param startPrio
     *            the start priority
     * @param maxPrio
     *            the max priority
     */
    public SJLProgram(State startState, int startPrio, int maxPrio) {
        // Create new active and alive priority queues
        aliveThreads = new PriorityQueue<Thread>(maxPrio);
        // Create the main thread
        Thread startThread = new Thread(startState, null);
        // Add the main thread as an alive thread
        aliveThreads.insert(startThread, startPrio);
        // Set the start thread as the current thread
        currentThread = startThread;
        // Note that the active threads will be cloned from the alive threads
        // in the doTick() method
    }

    // -------------------------------------------------------------------------

    // This method must be defined by implementing classes. It defines the
    // reaction of the SJLProgram.
    abstract protected void tick();

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    public boolean doTick() {
        // Clone the alive threads means making all alive threads active
        activeThreads = aliveThreads.clone();
        // Run the tick() method
        tick();
        // Return whether the program terminated
        return isTerminated();
    }

    // -------------------------------------------------------------------------

    public boolean isTickDone() {
        // Return whether there are no more active threads
        if (activeThreads.size == 0) {
            if (debug) {
                System.out.println("\n");
                for (Object object : aliveThreads.elements) {
                    if (object != null && object instanceof SJLProgram.Thread) {
                        // Parameterized type check is not possible
                        @SuppressWarnings("unchecked")
                        Thread thread = (Thread) object;
                        debug("Children of", thread);
                        for (Thread child : thread.children) {
                            debug("   -", child);
                        }
                    }
                }
                System.out.println("\n");
            }
        }
        return (activeThreads.size == 0);
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if the whole SJLProgram has terminated. This is the case if there are no more alive
     * threads.
     * 
     * @return true, if is terminated
     */
    public boolean isTerminated() {
        // Return whether there are no more active threads
        return (aliveThreads.size == 0);
    }

    // -------------------------------------------------------------------------

    /**
     * The central state() method should be used within the tick() method of derived classes to
     * switch to the current thread.
     * 
     * @return the state
     */
    protected State state() {
        // Update the current thread
        currentThread = activeThreads.getFirst();
        // Find the new currentState
        debug("Updating state", currentThread);
        return currentThread.state;
    }

    // -------------------------------------------------------------------------
    // -- SJ STATEMENT IMPLEMENTATIONS
    // -------------------------------------------------------------------------

    protected void fork(State forkedState, int prio) {
        debug("Forking", currentThread, forkedState);
        // Create a new thread
        Thread forkedThread = new Thread(forkedState, currentThread);
        // Add child-dependency to current one
        currentThread.children.add(forkedThread);
        // Add new thread as an alive & active one
        aliveThreads.insert(forkedThread, prio);
        activeThreads.insert(forkedThread, prio);
    }

    // -------------------------------------------------------------------------

    protected void termB() {
        debug("Terminating", currentThread);
        // Set the terminated flag for the current thread
        currentThread.terminated = true;
        // Remove the thread from the active and the alive ones
        activeThreads.remove(currentThread);
        aliveThreads.remove(currentThread);
        // Remove the thread from its parents children list
        if (currentThread.parent != null) {
            currentThread.parent.children.remove(currentThread);
        }
        // Note that at this point there may be descendant child threads
        // that are still active and alive!
    }

    // -------------------------------------------------------------------------

    protected void haltB() {
        termB();
    }

    // -------------------------------------------------------------------------

    protected void abort() {
        debug("Aborting children of", currentThread);
        // Abort all descendants (all children and children of children...)
        for (Thread childThread : currentThread.children) {
            // Recursively abort children
            abort(childThread);
        }
        // Remove children
        currentThread.children.clear();
    }

    // -------------------------------------------------------------------------

    protected void gotoB(State resumeState) {
        debug("Goto of", currentThread, resumeState);
        // Update the state label
        currentThread.state = resumeState;
    }

    // -------------------------------------------------------------------------

    protected void pauseB(State resumeState) {
        // Update the state label
        gotoB(resumeState);
        // Remove the thread from the active ones (it is paused now)
        activeThreads.remove(currentThread);
        debug("Pausing", currentThread);
    }

    // -------------------------------------------------------------------------

    protected void prioB(int prio, State resumeState) {
        // Update the state label
        gotoB(resumeState);
        // Reorder elements
        activeThreads.update(currentThread, prio);
        aliveThreads.update(currentThread, prio);
    }

    // -------------------------------------------------------------------------

    protected boolean join() {
        // Go thru all (direct) children and check whether they have terminated
        for (Thread child : currentThread.children) {
            if (!child.terminated) {
                debug("Join failed of", currentThread);
                // If any child not terminated yet, return false
                return false;
            }
        }
        debug("Join sucessfull of", currentThread);
        // Return true if all children terminated
        return true;
    }

    // -------------------------------------------------------------------------
    // -- SJ CONVENIENT STATEMENT IMPLEMENTATIONS
    // -------------------------------------------------------------------------

    protected void transB(State stateLabel) {
        abort();
        gotoB(stateLabel);
    }

    protected int currentPrio() {
        return activeThreads.getPrio(currentThread);
    }

    protected Thread getCurrentThread() {
        return currentThread;
    }

    // -------------------------------------------------------------------------
    // -- INTERNAL METHODS / CLASSES
    // -------------------------------------------------------------------------

    private void abort(Thread thread) {
        debug("Aborting", thread);
        // Remove the thread from active and alive ones
        activeThreads.remove(thread);
        aliveThreads.remove(thread);
        // Abort all descendants (all children and children of children...)
        for (Thread childThread : thread.children) {
            // Recursively abort children
            abort(childThread);
        }
        // Remove children
        thread.children.clear();
    }

    // -------------------------------------------------------------------------

    /**
     * The internal Thread class encompasses the parent-child relations. Fields have been declared
     * public for direct access to them.
     */
    protected class Thread {
        public boolean terminated;
        public State state;
        public ArrayList<Thread> children = new ArrayList<Thread>();
        public Thread parent;

        public String toString() {
            return this.state.name() + " (term:" + this.terminated + ", children:"
                    + this.children.size() + ")";
        }

        public Thread(State state, Thread parent) {
            this.state = state;
            this.parent = parent;
            this.terminated = false;
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Create debug messages during SJ program execution. This is internally used.
     * 
     * @param action
     *            the action
     * @param thread
     *            the thread
     */
    private void debug(String action, Thread thread) {
        debug(action, thread, null);
    }

    // -------------------------------------------------------------------------

    /**
     * Create debug messages during SJ program execution. This is internally used.
     * 
     * @param action
     *            the action
     * @param thread
     *            the thread
     * @param forkedOrResumedState
     *            the forked or resumed state
     */
    private void debug(String action, Thread thread, State forkedOrResumedState) {
        if (debug) {
            String threadState = "null";
            String threadPrio = "-1";
            if (thread != null) {
                threadPrio = aliveThreads.getPrio(thread) + "";
                if (thread.state != null) {
                    threadState = thread.state + "";
                }
            }
            if (forkedOrResumedState == null) {
                debugMessage += (action + " " + threadState + " (" + threadPrio + ")\n");
            } else {
                debugMessage += (action + " " + threadState + " (" + threadPrio + ")" + " ->" + forkedOrResumedState)
                        + "\n";
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Turn debug messages on or off.
     * 
     * @param turnDebugOnOff
     *            the new debug
     */
    public void setDebug(boolean turnDebugOnOff) {
        debug = turnDebugOnOff;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if debugging is turned on.
     * 
     * @return true, if is debug
     */
    public boolean isDebug() {
        return debug;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the debug message of the latest executed tick. Note that this will return an empty
     * String if debug (setDebug()) is not turned on.
     * 
     * @return the last debug message
     */
    public String getLastDebugMessage() {
        return debugMessage;
    }

    // -------------------------------------------------------------------------
}
