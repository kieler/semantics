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

/**
 * The SJLProgramWithSignals class is meant to be implemented for a better simulation interface that
 * eases the access to signals.
 * 
 * @author cmot
 * @kieler.design 2013-05-23 proposed cmot
 * @kieler.rating 2013-05-23 proposed
 * 
 */
public abstract class SJLProgramWithSignals<State extends Enum<?>> extends SJLProgram<State> {

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new SJLProgramWithSignals.
     *
     * @param startState the start state
     * @param startPrio the start prio
     * @param maxPrio the max prio
     */
    public SJLProgramWithSignals(State startState, int startPrio, int maxPrio) {
        super(startState, startPrio, maxPrio);
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean doTick() {
        // Reset output signals before computing the reaction
        resetOutputSignals();
        // Delegate to doTick() of SJLProgram
        return super.doTick();
    }
    
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    abstract protected void tick();
    
    // -------------------------------------------------------------------------

    // This method resets both the input and the output signals.
    final public void resetSignals() {
        resetInputSignals();
        resetOutputSignals();
    }

    // -------------------------------------------------------------------------

    // This method should be implemented (overwritten) and should reset all
    // output signals only. It is called before the computation of the reaction
    // starts in the doTick() method.
    abstract public void resetOutputSignals();

    // -------------------------------------------------------------------------

    // This method should be implemented (overwritten) and should reset all
    // output signals only.
    abstract public void resetInputSignals();

    // -------------------------------------------------------------------------

    public void setInput(String key, int value) throws NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException {
        Field field = getClass().getDeclaredField(key);
        field.setInt(this, value);
    }

    public void setInput(String key, boolean value) throws NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException {
        Field field = getClass().getDeclaredField(key);
        field.setBoolean(this, value);
    }

    public void setInput(String key, long value) throws NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException {
        Field field = getClass().getDeclaredField(key);
        field.setLong(this, value);
    }

    public void setInput(String key, double value) throws NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException {
        Field field = getClass().getDeclaredField(key);
        field.setDouble(this, value);
    }

    // -------------------------------------------------------------------------

    public Object getOutput(String key) throws NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException {
        Field field = getClass().getDeclaredField(key);
        return field.get(this);
    }

    // -------------------------------------------------------------------------
}
