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
package de.cau.cs.kieler.kvid.visual.complex;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.util.ViewType;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.EditorPart;

/**
 * @author jjc
 *
 */
public class ScopeNodeHandler extends AbstractHandler {

    /* (non-Javadoc)
     * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
     */
    public Object execute(ExecutionEvent event) throws ExecutionException {
        
        ISelection selection;
        ShapeEditPart targetEditPart = null;
        selection = HandlerUtil.getActiveMenuSelection(event);
        if (selection == null) {
            selection = HandlerUtil.getCurrentSelection(event);
        }
        if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
            IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            if (structuredSelection.getFirstElement() instanceof IGraphicalEditPart) {
                targetEditPart = (ShapeEditPart) structuredSelection.getFirstElement();
            }
        }
        
        IEditorPart editor = HandlerUtil.getActiveEditor(event);
        
        if (editor instanceof DiagramEditor) {
            DiagramEditor diagEditor = (DiagramEditor) editor;
            
            IElementType DATA_NODE = ElementTypeRegistry.getInstance().getType(
                "de.cau.cs.kieler.kvid.visual.complex.datanode");
                CreateViewRequest createScopeRequest = CreateViewRequestFactory
                                                        .getCreateShapeRequest(DATA_NODE,
                                                                PreferencesHint.USE_DEFAULTS);
            createScopeRequest.setLocation(targetEditPart.getLocation());
            
            Command createDisplayCommand = targetEditPart.getParent().getCommand(createScopeRequest);
            CompositeCommand noteAttachmentCC = new CompositeCommand("Create a note attachment");

            @SuppressWarnings("rawtypes")
            IAdaptable noteViewAdapter =
                (IAdaptable) ((List) createScopeRequest.getNewObject()).get(0);
            
            noteAttachmentCC.compose(
                    new DeferredCreateConnectionViewCommand(targetEditPart.getEditingDomain(),
                            ViewType.NOTEATTACHMENT,
                            noteViewAdapter,
                            new EObjectAdapter((EObject) targetEditPart.getModel()),
                            diagEditor.getDiagramGraphicalViewer(),
                            PreferencesHint.USE_DEFAULTS));
            
            CompoundCommand cc = new CompoundCommand();
            cc.add(createDisplayCommand);
            cc.add(new ICommandProxy(noteAttachmentCC));
            diagEditor.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
        }
        return null;
    }

}
