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
package de.cau.cs.kieler.krep.evalbench.exceptions;

import de.cau.cs.kieler.core.KielerException;

/**
 * Exception used by the communication protocols.
 * 
 * @kieler.rating 2009-12-10 proposed yellow ctr
 * 
 * @author msp, ctr
 */
public class CommunicationException extends KielerException {

    /**
     * Creates a communication exception with given message.
     * 
     * @param message
     *            message to be stored
     */
    public CommunicationException(final String message) {
        super(message);
    }

}
