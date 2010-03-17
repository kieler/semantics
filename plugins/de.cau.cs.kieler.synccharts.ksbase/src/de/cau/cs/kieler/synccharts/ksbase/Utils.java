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
package de.cau.cs.kieler.synccharts.ksbase;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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
    private static volatile State stateClipBoard = null;
    /** Clipboard for copy and paste. */
    private static volatile List<State> statesClipBoard = null;
    /** Clipboard for copy and paste. */
    private static volatile Region regionClipBoard = null;
    /** Clipboard for copy and paste. */
    private static volatile List<Region> regionsClipBoard = null;
    /** Clipboard for copy and paste. */
    private static volatile Transition transitionClipBoard = null;

    /**
     * Copy a state to the clipboard.
     * 
     * @param state
     *            the state
     */
    public static void stateToClipboard(final State state) {
        resetClipboard();
        stateClipBoard = state;
    }

    /**
     * Copy a list of states to the clipboard.
     * 
     * @param states
     *            the list of states
     */
    public static void statesToClipboard(final List<State> states) {
        resetClipboard();
        statesClipBoard = states;
    }

    /**
     * Copy a region to the clipboard.
     * 
     * @param region
     *            the region
     */
    public static void regionToClipboard(final Region region) {
        resetClipboard();
        regionClipBoard = region;
    }

    /**
     * Copy a list of regions to the clipboard.
     * 
     * @param regions
     *            the list of regions
     */
    public static void regionsToClipboard(final List<Region> regions) {
        resetClipboard();
        regionsClipBoard = regions;
    }

    /**
     * Copy a transition to the clipboard.
     * 
     * @param trans
     *            the transition
     */
    public static void transitionToClipboard(final Transition trans) {
        resetClipboard();
        transitionClipBoard = trans;
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
