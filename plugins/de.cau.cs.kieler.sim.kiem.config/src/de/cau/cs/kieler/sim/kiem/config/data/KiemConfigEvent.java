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

import de.cau.cs.kieler.sim.kiem.KiemEvent;

/**
 * This class holds additional event constants that are needed for the
 * scheduling manager.
 * 
 * @author soh
 * @kieler.rating 2010-01-27 proposed yellow
 */
public class KiemConfigEvent extends KiemEvent {

    /** This constant indicates that the preferences have been saved. */
    public static final int PREFERENCES_SAVED = 100;
    /** This constant indicates that the file location was changed. */
    public static final int FILE_LOCATION_CHANGED = 101;
    /** This constant indicates that a new file was loaded. */
    public static final int FILE_LOADED = 102;
    /** This constant indicates that a file was saved. */
    public static final int FILE_SAVED = 103;

    /**
     * Creates a new KiemConfigEvent.
     * 
     * @param param
     *            the coded event
     */
    public KiemConfigEvent(final int param) {
        super(param);
    }

    /**
     * Creates a new KiemConfigEvent.
     * 
     * @param param
     *            the coded event
     * @param info
     *            the information
     */
    public KiemConfigEvent(final int param, final Object info) {
        super(param, info);
    }

}
