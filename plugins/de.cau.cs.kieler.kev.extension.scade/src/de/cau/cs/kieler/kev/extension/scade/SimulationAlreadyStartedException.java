package de.cau.cs.kieler.kev.extension.scade;

public class SimulationAlreadyStartedException extends SimulationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5376338261029154847L;

	public SimulationAlreadyStartedException(String msg) {
		super(msg);
	}
	
	public SimulationAlreadyStartedException(Throwable e, String msg){
		super(e, msg);
	}
}
