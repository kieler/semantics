package de.cau.cs.kieler.sim.kiem.execution;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;

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
		this.timeout = 5000;
	}
	
	public synchronized void timeout(int timeout,
						String jobDescription,
						DataComponentEx dataComponentEx,
						Execution execution) {
		this.timeout = timeout;
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
		System.out.println("Timeout - thread started");
		while(!terminate) {

			synchronized(this) {
				try{this.wait();}catch(Exception e){}
			}
			
			System.out.println("Timeout - started");

			while (!terminate && active) {
				try{Thread.sleep(this.timeout/100);}catch(Exception e){}
				if (this.abort) {
					System.out.println("Timeout - aborted");
					//timeout aborted
					this.active = false;
				}
				else if (System.currentTimeMillis() > stopTime) {
					System.out.println("Timeout - catched !!!");
					//timeout
					this.execution.showError(
							"Timeout of component '"+dataComponentEx.getName()+
							"' occurred while performing the following operation: "
							+this.jobDescription, KiemPlugin.PLUGIN_ID);
					this.execution.errorTerminate();
					return;
				}
			}//end while active
		}//next while not terminated
	}
	
}
