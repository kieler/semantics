/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.signals;

import java.util.LinkedList;

/**
 * The class Signal represents a synchronous pure signal and its history of present stati.
 * 
 * @author cmot
 */
public class Signal implements Cloneable {

    /** The name of the signal. */
    private String name;

    /** The present value list of a signal. */
    private LinkedList<Boolean> presentList = new LinkedList<Boolean>();

    /** The tick offset. */
    private long tickOffset = 0;
    
    private static final long DEFAULT_MAXIMAL_TICKS = 1000;
    
    /** The maximal number of ticks. */
    private long maximalTicks = DEFAULT_MAXIMAL_TICKS;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new signal.
     * 
     * @param name
     *            the name
     * @param maximalTicks
     *            the maximal ticks
     */
    public Signal(final String name, final long maximalTicks) {
        this.name = name;
        this.maximalTicks = maximalTicks;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    // -------------------------------------------------------------------------

    /**
     * Clear the history of present values.
     *
     * @param currentTick the current tick
     */
    public void clear(final long currentTick) {
        // ensure that all values are absent if not set yet
        setPresent(currentTick, false);
        this.tickOffset += presentList.size() - 1;
        presentList.clear();
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is tick defined.
     * 
     * @param tick
     *            the tick
     * @return true, if is tick defined
     */
    public boolean isTickDefined(final long tick) {
        if (tick < getTickOffset()) {
            return false;
        }
        if (presentList.size() + getTickOffset() <= tick) {
            return false;
        }
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the maximal yet defined tick for this signal.
     * 
     * @return the max tick
     */
    public long getMaxTick() {
        return presentList.size() - 1 + getTickOffset();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the minimal defined tick for this signal.
     * 
     * @return the min tick
     */
    public long getMinTick() {
        return getTickOffset() + 1;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether a signal is present at a given tick. If this tick was never set yet, the
     * default value will be absent.
     * 
     * @param tick
     *            the tick
     * @return true, if is present
     */
    public boolean isPresent(final long tick) {
        if (!isTickDefined(tick)) {
            return false;
        }
        return presentList.get((int) (tick - getTickOffset())).booleanValue();
    }

    // -------------------------------------------------------------------------

    /**
     * Adds the present status for a new (next) tick.
     * 
     * @param isPresent
     *            the is present
     */
    public void addPresent(final boolean isPresent) {
        while (this.presentList.size() >= this.maximalTicks) {
            this.presentList.remove(0);
            this.tickOffset++;
        }
        this.presentList.add(isPresent);
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the present status for a specific tick that may also be in the future. If this is the
     * case all values in between will be set to absent by default.
     * 
     * @param tick
     *            the tick
     * @param isPresent
     *            the is present
     */
    public void setPresent(final long tick, final boolean isPresent) {
        // if tick too early in already garbaged history then ignore it
        if (tick <= getTickOffset()) {
            return;
        }
        if (!isTickDefined(tick)) {
            // If a new value, add it to the end
            while (this.presentList.size() + getTickOffset() < tick) {
                addPresent(false);
            }
            addPresent(isPresent);
        } else {
            // If an older one, replace it
            this.presentList.remove((int) (tick - getTickOffset()));
            this.presentList.add((int) (tick - getTickOffset()), isPresent);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public Signal clone() {
        Signal returnSignal = new Signal(name, maximalTicks);
        for (Boolean present : this.presentList) {
            returnSignal.addPresent(present);
        }
        return returnSignal;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the tick offset.
     * 
     * @return the tick offset
     */
    public long getTickOffset() {
        return tickOffset;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the tick offset.
     * 
     * @param tickOffset
     *            the new tick offset
     */
    public void setTickOffset(final long tickOffset) {
        this.tickOffset = tickOffset;
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
    }

    // -------------------------------------------------------------------------

}
