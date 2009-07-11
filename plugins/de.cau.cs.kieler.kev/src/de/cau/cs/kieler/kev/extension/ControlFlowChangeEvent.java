package de.cau.cs.kieler.kev.extension;

import java.util.EventObject;

public class ControlFlowChangeEvent extends EventObject {

	public static enum Type {START, STOP, STEP, DELAY, ERROR}; 
	
	Type type;
	Object data;
	
	public ControlFlowChangeEvent(Object source, Type type, Object data) {
		super(source);
		this.type = type;
		this.data = data;
	}

	public Type getType() {
		return type;
	}

	public Object getData() {
		return data;
	}
	
	

}
