package de.cau.cs.kieler.sccharts.launchconfig.ui

import java.util.List
import org.eclipse.core.runtime.Platform
import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup
import org.eclipse.debug.ui.CommonTab
import org.eclipse.debug.ui.ILaunchConfigurationDialog
import org.eclipse.debug.ui.ILaunchConfigurationTab
import org.eclipse.swt.widgets.Control
import org.eclipse.core.runtime.FileLocator
import org.apache.commons.io.IOUtils
import java.io.File

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

    /**
     * Enable or disable all controls in the list and the controls on the same level.
     */
    public static def enableControls(List<Control> controls, boolean value){
        
        controls.forEach [
            // We want to enable all controls on the same level as this control (e.g. browse buttons).
            // Thus we set the field for all children of this control's parent.            
            it.parent.children.forEach [
                it.enabled = value
            ]
        ]
    }

}
