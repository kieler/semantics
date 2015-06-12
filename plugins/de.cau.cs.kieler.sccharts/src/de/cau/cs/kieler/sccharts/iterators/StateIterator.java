/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.iterators;

import static com.google.common.collect.Iterators.concat;
import static com.google.common.collect.Iterators.transform;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.AbstractTreeIterator;

import com.google.common.base.Function;

import de.cau.cs.kieler.sccharts.ControlflowRegion;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.Scope;
import de.cau.cs.kieler.sccharts.State;

/**
 * @author ssm
 * @kieler.design 2014-09-05 proposed 
 * @kieler.rating 2014-09-05 proposed yellow
 */
public final class StateIterator {

    public static Function<Region, Iterator<State>> GET_STATES =
            new Function<Region, Iterator<State>>() {
        /**
         * {@inheritDoc}
         */
        public Iterator<State> apply(Region r) {
            if (r instanceof ControlflowRegion) {
                return ((ControlflowRegion)r).getStates().iterator();
            }
            List<State> empty = new ArrayList<State>();
            return empty.iterator();
        }
    };
    
    public static Iterator<State> sccAllStates(State s) {
        return new AbstractTreeIterator<State>((State)s, true) {

            private static final long serialVersionUID = -4364507280963568555L;

            @Override
            protected Iterator<? extends State> getChildren(Object object) {
                final Iterator<Region> regions = ((State) object).getRegions().iterator();
                return concat(transform(regions, GET_STATES));
            }

        };
    };
    
    public static Iterator<State> sccAllContainedStates(State s) {
        return new AbstractTreeIterator<State>((State)s, false) {

            private static final long serialVersionUID = -4364507280963568555L;

            @Override
            protected Iterator<? extends State> getChildren(Object object) {
                final Iterator<Region> regions = ((State) object).getRegions().iterator();
                return concat(transform(regions, GET_STATES));
            }

        };
    };
    
    public static Iterator<State> sccAllStates(ControlflowRegion r) {
        return concat(transform(r.getStates().iterator(),
                new Function<State, Iterator<State>>() {
        /**
         * {@inheritDoc}
         */
        public Iterator<State> apply(State arg0) {
            return sccAllStates(arg0);
        }
        }));
    };

    
    public static Iterator<State> sccAllStates(Scope s) {
        if (s instanceof State) {
           return sccAllStates((State) s);

        } else if (s instanceof ControlflowRegion) {
           return sccAllStates((ControlflowRegion) s);
        }
        else {
            throw new IllegalArgumentException("Scope type not supported.");
        }
    }
}
