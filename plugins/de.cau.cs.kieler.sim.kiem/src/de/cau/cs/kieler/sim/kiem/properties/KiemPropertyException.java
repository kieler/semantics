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

package de.cau.cs.kieler.sim.kiem.properties;


/**
 * The Class KiemPropertyError defines an error that can be thrown by DataComponents if the
 * properties are not correctly set. This is checked prior to initialization of the DataComponents
 * and will prevent any execution.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class KiemPropertyException extends Exception {

    private static final long serialVersionUID = -1023528743545009469L;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KiemPropertyException.
     * 
     * @param message
     *            the error message to display
     */
    public KiemPropertyException(final String message) {
        super(message);
    }

    /**
     * Instantiates a new KiemPropertyException.
     * 
     * @param message
     *            the message
     * @param cause
     *            the cause
     */
    public KiemPropertyException(final String message, final Exception cause) {
        super(message, cause);
    }

}
