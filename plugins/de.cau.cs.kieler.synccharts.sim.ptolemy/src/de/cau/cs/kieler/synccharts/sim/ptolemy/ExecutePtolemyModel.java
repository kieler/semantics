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
package de.cau.cs.kieler.synccharts.sim.ptolemy;

import java.io.File;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.json.JSONException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

import ptolemy.actor.CompositeActor;
import ptolemy.actor.Manager;
import ptolemy.domains.modal.modal.ModalController;
import ptolemy.domains.modal.modal.ModalModel;
import ptolemy.kernel.InstantiableNamedObj;
import ptolemy.kernel.util.NamedObj;
import ptolemy.kernel.util.StringAttribute;
import ptolemy.moml.MoMLParser;
//import ptolemy.actor.kiel.*;
import ptolemy.actor.kiel.KielerIO;
import de.cau.cs.kieler.sim.kiem.extension.JSONSignalValues;

/**
 * The class ExecutePtolemyModel implements the PtolemyExecutor. This is the
 * component that enables loading and executing (generated) Ptolemy models.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class ExecutePtolemyModel implements Runnable {
	
	private List<KielerIO> kielerIOList;
	
	private JSONObject inputData;
	
	private JSONObject outputData;
	
	/** The Ptolemy model to execute. */
	private String PtolemyModel;
	
	/** The flag indicating the execution is paused. */
	private boolean paused;
	
	/** The flag indicating the execution should stop. */
	private boolean stop;
	
	/** The steps to make, because {@link #executionStep()} is 
	 * called asynchronously. */
	private int makesteps;
	
	/** The currently active state of the EMF model as FragmentURI. */
	private String currentState;
	
	/** The Ptolemy manager. */
	private Manager manager; 
	
	/** The KiemExecutionException that may have occurred during the 
	 * asynchronous performance of steps. */
	private KiemExecutionException executionException; 
	
	//-------------------------------------------------------------------------
	
	/**
	 * Instantiates a new ExecutePtolemyModel.
	 * 
	 * @param PtolemyModel the Ptolemy model to execute
	 */
	public ExecutePtolemyModel(String PtolemyModel) {
		this.PtolemyModel = PtolemyModel;
		this.paused = true;
		this.stop = false;
		this.makesteps = 0;
		this.currentState = "";
		this.executionException = null;
		this.kielerIOList = null;
	}
	
	//-------------------------------------------------------------------------
	
	public void setData(JSONObject jSONObject) {
		this.inputData = jSONObject;
	}
	
	//-------------------------------------------------------------------------
	
	public boolean isSignalPresent(String signalName) {
		if (this.inputData.has(signalName)) {
			try {
				Object object = this.inputData.get(signalName);
				return (JSONSignalValues.isPresent(object));
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	//-------------------------------------------------------------------------
	
	public String[] getInterfaceVariables() {
		if (this.kielerIOList == null) return null;
		
		List<String> keys = new LinkedList<String>();
		for (int c = 0; c < kielerIOList.size(); c++) {
			String signalName = ((KielerIO)kielerIOList.get(c)).getSignalName();
			//remove quotation marks
			signalName = signalName.replaceAll("'", "");
			keys.add(signalName);
		}
		
		return (String[])keys.toArray();
	}

	//-------------------------------------------------------------------------
	
	/**
	 * Gets the currently active state as URIFragment.
	 * 
	 * @return the current state
	 */
	public String getCurrentState() {
		return currentState;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Trigger the execution to perform another step. This is done 
	 * asynchronously meaning that the step is not immediately performed but
	 * whenever the executing thread is able to perform the next one.
	 * <BR><BR>
	 * If the {@link #executionStop()} method is called before this step
	 * is actually performed it wont be performed!
	 * <BR><BR>
	 * If any KiemExecutionException was thrown in the {@link #run()} method
	 * of the thread then it is thrown in here. Note that this exception
	 * normally happened in any step performed before the current one but only
	 * now will be brought to the users or KIEM attention. 
	 * 
	 * @throws KiemExecutionException a KiemExecutionException
	 */
	public synchronized void executionStep() throws KiemExecutionException {
		this.paused = false;
		//increase steps to make
		this.makesteps++;
		//throw exception that may have occurred (asynchronously)
		if (this.executionException != null)
			throw this.executionException;
	}

	//-------------------------------------------------------------------------
	
	/**
	 * This immediately stops the execution and will prevent any steps to make
	 * even if they were triggered before a call to this method.
	 */
	public void executionStop() {
		this.stop = true;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * This method will cause the execution pause.
	 */
	public void executionPause() {
		this.paused = true;
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * Fills the modalModelList by recursively going thru the models elements.
	 * 
	 * @param modalModelList the list of ModalModels to fill
	 * @param children the children to walk thru
	 */
	@SuppressWarnings("unchecked")
	private void fillKielerIOList(List<KielerIO> kielerIOList,
									List<InstantiableNamedObj> children) {
		
		// if no further children
		if (children == null) return;

		// do recursively for children
		for (int c = 0; c < children.size(); c++){
			Object child = children.get(c);
            if(child instanceof CompositeActor){
            	CompositeActor compositeActor = (CompositeActor)child;
            	
            	fillKielerIOList(
            			kielerIOList,
            			compositeActor.entityList());
            }
            
            if (child instanceof KielerIO) {
            	kielerIOList.add((KielerIO)child);
        		System.out.println(" KIELERIO found: "+ ((KielerIO)child).getSignalName());

            	
            }
            if (child instanceof ModalModel) {
            	ModalModel modalModel = (ModalModel)child;
            	
            	fillKielerIOList(
            			kielerIOList,
            			modalModel.entityList());
            }

            if (child instanceof ModalController) {
            	ModalController modalController = (ModalController)child;
            	
            	fillKielerIOList(
            			kielerIOList,
            			modalController.entityList());
            }
        }//end while
	}

	
	//-------------------------------------------------------------------------

	/**
	 * Fills the modalModelList by recursively going thru the models elements.
	 * 
	 * @param modalModelList the list of ModalModels to fill
	 * @param children the children to walk thru
	 */
	@SuppressWarnings("unchecked")
	private void fillModalModelList(List<ModalModel> modalModelList,
									List<InstantiableNamedObj> children) {
		// if no further children
		if (children == null) return;

		// do recursively for children
		for (int c = 0; c < children.size(); c++){
			Object child = children.get(c);
            if(child instanceof CompositeActor){
            	CompositeActor compositeActor = (CompositeActor)child;
            	
            	fillModalModelList(
            			modalModelList,
            			compositeActor.entityList());
            }
            

            if (child instanceof ModalModel) {
            	ModalModel modalModel = (ModalModel)child;
            	modalModelList.add(modalModel);
            	
            	fillModalModelList(
            			modalModelList,
            			modalModel.entityList());
            }

            if (child instanceof ModalController) {
            	ModalController modalController = (ModalController)child;
            	
            	fillModalModelList(
            			modalModelList,
            			modalController.entityList());
            }
        }//end while
	}

	
	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@SuppressWarnings("unchecked")
	public void run() {
		URI fileURI = URI.createFileURI(new File(PtolemyModel).getAbsolutePath());
        URI momlFile = fileURI;
        
        //create new MoML parser
        //make sure Ptolemy is in dependencies
        MoMLParser parser = new MoMLParser();

        List<ModalModel> modalModelList = new LinkedList<ModalModel>();
        kielerIOList = new LinkedList<KielerIO>();
        
        NamedObj ptolemyModel = null;
        try {
            //parse
            ptolemyModel = parser.parse(null, new URL(momlFile.toString()));

            //now execute the model
            if (ptolemyModel != null && ptolemyModel instanceof CompositeActor) {
                //check if the parsed model is of correct type
                CompositeActor modelActor = ((CompositeActor) ptolemyModel);
                
                //get the manager that manages execution
                manager = modelActor.getManager();
                if (manager == null) {
                    //there is likely no manager available, 
                	//hence create a new one
                    manager = new Manager(modelActor.workspace(), 
                    						"kieler manager");
                    modelActor.setManager(manager);
                }
                else {
                	//if there is already a manager (e.g., from previous calls)
                	//then try to stop it and create a new one
                	try {
                    	manager.stop();
                    	manager.wrapup();
                	}catch(Exception e){}
                    manager = new Manager(modelActor.workspace(), 
                    						"kieler manager");
                    modelActor.setManager(manager);
                }

                //go thru the model and add fill the modalModelList
                fillModalModelList(
                		modalModelList,
                		modelActor.entityList());

                //go thru the model and add fill the kielerIOList
                fillKielerIOList(
                		kielerIOList,
                		modelActor.entityList());
                
//                //modify host and port of railway simulation engine actor
//                if (modelActor.entityList() != null) {
//                    for (int c = 0; c < modelActor.entityList().size(); c++) {
//                    	Object entity = modelActor.entityList().get(c);
//                    	
//                    	if (entity instanceof ModelRailwayIO) {
//                    	  ModelRailwayIO modelRailwayIO =
//                    			(ModelRailwayIO) entity;
//                    	  modelRailwayIO.host.setExpression("'"+this.host+"'");
//                    	  modelRailwayIO.port.setExpression(this.port);
//                    	}
//                    	
//                    }//next c
//                }

                // run the model
                if (manager != null) {
                    // run forest, run!
                    manager.initialize();
                    while(true) {
                    	
                    	while(this.paused) {
                    		Thread.sleep(100);
                    	}
                    	if (this.stop) {
                            manager.wrapup();
                    		return;
                    	}
                    	
                    	synchronized(this) {
                          if ((this.makesteps == -1)||(this.makesteps > 0)) {
                        	  if (makesteps > 0) makesteps--;
                        		manager.iterate();
                        		
                        	  //iterate thru all modal models and concatenate
                        	  //the fragment URIs with a colon
                        	  currentState = "";
                        	  for (int c = 0; c < modalModelList.size(); c++) {
                        		ModalModel modalModel = modalModelList.get(c);
                        		//if more than one active state
                        		if (!currentState.equals(""))
                        			currentState += ", ";
                        		currentState += ((StringAttribute)modalModel
                        				 .getController()
                        				 .currentState()
                        				 .getAttribute("elementURIFragment"))
                        				 .getValueAsString();
                        		}
                        		
                        	  //iterate thru all kielerIOs
                        	  for (int c = 0; c < kielerIOList.size(); c++) {
                        		KielerIO kielerIO = kielerIOList.get(c);
                        		String signalName = kielerIO.getSignalName();
                        		//remove quotation marks
                        		signalName = signalName.replaceAll("'", "");
                       			kielerIO.setPresent(isSignalPresent(signalName));
                        		System.out.println(c+") "+ signalName + " : " + isSignalPresent(signalName) );
                        	  }
                        	  
                        	  
                        	}
                    	}
                    }
                    // calling manager.execute() would run the model
                    // for the amount of iterations set in the director
                }
            }
        } catch (Exception e) {
        	//raise a KiemExecutionException in case of any error
        	this.executionException = 
        		new KiemExecutionException(e.getLocalizedMessage(),true, e);
        }
	}
	
}
