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

import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;

/**
 * An implementation of a "triple" with a state, its type and one of its transitions.
 * 
 * @author tam
 * 
 */
public class StatePlusTransition {
    private State lokalState;
    private int lokalType;
    private Transition lokalTransition;

    /**
     * Constructor, setting the fields.
     * 
     * @param state the state
     * @param type the type
     * @param transition the transition
     */
    public StatePlusTransition(final State state, final int type, final Transition transition) {
        super();
        lokalState = state;
        lokalType = type;
        lokalTransition = transition;
    }
    
    /**
     * Contructor without setting fields.
     */
    public StatePlusTransition() {
        super();
    }

    /**
     * @return the type
     */
    public int getType() {
        return lokalType;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(final int type) {
        lokalType = type;
    }

    /**
     * @return the state
     */
    public State getState() {
        return lokalState;
    }

    /**
     * @param state
     *            the stateTuple to set
     */
    public void setState(final State state) {
        lokalState = state;
    }

    /**
     * @return the transition
     */
    public Transition getTransition() {
        return lokalTransition;
    }

    /**
     * @param transition
     *            the transition to set
     */
    public void setTransition(final Transition transition) {
        lokalTransition = transition;
    }
    
    @Override
    public boolean equals(final Object other) {
        if (other instanceof StatePlusTransition) {
            StatePlusTransition statePlusTransition = (StatePlusTransition) other;
            boolean boolObject1 = statePlusTransition.lokalState.equals(lokalState);
            boolean boolObject2 = statePlusTransition.lokalType == lokalType;
            boolean boolObject3 = false;
            if (statePlusTransition.lokalTransition != null) {
                boolObject3 = statePlusTransition.lokalTransition.equals(lokalTransition);
            } else {
                boolObject3 = (lokalTransition == null);
            }
            return (boolObject1 && boolObject2 && boolObject3);
        } else {
            return false;
        }
    }
}
