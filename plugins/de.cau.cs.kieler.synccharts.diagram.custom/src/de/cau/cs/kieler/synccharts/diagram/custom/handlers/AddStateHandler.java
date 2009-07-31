/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
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
package de.cau.cs.kieler.synccharts.diagram.custom.handlers;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.handlers.HandlerUtil;

import de.cau.cs.kieler.synccharts.diagram.edit.parts.Region2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionStateCompartmentEditPart;
import de.cau.cs.kieler.synccharts.diagram.providers.SyncchartsElementTypes;

/**
 * 
 * @author msp
 */
public class AddStateHandler extends AbstractHandler implements IHandler {

    /** last compartment to which a state was added */
    private GraphicalEditPart lastEditCompartment;
    /** view adapter for the last edited compartment */
    private IAdaptable stateViewAdapter;
    
    /* (non-Javadoc)
     * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
     */
    public Object execute(ExecutionEvent event) throws ExecutionException {
        lastEditCompartment = null;
        IStructuredSelection selection = (IStructuredSelection)HandlerUtil.getActiveMenuSelection(event);
        if (selection == null)
            selection = (IStructuredSelection)HandlerUtil.getCurrentSelection(event);
        if (selection != null) {
            
            // add a state to each selected region
            Iterator<?> selectionIter = selection.iterator();
            while (selectionIter.hasNext()) {
                Object nextObj = selectionIter.next();
                if (nextObj instanceof RegionEditPart
                        || nextObj instanceof Region2EditPart) {
                    addState((GraphicalEditPart)nextObj);
                }
                else if (nextObj instanceof RegionStateCompartmentEditPart) {
                    EditPart parent = ((EditPart)nextObj).getParent();
                    if (parent instanceof RegionEditPart
                            || parent instanceof Region2EditPart) {
                        addState((GraphicalEditPart)parent);
                    }
                }
            }
            
            if (lastEditCompartment != null) {
                // set the new State into edit mode
                final EditPartViewer viewer = lastEditCompartment.getViewer();
                final EditPart elementPart = (EditPart) viewer.getEditPartRegistry()
                        .get(stateViewAdapter.getAdapter(View.class));
                if (elementPart != null) {
                    Display.getCurrent().asyncExec(new Runnable() {
                        public void run() {
                            viewer.setSelection(new StructuredSelection(elementPart));
                            Request der = new Request(RequestConstants.REQ_DIRECT_EDIT);
                            elementPart.performRequest(der);
                        }
                    });
                }
            }
        }
        return null;
    }
    
    /**
     * Adds a state to the given region.
     * 
     * @param regionEditPart region to which a state shall be added
     */
    private void addState(GraphicalEditPart regionEditPart) {
        IElementType elementType = regionEditPart instanceof RegionEditPart
                ? SyncchartsElementTypes.State_2002
                : SyncchartsElementTypes.State_3010;
        
        // find the region compartment
        GraphicalEditPart compartment = null;
        Iterator<?> compartmentIter = regionEditPart.getChildren().iterator();
        while (compartmentIter.hasNext()) {
            EditPart editPart = (EditPart)compartmentIter.next();
            if (editPart instanceof RegionStateCompartmentEditPart) {
                compartment = (GraphicalEditPart)editPart;
                break;
            }
        }
        
        // The diagram root does not have a compartment, but holds the state itself
        if (compartment == null) {
            compartment = regionEditPart;
        }
        
        // create the new State
        CreateViewRequest stateRequest = CreateViewRequestFactory.getCreateShapeRequest(
                elementType, regionEditPart.getDiagramPreferencesHint());
        Command createStateCmd = compartment.getCommand(stateRequest);
        stateViewAdapter = (IAdaptable)((List<?>)stateRequest.getNewObject()).get(0);
        compartment.getDiagramEditDomain().getDiagramCommandStack().execute(createStateCmd);
        lastEditCompartment = compartment;
    }

}
