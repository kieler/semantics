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
package de.cau.cs.kieler.krep.evalbench.comm;

import de.cau.cs.kieler.core.KielerException;

/**
 * Exception that is thrown while downloading a program onto a processor.
 * 
 * @kieler.rating 2010-02-05 yellow 
 *   review by cmot, msp
 * 
 * @author ctr
 * */
public class LoadException extends KielerException {

    private static final long serialVersionUID = 6075808941855187075L;

    /**
     * @param cause
     *            specific explanation, while the download failed
     */
    public LoadException(final String cause) {
        super("Load: " + cause);
    }
}
