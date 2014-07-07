/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd.model;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Model of KiCoModelView to represent errors and exceptions
 * 
 * @author als
 *
 */
public class KiCoErrorModel {

    private final String message;
    private final String details;    

    /**
     * Constructs a error model given message
     * @param message error message
     */
    public KiCoErrorModel(String message) {
        this.message = message;
        this.details = null;
    }

    /**
     * Constructs a error model given message and details
     * @param message error message
     * @param details
     */
    public KiCoErrorModel(String message, String details) {
        this.message = message;
        this.details = details;
    }
    
    /**
     * Constructs a error model given message and exception
     * @param message error message
     * @param exception
     */
    public KiCoErrorModel(String message, Exception exception) {
        this.message = message;
     // Print stack trace into string
        StringWriter traceReader = new StringWriter();
        exception.printStackTrace(new PrintWriter(traceReader));
        String exceptionTrace = traceReader.toString();
        this.details = exceptionTrace;
    }

    /**
     * @return the error message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return the exception
     */
    public String getDeatails() {
        return details;
    }
    
    

}
