/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.krep.evalbench.comm;

import java.util.HashMap;

import org.eclipse.jface.preference.IPreferenceStore;

import de.cau.cs.kieler.krep.evalbench.Activator;
import de.cau.cs.kieler.krep.evalbench.ui.VerifyPreferencePage;

/**
 * Pure or valued signal for the synchronous signal model.
 * 
 * @author msp, ctr
 */
public class Signal implements Comparable<Signal> {

    /** Signal name. */
    private String name;

    /** Is this a valued signal? */
    private boolean valued;

    /** Signal index for identification. */
    private int index;

    /** Value of a valued signal. */
    private Object value;

    /** signal status. */
    private boolean status;

    /**
     * Creates and initializes a signal. Depending of the input this will be
     * either a valued or an unvalued signal.
     * 
     * @param name
     *            signal name
     * @param status
     *            initial status of the signal
     * @param value
     *            value of the signal, null for pure signal
     * @param index
     *            signal index
     */
    public Signal(final String name, final boolean status, final Integer value,
            final HashMap<String, Integer> index) {
        IPreferenceStore preferenceStore = Activator.getDefault()
                .getPreferenceStore();
        if (preferenceStore.getBoolean(VerifyPreferencePage.CASE_SENSITIVE)) {
            this.name = name;
        } else {
            this.name = name.toUpperCase();
        }

        this.valued = value != null;
        this.value = value;
        Integer i = index.get(this.name);
        if (i == null) {
            System.err.println("Unknown signal " + this.name);
            this.index = 0;
        } else {
            this.index = i;
        }
        this.status = status;
    }

    /**
     * generate Signal with explicit index.
     * 
     * @param name
     *            name of the signal
     * @param status
     *            initial status
     * @param value
     *            value if valued, null for pure signal
     * @param index
     *            index in the current program
     */
    public Signal(final String name, final boolean status, final Integer value,
            final Integer index) {
        IPreferenceStore preferenceStore = Activator.getDefault()
                .getPreferenceStore();
        if (preferenceStore.getBoolean(VerifyPreferencePage.CASE_SENSITIVE)) {
            this.name = name;
        } else {
            this.name = name.toUpperCase();
        }

        this.valued = value != null;
        this.value = value;
        Integer i = index;
        if (i == null) {
            System.err.println("Unknown signal " + this.name);
            this.index = 0;
        } else {
            this.index = i;
        }
        this.status = status;
    }

    /**
     * generate a new signal by copying.
     * 
     * @param s
     *            signal to copy
     */
    public Signal(final Signal s) {
        this.name = s.name;
        this.valued = s.valued;
        this.value = s.value;
        this.index = s.index;
        status = s.status;
    }

    /**
     * generate new signal. Signals are initially absent
     * 
     * @param name
     *            name of the signal
     * @param value
     *            initial value for a valued signal, null for a pure signal
     */
    public Signal(final String name, final Integer value) {
        IPreferenceStore preferenceStore = Activator.getDefault()
                .getPreferenceStore();
        if (preferenceStore.getBoolean(VerifyPreferencePage.CASE_SENSITIVE)) {

            this.name = name;
        } else {
            this.name = name.toUpperCase();
        }
        this.valued = value != null;
        this.value = value;
        this.index = 0;
        status = false;
    }

    /**
     * Check whether this is a valued signal.
     * 
     * @return true if the signal is valued
     */
    public boolean isValued() {
        return valued;
    }

    /**
     * Get the signal index.
     * 
     * @return signal index
     */
    public int getIndex() {
        return index;
    }

    /**
     * Set the signal index.
     * 
     * @param index
     *            signal index
     * 
     */
    public void setIndex(final int index) {
        this.index = index;
    }

    /**
     * Get the current signal status.
     * 
     * @return true if the signal is present
     */
    public boolean getPresent() {
        return status;
    }

    /**
     * Set the current signal status.
     * 
     * @param b
     *            new status
     */
    public void setPresent(final boolean b) {
        this.status = b;
    }

    /**
     * Get the signal value.
     * 
     * @return current signal value, or null if its value has not been
     *         initialized yet.
     */
    public Object getValue() {
        return value;
    }

    /**
     * Set the signal value.
     * 
     * @param x
     *            new value
     */
    public void setValue(final Object x) {
        this.value = x;
    }

    /**
     * Get the signal name.
     * 
     * @return signal name
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String res = name;
        if (valued) {
            res += "(" + value + ")";
        }
        return res;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(final Object o) {
        if (o instanceof Signal) {
            return name.equals(((Signal) o).name);
        } else {
            return false;
        }
    }

    public int compareTo(final Signal o) {
        return name.compareTo(o.name);
    }

}
