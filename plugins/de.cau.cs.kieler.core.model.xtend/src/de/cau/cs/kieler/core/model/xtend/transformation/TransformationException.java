/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.xtend.transformation;

/**
 * This exception indicates that something went wrong during the transformation.
 * 
 * @author soh
 */
public class TransformationException extends Exception {

    /**
     * Creates a new TransformationException.
     * 
     */
    public TransformationException() {
    }

    /**
     * Creates a new TransformationException.
     * 
     * @param message
     */
    public TransformationException(final String message) {
        super(message);
    }

    /**
     * Creates a new TransformationException.
     * 
     * @param cause
     */
    public TransformationException(final Throwable cause) {
        super(cause);
    }

    /**
     * Creates a new TransformationException.
     * 
     * @param message
     * @param cause
     */
    public TransformationException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
