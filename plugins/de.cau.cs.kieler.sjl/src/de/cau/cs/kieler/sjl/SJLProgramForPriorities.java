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

/**
 * The SJLProgram implements a light version of SynchronousJava (SJ) Programs for the priority 
 * based compilation approach.
 *
 * @param <State> the generic type
 * @author lpe
 *
 */
abstract public class SJLProgramForPriorities<State extends Enum<?>> implements Cloneable {

    /** A flag indicating debug output should be collected. */
    private boolean debug = false;

    /** The debug message of the latest executed tick. */
    private String debugMessage = "";

    /** The max group. */
    private int maxGroup;
    
    /** The max prio. */
    private int maxPrio;
    
    /** The coarse program counter. */
    private ArrayList<State> coarseProgramCounter;

    /** Active means NOT-paused for a tick. */
    private int[] active;

    /** Alive means NOT-aborted and NOT-terminated. */
    private int[] alive;

    /** The current thread that is executed (identified by its priority). */
    private int currentThread;

    /** The last tick time in Nanoseconds. */
    private long lastTickTime;

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public SJLProgramForPriorities<?> clone() throws CloneNotSupportedException {
        @SuppressWarnings("rawtypes")
        SJLProgramForPriorities clone = (SJLProgramForPriorities<?>) super.clone();
        clone.coarseProgramCounter =  (ArrayList<State>)coarseProgramCounter.clone();
        clone.alive = alive.clone();
        clone.active = active.clone();
        clone.currentThread = currentThread;
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
    public SJLProgramForPriorities(State startState, int startPrio, int maxPrio) {
        this.maxPrio = maxPrio;
        this.maxGroup = (maxPrio / 32) + 1;
        // Create new priority queue for alive threads
        this.alive = new int[maxGroup];
        this.active = new int[maxGroup];

        this.coarseProgramCounter = new ArrayList<State>(maxPrio + 1);
        // Initialize pc & parent array with the start state
        for (int i = 0; i < maxPrio + 1; i++) {
            this.coarseProgramCounter.add(startState);
//            parent[i] = -1;
        }

        // Create the main thread and
        // add the main thread as an alive thread
        setAdd(alive, startPrio);
        // Set the start thread as the current thread
        currentThread = startPrio;
        // Note that the enabled threads will be cloned from the alive threads
        // in the doTick() method
    }

    // -------------------------------------------------------------------------

    // This method must be defined by implementing classes. It defines the
    // reaction of the SJLProgram.
    /**
     * Tick.
     */
    abstract protected void tick();

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Do a non benchmarked tick.
     * 
     * @return true, if successful
     */
    public boolean doTick() {
        // Clear debugMessage
        if (debug) {
            debugMessage = "";
        }
        // Clone the alive threads means making all alive threads enabled for the current tick
        setCopyFrom(active, alive);
        // Run the tick() method
        tick();
        lastTickTime = -1;
        // Print debug message
        if (debug) {
            //debugMessage += "\n" + getDebugAliveThreads();
        }
        // Return whether the program terminated
        return isTerminated();
    }

    // -------------------------------------------------------------------------

    /**
     * Do a benchmarked tick with a specific number of runs.
     * 
     * @param number
     *            the number
     * @return true, if successful
     */
    public boolean doTick(int number) {
        // Clear debugMessage
        if (debug) {
            debugMessage = "";
        }
        // Clone the alive threads means making all alive threads enabled
        setCopyFrom(active, alive);
        // Clone the SJLProgram number of times
        SJLProgramForPriorities<?>[] programs = new SJLProgramForPriorities[number];
        for (int i = 0; i < number; i++) {
            Object o;
            try {
                o = this.clone();
                if (o instanceof SJLProgramForPriorities) {
                    programs[i] = ((SJLProgramForPriorities<?>) o);
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
        lastTickTime = (t2 - t1) / number;
        // Print debug message
        if (debug) {
            //debugMessage += "\n" + getDebugAliveThreads();
        }
        // Return whether the program terminated
        return isTerminated();
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is tick done.
     *
     * @return true, if is tick done
     */
    public boolean isTickDone() {
        // Return whether there are no more enabled threads
        return setIsEmpty(active);
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
        return setIsEmpty(alive);
    }

    // -------------------------------------------------------------------------

    /**
     * Bit scan reverse.
     *
     * @param set the set
     * @return the int
     */
    private int bitScanReverse(int[] set) {
        for (int group = maxGroup - 1; group >= 0; group--) {
            int groupInternalId = -1;
            for (int bit = 0, maxBits = 31, test = ~(~0 >>> 1); 0 != test; ++bit, test >>>= 1) {
                if (test == (set[group] & test)) {
                    groupInternalId = (maxBits - bit);
                    break;
                }
            }
            if (groupInternalId != -1) {
                return getThreadId(group, groupInternalId);
            }
        }
        return -1;
    }

    /**
     * The central state() method should be used within the tick() method of derived classes to
     * switch to the current thread.
     * 
     * @return the state
     */
    protected State state() {
        currentThread = bitScanReverse(active);
        if (currentThread != -1) {
            return coarseProgramCounter.get(currentThread);
        }
        // This is an error: No enabled thread could be found
        return null;

        // // Update the current thread
        // currentThread = enabledThreads.getFirst();
        // // Find the new currentState
        // debug("Updating state", currentThread);
        // return currentThread.state;
    }

    // -------------------------------------------------------------------------
    // -- SJ STATEMENT IMPLEMENTATIONS
    // -------------------------------------------------------------------------

    /**
     * Fork.
     *
     * @param forkedState the forked state
     * @param prio the prio
     */
    protected void fork(State forkedState, int prio) {
        debug("Forking", currentThread, forkedState);
        // Create a new thread 
        coarseProgramCounter.set(prio, forkedState);
        // Add new thread as an alive & enabled one
        setAdd(alive, prio);
        setAdd(active, prio);
    }
    
    // -------------------------------------------------------------------------
    
    /**
     * Fork.
     *
     * @param forkedStates the forked states
     * @param prios the prios
     */
    protected void fork(State[] forkedStates, int[] prios) {
        for(int i = 0; i < prios.length; i++) {
            debug("Forking", currentThread, forkedStates[i]);
            // Create a new thread
            coarseProgramCounter.set(prios[i], forkedStates[i]);
            // Set new thread as an alive & enabled one
            setAdd(alive, prios[i]);
            setAdd(active, prios[i]);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Term b.
     */
    protected void termB() {
        debug("Terminating", currentThread);
        // Do not do the following
        // if (_parent[currentThread] != -1) {
        // int parentThread = _parent[currentThread];
        // //Remove current child from its parents descendants
        // //setDelete(_desc[parentThread], currentThread);
        // }

        // Remove the thread from the active and the alive ones
        setDelete(active, currentThread);
        setDelete(alive, currentThread);

        // Do NOT perform the following code as it destroys the
        // parent-child relations necessary for aborts!
        //
        // // Remove the thread from its parents children list
        // if (currentThread.parent != null) {
        // currentThread.parent.children.remove(currentThread);
        // }

        // Note that at this point there may be descendant child threads
        // that are still active and alive!
    }

    // -------------------------------------------------------------------------

    /**
     * Halt b.
     */
    protected void haltB() {
        // Halt must not terminate the thread!
        // This is WRONG -> termB();

        // Remove the thread from the active ones (it is paused now)
        setDelete(active, currentThread);
        debug("Pausing", currentThread);
        // The halted thread will continue at the label it
        // currently is in the next tick and again execute haltB
    }

    // -------------------------------------------------------------------------

    /**
     * Goto b.
     *
     * @param resumeState the resume state
     */
    protected void gotoB(State resumeState) {
        debug("Goto of", currentThread, resumeState);
        // Update the state label
        coarseProgramCounter.set(currentThread, resumeState);
    }

    // -------------------------------------------------------------------------

    /**
     * Pause b.
     *
     * @param resumeState the resume state
     */
    protected void pauseB(State resumeState) {
        // Update the state label
        gotoB(resumeState);
        // Remove the thread from the active ones (it is paused now)'
        setDelete(active, currentThread);
        debug("Pausing", currentThread);
    }

    // -------------------------------------------------------------------------

    /**
     * Prio b.
     *
     * @param prio the prio
     * @param resumeState the resume state
     */
    protected void prioB(int prio, State resumeState) {
        // Update the state label
        gotoB(resumeState);

        if (prio != currentThread) {
            
            // Update PC
            coarseProgramCounter.set(prio, coarseProgramCounter.get(currentThread));

            // Update thread ID in enabled & alive lists
            setDelete(active, currentThread);
            setDelete(alive, currentThread);
            setAdd(active, prio);
            setAdd(alive, prio);

        }
    }

    // -------------------------------------------------------------------------
    
    /**
     * Join.
     *
     * @return true, if successful
     */
    protected boolean join(int[] children) {
        // Goes through all given children/siblings and checks if they have terminated
        int[] childset = new int[alive.length];
        for(int i = 0; i < children.length; i++) {
            setAdd(childset, children[i]);
        }
        return (setDisjoint(alive, childset ));
    }

    // -------------------------------------------------------------------------
    // -- SJ CONVENIENT STATEMENT IMPLEMENTATIONS
    // -------------------------------------------------------------------------


    /**
     * Current prio.
     *
     * @return the int
     */
    protected int currentPrio() {
        return currentThread;
    }

    /**
     * Gets the current label.
     *
     * @return the current label
     */
    protected State getCurrentLabel() {
        return (coarseProgramCounter.get(currentThread));
    }

    // -------------------------------------------------------------------------
    // -- INTERNAL METHODS / CLASSES
    // -------------------------------------------------------------------------

    /**
     * Create debug messages during SJ program execution. This is internally used.
     * 
     * @param action
     *            the action
     * @param thread
     *            the thread
     */
    private void debug(String action, int thread) {
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
    private void debug(String action, int thread, State forkedOrResumedState) {
        if (debug) {
            String threadState = "";
            String threadPrio = "";
            if (thread != -1) {
                threadState = (coarseProgramCounter.get(thread)).name();
                threadPrio = thread + "";
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
     * Get user time in nanoseconds.
     * 
     * @return the user time
     */
    protected long getUserTime() {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        return bean.isCurrentThreadCpuTimeSupported() ? bean.getCurrentThreadCpuTime() : 0L;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the last tick time in Nanoseconds.
     * 
     * @return the lastTickTime
     */
    public long getLastTickTime() {
        return lastTickTime;
    }

    // -------------------------------------------------------------------------


    // Get group of a thread ID
    /**
     * Gets the group id.
     *
     * @param id the id
     * @return the group id
     */
    private int getGroupId(int id) {
        return (id >> 8);
    }

    /**
     * Gets the thread id.
     *
     * @param group the group
     * @param groupInternalId the group internal id
     * @return the thread id
     */
    private int getThreadId(int group, int groupInternalId) {
        // (group * 32) + groupInternalId
        return (group << 8) + groupInternalId;
    }

    // Get the internal id of a thread within its group
    /**
     * Gets the id inside group.
     *
     * @param id the id
     * @return the id inside group
     */
    private int getIdInsideGroup(int id) {
        return (id % 32);
    }

    // Add a thread ID to a set
    /**
     * Sets the add.
     *
     * @param set the set
     * @param id the id
     */
    private void setAdd(int[] set, int id) {
        int group = getGroupId(id);
        set[group] |= (1 << getIdInsideGroup(id));
    }

    // Delete a thread from a set
    /**
     * Sets the delete.
     *
     * @param set the set
     * @param id the id
     */
    private void setDelete(int[] set, int id) {
        int group = getGroupId(id);
        set[group] &= ~(1 << getIdInsideGroup(id));
    }

    // Clear a set
    // private void setClear(int[] set) {
    // for (int i = 0; i < set.length; i++) {
    // set[i] = 0;
    // }
    // }

    // Copy all elements of set2 to set1
    /**
     * Sets the copy from.
     *
     * @param set1 the set1
     * @param set2 the set2
     */
    private void setCopyFrom(int[] set1, int[] set2) {
        for (int i = 0; i < set2.length; i++) {
            set1[i] = set2[i];
        }
    }

    // Add a set2 to a set1
    /**
     * Sets the add set.
     *
     * @param set1 the set1
     * @param set2 the set2
     */
    private void setAddSet(int[] set1, int[] set2) {
        for (int i = 0; i < set2.length; i++) {
            set1[i] |= set2[i];
        }
    }

    // Delete a set2 from a set1
    /**
     * Sets the delete set.
     *
     * @param set1 the set1
     * @param set2 the set2
     */
    private void setDeleteSet(int[] set1, int[] set2) {
        for (int i = 0; i < set2.length; i++) {
            set1[i] &= ~set2[i];
        }
    }

    // Check if a set contains a thread ID
    /**
     * Sets the contains.
     *
     * @param set the set
     * @param id the id
     * @return true, if successful
     */
    private boolean setContains(int[] set, int id) {
        int group = getGroupId(id);
        return ((set[group] & (1 << getIdInsideGroup(id))) != 0);
    }

    // Check if set1 and set2 not contain any common thread IDs
    /**
     * Sets the disjoint.
     *
     * @param set1 the set1
     * @param set2 the set2
     * @return true, if successful
     */
    private boolean setDisjoint(int[] set1, int[] set2) {
        return setDisjoint(set1, set2, set1.length - 1);
    }

    /**
     * Sets the disjoint.
     *
     * @param set1 the set1
     * @param set2 the set2
     * @param i the i
     * @return true, if successful
     */
    private boolean setDisjoint(int[] set1, int[] set2, int i) {
        if (i >= 0) {
            return (((set1[i] & set2[i]) == 0) && setDisjoint(set1, set2, --i));
        } else
            return true;
    }

    /**
     * Sets the is empty.
     *
     * @param set the set
     * @return true, if successful
     */
    private boolean setIsEmpty(int[] set) {
        return setIsEmpty(set, set.length - 1);
    }

    /**
     * Sets the is empty.
     *
     * @param set the set
     * @param i the i
     * @return true, if successful
     */
    private boolean setIsEmpty(int[] set, int i) {
        if (i >= 0) {
            return ((set[i] == 0) && setIsEmpty(set, --i));
        } else
            return true;
    }

}
