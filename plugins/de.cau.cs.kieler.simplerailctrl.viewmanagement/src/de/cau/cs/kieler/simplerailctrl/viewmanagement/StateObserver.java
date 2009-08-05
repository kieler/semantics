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
 ******************************************************************************/

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
 * The class StateObserver implements a KIEM observer DataComponent
 * that is able to highlight state nodes in the SimpleRailCtrl
 * editor. The editor must be selected in the properties of this
 * DataComponent before the highlighting can take place.
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class StateObserver extends JSONObjectDataComponent implements
		IJSONObjectDataComponent {

    /** The root EditPart of the editor. */
    private EditPart rootEditPart;
    
    /** The last highlighted states. */
    private List<String> lastHighlightedStates;

	/** The cached edit parts t be matched with FragmentURLs. */
	private HashMap<String,EditPart> cachedEditParts;
    
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
            	
            	//set the rootEditPart
            	StateCombination.getInstance().setRootEditPart(rootEditPart);
            	
                // find all states that are active
                String stateData = (String)data.get(elementURIFragmentKey);
                StringTokenizer tokenizer = new StringTokenizer(stateData
                        .toString(), " ,");
                List<String> highlightedStatesURI = new ArrayList<String>();
                
                while (tokenizer.hasMoreElements()) {
                    String elementURIFragment = tokenizer.nextToken();
                    // notify the view management about this active state
                    TriggerEventObject triggerEvent = new TriggerEventObject();
                    
                    System.out.println("VIEW MANAGEMENT:"+elementURIFragment);
                    
                    highlightedStatesURI.add(elementURIFragment);
                    // a state is already highlighted
                    if(lastHighlightedStates != null && 
                    		lastHighlightedStates.contains(elementURIFragment))
                        continue;
                    triggerEvent.setAffectedObject(elementURIFragment);
                    triggerEvent.setTriggerActive(true);
                    trigger.notifyTrigger(triggerEvent);
                }
                // find all states that are not highlighted anymore
                if (lastHighlightedStates != null) {
                    for (String editPartURI : highlightedStatesURI)
                    	lastHighlightedStates.remove(editPartURI);
                    for (String editPartURI : lastHighlightedStates) {
                        TriggerEventObject triggerEvent = new TriggerEventObject();
                        triggerEvent.setAffectedObject(editPartURI);
                        triggerEvent.setTriggerActive(false);
                        trigger.notifyTrigger(triggerEvent);
                    }
                }//end if
                lastHighlightedStates = highlightedStatesURI;

            }//end if
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
		return true;
	}

	//-------------------------------------------------------------------------
	
	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isProducer()
	 */
	public boolean isProducer() {
		return false;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#wrapup()
	 */
	public void wrapup() {
		//noop
	}
	
	//-------------------------------------------------------------------------
	
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
    @SuppressWarnings("unchecked")
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
    	
        List<EditPart> children = parent.getChildren();
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
