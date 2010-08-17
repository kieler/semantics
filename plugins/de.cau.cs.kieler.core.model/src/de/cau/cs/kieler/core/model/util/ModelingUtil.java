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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork.Void;

import de.cau.cs.kieler.core.annotations.NamedObject;

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

    private static EObject xtextModel;

    /**
     * Get the model from a given xtext editor.
     * 
     * @param xtextEd
     *            the editor
     * @return the model
     */
    public static EObject getModelFromXtextEditor(final XtextEditor xtextEd) {
        checkForDirtyEditor(xtextEd);
        IXtextDocument docu = xtextEd.getDocument();

        if (docu instanceof XtextDocument) {
            XtextDocument document = (XtextDocument) docu;

            document.readOnly(new Void<XtextResource>() {

                @Override
                public void process(final XtextResource state) throws Exception {
                    if (state != null) {
                        List<EObject> eObj = state.getContents();

                        xtextModel = eObj.get(0);
                    }

                }
            });
        }
        return xtextModel;
    }

    private static void checkForDirtyEditor(final XtextEditor diagramEditor) {
        if (diagramEditor.isDirty()) {
            final Shell shell = Display.getCurrent().getShells()[0];
            boolean b = MessageDialog
                    .openQuestion(
                            shell,
                            "Save Resource",
                            "'"
                                    + diagramEditor.getEditorInput().getName()
                                    + "'"
                                    + " has been modified. Save changes before simulating? (recommended)");
            if (b) {
                IEditorSite part = diagramEditor.getEditorSite();
                part.getPage().saveEditor((IEditorPart) part.getPart(), false);
            }
        }
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
    public static EditPart getEditPart(final EObject eObject,
            final EditPart rootEditPart) {
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
                DiagramEditor editor = (DiagramEditor) PlatformUI
                        .getWorkbench().getActiveWorkbenchWindow()
                        .getActivePage().getActiveEditor();
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
                Collection<Object> editParts = rootEP.getViewer()
                        .getEditPartRegistry().values();
                for (Object object : editParts) {
                    editPart = (EditPart) object;
                    EObject model = ((View) ((EditPart) object).getModel())
                            .getElement();
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
                                EObject parentModel = ((View) view)
                                        .getElement();
                                if (parentModel == eObject) {
                                    editPart = parentPart;
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
     * @param epBegin
     *            where to begin looking
     * @param theElement
     *            the element to look for
     * @author haf
     * @return the editPart that was found or null
     **/
    private static EditPart findEditPart(final EditPart epBegin,
            final EObject theElement) {
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
     * Finds ALL edit parts connected to the given semantic element.
     * 
     * @param dep
     *            the root edit part
     * @param theElement
     *            the element to look for
     * @return the list of results, may be empty
     */
    @SuppressWarnings("unchecked")
    public static List<EditPart> getEditParts(final DiagramEditPart dep,
            final EObject theElement) {
        List<EditPart> result = new LinkedList<EditPart>();
        Collection<Object> editParts = dep.getViewer().getEditPartRegistry()
                .values();
        for (Object object : editParts) {
            if (object instanceof EditPart) {
                EditPart editPart = (EditPart) object;
                Object objModel = editPart.getModel();
                if (objModel instanceof View) {
                    EObject model = ((View) objModel).getElement();
                    if (model == theElement) {
                        result.add(editPart);
                    }
                }
            }
        }
        return result;
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
    public static Collection<EObject> getAllByType(
            final EClassifier eObjectClass, final EObject rootObject) {
        TreeIterator<Object> iterator = EcoreUtil.getAllContents(rootObject,
                true);
        Collection<EObject> elements = EcoreUtil.getObjectsByType(
                iterator2Collection(iterator), eObjectClass);
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
    public static Collection<EObject> getAllAncestorsByType(
            final EClassifier eObjectClass, final EObject rootObject) {
        Collection<EObject> ancestors = new ArrayList<EObject>();
        EObject parent = rootObject.eContainer();
        while (parent != null) {
            ancestors.add(parent);
            parent = rootObject.eContainer();
        }
        Collection<EObject> elements = EcoreUtil.getObjectsByType(ancestors,
                eObjectClass);
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
    public static Collection<EObject> getAllByType(
            final EClassifier eObjectClass, final EditPart rootEditPart) {
        EObject rootObject = ((View) rootEditPart.getModel()).getElement();
        TreeIterator<Object> iterator = EcoreUtil.getAllContents(rootObject,
                true);
        Collection<EObject> elements = EcoreUtil.getObjectsByType(
                iterator2Collection(iterator), eObjectClass);
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
     * 
     * @return A List of EObjects
     */
    public static List<EObject> getModelElementsFromSelection() {
        if (PlatformUI.getWorkbench() != null
                && PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null
                && PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                        .getSelectionService() != null) {
            ISelection sel = PlatformUI.getWorkbench()
                    .getActiveWorkbenchWindow().getSelectionService()
                    .getSelection();
            LinkedList<EObject> eo = new LinkedList<EObject>();
            if (sel instanceof StructuredSelection) {
                Iterator<?> it = ((StructuredSelection) sel).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof EditPart) {
                        Object model = ((EditPart) next).getModel();
                        if (model instanceof View && ((View) model).getElement() != null) {
                            // null check because Notes in a Diagram do not have semantic counterpart
                            eo.add(((View) model).getElement());
                        }
                    }
                }
            }
            return eo;
        }
        return null;
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
                    .getActiveWorkbenchWindow().getActivePage()
                    .getActiveEditor();
            DiagramEditPart dep = editor.getDiagramEditPart();
            EditPart editPart = dep.findEditPart(dep, eObject);
            if (editPart == null) {
                Object o = dep.getViewer().getEditPartRegistry().get(eObject);
                if (o instanceof EditPart) {
                    editPart = (EditPart) o;
                }
            }
            // have to search registry manually
            if (editPart == null) {
                @SuppressWarnings("unchecked")
                Collection<Object> editParts = dep.getViewer()
                        .getEditPartRegistry().values();
                for (Object object : editParts) {
                    try {
                        EditPart theEditPart = (EditPart) object;
                        EObject model = ((View) theEditPart.getModel())
                                .getElement();
                        if (model == eObject) {
                            // search the most valid parent
                            // this is necessary because inner EditParts may
                            // also
                            // reference the same model, e.g.
                            // TransitionTriggerAndEffectsEditPart has
                            // TransitionImpl as model element
                            // however, the parent
                            // TransitionEditPart also has TransitionImpl as
                            // model
                            // element
                            // so there are multiple EditParts that have the
                            // same
                            // EObject. Here we will
                            // return only the outermost parent EditPart
                            while (theEditPart.getParent() != null) {
                                EditPart parentPart = theEditPart.getParent();
                                Object view = parentPart.getModel();
                                if (view instanceof View) {
                                    EObject parentModel = ((View) view)
                                            .getElement();
                                    if (parentModel == eObject) {
                                        theEditPart = parentPart;
                                    }
                                } else {
                                    break;
                                } // a Root diagram edit part has no real view,
                                  // so
                                  // we will stop searching there
                            }
                            return theEditPart;
                        }

                    } catch (Exception e) {
                        /* nothing, go on with the next element */
                    }
                }
            }
            return editPart;
        } catch (Exception e) {
            e.printStackTrace();
            /* nothing, we simply return null if it cannot be found */
        }
        return null;
    }
    
    
    /**
     * Method to translate a KIELER URI in an EMF Fragment URI.
     * 
     * @param kielerUri
     *            The KIELER URI referring an EObject.
     * @param resource
     *            The Resource holding the EObject.
     * @return The Fragment URI for the EObject referred by the given KIELER
     *         URI. Null, if EObject doesn't exists.
     */
    public static String kielerUriToFragmentUri(final String kielerUri, final Resource resource) {
        String result = "";
        
        try {
        if (resource.getEObject(kielerUri) != null) {
            //when EObjects aren't named, the KIELER URI equals the Fragment URI 
            return kielerUri;
        }
        } catch (IllegalArgumentException ex) {
            //can be ignored, we then know that we dont have a Fragment URI as KIELER URI
        }
        
        if (kielerUri.startsWith("//")) {
            //only one root node present, no translation necessary
            EObject root = resource.getContents().get(0);
            result = "/";
            int lastOccurance = 2;
            int currentOccurance;
            
            while (kielerUri.indexOf("/", lastOccurance) != -1) {
                //parse KIELER URI and find corresponding EObject on the current level 
                result += "/";
                currentOccurance = kielerUri.indexOf("/", lastOccurance);
                String currentUri;
                
                if (currentOccurance != lastOccurance) {
                    currentUri = kielerUri.substring(lastOccurance, currentOccurance);
                    lastOccurance = currentOccurance;
                } else {
                    //when this is the last referrer, just take the rest
                    currentUri = kielerUri.substring(lastOccurance);
                    lastOccurance = kielerUri.length();
                }
                String currentResult = new String(result);
                for (EObject eo : root.eContents()) {
                    //iterate through the current level and find the NamedObject with the same name
                    if (eo instanceof NamedObject) {
                        if (((NamedObject) eo).getName().equals(currentUri.split("\\.")[1])) {
                            result += ((InternalEObject) eo.eContainer())
                                    .eURIFragmentSegment(
                                            eo.eContainingFeature(), eo);
                            root = eo;
                            break;
                        }
                    }
                }
                if (currentResult.equals(result)) {
                    //Element wasn't found, although this was the right level
                    //Return null then
                    return null;
                }
            }
        } else {
            //more than one root node
            throw new UnsupportedOperationException("Can't handle more than one root node yet!");
        }
        return result;
    }
    
    /**
     * Method to get a (more readable) KIELER URI from a EMF Fragment URI and
     * its resource. Will return the Fragment URI, if EObjects are not
     * NamedObjects.
     * If using NamedObjects, it is required that names on the same level are unique.
     * 
     * @see de.cau.cs.kieler.core.annotations.NamedObject
     * 
     * @param fragmentUri
     *            The Fragment URI from which the KIELER URI is generated (must
     *            not be null).
     * @param resource
     *            The resource in which the referred EObject is held.
     * @return A KIELER URI corresponding to the Fragment URI.
     */
    public static String fragmentUriToKielerUri(final String fragmentUri, final Resource resource) {
        String result = "";
        InternalEObject ieo = (InternalEObject) resource.getEObject(fragmentUri);
        InternalEObject container = (InternalEObject) ieo.eContainer();
        
        if (container != null) {
            if (ieo instanceof NamedObject) {
            result = fragmentUriToKielerUri(getFragmentUri(container), resource)
                    + "/"
                    + "@" + ieo.eContainingFeature().getName() + "."
                    + ((NamedObject) ieo).getName();
            } else {
                result = fragmentUriToKielerUri(getFragmentUri(container), resource)
                + "/"
                + container.eURIFragmentSegment(ieo.eContainingFeature(),
                        ieo);
            }
        } else {
            result = "/";
        }
        
        return result;
    }
    
    /**
     * Method to get the EMF Fragment URI for a given EObject.
     * 
     * @param eo
     *            The EObject for which the URI is requested (must not be null).
     * @return The full Fragment URI.
     */
    public static String getFragmentUri(final EObject eo) {
        String fragment = "";
        InternalEObject ieo = (InternalEObject) eo;
        InternalEObject container = (InternalEObject) eo.eContainer();
        
        if (container != null) {
            fragment = getFragmentUri(container)
                    + "/"
                    + container.eURIFragmentSegment(ieo.eContainingFeature(),
                            ieo);
        } else {
            fragment = "/";
        }
        
        return fragment;
    }
    
}
