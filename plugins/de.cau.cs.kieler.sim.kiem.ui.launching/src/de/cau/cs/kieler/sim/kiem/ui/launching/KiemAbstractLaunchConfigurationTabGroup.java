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

import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

/**
 * The class AbstractLaunchConfigurationTabGroup creates the tabs for the launch configuration. By
 * convention a CommonTab is required to be created.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2011-07-15 proposed yellow
 * 
 */
public class KiemAbstractLaunchConfigurationTabGroup extends
        org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup {

    /**
     * Instantiates a new abstract launch configuration tab group.
     */
    public KiemAbstractLaunchConfigurationTabGroup() {
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void createTabs(final ILaunchConfigurationDialog dialog, final String mode) {
        ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] { new KiemTab(),
            new CommonTab() };
        setTabs(tabs);

    }
}
