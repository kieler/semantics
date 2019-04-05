/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.m2m;

/**
 * Thrown when a model transformation fails.
 * 
 * TODO: Move this to another plug-in?
 *
 * @author msp
 * @kieler.design proposed 2012-11-06 cds msp
 * @kieler.rating proposed yellow 2012-11-06 cds msp
 */
public class TransformException extends Exception {

    /** the serial version UID. */
    private static final long serialVersionUID = 4029871179354926492L;
    
    /**
     * Create a transform exception with no parameters.
     */
    public TransformException() {
        super();
    }
    
    /**
     * Create a transform exception with a message.
     * 
     * @param message a message
     */
    public TransformException(final String message) {
        super(message);
    }
    
    /**
     * Create a transform exception with a message and a cause.
     * 
     * @param message a message
     * @param cause a cause
     */
    public TransformException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    /**
     * Create a transform exception with a cause.
     * 
     * @param cause a cause
     */
    public TransformException(final Throwable cause) {
        super(cause);
    }

}
