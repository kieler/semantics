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
 * @author ssc
 *
 */
public class SignalVisualization implements ISignalVisualization {
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
