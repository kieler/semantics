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
package de.cau.cs.kieler.core.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Interface for bridges to graphical editing frameworks. This can be used to connect code that
 * is independent of specific editor frameworks to frameworks such as GMF.
 *
 * @author msp
 */
public interface IGraphicalFrameworkBridge {

    /**
     * Determine whether this bridge supports the given object.
     * 
     * @param object an edit part, editor part, or notational object
     * @return true if this bridge supports the given object
     */
    boolean supports(Object object);
    
    /**
     * Retrieve the domain model element from the given object.
     * 
     * @param object a selectable object, such as an edit part
     * @return the domain model element, or {@code null} if there is none
     */
    EObject getElement(Object object);
    
    /**
     * Retrieve the notational model element from the given object. The kind of notational
     * element depends on the specific graphical framework.
     * 
     * @param object a selectable object, such as an edit part
     * @return the notational model element, or {@code null} if there is none
     */
    EObject getNotationElement(Object object);
    
    /**
     * Returns the relevant edit part for the given object. If a diagram editor
     * part is passed, then the return value is the corresponding diagram edit part.
     * If an edit part is passed, it is filtered in such a way that the most relevant
     * related edit part is returned; e.g. for a compartment edit part the containing
     * node edit part is returned. If a model element is passed, the most relevant
     * edit part in the active editor is returned.
     * 
     * @param object an editor part, edit part, notational object, or model element
     * @return the relevant edit part, or {@code null} if the passed object cannot
     *     be handled
     */
    EditPart getEditPart(Object object);
    
    /**
     * Returns the relevant edit part for the given object. If a model element is passed,
     * the most relevant edit part in the given editor is returned.
     * 
     * @param editorPart a workbench part containing a diagram
     * @param object an edit part, notational object, or model element
     * @return the relevant edit part, or {@code null} if the passed object cannot
     *     be handled
     */
    EditPart getEditPart(IWorkbenchPart editorPart, Object object);
    
    /**
     * Retrieve the editing domain for model changes of the given object.
     * 
     * @param object a selectable object, such as an edit part
     * @return the transactional editing domain, or {@code null} if there is none
     */
    EditingDomain getEditingDomain(Object object);
    
    /**
     * Returns a zoom manager for the associated diagram.
     * 
     * @param editPart an edit part from a graphical diagram
     * @return a zoom manager
     */
    ZoomManager getZoomManager(EditPart editPart);
    
    /**
     * Returns the current selection for the given editor part.
     * 
     * @param workbenchPart a workbench part containing a diagram
     * @return the current selection, or {@code null} if the selection cannot
     *     be determined
     */
    ISelection getSelection(IWorkbenchPart workbenchPart);
    
    /**
     * Set the current selection to the given edit part.
     * 
     * @param editPart an edit part
     */
    void setSelection(final EditPart editPart);
    
}
