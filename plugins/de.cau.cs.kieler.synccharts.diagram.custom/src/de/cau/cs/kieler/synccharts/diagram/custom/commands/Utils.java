/**
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
package de.cau.cs.kieler.synccharts.diagram.custom.commands;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;

/**
 * Utility class for synccharts ksbase.
 * 
 * @author soh
 * @kieler.rating 2010-03-12 proposed yellow
 */
public final class Utils {

    /**
     * 
     */
    private Utils() {
        // does nothing
    }

    /** Clipboard for copy and paste. */
    private static volatile EObject stateClipBoard = null;
    /** Clipboard for copy and paste. */
    private static volatile Collection<State> statesClipBoard = null;
    /** Clipboard for copy and paste. */
    private static volatile EObject regionClipBoard = null;
    /** Clipboard for copy and paste. */
    private static volatile Collection<Region> regionsClipBoard = null;
    /** Clipboard for copy and paste. */
    private static volatile EObject transitionClipBoard = null;

    public static void objectToClipboard(final Object object) {
        resetClipboard();
        if (object instanceof EObject) {
            EObject o = EcoreUtil.copy((EObject) object);
            if (o instanceof State) {
                stateClipBoard = o;
            } else if (o instanceof Region) {
                regionClipBoard = o;
            } else if (o instanceof Transition) {
                transitionClipBoard = o;
            }
        } else if (object instanceof List<?>) {
            List<?> list = (List<?>) object;

            if (list.get(0) instanceof State) {
                Collection<State> coll = new LinkedList<State>();
                for (Object o : list) {
                    coll.add((State) o);
                }
                statesClipBoard = EcoreUtil.copyAll(coll);
            }
            if (list.get(0) instanceof Region) {
                Collection<Region> coll = new LinkedList<Region>();
                for (Object o : list) {
                    coll.add((Region) o);
                }
                regionsClipBoard = EcoreUtil.copyAll(coll);
            }
        }
    }

    /**
     * Clears the clipboard.
     */
    private static void resetClipboard() {
        stateClipBoard = null;
        statesClipBoard = null;
        regionClipBoard = null;
        regionsClipBoard = null;
        transitionClipBoard = null;
    }

    /**
     * Get a state from the clipboard.
     * 
     * @return the state
     */
    public static State getStateFromClipboard() {
        if (stateClipBoard != null) {
            State newState = (State) EcoreUtil.copy(stateClipBoard);

            // remove all non self loop transitions
            Iterator<Transition> iter = newState.getOutgoingTransitions()
                    .iterator();
            while (iter.hasNext()) {
                Transition next = iter.next();
                if (next.getTargetState() != newState) {
                    iter.remove();
                }
            }
            return newState;
        }
        return null;
    }

    /**
     * Get a list of states from the clipboard.
     * 
     * @return the states
     */
    public static List<State> getStatesFromClipboard() {
        if (statesClipBoard != null && !statesClipBoard.isEmpty()) {
            Collection<State> states = EcoreUtil.copyAll(statesClipBoard);
            List<State> dummy = new LinkedList<State>();
            for (State state : states) {
                dummy.add(state);

                // remove transitions that leave the current selection
                Iterator<Transition> iter = state.getOutgoingTransitions()
                        .iterator();
                while (iter.hasNext()) {
                    Transition trans = iter.next();
                    if (!states.contains(trans.getTargetState())) {
                        iter.remove();
                    }
                }
            }
            return dummy;
        }
        return null;
    }

    /**
     * Get a region from the clipboard.
     * 
     * @return the region
     */
    public static Region getRegionFromClipboard() {
        if (regionClipBoard != null) {
            Region newRegion = (Region) EcoreUtil.copy(regionClipBoard);
            return newRegion;
        }
        return null;
    }

    /**
     * Get a list of regions from the clipboard.
     * 
     * @return the regions
     */
    public static List<Region> getRegionsFromClipboard() {
        if (regionsClipBoard != null && !regionsClipBoard.isEmpty()) {
            Collection<Region> regions = EcoreUtil.copyAll(regionsClipBoard);
            List<Region> dummy = new LinkedList<Region>();
            for (Region region : regions) {
                dummy.add(region);
            }
            return dummy;
        }
        return null;
    }

    /**
     * Get a transition from the clipboard.
     * 
     * @return the transition
     */
    public static Transition getTransitionFromClipboard() {
        if (transitionClipBoard != null) {
            Transition newTrans = (Transition) EcoreUtil
                    .copy(transitionClipBoard);
            return newTrans;
        }
        return null;
    }
}
