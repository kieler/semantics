package de.cau.cs.kieler.kev.extension.elevator;

import de.cau.cs.kieler.kev.extension.AnimationData;
import de.cau.cs.kieler.kev.extension.AnimationDataController;
import de.cau.cs.kieler.kev.extension.DataChangeEvent;
import de.cau.cs.kieler.kev.extension.StepControlJob;
import de.cau.cs.kieler.kev.helpers.Tools;

public class JobElevator extends StepControlJob {

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
	
	/** The data that is to be displayed at the animated image */
	AnimationData displayData = new AnimationData();
	
	public JobElevator(AnimationDataController controller) {
		super("Elevator Control Job", controller);
		displayData.addInt(0);     // arrow up or down
		displayData.addBool(true);     // alarm lamp
		displayData.addInt(position);  // position of elevator
		displayData.addBool(true); // door open
	}

	@Override
	public void myRun() {
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
		this.getDataController().fireDataChangeEvent(DataChangeEvent.ALL, displayData);
	}

	@Override
	public void setControlData(AnimationData data) {
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

}
