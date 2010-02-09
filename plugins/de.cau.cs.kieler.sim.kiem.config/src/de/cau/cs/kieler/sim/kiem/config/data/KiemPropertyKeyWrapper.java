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
package de.cau.cs.kieler.sim.kiem.config.data;

/**
 * Wraps around the property key.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public class KiemPropertyKeyWrapper extends AbstractStringWrapper {

    /** Id for serialization. */
    private static final long serialVersionUID = 3028066549799152724L;

    /**
     * Creates a new KiemPropertyKeyWrapper.
     * 
     * @param string
     *            the key
     */
    public KiemPropertyKeyWrapper(final String string) {
        super(string);
    }
}
