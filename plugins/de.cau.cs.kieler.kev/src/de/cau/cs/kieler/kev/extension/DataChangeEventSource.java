package de.cau.cs.kieler.kev.extension;

import java.util.ArrayList;
import java.util.List;


public class DataChangeEventSource {

	List<DataChangeListener> eventListeners;
	int size = 0;
	
	public DataChangeEventSource() {
		eventListeners = new ArrayList<DataChangeListener>();
	}
	
	public void setSize(int size){
		this.size = size;
	}
	
	public void addDataChangeListener(DataChangeListener listener){
		eventListeners.add(listener);
		listener.setDataSize(size);
	}
	public void removeDataChangeListeners(){
		eventListeners.clear();
	}
	
	/**
	 * Notifies all data change listeners about a data change.
	 * A port number can be passed to indicate which item of
	 * the whole data has only been changed. 
	 * @param port index of the changed data
	 * @param data whole data object
	 */
	public void fireDataChangeEvent(int port, AnimationData data){
		DataChangeEvent e = new DataChangeEvent(this, data, port);
		for (DataChangeListener listener : eventListeners) {
			listener.dataChanged(e);			
		}
	}
	
	
}
