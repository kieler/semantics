package de.cau.cs.kieler.krep.evalbench.comm;

/**
 * Listener for communication events which occur when
 * data is sent or received.
 * 
 * @author msp
 */
public interface ICommunicationListener {
	
	/**
	 * Executed when data is sent to the target.
	 * 
	 * @param data
	 */
	public void dataSent(String data);
	
	/**
	 * Executed when data is received from the target.
	 * 
	 * @param data
	 */
	public void dataReceived(String data);

}
