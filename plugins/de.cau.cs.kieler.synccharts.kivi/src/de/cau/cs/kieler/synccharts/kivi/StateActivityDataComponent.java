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

import de.cau.cs.kieler.kivi.core.Viewmanagement;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.execution.JSONDataPool;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * A data component that observes the activity of syncchart states during simulation.
 * 
 * @author mmu
 * 
 */
public class StateActivityDataComponent extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {
    
    private static final int DEFAULT_STEPS = 5;

    private DiagramEditor diagramEditor;

    private Resource resource;

    private int steps;

    private DataComponentWrapper wrapper;

    /**
     * FIXME remove after devel.
     * 
     * @return fake id
     */
    public String getDataComponentId() {
        return "fakeid";
    }

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
        getActiveEditor();
        resource = ((View) diagramEditor.getDiagramEditPart().getModel()).getElement().eResource();
        steps = getProperties()[0].getValueAsInt();
        for (DataComponentWrapper w : KiemPlugin.getDefault().getDataComponentWrapperList()) {
            if (w.getDataComponent() == this) {
                wrapper = w;
                break;
            }
        }
        if (wrapper == null) {
            throw new KiemInitializationException(
                    "Can't find wrapper for State Activity Data Component", true, null);
        }
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
    public KiemProperty[] provideProperties() {
        KiemProperty[] properties = new KiemProperty[1];
        properties[0] = new KiemProperty("steps", DEFAULT_STEPS);
        return properties;
    }

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject jSONObject) throws KiemExecutionException {
        JSONDataPool pool = KiemPlugin.getDefault().getExecution().getDataPool();
        long step = KiemPlugin.getDefault().getExecution().getSteps();

        List<List<EditPart>> statesByStep = new ArrayList<List<EditPart>>();
        List<EditPart> currentStep = new ArrayList<EditPart>();
        JSONObject currentJSONObject = jSONObject;
        try {
            for (int i = 0; i <= steps; i++) {
                if (currentJSONObject.has("state")) {
                    String stateString = currentJSONObject.get("state").toString();
                    // TODO parameterize state key
                    String[] states = stateString.split(", ");
                    for (String state : states) {
                        if (state.startsWith("/")) {
                            EObject active = resource.getEObject(state);
                            if (active != null) {
                                if (!contains(statesByStep, active)) { // filter out newer
                                                                       // activities
                                    EditPart editPart = Viewmanagement.myFindEditPart(
                                            diagramEditor.getDiagramEditPart(), active);
                                    currentStep.add(editPart);
                                }
                            }
                        }
                    }
                    statesByStep.add(currentStep);
                    currentStep = new ArrayList<EditPart>();
                }
                long index = wrapper.getPoolIndex(step - i - 1 + 0);
                currentJSONObject = pool.getData(null, index);
            }
            if (StateActivityTrigger.getInstance() != null) {
                StateActivityTrigger.getInstance().step(statesByStep);
            }
        } catch (JSONException e) {
            // when no state value exists
            e.printStackTrace();
        }
        return null;
    }

    private boolean contains(final List<List<EditPart>> statesByStep, final EObject active) {
        for (List<EditPart> list : statesByStep) {
            for (EditPart e : list) {
                if (((View) e.getModel()).getElement().equals(active)) {
                    return true;
                }
            }
        }
        return false;
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
}
