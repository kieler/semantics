/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sjl;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * The SJLProgram implements a light version of SynchronousJava (SJ) Programs.
 * 
 * @author cmot
 * @kieler.design 2013-05-23 proposed cmot
 * @kieler.rating 2013-05-23 proposed
 * 
 */
abstract public class SJLProgramOld<State extends Enum<?>> implements Cloneable {

    /** A flag indicating debug output should be collected. */
    private boolean debug = false;

    /** The debug message of the latest executed tick. */
    private String debugMessage = "";

    /** Enabled means NOT-paused for a tick. */
    private PriorityQueue<Thread> enabledThreads;

    /** Alive means NOT-aborted and NOT-terminated. */
    private PriorityQueue<Thread> aliveThreads;

    /** The current thread that is executed. */
    private Thread currentThread;
    
    /** The last tick time in Milliseconds. */
    private long lastTickTime;

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public SJLProgramOld<?> clone() throws CloneNotSupportedException {
        @SuppressWarnings("rawtypes")
        SJLProgramOld clone = (SJLProgramOld<?>) super.clone();
        clone.enabledThreads = enabledThreads.cloneDeep();
        clone.aliveThreads = aliveThreads.cloneDeep();
        return clone;
    }    
    
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
    public SJLProgramOld(State startState, int startPrio, int maxPrio) {
        // Create new priority queue for alive threads
        aliveThreads = new PriorityQueue<Thread>(maxPrio);
        // Create the main thread
        Thread startThread = new Thread(startState, null);
        // Add the main thread as an alive thread
        aliveThreads.insert(startThread, startPrio);
        // Set the start thread as the current thread
        currentThread = startThread;
        // Note that the enabled threads will be cloned from the alive threads
        // in the doTick() method
    }

    // -------------------------------------------------------------------------

    // This method must be defined by implementing classes. It defines the
    // reaction of the SJLProgram.
    abstract protected void tick();

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Do a non benchmarked tick.
     *
     * @return true, if successful
     */
    public boolean doTick() {
        // Clone the alive threads means making all alive threads enabled for the current tick
        enabledThreads = aliveThreads.cloneShallow();
        // Run the tick() method
        tick();
        lastTickTime = -1;
        // Return whether the program terminated
        return isTerminated();
    }

    // -------------------------------------------------------------------------
    
