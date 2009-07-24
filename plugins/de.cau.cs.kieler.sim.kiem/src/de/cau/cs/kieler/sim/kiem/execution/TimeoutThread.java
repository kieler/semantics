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
import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;

/**
 * The Class TimeoutThread.
 */
public class TimeoutThread extends Thread {

	private int timeout;
	private boolean active;
	private Execution execution;
	private long startTime, stopTime;
	private boolean abort;
	private String jobDescription;
	private DataComponentEx dataComponentEx;
	private boolean terminate;
	
	public TimeoutThread() {
		this.active = false;
		this.timeout = 0;
	}
	
	public synchronized void timeout(int timeout,
						String jobDescription,
						DataComponentEx dataComponentEx,
						Execution execution) {
		this.timeout = timeout;
		//ensure timeout is reasonable!
		if (this.timeout < 100) this.timeout = 100;
		this.execution = execution;
		this.abort = false;
		this.jobDescription = jobDescription;
		this.dataComponentEx = dataComponentEx;
		this.active = true;
		startTime = System.currentTimeMillis();
		stopTime  = this.startTime + this.timeout;
		this.notifyAll();
	}

	public void abortTimeout() {
		this.abort = true;
	}
	
	public synchronized void terminate() {
		this.terminate = true;
		this.notifyAll();
	}
	
	public void run() {
//System.out.println("Timeout - thread started");
		while(!terminate) {

			synchronized(this) {
				//only fall asleep if non-active
				//this prevents waiting when abortTimeout not was called
				//before a new call of the timeout method 
				if (!this.active)
					try{this.wait();}catch(Exception e){}
				//at this point timeout() was called and this.timeout has
				//a value > 100
			}
			
//System.out.println("Timeout - started");

			while (!terminate && active) {
				try{Thread.sleep(this.timeout/100);}catch(Exception e){}
				if (this.abort) {
//System.out.println("Timeout - aborted");
					//timeout aborted
					this.active = false;
				}
				else if (System.currentTimeMillis() > stopTime) {
//System.out.println("Timeout - catched !!!");
					//timeout
					this.execution.showError(
							"Timeout of component '"+dataComponentEx.getName()+
							"' occurred while performing the following operation: "
							+this.jobDescription, KiemPlugin.PLUGIN_ID,
							null);
					this.execution.errorTerminate();
					return;
				}
			}//end while active
		}//next while not terminated
	}
	
}
