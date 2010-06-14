/*
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
 */
package de.cau.cs.kieler.synccharts.diagram.custom.update;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author soh
 */
public class Synccharts_0_1_to_0_2_Utils {

    private static Map<Object, List<Object>> pending;

    private static Map<Object, Object> resolved;

    public static void clear() {
        pending = new HashMap<Object, List<Object>>();
        resolved = new HashMap<Object, Object>();
    }

    /**
     * Put a new state in a list.
     * 
     * @param oldState
     *            the old version state
     * @param newState
     *            the new version state
     */
    public static void addState(final Object oldState, final Object newState) {
        resolved.put(oldState, newState);
        if (pending.get(oldState) == null) {
            pending.put(oldState, new LinkedList<Object>());
        }
    }

    /**
     * Get a state from the list.
     * 
     * @param state
     *            the old version state
     * @return the new version state
     */
    public static Object getState(final Object state) {
        return resolved.get(state);
    }

    /**
     * Add an unresolved transition to the list.
     * 
     * @param oldTargetState
     *            the target state of the transition (old version)
     * @param newTransition
     *            the transition (new version)
     */
    public static void addTransition(final Object oldTargetState, final Object newTransition) {
        List<Object> list = pending.get(oldTargetState);

        if (list == null) {
            list = new LinkedList<Object>();
            pending.put(oldTargetState, list);
        }
        list.add(newTransition);
    }

    /**
     * Determine whether there are unresolved transitions to the state.
     * 
     * @param state
     *            the old version state
     * @return true if there are no transitions
     */
    public static boolean isEmpty(final Object state) {
        List<Object> list = pending.get(state);
        return list == null || list.isEmpty();
    }

    /**
     * Get the next unresolved transition to the target state.
     * 
     * @param state
     *            the old version target state
     * @return the new version transition
     */
    public static Object dequeue(final Object state) {
        List<Object> list = pending.get(state);
        if (list != null && !list.isEmpty()) {
            Object result = list.remove(0);
            return result;
        }
        return null;
    }
}
