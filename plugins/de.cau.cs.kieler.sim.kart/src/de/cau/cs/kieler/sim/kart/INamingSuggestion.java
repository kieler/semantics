/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kart;

/**
 * Interface for an extension point to allow kart.ui to auto-suggest names for ESO trace files.
 * 
 * @author Sebastian Schäfer - ssc AT informatik.uni-kiel.de
 * @kieler.rating 2012-02-23 red
 */
public interface INamingSuggestion {
    /**
     * Suggest a file name for an ESO trace file. This must be an absolute file system path.
     * 
     * @return the suggested path and file name
     */
    public String suggestName();
}
