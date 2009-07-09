package de.cau.cs.kieler.sim.kiem.execution;

import de.cau.cs.kieler.sim.kiem.extension.DataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.json.*;

public class ProducerExecution implements Runnable {
	
	private boolean done;
	private boolean doneInternal;
	private boolean stop;
	private boolean error;
	private DataComponent dataComponent;
	private JSONObject data;
	
	public ProducerExecution(DataComponent dataComponent) {
		this.stop = false; 
		this.done = false; 
		this.doneInternal = true;
		this.error = false;
		this.data = null;
		this.dataComponent = dataComponent;
	}
	
	public synchronized void step() {
		if (doneInternal) {
			doneInternal = false;
			this.notify();
		}
	}

	public boolean isDone() {
		return this.done;
	}
	public synchronized void setDone(boolean done) {
		this.done = done;
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

			//caller must ensure that done == false (before)
			if (!done) {
				System.out.println("  "+dataComponent.getName() + " (Pure Producer) calc start");
				//do asynchronous call
				if (this.dataComponent.isJSON()) {
					JSONObjectDataComponent compJSON = 
						(JSONObjectDataComponent)dataComponent;
					//do not send any data cause this is a producer only
					this.data = compJSON.step(null);
				}
				else {
					JSONStringDataComponent compString = 
						(JSONStringDataComponent)dataComponent;
					//do not send any data cause this is a producer only
					String JSONString = compString.step(null);
					if (JSONString != null) {
						try {
							this.data = new JSONObject(JSONString);
						}catch(Exception e) {
							e.printStackTrace();
							this.error = true;
						}
					}//not null
				}
				//now we got the result and are done
				synchronized(this) {
					this.doneInternal = true;
					this.done = true;
				}
			}//end if not done
			
			System.out.println("  "+dataComponent.getName() + " (Pure Producer) calc end");
			
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
