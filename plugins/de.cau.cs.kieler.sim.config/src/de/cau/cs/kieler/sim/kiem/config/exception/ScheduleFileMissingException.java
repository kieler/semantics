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

import de.cau.cs.kieler.sim.kiem.config.data.ScheduleData;

/**
 * Indicates that the file associated with a given schedule is no longer in the
 * saved location.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public class ScheduleFileMissingException extends AbstractKiemException {

    /** Id for serialization. */
    private static final long serialVersionUID = 7698889895856340476L;

    /**
     * Creates a new ScheduleFileMissingException.
     * 
     * @param message
     *            the message
     * @param infoParam
     *            the schedule for which the file is missing
     */
    public ScheduleFileMissingException(final String message,
            final Object infoParam) {
        super(message, infoParam);
    }

    /**
     * Creates a new ScheduleFileMissingException.java.
     * 
     * @param cause
     *            the cause
     * @param infoParam
     *            the schedule for which the file is missing
     */
    public ScheduleFileMissingException(final Throwable cause,
            final Object infoParam) {
        super(cause, infoParam);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getErrorMessage() {
        String location = "";
        if (super.getInfo() instanceof ScheduleData) {
            location = ((ScheduleData) super.getInfo()).getLocation()
                    .toOSString();
        }

        return "The schedule file is missing at location " + location;
    }

}
