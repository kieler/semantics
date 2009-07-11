package de.cau.cs.kieler.kev.extension;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;


/**
 * Helper Class to handle the timing behavior of an AnimationController. 
 * This is a Job which can be scheduled and it will re-schedule itself
 * if the controller is run and not in paused mode according to the set delay
 * values in ms. The set delay is the time in ms between two starts of 
 * an execution cycle (not between end and start). Accuracy might depend on the
 * scheduling schemes.
 * 
 * @author Hauke Fuhrmann, haf
 *
 */
public abstract class StepControlJob extends Job {

	/**
	 * The Job needs access to the parent data controller to actually
	 * send and receive data to and from the data controller.
	 */
	AnimationDataController dataController;
	
	boolean paused = false;
	boolean old_paused = false;
	int delay = 0;
	long time;
	
	public StepControlJob(String name, AnimationDataController controller) {
		super(name);
		time = System.currentTimeMillis();
		this.dataController = controller;
	}
	
	/**
	 * Set the delay that shall be passed between two job starts in ms. E.g.
	 * set to 50ms, the Job is tried to be scheduled every 50ms. This is NOT the
	 * delay BEETWEEN two job executions, but the execution time of the Job cycle
	 * itself is taken into account. 
	 * @param delay Delay in ms
	 */
	public void setDelay(int delay){
		this.delay = delay;
	}
	
	/**
	 * Set or unset the Job to paused mode. If it is set to paused the
	 * Job won't be rescheduled automatically after one cycle.
	 * @param isPaused
	 */
	public void setPaused(boolean isPaused){
		old_paused = paused; // save the old value
		paused = isPaused;
	}
	
	/**
	 * Abstract run-method that must be implemented by clients with whatever
	 * behavior the controller shall have in one cycle. This is called by the
	 * official run-method automatically if this job is scheduled.
	 */
	public abstract void myRun();
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		time = System.currentTimeMillis();

		// call the client custom run method 
		myRun();
		
		// calc the execution time ot the client method to get the proper delay
		long passedTime = System.currentTimeMillis() - time;
		long currentDelay = delay;
		if(passedTime > delay)
			currentDelay = 0;
		else
			currentDelay = delay - passedTime;
		if(paused == false){ // in play modus reschedule a next step with the required delay
			this.schedule(currentDelay);
		}
		
		return Status.OK_STATUS;
	}
	
	public AnimationDataController getDataController(){
		return dataController;
	}
	
	public abstract void setControlData(AnimationData data);

}
