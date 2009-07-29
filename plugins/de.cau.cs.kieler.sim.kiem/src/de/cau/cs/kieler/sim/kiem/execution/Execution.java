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

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;

import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.data.DataComponentEx;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONStringDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
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

	//Timeout for DataComponents
	TimeoutThread timeout;
	private static final int TIMEOUT = 5000; //5 seconds
	
	//delay to wait in paused state until
	private static final int PAUSE_DEYLAY = 50;   //in ms
	
	//defines the number of steps in ...
	private static final int INFINITY_STEPS = -2; //...run mode
	private static final int FORWARD_STEP = 1;	  //...normal forward step
	private static final int BACKWARD_STEP = -1;  //...when user makes step backwards
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
	
	//by default this is equal to stepCounter-1
	//in case of history steps: stepCount < stepCounterMax
	private long stepCounterMax; 

	//the data pool
	private JSONDataPool dataPool;
	
	//threads for Observers and producers
	private ObserverExecution[] observerExecutionArray;
	private ProducerExecution[] producerExecutionArray;
	
	//KiemView to control execution
	//KiemView view;
	
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
	public long getMaximumSteps() {
		return this.stepCounterMax+1;
	}
	public boolean isHistoryStep() {
		return (this.stepCounter <= this.stepCounterMax);
	}
	
	public void setAimedStepDuration(int aimedStepDuration) {
		this.aimedStepDuration = aimedStepDuration;
	}
	
	public int getAimedStepDuration() {
		return this.aimedStepDuration;
	}
	
	//-------------------------------------------------------------------------
	
	public void stepBackExecutionSync() {
		//cannot make steps back in this case
		if (this.getSteps() <= 0) return;
		
		//do not block if currently doing step
		if (this.steps != NO_STEPS) 
			return;
		
		synchronized(this) {
			if (this.steps == NO_STEPS) {
				//notify components
				for(int c = 0; c < this.dataComponentExList.size(); c++) {
					DataComponentEx dataComponentEx = 
						dataComponentExList.get(c);
					timeout.timeout(TIMEOUT, "isEnabled, isHistoryObserver", 
														dataComponentEx, this);
					if (   dataComponentEx.isEnabled()
						//HISTORY COMPONENTS ONLY//							
						&& dataComponentEx.isHistoryObserver()) {  
						timeout.timeout(TIMEOUT, "commandStep", 
														dataComponentEx, this);
						dataComponentEx.getDataComponent().commandStep();
					}
					timeout.abortTimeout();
				}
				//make one step backward
				this.steps = BACKWARD_STEP;
			}
			else 
				return; //skip in this case make NO step
		}
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
					timeout.timeout(TIMEOUT, "isEnabled", dataComponentEx, this);
					if (   dataComponentEx.isEnabled()) {
						timeout.timeout(TIMEOUT, "commandStep", dataComponentEx, this);
						dataComponentEx.getDataComponent().commandStep();
					}
					timeout.abortTimeout();
				}
				//make one step forward
				this.steps = FORWARD_STEP;
			}
			else 
				return; //skip in this case make NO step
		}
	}

	//-------------------------------------------------------------------------

	//TODO: implement macro step execution!!!
	public void macroStepExecutionSync() {
		this.stepExecutionSync();
	}
	
	//-------------------------------------------------------------------------
	
	public void pauseExecutionSync() {
		pausedCommand = true;
		
		synchronized(this) {
			//notify components
			for(int c = 0; c < this.dataComponentExList.size(); c++) {
				DataComponentEx dataComponentEx = 
					dataComponentExList.get(c);
				timeout.timeout(TIMEOUT, "isEnabled", dataComponentEx, this);
				if (dataComponentEx.isEnabled()) {
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
				timeout.timeout(TIMEOUT, "isEnabled", dataComponentEx, this);
				if (dataComponentEx.isEnabled()) {
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
				timeout.timeout(TIMEOUT, "isEnabled", dataComponentEx, this);
				if (dataComponentEx.isEnabled()) {
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
				//reset pool indices
				this.dataComponentExList.get(c).resetPoolIndices();
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
	
	/**
	 * Only returns true if no more steps have to be done (forward AND 
	 * backward). 
	 * This is *NOT* necessary equivalent to the term "!isRunning()"!
	 * 
	 * @return true, if is no further steps have to be done
	 */
	public boolean isPaused() {
		return (steps == NO_STEPS);
	}

	/**
	 * Checks if the execution is in run mode. This means forward steps are
	 * produced automatically with the given (aimed) step duration.
	 * 
	 * @return true, if execution is running
	 */
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	protected void finalize() {
		errorTerminate();
	}

	//-------------------------------------------------------------------------
	
	public synchronized void wrapupComponents() {
		for(int c = 0; c < this.dataComponentExList.size(); c++) {
			DataComponentEx dataComponentEx = 
				dataComponentExList.get(c);
			if (dataComponentEx.isEnabled()) {
				timeout.timeout(TIMEOUT, "wrapup", dataComponentEx, this);
				try {
					dataComponentEx.getDataComponent().wrapup();
				}catch(KiemInitializationException e) {
					timeout.abortTimeout();
					KiemPlugin.getDefault().handleComponentError(
							dataComponentEx.getDataComponent(), e);
				}
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
		this.stepCounterMax = -1;
		this.stepDuration = 0;
	}
	
	//-------------------------------------------------------------------------
	
	/**
	 * Gets the input data for a DataComponent that is an observer
	 * 
	 * @param dataComponentEx DataComponent to get the data for
	 * @param relativePoolCounter the relative pool counter this is the pool 
	 * 						      counter according to the current step AND
	 * 							  to the scheduled position
	 * 
	 * @return the input data
	 * 
	 * @throws JSONException the JSON exception
	 */
	private JSONObject getInputData(DataComponentEx dataComponentEx)
														 throws JSONException {
		timeout.timeout(TIMEOUT, "getFilterKeys", dataComponentEx, this);
		String[] filterKeys = 
			dataComponentEx.getFilterKeys();
		timeout.abortTimeout();
		
		JSONObject oldData = null;

		long lastPoolCounter = dataComponentEx.getDeltaIndex(); 
		
		if (this.isHistoryStep()) {
			//flag as a history step
			dataComponentEx.setHistoryStep(true);
			
			//this is a history step - always send full data
			long oldPoolCounter = dataComponentEx.getPoolIndex(this.getSteps());
			oldData = this.dataPool.getData(filterKeys, oldPoolCounter);
		}
		else {
			//flag as NOT history step
			dataComponentEx.setHistoryStep(false);

			//this is a new step
			if (dataComponentEx.isDeltaObserver()) {
				oldData = this.dataPool.getDeltaData(filterKeys, lastPoolCounter);
			}
			else {
				oldData = this.dataPool.getData(filterKeys);
			}

			//set pool index (for later going back in history)
			dataComponentEx.addPoolIndex(this.dataPool.getPoolCounter(),
										 this.getSteps());
		}
		

		return oldData;
	}

	//-------------------------------------------------------------------------
	
	/**
	 * Makes step of a consumer AND producer data component. This is not
	 * sourced out into a separate thread because it is made in a blocking
	 * sense.
	 * 
	 * @param dataComponentEx the data component which should make a step
	 * @param relativePoolCounter the relative pool counter this is the pool 
	 * 						      counter according to the current step AND
	 * 							  to the scheduled position
	 * 
	 * @throws Exception the exception
	 */
	private void makeStepConsumerProducer(DataComponentEx dataComponentEx) 
															throws Exception {
		JSONObject oldData;
		
		//get the current input data according to the current step
		oldData = getInputData(dataComponentEx);
		
		//decide to make a step depending on the type of component 
		//(JSONString or JSONObject)
		timeout.timeout(TIMEOUT, "step", dataComponentEx, this);
		if (dataComponentEx.isJSON()) {
			//JSONObject component
			JSONObject newData = null;
			try {
				newData = ((JSONObjectDataComponent)dataComponentEx
							.getDataComponent()).step(oldData);
			}catch(KiemExecutionException e) {
				timeout.abortTimeout();
				KiemPlugin.getDefault().handleComponentError(
				 dataComponentEx.getDataComponent(), e);
			}
			
			//only put in data pool if no history step
			if (!this.isHistoryStep())
				this.dataPool.putData(newData);
		}
		else {
			//JSONString component
			String newData = null;
			try {
				newData = ((JSONStringDataComponent)dataComponentEx
							.getDataComponent()).step(oldData.toString());
			}catch(KiemExecutionException e) {
				timeout.abortTimeout();
				KiemPlugin.getDefault().handleComponentError(
				 dataComponentEx.getDataComponent(), e);
			}
			JSONObject newJsonData = null;
			if (newData != null && newData != "") {
				newJsonData = new JSONObject(newData);
			}

			//only put in data pool if no history step
			if (!this.isHistoryStep())
				this.dataPool.putData(newJsonData);
		}
		timeout.abortTimeout();
	}
	
	//-------------------------------------------------------------------------
	
	private void checkForPauseFlag() {
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
	}
	
	//-------------------------------------------------------------------------
	
	public void run() {
		synchronized(this) {
			//this returns stepCounter and historyStepCounter and all other
			//timing variables
			resetTimingVariables();
		}
		
		while (!this.stop) {
			
			long starttime = System.currentTimeMillis();
			long endtime   = System.currentTimeMillis();
			
			
			synchronized(this) {
				//iff *ANY* isPauseFlag() returns true, pause execution
				checkForPauseFlag();

				//test if we have to make a step (1) or if we are 
				//in running mode (-1)
				if ((steps == INFINITY_STEPS)||(steps != NO_STEPS)) {
					
					//make a step forward or backward according to steps
					if ((steps == FORWARD_STEP)||(steps == INFINITY_STEPS)) {
						//update stepCounterMax
						if (this.stepCounter > this.stepCounterMax)
							this.stepCounterMax = this.stepCounter;
						//make a step forward
						this.stepCounter++;
					}
					else {
						//update stepCounterMax
						if (this.stepCounter  > this.stepCounterMax)
							this.stepCounterMax = this.stepCounter;
						//make a step backward
						this.stepCounter--;
					}
					//--------------------------------------------------
					
					//update steps in kiem view
					KiemPlugin.getDefault().updateStepsAsync();
					
//System.out.println("-- execution step -------------------------------");

					//===========================================//
					//==  P U R E    P R O D U C E R    (CALL) ==//
					//===========================================//
					//only if this is not a history step
					if (!this.isHistoryStep()) {
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
						}//next pure producer
					}//end if not history step
					
					//make a step - according to the dataComponentExList order
					for(int c = 0; c < this.dataComponentExList.size(); c++) {
						DataComponentEx dataComponentEx = 
							dataComponentExList.get(c);
						
						//check whether DataComponent is DISABLED
						timeout.timeout(TIMEOUT, "isEnabled", dataComponentEx, this);
						if (!dataComponentEx.isEnabled()) {
							timeout.abortTimeout();
							continue;
						}
						timeout.abortTimeout();
						
						//check whether DataComponent can handle HISTORY STEPS
						if (this.isHistoryStep()) {
							timeout.timeout(TIMEOUT, "isHistoryObserver", dataComponentEx, this);
							if (!dataComponentEx.isHistoryObserver()) {
								timeout.abortTimeout();
								continue;
							}
							timeout.timeout(TIMEOUT, "isProducer, isObserver", dataComponentEx, this);
							if (dataComponentEx.isProducerOnly()) {
								timeout.abortTimeout();
								continue;
							}
							timeout.abortTimeout();
						}

						//===========================================//
						//==  C O N S U M E R  /  P R O D U C E R  ==//
						//===========================================//
						timeout.timeout(TIMEOUT, "isProducer, isObserver", dataComponentEx, this);
						if (dataComponentEx.isProducerObserver()) {
//System.out.println(c + ") " +dataComponentEx.getName() + " (Norm Producer) call");
							//Observer AND Producer => blocking
							try {
								//make a step
								makeStepConsumerProducer(dataComponentEx);
								//save current pool index for next invokation
								dataComponentEx.setDeltaIndex(this.dataPool.getPoolCounter());
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
									//get the current input data according to the current step
									JSONObject oldData = getInputData(dataComponentEx);
									//set the oldData
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
									if ((observerExecutionArray[c].step())) {
										//ONLY if the step was successful
										// 		== component was not skipped
										
										//save current pool index for next invokation
										dataComponentEx.setDeltaIndex(this.dataPool.getPoolCounter());
									}
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
						//only if not a history step
						else if((!this.isHistoryStep())
							   && dataComponentEx.isProducerOnly()) {
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
					if (steps != INFINITY_STEPS) steps = NO_STEPS;
					
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
