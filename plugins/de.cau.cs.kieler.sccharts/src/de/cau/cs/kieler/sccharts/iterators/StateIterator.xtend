/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.iterators

import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import java.util.Iterator
import org.eclipse.emf.common.util.AbstractTreeIterator

import static com.google.common.collect.Iterators.concat
import static com.google.common.collect.Iterators.transform

/** 
 * @author ssm
 * @kieler.design 2014-09-05 proposed 
 * @kieler.rating 2014-09-05 proposed yellow
 */
final class StateIterator {
    def static Iterator<State> sccAllStates(State s) {
        return new AbstractTreeIterator<State>(s, true) {
            override protected Iterator<? extends State> getChildren(Object object) {
                val regions = ((object as State)).getRegions().iterator()
                return concat(transform(regions, [sccAllStates(it)]))
            }
        }
    }

    def static Iterator<State> sccAllContainedStates(State s) {
        return new AbstractTreeIterator<State>(s, false) {
            override protected Iterator<? extends State> getChildren(Object object) {
                val states = sccAllStates(s)
                return concat(transform(states, [State subState | sccAllContainedStates(subState)]))
            }
        }
    }

    def static Iterator<State> sccAllStates(ControlflowRegion r) {
        return r.getStates().iterator()
    }

    def static Iterator<State> sccAllContainedStates(ControlflowRegion r) {
//        val states = sccAllStates(r)
//        return concat(transform(states, [sccAllContainedStates(it)]))
    }
    
    def static Iterator<State> sccAllStates(Scope s) {
//        if (s instanceof State) {
//            return sccAllStates((s as State))
//        } else if (s instanceof ControlflowRegion) {
//            return sccAllStates((s as ControlflowRegion))
//        } else {
//            throw new IllegalArgumentException("Scope type not supported.")
//        }
    }

    def static Iterator<State> sccAllContainedStates(Scope s) {
//        if (s instanceof State) {
//            return sccAllContainedStates((s as State))
//        } else if (s instanceof ControlflowRegion) {
//            return sccAllContainedStates((s as ControlflowRegion))
//        } else {
//            throw new IllegalArgumentException("Scope type not supported.")
//        }
    }
}
