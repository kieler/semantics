package de.cau.cs.kieler.synccharts.viewmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeEditor;
import de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.json.JSONException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.viewmanagement.TriggerEventObject;

public class StateActivityConsumer extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {

    private KiemProperty stateVariableProperty;
    private KiemProperty editorProperty;

    EditPart rootEditPart;

    List<EditPart> lastHighligtedStates;

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent#step(de.
     * cau.cs.kieler.sim.kiem.json.JSONObject)
     */
    public JSONObject step(JSONObject data) {
        StateActivityTrigger trigger = StateActivityTrigger.instance;
        String stateVariableKey = stateVariableProperty.getValue();
        try {
            // some sanity checks
            if (trigger != null && rootEditPart != null
                    && data.has(stateVariableKey)) {
                // find all states that are active
                Object stateData = data.get(stateVariableKey);
                StringTokenizer tokenizer = new StringTokenizer(stateData
                        .toString(), " ,");
                List<EditPart> highlightedStates = new ArrayList<EditPart>();
                while (tokenizer.hasMoreElements()) {
                    String stateName = tokenizer.nextToken();
                    // notify the viewmanagement about this active state
                    TriggerEventObject triggerEvent = new TriggerEventObject();
                    EditPart affectedState = getState(stateName, rootEditPart);
                    highlightedStates.add(affectedState);
                    // a state is already highlighted
                    if(lastHighligtedStates != null && lastHighligtedStates.contains(affectedState))
                        continue;
                    triggerEvent.setAffectedObject(affectedState);
                    triggerEvent.setTriggerToggle(true);
                    trigger.notifyTrigger(triggerEvent);
                }
                // find all states that are not highlighted anymore
                if (lastHighligtedStates != null) {
                    for (EditPart editPart : highlightedStates)
                        lastHighligtedStates.remove(editPart);
                    for (EditPart editPart : lastHighligtedStates) {
                        TriggerEventObject triggerEvent = new TriggerEventObject();
                        triggerEvent.setAffectedObject(editPart);
                        triggerEvent.setTriggerToggle(false);
                        trigger.notifyTrigger(triggerEvent);
                    }
                }
                lastHighligtedStates = highlightedStates;

            }
        } catch (JSONException e) {
            /* nothing */
        } finally {
            ;
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#initialize()
     */
    public void initialize() {
        StringTokenizer tokenizer = new StringTokenizer(editorProperty
                .getValue(), " ()");
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
                        rootEditPart = ((DiagramEditor) editor)
                                .getDiagramEditPart();
                    }
                }
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isObserver()
     */
    public boolean isObserver() {
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isProducer()
     */
    public boolean isProducer() {
        return false;
    }
      
    /*
     * (non-Javadoc)
     * 
     * @see
     * de.cau.cs.kieler.sim.kiem.extension.DataComponent#initializeProperties()
     */
    @Override
    public KiemProperty[] initializeProperties() {
        KiemProperty[] properties = new KiemProperty[2];
        properties[0] = new KiemProperty("state variable", "state");
        this.stateVariableProperty = properties[0];
        properties[1] = new KiemProperty("editor",
                new KiemPropertyTypeEditor(), "");
        this.editorProperty = properties[1];
        return properties;
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#wrapup()
     */
    public void wrapup() {
        // TODO Auto-generated method stub
    }

    /**
     * Recursively search an EditPart for the corresponding model object with
     * the given name. The model is required to be a State object and it will
     * return null if the name is not found. It will do a DFS and return the
     * first EditPart with the named condition found.
     * 
     * @param name
     *            String name of the state
     * @param parent
     *            The parent to start the search
     * @return the found EditPart or null
     */
    public static EditPart getState(String name, EditPart parent) {
        List children = parent.getChildren();
        for (Object child : children) {
            if (child instanceof ShapeEditPart) {
                View view = (View) ((ShapeEditPart) child).getModel();
                EObject model = view.getElement();
                if (model instanceof State) {
                    if (((State) model).getName().equals(name))
                        return (ShapeEditPart) child;
                }
            }
            // if node was not found yet, search recursively
            if (child instanceof EditPart) {
                EditPart result = getState(name, (EditPart) child);
                if (result != null)
                    return result;
            }
        }
        // we did not find anything in this trunk
        return null;
    }

}
