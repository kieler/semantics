/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem.ui.launching;

import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;

/**
 * The class KIEMLaunchShortcut is needed for extension point org.eclipse.debug.ui.launchShortcuts.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2011-07-15 proposed yellow
 * 
 */
public class KiemLaunchShortcut implements ILaunchShortcut {

    /** The constant KIEM_LAUNCH_TYPE. */
    public static final String KIEM_LAUNCH_TYPE = "de.cau.cs.kieler.sim.kiem.ui.launching.KIEM";

    /** The constant ATTR_BATCH_PATH. */
    static final String ATTR_BATCH_PATH = "PATH_TO_BATCH_FILE";

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void launch(final ISelection selection, final String model) {
        if (KiemUILaunchPlugin.DEBUG) {
            KiemUILaunchPlugin.log("LAUNCH SELECTION" + selection.toString() + ", " + model);
        }
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void launch(final IEditorPart editor, final String model) {
        if (KiemUILaunchPlugin.DEBUG) {
            KiemUILaunchPlugin.log("LAUNCH EDITOR" + editor.toString() + ", " + model);
        }
    }

    // --------------------------------------------------------------------------

}
