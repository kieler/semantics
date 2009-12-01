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
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.sim.kiem.data.KiemProperty;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyException;
import de.cau.cs.kieler.sim.kiem.data.KiemPropertyTypeEditor;
import de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.json.JSONException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;
import de.cau.cs.kieler.viewmanagement.RunLogic;
import de.cau.cs.kieler.viewmanagement.TriggerEventObject;


public class StateActivityObserver extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {
    
    /** FIXME: haf workaround: Singleton pattern to get simple access to the rootEditPart */
    public static StateActivityObserver INSTANCE = null;

    private static final String VMID = "de.cau.cs.kieler.viewmanagement.VMControl";
    
    private boolean broughtToTheFront = false;
//    private KiemProperty stateVariableProperty;
//    private KiemProperty editorProperty;

    /** The cached edit parts t be matched with FragmentURLs. */
    private HashMap<String, EditPart> cachedEditParts;

    private HashMap<EditPart,String> cachedElementURIs;

    /** The last highlighted states. */
    private List<String> lastHighlightedStates;
    EditPart rootEditPart;
    
    private StateActivityTrigger trigger;

    // -------------------------------------------------------------------------

    /**
     * 
     */
    public StateActivityObserver() {
        super();
        INSTANCE = this;
    }
    
    /**
     * This method brings the VM view to the front.
     */
    public void bringToFront() {
        //just do this once in the lifetime of this plugin
        if (broughtToTheFront) return;
        else broughtToTheFront = true;
        // bring VM view to the front (lazy loading)
        try {
            IWorkbenchWindow window = Activator.getDefault().getWorkbench()
                    .getActiveWorkbenchWindow();
            IViewPart vP = window.getActivePage().showView(VMID);
            vP.setFocus();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#testProperties(de.cau.cs.kieler.sim.kiem.data.KiemProperty[])
	 */
	@Override
	public void checkProperties(KiemProperty[] properties) throws KiemPropertyException {
		String kiemEditorProperty = this.getProperties()[0].getValue();
		
		//only check non-empty property (this is optional)
		if (!kiemEditorProperty.equals("")) {
			if (getEditor(kiemEditorProperty) == null) {
				//this is an error, probably the selected editor isnt open any more
				//or the file(name) opened has changed
				throw new KiemPropertyException("The selected editor '"+kiemEditorProperty+"'" +
						" does not exist. Please ensure that an opened editor is selected and" +
						"the file name matches.\n\nIf you want the currently active editor to be" +
						"simulated make sure the (optional) editor property is empty!");
			}
		}
                if (this.getInputEditor() == null) {
                    throw new KiemPropertyException("There exists no active editor.\n"+
                            "Please ensure that an opened editor is selected and" +
                            "the file name matches.\n\nIf you want the currently active editor to be" +
                            "simulated make sure the (optional) editor property is empty!");
                }
		
    	
	}

    // -------------------------------------------------------------------------

    DiagramEditor getEditor(String kiemEditorProperty) {
		if ((kiemEditorProperty == null)||(kiemEditorProperty.length() == 0))
		 	return null;
		
        StringTokenizer tokenizer = new StringTokenizer(kiemEditorProperty, " ()");
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
                    	 //test if correct file
                    	 if (fileString.equals(editor.getTitle())) {
                    		 return (DiagramEditor) editor;
//                             rootEditPart = ((DiagramEditor) editor)
//                                     .getDiagramEditPart();
//                             break;
                    	 }
                     }
                 }
             }
         }
		return null;
	}

    @SuppressWarnings("unchecked")
	public EditPart getEditPart(String elementURIFragment, 
    								   EditPart parent) {
//cache turned off, EditParts seem to be volatile
//    	if (cachedEditParts == null) {
//        	// if hashmap is not initialized, create it
//    		cachedEditParts = new HashMap<String,EditPart>();
//    		cachedElementURIs = new HashMap<EditPart,String>();
//    	}
//    	else {
//        	//try to get from hashmap first
//    		if (cachedEditParts.containsKey(elementURIFragment))
//    			return cachedEditParts.get(elementURIFragment);
//    	}
      cachedEditParts = new HashMap<String,EditPart>();
      cachedElementURIs = new HashMap<EditPart,String>();
    	
      try {
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
                          cachedElementURIs.put(
                                          (ShapeEditPart) child, 
                                          elementURIFragment);
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
      }catch(Exception e) {
          return null;
      }
        // we did not find anything in this trunk
        return null;
    }

    /**
     * This method searches recursively for an EditPart using the 
     * modelElement URIFragment provided. The latter can be 
     * obtained by calling:
     * 
     * myEObject.eResource().getURIFragment(myEObject).toString();
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
	public String getElementURIFragment(EditPart editPart) {
    	if (cachedElementURIs != null) {
    		if (cachedElementURIs.containsKey(editPart))
    			return cachedElementURIs.get(editPart);
    	}
    	return "";   	
    }
    
    
    DiagramEditor getInputEditor() {
		String kiemEditorProperty = this.getProperties()[0].getValue();
		DiagramEditor diagramEditor = null;
		
		//get the active editor as a default case (if property is empty)
		IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IEditorPart editor = activePage.getActiveEditor();
	    if (editor instanceof DiagramEditor) {
	                diagramEditor = (DiagramEditor) editor;
	    }
		
		//only check non-empty and valid property (this is optional)
		if (!kiemEditorProperty.equals("")) {
			if (getEditor(kiemEditorProperty) != null) {
					diagramEditor = getEditor(kiemEditorProperty);
			}
		}
		return diagramEditor;
	}
    
    
    /**
     * @return the rootEditPart
     */
    public EditPart getRootEditPart() {
        return rootEditPart;
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#initialize()
     */
    public void initialize() throws KiemInitializationException {
        try {
            //bring to front VM
            bringToFront();
            rootEditPart = getInputEditor().getDiagramEditPart();
            if (RunLogic.getInstance() == null) 
                throw new KiemInitializationException("Cannot initialize view management!", true, null);
            RunLogic.getInstance().registerListeners();
        }
        catch(Exception e) {
            throw new KiemInitializationException("Cannot initialize view management!", true, e);
        }
    }
      
    public boolean isDeltaObserver() {
    	return false;
    }

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isHistoryObserver()
     */
    public boolean isHistoryObserver() {
        return true;
    }
	

    //-------------------------------------------------------------------------

//    String translateToURI(EditPart editPart) {
//    	return ((EObject)editPart).eResource().getURIFragment((EObject)editPart).toString();
//    }
    
    //-------------------------------------------------------------------------
    
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

    //-------------------------------------------------------------------------
    
	/*
     * (non-Javadoc)
     * 
     * @see
     * de.cau.cs.kieler.sim.kiem.extension.DataComponent#initializeProperties()
     */
    public KiemProperty[] provideProperties() {
        KiemProperty[] properties = new KiemProperty[2];
        properties[0] = new KiemProperty("SyncChart Editor",
        		new KiemPropertyTypeEditor(), "");
        properties[1] = new KiemProperty("state variable", "state");
        return properties;
    }
	
    //-------------------------------------------------------------------------	 

	/*
     * (non-Javadoc)
     * 
     * @see
     * de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent#step(de.
     * cau.cs.kieler.sim.kiem.json.JSONObject)
     */
    public JSONObject step(JSONObject data) throws KiemExecutionException {
        trigger = StateActivityTrigger.instance;
        String stateVariableKey = this.getProperties()[1].getValue();
        
//        //debug!!!//
//        try {
//			data.accumulate("state", ", , , //@innerStates.0/@regions.0/@innerStates.0, , , //@innerStates.0/@regions.0/@innerStates.0/@regions.1/@innerStates.0, , //@innerStates.0/@regions.0/@innerStates.0/@regions.0/@innerStates.0");
//		} catch (JSONException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
        
        try {
            // some sanity checks
            if (trigger != null && rootEditPart != null
                    && data.has(stateVariableKey)) {
            	//set the rootEditPart
            	ActiveStateHighlightCombination.getInstance().setRootEditPart(rootEditPart);
            	
                // find all states that are active
                Object stateData = data.get(stateVariableKey);
                StringTokenizer tokenizer = new StringTokenizer(stateData
                        .toString(), " ,");
                List<EditPart> highlightedStates = new ArrayList<EditPart>();
                List<String> highlightedStatesURI = new ArrayList<String>();
                
                //remember what states already were considered 
                LinkedList<String> consideredStates = new LinkedList<String>(); 

                while (tokenizer.hasMoreElements()) {
                    String stateName = tokenizer.nextToken();
                    
                    //check if this is a new state (no duplicate)
                    boolean newState = true;
                    for (String consideredState: consideredStates) {
                        if (consideredState.equals(stateName)) {
                            newState = false;
                            break;
                        }
                    }
                    if (!newState) {
                        //do not consider already considered states
                        continue;
                    }
                    //add to considered states
                    consideredStates.add(stateName);
                    
                    // notify the viewmanagement about this active state
                    TriggerEventObject triggerEvent = new TriggerEventObject();
                    EditPart affectedState = getEditPart(stateName, rootEditPart);
                    
                    if (affectedState == null) {
                        //this might be a harmless error trying to view something that
                        //is permanently not there
                        //the conclusion is wrong that the editor is closed!
                        //this is more likely if something that was there, isnt any more
                        //(see below)
                        continue;
                        //throw new KiemExecutionException("SyncChart View Management cannot visualize. Either the editor was closed or an internal error occurred.\n\n" +
                        // 		"You should stop (and restart) the currently running simulation!\n\n", false,
                        //   null);                                
                    }
                    
                    highlightedStates.add(affectedState);
                    // a state is already highlighted
                    System.out.println("VIEW MANAGEMENT:"+stateName);
                    
                    highlightedStatesURI.add(stateName);
                    // a state is already highlighted
                    if(lastHighlightedStates != null && 
                    		lastHighlightedStates.contains(stateName))
                        continue;
                    

                    //triggerEvent.setAffectedObject(stateName); 
                    //trigger.translateToURI((Object)affectedState));
                    try {
                        triggerEvent.setAffectedObject(((View)affectedState.getModel()).getElement());
                    }
                    catch(Exception e){
                        //if this fails, most likely the EditPart does not exist anymore
                        e.printStackTrace();
                    }

                    //triggerEvent.setAffectedObject(trigger.translateToEObject(affectedState)); //???//

                    triggerEvent.setTriggerActive(true);
                    trigger.notifyTrigger2(triggerEvent);
                }
                
                // find all states that are not highlighted anymore
                if (lastHighlightedStates != null) {
                	//the following states are currently highlighted
                    for (String editPartURI : highlightedStatesURI){
                    	lastHighlightedStates.remove(editPartURI);
                    	System.out.println("LEAVE:"+editPartURI);
                    }
                    for (String editPartURI : lastHighlightedStates) {
                        TriggerEventObject triggerEvent = new TriggerEventObject();

                    	EditPart ep = getEditPart(editPartURI, rootEditPart);
                        if (ep == null) {
                            throw new KiemExecutionException("SyncChart View Management cannot visualize. Either the editor was closed or an internal error occurred.\n\n" +
                                    "You should stop (and restart) the currently running simulation!\n\n", false,
                       null);                                
                        }
                    	
                        EObject eObject =  trigger.translateToEObject(ep);
                        triggerEvent.setAffectedObject(eObject);
//                        
//                        
//                        	((View)ActiveStateHighlightCombination.getInstance()
//                        		.translateToEditPart(editPartURI, rootEditPart).getModel()).getElement();

//                        triggerEvent.setAffectedObject(trigger.translateToEObject(editPartURI));

                        System.out.println("REMOVE:"+editPartURI);
                        triggerEvent.setTriggerActive(false);
                        trigger.notifyTrigger2(triggerEvent);
                    }
                }//end if
                lastHighlightedStates = highlightedStatesURI;

            }
        } catch (JSONException e) {
            /* nothing */
            throw new KiemExecutionException("SyncChart View Management cannot visualize. Either the editor was closed or an internal error occured.", false,  new Exception());
        } finally {
            ;        
        }
        return null;
    }
	
    //-------------------------------------------------------------------------	 
	
	/*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#wrapup()
     */
    public void wrapup() {
    	//clean up all visual effects
//        StateActivityTrigger trigger = StateActivityTrigger.instance;
//        for (String editPartURI : lastHighlightedStates) {
//            TriggerEventObject triggerEvent = new TriggerEventObject();
//            triggerEvent.setAffectedObject(editPartURI);
//            System.out.println("REMOVE:"+editPartURI);
//            triggerEvent.setTriggerActive(false);
//            trigger.notifyTrigger(triggerEvent);
//        }
    	try {
            ActiveStateHighlightCombination.getInstance().undoEffects();
    	}catch(Exception e){}
    	try {
            cachedEditParts.clear();
            cachedElementURIs.clear();
            lastHighlightedStates.clear();
    	}catch(Exception e){}
        rootEditPart = null;
    }
		

}
