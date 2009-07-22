package de.cau.cs.kieler.sim.kiem.extension;

public interface IDataComponent {

	//initialize prior execution
	public void initialize();
	
	//wrapup after execution
	public void wrapup();

	//DataComponent is a producer and returns != null in step method
	public boolean isProducer();

	//DataComponent is a Observer and needs a parameter != null in step method
	public boolean isObserver();

}
