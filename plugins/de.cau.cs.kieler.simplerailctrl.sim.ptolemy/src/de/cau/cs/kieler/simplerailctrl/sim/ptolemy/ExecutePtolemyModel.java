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
package de.cau.cs.kieler.simplerailctrl.sim.ptolemy;

import java.io.File;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;

import ptolemy.actor.CompositeActor;
import ptolemy.actor.Manager;
import ptolemy.domains.fsm.modal.ModalController;
import ptolemy.domains.fsm.modal.ModalModel;
import ptolemy.kernel.InstantiableNamedObj;
import ptolemy.kernel.util.NamedObj;
import ptolemy.kernel.util.StringAttribute;
import ptolemy.moml.MoMLParser;
import ptolemy.actor.kiel.*;

/**
 * The class ExecutePtolemyModel implements the PtolemyExecutor. This is the
 * component that enables loading and executing (generated) Ptolemy models.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class ExecutePtolemyModel implements Runnable {
	
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
	
	/** The host for connecting to the model railway simulation. */
	private String host;
	
	/** The port for connecting to the model railway simulation. */
	private String port;
	
	/** The KiemExecutionException that may have occurred during the 
	 * asynchronous performance of steps. */
	private KiemExecutionException executionException; 
	
	//-------------------------------------------------------------------------
	
	/**
	 * Instantiates a new ExecutePtolemyModel.
	 * 
	 * @param PtolemyModel the Ptolemy model to execute
	 * @param host the host for the simulation
	 * @param port the port for the simulation
	 */
	public ExecutePtolemyModel(String PtolemyModel, 
							   String host,
							   String port) {
		this.PtolemyModel = PtolemyModel;
		this.paused = true;
		this.stop = false;
		this.makesteps = 0;
		this.currentState = "";
		this.host = host;
		this.port = port;
		this.executionException = null;
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
                
                //modify host and port of railway simulation engine actor
                if (modelActor.entityList() != null) {
                    for (int c = 0; c < modelActor.entityList().size(); c++) {
                    	Object entity = modelActor.entityList().get(c);
                    	
                    	if (entity instanceof ModelRailwayIO) {
                    	  ModelRailwayIO modelRailwayIO =
                    			(ModelRailwayIO) entity;
                    	  modelRailwayIO.host.setExpression("'"+this.host+"'");
                    	  modelRailwayIO.port.setExpression(this.port);
                    	}
                    	
                    }//next c
                }

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
