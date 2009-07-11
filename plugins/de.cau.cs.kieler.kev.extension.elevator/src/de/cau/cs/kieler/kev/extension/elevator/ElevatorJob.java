package de.cau.cs.kieler.kev.extension.elevator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import de.cau.cs.kieler.kev.extension.AnimationData;
import de.cau.cs.kieler.kev.extension.AnimationDataController;
import de.cau.cs.kieler.kev.extension.ControlFlowChangeEvent;
import de.cau.cs.kieler.kev.extension.DataChangeEvent;
import de.cau.cs.kieler.kev.helpers.Tools;


/**
 * The actual elevator control job. Extends eclipse's Job class which can
 * is executed in eclipse's Thread model. The run-Method implements the main
 * logic of the application, which is to simply move a small elevator up and down. 
 * 
 * @see Job
 * @author Hauke Fuhrmann, haf
 *
 */
public class ElevatorJob extends Job {

	/** The actual controller that interfaces to KEV */
	AnimationDataController controller;
	/** The data that is to be displayed at the animated image */
	AnimationData displayData = new AnimationData();
	/** delay between two execution steps in ms */
	int delay = 0;
	/** boolean to indicate whether the control flow is currently paused */
	boolean paused = false;
	/** current position of the elevator (assumed to be between 0 and 100 as set by the svg-mapping file)*/
	int position = 0;
	/** Enumeration for the different directions of the elevator */
	enum Direction {UP,DOWN,STOP};
	/** Current direction of the elevator */
	Direction dir = Direction.STOP;
	/** booleans to hold the actual values of the buttons (pressed or released */
	boolean buttonUp = false;
	boolean buttonDown = false;
	boolean buttonAlarm = false;
	
	public ElevatorJob(AnimationDataController controller) {
		super("Elevator Test Controller for KEV");
		this.controller = controller;
		displayData.addInt(0);     // arrow up or down
		displayData.addBool(true);     // alarm lamp
		displayData.addInt(position);  // position of elevator
		displayData.addBool(true); // door open
	}

	/**
	 * Sets the delay between two simulation steps.
	 * @param delay
	 */
	public void setDelay(int delay){
		this.delay = delay;
	}
	
	/**
	 * Toggles one execution step. Pause mode will be active afterward, i.e. the
	 * system is held if it played automatically before.
	 */
	public void step(){
		paused = true;
		this.schedule();
	}
	
	/**
	 * Starts the execution and disables pause mode.
	 */
	public void start(){
		paused = false;
		this.schedule();
	}
	
	/**
	 * Will update the button status. Button status is not
	 * reset to false if the mousebutton was released. This will be
	 * done by the control logic in the run method. This way a button
	 * may be pressed between two steps and it will be memorized until the 
	 * end of the next step. 
	 * @param data
	 */
	public void buttonPressed(AnimationData data){
		try{
			// only set buttons if they were pressed
			// will be unset by step method
			if((Boolean)data.getData().get(0) == true)
				buttonUp = true;
			if((Boolean)data.getData().get(1) == true)
				buttonDown = true;
			if((Boolean)data.getData().get(2) == true)
				buttonAlarm = true; 
		}catch(Exception e){
			Tools.showDialog("The Data Controller did not receive the expected data format from KEV: ",e);
		}
	}
	
	/**
	 * This will execute the elevator Job. Corresponding to 
	 * control flow events of KEV the job will be rescheduled
	 * automatically after on step has finished.
	 * 	  
	 * @see org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		// check if positions are out of range
		if(position > 100 || position < 0){
			dir = Direction.STOP;
			displayData.setData(3, new Boolean(true)); // open door
		}else
			displayData.setData(3, new Boolean(false)); // close door
		// set new directions if buttons were pressed
		if(buttonUp && position < 100){
			dir = Direction.UP;
			// set arrow direction to be displayed in image (-1.0,1)
			displayData.setData(0, new Integer(1));
			// set alarm lamp
			displayData.setData(1, new Boolean(false));
		}
		if(buttonDown && position > 0){
			dir = Direction.DOWN;
			displayData.setData(0, new Integer(-1));
			displayData.setData(1, new Boolean(false));
		}
		if(buttonAlarm){
			dir = Direction.STOP;
			displayData.setData(0, new Integer(0));
			displayData.setData(1, new Boolean(true));
		}
		// update the position corresponding to position
		switch (dir) {
		case UP: position++; break;
		case DOWN: position--; break;
		default:
			break;
		}
		// reset the buttons
		buttonUp = false; buttonDown = false; buttonAlarm = false; 
		// set actual position of elevator for KEV
		displayData.setData(2, new Integer(position));
		// tell controller to inform KEV of data change (i.e. one step has been finished)
		controller.fireDataChangeEvent(DataChangeEvent.ALL, displayData);
		// reschedule for next step if not paused
		if(paused == false)
			this.schedule(delay);	
		return Status.OK_STATUS;
	}

}
