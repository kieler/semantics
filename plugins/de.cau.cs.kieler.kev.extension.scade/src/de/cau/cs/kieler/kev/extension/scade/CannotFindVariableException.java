package de.cau.cs.kieler.kev.extension.scade;

public class CannotFindVariableException extends SimulationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5376338261029154847L;

	public CannotFindVariableException(String msg) {
		super(msg);
	}
	
	public CannotFindVariableException(Throwable e, String msg){
		super(e, msg);
	}
}
