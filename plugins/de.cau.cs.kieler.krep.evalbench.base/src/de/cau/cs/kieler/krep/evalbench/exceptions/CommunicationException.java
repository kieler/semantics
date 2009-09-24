package de.cau.cs.kieler.krep.evalbench.exceptions;

/**
 * Exception used by the communication protocols.
 * 
 * @author msp
 */
public class CommunicationException extends Exception {

	/**	The serial version UID */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates a communication exception with given message.
	 * 
	 * @param message message to be stored
	 */
	public CommunicationException(String message) {
		super(message);
	}
	
}
