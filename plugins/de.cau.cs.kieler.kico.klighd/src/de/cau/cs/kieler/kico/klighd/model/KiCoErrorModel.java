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

/**
 * Model of KiCoModelView to represent errors and exceptions
 * 
 * @author als
 *
 */
public class KiCoErrorModel {

    private final String message;
    private final Exception exception;    

    /**
     * Constructs a error model given message
     * @param message error message
     */
    public KiCoErrorModel(String message) {
        this(message, null);
    }

    /**
     * Constructs a error model given message and exception
     * @param message error message
     * @param exception
     */
    public KiCoErrorModel(String message, Exception exception) {
        this.message = message;
        this.exception = exception;
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
    public Exception getException() {
        return exception;
    }
    
    

}
