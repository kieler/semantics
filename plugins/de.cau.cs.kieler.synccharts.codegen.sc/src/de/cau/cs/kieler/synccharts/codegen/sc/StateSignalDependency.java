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
 *
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.codegen.sc;

import java.util.ArrayList;

import de.cau.cs.kieler.synccharts.Signal;
import de.cau.cs.kieler.synccharts.State;

/**
 * An implementation of a "triple" with a state, its trigger signals and effect signals.
 * 
 * @author tam
 * 
 */
public class StateSignalDependency {
    private State state;
    private ArrayList<Signal> triggerSignals;
    private ArrayList<Signal> effectSignals;

    /**
     * @return the state
     */
    public State getState() {
        return state;
    }

    /**
     * @param newState
     *            the state to set
     */
    public void setState(final State newState) {
        this.state = newState;
    }

    /**
     * @return the triggerSignals
     */
    public ArrayList<Signal> getTriggerSignals() {
        return triggerSignals;
    }

    /**
     * @param newTriggerSignals
     *            the triggerSignals to set
     */
    public void setTriggerSignals(final ArrayList<Signal> newTriggerSignals) {
        this.triggerSignals = newTriggerSignals;
    }

    /**
     * @return the effectSignals
     */
    public ArrayList<Signal> getEffectSignals() {
        return effectSignals;
    }

    /**
     * @param newEffectSignals
     *            the effectSignals to set
     */
    public void setEffectSignals(final ArrayList<Signal> newEffectSignals) {
        this.effectSignals = newEffectSignals;
    }


}
