package de.cau.cs.kieler.sccharts.launchconfig.ui

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup
import org.eclipse.debug.ui.CommonTab
import org.eclipse.debug.ui.ILaunchConfigurationDialog
import org.eclipse.debug.ui.ILaunchConfigurationTab

/**
 * The tab group for an SCCharts launch configuration.
 */
class SCChartsLaunchConfigurationTabGroup extends AbstractLaunchConfigurationTabGroup {

    /**
     * {@inheritDoc}
     */
    override void createTabs(ILaunchConfigurationDialog dialog, String mode) {
        var mainTab = new MainTab()
        var sctTab = new SCTCompilationTab()
        var execTab = new ExecuteTab()
        var commonTab = new CommonTab()
        
        var tabs = (#[mainTab, sctTab, execTab, commonTab] as ILaunchConfigurationTab[])
        setTabs(tabs)
    }
}
