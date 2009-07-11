package de.cau.cs.kieler.sim.kiem.execution;

import java.util.List;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.extension.DataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.json.*;
import de.cau.cs.kieler.sim.kiem.views.KiemView;

public class Execution implements Runnable {
	
	private int aimedStepDuration;
	private boolean stop;
	private List<DataComponent> dataComponentList;
	private long steps;
	private int stepDuration;
	private int maximumStepDuration;
	private int minimumStepDuration;
	private int weightedAverageStepDuration;
	private long accumulatedStepDurations;
	private long accumulatedPlauseDurations;
	private long executionStartTime;
	private long stepCounter;
	private ConsumerExecution[] consumerExecutionArray;
	private ProducerExecution[] producerExecutionArray;
	private KiemView parent; //for errors
	private JSONDataPool dataPool;
	
	private static final int PAUSE_DEYLAY = 50; //in ms
	
	public Execution(List<DataComponent> dataComponentList,
					 KiemView parent) {
		this.parent = parent;
		this.stepDuration = KiemPlugin.AIMED_STEP_DURATION_DEFAULT;
		this.stop = false; 
		this.steps = 0; // == paused
		this.dataComponentList = dataComponentList;
		
		this.dataPool = new JSONDataPool();
		
		consumerExecutionArray = new ConsumerExecution[this.dataComponentList.size()];
		producerExecutionArray = new ProducerExecution[this.dataComponentList.size()];
		
		//for each pure consumer ... create ConsumerExecution Thread
		//for each pure producer ... create ProducerExecution Thread
		for (int c = 0; c < dataComponentList.size(); c++) {
			DataComponent dataComponent = dataComponentList.get(c);
			if (dataComponent.isEnabled()) {
				if(dataComponent.isPureConsumer()) {
					//pure Consumer
					consumerExecutionArray[c] = new ConsumerExecution(dataComponent);
					(new Thread(consumerExecutionArray[c])).start();
				}
				else if(dataComponent.isPureProducer()) {
					//pure Producer
					producerExecutionArray[c] = new ProducerExecution(dataComponent);
					(new Thread(producerExecutionArray[c])).start();
				}
			}
		}
		
	}
	
	public int getStepDuration() {
		return stepDuration;
	}	
	public int getMaximumStepDuration() {
		return maximumStepDuration;
	}	
	public int getMinimumStepDuration() {
		return minimumStepDuration;
	}	
	public int getWeightedAverageStepDuration() {
		return weightedAverageStepDuration;
	}	
	public int getAverageStepDuration() {
		return (int)(this.accumulatedStepDurations/this.stepCounter);
	}	
	public long getExecutionStartTime() {
		return executionStartTime;
	}	
	public long getExecutionDurantion() {
		return 	System.currentTimeMillis() 
				- executionStartTime 
				- accumulatedPlauseDurations;
	}
	public long getSteps() {
		return this.stepCounter;
	}
	
	public void setAimedStepDuration(int aimedStepDuration) {
		this.aimedStepDuration = aimedStepDuration;
	}
	
	public int getAimedStepDuration() {
		return this.aimedStepDuration;
	}
	
	public synchronized int stepExecution() {
		if (this.steps > 0) {
			return -1;
		}
		else {
			this.steps = 1;
			return stepDuration;
		}
	}
	
	public synchronized void pauseExecution() {
		this.steps = 0;
	}
	
	private void resetTimingVariables() {
		this.executionStartTime = System.currentTimeMillis();
		this.maximumStepDuration = 0; 
		this.minimumStepDuration = -1; //infinity
		this.weightedAverageStepDuration = 0;
		this.accumulatedStepDurations = 0;
		this.accumulatedPlauseDurations = 0;
		this.stepCounter = 0;
		this.stepDuration = 0;
	}
	
	public synchronized void runExecution() {
		this.steps = -1; //indicates run mode
	}
	
	public boolean isPaused() {
		return (steps == 0);
	}

	public boolean isRunning() {
		return (steps == -1);
	}
	
	public void stopExecution() {
		//not synchronized to stop immediately w/o queuing
		this.stop = true;
		this.steps = 0;
		
		synchronized(this) {
			//for safety reasons do this synchronized again
			this.stop = true;
			this.steps = 0;
			//stop all child execution threads
			for (int c = 0; c < this.dataComponentList.size(); c++) {
				//reset delta index
				this.dataComponentList.get(c).deltaIndex = 0;
				if (this.consumerExecutionArray[c] != null)
					this.consumerExecutionArray[c].stopExecution();
				if (this.producerExecutionArray[c] != null)
					this.producerExecutionArray[c].stopExecution();
			}
		}
		
	}
	
