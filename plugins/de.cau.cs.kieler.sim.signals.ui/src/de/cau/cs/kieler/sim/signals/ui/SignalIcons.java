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

package de.cau.cs.kieler.sim.signals.ui;

import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * The Class Signalcons. It provides all basic plug-in icons except the ones that are used by the
 * {@link de.cau.cs.kieler.sim.kiem.properties.KiemPropertyType}s and are declared directly by those
 * types.
 * 
 * @author cmot
 * @kieler.rating proposed 2012-08-08 yellow KI-22
 * 
 */
public final class SignalIcons {

    // -------------------------------------------------------------------------
    // images

    /** The Constant Image/ImageDescriptor INPUT_SIGNAL. */
    public static final Image INPUT_SIGNAL = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.signals.ui", "icons/inputSignal.png").createImage();

    /** The Constant Image/ImageDescriptor OUTPUT_SIGNAL. */
    public static final Image OUTPUT_SIGNAL = AbstractUIPlugin.imageDescriptorFromPlugin(
            "de.cau.cs.kieler.sim.signals.ui", "icons/outputSignal.png").createImage();

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new KIEM icons.
     */
    private SignalIcons() {
    }

}
