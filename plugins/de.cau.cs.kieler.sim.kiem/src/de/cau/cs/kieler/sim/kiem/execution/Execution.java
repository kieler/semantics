package de.cau.cs.kieler.sim.kiem.execution;

import java.util.List;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.extension.DataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.json.*;

public class Execution implements Runnable {
	
	//delay to wait in paused state until
	private static final int PAUSE_DEYLAY = 50;   //in ms
	
	//defines the number of steps in ...
	private static final int INFINITY_STEPS = -1; //...run mode
	private static final int NO_STEPS = 0;        //...pause mode
	
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
	private JSONDataPool dataPool;

	
	public Execution(List<DataComponent> dataComponentList) {
		this.stepDuration = KiemPlugin.AIMED_STEP_DURATION_DEFAULT;
		this.stop = false; 
		this.steps = NO_STEPS; // == paused
		this.dataComponentList = dataComponentList;
		
		this.dataPool = new JSONDataPool();
		
		consumerExecutionArray = new ConsumerExecution
										[this.dataComponentList.size()];
		producerExecutionArray = new ProducerExecution
										[this.dataComponentList.size()];
		
		//for each pure consumer ... create ConsumerExecution Thread
		//for each pure producer ... create ProducerExecution Thread
		for (int c = 0; c < dataComponentList.size(); c++) {
			DataComponent dataComponent = dataComponentList.get(c);
			if (dataComponent.isEnabled()) {
				if(dataComponent.isPureConsumer()) {
					//pure Consumer
					consumerExecutionArray[c] = 
								new ConsumerExecution(dataComponent);
					(new Thread(consumerExecutionArray[c])).start();
				}
				else if(dataComponent.isPureProducer()) {
					//pure Producer
					producerExecutionArray[c] = 
								new ProducerExecution(dataComponent, this);
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
		if (this.steps > NO_STEPS) {
			return -1;
		}
		else {
			//make one step
			//note that consecutive calls will be enqueued into the
			//implicit condition variable's queue of this monitor
			this.steps = 1;
			return stepDuration;
		}
	}
	
	public synchronized void pauseExecution() {
		this.steps = NO_STEPS;
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
		this.steps = INFINITY_STEPS; //indicates run mode
	}
	
	public boolean isPaused() {
		return (steps == NO_STEPS);
	}

	public boolean isRunning() {
		return (steps == INFINITY_STEPS);
	}
	
	public void stopExecution() {
		//not synchronized to stop immediately w/o queuing
		this.stop = true;
		this.steps = NO_STEPS;
		
		synchronized(this) {
			//for safety reasons do this synchronized again
			this.stop = true;
			this.steps = NO_STEPS;
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
				//test if we have to make a step (1) or if we are 
				//in running mode (-1)
				if ((steps == INFINITY_STEPS)||(steps > NO_STEPS)) {
					//make a tick
					this.stepCounter++;
					
					//reduce number of steps
					if (steps > INFINITY_STEPS) steps--;
//System.out.println("-- execution step -------------------------------");

					//===========================================//
					//==  P U R E    P R O D U C E R    (CALL) ==//
					//===========================================//
					for(int c = 0; c < this.dataComponentList.size(); c++) {
						//call all pure producers first
						DataComponent dataComponent = 
							dataComponentList.get(c);
						if (dataComponent.isEnabled() && 
							dataComponent.isPureProducer()) {
//System.out.println(c + ") " + dataComponent.getName() + " (Pure Producer) call");
								//make a step (within producerExecution's monitor)
								producerExecutionArray[c].blockingStep();
						}
					}//next producer/consumer
					
					//make a step - according to the dataComponentList order
					for(int c = 0; c < this.dataComponentList.size(); c++) {
						DataComponent dataComponent = 
							dataComponentList.get(c);
						if (!dataComponent.isEnabled()) continue;
						
						//===========================================//
						//==  C O N S U M E R  /  P R O D U C E R  ==//
						//===========================================//
						if (dataComponent.isProducerConsumer()) {
//System.out.println(c + ") " +dataComponent.getName() + " (Norm Producer) call");
							//Consumer AND Producer => blocking
							try {
								JSONObject oldData;
								String[] filterKeys = 
									dataComponent.getFilterKeys();
								if (dataComponent.isDeltaConsumer()) {
									oldData = this.dataPool.getDeltaData
										 (filterKeys,dataComponent.deltaIndex);
								}
								else
									oldData = this.dataPool.getData(filterKeys);
								if (dataComponent.isJSON()) {
									JSONObject newData = 
										((JSONObjectDataComponent)dataComponent)
										.step(oldData);
									if (newData != null)
										this.dataPool.putData(newData);
								}
								else {
									String newData = 
										((JSONStringDataComponent)dataComponent)
										.step(oldData.toString());
									if (newData != null && newData != "") 
										this.dataPool.putData(
													   new JSONObject(newData));
								}
								//memorize last delta index
								if (dataComponent.isDeltaConsumer())
									dataComponent.deltaIndex = 
										this.dataPool.getPoolCounter();
							}catch(Exception e) {
								e.printStackTrace();
							}
//System.out.println(dataComponent.getName() + " (Norm Producer) return");
						}
						//===========================================//
						//==       P U R E    C O N S U M E R      ==//
						//===========================================//
						else if(dataComponent.isPureConsumer()) {
//System.out.println(c + ") " +dataComponent.getName() + " (Pure Consumer) call");
								//pure Consumer
								//set current data
								try {
									String[] filterKeys = 
											dataComponent.getFilterKeys();
									JSONObject oldData;
									if (dataComponent.isDeltaConsumer()) {
										oldData = this.dataPool.getDeltaData
										  (filterKeys,dataComponent.deltaIndex);
									}
									else
										oldData = this.dataPool
										  .getData(filterKeys);
									consumerExecutionArray[c].setData(oldData);
								}catch(Exception e){
									e.printStackTrace();
								}
								//call async method 
								if (consumerExecutionArray[c].step()) {
									//if step was successful (not skipped)
									if (dataComponent.isDeltaConsumer())
										//memorize last delta index
										dataComponent.deltaIndex = 
												this.dataPool.getPoolCounter();
								}
									
						}
						//===========================================//
						//==  P U R E    P R O D U C E R    (REAP) ==//
						//===========================================//
						else if(dataComponent.isPureProducer()) {
//System.out.println(c + ") " +dataComponent.getName() + " (Pure Producer) wait");
								//pure Producer
								//get blocking result
								producerExecutionArray[c].blockingWaitUntilDone();
								//now reap the results
								//note that due to sequential order we always FIRST
								//reap the producer and only in the next iteration
								//THEN call him again
								if (this.stop == true) return;
//System.out.println(c + ") " +dataComponent.getName() + " (Pure Producer) done");
								try {
									JSONObject newData = 
										producerExecutionArray[c].getData();
									if (newData != null) 
										this.dataPool.putData(newData);
								}catch(Exception e){
									e.printStackTrace();
								}
								
						}
					}//next producer/consumer
					
					//calculate execution timings (and current step Duration)
					//do not floor => add 1ms
					endtime = System.currentTimeMillis();
					this.stepDuration = (int)(endtime - starttime) + 1;
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
						this.weightedAverageStepDuration = 
							(this.weightedAverageStepDuration 
														+ this.stepDuration)/2;
					}
					this.accumulatedStepDurations += this.stepDuration;
				}//end if - make a step
			}//end synchronized

			//escape if stopped
			if (this.stop == true) return;

			//delay if time of step is left (in run mode only)
			if (steps == INFINITY_STEPS) {
				int timeToDelay = this.aimedStepDuration - this.stepDuration;
				if (timeToDelay > 0)
					try{Thread.sleep(timeToDelay);}catch(Exception e){}
			}	
			
			//escape if stopped
			if (this.stop == true) return;
			
			//delay while paused
			while (steps == NO_STEPS) {
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
