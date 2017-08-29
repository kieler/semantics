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
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import java.util.Iterator
import java.util.List
import org.eclipse.emf.common.util.AbstractTreeIterator

import static extension com.google.common.collect.Iterators.concat
import static extension com.google.common.collect.Iterators.transform

/** 
 * @author ssm
 * @kieler.design 2014-09-05 proposed 
 * @kieler.rating 2014-09-05 proposed yellow
 */
final class StateIterator {
    /**
     * Returns the states of the region r, if it is a ControlFlowRegion.
     * Otherwise the empty list is returned.
     * 
     * @param r The region
     * @return the list of states in r.
     */
    def static List<State> getStates(Region r) {
        if(r instanceof ControlflowRegion)
            return r.states
        else
            return #[]
    }
    
    /**
     * Returns the states that are defined in regions of s.
     * 
     * @param s The state
     * @return an iterator over the states that are defined in regions of s.
     */
    def static Iterator<State> getDirectChildren(State s) {
        val regions = s.getRegions().iterator()
        return regions.transform([region | region.getStates().iterator]).concat
    }
    
    /**
     * Returns all states that are defined inside of s plus the state s itself.
     * 
     * @param s The state
     * @return an iterator which iterates over s recursively followed by all states that are defined inside of s. 
     */
    def static Iterator<State> sccAllStates(State s) {
        getStateIterator(s, true)
    }

    /**
     * Returns all states that are defined inside of s but not the state s itself.
     * 
     * @param s The state
     * @return an iterator which iterates recursively over all states that are defined inside of s. 
     */
    def static Iterator<State> sccAllContainedStates(State s) {
        getStateIterator(s, false)
    }

    /**
     * Returns all states that are defined inside of s.
     * If includeRoot is true, s itself is also returned. Otherwise s is not returned.
     * 
     * @param s The state
     * @param includeRoot Determines if s should be included in the resulting iterator or not. 
     * @return an iterator which iterates recursively over all states that are defined inside of s.
     */
    def static Iterator<State> getStateIterator(State s, boolean includeRoot) {
        return new AbstractTreeIterator<State>(s, includeRoot) {
            override protected Iterator<? extends State> getChildren(Object object) {
                if(object instanceof State) {
                    return object.getDirectChildren()
                } else {
                    return null
                }
            }
        }
    }

    /**
     * Returns all states that are defined inside of r.
     * 
     * @param r The region
     * @return an iterator which iterates recursively over all states that are defined inside of r. 
     */
    def static Iterator<State> sccAllStates(ControlflowRegion r) {
        val states = r.getStates()
        val containedStates = states.map[state | sccAllStates(state)]
        containedStates.concat
    }

    /**
     * Returns all states that are defined inside of r.
     * 
     * @param r The region
     * @return an iterator which iterates recursively over all states that are defined inside of r. 
     */
    def static Iterator<State> sccAllContainedStates(ControlflowRegion r) {
        // Because r is not a state itself, "all states" and "all contained states" of r is the same
        return sccAllStates(r)
    }
    
    /**
     * Returns all states that are defined inside the scope.
     * 
     * @param s The scope
     * @return an iterator which iterates recursively over all states that are defined inside of the scope. 
     */
    def static Iterator<State> sccAllStates(Scope s) {
        if (s instanceof State) {
            return sccAllStates(s as State)
        } else if (s instanceof ControlflowRegion) {
            return sccAllStates(s as ControlflowRegion)
        } else {
            throw new IllegalArgumentException("Scope type not supported.")
        }
    }
    
    /**
     * Returns all states that are defined inside the scope.
     * 
     * @param s The scope
     * @return an iterator which iterates recursively over all states that are defined inside of the scope. 
     */
    def static Iterator<State> sccAllContainedStates(Scope s) {
        if (s instanceof State) {
            return sccAllContainedStates(s as State)
        } else if (s instanceof ControlflowRegion) {
            return sccAllContainedStates(s as ControlflowRegion)
        } else {
            throw new IllegalArgumentException("Scope type not supported.")
        }
    }
}
