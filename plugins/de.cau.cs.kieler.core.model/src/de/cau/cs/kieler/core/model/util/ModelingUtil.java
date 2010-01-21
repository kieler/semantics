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
package de.cau.cs.kieler.core.model.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.PlatformUI;

/**
 * Utility class with static methods to handle EMF models and GEF EditParts.
 * 
 * @author haf
 * 
 * @kieler.rating 2010-01-19 proposed yellow proposed by haf
 */
public final class ModelingUtil {

    private ModelingUtil() {
    }

    /**
     * Find an GEF EditPart that corresponds to an semantic model EObject.
     * EObjects are used to address objects that are exchanged between the
     * plugins of the View Management as well as other plugins. EObjects provide
     * the ability for semantical addressing of other objects such as children
     * of an object or similar cases.
     * 
     * @author haf
     * @param eObject
     *            the semantic object
     * @param rootEditPart
     *            the root EditPart so start the search. May be null, then the
     *            current active editor is used
     * @return the corresponding EditPart
     * 
     */
    public static EditPart getEditPart(final EObject eObject, final EditPart rootEditPart) {
        // if (cachedEditParts2 == null) {
        // // if hashmap is not initialized, create it
        // cachedEditParts2 = new HashMap<EObject, EditPart>();
        // } else {
        // // try to get from hashmap first
        // if (cachedEditParts2.containsKey(eObject)) {
        // return cachedEditParts2.get(eObject);
        // }
        // }

        try {
            EditPart rootEP = rootEditPart;
            if (rootEP == null) {
                DiagramEditor editor = (DiagramEditor) PlatformUI.getWorkbench()
                        .getActiveWorkbenchWindow().getActivePage().getActiveEditor();
                DiagramEditPart dep = editor.getDiagramEditPart();
                rootEP = dep;
            }
            EditPart editPart = findEditPart(rootEP, eObject);
            if (editPart == null) {
                rootEP.getViewer().getEditPartRegistry().get(eObject);
            }
            // have to search registry manually
            if (editPart == null) {
                @SuppressWarnings("unchecked")
                Collection<Object> editParts = rootEP.getViewer().getEditPartRegistry().values();
                for (Object object : editParts) {
                    editPart = (EditPart) object;
                    EObject model = ((View) ((EditPart) object).getModel()).getElement();
                    if (model == eObject) {
                        // search the most valid parent
                        // this is necessary because inner EditParts may also
                        // reference the same
                        // model, e.g.
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
                            // we will stop
                            // searching there
                        }
                        // cachedEditParts2.put(eObject, editPart);
                        return editPart;
                    }
                }
            }
            // cachedEditParts2.put(eObject, editPart);
            return editPart;
        } catch (Exception e) {
            /* nothing, we simply return null if it cannot be found */
        }
        return null;
    }

    /**
     * Finds an editpart given a starting editpart and an EObject. Won't find
     * connections.
     * 
     * @author haf
     **/
    private static EditPart findEditPart(final EditPart epBegin, final EObject theElement) {
        if (theElement == null || epBegin == null) {
            return null;
        }

        final View view = (View) ((IAdaptable) epBegin).getAdapter(View.class);

        if (view != null) {
            EObject el = ViewUtil.resolveSemanticElement(view);

            if ((el != null) && el.equals(theElement)) {
                return epBegin;
            }
        }

        for (Object child : epBegin.getChildren()) {
            if (child instanceof EditPart) {
                EditPart elementEP = findEditPart((EditPart) child, theElement);
                if (elementEP != null) {
                    return elementEP;
                }
            }
        }
        return null;
    }

    /**
     * Get all objects that are direct or indirect children of the given root
     * EObject if they are of the specified type.
     * 
     * @author haf
     * @param eObjectClass
     *            The type of object
     * @param rootObject
     *            The root object
     * @return Collection of found EObject matching the type
     */
    public static Collection<EObject> getAllByType(final EClassifier eObjectClass,
            final EObject rootObject) {
        TreeIterator<Object> iterator = EcoreUtil.getAllContents(rootObject, true);
        Collection<EObject> elements = EcoreUtil.getObjectsByType(iterator2Collection(iterator),
                eObjectClass);
        return elements;
    }

    /**
     * Get all objects that are direct or indirect parents of the given root
     * EObject if they are of the given type.
     * 
     * @author haf
     * @param eObjectClass
     *            The type of object
     * @param rootObject
     *            The root object to start the search
     * @return Collection of found EObject matching the type
     */
    public static Collection<EObject> getAllAncestorsByType(final EClassifier eObjectClass,
            final EObject rootObject) {
        Collection<EObject> ancestors = new ArrayList<EObject>();
        EObject parent = rootObject.eContainer();
        while (parent != null) {
            ancestors.add(parent);
            parent = rootObject.eContainer();
        }
        Collection<EObject> elements = EcoreUtil.getObjectsByType(ancestors, eObjectClass);
        return elements;
    }

    /**
     * Get all objects that are direct or indirect children of the given root
     * EObject corresponding to the given EditPart if they are of the specified
     * type.
     * 
     * @author haf
     * 
     * @param eObjectClass
     *            The type of object
     * @param rootEditPart
     *            The root object
     * @return Collection of found EObject matching the type
     */
    public static Collection<EObject> getAllByType(final EClassifier eObjectClass,
            final EditPart rootEditPart) {
        EObject rootObject = ((View) rootEditPart.getModel()).getElement();
        TreeIterator<Object> iterator = EcoreUtil.getAllContents(rootObject, true);
        Collection<EObject> elements = EcoreUtil.getObjectsByType(iterator2Collection(iterator),
                eObjectClass);
        return elements;
    }

    /**
     * Convert an Iterator to a Collection. Useful if some method returns only
     * an iterator but some other method takes a Collection as input to iterate
     * over that collection. However, it has linear runtime and many such
     * transformations should be avoided.
     * 
     * @author haf
     * @param <T>
     *            the base type
     * @param iter
     *            The input Iterator
     * @return A Collection containing all elements of the Iterator.
     */
    public static <T> Collection<T> iterator2Collection(final Iterator<T> iter) {
        ArrayList<T> list = new ArrayList<T>();
        for (; iter.hasNext();) {
            T item = iter.next();
            list.add(item);
        }
        return list;
    }
    
    /**
     * Returns a list of the EObjects currently selected in the diagram. 
     * @return A List of EObjects
     */
    public static List<EObject> getModelElementsFromSelection() {
        if (PlatformUI.getWorkbench() != null
                && PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null
                && PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService() != null) {
            ISelection sel = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getSelectionService().getSelection();
            LinkedList<EObject> eo = new LinkedList<EObject>();
            if (sel instanceof StructuredSelection) {
                Iterator<?> it = ((StructuredSelection) sel).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof EditPart) {
                        Object model = ((EditPart) next).getModel();
                        if (model instanceof View) {
                            eo.add(((View) model).getElement());
                        }
                    }
                }
            }
            return eo;
        } else {
            return null;
        }
    }
}
