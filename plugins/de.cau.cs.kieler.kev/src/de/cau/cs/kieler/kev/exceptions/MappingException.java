package de.cau.cs.kieler.kev.exceptions;

/**
 * Exception if something with the Mapping file fails.
 * 
 * @author haf
 * 
 */

public class MappingException extends Exception {

	private static final long serialVersionUID = 1L;

	public MappingException(Exception e, String msg) {
		super(msg + " " + e.getMessage());
	}

	public MappingException(String msg) {
		super(msg);
	}

}
