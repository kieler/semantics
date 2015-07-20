package de.cau.cs.kieler.prom.launchconfig.ui

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup
import org.eclipse.debug.ui.CommonTab
import org.eclipse.debug.ui.ILaunchConfigurationDialog
import org.eclipse.debug.ui.ILaunchConfigurationTab

/**
 * The tab group for the launch configuration.
 */
class LaunchConfigurationTabGroup extends AbstractLaunchConfigurationTabGroup {

    /**
     * {@inheritDoc}
     */
    override void createTabs(ILaunchConfigurationDialog dialog, String mode) {
        var mainTab = new MainTab()
        var sctTab = new CompilationTab()
        var execTab = new ExecuteTab()
        var commonTab = new CommonTab()
        
        var tabs = (#[mainTab, sctTab, execTab, commonTab] as ILaunchConfigurationTab[])
        setTabs(tabs)
    }
}
