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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.BasicResourceHandler;
import org.eclipse.emf.ecore.xmi.impl.XMIHelperImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.core.WrappedException;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;

/**
 * Utility class for cut, copy and paste. It holds the different clipboards
 * where the copied objects are kept temporarily. It also provides methods to
 * interact with the different clipboards. *
 * 
 * @author soh
 * @kieler.design 2010-06-15 msp, cmot
 * @kieler.ignore (excluded from review process)
 */
public final class Utils {

    /** The clipboard where the copied objects are stored. */
    private static Object clipBoard = null;

    /**
     * 
     */
    private Utils() {
        // does nothing
    }

    /**
     * Clone an eObject with the method from EcoreUtil.
     * 
     * @param object
     *            the eObject to clone
     * @return the clone
     */
    public static Object ecoreCopy(final Object object) {
        return EcoreUtil.copy((EObject) object);
    }

    /**
     * Get the systems native clipboard.
     * 
     * @return the clipboard
     */
    private static Clipboard getSystemClipboard() {
        Display display = PlatformUI.getWorkbench().getDisplay();
        return new Clipboard(display);
    }

    /**
     * Get the contents of the system clipboard and try to parse EObjects from
     * it.
     * 
     * FIXME: not working yet. integrate into loading process
     * 
     * @return the objects parsed from it
     */
    private static Object getObjectFromSystemClipboard() {
        Clipboard systemClipboard = getSystemClipboard();
        TextTransfer textTransfer = TextTransfer.getInstance();
        Object obj = systemClipboard.getContents(textTransfer);
        if (obj != null && obj instanceof String) {
            String root = (String) obj;
            XMIResource xmiResource = new XMIResourceImpl();
            xmiResource.setURI(URI.createURI("dummy"));
            // XMIHelperImpl xmlHelper = new XMIHelperImpl(xmiResource);
            ByteArrayInputStream bais = new ByteArrayInputStream(
                    root.getBytes());

            Map<Object, Object> defaultLoadOptions = xmiResource
                    .getDefaultLoadOptions();
            defaultLoadOptions.put(XMLResource.OPTION_RESOURCE_HANDLER,
                    new BasicResourceHandler());

            try {
                xmiResource.load(bais, defaultLoadOptions);
            } catch (IOException ex) {
                // ex.printStackTrace();
            }

            EList<EObject> results = xmiResource.getContents();

            if (results != null && !results.isEmpty()) {
                if (results.size() == 1) {
                    return results.get(0);
                }
                return EcoreUtil.copyAll(results);
            }
            return null;
        }
        return null;
    }

    /**
     * Get an object from the clipboard. This involves preparing the object so
     * it can be inserted right away.
     * 
     * @return an EObject or a list of eObjects
     */
    @SuppressWarnings("unchecked")
    public static Object getObjectFromClipboard() {
        getObjectFromSystemClipboard();
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
     * @return the contents of the clipboard
     */
    public static Object objectToClipboard(final Object object) {
        resetClipboard();
        if (object instanceof EObject) {
            EObject o = EcoreUtil.copy((EObject) object);
            if (object instanceof State) {
                cloneTransitions((State) object, (State) o);
            }
            clipBoard = o;
        } else if (object instanceof List<?>) {
            List<?> list = (List<?>) object;
            clipBoard = EcoreUtil.copyAll(list);
        }
        objectToSystemClipboard(object);
        return clipBoard;
    }

    /**
     * Experimental method for writing the object or list of objects to the
     * system clipboard.
     * 
     * TODO: use this to implement copy and paste through the system to allow
     * copying between applications.
     * 
     * @param object
     *            the object that should be copied to clipboard
     */
    private static void objectToSystemClipboard(final Object object) {
        ArrayList<EObject> arrayList = new ArrayList<EObject>();
        if (object instanceof EObject) {
            arrayList.add((EObject) object);
        } else if (object instanceof List<?>) {
            for (Object o : (List<?>) object) {
                arrayList.add((EObject) o);
            }
        } else {
            return;
        }
        String returnStr = null;
        XMIResource xmiResource = new XMIResourceImpl();
        XMIHelperImpl xmiHelper = new XMIHelperImpl(xmiResource);
        try {
            returnStr = XMIHelperImpl.saveString(new HashMap<Object, Object>(),
                    arrayList, "UTF-8", xmiHelper);
        } catch (Exception e) {
            throw new WrappedException(e);
        }

        Clipboard systemClipboard = getSystemClipboard();
        TextTransfer textTransfer = TextTransfer.getInstance();
        systemClipboard.setContents(new Object[] { returnStr },
                new TextTransfer[] { textTransfer });
    }

    /**
     * Clears the clipboard.
     */
    private static void resetClipboard() {
        clipBoard = null;
    }

    /**
     * Check if there is any object inside the clipboard.
     * 
     * @return true if the clipboard is empty
     */
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
        target.getIncomingTransitions().removeAll(
                target.getIncomingTransitions());

        for (Transition t : transSource) {
            if (t.getTargetState() == t.getSourceState()) {
                Transition clone = EcoreUtil.copy(t);
                clone.setSourceState(target);
                clone.setTargetState(target);
            }
        }
    }

    /**
     * Prepare a list of states to be ready for insertion using xtend.
     * 
     * @param statesClipBoard
     *            the raw list of states
     * @param copy
     *            the copy of the list
     * @return the states the formatted list
     */
    public static List<State> getStatesFromClipboard(
            final Collection<State> statesClipBoard,
            final Collection<State> copy) {
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
     * Prepare a list of regions to be ready for insertion using xtend.
     * 
     * @param regionsClipBoard
     *            the raw list of regions
     * @param copy
     *            the copy of the list
     * @return the states the formatted list
     */
    public static List<Region> getRegionsFromClipboard(
            final Collection<Region> regionsClipBoard,
            final Collection<Region> copy) {
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
     * Prepare a list of transitions to be ready for insertion using xtend.
     * 
     * @param transitionsClipBoard
     *            the raw list of transitions
     * @param copy
     *            the copy of the list
     * @return the states the formatted list
     */
    public static List<Transition> getTransitionsFromClipboard(
            final Collection<Transition> transitionsClipBoard,
            final Collection<Transition> copy) {
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
