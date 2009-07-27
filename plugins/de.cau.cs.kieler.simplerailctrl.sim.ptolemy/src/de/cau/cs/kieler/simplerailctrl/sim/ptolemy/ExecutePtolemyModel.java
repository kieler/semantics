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
package de.cau.cs.kieler.simplerailctrl.sim.ptolemy;

import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;

import ptolemy.actor.Actor;
import ptolemy.actor.CompositeActor;
//import ptolemy.actor.StateReceiver;
import ptolemy.actor.ExecutionListener;
import ptolemy.actor.FiringEvent;
import ptolemy.actor.IOPort;
import ptolemy.actor.ActorFiringListener;
import ptolemy.actor.IOPortEvent;
import ptolemy.actor.IOPortEventListener;
import ptolemy.actor.Manager;
import ptolemy.data.IntToken;
import ptolemy.data.expr.Parameter;
import ptolemy.domains.fsm.modal.ModalController;
import ptolemy.domains.fsm.modal.ModalModel;
import ptolemy.kernel.InstantiableNamedObj;
import ptolemy.kernel.util.ChangeListener;
import ptolemy.kernel.util.ChangeRequest;
import ptolemy.kernel.util.DebugEvent;
import ptolemy.kernel.util.DebugListener;
import ptolemy.kernel.util.NamedObj;
import ptolemy.kernel.util.StringAttribute;
import ptolemy.moml.MoMLParser;
import ptolemy.actor.lib.io.*;
import ptolemy.actor.kiel.*;

public class ExecutePtolemyModel implements Runnable {
	
	private String PtolemyModel;
	private boolean paused;
	private boolean stop;
	private int makesteps;
	private String currentState;
	private Manager manager; 
	
	private String host;
	private String port;
	
	private KiemExecutionException executionException; 
	
	public ExecutePtolemyModel(String PtolemyModel, 
							   String host,
							   String port) {
		System.out.println("Execution Thread - Constructor");
		this.PtolemyModel = PtolemyModel;
		this.paused = true;
		this.stop = false;
		this.makesteps = 0;
		this.currentState = "";
		this.host = host;
		this.port = port;
		this.executionException = null;
	}
	
	public String getCurrentState() {
		return currentState;
	}
	
	public synchronized void executionStep() throws KiemExecutionException {
		//System.out.println("Execution Thread - Make Step");
		this.paused = false;
		this.makesteps++;
		//throw exception that may have occurred
		if (this.executionException != null)
			throw this.executionException;
	}
	public synchronized void executionPlay() {
		this.paused = false;
		this.makesteps = -1;
	}
	
	public void executionStop() {
		this.stop = true;
	}
	public void executionPause() {
		this.paused = true;
	}
	
	
	class KielerActorFiringListener implements ActorFiringListener {
		String objectPath;
		ModalModel modalModel;
		
		KielerActorFiringListener(String objectPath,
								  ModalModel modalModel) {
			this.objectPath = objectPath;
			this.modalModel = modalModel;
		}

		/* (non-Javadoc)
		 * @see ptolemy.actor.ActorFiringListener#firingEvent(ptolemy.actor.FiringEvent)
		 */
		public void firingEvent(FiringEvent event) {
			// TODO Auto-generated method stub
			String stateName = modalModel.getController().currentState().getName();
			System.out.println(" >>> "+ objectPath + "." +stateName);
		}
		
	}
	
