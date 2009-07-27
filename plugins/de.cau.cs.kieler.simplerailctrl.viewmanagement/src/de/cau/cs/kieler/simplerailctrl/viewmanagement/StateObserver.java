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
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.DecorationNodeImpl;
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

public class StateObserver extends JSONObjectDataComponent implements
		IJSONObjectDataComponent {

    EditPart rootEditPart;
    List<EditPart> lastHighligtedStates;

	
	public JSONObject step(JSONObject data) {
        StateTrigger trigger = StateTrigger.getInstance();
        String stateDataKey = this.getProperties()[0].getValue();
        try {
            // some sanity checks
            if (trigger != null && rootEditPart != null
                    && data.has(stateDataKey)) {
                // find all states that are active
                String stateData = (String)data.get(stateDataKey);
                
                //System.out.println()
                
                StringTokenizer tokenizer = new StringTokenizer(stateData
                        .toString(), " ,");
                List<EditPart> highlightedStates = new ArrayList<EditPart>();
                while (tokenizer.hasMoreElements()) {
                    String stateName = tokenizer.nextToken();
                    // notify the viewmanagement about this active state
                    TriggerEventObject triggerEvent = new TriggerEventObject();
                    EditPart affectedState = getEditPart(
                    			stateName, 
                    			rootEditPart);
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

	public boolean isObserver() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isProducer() {
		// TODO Auto-generated method stub
		return false;
	}

	public void wrapup() {
		// TODO Auto-generated method stub
		
	}

	
	
    /**
     * Recursively search an EditPart for the corresponding model object with
     * the given serialized string representation.
     */
//    public static EditPart getEditPart(String modelElementXPath, 
//    								   Object parent) {
//    	
//    	//if this is no edit part return null (model element not found)
//    	if (!(parent instanceof EditPart)) return null;
//    	
//    	EditPart parentEditPart = (EditPart)parent;
//    	EditPart returnEditPart = null;
//    	
//    	if ((parentEditPart.getChildren() != null) &&
//    			(parentEditPart.getChildren().size() > 0)) {
//    		//search in every child recursively
//    		for (int c = 0; c < parentEditPart.getChildren().size(); c++) {
//    			EditPart returnEditPartTmp = getEditPart(
//    							modelElementXPath, 
//    							parentEditPart.getChildren().get(c));
//    			if (returnEditPartTmp != null) {
//    				//if something found overwrite returnEditPart
//    				returnEditPart = returnEditPartTmp;
//    			}
//    		}
//    	}
//    	else {
//    		Object vglModelElement = parentEditPart.getModel();
//    		if (vglModelElement instanceof DecorationNodeImpl) {
//    			DecorationNodeImpl vglModelRealElement =
//    				(DecorationNodeImpl)vglModelElement;
//    			
//    			int index = vglModelRealElement.getElement().eContainer().eContents().indexOf(vglModelRealElement.getElement());
//    			//TODO: fake xpath ... isn't there any better way?!
//    			String vglString = "//@nodes."+index;
//    			
//        		if (vglString.equals(modelElementXPath)) {
//        			returnEditPart = parentEditPart;
//        		}
//    		}
//    		
//    	}
//    	//nothing found
//    	return returnEditPart;
//    }
	
	class MyShapeEditPart extends ShapeEditPart {
		public MyShapeEditPart(View view) {
			super(view);
			// TODO Auto-generated constructor stub
		}
		public String getElementGuid() {
			return this.elementGuid;
		}
	}
	
    public static EditPart getEditPart(String modelElementXPath, 
    								   EditPart parent) {
        List children = parent.getChildren();
        for (Object child : children) {
            if (child instanceof ShapeEditPart) {
                View view = (View) ((ShapeEditPart) child).getModel();
                EObject model = view.getElement();
                //String elementGuid = ((MyShapeEditPart) child).getElementGuid();
                
    			int index = model.eContainer().eContents().indexOf(model);
    			//TODO: fake xpath ... isn't there any better way?!
    			String vglString = "//@nodes."+index;
                
                if (vglString.equals(modelElementXPath)) {
                	return (ShapeEditPart) child;
                }
            }
            // if node was not found yet, search recursively
            if (child instanceof EditPart) {
                EditPart result = getEditPart(modelElementXPath,
                							  (EditPart) child);
                if (result != null)
                    return result;
            }
        }
        // we did not find anything in this trunk
        return null;
    }

    
    public KiemProperty[] provideProperties() {
        KiemProperty[] properties = new KiemProperty[2];
        properties[0] = new KiemProperty("state variable", "RAIL state");
        properties[1] = new KiemProperty("editor",
                new KiemPropertyTypeEditor(), "");
        return properties;
    }
    
}
