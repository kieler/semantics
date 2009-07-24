/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/

package de.cau.cs.kieler.sim.kiem.execution;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.json.*;
import de.cau.cs.kieler.sim.kiem.views.KiemView;

/**
 * The Class Execution. This is the base class for the whole execution.
 * It creates and manages the worker threads for pure observer and pure
 * producer components. It also implements the scheduling between all
 * components. Additionally it manages a timeout component that checks
 * whether a component-method exceeds the maximum timeout and then terminates
 * all executions w/ an error log message.
 */
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
	
	//indicates paused command
	private boolean pausedCommand;
	
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
	private ObserverExecution[] observerExecutionArray;
	private ProducerExecution[] producerExecutionArray;
	
	//KiemView to control execution
	//KiemView view;
	
	//Timeout
	TimeoutThread timeout;
	private static final int TIMEOUT = 1000; //1 second

	//-------------------------------------------------------------------------

	/**
	 * Instantiates a new execution (thread). 
	 * 
	 * @param dataComponentExList the data component ex list
	 * @param view the view
	 */
	public Execution(List<DataComponentEx> dataComponentExList) {
		this.stepDuration = KiemPlugin.AIMED_STEP_DURATION_DEFAULT;
		this.stop = false;
		this.pausedCommand = false;
		this.steps = NO_STEPS; // == paused
		this.dataComponentExList = dataComponentExList;
		
		this.dataPool = new JSONDataPool();
		
		this.timeout = new TimeoutThread();
		this.timeout.start();
		
		observerExecutionArray = new ObserverExecution
										[this.dataComponentExList.size()];
		producerExecutionArray = new ProducerExecution
										[this.dataComponentExList.size()];
		
		//for each pure Observer ... create ObserverExecution Thread
		//for each pure producer ... create ProducerExecution Thread
		for (int c = 0; c < dataComponentExList.size(); c++) {
			DataComponentEx dataComponentEx = dataComponentExList.get(c);
			timeout.timeout(TIMEOUT, "isEnabled, isObserver, isProducer", dataComponentEx, this);
			if (dataComponentEx.isEnabled()) {
				if(dataComponentEx.isObserverOnly()) {
					//pure Observer
					observerExecutionArray[c] = 
								new ObserverExecution(dataComponentEx.
										getDataComponent(), this);
					(new Thread(observerExecutionArray[c])).start();
				}
				else if(dataComponentEx.isProducerOnly()) {
					//pure Producer
					producerExecutionArray[c] = 
								new ProducerExecution(dataComponentEx.
										getDataComponent(), this);
					(new Thread(producerExecutionArray[c])).start();
				}
			}
			timeout.abortTimeout();
		}
	}
	
	//-------------------------------------------------------------------------
	
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
	
	//-------------------------------------------------------------------------
	
	public void stepExecutionSync() {
		//do not block if currently doing step
		if (this.steps != NO_STEPS) 
			return;
		
		synchronized(this) {
			if (this.steps == NO_STEPS) {
				//notify components
				for(int c = 0; c < this.dataComponentExList.size(); c++) {
					DataComponentEx dataComponentEx = 
						dataComponentExList.get(c);
					timeout.timeout(TIMEOUT, "isEnabled, isPauseFlag", dataComponentEx, this);
					if (   dataComponentEx.isEnabled()
						&& dataComponentEx.isPauseFlag()) {
						timeout.timeout(TIMEOUT, "commandStep", dataComponentEx, this);
						dataComponentEx.getDataComponent().commandStep();
					}
					timeout.abortTimeout();
				}
				//make one step
				//note that consecutive calls will be enqueued into the
				//implicit condition variable's queue of this monitor
				this.steps++;
			}
			else 
				return; //skip in this case make NO step
		}
	}

	//-------------------------------------------------------------------------

	//TODO: implement macro step execution!!!
	public void macroStepExecutionSync() {
		//do not block if currently doing step
		if (this.steps != NO_STEPS) return;
		
		synchronized(this) {
			if (this.steps == NO_STEPS) {
				//notify components
				for(int c = 0; c < this.dataComponentExList.size(); c++) {
					DataComponentEx dataComponentEx = 
						dataComponentExList.get(c);
					timeout.timeout(TIMEOUT, "isEnabled, isPauseFlag", dataComponentEx, this);
					if (   dataComponentEx.isEnabled()
						&& dataComponentEx.isPauseFlag()) {
						timeout.timeout(TIMEOUT, "commandMacroStep", dataComponentEx, this);
						dataComponentEx.getDataComponent().commandMacroStep();
					}
					timeout.abortTimeout();
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
	
	//-------------------------------------------------------------------------
	
	public void pauseExecutionSync() {
		pausedCommand = true;
		
		synchronized(this) {
			//notify components
			for(int c = 0; c < this.dataComponentExList.size(); c++) {
				DataComponentEx dataComponentEx = 
					dataComponentExList.get(c);
				timeout.timeout(TIMEOUT, "isEnabled, isPauseFlag", dataComponentEx, this);
				if (   dataComponentEx.isEnabled()
					&& dataComponentEx.isPauseFlag()) {
					timeout.timeout(TIMEOUT, "commandPause", dataComponentEx, this);
					dataComponentEx.getDataComponent().commandPause();
				}
				timeout.abortTimeout();
			}

			this.steps = NO_STEPS;
		}
	}
	
	//-------------------------------------------------------------------------
	
	public synchronized void runExecutionSync() {
		pausedCommand = false;
		
		synchronized(this) {
			//notify components
			for(int c = 0; c < this.dataComponentExList.size(); c++) {
				DataComponentEx dataComponentEx = 
					dataComponentExList.get(c);
				timeout.timeout(TIMEOUT, "isEnabled, isPauseFlag", dataComponentEx, this);
				if (   dataComponentEx.isEnabled()
					&& dataComponentEx.isPauseFlag()) {
					timeout.timeout(TIMEOUT, "commandRun", dataComponentEx, this);
					dataComponentEx.getDataComponent().commandRun();
				}
				timeout.abortTimeout();
			}
		}
		this.steps = INFINITY_STEPS; //indicates run mode
	}
	
	//-------------------------------------------------------------------------
	
	public void stopExecutionSync() {
		//not synchronized to stop immediately w/o queuing
		this.steps = NO_STEPS;
		this.stop = true;

		synchronized(this) {
			//notify components
			for(int c = 0; c < this.dataComponentExList.size(); c++) {
				DataComponentEx dataComponentEx = 
					dataComponentExList.get(c);
				timeout.timeout(TIMEOUT, "isEnabled, isPauseFlag", dataComponentEx, this);
				if (   dataComponentEx.isEnabled()
					&& dataComponentEx.isPauseFlag()) {
					timeout.abortTimeout();
					timeout.timeout(TIMEOUT, "commandStop", dataComponentEx, this);
					dataComponentEx.getDataComponent().commandStop();
					timeout.abortTimeout();
				}
				timeout.abortTimeout();
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
				if (this.observerExecutionArray[c] != null)
					this.observerExecutionArray[c].stopExecution();
				if (this.producerExecutionArray[c] != null)
					this.producerExecutionArray[c].stopExecution();
			}
		}
		//wrapup components
		wrapupComponents();
		
		//stop timeout thread
		this.timeout.terminate();
	}
	

	//-------------------------------------------------------------------------
	
//	public void stepExecutionAsync() {
//		Thread asyncStep = new Thread() {
//			public void run() {
//				stepExecutionSync();
//			}
//		};
//		asyncStep.start();
//	}
//	
//	public void macroStepExecutionAsync() {
//		Thread asyncStep = new Thread() {
//			public void run() {
//				macroStepExecutionSync();
//			}
//		};
//		asyncStep.start();
//	}
//
//	public void runExecutionAsync() {
//		Thread asyncStep = new Thread() {
//			public void run() {
//				runExecutionSync();
//			}
//		};
//		asyncStep.start();
//	}
//
//	public void pauseExecutionAsync() {
//		Thread asyncStep = new Thread() {
//			public void run() {
//				pauseExecutionSync();
//			}
//		};
//		asyncStep.start();
//	}
//
//	public void stopExecutionAsync() {
//		Thread asyncStep = new Thread() {
//			public void run() {
//				stopExecutionSync();
//			}
//		};
//		asyncStep.start();
//	}
	
	//-------------------------------------------------------------------------
	
	public boolean isPaused() {
		return (steps == NO_STEPS);
	}

	public boolean isRunning() {
		return (steps == INFINITY_STEPS);
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * Terminates the execution in case of an error.
	 * This will also (try) to terminate all created helper threads. They
	 * may not finish immediately and in case of a deadlock they won't 
	 * do so ever, but the user will get a response. This function is called
	 * by the TimeoutThread. Hence the call of this method should only
	 * happen during the development of a new component. 
	 */
	public void errorTerminate() {
		//sto this execution thread
		this.steps = NO_STEPS;
		this.stop = true;
		//release the object
		KiemPlugin.getDefault().execution = null;
		//update the view
		KiemPlugin.getDefault().updateViewAsync();
		//try to stop all components, no blocking stopExecution() call
		for (int c = 0; c < this.dataComponentExList.size(); c++) {
			if (this.observerExecutionArray[c] != null) {
				this.observerExecutionArray[c].stopExecution();
				this.observerExecutionArray[c] = null;
			}
			if (this.producerExecutionArray[c] != null) {
				this.producerExecutionArray[c].stopExecution();
				this.observerExecutionArray[c] = null;
			}
		}
	}

	//-------------------------------------------------------------------------
	
	public synchronized void wrapupComponents() {
		for(int c = 0; c < this.dataComponentExList.size(); c++) {
			DataComponentEx dataComponentEx = 
				dataComponentExList.get(c);
			if (dataComponentEx.isEnabled()) {
				timeout.timeout(TIMEOUT, "wrapup", dataComponentEx, this);
				dataComponentEx.getDataComponent().wrapup();
				timeout.abortTimeout();
			}
		}
	}
	
	
	//-------------------------------------------------------------------------
	
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
	
	//-------------------------------------------------------------------------
	
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
						timeout.timeout(TIMEOUT, "isEnabled, isPauseFlag", dataComponentEx, this);
						if (   dataComponentEx.isEnabled()
							&& dataComponentEx.isPauseFlag()) {
							this.pauseExecutionSync();
							KiemPlugin.getDefault().updateViewAsync();
						}
						timeout.abortTimeout();
					}
				}

				//test if we have to make a step (1) or if we are 
				//in running mode (-1)
				if ((steps == INFINITY_STEPS)||(steps > NO_STEPS)) {
					//make a tick
					this.stepCounter++;
					KiemPlugin.getDefault().updateStepsAsync();
					
					//this is the data pool index which will be
					//referred to for this step
					//(or if any Observer is skipped in the next steps
					// it will refer to this counter index later on!)
					for(int c = 0; c < this.dataComponentExList.size(); c++) {
						//call all pure producers first
						DataComponentEx dataComponentEx = 
							dataComponentExList.get(c);
						long poolCounter = dataPool.getPoolCounter();
						timeout.timeout(TIMEOUT, "isEnabled, isDeltaObserver", dataComponentEx, this);
						if (   dataComponentEx.isEnabled()
							&&   (!dataComponentEx.getSkipped()
							    ||!dataComponentEx.isDeltaObserver())
							){
							//advance delta counter for all *NOT* skipped 
							//components
							//or any that are *NOT* deltaObservers!
							dataComponentEx.setDeltaIndex
												(poolCounter);
						}
						timeout.abortTimeout();
					}
					
//System.out.println("-- execution step -------------------------------");

					//===========================================//
					//==  P U R E    P R O D U C E R    (CALL) ==//
					//===========================================//
					for(int c = 0; c < this.dataComponentExList.size(); c++) {
						//call all pure producers first
						DataComponentEx dataComponentEx = 
							dataComponentExList.get(c);
						timeout.timeout(TIMEOUT, "isEnabled, isProducer, isObserver", dataComponentEx, this);
						if (dataComponentEx.isEnabled() && 
							dataComponentEx.isProducerOnly()) {
//System.out.println(c + ") " + dataComponentEx.getName() + " (Pure Producer) call");
								//make a step (within producerExecution's monitor)
								timeout.timeout(TIMEOUT, "step (call)", dataComponentEx, this);
								//should normally not happen (if no errors)
								try {
									producerExecutionArray[c].blockingStep();
								}catch(Exception e){
									if (!stop)
										KiemPlugin.getDefault().showWarning(
												null, 
												KiemPlugin.PLUGIN_ID, 
												e);
								}
						}
						timeout.abortTimeout();
					}//next producer/Observer
					
					//make a step - according to the dataComponentExList order
					for(int c = 0; c < this.dataComponentExList.size(); c++) {
						DataComponentEx dataComponentEx = 
							dataComponentExList.get(c);
						if (!dataComponentEx.isEnabled()) continue;
						
						//===========================================//
						//==  C O N S U M E R  /  P R O D U C E R  ==//
						//===========================================//
						timeout.timeout(TIMEOUT, "isProducer, isObserer", dataComponentEx, this);
						if (dataComponentEx.isProducerObserver()) {
//System.out.println(c + ") " +dataComponentEx.getName() + " (Norm Producer) call");
							//Observer AND Producer => blocking
							try {
								JSONObject oldData;
								timeout.timeout(TIMEOUT, "getFilterKeys", dataComponentEx, this);
								String[] filterKeys = 
									dataComponentEx.getFilterKeys();
									oldData = this.dataPool.getDeltaData
										 (filterKeys,dataComponentEx.getDeltaIndex());
								if (dataComponentEx.isJSON()) {
									timeout.timeout(TIMEOUT, "step", dataComponentEx, this);
									JSONObject newData = 
										((JSONObjectDataComponent)dataComponentEx.getDataComponent())
										.step(oldData);
									if (newData != null)
										this.dataPool.putData(newData);
								}
								else {
									timeout.timeout(TIMEOUT, "step", dataComponentEx, this);
									String newData = 
										((JSONStringDataComponent)dataComponentEx.getDataComponent())
										.step(oldData.toString());
									if (newData != null && newData != "") 
										this.dataPool.putData(
													   new JSONObject(newData));
								}
							}catch(Exception e) {
								if (!stop)
									KiemPlugin.getDefault().showWarning(
											null, 
											KiemPlugin.PLUGIN_ID, 
											e);
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
									timeout.timeout(TIMEOUT, "getFilterKeys", dataComponentEx, this);
									String[] filterKeys = 
											dataComponentEx.getFilterKeys();
									JSONObject oldData;
									oldData = this.dataPool.getDeltaData
										  (filterKeys,dataComponentEx.getDeltaIndex());
									observerExecutionArray[c].setData(oldData);
								}catch(Exception e){
									if (!stop)
										KiemPlugin.getDefault().showWarning(
												null, 
												KiemPlugin.PLUGIN_ID,
												e);
								}
								//call async method - no timeout
								try {
									if (!(observerExecutionArray[c].step())) {
										//if step was *NOT* successful (skipped)
										//set skipped:=true this prevents the delta
										//index to advance in the next steps!
										dataComponentEx.setSkipped(true);
									}
									else
										dataComponentEx.setSkipped(false);
								} catch(Exception e){
									if (!stop)
										KiemPlugin.getDefault().showWarning(
												e.getLocalizedMessage(), 
												KiemPlugin.PLUGIN_ID,
												e);
								}
						}
						//===========================================//
						//==  P U R E    P R O D U C E R    (REAP) ==//
						//===========================================//
						else if(dataComponentEx.isProducerOnly()) {
							timeout.timeout(TIMEOUT, "step (reap)", dataComponentEx, this);
							try {
//System.out.println(c + ") " +dataComponentEx.getName() + " (Pure Producer) wait");
								//pure Producer
								//get blocking result
								producerExecutionArray[c].blockingWaitUntilDone();
								//now reap the results
								//note that due to sequential order we always FIRST
								//reap the producer and only in the next iteration
								//THEN call him again
							}catch(Exception e){
								if (!stop)
									KiemPlugin.getDefault().showWarning(
											null, 
											KiemPlugin.PLUGIN_ID,
											e);
							}

							//escape if stopped
							timeout.abortTimeout();
							if (this.stop == true) return;
								
//System.out.println(c + ") " +dataComponentEx.getName() + " (Pure Producer) done");
							try {
								JSONObject newData = 
									producerExecutionArray[c].getData();
								if (newData != null) 
									this.dataPool.putData(newData);
							}catch(Exception e){
								if (!stop)
									KiemPlugin.getDefault().showWarning(
											null, 
											KiemPlugin.PLUGIN_ID,
											e);
							}
								
						}
					}//next producer/Observer
					timeout.abortTimeout();
					
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

					//indicate step is done hence
					//reduce number of steps
					if (steps > INFINITY_STEPS) steps--;
					
				}//end if - make a step
				
				//got async pause command!
				if (pausedCommand) {
					pausedCommand = false;
					steps = NO_STEPS;
				}

			}//end synchronized
			
			//escape if stopped
			if (this.stop == true) return;

			//delay if time of step is left (in run mode only)
			if (steps == INFINITY_STEPS) {
				int timeToDelay = this.aimedStepDuration - this.stepDuration;
				if (timeToDelay > 0)
					try{Thread.sleep(timeToDelay);}catch(Exception e){
						if (!stop)
							KiemPlugin.getDefault().showWarning(
									null, 
									KiemPlugin.PLUGIN_ID,
									e);
					}
			}	
			
			//escape if stopped
			if (this.stop == true) return;
			
			//delay while paused
			while (steps == NO_STEPS) {
				starttime = System.currentTimeMillis();
//System.out.println(">>PAUSED<<");
				try{Thread.sleep(PAUSE_DEYLAY);}catch(Exception e){
					if (!stop)
						KiemPlugin.getDefault().showWarning(
								null, 
								KiemPlugin.PLUGIN_ID,
								e);
				}
				//if stop is requested, jump out
				if (this.stop) return;
				endtime = System.currentTimeMillis();
				accumulatedPlauseDurations += endtime - starttime;
			}
			
		}//next while not stop
	}

	//-------------------------------------------------------------------------
	
	public void showError(String textMessage, String PluginID, Exception e) {
		KiemPlugin.getDefault().showError(textMessage, PluginID, e);
	}
	public void showWarning(String textMessage, String PluginID, Exception e) {
		KiemPlugin.getDefault().showWarning(textMessage, PluginID, e);
	}
}
