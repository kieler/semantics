package de.cau.cs.kieler.sim.kiem.execution;

import de.cau.cs.kieler.sim.kiem.extension.DataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.json.*;

public class ConsumerExecution implements Runnable {
	
	private boolean done;
	private boolean stop;
	private boolean error;
	private DataComponent dataComponent;
	private JSONObject data;
	
	public ConsumerExecution(DataComponent dataComponent) {
		this.stop = false; 
		this.done = true; 
		this.error = false;
		this.data = null;
		this.dataComponent = dataComponent;
	}
	
	
	public synchronized boolean step() {
		//check if we already done
		if (!done) {
			//deadline missed
			System.out.println("  SKIPPED - NOT READY YET");
			return false;
		}
		else {
			System.out.println("  START - READY");
			//deadline met 
			this.done = false;
			//awake this thread
			this.notify();
			return true;
		}
	}

	public JSONObject getData() {
		return this.data;
	}
	public void setData(JSONObject data) {
		this.data = data;
	}

	public void stopExecution() {
		this.stop = true;
	}

	public boolean isError() {
		return this.error;
	}
	
	public void run() {
		while (!this.stop) {
			//go to sleep
			try {
				synchronized(this){
					//now we got the result and are done
					this.done = true;
					System.out.println("  "+dataComponent.getName() + " (Pure Consumer) calc end");
					this.wait();
				}
			}catch(Exception e){
				e.printStackTrace();
				this.error = true;
				this.stop = true;
				this.data = null;
				this.done = true;
			}
			
			try {
				System.out.println("  "+dataComponent.getName() + " (Pure Consumer) calc start");
				//do asynchronous call
				if (this.dataComponent.isJSON()) {
					JSONObjectDataComponent compJSON = 
						(JSONObjectDataComponent)dataComponent;
					//do not send any data cause this is a producer only
					compJSON.step(this.data);
				}
				else {
					JSONStringDataComponent compString = 
						(JSONStringDataComponent)dataComponent;
					//do not send any data cause this is a producer only
					if (this.data != null)
						compString.step(this.data.toString());
					else
						compString.step(null);
				}
			}catch(Exception e){
				e.printStackTrace();
				this.error = true;
				this.stop = true;
				this.data = null;
				this.done = true;
			}
			
		}//next while not stop
	}

}
