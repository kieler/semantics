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
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.execution.JSONDataPool;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kivi.StateMachineSimulationTrigger.StateMachineSimulationState;

/**
 * A data component that observes the activity of syncchart states during simulation.
 * 
 * @author mmu
 * 
 */
public abstract class StateMachineKiViDataComponent extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {

    private static final int DEFAULT_STEPS = 3;

    private static final String DEFAULT_STATE_KEY = "state";

    private DiagramEditor diagramEditor;

    private Resource resource;

    private int steps;

    private String stateKey;

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
        steps = getProperties()[0].getValueAsInt();
        stateKey = getProperties()[1].getValue();
        for (DataComponentWrapper w : KiemPlugin.getDefault().getDataComponentWrapperList()) {
            if (w.getDataComponent() == this) {
                wrapper = w;
                break;
            }
        }
        if (wrapper == null) {
            throw new KiemInitializationException(
                    "Can't find wrapper for Statemachine Visualization Data Component", true, null);
        }
    }

    /**
     * {@inheritDoc}
     * 
     * Synchronized to avoid wrapup() finishing while step() still is running. This would lead to
     * bad highlighting order: wrapup() undos all highlights, then step() executes a couple of new
     * highlights that will remain active until the next simulation starts.
     */
    public synchronized void wrapup() throws KiemInitializationException {
        if (diagramEditor == null) {
            return;
        }
        if (StateActivityTrigger.getInstance() != null) {
            StateActivityTrigger.getInstance().step(null, diagramEditor);
        }
        wrapupDone = true;
        StateMachineSimulationTrigger.getInstance().stopSimulationState(diagramEditor);
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
        KiemProperty[] properties = new KiemProperty[2];
        properties[0] = new KiemProperty("history steps", DEFAULT_STEPS);
        properties[1] = new KiemProperty("state variable", DEFAULT_STATE_KEY);
        return properties;
    }

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject jSONObject) throws KiemExecutionException {
        if (diagramEditor == null) {
            return null;
        }
        // get a new simulation state that we will manipulate in the following
        StateMachineSimulationState simState = StateMachineSimulationTrigger.getInstance().getCurrentSimulationState(diagramEditor, true);
        
        JSONDataPool pool = KiemPlugin.getDefault().getExecution().getDataPool();
        long currentStep = KiemPlugin.getDefault().getExecution().getSteps();

        List<List<EObject>> statesByStep = new ArrayList<List<EObject>>();
        List<EObject> currentStepObjects = new ArrayList<EObject>();
        JSONObject currentJSONObject = jSONObject;
        try {
            for (int i = 0; i <= steps; i++) {
                if (currentJSONObject.has(stateKey)) {
                    String stateString = currentJSONObject.get(stateKey).toString();
                    String[] states = stateString.replaceAll("\\s", "").split(",");
                    for (String state : states) {
                        if (state.length() > 1) {
                            EObject active = resource.getEObject(state);
                            if (active != null) {
                                if (!contains(statesByStep, active)) { // filter out newer
                                    currentStepObjects.add(active);
                                    // haf: here add a new state to the simulation state
                                    //simState.addObject("state", i, active);
                                }
                            }
                        }
                    }
                    statesByStep.add(currentStepObjects);
                    currentStepObjects = new ArrayList<EObject>();
                }
                // add present signals to the 
                Iterator iter = currentJSONObject.keys();
                for(Object key=null; iter.hasNext(); key=iter.next()){
                    if(key instanceof String){
                        Object o = currentJSONObject.get((String)key);
                        if(JSONSignalValues.isSignalValue(o) && JSONSignalValues.isPresent(o)){
                            
                        }
                    }
                }
                
                long index = wrapper.getPoolIndex(currentStep - i - 1 + 0);
                currentJSONObject = pool.getData(null, index);
            }
            
            
            //if (StateActivityTrigger.getInstance() != null) {
                /*
                 * Synchronized to avoid wrapup() finishing while step() still is running. This
                 * would lead to bad highlighting order: wrapup() undos all highlights, then step()
                 * executes a couple of new highlights that will remain active until the next
                 * simulation starts.
                 */
                synchronized (this) {
                    if (!wrapupDone) {
                        StateMachineSimulationTrigger.getInstance().commitStep(diagramEditor);
                        //StateActivityTrigger.getInstance().step(statesByStep, diagramEditor);
                    }
                }
            //}
        } catch (JSONException e) {
            // never happens because JSON.get() is checked by JSON.has()
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
