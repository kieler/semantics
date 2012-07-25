/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.signals;

import java.util.Collection;
import java.util.LinkedList;

/**
 * The Class SignalList implements a list of synchronous pure signals.
 * 
 * @author cmot
 * @kieler.rating 2012-07-25 yellow KI-21
 */
public class SignalList extends LinkedList<Signal> {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 792116725600950135L;

    /** The most current tick. */
    private long currentTick = -1;

    private static final long DEFAULT_MAXIMAL_TICKS = 1000;

    /** The maximal number of ticks. */
    private long maximalTicks = DEFAULT_MAXIMAL_TICKS;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new signal list.
     */
    public SignalList() {
        super();
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new signal list.
     * 
     * @param maximalTicks
     *            the maximal ticks
     */
    public SignalList(final long maximalTicks) {
        super();
        this.maximalTicks = maximalTicks;
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new signal list.
     * 
     * @param signalList
     *            the signal list to initialize this SignalList with.
     * @param maximalTicks
     *            the maximal ticks
     */
    public SignalList(final Collection<Signal> signalList, final long maximalTicks) {
        this.maximalTicks = maximalTicks;
        for (Signal signal : signalList) {
            signal.setMaximalTicks(maximalTicks);
            this.add(signal);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Contains signal.
     * 
     * @param name
     *            the signal name
     * @return true, if contained
     */
    public boolean containsSignal(final String name) {
        return (getSignal(name) != null);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets a signal by name.
     * 
     * @param name
     *            the signal name
     * @return the signal
     */
    public Signal getSignal(final String name) {
        // FIXME: Possible improvement, if containsSignal and getSignal are used very often you
        // would need a Map rather than a List. A map could also speed-up the look-up.
        for (Signal returnSignal : this) {
            if (returnSignal.getName().equals(name)) {
                return returnSignal;
            }
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public SignalList clone() {
        super.clone();
        SignalList clonedSignalList = new SignalList(maximalTicks);
        for (Signal signal : this) {
            Signal clonedSignal = signal.clone();
            clonedSignalList.add(clonedSignal);
        }
        return clonedSignalList;
    }

    // -------------------------------------------------------------------------

    /**
     * Removes the signal by name.
     * 
     * @param name
     *            the signal name
     */
    public void removeSignal(final String name) {
        Signal signal = this.getSignal(name);
        if (signal != null) {
            this.remove(signal);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Append cloned signal list.
     * 
     * @param appendSignalList
     *            the append signal list
     */
    public void appendClonedSignalList(final SignalList appendSignalList) {
        appendSignalList(appendSignalList.clone());
    }

    // -------------------------------------------------------------------------

    /**
     * Append signal list.
     * 
     * @param appendSignalList
     *            the append signal list
     */
    public void appendSignalList(final LinkedList<Signal> appendSignalList) {
        for (Signal signal : appendSignalList) {
            // if the signal is already in this list, remove it
            removeSignal(signal.getName());
            // add the new signal
            signal.setMaximalTicks(maximalTicks);
            this.add(signal);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the maximal yet defined tick for this signal list.
     * 
     * @return the maximal yet defined tick
     */
    public long getMaxTick() {
        long maxTick = 0;
        for (Signal signal : this) {
            maxTick = Math.max(maxTick, signal.getMaxTick());
        }
        return maxTick;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the minimal defined tick for this signal list. Ticks may have been lost between a
     * possible set number of maximal saved ticks.
     * 
     * @return the minimal defined tick
     */
    public long getMinTick() {
        long minTick = Long.MAX_VALUE;
        for (Signal signal : this) {
            minTick = Math.min(minTick, signal.getMinTick());
        }
        return minTick;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the current tick.
     * 
     * @return the current tick
     */
    public long getCurrentTick() {
        return currentTick;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the current tick.
     * 
     * @param currentTick
     *            the new current tick
     */
    public void setCurrentTick(final long currentTick) {
        this.currentTick = currentTick;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the maximal ticks.
     * 
     * @return the maximal ticks
     */
    public long getMaximalTicks() {
        return maximalTicks;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the maximal ticks.
     * 
     * @param maximalTicks
     *            the new maximal ticks
     */
    public void setMaximalTicks(final long maximalTicks) {
        this.maximalTicks = maximalTicks;
        for (Signal signal : this) {
            signal.setMaximalTicks(maximalTicks);
        }
    }

    // -------------------------------------------------------------------------

}
