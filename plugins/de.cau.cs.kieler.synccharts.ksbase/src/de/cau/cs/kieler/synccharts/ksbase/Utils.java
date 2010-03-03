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

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;

/**
 * Utility class for synccharts ksbase.
 * 
 * @author soh
 * 
 */
public final class Utils {

    /**
     * 
     * 
     *
     */
    private Utils() {
        // does nothing
    }

    /** Clipboard for copy and paste. */
    private static volatile State stateClipBoard = null;
    /** Clipboard for copy and paste. */
    private static volatile Region regionClipBoard = null;
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
        regionClipBoard = null;
        transitionClipBoard = null;
    }

    /**
     * Get a state from the clipboard.
     * 
     * @return the state
     */
    public static State getStateFromClipboard() {
        return stateClipBoard;
    }

    /**
     * Get a region from the clipboard.
     * 
     * @return the region
     */
    public static Region getRegionFromClipboard() {
        return regionClipBoard;
    }

    /**
     * Get a transition from the clipboard.
     * 
     * @return the transition
     */
    public static Transition getTransitionFromClipboard() {
        return transitionClipBoard;
    }
}
