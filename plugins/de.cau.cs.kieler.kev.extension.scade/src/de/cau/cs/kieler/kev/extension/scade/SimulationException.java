package de.cau.cs.kieler.kev.extension.scade;

public class SimulationException extends ClientException{
	
	
	
	
	public static final int UNKNOWN_RESPONSE = -1;
	
	
	
	
	/* Responses from SCADE */

	/* Error during tcl evaluation of a command */
	public static final int TCL_EVAL_ERROR = 1001;
	
	/* Cannot Access simulator interface */
	public static final int ACCESS_INTERFACE_ERROR = 1002;
	
	/* Cannot access simulator data */
	public static final int ACCESS_SIM_ERROR = 1003;
	
	/* Cannot access simulator command */
	public static final int ACCESS_COMMAND_ERROR = 1004;
	
	/* Cannot access simulator data */
	public static final int ACCESS_DATA_ERROR = 1005;
	
	/* Cannot find variable */
	public static final int VARIABLE_NOT_FOUND_ERROR = 1006;
	
	/* Undefined error */
	public static final int UNDEFINED_ERROR = 1007;
	
	/* Cannot start simulator due to configuration or root node */
	public static final int CONFIGURATION_ERROR = 1008;
	
	/* SCADE co simulation is allready started */
	public static final int SIM_ALREADY_STARTED_ERROR = 1009;
	
	
	
	public SimulationException(String msg) {
		super(msg);
	}
	
	public SimulationException(Throwable t, String msg){
		super(t, msg);
	}

		
}
