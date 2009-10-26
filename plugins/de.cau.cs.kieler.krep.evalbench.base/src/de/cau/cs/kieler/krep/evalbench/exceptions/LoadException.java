/******************************************************************************
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
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.exceptions;

/**
 * @author ctr
 * 
 *         Exception that is thrown while downloading a program onto a processor
 */
public class LoadException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 6075808941855187075L;
    private final String cause;

    /**
     * @param cause
     *            specific explanaition, while the download failed
     */
    public LoadException(final String cause) {
        this.cause = cause;
    }

    @Override
    public String getMessage() {
        return "Load: " + cause;
    }

}
