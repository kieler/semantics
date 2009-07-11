package de.cau.cs.kieler.kev.extension.scade;

/**
 * @author Steffen Jacobs
 * 
 */
public class ClientException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8733188234885402535L;

	/**
	 * @param e
	 * @param msg
	 */
	public ClientException(Throwable e, String msg) {
		super(msg + " " + e.getMessage());
	}

	public ClientException(String msg) {
		super(msg);
	}
}
