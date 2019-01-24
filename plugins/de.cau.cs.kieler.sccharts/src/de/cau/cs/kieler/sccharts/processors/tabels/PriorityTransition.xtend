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

import de.cau.cs.kieler.core.model.Pair
import de.cau.cs.kieler.sccharts.Transition

/**
 * @author stu114663
 *
 */
class PriorityTransition extends Pair<Integer, Transition> implements Comparable<PriorityTransition> {
    new(Integer prio, Transition t) {
        super(prio, t)
    }
    
    new(Transition t, Integer prio) {
        super(prio, t)
    }
    
    def Integer getPriority() {
        return this.first
    }
    
    def void setPriority(Integer prio) {
        this.first = prio
    }
    
    def Transition getTransition() {
        return this.second
    }
    
    def void setTransition(Transition trans) {
        this.second = trans
    }
    
    override int compareTo(PriorityTransition pt) {
        val int tmp = this.priority.compareTo(pt.priority)
        return tmp
    }
}