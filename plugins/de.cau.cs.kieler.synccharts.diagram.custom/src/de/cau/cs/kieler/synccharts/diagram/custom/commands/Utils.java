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
 * Utility class for cut, copy and paste. It holds the different clipboards
 * where the copied objects are kept temporarily. It also provides methods to
 * interact with the different clipboards.
 * 
 * TODO: create a generic super class for this
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

    public static Object ecoreCopy(final Object object) {
        return EcoreUtil.copy((EObject) object);
    }

    private static Object clipBoard = null;

    public static Object getObjectFromClipboard() {
        if (clipBoard instanceof EObject) {
            Object copy = EcoreUtil.copy((EObject) clipBoard);
            if (copy instanceof State) {
                cloneTransitions((State) clipBoard, (State) copy);
            }
            return copy;
        } else if (clipBoard instanceof Collection<?>) {
            Collection<?> copy = EcoreUtil
                    .copyAll((Collection<? extends EObject>) clipBoard);
            if (!copy.isEmpty()) {
                Object head = copy.iterator().next();
                if (head instanceof State) {
                    return getStatesFromClipboard(
                            (Collection<State>) clipBoard,
                            (Collection<State>) copy);
                }
                if (head instanceof Region) {
                    return getRegionsFromClipboard(
                            (Collection<Region>) clipBoard,
                            (Collection<Region>) copy);
                }
                if (head instanceof Transition) {
                    return getTransitionsFromClipboard(
                            (Collection<Transition>) clipBoard,
                            (Collection<Transition>) copy);
                }
            }
            return null;
        }
        return null;
    }

    /**
     * Copy an object to clipboard.
     * 
     * @param object
     *            the object
     */
    public static Object objectToClipboard(final Object object) {
        resetClipboard();
        if (object instanceof EObject) {
            EObject o = EcoreUtil.copy((EObject) object);
            clipBoard = o;
        } else if (object instanceof List<?>) {
            List<?> list = (List<?>) object;
            clipBoard = EcoreUtil.copyAll(list);
        }
        return clipBoard;
    }

    /**
     * Clears the clipboard.
     */
    private static void resetClipboard() {
        clipBoard = null;
    }

    public static boolean isClipboardEmpty() {
        return clipBoard == null;
    }

    /**
     * Clone all transitions on a state.
     * 
     * @param source
     *            the source
     * @param target
     *            the clone
     */
    private static void cloneTransitions(final State source, final State target) {
        List<Transition> transSource = source.getOutgoingTransitions();
        List<Transition> transTarget = target.getOutgoingTransitions();
        transTarget.removeAll(transTarget);

        for (Transition t : transSource) {
            if (t.getTargetState() == source) {
                Transition clone = (Transition) EcoreUtil.copy(t);
                transTarget.add(clone);
                clone.setTargetState(target);
            }
        }
    }

    /**
     * Get a list of states from the clipboard.
     * 
     * @return the states
     */
    public static List<State> getStatesFromClipboard(
            Collection<State> statesClipBoard, Collection<State> copy) {
        if (!statesClipBoard.isEmpty()) {
            List<State> dummy = new LinkedList<State>();
            for (State state : copy) {
                dummy.add(state);

                // remove transitions that leave the current selection
                Iterator<Transition> iter = state.getOutgoingTransitions()
                        .iterator();
                while (iter.hasNext()) {
                    Transition trans = iter.next();
                    if (!copy.contains(trans.getTargetState())) {
                        iter.remove();
                    }
                }
            }
            return dummy;
        }
        return null;
    }

    /**
     * Get a list of regions from the clipboard.
     * 
     * @return the regions
     */
    public static List<Region> getRegionsFromClipboard(
            Collection<Region> regionsClipBoard, Collection<Region> copy) {
        if (!regionsClipBoard.isEmpty()) {
            List<Region> dummy = new LinkedList<Region>();
            for (Region region : copy) {
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
    public static List<Transition> getTransitionsFromClipboard(
            Collection<Transition> transitionsClipBoard,
            Collection<Transition> copy) {
        if (!transitionsClipBoard.isEmpty()) {
            List<Transition> dummy = new LinkedList<Transition>();
            for (Transition transition : copy) {
                dummy.add(transition);
            }
            return dummy;
        }
        return null;
    }

    /**
     * Copy the object.
     * 
     * @param object
     *            the object
     * @return the copy
     */
    public static EObject copy(final Object object) {
        return EcoreUtil.copy((EObject) object);
    }

    /**
     * Debug output for xtend code.
     * 
     * @param object
     *            the message
     */
    public static void debug(final Object object) {
        System.out.println("COPY AND PASTE DEBUG: " + object.toString());
    }

    /**
     * 
     * @param aString
     *            the string to print
     */
    public static void dump(final String aString) {
        System.out.println(aString);
    }

    /**
     * Pseudo-method, allows setting breakpoints for analysing objects.
     * 
     * @param object
     *            the object
     * @return the object passed as param, casted to EObject
     */
    public static EObject analyze(final Object object) {
        return (EObject) object;
    }
}
