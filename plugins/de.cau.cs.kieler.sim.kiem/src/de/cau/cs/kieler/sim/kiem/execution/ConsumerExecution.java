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
	private int skipCounter;
	private int skipInit;
	
	public ConsumerExecution(DataComponent dataComponent) {
		this.stop = false; 
		this.done = false; 
		this.error = false;
		this.data = null;
		this.dataComponent = dataComponent;
		//by default, do not skip anything
		this.skipInit = 0;
		this.skipCounter = 0;
	}
	
	public synchronized void step() {
		if (this.skipCounter > 0) {
			//we need to skip
			this.skipCounter--;
		}
		else {
			//we now call asynchronously
			this.skipCounter = this.skipInit;
			//check if we allready done
			if (!done) {
				//deadline missed, count up skipInit
				this.skipInit++;
			}
			else {
				//deadline met 
				this.done = false;
				//awake this thread
				this.notify();
			}
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
			
			//now we got the result and are done
			synchronized(this) {
				this.done = true;
			}
			System.out.println("  "+dataComponent.getName() + " (Pure Consumer) calc end");
			
			//go to sleep
			try {
				synchronized(this){
					this.wait();
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
