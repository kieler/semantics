/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.signals;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * The class Signal represents a synchronous pure signal and its history of present stati.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-07-25 yellow KI-21
 */
public class Signal implements Cloneable {

    /** The name of the signal. */
    private String name;
    
    /** The present and status value of the signal. */
    private HashMap<Long, SignalValue> signalValueHashmap = new HashMap<Long, SignalValue>();

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
     */
    public Signal(final String name) {
        this.name = name;
    }
    
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
        setPresent(currentTick, false, null);
        this.tickOffset += signalValueHashmap.size() - 1;
        signalValueHashmap.clear();
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
        return (signalValueHashmap.get(tick) != null);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the maximal yet defined tick for this signal.
     * 
     * @return the max tick
     */
    public long getMaxTick() {
        return signalValueHashmap.size() - 1 + tickOffset;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the minimal defined tick for this signal.
     * 
     * @return the min tick
     */
    public long getMinTick() {
        return tickOffset + 1;
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
        SignalValue signalValue = signalValueHashmap.get(tick);
        if (signalValue != null) {
            return signalValue.isPresent();
        } else {
            return false;
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the value of a signal at a given tick. If this tick was never set yet, the
     * default value is null.
     * 
     * @param tick
     *            the tick
     * @return the value as an Object or null, if not defined fo the given tick
     */
    public Object getValue(final long tick) {
        if (!isTickDefined(tick)) {
            return null;
        }
        return signalValueHashmap.get(tick).getValue();
    }
    
    // -------------------------------------------------------------------------

    /**
     * Adds the present status for a new (next) tick.
     *
     * @param isPresent the is present
     * @param value the value of the signal
     * @param tick the tick
     */
    public void addPresent(final boolean isPresent, final Object value, final long tick) {
        while (this.signalValueHashmap.size() >= this.maximalTicks) {
            this.signalValueHashmap.remove(tickOffset);
            this.tickOffset++;
        }
        this.signalValueHashmap.put(tick, new SignalValue(isPresent, value));
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the present status for a specific tick that may also be in the future. If this is the
     * case all values in between will be set to absent by default.
     *
     * @param tick the tick
     * @param isPresent the is present
     * @param value the value of the signal
     */
    public void setPresent(final long tick, final boolean isPresent, final Object value) {
        // if tick too early in already garbaged history then ignore it
        if (tick < tickOffset) {
            return;
        }
        if (!isTickDefined(tick)) {
            // If a new value, add it to the end
            while (this.signalValueHashmap.size() + getTickOffset() < tick) {
                addPresent(false, value, tick);
            }
            addPresent(isPresent, value, tick);
        } else {
            // If an older one, replace it
            SignalValue signalValue = this.signalValueHashmap.get(tick);
            signalValue.setPresent(isPresent);
            signalValue.setValue(value);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public Signal clone() {
        Signal returnSignal = new Signal(name, maximalTicks);
        for (Entry<Long, SignalValue> signalValueEntry : signalValueHashmap.entrySet()) {
            long tick = signalValueEntry.getKey();
            boolean isPresent = signalValueEntry.getValue().isPresent();
            Object value = signalValueEntry.getValue().getValue();
            returnSignal.addPresent(isPresent, value, tick);
        }
        returnSignal.tickOffset = tickOffset;
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
        // possibly shorten list
        while (this.signalValueHashmap.size() > maximalTicks) {
            this.signalValueHashmap.remove(tickOffset);
            this.tickOffset++;
        }
        this.maximalTicks = maximalTicks;
    }

    // -------------------------------------------------------------------------
}
