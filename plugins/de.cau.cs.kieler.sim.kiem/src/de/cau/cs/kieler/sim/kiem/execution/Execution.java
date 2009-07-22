package de.cau.cs.kieler.sim.kiem.execution;

import java.util.List;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.json.*;
import de.cau.cs.kieler.sim.kiem.views.KiemView;

public class Execution implements Runnable {
	
	//delay to wait in paused state until
	private static final int PAUSE_DEYLAY = 50;   //in ms
	
	//defines the number of steps in ...
	private static final int INFINITY_STEPS = -1; //...run mode
	private static final int NO_STEPS = 0;        //...pause mode

	//basic data component list of all enabled (and disabled)
	//data components
	private List<DataComponentEx> dataComponentExList;
	
	//intended duration of a step
	private int aimedStepDuration;

	//the steps left to perform
	//can be NO_STEPS in pause mode
	//    or INFINITY_STEPS in run mode
	private long steps;
	
	//flag that indicates the termination (from outside)
	private boolean stop;
	
	//time measurement
	private int stepDuration;
	private int maximumStepDuration;
	private int minimumStepDuration;
	private int weightedAverageStepDuration;
	private long accumulatedStepDurations;
	private long accumulatedPlauseDurations;
	private long executionStartTime;
	
	//each step advance the counter
	private long stepCounter;

	//the data pool
	private JSONDataPool dataPool;
	
	//threads for Observers and producers
	private ObserverExecution[] ObserverExecutionArray;
	private ProducerExecution[] producerExecutionArray;
	
