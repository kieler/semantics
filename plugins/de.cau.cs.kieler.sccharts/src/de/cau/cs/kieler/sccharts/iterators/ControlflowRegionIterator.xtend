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
import java.util.List
import org.eclipse.emf.common.util.AbstractTreeIterator

import static extension com.google.common.collect.Iterators.concat
import static extension com.google.common.collect.Iterators.transform

/** 
 * @author ssm
 * @kieler.design 2014-09-05 proposed 
 * @kieler.rating 2014-09-05 proposed yellow
 */
final class ControlflowRegionIterator {
    /**
     * Returns the controlflows of the state s, if it is a state.
     * Otherwise the empty list is returned.
     * 
     * @param s The state
     * @return the iterable of controlflow regions in s.
     */
    def static Iterable<ControlflowRegion> getControlflowRegions(State s) {
        if(s instanceof State)
            return s.regions.filter(ControlflowRegion)
        else
            return #[]
    }
    
    /**
     * Returns the controlflow regions that are defined in r.
     * 
     * @param t The controlflow region
     * @return an iterator over the states that are defined in r.
     */
    def static Iterator<ControlflowRegion> getDirectChildren(ControlflowRegion r) {
        val states = r.getStates().iterator()
        return states.transform([state | state.getControlflowRegions().iterator]).concat
    }
    
    /**
     * Returns all controlflow regions that are defined inside of r plus the r itself.
     * 
     * @param r The controlflow region
     * @return an iterator which iterates over r recursively followed by all controlflow regions that are defined inside of r. 
     */
    def static Iterator<ControlflowRegion> sccAllControlflowRegions(ControlflowRegion r) {
        getControlflowRegionIterator(r, true)
    }

    /**
     * Returns all states that are defined inside of r but not the r itself.
     * 
     * @param r The controlflow region
     * @return an iterator which iterates recursively over all controlflow regions that are defined inside of r. 
     */
    def static Iterator<ControlflowRegion> sccAllContainedControlflowRegions(ControlflowRegion r) {
        getControlflowRegionIterator(r, false)
    }

    /**
     * Returns all controlflow regions that are defined inside of r.
     * If includeRoot is true, r itself is also returned. Otherwise r is not returned.
     * 
     * @param r The controlflow region
     * @param includeRoot Determines if r should be included in the resulting iterator or not. 
     * @return an iterator which iterates recursively over all controlflow regions that are defined inside of r.
     */
    def static Iterator<ControlflowRegion> getControlflowRegionIterator(ControlflowRegion r, boolean includeRoot) {
        return new AbstractTreeIterator<ControlflowRegion>(r, includeRoot) {
            override protected Iterator<? extends ControlflowRegion> getChildren(Object object) {
                if(object instanceof ControlflowRegion) {
                    return object.getDirectChildren()
                } else {
                    return null
                }
            }
        }
    }

    /**
     * Returns all controlflow regions that are defined inside of state s.
     * 
     * @param s The state
     * @return an iterator which iterates recursively over all controlflow regions that are defined inside of s. 
     */
    def static Iterator<ControlflowRegion> sccAllControlflowRegions(State s) {
        val controlflowRegions = s.getRegions().filter(ControlflowRegion)
        val containedControlflowRegions = controlflowRegions.map[cfr | sccAllControlflowRegions(cfr)]
        containedControlflowRegions.concat
    }

    /**
     * Returns all controlflow regions that are defined inside of state s.
     * 
     * @param s The state
     * @return an iterator which iterates recursively over all controlflow regions that are defined inside of s. 
     */
    def static Iterator<ControlflowRegion> sccAllContainedControlflowRegions(State s) {
        // Because r is not a state itself, "all states" and "all contained states" of r is the same
        return sccAllControlflowRegions(s)
    }
    
    /**
     * Returns all controlflow regions that are defined inside the scope s.
     * 
     * @param s The scope
     * @return an iterator which iterates recursively over all controlflow regions that are defined inside of the scope. 
     */
    def static Iterator<ControlflowRegion> sccAllControlflowRegions(Scope s) {
        if (s instanceof State) {
            return sccAllControlflowRegions((s as State))
        } else if (s instanceof ControlflowRegion) {
            return sccAllControlflowRegions((s as ControlflowRegion))
        } else {
            throw new IllegalArgumentException("Scope type not supported.")
        }
    }
    
    /**
     * Returns all controlflow regions that are defined inside the scope.
     * 
     * @param s The scope
     * @return an iterator which iterates recursively over all controlflow regions that are defined inside of the scope. 
     */
    def static Iterator<ControlflowRegion> sccAllContainedControlflowRegions(Scope s) {
        if (s instanceof State) {
            return sccAllContainedControlflowRegions((s as State))
        } else if (s instanceof ControlflowRegion) {
            return sccAllContainedControlflowRegions((s as ControlflowRegion))
        } else {
            throw new IllegalArgumentException("Scope type not supported.")
        }
    }
}
