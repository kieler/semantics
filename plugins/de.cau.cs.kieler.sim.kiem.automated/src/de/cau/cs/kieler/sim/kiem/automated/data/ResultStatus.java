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
package de.cau.cs.kieler.sim.kiem.automated.data;


/**
 * This enumeration contains the different states that an execution can be in
 * from the point of view of the iteration result.
 * 
 * 
 * @author soh
 * @kieler.rating 2010-01-29 proposed yellow
 */
public enum ResultStatus {

    /** The execution was just created. */
    CREATED,
    /** The execution is running. */
    RUNNING,
    /** The execution is finished. */
    DONE,
    /** The execution was aborted due to an error. */
    ERROR,
    /** The execution was canceled by the user. */
    ABORTED;

    // --------------------------------------------------------------------------

    /**
     * Get a readable String for the given status.
     * 
     * @param status
     *            the status
     * @return the name
     */
    public static String labelOf(final ResultStatus status) {
        switch (status) {
        case CREATED:
            return "Created";
        case RUNNING:
            return "Running";
        case DONE:
            return "Done";
        case ERROR:
            return "Failed";
        case ABORTED:
            return "Aborted";
        }
        return "Error";
    }
}