	private void addStateListenersRecursively(List<ModalModel> modalModelList,
											  List<InstantiableNamedObj> children, 
											  String hierarchyLevel) {
		// if no further children
		if (children == null) return;

		// do recursively for children
		for (int c = 0; c < children.size(); c++){
			Object child = children.get(c);
        	//System.out.println("Child: "+ child.getClass().getName());
            
            if(child instanceof CompositeActor){
            	CompositeActor compositeActor = (CompositeActor)child;
            	System.out.println("CompositeActor: "+ compositeActor.getName());
            	
            	addStateListenersRecursively(
            			modalModelList,
            			compositeActor.entityList(),
            			hierarchyLevel + "." + compositeActor.getName());
            }
            

            if (child instanceof ModalModel) {
            	ModalModel modalModel = (ModalModel)child;
            	System.out.println("Add ModalModel: "+ modalModel.getName());
            	modalModelList.add(modalModel);
            	
            	addStateListenersRecursively(
            			modalModelList,
            			modalModel.entityList(),
            			hierarchyLevel);
            }

            if (child instanceof ModalController) {
            	ModalController modalController = (ModalController)child;
            	System.out.println("" +
            			": "+ modalController.getName());
            	
            	addStateListenersRecursively(
            			modalModelList,
            			modalController.entityList(),
            			hierarchyLevel);
            }
            
//            if (child instanceof ptolemy.domains.fsm.kernel.State) {
//            	ptolemy.domains.fsm.kernel.State state
//            		= (ptolemy.domains.fsm.kernel.State) child;
//            	
//            	System.out.println(" >State: "+ state.getName());
//            	
//            }//end if state
        }//end while
	}

	
	public void run() {
		System.out.println("Execution Thread - Run 1");
		System.out.println("PtolemyModel:" + PtolemyModel);

		// first create MoML file
        //TestCreateMomlFile.main(null);
        // get URI of MoML file
		
        //String filename = "src-gen/generated.moml";
		URI fileURI = URI.createFileURI(new File(PtolemyModel).getAbsolutePath());
    	
        URI momlFile = fileURI;

        // create new MoML parser. Make sure ptolemy is in your dependencies
        MoMLParser parser = new MoMLParser();
        
        List<ModalModel> modalModelList = new LinkedList<ModalModel>();
        
        NamedObj ptolemyModel = null;
        try {
            // parse
            // FIXME: here it would be nicer to parse something from memory
            //  maybe a String, hence the MoML code would be required in
            //  form of a String
            ptolemyModel = parser.parse(null, new URL(momlFile.toString()));
            System.out.println("MoML parsing finished...");

            // now execute the model

            // check if the parsed model is of correct type
            if (ptolemyModel != null && ptolemyModel instanceof CompositeActor) {
                CompositeActor modelActor = ((CompositeActor) ptolemyModel);
                
                // get the manager that manages execution
                manager = modelActor.getManager();
                // there is likely no manager available, hence create a new one
                if (manager == null) {
                    manager = new Manager(modelActor.workspace(), "kieler manager");
                    modelActor.setManager(manager);
                }
                else {
                	try {
                    	manager.stop();
                    	manager.wrapup();
                	}catch(Exception e){}
                    manager = new Manager(modelActor.workspace(), "kieler manager");
                    modelActor.setManager(manager);
                }

                addStateListenersRecursively(
                		modalModelList,
                		modelActor.entityList(), 
                		modelActor.getName());
                
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

        		System.out.println("Execution Thread - Run 2");

                // run the model
                if (manager != null) {
                    List<Actor> children = modelActor.getChildren();
                    // run forest, run!
                    manager.initialize();
                    //System.out.println(children.get(0).toString());
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
                        		
                        		for (int c = 0; c < modalModelList.size(); c++) {
                        			ModalModel modalModel = modalModelList.get(c);
                        			currentState = ((StringAttribute)modalModel.getController()
                        					.currentState()
                        					.getAttribute("elementURIFragment"))
                        					.getValueAsString();
                        		}
                        		
                        	}
                    	}
                        //((IOPort)actor.portList().get(0)).send(0, new IntToken(8));

                    }
                    // calling manager.execute() would run the model
                    // for the amount of iterations set in the director
                }
            }
        } catch (Exception e) {
        	this.executionException = new KiemExecutionException(e.getLocalizedMessage(),true);
        	//e.printStackTrace();
        }
	}
	
}
