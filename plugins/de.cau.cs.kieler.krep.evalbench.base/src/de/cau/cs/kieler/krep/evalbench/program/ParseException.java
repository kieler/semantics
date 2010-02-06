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
package de.cau.cs.kieler.krep.evalbench.program;

import de.cau.cs.kieler.core.KielerException;

/**
 * Any exception that occurred while Parsing an Assembler file.
 * 
 * @kieler.rating 2010-02-05 yellow 
 *   review by cmot, msp
 * 
 * @author ctr
 * 
 */
public class ParseException extends KielerException {

    /**
     * @param cause
     *            detailed cause for the exception
     */
    public ParseException(final String cause) {
        super("Parser: " + cause);
    }

    /** The serial version UID. */
    private static final long serialVersionUID = 1L;

}
