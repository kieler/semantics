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
package de.cau.cs.kieler.sim.kart.ui;

import org.eclipse.swt.graphics.RGB;

import de.cau.cs.kieler.sim.kart.ISignalVisualization;
import de.cau.cs.kieler.sim.signals.ui.views.SignalsView;

/**
 * Class to create an interface between the extension point of the KART plugin
 * and the signals.ui package to visually mark signals as invalid.
 * 
 * @author Sebastian Schäfer - ssc AT informatik.uni-kiel.de
 * @kieler.rating 2012-01-24 red
 */
public class SignalVisualization implements ISignalVisualization {
    /**
     * The color states will be marked with as invalid.
     * This is the same color used by Esterel Studio.
     */
    public static final RGB color = new RGB(255, 0, 255);

    /**
     * {@inheritDoc}
     */
    public void visualize(String signalName, long step) {
        if(SignalsView.getInstance() != null) {
            SignalsView.getInstance().getColors().setSignalColor(signalName, color, step);
        }

    }

}
