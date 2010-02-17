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
 * An implementation of a tuple with a state and one of its transitions.
 * 
 * @author tam
 * 
 */
public class StatePlusTransition {
    private Tuple<State, Integer> stateTuple;
    /**
     * @return the stateTuple
     */
    public Tuple<State, Integer> getStateTuple() {
        return stateTuple;
    }
    /**
     * @param tuple the stateTuple to set
     */
    public void setStateTuple(final Tuple<State, Integer> tuple) {
        this.stateTuple = tuple;
    }
    /**
     * @return the transition
     */
    public Transition getTransition() {
        return transition;
    }
    /**
     * @param trans the transition to set
     */
    public void setTransition(final Transition trans) {
        this.transition = trans;
    }
    private Transition transition;
}
