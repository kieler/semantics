/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.prom.launchconfig.ui

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup
import org.eclipse.debug.ui.CommonTab
import org.eclipse.debug.ui.ILaunchConfigurationDialog
import org.eclipse.debug.ui.ILaunchConfigurationTab
import de.cau.cs.kieler.prom.common.KiCoLaunchData
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * The tab group for the launch configuration.
 * 
 * @author aas
 */
class KiCoLaunchConfigurationTabGroup extends AbstractLaunchConfigurationTabGroup {

    /**
     * The data object that the UI is working on.
     */
    @Accessors
    public KiCoLaunchData launchData
    
    /**
     * {@inheritDoc}
     */
    override void createTabs(ILaunchConfigurationDialog dialog, String mode) {
        var mainTab = new MainTab(this)
        var compilationTab = new CompilationTab(this)
        var execTab = new ExecuteTab(this)
        var commonTab = new CommonTab()
        
        var tabs = (#[mainTab, compilationTab, execTab, commonTab] as ILaunchConfigurationTab[])
        setTabs(tabs)
    }
}
