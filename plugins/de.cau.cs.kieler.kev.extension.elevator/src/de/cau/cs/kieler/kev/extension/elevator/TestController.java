package de.cau.cs.kieler.kev.extension.elevator;

import org.eclipse.jface.preference.IPreferenceStore;

import de.cau.cs.kieler.kev.extension.AnimationData;
import de.cau.cs.kieler.kev.extension.AnimationDataController;
import de.cau.cs.kieler.kev.extension.ControlFlowChangeEvent;
import de.cau.cs.kieler.kev.extension.DataChangeEvent;
import de.cau.cs.kieler.kev.extension.StepControlJob;
import de.cau.cs.kieler.kev.extension.ControlFlowChangeEvent.Type;
import de.cau.cs.kieler.kev.helpers.Tools;


/**
 * <p> A simple Java internal test-controller for the KIEL Environment Visualization (KEV).
 * This controller implements the AnimationDataController case class to extend the
 * corresponding extension point of KEV. </p>
 * 
 * <p>This controller is implemented directly in Java and implements only one specific
 * application. I.e. it is not a generic controlling interface. The application is
 * a simple 2-floor elevator. The interface comprises three displays 
 * (int:direction, boolean:alarm lamp and int:position) and three controls 
 * (boolean:up, boolean: down and boolean:alarm).<p>
 * 
 * <p>The controller also reads the controlFlowChanged events to keep track of the control
 * flow. The ElevatorJob takes care of the passing of time.</p>
 * 
 * @see ElevatorJob
 * @author Hauke Fuhrmann, haf
 */

public class TestController extends AnimationDataController{
	
	StepControlJob controlJob;
	int delay;
		
	/*
	 * (non-Javadoc)
	 * @see de.cau.cs.kieler.kev.extension.ControlFlowChangeListener#controlFlowChanged(de.cau.cs.kieler.kev.extension.ControlFlowChangeEvent)
	 */
	public void controlFlowChanged(ControlFlowChangeEvent e) {
		System.out.println("Control Flow Changed: "+e.getType()+" "+e.getData());
		if(controlJob == null)
			checkJob();
		switch (e.getType()) {
		case START:
			checkJob();
			controlJob.setPaused(false);
			controlJob.schedule();
			break;
		case STEP:
			controlJob.setPaused(true);
			controlJob.schedule();
			break;
		case DELAY:
			try {
				this.delay = (Integer)e.getData();
				controlJob.setDelay(delay);
			} catch (Exception e2) {
				Tools.showDialog("Could not set delay.", e2);
			}
			break;
		case STOP:
			controlJob.cancel();
			controlJob = getNewJob();
		default:
			break;
		}
	}

	private void checkJob() {
		StepControlJob newJob = getNewJob(); 
		if(controlJob == null)
			controlJob = newJob;
		// check if there was set a different type of controller job in the preferences
		if(controlJob.getClass() != newJob.getClass()){
			controlJob.cancel();
			controlJob = newJob;
			controlJob.setDelay(delay);
		}
	}

	private StepControlJob getNewJob(){
		IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
		String id = preferenceStore.getString(WorkbenchPreferencePage.CONTROLLERID);
		if(id.equals(WorkbenchPreferencePage.ELEVATOR))
			return new JobElevator(this);
		else if(id.equals(WorkbenchPreferencePage.FLAP))
			return new JobFlap(this);
		else // default
			return new JobFlap(this);
	}
	
	/*
	 * (non-Javadoc)
	 * @see de.cau.cs.kieler.kev.extension.DataChangeListener#dataChanged(de.cau.cs.kieler.kev.extension.DataChangeEvent)
	 */
	public void dataChanged(DataChangeEvent e) {
		System.out.println("Control data Changed: "+e.getData());
		controlJob.setControlData(e.getData());
	}

	/*
	 * (non-Javadoc)
	 * @see de.cau.cs.kieler.kev.extension.DataChangeListener#setDataSize(int)
	 */
	public void setDataSize(int size) {
		System.out.println("Display data size from mapping: "+size);
	}

}
