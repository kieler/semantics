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
package de.cau.cs.kieler.sim.kivi;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.execution.JSONDataPool;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * A data component that observes the activity (active and error states and transitions)
 *  of SyncCharts during simulation.
 * 
 * @author mmu, cmot
 * 
 */
public abstract class KiViDataComponent extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {

    private static final int DEFAULT_STEPS = 0; // changed by cmot upon rvh's request

    private static final String DEFAULT_STATE_KEY = "state";

    private static final String DEFAULT_TRANSITION_KEY = "transition";

    private static final String DEFAULT_ERROR_STATE_KEY = "errorState";

    private static final String DEFAULT_ERROR_TRANSITION_KEY = "errorTransition";

    
    private DiagramEditor diagramEditor;

    private Resource resource;

    private int steps;

    private String stateKey;

    private String transitionKey;

    private String errorStateKey;

    private String errorTransitionKey;
    
    private DataComponentWrapper wrapper;

    /** Remember when wrapup() was executed. */
    private boolean wrapupDone = false;

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
        synchronized (this) {
            wrapupDone = false;
        }
        diagramEditor = getActiveEditor();
        if (diagramEditor == null) {
            return;
        }
        resource = ((View) diagramEditor.getDiagramEditPart().getModel()).getElement().eResource();
        stateKey = getProperties()[0].getValue();
        transitionKey = getProperties()[1].getValue();
        errorStateKey = getProperties()[2].getValue();
        errorTransitionKey = getProperties()[3].getValue();
        steps = getProperties()[4].getValueAsInt();
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
     * 
     */
    public void wrapup() throws KiemInitializationException {
        if (diagramEditor == null) {
            return;
        }
        if (StateActivityTrigger.getInstance() != null) {
            StateActivityTrigger.getInstance().synchronizedStep(null, null, diagramEditor);
        }
        wrapupDone = true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isProducer() {
         return false;
        //return true;
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
        KiemProperty[] properties = new KiemProperty[5];
        properties[0] = new KiemProperty("State Name", DEFAULT_STATE_KEY);
        properties[1] = new KiemProperty("Transition Name", DEFAULT_TRANSITION_KEY);
        properties[2] = new KiemProperty("Error State Name", DEFAULT_ERROR_STATE_KEY);
        properties[3] = new KiemProperty("Error Transition Name", DEFAULT_ERROR_TRANSITION_KEY);
        properties[4] = new KiemProperty("History Steps", DEFAULT_STEPS);
        return properties;
    }

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject jSONObject) throws KiemExecutionException {
        if (diagramEditor == null) {
            return null;
        }
        // only do this if execution is currently active
        if (KiemPlugin.getDefault().getExecution() != null) {
            JSONDataPool pool = KiemPlugin.getDefault().getExecution().getDataPool();
            long currentStep = KiemPlugin.getDefault().getExecution().getSteps();

            List<List<EObject>> statesByStep = new ArrayList<List<EObject>>();
            List<List<EObject>> errorStatesByStep = new ArrayList<List<EObject>>();
            List<EObject> currentStepObjects = new ArrayList<EObject>();
            List<EObject> currentErrorStepObjects = new ArrayList<EObject>();
            JSONObject currentJSONObject = jSONObject;
            try {
                for (int i = 0; i <= steps; i++) {
                	// ACTIVE STATES AND TRANSITIONS
                    if (currentJSONObject.has(stateKey)) {
                        String stateString = currentJSONObject.get(stateKey).toString();
                        String[] states = stateString.replaceAll("\\s", "").split(",");
                        for (String state : states) {
                            if (state.length() > 1) {
                                EObject active = resource.getEObject(state);
                                if (active != null) {
                                    if (!contains(statesByStep, active)) { // filter out newer
                                        currentStepObjects.add(active);
                                    }
                                }
                            }
                        }
                    }
                    if (currentJSONObject.has(transitionKey)) {
                        String stateString = currentJSONObject.get(transitionKey).toString();
                        String[] states = stateString.replaceAll("\\s", "").split(",");
                        for (String state : states) {
                            if (state.length() > 1) {
                                EObject active = resource.getEObject(state);
                                if (active != null) {
                                    if (!contains(statesByStep, active)) { // filter out newer
                                        currentStepObjects.add(active);
                                    }
                                }
                            }
                        }
                    }
                    
                    // ERROR STATES AND ERROR TRANSITIONS
                    if (currentJSONObject.has(errorStateKey)) {
                        String stateString = currentJSONObject.get(errorStateKey).toString();
                        String[] states = stateString.replaceAll("\\s", "").split(",");
                        for (String state : states) {
                            if (state.length() > 1) {
                                EObject errorState = resource.getEObject(state);
                                if (errorState != null) {
                                    if (!contains(errorStatesByStep, errorState)) { // filter out newer
                                    	currentErrorStepObjects.add(errorState);
                                    }
                                }
                            }
                        }
                    }
                    if (currentJSONObject.has(errorTransitionKey)) {
                        String stateString = currentJSONObject.get(errorTransitionKey).toString();
                        String[] states = stateString.replaceAll("\\s", "").split(",");
                        for (String state : states) {
                            if (state.length() > 1) {
                                EObject errorState = resource.getEObject(state);
                                if (errorState != null) {
                                    if (!contains(errorStatesByStep, errorState)) { // filter out newer
                                    	currentErrorStepObjects.add(errorState);
                                    }
                                }
                            }
                        }
                    }
                    
                    // redeclare/reset for the next step (save history)
                    if (currentJSONObject.has(stateKey) || currentJSONObject.has(transitionKey)) {
                        statesByStep.add(currentStepObjects);
                        errorStatesByStep.add(currentErrorStepObjects);
                        currentErrorStepObjects = new ArrayList<EObject>();
                        currentStepObjects = new ArrayList<EObject>();
                    }
                    long index = wrapper.getPoolIndex(currentStep - i - 1 + 0);
                    currentJSONObject = pool.getData(null, index);
                }
                if (StateActivityTrigger.getInstance() != null) {
                    if (!wrapupDone) {
                        // StateActivityTrigger.getInstance().step(statesByStep, diagramEditor);

                        /*
                         * performing a synchronized triggering of the KiVi trigger. This will block
                         * until all effects have finished executing that are caused by this
                         * triggering. This way we create back pressure from the effects to KIEM.
                         */
                        StateActivityTrigger.getInstance().synchronizedStep(statesByStep, errorStatesByStep,
                                diagramEditor);
                    }
                }
            } catch (JSONException e) {
                // never happens because JSON.get() is checked by JSON.has()
            }
        }
        return null;
    }

    private boolean contains(final List<List<EObject>> statesByStep, final EObject active) {
        for (List<EObject> list : statesByStep) {
            for (EObject e : list) {
                if (e.equals(active)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected abstract DiagramEditor getActiveEditor();
}
