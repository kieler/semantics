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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.render.editparts.RenderedDiagramRootEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.core.ui.IEditingProvider;

/**
 * Domain model element provider for GMF.
 *
 * @author msp
 */
public class GmfEditingProvider implements IEditingProvider {

    /**
     * Finds the diagram edit part of an edit part.
     * 
     * @param editPart an edit part
     * @return the diagram edit part, or {@code null} if there is no containing diagram
     *     edit part
     */
    public static DiagramEditPart getDiagramEditPart(final EditPart editPart) {
        EditPart ep = editPart;
        while (ep != null && !(ep instanceof DiagramEditPart) && !(ep instanceof RootEditPart)) {
            ep = ep.getParent();
        }
        if (ep instanceof RootEditPart) {
            RootEditPart root = (RootEditPart) ep;
            ep = null;
            for (Object child : root.getChildren()) {
                if (child instanceof DiagramEditPart) {
                    ep = (EditPart) child;
                }
            }
        }
        return (DiagramEditPart) ep;
    }
    
    /**
     * {@inheritDoc}
     */
    public EObject getElement(final Object object) {
        if (object instanceof IGraphicalEditPart) {
            return ((IGraphicalEditPart) object).getNotationView().getElement();
        } else if (object instanceof View) {
            return ((View) object).getElement();
        } else if (object instanceof IAdaptable) {
            IAdaptable adaptable = (IAdaptable) object;
            View view = (View) adaptable.getAdapter(View.class);
            if (view != null) {
                return view.getElement();
            }
            return (EObject) adaptable.getAdapter(EObject.class);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public EditPart getEditPart(final Object object) {
        if (object instanceof CompartmentEditPart) {
            return ((CompartmentEditPart) object).getParent();
        } else if (object instanceof IGraphicalEditPart) {
            return (IGraphicalEditPart) object;
        } else if (object instanceof DiagramEditor) {
            return ((DiagramEditor) object).getDiagramEditPart();
        } else if (object instanceof IAdaptable) {
            IAdaptable adaptable = (IAdaptable) object;
            return (EditPart) adaptable.getAdapter(EditPart.class);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public TransactionalEditingDomain getEditingDomain(final Object object) {
        if (object instanceof IGraphicalEditPart) {
            return ((IGraphicalEditPart) object).getEditingDomain();
        } else if (object instanceof IAdaptable) {
            IAdaptable adaptable = (IAdaptable) object;
            return (TransactionalEditingDomain) adaptable.getAdapter(TransactionalEditingDomain.class);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public IFigure getDrawingLayer(final EditPart editPart) {
        DiagramEditPart diagramEditPart = getDiagramEditPart(editPart);
        if (diagramEditPart != null) {
            return diagramEditPart.getLayer(DiagramRootEditPart.PAGE_BREAKS_LAYER);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public ZoomManager getZoomManager(final EditPart editPart) {
        DiagramEditPart diagramEditPart = getDiagramEditPart(editPart);
        if (diagramEditPart != null) {
            return ((RenderedDiagramRootEditPart) diagramEditPart.getRoot()).getZoomManager();
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public ISelection getSelection(final IEditorPart editorPart) {
        if (editorPart instanceof DiagramEditor) {
            return ((DiagramEditor) editorPart).getDiagramGraphicalViewer().getSelection();
        }
        return null;
    }

}
