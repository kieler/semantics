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
package de.cau.cs.kieler.synccharts.kivi;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

/**
 * A data component that observes the activity of syncchart states during
 * simulation.
 * 
 * @author mmu
 * 
 */
public class StateActivityDataComponent extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {

    private DiagramEditor diagramEditor;

    private Resource resource;

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
        getActiveEditor();
        resource = ((View) diagramEditor.getDiagramEditPart().getModel()).getElement().eResource();
    }

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
        if (StateActivityTrigger.getInstance() != null) {
            StateActivityTrigger.getInstance().step(null);
        }
    }

    /**
     * {@inheritDoc}
     */
    public boolean isProducer() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isObserver() {
        return true;
    }

    @Override
    public boolean isHistoryObserver() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject jSONObject) throws KiemExecutionException {
        List<EditPart> activeStates = new ArrayList<EditPart>();
        try {
            String stateString = jSONObject.get("state").toString();
            // TODO parameterize state key
            String[] states = stateString.split(", ");
            for (String state : states) {
                if (state.startsWith("/")) {
                    EObject activeState = resource.getEObject(state);
                    if (activeState != null) {
                        EditPart editPart = diagramEditor.getDiagramEditPart().findEditPart(null,
                                activeState);
                        activeStates.add(editPart);
                    }
                }
            }
            if (StateActivityTrigger.getInstance() != null) {
                StateActivityTrigger.getInstance().step(activeStates);
            }
        } catch (JSONException e) {
            // when no state value exists
            e.printStackTrace();
        }
        return null;
    }

    private void getActiveEditor() {
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                // get the active editor
                IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                IWorkbenchPage activePage = window.getActivePage();
                IEditorPart editor = activePage.getActiveEditor();
                if (editor instanceof DiagramEditor) {
                    diagramEditor = (DiagramEditor) editor;
                }
            }
        });
    }

    // TODO benchmark against modelingutil
    private EditPart myFindEditPart(final DiagramEditPart diagram, final EObject eObject) {
        EditPart found = diagram.findEditPart(null, eObject);
        if (found != null) {
            return found;
        } else {
            List<ConnectionEditPart> connections = diagram.getConnections();
            for (ConnectionEditPart connection : connections) {
                if (eObject.equals(((View) connection.getModel()).getElement())) {
                    return connection;
                }
            }
        }
        return null;
    }
}
