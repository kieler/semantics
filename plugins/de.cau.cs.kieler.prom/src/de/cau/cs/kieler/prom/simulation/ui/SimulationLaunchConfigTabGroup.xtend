package de.cau.cs.kieler.prom.simulation.ui

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup
import org.eclipse.debug.ui.ILaunchConfigurationDialog
import org.eclipse.debug.ui.ILaunchConfigurationTab

class SimulationLaunchConfigTabGroup extends AbstractLaunchConfigurationTabGroup {

    /**
     * {@inheritDoc}
     */
    override void createTabs(ILaunchConfigurationDialog dialog, String mode) {
        var mainTab = new SimulationMainTab()
        
        var tabs = (#[mainTab] as ILaunchConfigurationTab[])
        setTabs(tabs)
    }
}