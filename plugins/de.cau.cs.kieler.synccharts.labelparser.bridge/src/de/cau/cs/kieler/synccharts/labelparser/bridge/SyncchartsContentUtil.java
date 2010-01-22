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
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.labelparser.bridge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.core.KielerException;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;

/**
 * Static helper methods for Synccharts.
 * 
 * @author haf
 * 
 * @kieler.rating 2010-01-19 proposed yellow proposed by haf
 * 
 */
public final class SyncchartsContentUtil {

    /**
     * Private constructor for utility class. May not be instantiated.
     */
    private SyncchartsContentUtil() {
    }

    private static Map<EObject, List<IMarker>> markers = new HashMap<EObject, List<IMarker>>();

    /**
     * Determine a new unique ID for a given State. Will search sibling states
     * (states within the same Region) and compare their IDs. Will return the
     * next ID with the "Sn" where n is the next free integer number available,
     * e.g. S0, S1, S2...
     * 
     * @param state
     *            given State
     * @return a new unique ID within the Region
     */
    public static String getNewId(final State state) {
        String id = "S";
        Region region = state.getParentRegion();
        if (region == null) {
            return id;
        }
        if (region != null) {
            EList<State> siblings = region.getInnerStates();
            int counter = 0;
            for (State sibling : siblings) {
                if (sibling == state || sibling.getId() == null) {
                    continue;
                } else {
                    String siblingId = sibling.getId().trim();
                    if (siblingId.matches("S\\d+")) {
                        // matches S digits
                        int i = siblingId.length();
                        while (Character.isDigit(siblingId.charAt(i - 1))) {
                            i--;
                        }
                        if (siblingId.charAt(i - 1) == 'S') {
                            i = Integer.parseInt(siblingId.substring(i));
                            if (i >= counter) {
                                counter = i + 1;
                            }
                        }
                    }
                }
            }
            id = id + counter;
        }
        return id;
    }

    /**
     * Determine a new unique ID for a given Region. Will search sibling regions
     * (regions within the same State) and compare their IDs. Will return the
     * next ID with the "Rn" where n is the next free integer number available,
     * e.g. R0, R1, R2...
     * 
     * @param region
     *            given Region
     * @return a new unique ID within the State
     */
    public static String getNewId(final Region region) {
        String id = "R";
        State parentState = region.getParentState();
        if (parentState == null) {
            return id;
        }
        if (parentState != null) {
            EList<Region> siblings = parentState.getRegions();
            int counter = 0;
            for (Region sibling : siblings) {
                if (sibling == region || sibling.getId() == null) {
                    continue;
                } else {
                    String siblingId = sibling.getId().trim();
                    if (siblingId.matches("R\\d+")) {
                        // matches S digits
                        int i = siblingId.length();
                        while (Character.isDigit(siblingId.charAt(i - 1))) {
                            i--;
                        }
                        if (siblingId.charAt(i - 1) == 'R') {
                            i = Integer.parseInt(siblingId.substring(i));
                            if (i >= counter) {
                                counter = i + 1;
                            }
                        }
                    }
                }
            }
            id = id + counter;
        }
        return id;
    }
    
    /**
     * Get a new unique priority to a given Transition. That is the current
     * priority will be changed if there is a conflict with any sibling
     * Transition. Set it to the max priority of all siblings plus one.
     * 
     * @param transition
     *            the input Transition whose prio will be changed
     * @return a new unique priority
     */
    public static int getUniquePrio(final Transition transition) {
        int currentPrio = transition.getPriority();
        if (currentPrio == 0) {
            currentPrio = 1; // Prios should start at 1
        }
        EList<Transition> transitions = transition.getSourceState().getOutgoingTransitions();
        // if multiple transitions have same priority, set the current prio to a
        // new value
        boolean changePrio = false;
        int newPrio = 1; // prios should start with 1
        for (Transition transition2 : transitions) {
            int otherPrio = transition2.getPriority();
            // search a new unique prio
            if (otherPrio >= newPrio) {
                newPrio = otherPrio + 1;
            }
            // check if there actually is a prio conflict
            if (otherPrio == currentPrio && transition != transition2) {
                changePrio = true;
            }
        }
        if (changePrio) {
            return newPrio;
        } else {
            return currentPrio;
        }
    }

