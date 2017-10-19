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
import de.cau.cs.kieler.sccharts.DataflowRegion

/** 
 * @author ssm
 * @kieler.design 2017-10-19 proposed 
 * @kieler.rating 2017-10-19 proposed yellow
 */
final class DataflowRegionIterator {
    /**
     * Returns the dataflows of the state s, if it is a state.
     * Otherwise the empty list is returned.
     * 
     * @param s The state
     * @return the iterable of controlflow regions in s.
     */
    def static Iterable<DataflowRegion> getDataflowRegions(State s) {
        if (s instanceof State)
            return s.regions.filter(DataflowRegion)
        else
            return #[]
    }
    
    /**
     * Returns the dataflow regions that are defined in r.
     * 
     * @param t The dataflow region
     * @return an iterator over the states that are defined in r.
     */
    def static Iterator<DataflowRegion> getDirectChildren(DataflowRegion r) {
        return #[].iterator
    }
    
    /**
     * Returns all dataflow regions that are defined inside of r plus the r itself.
     * dataflow
     * @param r The controlflow region
     * @return an iterator which iterates over r recursively followed by all controlflow regions that are defined inside of r. 
     */
    def static Iterator<DataflowRegion> sccAllDataflowRegions(DataflowRegion r) {
        getDataflowRegionIterator(r, true)
    }

    /**
     * Returns all states that are defined inside of r but not the r itself.
     * 
     * @param r The dataflow region
     * @return an iterator which iterates recursively over all dataflow regions that are defined inside of r. 
     */
    def static Iterator<DataflowRegion> sccAllContainedDataflowRegions(DataflowRegion r) {
        getDataflowRegionIterator(r, false)
    }

    /**
     * Returns all dataflow regions that are defined inside of r.
     * If includeRoot is true, r itself is also returned. Otherwise r is not returned.
     * 
     * @param r The dataflow region
     * @param includeRoot Determines if r should be included in the resulting iterator or not. 
     * @return an iterator which iterates recursively over all dataflow regions that are defined inside of r.
     */
    def static Iterator<DataflowRegion> getDataflowRegionIterator(DataflowRegion r, boolean includeRoot) {
        return new AbstractTreeIterator<DataflowRegion>(r, includeRoot) {
            override protected Iterator<? extends DataflowRegion> getChildren(Object object) {
                if(object instanceof DataflowRegion) {
                    return object.getDirectChildren()
                } else {
                    return null
                }
            }
        }
    }

    /**
     * Returns all dataflow regions that are defined inside of state s.
     * 
     * @param s The state
     * @return an iterator which iterates recursively over all dataflow regions that are defined inside of s. 
     */
    def static Iterator<DataflowRegion> sccAllDataflowRegions(State s) {
        val dataflowRegions = s.getRegions().filter(DataflowRegion)
        val containedDataflowRegions = dataflowRegions.map[cfr | sccAllDataflowRegions(cfr)]
        containedDataflowRegions.concat
    }

    /**
     * Returns all dataflow regions that are defined inside of state s.
     * 
     * @param s The state
     * @return an iterator which iterates recursively over all dataflow regions that are defined inside of s. 
     */
    def static Iterator<DataflowRegion> sccAllContainedDataflowRegions(State s) {
        // Because r is not a state itself, "all states" and "all contained states" of r is the same
        return sccAllDataflowRegions(s)
    }
    
    /**
     * Returns all dataflow regions that are defined inside the scope s.
     * 
     * @param s The scope
     * @return an iterator which iterates recursively over all dataflow regions that are defined inside of the scope. 
     */
    def static Iterator<DataflowRegion> sccAllDataflowRegions(Scope s) {
        if (s instanceof State) {
            return sccAllDataflowRegions((s as State))
        } else if (s instanceof ControlflowRegion) {
            return sccAllDataflowRegions((s as DataflowRegion))
        } else {
            throw new IllegalArgumentException("Scope type not supported.")
        }
    }
    
    /**
     * Returns all dataflow regions that are defined inside the scope.
     * 
     * @param s The scope
     * @return an iterator which iterates recursively over all dataflow regions that are defined inside of the scope. 
     */
    def static Iterator<DataflowRegion> sccAllContainedDataflowRegions(Scope s) {
        if (s instanceof State) {
            return sccAllContainedDataflowRegions((s as State))
        } else if (s instanceof DataflowRegion) {
            return sccAllContainedDataflowRegions((s as DataflowRegion))
        } else {
            throw new IllegalArgumentException("Scope type not supported.")
        }
    }
}
