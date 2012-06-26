/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
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

import de.cau.cs.kieler.sj.exceptions.PriorityException;
import de.cau.cs.kieler.sj.util.AbstractCollection;
import de.cau.cs.kieler.sj.util.LinkedList;

/**
 * Package private class to describe a thread of a SJ-program.
 * 
 * 
 * @author mhei
 * 
 * @param <StateLabel>
 *            The enum type the labels in the switch case statement are from.
 */
class SJThread<StateLabel extends Enum<?>> implements Comparable<SJThread<StateLabel>> {

    /**
     * The priority of the thread. Threads with higher priority will execute first.
     */
    private int prio;

    /**
     * The label in the switch-case statement this thread belongs to.
     */
    private StateLabel label;

    /**
     * The descendants of the thread. If a abort is used during the execution of a thread all his
     * descendants will be killed.
     */
    private AbstractCollection<SJThread<StateLabel>> descendants;

    /**
     * For some statements, for example await, it is important to do an initial await if this
     * statement is reached the first time. This flag tells if a initial wait is already done.
     */
    private boolean initialPauseDone;

    /**
     * Creates a new thread with a given priority and label.
     * 
     * @param belongingLabel
     *            the label in the SJ program switch-case statement this thread belongs to.
     * @param priority
     *            the priority of this thread
     * @throws PriorityException
     *             Thrown if a priority is zero or less.
     */
    public SJThread(final StateLabel belongingLabel, final int priority) {
        // this(label, prio, new LinkedList<SJThread<StateLabel>>());
        if (priority <= 0) {
            throw new PriorityException("You are not alloewd to use a priority <= 0 !");
        }
        this.prio = priority;
        this.label = belongingLabel;
        this.descendants = new LinkedList<SJThread<StateLabel>>();
        initialPauseDone = false;
    }

    /**
     * Compares one SJThread with another. This test depends on the priority. The thread with the
     * highest priority is in this order the smallest. We need this to bring the thread in a natural
     * order.
     * 
     * @return a integer value that that tells you if a thread is less, equal to or greater than the
     *         given.
     */
    public int compareTo(final SJThread<StateLabel> thread) {

        if (this.getPriority() == thread.getPriority()) {
            return 0;
        } else {

            // If the priority of this thread is higher he has to be the first
            // in the priority queue. This is why he compared as the smaller
            // one. If the given thread has the higher priority it is the other
            // way around.
            return -1 * (new Integer(prio)).compareTo(thread.getPriority());
            // Alternative version
            // return (this.getPriority() > thread.getPriority()) ? -1 : 1;
        }
    }

    /**
     * Does a initial pause. Necessary for commands like <code>await</code>.
     * 
     * @see #setInitialPauseDone(boolean)
     * @see #isInitialPauseDone()
     */
    public void doInitialPause() {
        initialPauseDone = true;
    }

    /**
     * Sets a boolean value that tells if a initial has been done.
     * 
     * @param initialPause
     *            <code>true</code> if a initial tick has been done otherwise <code>false</code>.
     * 
     * @see #doInitialPause()
     * @see #isInitialPauseDone()
     */
    public void setInitialPauseDone(final boolean initialPause) {
        this.initialPauseDone = initialPause;
    }

    /**
     * Returns if a initial pause has been done.
     * 
     * @return <code>true</code> if a initial pause has been done otherwise <code>false</code>.
     */
    public boolean isInitialPauseDone() {
        return initialPauseDone;
    }

    /**
     * Sets the priority.
     * 
     * @param priority
     *            the priority
     * @throws IllegalPriorityException
     *             thrown if the priority is zero or less.
     * @see #getPriority()
     */
    public void setPriority(final int priority) {
        if (priority <= 0) {
            throw new PriorityException("You are not alloewd to use a priority <= 0 !");
        }
        this.prio = priority;
    }

    /**
     * Returns the priority.
     * 
     * @return the priority
     * @see #setPriority(int)
     */
    public int getPriority() {
        return this.prio;
    }

    public void setLabel(final StateLabel belongingLabel) {
        this.label = belongingLabel;
    }

    public StateLabel getLabel() {
        return label;
    }

    public void addDescendant(final SJThread<StateLabel> descendant) {
        this.descendants.add(descendant);
    }

    public AbstractCollection<SJThread<StateLabel>> getDescendants() {
        return this.descendants;
    }

    public void deleteAllDescendants() {
        this.descendants.clear();
    }

    /**
     * A detailed string representation of the SJThread and all it's arguments.
     */
    @Override
    public String toString() {
        String s;
        s = label.name() + " " + prio + "\nDescendants: ";
        for (SJThread<StateLabel> t : descendants) {
            s += t.getLabel().name() + " ";
        }
        s += "\n";
        return s;
    }
}
