package de.cau.cs.kieler.krep.evalbench.exceptions;

/**
 * @author ctr
 *
 * Any exception that occurred while Parsing an Assembler file 
 */
public class ParseException extends Exception {

    private String cause;
    
    /**
     * @param cause detailed cause for the exception
     */
    public ParseException(final String cause) {
	super();
	this.cause = cause;
    }

    @Override
    public String getMessage(){
	return "Parser: " + cause;
    }
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    
}
