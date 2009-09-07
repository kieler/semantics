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

package de.cau.cs.kieler.sim.mobile.tablemaster;

import de.cau.cs.kieler.sim.kiem.extension.IJSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

/**
 * The DataComponentObserver of the mobile table master plug-in implements the
 * KIEM observer extension point and is responsible for notifying the remote
 * data table unit whenever it gets new or updated data from the Execution 
 * Manager.  <BR>
 * Within its step method also the current an total steps are enclosed in the
 * JSON string assuming that the key "_KIEMExecutionSteps" is NOT used
 * elsewhere. The data is send to the remote table unit with either a preceding
 * "P" indicating a present step or a preceding "H" indicating a history step.
 * For the sending the TCPServer's print methods are used. During the 
 * initialization the interface variables are also being sent to the remote
 * unit.  
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 *
 */
public class DataComponentObserver extends JSONStringDataComponent implements
		IJSONStringDataComponent {

	/** The current step of the execution. */
	private long currentStep;
	
	/** The total steps of the execution. */
	private	long totalSteps;
	
	/** The executing flag indicating a running execution. */
	private boolean executing;
	
	/** The one and only instance of the observer (not multi-instantiable). */
	private static DataComponentObserver instance;

	//-------------------------------------------------------------------------
	
	/**
	 * This method returns the one and only instance of this observer 
	 * DataComponent. 
	 * 
	 * @return the instance
	 */
	public static DataComponentObserver getInstance() {
		return instance;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * Instantiates a new DataComponentObserver.
	 */
	public DataComponentObserver() {
		instance = this;
	}
	
	//-------------------------------------------------------------------------
	
	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#notifyStep(long, long)
	 */
	@Override
	public void notifyStep(long currentStep, long totalSteps) {
		//update the local currentStep and totalSteps variables that are send
		//in each step() method call
		this.currentStep = currentStep;
		this.totalSteps = totalSteps;
	}

	//-------------------------------------------------------------------------
	
	public String step(String jSONString) throws KiemExecutionException {
		JSONObject object = null;
		try{
			//try to accumulate/enclose the currenStep information under the
			//"_KIEMExecutionSteps" JSON key
			object = new JSONObject(jSONString);
			String stepsString = currentStep+"/"+totalSteps;
			if (currentStep == totalSteps)
				stepsString = currentStep+"";
			object.accumulate("_KIEMExecutionSteps",stepsString);
		}catch(Exception e){}
		String type = "P"; //present step
		if (this.isHistoryStep()) type = "H"; //history step
		String inData = type + object.toString();
		//finally send this as one line with the help of the TCPServer
		//(this may rise an error)
		try {
			DataComponentMaster.tcpServer.println(inData);
		}catch(Exception e) {
			new KiemExecutionException("Cannot send data to remote table", 
										false, e);
		}
		return null;
	}

	//-------------------------------------------------------------------------
	
	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#initialize()
	 */
	public void initialize() throws KiemInitializationException {
		//set the executing flag to true
		executing = true;
		JSONObject object = new JSONObject();
		String[] interfaceKeys = this.getInterfaceKeys();
		if (interfaceKeys == null) return;
		//enclose the interface keys for the remote table unit
		for (int c = 0; c < interfaceKeys.length; c++) {
			try {
				object.accumulate(""+c, interfaceKeys[c]);
			}catch(Exception e) {
				throw new KiemInitializationException(
						"Cannot marshall interface keys", true, e);
			}
		}
		DataComponentMaster.tcpServer.println("I"+object.toString());
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isObserver()
	 */
	public boolean isObserver() {
		//this is an observer only
		return true;
	}
	
	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.DataComponent#isHistoryObserver()
	 */
	public boolean isHistoryObserver() {
		//this is also a history observer
		return true;
	}

	//-------------------------------------------------------------------------

	public boolean isDeltaObserver() {
		//we are only interested in delta data
		return true;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#isProducer()
	 */
	public boolean isProducer() {
		//we do not produce any data
		return false;
	}

	//-------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see de.cau.cs.kieler.sim.kiem.extension.IDataComponent#wrapup()
	 */
	public void wrapup() throws KiemInitializationException {
		//set the executing flag to false
		executing = false;
	}
	
	//-------------------------------------------------------------------------

	/**
	 * This method can be used to check whether the execution of the KIELER
	 * Execution Manager is currently running or stopped.
	 *  
	 * @return true, if execution is running
	 */
	public boolean isExecuting() {
		return executing;
	}

}
