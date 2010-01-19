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

package de.cau.cs.kieler.sim.kiem;

import de.cau.cs.kieler.core.KielerException;

/**
 * The Class KiemMasterException. This Exception is thrown by the DataComponent implementation if a
 * non-master DataComponent tries to access the master~ methods.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class KiemMasterException extends KielerException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1645050957113020503L;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KiemMasterException.
     * 
     * @param message
     *            the message of this Exception to display to the user
     */
    public KiemMasterException(final String message) {
        super(message);
    }

}