    /**
     * Add a problem marker to a given EObject to indicate problems graphically
     * in the diagram. Will silently fail at any errors, e.g. if there is no
     * graphical editor open corresponding to the object.
     * 
     * @param msg
     *            String message of the marker
     * @param target
     *            target object
     * @throws KielerException
     *             if the marker cannot be created
     */
    public static void addMarker(final String msg, final EObject target) throws KielerException {
        try {
            String elementID = "";
            EditPart editPart = getEditPart(target);
            View view = (View) editPart.getModel();
            elementID = ViewUtil.getIdStr(view);

            IResource resource = WorkspaceSynchronizer.getFile(view.eResource());
            IMarker marker = resource
                    .createMarker("de.cau.cs.kieler.synccharts.diagram.diagnostic");
            marker.setAttribute(IMarker.MESSAGE, msg);
            marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
            marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
            marker.setAttribute(org.eclipse.gmf.runtime.common.ui.resources.IMarker.ELEMENT_ID,
                    elementID);

            List<IMarker> myMarkers = markers.get(target);
            if (myMarkers == null) {
                myMarkers = new ArrayList<IMarker>();
                markers.put(target, myMarkers);
            }
            myMarkers.add(marker);
        } catch (Exception e) {
            throw new KielerException("Could not create problem marker in diagram.", e);
        }
    }

    /**
     * Remove all custom problem markers from a given EObject to indicate
     * problems graphically in the diagram. Will silently fail at any errors,
     * e.g. if there is no graphical editor open corresponding to the object.
     * 
     * @param target
     *            target object
     */
    public static void clearMarker(final EObject target) {
        try {
            List<IMarker> myMarkers = markers.get(target);
            if (myMarkers == null) {
                return;
            }
            for (IMarker marker : myMarkers) {
                marker.delete();
            }
            myMarkers.clear();
        } catch (Exception e) { /* nothing */
        }
    }

    /**
     * Find an GEF EditPart that corresponds to an semantic model EObject.
     * 
     * @param eObject
     *            the semantic object
     * @return the corresponding EditPart
     * 
     *         TODO: search of transition edit parts iterates all edit parts and
     *         will take linear time. You should improve this, by maybe build a
     *         local cache hash map
     */

    public static EditPart getEditPart(final EObject eObject) {
        try {
            DiagramEditor editor = (DiagramEditor) PlatformUI.getWorkbench()
                    .getActiveWorkbenchWindow().getActivePage().getActiveEditor();
            DiagramEditPart dep = editor.getDiagramEditPart();
            EditPart editPart = dep.findEditPart(dep, eObject);
            if (editPart == null) {
                dep.getViewer().getEditPartRegistry().get(eObject);
            }
            // have to search registry manually
            if (editPart == null) {
                @SuppressWarnings("unchecked")
                Collection<Object> editParts = dep.getViewer().getEditPartRegistry().values();
                for (Object object : editParts) {
                    editPart = (EditPart) object;
                    EObject model = ((View) ((EditPart) object).getModel()).getElement();
                    if (model == eObject) {
                        // search the most valid parent
                        // this is necessary because inner EditParts may also
                        // reference the same model, e.g.
                        // TransitionTriggerAndEffectsEditPart has
                        // TransitionImpl as model element
                        // however, the parent
                        // TransitionEditPart also has TransitionImpl as model
                        // element
                        // so there are multiple EditParts that have the same
                        // EObject. Here we will
                        // return only the outermost parent EditPart
                        while (editPart.getParent() != null) {
                            EditPart parentPart = editPart.getParent();
                            Object view = parentPart.getModel();
                            if (view instanceof View) {
                                EObject parentModel = ((View) view).getElement();
                                if (parentModel == eObject) {
                                    editPart = parentPart;
                                    System.out.println();
                                }
                            } else {
                                break;
                            } // a Root diagram edit part has no real view, so
                            // we will stop searching there
                        }
                        return editPart;
                    }
                }
            }
            return editPart;
        } catch (Exception e) {
            /* nothing, we simply return null if it cannot be found */
        }
        return null;
    }
}
