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

import de.cau.cs.kieler.core.kexpressions.Signal;

/**
 * An implementation of a "triple" with a state, its trigger signals and effect signals.
 * 
 * @kieler.rating 2010-06-14 yellow
 * @author tam
 */
public class StateAndSignals {
    private StatePlusTransition statePlusTransition;
    private ArrayList<Signal> triggerSignals;
    private ArrayList<Signal> effectSignals;

    /**
     * @return the state
     */
    public StatePlusTransition getStatePlusTransition() {
        return statePlusTransition;
    }

    /**
     * @param newState
     *            the state to set
     */
    public void setState(final StatePlusTransition newState) {
        this.statePlusTransition = newState;
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

    /**
     * {@inheritDoc}
     */
    // CHECKSTYLEOFF Equals and HashCode
    // I don't need hash code for this
    public boolean equals(final Object other) {
        if (other instanceof StateAndSignals) {
            StateAndSignals stateSig = (StateAndSignals) other;
            boolean boolObject1 = stateSig.statePlusTransition.equals(statePlusTransition);
            boolean boolObject2 = stateSig.triggerSignals.equals(triggerSignals);
            boolean boolObject3 = stateSig.effectSignals.equals(effectSignals);
            return (boolObject1 && boolObject2 && boolObject3);
        } else {
            return false;
        }
    }
    // CHECKSTYLEON Equals and HashCode

}