	public void run() {
		synchronized(this) {
			resetTimingVariables();
		}
		
		while (!this.stop) {
			
			long starttime = System.currentTimeMillis();
			long endtime   = System.currentTimeMillis();
			
			synchronized(this) {
				//test if we have to make a step (1) or if we are in running mode (-1)
				if ((steps == -1)||(steps > 0)) {
					//make a tick
					this.stepCounter++;
					
					//reduce number of steps
					if (steps > -1) steps--;
					System.out.println("-- execution step -------------------------------");
					try {
						System.out.println("DATA POOL: "+this.dataPool.getData(null).toString());
					}catch(Exception e){e.printStackTrace();}

					//call all pure producers first
					for(int c = 0; c < this.dataComponentList.size(); c++) {
						DataComponent dataComponent = 
							dataComponentList.get(c);
						if (dataComponent.isEnabled() && 
							dataComponent.isPureProducer()) {
								System.out.println(c + ") " + dataComponent.getName() + " (Pure Producer) call");
								producerExecutionArray[c].setDone(false);
								producerExecutionArray[c].step();
						}
					}//next producer/consumer
					
					//make a step - according to the dataComponentList order
					for(int c = 0; c < this.dataComponentList.size(); c++) {
						DataComponent dataComponent = 
							dataComponentList.get(c);
						if (!dataComponent.isEnabled()) continue;
						
						if (dataComponent.isProducerConsumer()) {
							System.out.println(c + ") " +dataComponent.getName() + " (Norm Producer) call");
							//Consumer AND Producer => blocking
							try {
								JSONObject oldData;
								String[] filterKeys = dataComponent.getFilterKeys();
								if (dataComponent.isDeltaConsumer()) {
									oldData = this.dataPool.getDeltaData(filterKeys,dataComponent.deltaIndex);
								}
								else
									oldData = this.dataPool.getData(filterKeys);
								if (dataComponent.isJSON()) {
									JSONObject newData = ((JSONObjectDataComponent)dataComponent).step(oldData);
									if (newData != null)
										this.dataPool.putData(newData);
								}
								else {
									String newData = ((JSONStringDataComponent)dataComponent).step(oldData.toString());
									if (newData != null && newData != "") 
										this.dataPool.putData(new JSONObject(newData));
								}
								//memorize last delta index
								if (dataComponent.isDeltaConsumer())
									dataComponent.deltaIndex = this.dataPool.getPoolCounter();
							}catch(Exception e) {
								e.printStackTrace();
							}
							System.out.println(dataComponent.getName() + " (Norm Producer) return");
						}
						else if(dataComponent.isPureConsumer()) {
								System.out.println(c + ") " +dataComponent.getName() + " (Pure Consumer) call");
								//pure Consumer
								//set current data
								try {
									String[] filterKeys = dataComponent.getFilterKeys();
									JSONObject oldData;
									if (dataComponent.isDeltaConsumer()) {
										oldData = this.dataPool.getDeltaData(filterKeys,dataComponent.deltaIndex);
									}
									else
										oldData = this.dataPool.getData(filterKeys);
									consumerExecutionArray[c].setData(oldData);
									//memorize last delta index
									if (dataComponent.isDeltaConsumer())
										dataComponent.deltaIndex = this.dataPool.getPoolCounter();
								}catch(Exception e){
									e.printStackTrace();
								}
								//call async method
								//if (consumerExecutionArray[c].isDone())
									consumerExecutionArray[c].step();
								//else
								//	System.out.println("  SKIPPED - NOT READY YET");
									
						}
						else if(dataComponent.isPureProducer()) {
								System.out.println(c + ") " +dataComponent.getName() + " (Pure Producer) wait");
								//pure Producer
								//get blocking result
								while (!producerExecutionArray[c].isDone()) {
									if (this.stop == true) return;
									Thread.yield();
								}
								System.out.println(c + ") " +dataComponent.getName() + " (Pure Producer) done");
								//TODO: reasonable data
								try {
									JSONObject newData = producerExecutionArray[c].getData();
									if (newData != null) 
										this.dataPool.putData(newData);
								}catch(Exception e){
									e.printStackTrace();
								}
								
						}
					}//next producer/consumer
					//calculate execution timings (and current step Duration)
					endtime = System.currentTimeMillis();
					this.stepDuration = (int)(endtime - starttime);
					if (this.maximumStepDuration < this.stepDuration) {
						this.maximumStepDuration = this.stepDuration;
					}
					if ((this.minimumStepDuration > this.stepDuration)||
						(this.minimumStepDuration == -1)){
							this.minimumStepDuration = this.stepDuration;
					}
					if (this.weightedAverageStepDuration == 0) {
						//frist tick
						this.weightedAverageStepDuration = this.stepDuration;
					}
					else {
						//other ticks
						this.weightedAverageStepDuration = (this.weightedAverageStepDuration + this.stepDuration)/2;
					}
					this.accumulatedStepDurations += this.stepDuration;
				}//end if - make a step
			}//end synchronized

			//escape if stopped
			if (this.stop == true) return;

			//delay if time of step is left (in run mode only)
			if (steps == -1) {
				int timeToDelay = this.aimedStepDuration - this.stepDuration;
				if (timeToDelay > 0)
					try{Thread.sleep(timeToDelay);}catch(Exception e){}
			}	
			
			//escape if stopped
			if (this.stop == true) return;
			
			//delay while paused
			while (steps == 0) {
				starttime = System.currentTimeMillis();
				//System.out.println(">>PAUSED<<");
				try{Thread.sleep(PAUSE_DEYLAY);}catch(Exception e){}
				//if stop is requested, jump out
				if (this.stop) return;
				endtime = System.currentTimeMillis();
				accumulatedPlauseDurations += endtime - starttime;
			}
			
		}//next while not stop
	}

}