	//KiemView to control execution
	KiemView view;

	
	public Execution(List<DataComponentEx> dataComponentExList,
					 KiemView view) {
		this.view = view;
		this.stepDuration = KiemPlugin.AIMED_STEP_DURATION_DEFAULT;
		this.stop = false; 
		this.steps = NO_STEPS; // == paused
		this.dataComponentExList = dataComponentExList;
		
		this.dataPool = new JSONDataPool();
		
		ObserverExecutionArray = new ObserverExecution
										[this.dataComponentExList.size()];
		producerExecutionArray = new ProducerExecution
										[this.dataComponentExList.size()];
		
		//for each pure Observer ... create ObserverExecution Thread
		//for each pure producer ... create ProducerExecution Thread
		for (int c = 0; c < dataComponentExList.size(); c++) {
			DataComponentEx dataComponentEx = dataComponentExList.get(c);
			if (dataComponentEx.isEnabled()) {
				if(dataComponentEx.isObserverOnly()) {
					//pure Observer
					ObserverExecutionArray[c] = 
								new ObserverExecution(dataComponentEx.getDataComponent());
					(new Thread(ObserverExecutionArray[c])).start();
				}
				else if(dataComponentEx.isProducerOnly()) {
					//pure Producer
					producerExecutionArray[c] = 
								new ProducerExecution(dataComponentEx.getDataComponent(), this);
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
	
	public void stepExecution() {
		synchronized(this) {
			if (this.steps == NO_STEPS) {
				//notify components
				for(int c = 0; c < this.dataComponentExList.size(); c++) {
					DataComponentEx dataComponentEx = 
						dataComponentExList.get(c);
					if (   dataComponentEx.isEnabled()
						&& dataComponentEx.isPauseFlag()) {
						dataComponentEx.getDataComponent().commandStep();
					}
				}
				//make one step
				//note that consecutive calls will be enqueued into the
				//implicit condition variable's queue of this monitor
				this.steps = 1;
			}
			else 
				return; //skip in this case make NO step
		}
	}

	public void macroStepExecution() {
		//TODO: implement macro step execution!!!
		synchronized(this) {
			if (this.steps == NO_STEPS) {
				//notify components
				for(int c = 0; c < this.dataComponentExList.size(); c++) {
					DataComponentEx dataComponentEx = 
						dataComponentExList.get(c);
					if (   dataComponentEx.isEnabled()
						&& dataComponentEx.isPauseFlag()) {
						dataComponentEx.getDataComponent().commandMacroStep();
					}
				}
				//make one step
				//note that consecutive calls will be enqueued into the
				//implicit condition variable's queue of this monitor
				this.steps = 1;
			}
			else 
				return; //skip in this case make NO step
		}
	}
	
	public void pauseExecution() {
		synchronized(this) {
			//notify components
			for(int c = 0; c < this.dataComponentExList.size(); c++) {
				DataComponentEx dataComponentEx = 
					dataComponentExList.get(c);
				if (   dataComponentEx.isEnabled()
					&& dataComponentEx.isPauseFlag()) {
					dataComponentEx.getDataComponent().commandPause();
				}
			}

			this.steps = NO_STEPS;
		}
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
			//notify components
			for(int c = 0; c < this.dataComponentExList.size(); c++) {
				DataComponentEx dataComponentEx = 
					dataComponentExList.get(c);
				if (   dataComponentEx.isEnabled()
					&& dataComponentEx.isPauseFlag()) {
					dataComponentEx.getDataComponent().commandStop();
				}
			}
			
			//for safety reasons do this synchronized again
			this.stop = true;
			this.steps = NO_STEPS;
			//stop all child execution threads
			for (int c = 0; c < this.dataComponentExList.size(); c++) {
				//reset delta index
				this.dataComponentExList.get(c).setDeltaIndex(0);
				//reset skipped
				this.dataComponentExList.get(c).setSkipped(false);
				if (this.ObserverExecutionArray[c] != null)
					this.ObserverExecutionArray[c].stopExecution();
				if (this.producerExecutionArray[c] != null)
					this.producerExecutionArray[c].stopExecution();
			}
		}
		//wrapup components
		wrapupComponents();
	}
	
	public synchronized void wrapupComponents() {
		for(int c = 0; c < this.dataComponentExList.size(); c++) {
			DataComponentEx dataComponentEx = 
				dataComponentExList.get(c);
			if (dataComponentEx.isEnabled()) {
				dataComponentEx.getDataComponent().wrapup();
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
				//test only if we have to make a step (1) or if we are 
				//in running mode (-1)
				if ((steps == INFINITY_STEPS)||(steps > NO_STEPS)) {
					//iff any isPauseFlag() returns true, pause execution
					for(int c = 0; c < this.dataComponentExList.size(); c++) {
						DataComponentEx dataComponentEx = 
							dataComponentExList.get(c);
						if (   dataComponentEx.isEnabled()
							&& dataComponentEx.isPauseFlag()) {
							this.pauseExecution();
							view.updateViewAsync();
						}
					}
				}

				//test if we have to make a step (1) or if we are 
				//in running mode (-1)
				if ((steps == INFINITY_STEPS)||(steps > NO_STEPS)) {
					//make a tick
					this.stepCounter++;
					view.updateStepsAsync();
					
					//this is the data pool index which will be
					//referred to for this step
					//(or if any Observer is skipped in the next steps
					// it will refer to this counter index later on!)
					for(int c = 0; c < this.dataComponentExList.size(); c++) {
						//call all pure producers first
						DataComponentEx dataComponentEx = 
							dataComponentExList.get(c);
						if (   dataComponentEx.isEnabled()
							&& dataComponentEx.isDeltaObserver()
							&&   (!dataComponentEx.getSkipped()
							    ||!dataComponentEx.isDeltaObserver())
							){
							//advance delta counter for all *NOT* skipped 
							//components
							//or any that are *NOT* deltaObservers!
							dataComponentEx.setDeltaIndex
												(dataPool.getPoolCounter());
						 }
					}
					
					//reduce number of steps
					if (steps > INFINITY_STEPS) steps--;
//System.out.println("-- execution step -------------------------------");

					//===========================================//
					//==  P U R E    P R O D U C E R    (CALL) ==//
					//===========================================//
					for(int c = 0; c < this.dataComponentExList.size(); c++) {
						//call all pure producers first
						DataComponentEx dataComponentEx = 
							dataComponentExList.get(c);
						if (dataComponentEx.isEnabled() && 
							dataComponentEx.isProducerOnly()) {
//System.out.println(c + ") " + dataComponentEx.getName() + " (Pure Producer) call");
								//make a step (within producerExecution's monitor)
								producerExecutionArray[c].blockingStep();
						}
					}//next producer/Observer
					
					//make a step - according to the dataComponentExList order
					for(int c = 0; c < this.dataComponentExList.size(); c++) {
						DataComponentEx dataComponentEx = 
							dataComponentExList.get(c);
						if (!dataComponentEx.isEnabled()) continue;
						
						//===========================================//
						//==  C O N S U M E R  /  P R O D U C E R  ==//
						//===========================================//
						if (dataComponentEx.isProducerObserver()) {
//System.out.println(c + ") " +dataComponentEx.getName() + " (Norm Producer) call");
							//Observer AND Producer => blocking
							try {
								JSONObject oldData;
								String[] filterKeys = 
									dataComponentEx.getFilterKeys();
								//if (dataComponentEx.isDeltaObserver()) {
									oldData = this.dataPool.getDeltaData
										 (filterKeys,dataComponentEx.getDeltaIndex());
								//}
								//else
								//	oldData = this.dataPool.getData(filterKeys);
								if (dataComponentEx.isJSON()) {
									JSONObject newData = 
										((JSONObjectDataComponent)dataComponentEx.getDataComponent())
										.step(oldData);
									if (newData != null)
										this.dataPool.putData(newData);
								}
								else {
									String newData = 
										((JSONStringDataComponent)dataComponentEx.getDataComponent())
										.step(oldData.toString());
									if (newData != null && newData != "") 
										this.dataPool.putData(
													   new JSONObject(newData));
								}
							}catch(Exception e) {
								e.printStackTrace();
							}
//System.out.println(dataComponentEx.getName() + " (Norm Producer) return");
						}
						//===========================================//
						//==       P U R E    C O N S U M E R      ==//
						//===========================================//
						else if(dataComponentEx.isObserverOnly()) {
//System.out.println(c + ") " +dataComponentEx.getName() + " (Pure Observer) call");
								//pure Observer
								//set current data
								try {
									String[] filterKeys = 
											dataComponentEx.getFilterKeys();
									JSONObject oldData;
									//if (dataComponentEx.isDeltaObserver()) {
										oldData = this.dataPool.getDeltaData
										  (filterKeys,dataComponentEx.getDeltaIndex());
									//}
									//else
									//	oldData = this.dataPool
									//	  .getData(filterKeys);
									ObserverExecutionArray[c].setData(oldData);
								}catch(Exception e){
									e.printStackTrace();
								}
								//call async method 
								if (!(ObserverExecutionArray[c].step())) {
									//if step was *NOT* successful (skipped)
									//set skipped:=true this prevents the delta
									//index to advance in the next steps!
									dataComponentEx.setSkipped(true);
								}
								else
									dataComponentEx.setSkipped(false);
						}
						//===========================================//
						//==  P U R E    P R O D U C E R    (REAP) ==//
						//===========================================//
						else if(dataComponentEx.isProducerOnly()) {
//System.out.println(c + ") " +dataComponentEx.getName() + " (Pure Producer) wait");
								//pure Producer
								//get blocking result
								producerExecutionArray[c].blockingWaitUntilDone();
								//now reap the results
								//note that due to sequential order we always FIRST
								//reap the producer and only in the next iteration
								//THEN call him again
								if (this.stop == true) return;
//System.out.println(c + ") " +dataComponentEx.getName() + " (Pure Producer) done");
								try {
									JSONObject newData = 
										producerExecutionArray[c].getData();
									if (newData != null) 
										this.dataPool.putData(newData);
								}catch(Exception e){
									e.printStackTrace();
								}
								
						}
					}//next producer/Observer
					
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
