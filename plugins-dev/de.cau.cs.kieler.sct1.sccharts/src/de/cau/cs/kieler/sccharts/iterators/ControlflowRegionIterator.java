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
package de.cau.cs.kieler.sccharts.iterators;

import static com.google.common.collect.Iterators.concat;
import static com.google.common.collect.Iterators.transform;

import java.util.Iterator;

import org.eclipse.emf.common.util.AbstractTreeIterator;

import com.google.common.base.Function;
import com.google.common.collect.Iterators;

import de.cau.cs.kieler.sccharts.ControlflowRegion;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.Scope;
import de.cau.cs.kieler.sccharts.State;

/**
 * @author ssm
 * @kieler.design 2014-09-05 proposed 
 * @kieler.rating 2014-09-05 proposed yellow
 */
public final class ControlflowRegionIterator {

    public static Function<State, Iterator<ControlflowRegion>> GET_CONTROLFLOWREGIONS =
            new Function<State, Iterator<ControlflowRegion>>() {
        /**
         * {@inheritDoc}
         */
        public Iterator<ControlflowRegion> apply(State s) {
//            return s.getConcurrencies().iterator();
            return Iterators.emptyIterator();
        }
    };
    
    public static Iterator<Region> sccAllControlflowRegions(ControlflowRegion r) {
        return new AbstractTreeIterator<Region>((Region) r, true) {

            private static final long serialVersionUID = -4364507280963568556L;

            @Override
            protected Iterator<? extends ControlflowRegion> getChildren(Object object) {
                final Iterator<State> states = ((ControlflowRegion) object).getStates().iterator();
                return concat(transform(states, GET_CONTROLFLOWREGIONS));
            }

        };
    };
    
    public static Iterator<Region> sccAllContainedControlflowRegions(Region r) {
        return new AbstractTreeIterator<Region>((Region) r, false) {

            private static final long serialVersionUID = -4364507280963568556L;

            @Override
            protected Iterator<? extends ControlflowRegion> getChildren(Object object) {
                final Iterator<State> states = ((ControlflowRegion) object).getStates().iterator();
                return concat(transform(states, GET_CONTROLFLOWREGIONS));
            }

        };
    };
    
//    public static Iterator<Region> sccAllRegions(State s) {
//        return concat(transform(s.getConcurrencies().iterator(),
//                new Function<Concurrency, Iterator<Concurrency>>() {
//        /**
//         * {@inheritDoc}
//         */
//        public Iterator<Region> apply(Region arg0) {
//            return sccAllRegions(arg0);
//        }
//        }));
//    };
    
    public static Iterator<Region> sccAllControlflowRegions(Scope s) {
        if (s instanceof State) {
           return sccAllControlflowRegions((State) s);

        } else if (s instanceof Region) {
           return sccAllControlflowRegions((Region) s);
        }
        else {
            throw new IllegalArgumentException("Scope type not supported.");
        }
    }
}
