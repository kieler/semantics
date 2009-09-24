package de.cau.cs.kieler.krep.evalbench.exceptions;



/**
 * @author ctr
 *
 * Exception that is thrown while downloading a program onto a processor
 */
public class LoadException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 6075808941855187075L;
    private final String cause;
    
    /**
     * @param cause specific explanaition, while the download failed
     */
    public LoadException(final String cause){
	this.cause = cause;
    }
    
    @Override
    public String getMessage(){
	return "Load: " + cause;
    }
    
}
