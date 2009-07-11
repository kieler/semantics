package de.cau.cs.kieler.kev.extension.krep;

import java.util.LinkedList;

import de.cau.cs.kieler.kev.extension.AnimationData;
import de.cau.cs.kieler.kev.extension.DataChangeEvent;
import de.cau.cs.kieler.kev.helpers.Tools;

import krep.evalbench.comm.AbstractTickManager;
import krep.evalbench.comm.Signal;

public class KrepTickManager extends AbstractTickManager {

	/** implementing singleton pattern to be able to interface between KEV and KREP extension points */
	private static KrepTickManager INSTANCE;
	
	public KrepTickManager() {
		INSTANCE = this;
	}
	
	/** implementing singleton pattern to be able to interface between KEV and KREP extension points */
	public static KrepTickManager getInstance(){
		return INSTANCE;
	}
	
	/**
	 * Execute a single tick at the active assembler editor.
	 */
	public void triggerTick(){
		this.triggerTick(this.getActiveAssemblerEditor());
	}
	
	/**
	 * KReP callback to tell the animation to perform one tick. Inputs
	 * and outputs are mapped from the KEV interface.
	 */
	@Override
	public void tickPerformed(LinkedList<Signal> inputs,
			LinkedList<Signal> outputs) {
		KrepAnimationDataController controller = KrepAnimationDataController.getInstace();
		if(controller == null)
			return;
		// receive a clone of the current control data
		AnimationData kevControlData = controller.getControlData();
		// reset the current control data in order to start aggregating new events
		controller.resetControlData();
		try{
			// send data to KEV
			int index = 0;
			for (Signal signal : outputs) {
				try{
				if(signal.isValued())
					controller.kevAnimationData.setData(index, signal.getValue());
				else
					controller.kevAnimationData.setData(index, new Boolean(signal.getPresent()));
				}catch(Exception e){/* nothing, just take what fits */}
				index++;
			}
			controller.fireDataChangeEvent(DataChangeEvent.ALL, controller.kevAnimationData);
			
			// send data to KReP
			index = 0;
			//for (Signal signal : inputs) {
			for (Signal signal : this.getActiveAssemblerEditor().getInputs()) {
				try{
				Object item = kevControlData.getData().get(index);
				if(item instanceof Boolean)
					signal.setPresent(((Boolean)item).booleanValue());
				else
					signal.setValue(item);
				}catch(Exception e){/* nothing, just take what fits */ }
				index++;
			}
			this.updateSignalViews();
		}catch(Exception e){
			Tools.showDialog("Problems at passing data between KEV and KReP Eval Bench. Maybe the two data signatures do not match.", e);
		}
	}

	
	
}
