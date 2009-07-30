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

package de.cau.cs.kieler.sim.kiem.execution;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.extension.DataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.json.*;

// TODO: Auto-generated Javadoc
/**
 * The Class ObserverExecution.
 *
 * @author Christian Motika <cmot@informatik.uni-kiel.de>
 * 
 */
public class ObserverExecution implements Runnable {
	
	/** The done. */
	private boolean done;
	
	/** The stop. */
	private boolean stop;
	
	/** The data component. */
	private DataComponent dataComponent;
	
	/** The data. */
	private JSONObject data;
	
	/** The parent. */
	private Execution parent;
	
	/**
	 * Instantiates a new observer execution.
	 * 
	 * @param dataComponent the data component
	 * @param parent the parent
	 */
	public ObserverExecution(DataComponent dataComponent,
							 Execution parent) {
		this.stop = false; 
		this.done = true; 
		this.data = null;
		this.parent = parent;
		this.dataComponent = dataComponent;
	}
	
	/**
	 * Step.
	 * 
	 * @return true, if successful
	 */
	public synchronized boolean step() {
		//check if we already done
		if (!done) {
			//deadline missed
//System.out.println("  SKIPPED - NOT READY YET");
			return false;
		}
		else {
//System.out.println("  START - READY");
			//deadline met 
			this.done = false;
			//awake this thread
			this.notify();
			return true;
		}
	}

	/**
	 * Gets the data.
	 * 
	 * @return the data
	 */
	public JSONObject getData() {
		return this.data;
	}
	
	/**
	 * Sets the data.
	 * 
	 * @param data the new data
	 */
	public void setData(JSONObject data) {
		this.data = data;
	}

	/**
	 * Stop execution.
	 */
	public void stopExecution() {
		this.stop = true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		while (!this.stop) {
			//go to sleep
			try {
				synchronized(this){
					//now we got the result and are done
					this.done = true;
//System.out.println("  "+dataComponent.getName() + " (Pure Observer) calc end");
					this.wait();
				}}
				catch(Exception e) {
					parent.showError(
							null, 
							this.dataComponent.getPluginId(),
							e);
				}
			
			try {
//System.out.println("  "+dataComponent.getName() + " (Pure Observer) calc start");
				//do asynchronous call
				if (this.dataComponent instanceof JSONObjectDataComponent) {
					JSONObjectDataComponent compJSON = 
						(JSONObjectDataComponent)dataComponent;
					//do not use any response data cause this is an 
					//observer only
					try {
						compJSON.step(this.data);
					}catch(KiemExecutionException e) {
						KiemPlugin.getDefault().handleComponentError(
						 dataComponent, e);
					}
				}
				else {
					JSONStringDataComponent compString = 
						(JSONStringDataComponent)dataComponent;
					//do not use any response data cause this is an 
					//observer only
					try {
						if (this.data != null)
							compString.step(this.data.toString());
						else
							compString.step(null);
					}catch(KiemExecutionException e) {
						KiemPlugin.getDefault().handleComponentError(
						 dataComponent, e);
					}
				}}
				catch(Exception e) {
					parent.showWarning(null, 
							this.dataComponent.getPluginId(),
							e);
				}
			
		}//next while not stop
	}

}
