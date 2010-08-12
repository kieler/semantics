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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.util.ViewType;
import org.eclipse.gmf.runtime.diagram.ui.actions.AttachShapeAction;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IEditableEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.INodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.ui.IWorkbenchPage;

/**
 * @author jjc
 * @deprecated use ScopeNodeHandler instead
 */
public class AddDataDisplayAction extends AttachShapeAction {

    protected int bal;
    /**
     * @param workbenchPage The referred workbench page
     */
    public AddDataDisplayAction(final IWorkbenchPage workbenchPage) {
        super(workbenchPage);
    }
    
    /* (non-Javadoc)
     * @see org.eclipse.gmf.runtime.diagram.ui.actions.DiagramAction#calculateEnabled()
     */
    protected boolean calculateEnabled() {
            if (getSelectedObjects().isEmpty()) {
                    return false;
            }
            List parts = getSelectedObjects();
            if (parts.size() > 1) {
                return false;
            }
            for (int i = 0; i < parts.size(); i++) {
                    Object o = parts.get(i);
                    if (!(o instanceof INodeEditPart)) {
                            return false;
                    } else {
                            INodeEditPart nodeEditPart = (INodeEditPart) o;
                            if (!(nodeEditPart.canAttachNote())) {
                                    return false;
                            }
                            
                            // consider edit mode of selected edit part
                            if (nodeEditPart instanceof IEditableEditPart
                                            && !((IEditableEditPart) nodeEditPart)
                                                            .isEditModeEnabled()) {
                                    return false;
                            }

                            // consider edit mode of selected edit part's container
                            EditPart parentPart = nodeEditPart.getParent();
                            if (parentPart instanceof IEditableEditPart
                                            && !((IEditableEditPart) parentPart)
                                                            .isEditModeEnabled()) {
                                    return false;
                            }
                            
                    }
            }
            return true;
    }
    
    /* (non-Javadoc)
     * @see org.eclipse.gmf.runtime.
     * diagram.ui.actions.DiagramAction#doRun(org.eclipse.core.runtime.IProgressMonitor)
     */
    @SuppressWarnings("rawtypes")
    @Override
    protected void doRun(final IProgressMonitor progressMonitor) {
        List selectedEditParts = getSelectedObjects();
        IDiagramWorkbenchPart editor = getDiagramWorkbenchPart();
        
        IElementType DATA_NODE = ElementTypeRegistry.getInstance().getType(
            "de.cau.cs.kieler.kvid.visual.complex.datanode");
            CreateViewRequest createDisplayRequest = CreateViewRequestFactory
                                                    .getCreateShapeRequest(DATA_NODE,
                                                            PreferencesHint.USE_DEFAULTS);
        createDisplayRequest.setLocation(getLocation(selectedEditParts));
        
        Command createDisplayCommand = editor.getDiagramEditPart().getCommand(createDisplayRequest);
        CompositeCommand noteAttachmentCC = new CompositeCommand(getToolTipText());
        
        IAdaptable noteViewAdapter =
            (IAdaptable) ((List) createDisplayRequest.getNewObject()).get(0);
        
        IGraphicalEditPart targetEditPart = (IGraphicalEditPart) selectedEditParts.get(0);
        
        noteAttachmentCC.compose(
                new DeferredCreateConnectionViewCommand(targetEditPart.getEditingDomain(),
                        ViewType.NOTEATTACHMENT,
                        noteViewAdapter,
                        new EObjectAdapter((EObject) targetEditPart.getModel()),
                        editor.getDiagramGraphicalViewer(),
                        getPreferencesHint()));
        
        CompoundCommand cc = new CompoundCommand();
        cc.add(createDisplayCommand);
        cc.add(new ICommandProxy(noteAttachmentCC));
        editor.getDiagramEditDomain().getDiagramCommandStack().execute(cc);
    }

}
