/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors.tabels

import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import java.util.ArrayList
import java.util.List

/**
 * @author stu114663
 * 
 */
class StateTransitionPriorityWrapper {
    State state
    /** A list of PriorityTransition pairs that is kept sorted from highest to lowest priority at all times */
    List<PriorityTransition> pTransitions = new ArrayList<PriorityTransition>
    List<Transition> nTransitions = new ArrayList<Transition>

    new(State sourceState) {
        this.state = sourceState
    }

    /** Adds the Transition into the list while keeping the list sorted (high to low). 
     * Throws IllegalArgumentException if a transition with the same priority as the new transition already exists.
     */
    def void add(PriorityTransition pTransition) throws IllegalArgumentException {
        pTransitions.add(pTransition)
        pTransitions = pTransitions.sort()
        addTransitionsToState
    }

    def void add(Transition t) {
        nTransitions.add(t)
        addTransitionsToState
    }

    def void add(Transition t, Integer prio) {
        this.add(new PriorityTransition(prio, t))
    }

    private def Iterable<Transition> createMergedList() {
        val list = new ArrayList<Transition>
        list.addAll(pTransitions.fold(new ArrayList<Transition>, [ List<Transition> l, PriorityTransition pt |
            l.add(pt.transition)
            return l
        ]))
        list.addAll(nTransitions)
        return list
    }

    def void addTransitionsToState() {
        this.state.outgoingTransitions.removeIf([true])
        this.state.outgoingTransitions.addAll(createMergedList)
    }

    def State getState() {
        return this.state
    }
}
