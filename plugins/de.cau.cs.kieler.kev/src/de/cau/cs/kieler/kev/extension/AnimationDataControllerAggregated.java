package de.cau.cs.kieler.kev.extension;

/**
 * <p>
 * Extends the AnimationDataController by changing the way how user interaction data is
 * handled. In the standard controller events are fired each time of user interaction
 * (e.g. a button was pressed). This can result in multiple events, especially one
 * for the button press and one for the release, even within one step.
 * </p>
 * 
 * <p>
 * Usually between two steps passes some time where the user could cause multiple control
 * events. This AnimationDataControllerAggregated takes all user action events and aggregates
 * them to one AnimationData item. This way the controller can ask for this data
 * whenever it wants to and then reset the aggregated information.
 * </p>
 * 
 * @author haf
 *
 * @see AnimationDataController
 */
public abstract class AnimationDataControllerAggregated extends
		AnimationDataController {

	private AnimationData controlData;
	
	public void dataChanged(DataChangeEvent e) {
		AnimationData dataFromKev = e.getData();
		if(controlData == null)
			controlData = new AnimationData(dataFromKev);
		// unlikely to happen, just for safety
		if(e.getChangedData() == null || e.getPort() == DataChangeEvent.NONE){
			int index = 0;
			for (Object dataItem : dataFromKev.getData()) {
				setBooleanPassOthers(index, dataItem);
				index++;
			}
		}
		// this is the usual and fast case
		else{
			setBooleanPassOthers(e.getPort(), e.getChangedData());
		}
	}
	
	/**
	 * Sets a data object to the local AnimationData store. It updates 
	 * booleans only if it's set from false to true. A reset must be done
	 * somewhere else.
	 * @param index
	 * @param object
	 */
	private void setBooleanPassOthers(int index, Object object){
		if(object instanceof Boolean){
			// only set booleans to true, not to false
			if(((Boolean) object).booleanValue() == true){
				controlData.setData(index, new Boolean(true));
			}
		}
		else{
			controlData.setData(index, object);
		}
	}

	/**
	 * Resets all boolean values of the actual control data (user interaction
	 * data from KEV) to false. This is called when the data has been read by
	 * the application controller.
	 */
	public void resetControlData(){
		if(controlData == null)
			return;
		int index = 0;
		for (Object dataItem : controlData.getData()) {
			if(dataItem instanceof Boolean){
				controlData.setData(index, new Boolean(false));
			}
			index++;
		}
	}
	
	/**
	 * Returns all data of the KEV user interactions that has been
	 * aggregated since the last call of resetControlData(). After this
	 * method has been called, the data needs to be reset manually
	 * by the user. Hence the data passed
	 * is a copy (call by value) of the actual control data.
	 * 
	 * @return The current AnimationData object that holds the control data
	 * @see resetControlData()
	 */
	public AnimationData getControlData(){
		if(controlData == null)
			return null;
		AnimationData dataSnapshot = new AnimationData(controlData);
		return dataSnapshot;
	}

}
