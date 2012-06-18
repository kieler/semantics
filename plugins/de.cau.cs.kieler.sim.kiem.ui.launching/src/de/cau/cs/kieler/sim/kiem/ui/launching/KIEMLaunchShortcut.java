/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
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
 * The Class KIEMLaunchShortcut.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2011-07-15 proposed yellow
 * 
 */
public class KIEMLaunchShortcut implements ILaunchShortcut {

    /** The constant KIEM_LAUNCH_TYPE. */
    public static final String KIEM_LAUNCH_TYPE = "de.cau.cs.kieler.sim.kiem.ui.launching.KIEM";

    /** The constant ATTR_BATCH_PATH. */
    static final String ATTR_BATCH_PATH = "PATH_TO_BATCH_FILE";

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void launch(final ISelection selection, final String mode) {
        //System.out.println("LAUNCH SELECTION" + selection.toString() + ", " + mode);
        //ILaunchManager lm = DebugPlugin.getDefault().getLaunchManager();
        //ILaunchConfigurationType type = lm.getLaunchConfigurationType(KIEM_LAUNCH_TYPE);
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void launch(final IEditorPart editor, final String mode) {
        //System.out.println("LAUNCH EDITOR" + editor.toString() + ", " + mode);
    }

}
