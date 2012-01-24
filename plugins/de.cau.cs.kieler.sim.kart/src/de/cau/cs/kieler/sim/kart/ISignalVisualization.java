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

import org.eclipse.swt.graphics.RGB;

/**
 * Interface for the Signal Visualization extension point. This can be used to
 * visualize invalid signals in some way, e. g. with the signals.ui view.
 * 
 * @author Sebastian Schäfer - ssc AT informatik.uni-kiel.de
 * @kieler.rating 2012-01-24 red
 */
public interface ISignalVisualization {
    /**
     * Visually mark a signal as invalid.
     * 
     * @param signalName the name of the signal to mark
     * @param step the step in which the signal is invalid
     */
    public void visualize(String signalName, long step);
}
