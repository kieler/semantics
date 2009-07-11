package de.cau.cs.kieler.kev.extension.elevator;

import de.cau.cs.kieler.kev.extension.AnimationData;
import de.cau.cs.kieler.kev.extension.AnimationDataController;
import de.cau.cs.kieler.kev.extension.DataChangeEvent;
import de.cau.cs.kieler.kev.extension.StepControlJob;

public class JobFlap extends StepControlJob {

	enum Direction {OUT,IN,STOP};
	public final static int MAX_POS = 100; 
	public final static int MIN_POS = 0;
	public final static int WAIT_TIME = 10;
	
	int position;
	int timeCounter;
	Direction direction;
	
	AnimationData animationData;
	
	public JobFlap(AnimationDataController controller) {
		super("High-Lift Flap System Control Job", controller);
		position = 0;
		timeCounter = 0;
		direction = Direction.STOP;
	}

	@Override
	public void myRun() {
		switch (direction) {
		case OUT:
			position++;
			if(position >= MAX_POS)
				direction = Direction.STOP;
			timeCounter = 0;
			break;
		case IN:
			position--;
			if(position <= MIN_POS)
				direction = Direction.STOP;
			timeCounter = 0;
			break;
		default:
			timeCounter++; // wait some time
			if(timeCounter >= WAIT_TIME){
				if(position >= MAX_POS)
					direction = Direction.IN;
				else
					direction = Direction.OUT;
			}
			break;
		}
		sendData();
	}

	private void sendData(){
		if(animationData == null){
			animationData = new AnimationData();
		}
		animationData.setData(0, new Integer(position));
		getDataController().fireDataChangeEvent(DataChangeEvent.ALL, animationData);
	}

	@Override
	public void setControlData(AnimationData data) {
		/* nothing, because no input buttons used */ 
	}
}
