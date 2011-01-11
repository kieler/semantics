/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.graphiti;

import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.graphiti.ui.internal.parts.IPictogramElementEditPart;
import org.eclipse.graphiti.ui.internal.util.gef.ScalableRootEditPartAnimated;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.core.ui.IEditingProvider;

/**
 * Editing provider for Graphiti.
 * 
 * @author soh
 * @author msp
 */
@SuppressWarnings("restriction")
public class GraphitiEditingProvider implements IEditingProvider {

    /**
     * {@inheritDoc}
     */
    public EObject getElement(final Object object) {
        if (object instanceof IPictogramElementEditPart) {
            List<EObject> businessObjects = ((IPictogramElementEditPart) object)
                    .getPictogramElement().getLink().getBusinessObjects();
            if (!businessObjects.isEmpty()) {
                return businessObjects.get(0);
            }
        } else if (object instanceof IAdaptable) {
            IAdaptable adaptable = (IAdaptable) object;
            PictogramElement pictogramElement = (PictogramElement)
                    adaptable.getAdapter(PictogramElement.class);
            if (pictogramElement != null) {
                List<EObject> businessObjects = pictogramElement.getLink().getBusinessObjects();
                if (!businessObjects.isEmpty()) {
                    return businessObjects.get(0);
                }
            }
            return (EObject) adaptable.getAdapter(EObject.class);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public EditPart getEditPart(final Object object) {
        if (object instanceof IPictogramElementEditPart) {
            return (EditPart) object;
        } else if (object instanceof DiagramEditor) {
            return ((DiagramEditor) object).getGraphicalViewer().getContents();
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
        if (object instanceof IPictogramElementEditPart) {
            return ((IPictogramElementEditPart) object).getConfigurationProvider()
                    .getDiagramEditor().getEditingDomain();
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
        // FIXME does Graphiti have suitable layers for this?
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public ZoomManager getZoomManager(final EditPart editPart) {
        if (editPart instanceof IPictogramElementEditPart) {
            GraphicalViewer viewer = ((IPictogramElementEditPart) editPart)
                    .getConfigurationProvider().getDiagramEditor().getGraphicalViewer();
            RootEditPart rep = viewer.getRootEditPart();
            ScalableRootEditPartAnimated part = (ScalableRootEditPartAnimated) rep;
            return part.getZoomManager();
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public ISelection getSelection(final IEditorPart editorPart) {
        if (editorPart instanceof DiagramEditor) {
            return ((DiagramEditor) editorPart).getGraphicalViewer().getSelection();
        }
        return null;
    }
    
}
