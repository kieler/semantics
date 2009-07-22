package de.cau.cs.kieler.sim.kiem.extension;

/**
 * The Interface IDataComponent.
 * @author delphino
 */
public interface IDataComponent {

	/**
	 * Initialize. Do some initializing prior to execution. 
	 */
	public void initialize();
	
	//
	/**
	 * Wrapup. Do some wrapping-up after execution has finished.
	 */
	public void wrapup();

	/**
	 * Checks if is producer. DataComponent is a producer and returns != null
	 * in step method.
	 * 
	 * @return true, if is producer
	 */
	public boolean isProducer();

	/**
	 * Checks if is observer. DataComponent is an Observer and needs a 
	 * parameter != null in step method.
	 * 
	 * @return true, if is observer
	 */
	public boolean isObserver();

}
