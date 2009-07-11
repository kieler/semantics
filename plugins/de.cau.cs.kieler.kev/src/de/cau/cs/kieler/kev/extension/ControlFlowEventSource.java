package de.cau.cs.kieler.kev.extension;

import java.util.ArrayList;
import java.util.List;

public class ControlFlowEventSource {

List<ControlFlowChangeListener> cfEventListeners;
	
	public ControlFlowEventSource() {
		cfEventListeners = new ArrayList<ControlFlowChangeListener>();
	}
	
	public void addControlFlowChangeListener(ControlFlowChangeListener listener){
		cfEventListeners.add(listener);
	}
	public void removeControlFlowChangeListeners(){
		cfEventListeners.clear();
	}
	
	public void fireControlFlowChangeEvent(ControlFlowChangeEvent.Type type, Object data){
		ControlFlowChangeEvent e = new ControlFlowChangeEvent(this, type, data);
		for (ControlFlowChangeListener listener : cfEventListeners) {
			listener.controlFlowChanged(e);			
		}
	}
}