    /**
     * Do a benchmarked tick with a specific number of runs.
     *
     * @param number the number
     * @return true, if successful
     */
     public boolean doTick(int number) {
        // Clone the alive threads means making all alive threads enabled
        enabledThreads = aliveThreads.cloneShallow();
        // Clone the SJLProgram number of times
        SJLProgramOld<?>[] programs = new SJLProgramOld[number];
        for (int i = 0; i < number; i++) {
            Object o;
            try {
                o = this.clone();
                if (o instanceof SJLProgramOld) {
                   programs[i] = ((SJLProgramOld<?>)o);
                }
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        // Start the benchmark, get nanoseconds
        long t1 = getUserTime();
        for (int i = 0; i < number; i++) {
            // Run the tick() method ith time in the benchmark
           programs[i].tick();
        }
        // End the benchmark, get nanoseconds
        long t2 = getUserTime();
        // Run the tick() method
        tick();
        // Norm taken time to the number of runs
        lastTickTime = (t2 - t1)/number;
        // Return whether the program terminated
        return isTerminated();
    }

    // -------------------------------------------------------------------------

    public boolean isTickDone() {
        // Return whether there are no more enabled threads
        if (enabledThreads.getFirst() ==  null) {
            if (debug) {
                debug("\n" + getDebugAliveThreads(), null);
            }
        }
        return (enabledThreads.getFirst() ==  null);
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if the whole SJLProgram has terminated. This is the case if there are no more alive
     * threads.
     * 
     * @return true, if is terminated
     */
    public boolean isTerminated() {
        // Return whether there are no more threads that would be enabled for all following
        // ticks, i.e., there are no more alive threads
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
        currentThread = enabledThreads.getFirst();
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
        // Add new thread as an alive & enabled one
        aliveThreads.insert(forkedThread, prio);
        enabledThreads.insert(forkedThread, prio);
    }

    // -------------------------------------------------------------------------

    protected void termB() {
        debug("Terminating", currentThread);
        if (this.currentThread.parent != null) {
            this.currentThread.parent.childrenRunning.remove(currentThread);
        }

// PRIOR IMPLEMENTATION        
//        // Set the terminated flag for the current thread
//        currentThread.terminated = true;
        // Remove the thread from the active and the alive ones
        enabledThreads.remove(currentThread);
        aliveThreads.remove(currentThread);
        
// Do NOT perform the following code as it destroys the
// parent-child relations necessary for aborts!
//        
//        // Remove the thread from its parents children list
//        if (currentThread.parent != null) {
//            currentThread.parent.children.remove(currentThread);
//        }
        
        // Note that at this point there may be descendant child threads
        // that are still active and alive!
    }

    // -------------------------------------------------------------------------

    protected void haltB() {
        // Halt must not terminate the thread!
        // This is WRONG -> termB();

        // Remove the thread from the active ones (it is paused now)
        enabledThreads.remove(currentThread);
        debug("Pausing", currentThread);
        // The halted thread will continue at the label it
        // currently is in the next tick and again execute haltB
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
        enabledThreads.remove(currentThread);
        debug("Pausing", currentThread);
    }

    // -------------------------------------------------------------------------

    protected void prioB(int prio, State resumeState) {
        // Update the state label
        gotoB(resumeState);
        // Reorder elements
        enabledThreads.update(currentThread, prio);
        aliveThreads.update(currentThread, prio);
    }

    // -------------------------------------------------------------------------

    protected boolean join() {
        // True iff all children have terminated
        return (this.currentThread.childrenRunning.size() == 0);

// PRIOR IMPLEMENTATION        
//        // Go thru all (direct) children and check whether they have terminated
//        for (Thread child : currentThread.children) {
//            if (!child.terminated) {
//                debug("Join failed of", currentThread);
//                // If any child not terminated yet, return false
//                return false;
//            }
//        }
//        debug("Join sucessfull of", currentThread);
//        // Return true if all children terminated
//        return true;
    }

    // -------------------------------------------------------------------------
    // -- SJ CONVENIENT STATEMENT IMPLEMENTATIONS
    // -------------------------------------------------------------------------

    protected void transB(State stateLabel) {
        if (currentThread.children.size() > 0) {
            abort();
        }
        gotoB(stateLabel);
    }

    protected int currentPrio() {
        return enabledThreads.getPrio(currentThread);
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
        enabledThreads.remove(thread);
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
    protected class Thread implements Cloneable {
        //public boolean terminated;
        public State state;
        public ArrayList<Thread> children = new ArrayList<Thread>();
        public ArrayList<Thread> childrenRunning = new ArrayList<Thread>();
        public Thread parent;

        @SuppressWarnings("unchecked")
        public Thread clone() throws CloneNotSupportedException {
            Thread clone = (Thread) super.clone();
            clone.children = (ArrayList<Thread>) children.clone();
            clone.childrenRunning = (ArrayList<Thread>) childrenRunning.clone();
            return clone;
        }    
        
        public boolean terminated() {
            if (this.parent != null) {
                return (!this.parent.childrenRunning.contains(this));
            }
            return true;
        }
        
        public String toString() {
            return this.state.name() + " (term:" + this.terminated() + ", children:"
                    + this.children.size() + ")";
        }

        public Thread(State state, Thread parent) {
            this.state = state;
            this.parent = parent;
            if (parent != null && parent.childrenRunning != null) {
                parent.childrenRunning.add(this);
            }
            //this.terminated = false;
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
            String threadState = "";
            String threadPrio = "";
            if (thread != null) {
                threadPrio = aliveThreads.getPrio(thread) + "";
                if (thread.state != null) {
                    threadState = thread.state + "";
                }
                if (threadPrio.length() > 0) {
                    threadPrio = " (" + threadPrio + ")";
                }
            }
            if (forkedOrResumedState == null) {
                debugMessage += (action + " " + threadState + threadPrio + "\n");
            } else {
                debugMessage += (action + " " + threadState + threadPrio + "" + " ->" + forkedOrResumedState)
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

    /**
     * Gets the hierarchical debug information of all alive threads.
     *
     * @return the debug alive threads
     */
    public String getDebugAliveThreads() {
        if ( this.aliveThreads == null) {
            return "";
        }
        List<Thread> threadList = this.aliveThreads.getQueue();
        List<Thread> visitedThreadList = new LinkedList<Thread>();
        String serialization = "";
        
        for (Thread thread: threadList) {
            // If we not serialized this before
            if (thread != null && !visitedThreadList.contains(thread)) {
                // Get the root thread
                Thread rootThread = getRootParent(thread);
                serialization += serializeThread(rootThread, "│ ", "  " , "",  visitedThreadList);
            }
        }
        return serialization;
    }
    
    // -------------------------------------------------------------------------
    
    /**
     * Serialize thread.
     *
     * @param thread the thread
     * @param tabC the tab c
     * @param tabN the tab n
     * @param currentTab the current tab
     * @param visitedThreadList the visited thread list
     * @return the string
     */
    private String serializeThread(Thread thread, String tabC, String tabN, String currentTab, List<Thread> visitedThreadList) {
        visitedThreadList.add(thread);
        String serialization = "";
        serialization += currentTab + "└─• " + thread.toString() + "\n";
        String childrenSerialization = "";
        if (thread.children.size() > 0) {
            for (Thread child : thread.children) {
                String tab = tabN;
                if (thread.parent != null && thread.parent.children.size() > 1) {
                    tab = tabC;
                }
                childrenSerialization += serializeThread(child, tabC, tabN, currentTab + tab, visitedThreadList);
            }
        }
        return serialization + childrenSerialization;
    }
    
    // -------------------------------------------------------------------------
    
    /**
     * Gets the root parent of a thread.
     *
     * @param thread the thread
     * @return the root parent
     */
    private Thread getRootParent(Thread thread) {
        if (thread.parent == null) {
            return thread;
        }
        else {
            return getRootParent(thread.parent);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Get user time in nanoseconds.
     *
     * @return the user time
     */
    protected long getUserTime() {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        return bean.isCurrentThreadCpuTimeSupported() ?
            bean.getCurrentThreadCpuTime() : 0L;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the last tick time in Milliseconds.
     *
     * @return the lastTickTime
     */
    public long getLastTickTime() {
        return lastTickTime;
    }

    // -------------------------------------------------------------------------
}
