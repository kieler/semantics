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
public class AbstractLaunchConfigurationTabGroup extends
        org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup {

    public AbstractLaunchConfigurationTabGroup() {
    }

    // --------------------------------------------------------------------------

    public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
        ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] { new KiemTab(),
            new CommonTab() };
        setTabs(tabs);

    }
}
