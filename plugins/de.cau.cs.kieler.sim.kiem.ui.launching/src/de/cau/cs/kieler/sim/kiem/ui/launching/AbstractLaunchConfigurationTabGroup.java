package de.cau.cs.kieler.sim.kiem.ui.launching;

import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class AbstractLaunchConfigurationTabGroup extends
        org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup {

    public AbstractLaunchConfigurationTabGroup() {
        System.out.println("LAUNCH CONFIG TAB");
    }

    public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
        System.out.println("LAUNCH CONFIG TAB");
        ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] { new KiemTab()
//                ,new CommonTab() };
        };
        setTabs(tabs);

    }


}
