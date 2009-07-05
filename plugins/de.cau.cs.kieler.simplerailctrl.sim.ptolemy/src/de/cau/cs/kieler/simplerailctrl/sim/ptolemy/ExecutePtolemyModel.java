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
import java.util.List;

import org.eclipse.emf.common.util.URI;

import ptolemy.actor.Actor;
import ptolemy.actor.CompositeActor;
import ptolemy.actor.IOPort;
import ptolemy.actor.IOPortEvent;
import ptolemy.actor.IOPortEventListener;
import ptolemy.actor.Manager;
import ptolemy.data.IntToken;
import ptolemy.kernel.util.NamedObj;
import ptolemy.moml.MoMLParser;
import ptolemy.actor.lib.io.*;
import ptolemy.actor.kiel.*;

public class ExecutePtolemyModel implements Runnable {
	
	private String PtolemyModel;
	private boolean paused;
	private boolean stop;
	private int makesteps;
	
	public ExecutePtolemyModel(String PtolemyModel) {
		System.out.println("Execution Thread - Constructor");
		this.PtolemyModel = PtolemyModel;
		this.paused = true;
		this.stop = false;
		this.makesteps = 0;
	}
	
	public synchronized void executionStep() {
		System.out.println("Execution Thread - Make Step");
		this.paused = false;
		this.makesteps = this.makesteps ++;
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
                CompositeActor actor = ((CompositeActor) ptolemyModel);

                // get the manager that manages execution
                Manager manager = actor.getManager();
                // there is likely no manager available, hence create a new one
                if (manager == null) {
                    manager = new Manager(actor.workspace(), "kieler manager");
                    actor.setManager(manager);
                }

                // inject listeners to the data to the model such that we get
                // our hands on the execution data
                Iterator<Object> childrenIterator = actor.containedObjectsIterator();
                while( childrenIterator.hasNext() ){
                    Object child = childrenIterator.next();
                	//search for KielerIO ports
                    if(child instanceof KielerIO){
                    	KielerIO kielerIO = (KielerIO)child;
                    	System.out.println(kielerIO.getSignalName());
                    	kielerIO.setValue(2);
                    	kielerIO.setPresent(true);
                    	kielerIO.setPermanent(true);
                    }
                	
                    // search output ports of any child actors
                    if(child instanceof Actor){
                        List<Object> ports = ( (Actor)child ).outputPortList(); 
                        for (Object port : ports) {
                            if(port instanceof IOPort){
                                // found an output port, so add a listener to it
                                ( (IOPort)port ).addIOPortEventListener( new IOPortEventListener(){
                                    public void portEvent(IOPortEvent event) {
                                        System.out.print("IOPortEvent: ");
                                        System.out.print("Port: "+event.getPort().getFullName());
                                        System.out.print(" Token: "+event.getToken());
                                        System.out.println();
                                    }
                                });
                            }
                        }                        
                    }
                }

        		System.out.println("Execution Thread - Run 2");

                // run the model
                if (manager != null) {
                    List<Actor> children = actor.getChildren();
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
                    	
                    	if ((this.makesteps == -1)||
                    		(this.makesteps > 0)) {
                    		if (makesteps > 0) makesteps--;
                    		manager.iterate();
                    	}
                        //((IOPort)actor.portList().get(0)).send(0, new IntToken(8));

                    }
                    // calling manager.execute() would run the model
                    // for the amount of iterations set in the director
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
}
