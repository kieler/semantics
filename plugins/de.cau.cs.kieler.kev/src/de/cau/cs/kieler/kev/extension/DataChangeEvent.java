package de.cau.cs.kieler.kev.extension;

import java.util.EventObject;


public class DataChangeEvent extends EventObject {

	public static final int NONE = -1;
	public static final int ALL = -1;
	
	private AnimationData data;
	private int port = NONE;
	
	public DataChangeEvent(Object source, AnimationData data) {
		super(source);
		this.data = data;
	}
	
	public DataChangeEvent(Object source, AnimationData data, int port) {
		super(source);
		this.data = data;
		this.port = port;
	}
	
	public AnimationData getData(){return data;}
	public int getPort(){return port;}
	public Object getChangedData(){
		if(port == NONE)
			return null;
		else
			return data.getData().get(port);
	}
	
}
