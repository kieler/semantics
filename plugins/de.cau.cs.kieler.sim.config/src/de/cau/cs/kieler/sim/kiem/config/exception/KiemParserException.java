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
 * This Exception is thrown when a problem occurred while parsing from the
 * Eclipse Preference Store.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public class KiemParserException extends AbstractKiemException {

    /** Id for serialization. */
    private static final long serialVersionUID = 1L;

    // --------------------------------------------------------------------------

    /**
     * Creates a new KiemParserException.
     * 
     * @param message
     *            some message.
     * @param infoParam
     *            the faulty object.
     */
    public KiemParserException(final String message, final Object infoParam) {
        super(message, infoParam);
    }

    /**
     * Creates a new KiemParserException.
     * 
     * @param cause
     *            the cause for this exception.
     * @param infoParam
     *            the faulty object.
     */
    public KiemParserException(final Throwable cause, final Object infoParam) {
        super(cause, infoParam);
    }

    /**
     * Creates a new KiemParserException.
     * 
     * @param message
     *            some message.
     * @param cause
     *            the cause for this exception.
     * @param infoParam
     *            the faulty object.
     */
    public KiemParserException(final String message, final Throwable cause,
            final Object infoParam) {
        super(message, cause, infoParam);
    }

    // --------------------------------------------------------------------------

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public String getErrorMessage() {
        String result = super.getInfo()
                + " could not be parsed to create a valid ";
        result += super.getMessage();
        return result + "!";
    }

}
