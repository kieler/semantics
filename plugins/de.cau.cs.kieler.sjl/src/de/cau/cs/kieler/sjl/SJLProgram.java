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

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * SJLProgram.
 * 
 * @author cmot
 * 
 */
abstract public class SJLProgram<State extends Enum<?>> {
    
    // A flag indicating debug output should be printed
    static final boolean DEBUG = true; 
    
    // Active means NOT-paused for a tick
    private PriorityQueue<Thread> activeThreads;
    
    // Alive means NOT-aborted and NOT-termed 
    private PriorityQueue<Thread> aliveThreads;
    
    // The current thread that is executed
    Thread currentThread;

    // -------------------------------------------------------------------------

    public void debug(String action, Thread thread) {
        debug(action, thread, null);
    }
    
    public void debug(String action, Thread thread, State forkedOrResumedState) {
        if (DEBUG) {
            if (forkedOrResumedState == null) {
                System.out.println(action + " " + thread.state + " (" +aliveThreads.getPrio(thread) + ")" );
            }
            else {
                System.out.println(action + " " + thread.state + " (" +aliveThreads.getPrio(thread) + ")" + " ->" + forkedOrResumedState);
            }
        }
    }
    
    // -------------------------------------------------------------------------
    
    public SJLProgram(State startState, int startPrio, int maxPrio) {
        // Create new active and alive priority queues
        aliveThreads  = new PriorityQueue<Thread>(maxPrio);
        // Create the main thread
        Thread startThread = new Thread(startState, null);
        // Add the main thread as an alive thread
        aliveThreads.insert(startPrio, startThread);
        // Set the start thread as the current thread
        currentThread = startThread;
        // Note that the active threads will be cloned from the alive threads
        // in the doTick() method
    }

    // -------------------------------------------------------------------------
    
    public void setInput(String key, int value) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        Field field = getClass().getDeclaredField(key);
        field.setInt(this, value);
    }
    
    public void setInput(String key, boolean value) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        Field field = getClass().getDeclaredField(key);
        field.setBoolean(this, value);
    }

    public void setInput(String key, long value) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        Field field = getClass().getDeclaredField(key);
        field.setLong(this, value);
    }

    public void setInput(String key, double value) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        Field field = getClass().getDeclaredField(key);
        field.setDouble(this, value);
    }

    // -------------------------------------------------------------------------

    public Object getOutput(String key) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        Field field = getClass().getDeclaredField(key);
        return field.get(this);
    }
    
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

    // This method must be defined by implementing classes. It defines the
    // reaction of the SJLProgram.
    abstract protected void tick();

    // -------------------------------------------------------------------------

    public boolean isTickDone() {
        // Return whether there are no more active threads 
        if (activeThreads.size == 0) {
            if (DEBUG) {
                System.out.println("\n");
                for (Object object: aliveThreads.elements) {
                    if (object != null) {
                        Thread thread = (Thread) object;
                        debug("Children of", thread);
                        for (Thread child: thread.childs) {
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

    public boolean isTerminated() {
        // Return whether there are no more active threads 
        return (aliveThreads.size == 0);
    }

    // -------------------------------------------------------------------------

    public State state() {
        // Update the current thread
        currentThread = activeThreads.getFirst();
        // Find the new currentState
        debug("Updating state", currentThread);
        return currentThread.state;
    }

    // -------------------------------------------------------------------------

    public void fork(State forkedState, int prio) {
         debug("Forking", currentThread, forkedState);
         // Create a new thread
         Thread forkedThread = new Thread(forkedState, currentThread);
         // Add child-dependency to current one
         currentThread.childs.add(forkedThread);
         // Add new thread as an alive & active one
         aliveThreads.insert(prio, forkedThread);
         activeThreads.insert(prio, forkedThread);
    }

    // -------------------------------------------------------------------------

    public void termB() {
        debug("Terminating", currentThread);
        // Set the termed flag for the current thread
        currentThread.termed = true;
        // Remove the thread from the active and the alive ones
        activeThreads.remove(currentThread);
        aliveThreads.remove(currentThread);
        // Remove the thread from its parents childs list
        if (currentThread.parent != null) {
            currentThread.parent.childs.remove(currentThread);
        }
        // Note that at this point there may be descendant child threads
        // that are still active and alive!
    }

    // -------------------------------------------------------------------------
    
    public void haltB() {
        termB();
    }
    
    // -------------------------------------------------------------------------

    public void abort() {
        debug("Aborting children of", currentThread);
        // Abort all descendants (all children and children of children...)
        for (Thread childThread: currentThread.childs) {
            // Recursively abort children
            abort(childThread);
        }
        // Remove children
        currentThread.childs.clear();
    }

    // -------------------------------------------------------------------------

    public void gotoB(State resumeState) {
        debug("Goto of", currentThread, resumeState);
        // Update the state label
        currentThread.state = resumeState;
    }

    // -------------------------------------------------------------------------

    public void pauseB(State resumeState) {
        // Update the state label
        gotoB(resumeState);
        // Remove the thread from the active ones (it is paused now)
        activeThreads.remove(currentThread);
        debug("Pausing", currentThread);
    }

    // -------------------------------------------------------------------------
    
    public void prioB(int prio, State resumeState) {
        // Update the state label
        gotoB(resumeState);
        // Reorder elements
        activeThreads.update(prio, currentThread);
        aliveThreads.update(prio, currentThread);
    }

    // -------------------------------------------------------------------------

    public boolean join() {
        // Go thru all (direct) children and check whether they have termed
        for (Thread child : currentThread.childs) {
            if (!child.termed) {
                debug("Join failed of", currentThread);
                // If any child not termed yet, return false
                return false;
            }
        }
        debug("Join sucessfull of", currentThread);
        // Return true if all childs termed
        return true;
    }

    // -------------------------------------------------------------------------
    // -- CONVENIENT METHODS
    // -------------------------------------------------------------------------

    public void transB(State stateLabel) {
        abort();
        gotoB(stateLabel);
    }

    // -------------------------------------------------------------------------
    // -- INTERNAL METHODS
    // -------------------------------------------------------------------------

    private void abort(Thread thread) {
        debug("Aborting", thread);
        // Remove the thread from active and alive ones
        activeThreads.remove(thread);
        aliveThreads.remove(thread);
        // Abort all descendants (all children and children of children...)
        for (Thread childThread: thread.childs) {
            // Recursively abort children
            abort(childThread);
        }
        // Remove children
        thread.childs.clear();
    }
    
    // -------------------------------------------------------------------------

    private class Thread {
        public boolean termed;
        public State state;
        public ArrayList<Thread> childs = new ArrayList<Thread>();
        public Thread parent;
        
        public Thread(State state, Thread parent) {
            this.state = state; 
            this.parent = parent;
            this.termed = false;
        }
    }
    
    // -------------------------------------------------------------------------
    
}
