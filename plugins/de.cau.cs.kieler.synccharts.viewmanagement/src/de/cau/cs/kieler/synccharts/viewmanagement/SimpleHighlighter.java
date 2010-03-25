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
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeEditor;
import de.cau.cs.kieler.synccharts.diagram.custom.HighlightingManager;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Region2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.State2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;
import de.cau.cs.kieler.viewmanagement.RunLogic;

/**
 * @author soh
 */
public class SimpleHighlighter extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {

    private DiagramEditPart rootEditPart;
    private DiagramEditor editor;

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject data) throws KiemExecutionException {
        String stateVariableKey = this.getProperties()[1].getValue();
        String disco = this.getProperties()[2].getValue();
        HighlightingManager.lockedReset(editor);
        // some sanity checks
        if (rootEditPart != null && data.has(stateVariableKey)) {
            try {
                // find all states that are active
                Object stateData = data.get(stateVariableKey);

                StringTokenizer tokenizer = new StringTokenizer(stateData
                        .toString(), " ,");
                List<EditPart> highlightedStates = new ArrayList<EditPart>();

                while (tokenizer.hasMoreElements()) {
                    String stateName = tokenizer.nextToken();

                    EditPart affectedState = getEditPart(stateName,
                            rootEditPart);

                    if (affectedState == null) {
                        continue;
                    }

                    highlightedStates.add(affectedState);
                }

                for (EditPart editPart : highlightedStates) {
                    HighlightingManager.lockedHighlight(editor, editPart,
                            getColor(disco.equalsIgnoreCase("true")), null);
                }
            } catch (JSONException e0) {
                e0.printStackTrace();
            }
        }
        return null;
    }

    /**
     * Get the color for the given state or transition.
     * 
     * @param isDisco
     *            true if the disco modus should be on
     * @return the color
     */
    private Color getColor(final boolean isDisco) {
        if (!isDisco) {
            return ColorConstants.red;
        }
        Device device = ColorConstants.red.getDevice();
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        return new Color(device, red, green, blue);
    }

    DiagramEditor getInputEditor() {
        String kiemEditorProperty = this.getProperties()[0].getValue();
        DiagramEditor diagramEditor = null;

        // get the active editor as a default case (if property is empty)
        IWorkbenchPage activePage = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow().getActivePage();
        IEditorPart editor = activePage.getActiveEditor();
        if (editor instanceof DiagramEditor) {
            diagramEditor = (DiagramEditor) editor;
        }

        // only check non-empty and valid property (this is optional)
        if (!kiemEditorProperty.equals("")) {
            if (getEditor(kiemEditorProperty) != null) {
                diagramEditor = getEditor(kiemEditorProperty);
            }
        }
        return diagramEditor;
    }

    DiagramEditor getEditor(String kiemEditorProperty) {
        if ((kiemEditorProperty == null) || (kiemEditorProperty.length() == 0)) {
            return null;
        }

        StringTokenizer tokenizer = new StringTokenizer(kiemEditorProperty,
                " ()");
        if (tokenizer.hasMoreTokens()) {
            String fileString = tokenizer.nextToken();
            String editorString = tokenizer.nextToken();

            IEditorReference[] editorRefs = PlatformUI.getWorkbench()
                    .getActiveWorkbenchWindow().getActivePage()
                    .getEditorReferences();
            for (int i = 0; i < editorRefs.length; i++) {
                if (editorRefs[i].getId().equals(editorString)) {
                    IEditorPart editor = editorRefs[i].getEditor(true);
                    if (editor instanceof DiagramEditor) {
                        // test if correct file
                        if (fileString.equals(editor.getTitle())) {
                            return (DiagramEditor) editor;
                            // rootEditPart = ((DiagramEditor) editor)
                            // .getDiagramEditPart();
                            // break;
                        }
                    }
                }
            }
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#initialize()
     */
    public void initialize() throws KiemInitializationException {
        try {
            // bring to front VM
            editor = getInputEditor();
            rootEditPart = editor.getDiagramEditPart();
            if (RunLogic.getInstance() == null) {
                throw new KiemInitializationException(
                        "Cannot initialize view management!", true, null);
            }
            RunLogic.getInstance().registerListeners();
            HighlightingManager.lock();
        } catch (Exception e) {
            throw new KiemInitializationException(
                    "Cannot initialize view management!", true, e);
        }
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
        HighlightingManager.unlock();
        HighlightingManager.reset(editor);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.cau.cs.kieler.sim.kiem.extension.DataComponent#initializeProperties()
     */
    @Override
    public KiemProperty[] provideProperties() {
        KiemProperty[] properties = new KiemProperty[3];
        properties[0] = new KiemProperty("SyncChart Editor",
                new KiemPropertyTypeEditor(), "");
        properties[1] = new KiemProperty("highlight key", "state");
        properties[2] = new KiemProperty("disco", "false");
        return properties;
    }

    /**
     * Get the edit part from the URI.
     * 
     * @param elementURIFragment
     *            the fragment
     * @param parent
     *            the parent
     * @return the edit part
     */
    public EditPart getEditPart(String elementURIFragment, EditPart parent) {
        try {
            Collection<?> parts = parent.getViewer().getEditPartRegistry()
                    .values();
            for (Object o : parts) {
                if (o instanceof TransitionEditPart
                        || o instanceof State2EditPart
                        || o instanceof StateEditPart
                        || o instanceof Region2EditPart
                        || o instanceof RegionEditPart) {
                    EObject eObject = ((View) ((EditPart) o).getModel())
                            .getElement();
                    if (eObject.equals(eObject.eResource().getEObject(
                            elementURIFragment))) {
                        return (EditPart) o;
                    }
                }
            }
        } catch (Exception e) {
            return null;
        }
        // we did not find anything in this trunk
        return null;
    }

    // "//@innerStates.0/@regions.0/@innerStates.0/@outgoingTransitions.1, //@innerStates.0/@regions.0/@innerStates.0/@regions.0/@innerStates.0/@outgoingTransitions.0, //@innerStates.0/@regions.0/@innerStates.0/@regions.0/@innerStates.0/@regions.0/@innerStates.0/@outgoingTransitions.0, //@innerStates.0/@regions.0/@innerStates.0/@regions.0/@innerStates.0/@regions.1/@innerStates.0/@outgoingTransitions.0, //@innerStates.0/@regions.0/@innerStates.0/@outgoingTransitions.0"

}
