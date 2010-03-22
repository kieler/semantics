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
package de.cau.cs.kieler.synccharts.viewmanagement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.core.model.util.ModelingUtil;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeEditor;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.diagram.custom.HighlightingManager;

/**
 * @author soh
 */
public class SimpleHighlighter extends JSONObjectDataComponent {

    private EditPart getActiveEditorEditPart() {
        EditPart result = null;
        IDiagramWorkbenchPart part = getActiveEditor();
        if (part != null) {
            result = part.getDiagramEditPart();
        }
        return result;
    }

    private IDiagramWorkbenchPart getActiveEditor() {
        IDiagramWorkbenchPart result = null;
        try {
            IEditorPart editor = PlatformUI.getWorkbench()
                    .getActiveWorkbenchWindow().getActivePage()
                    .getActiveEditor();
            result = ((IDiagramWorkbenchPart) editor);
        } catch (NullPointerException e0) {

        } catch (ClassCastException e0) {

        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject data) throws KiemExecutionException {
        String stateVariableKey = this.getProperties()[1].getValue();
        EditPart rootEditPart = getActiveEditorEditPart();
        HighlightingManager.reset(getActiveEditor());
        // some sanity checks
        if (rootEditPart != null && data.has(stateVariableKey)) {
            try {
                // find all states that are active
                Object stateData = data.get(stateVariableKey);

                StringTokenizer tokenizer = new StringTokenizer(stateData
                        .toString(), " ,");
                List<EditPart> highlightedStates = new ArrayList<EditPart>();

                // remember what states already were considered
                LinkedList<String> consideredStates = new LinkedList<String>();

                while (tokenizer.hasMoreElements()) {
                    String stateName = tokenizer.nextToken();

                    // check if this is a new state (no duplicate)
                    boolean newState = true;
                    for (String consideredState : consideredStates) {
                        if (consideredState.equals(stateName)) {
                            newState = false;
                            break;
                        }
                    }
                    if (!newState) {
                        // do not consider already considered states
                        continue;
                    }
                    // add to considered states
                    consideredStates.add(stateName);

                    // notify the viewmanagement about this active state
                    EditPart affectedState = getEditPart(stateName,
                            rootEditPart);

                    if (affectedState == null) {
                        continue;
                    }

                    highlightedStates.add(affectedState);
                    // a state is already highlighted
                    System.out.println("VIEW MANAGEMENT:" + stateName);

                }

                for (EditPart editPart : highlightedStates) {
                    HighlightingManager.highlight(getActiveEditor(), editPart,
                            ColorConstants.red, null);
                }
            } catch (JSONException e0) {
                e0.printStackTrace();
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
    }

    /**
     * {@inheritDoc}
     */
    public boolean isObserver() {
        return true;
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
    public void wrapup() throws KiemInitializationException {
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.cau.cs.kieler.sim.kiem.extension.DataComponent#initializeProperties()
     */
    @Override
    public KiemProperty[] provideProperties() {
        KiemProperty[] properties = new KiemProperty[2];
        properties[0] = new KiemProperty("SyncChart Editor",
                new KiemPropertyTypeEditor(), "");
        properties[1] = new KiemProperty("highlight key", "state");
        return properties;
    }

    @SuppressWarnings("unchecked")
    public EditPart getEditPart(String elementURIFragment, EditPart parent) {
        // cache turned off, EditParts seem to be volatile
        // if (cachedEditParts == null) {
        // // if hashmap is not initialized, create it
        // cachedEditParts = new HashMap<String,EditPart>();
        // cachedElementURIs = new HashMap<EditPart,String>();
        // }
        // else {
        // //try to get from hashmap first
        // if (cachedEditParts.containsKey(elementURIFragment))
        // return cachedEditParts.get(elementURIFragment);
        // }

        try {
            List<EditPart> children = parent.getChildren();
            EObject modelElem = ((View) parent.getModel()).getElement();
            if (modelElem instanceof State) {
                State state = (State) modelElem;
                for (Transition t : state.getOutgoingTransitions()) {
                    if (t.equals(t.eResource().getEObject(elementURIFragment))) {
                        EditPart part = ModelingUtil.getEditPart(t, parent);
                        // then return
                        return part;
                    }
                }
            }
            for (Object child : children) {
                if (child instanceof ShapeEditPart) {
                    View view = (View) ((ShapeEditPart) child).getModel();
                    EObject modelElement = view.getElement();
                    if (modelElement.equals(modelElement.eResource()
                            .getEObject(elementURIFragment))) {
                        // then return
                        return (ShapeEditPart) child;
                    }

                }
                // if node was not found yet, search recursively
                if (child instanceof EditPart) {
                    EditPart result = getEditPart(elementURIFragment,
                            (EditPart) child);
                    if (result != null) {
                        return result;
                    }
                }
            }
        } catch (Exception e) {
            return null;
        }
        // we did not find anything in this trunk
        return null;
    }

}
