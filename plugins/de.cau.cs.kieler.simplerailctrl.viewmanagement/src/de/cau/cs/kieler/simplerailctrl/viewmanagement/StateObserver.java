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
 * 
 *****************************************************************************/

package de.cau.cs.kieler.simplerailctrl.viewmanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import de.cau.cs.kieler.viewmanagement.TriggerEventObject;

/**
 * An asynchronous update interface for receiving notifications
 * about State information as the State is constructed.
 */
public class StateObserver extends JSONObjectDataComponent implements
		IJSONObjectDataComponent {

    EditPart rootEditPart;
    List<EditPart> lastHighligtedStates;

	//-------------------------------------------------------------------------
    
	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent#step(de.cau.cs.kieler.sim.kiem.json.JSONObject)
	 */
	public JSONObject step(JSONObject data) {
        StateTrigger trigger = StateTrigger.getInstance();
        String elementURIFragmentKey = this.getProperties()[0].getValue();
        try {
            // some sanity checks
            if (trigger != null && rootEditPart != null
                    && data.has(elementURIFragmentKey)) {
                // find all states that are active
                String stateData = (String)data.get(elementURIFragmentKey);
                
                StringTokenizer tokenizer = new StringTokenizer(stateData
                        .toString(), " ,");
                List<EditPart> highlightedStates = new ArrayList<EditPart>();
                while (tokenizer.hasMoreElements()) {
                    String elementURIFragment = tokenizer.nextToken();
                    // notify the viewmanagement about this active state
                    TriggerEventObject triggerEvent = new TriggerEventObject();
                    EditPart affectedState = getEditPart(
                    			elementURIFragment, 
                    			rootEditPart);
                    highlightedStates.add(affectedState);
                    // a state is already highlighted
                    if(lastHighligtedStates != null && 
                    		lastHighligtedStates.contains(affectedState))
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

	//-------------------------------------------------------------------------
	
	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#initialize()
	 */
	public void initialize() {
        StringTokenizer tokenizer = new StringTokenizer(this.getProperties()[1]
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

	//-------------------------------------------------------------------------
	
	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isObserver()
	 */
	public boolean isObserver() {
		// TODO Auto-generated method stub
		return true;
	}

	//-------------------------------------------------------------------------
	
	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isProducer()
	 */
	public boolean isProducer() {
		// TODO Auto-generated method stub
		return false;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#wrapup()
	 */
	public void wrapup() {
		// TODO Auto-generated method stub
		
	}
	
	//-------------------------------------------------------------------------
	
	class MyShapeEditPart extends ShapeEditPart {
		public MyShapeEditPart(View view) {
			super(view);
			// TODO Auto-generated constructor stub
		}
		public String getElementGuid() {
			return this.elementGuid;
		}
	}
	
    //-------------------------------------------------------------------------
	
	private HashMap<String,EditPart> cachedEditParts;
    
    /**
     * This method searches recursively for an EditPart using the 
     * modelElement URIFragment provided. The latter can be 
     * obtained by calling:
     * 
     * myEObject.eResource().getURIFragment(myNode).toString();
     * 
     * This returns the URI fragment that, when passed to getEObject
     * will return the given object.
     * 
     * @param elementURIFragment the URIFragment of the EObject to 
     * 		  search for
     * @param parent the parent EditPart
     * 
     * @return the EditPart of the EObject
     */
    public EditPart getEditPart(String elementURIFragment, 
    								   EditPart parent) {
    	if (cachedEditParts == null) {
        	// if hashmap is not initialized, create it
    		cachedEditParts = new HashMap<String,EditPart>();
    	}
    	else {
        	//try to get from hashmap first
    		if (cachedEditParts.containsKey(elementURIFragment))
    			return cachedEditParts.get(elementURIFragment);
    	}
    	
        List children = parent.getChildren();
        for (Object child : children) {
            if (child instanceof ShapeEditPart) {
                View view = (View) ((ShapeEditPart) child).getModel();
                EObject modelElement = view.getElement();
    			if (modelElement.equals(
    					modelElement.eResource()
    					.getEObject(elementURIFragment))) {
                	//first cache for later calls
                	cachedEditParts.put(
                			elementURIFragment, 
                			(ShapeEditPart) child);
                	//then return
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
        // we did not find anything in this trunk
        return null;
    }

    //-------------------------------------------------------------------------
    
    /* (non-Javadoc)
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#provideProperties()
     */
    public KiemProperty[] provideProperties() {
        KiemProperty[] properties = new KiemProperty[2];
        properties[0] = new KiemProperty("state variable", "RAIL state");
        properties[1] = new KiemProperty("editor",
                new KiemPropertyTypeEditor(), "");
        return properties;
    }
    
}
