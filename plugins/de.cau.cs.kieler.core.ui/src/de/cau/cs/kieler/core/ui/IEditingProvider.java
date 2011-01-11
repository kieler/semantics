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
package de.cau.cs.kieler.core.ui;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;

/**
 * Interface for providers of graphical editing features. This can be used to connect code that
 * is independent of specific editor frameworks to frameworks such as GMF.
 *
 * @author msp
 */
public interface IEditingProvider {

    /**
     * Retrieve the domain model element from the given object.
     * 
     * @param object a selectable object, such as an edit part
     * @return the domain model element, or {@code null} if there is none
     */
    EObject getElement(Object object);
    
    /**
     * Returns the relevant edit part for the given object. If a diagram editor
     * part is passed, then the return value is the corresponding diagram edit part.
     * If an edit part is passed, it is filtered in such a way that the most relevant
     * related edit part is returned; e.g. for a compartment edit part the containing
     * node edit part is returned.
     * 
     * @param object an editor part or edit part
     * @return the relevant edit part, or {@code null} if the passed object cannot
     *     be handled
     */
    EditPart getEditPart(Object object);
    
    /**
     * Retrieve the editing domain for model changes of the given object.
     * 
     * @param object a selectable object, such as an edit part
     * @return the transactional editing domain, or {@code null} if there is none
     */
    TransactionalEditingDomain getEditingDomain(Object object);
    
    /**
     * Returns a layer figure for the associated diagram that can be used to draw
     * additional information.
     * 
     * @param editPart an edit part from a graphical diagram
     * @return a drawing layer
     */
    IFigure getDrawingLayer(EditPart editPart);
    
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
     * @param editorPart an editor part
     * @return the current selection, or {@code null} if the selection cannot
     *     be determined
     */
    ISelection getSelection(IEditorPart editorPart);
    
}
