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
package de.cau.cs.kieler.sim.kiem.config.exception;

/**
 * Super class for all Exceptions in the configuration part of KIEM.
 * <p>
 * Enables subclasses to supply an Object as information.
 * </p>
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public abstract class AbstractKiemException extends Exception {

    /** Id for serialization. */
    private static final long serialVersionUID = 4240523346021805972L;

    /** May contain the faulty object causing the Exception. */
    private Object info;

    // --------------------------------------------------------------------------

    /**
     * Creates a new AbstractKiemException.
     * 
     * @param message
     *            some message.
     * @param infoParam
     *            the faulty object.
     */
    public AbstractKiemException(final String message, final Object infoParam) {
        super(message);
        this.info = infoParam;
    }

    /**
     * Creates a new AbstractKiemException.
     * 
     * @param cause
     *            the cause for this exception.
     * @param infoParam
     *            the faulty object.
     */
    public AbstractKiemException(final Throwable cause, final Object infoParam) {
        super(cause);
        this.info = infoParam;
    }

    /**
     * Creates a new AbstractKiemException.
     * 
     * @param message
     *            some message.
     * @param cause
     *            the cause for this exception.
     * @param infoParam
     *            the faulty object.
     */
    public AbstractKiemException(final String message, final Throwable cause,
            final Object infoParam) {
        super(message, cause);
        this.info = infoParam;
    }

    // --------------------------------------------------------------------------

    /**
     * @return the info
     */
    public Object getInfo() {
        return this.info;
    }

    // --------------------------------------------------------------------------

    /**
     * Displays an error message based on the information.
     * 
     * @return the error message.
     */
    public abstract String getErrorMessage();
}
