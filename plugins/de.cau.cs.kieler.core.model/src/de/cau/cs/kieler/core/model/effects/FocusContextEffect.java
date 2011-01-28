/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.effects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.ui.IWorkbenchPart;

import de.cau.cs.kieler.core.kivi.ICompoundEffect;
import de.cau.cs.kieler.core.kivi.IEffect;
import de.cau.cs.kieler.core.ui.GraphicalFrameworkService;

/**
 * @author haf
 * 
 */
public class FocusContextEffect implements ICompoundEffect {

    private Set<EObject> focus;
    private Set<EObject> context;
    private List<IEffect> effects;

    private EObject rootElement;

    private IWorkbenchPart theEditor;

    /**
     * Construct a FocusContextEffect at a given diagram (Editor or View). The WorkbenchPart is
     * required to be supported by the registered GraphicalFrameworkService. If not, this will throw
     * a runtime KielerNotSupportedException.
     * 
     * @param editor
     *            a GraphicalFrameworkService compatible Editor or View
     */
    public FocusContextEffect(final IWorkbenchPart editor) {
        this.theEditor = editor;
        this.focus = new HashSet<EObject>();
        this.context = new HashSet<EObject>();
        EditPart rootEP = GraphicalFrameworkService.getInstance().getBridge(theEditor)
                .getEditPart(theEditor);
        this.rootElement = GraphicalFrameworkService.getInstance().getBridge(theEditor)
                .getElement(rootEP);
        if (rootElement == null) {
            throw new NullPointerException("the Root element of the editor " + theEditor
                    + "is null");
        }
    }

    /**
     * {@inheritDoc}
     */
    public List<IEffect> getPrimitiveEffects() {
        if (effects == null) {
            effects = new ArrayList<IEffect>(focus.size() + context.size());
        }
        calculateTransitiveFocus();
        for (EObject focusObj : focus) {
            effects.add(new CompartmentCollapseExpandEffect(theEditor, focusObj, null, 0, false));
        }
        for (EObject contextObj : context) {
            effects.add(new CompartmentCollapseExpandEffect(theEditor, contextObj, null, 0, true));
        }
        return effects;
    }

    /**
     * Add one element to the focus. All ancestors of focus objects will also be in the focus. Other
     * objects will be the context.
     * 
     * @param focusedObject
     *            the object to add to the focus
     */
    public void addFocus(final EObject focusedObject, final boolean addChildren) {
        if (focus != null) {
            this.focus.add(focusedObject);
        }
        // also set all children of the selection to the focus
        if (addChildren) {
            TreeIterator<EObject> iterator = focusedObject.eAllContents();
            while (iterator.hasNext()) {
                EObject child = iterator.next();
                this.focus.add(child);
            }
        }
    }

    /**
     * Add multiple elements to the focus. All ancestors of focus objects will also be in the focus.
     * Other objects will be the context.
     * 
     * @param focusedObjects
     *            the objects to add to the focus
     */
    public void addFocus(final Collection<EObject> focusedObjects, final boolean addChildren) {
        if (focusedObjects != null) {
            for (EObject focusedObject : focusedObjects) {
                addFocus(focusedObject, addChildren);
            }
        }
    }

    /*
     * Iterate all elements in the model and add all ancestors of a focus element to the focus and
     * all other elements to the context.
     */
    private void calculateTransitiveFocus() {
        // use Set as temp storage to have no problems when adding elements twice
        Set<EObject> additionalFocus = new HashSet<EObject>();
        for (EObject focusObj : focus) {
            EObject parent = focusObj.eContainer();
            while (parent != null) {
                additionalFocus.add(parent);
                parent = parent.eContainer();
            }
        }
        this.focus.addAll(additionalFocus);
        // now find the context of the model
        TreeIterator<EObject> iterator = rootElement.eAllContents();
        while (iterator.hasNext()) {
            EObject child = iterator.next();
            if (!focus.contains(child)) {
                context.add(child);
            }
        }
    }
}
