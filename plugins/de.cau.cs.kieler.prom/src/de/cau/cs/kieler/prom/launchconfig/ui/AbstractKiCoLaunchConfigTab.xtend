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

import de.cau.cs.kieler.prom.common.KiCoLaunchData
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab

abstract class AbstractKiCoLaunchConfigTab extends AbstractLaunchConfigurationTab {
    /**
     * The tab group that created this tab.
     */
    private KiCoLaunchConfigTabGroup tabGroup
    
    /**
     * Flag to indicate that changes in the UI should not be applied to the lanuch config.
     * This is needed in initializeFrom() to prevent applying the loaded values,
     * until all UI controls have been initialized.  
     */
    protected boolean doNotApplyUIChanges
    
    
     /**
     * Constructor
     */
    new(KiCoLaunchConfigTabGroup tabGroup) {
        this.tabGroup = tabGroup
    }
    
    /**
     * {@inheritDoc}
     */
    override initializeFrom(ILaunchConfiguration configuration) {
//        if(launchData == null)
            launchData = KiCoLaunchData.loadFromConfiguration(configuration)
    }
    
    /** 
     * {@inheritDoc}
     */
    override void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
    }
    
    /**
     * Delegate to the launch data of the tab group 
     */
    def protected KiCoLaunchData getLaunchData() {
        return tabGroup.launchData
    }
    
     /**
     * Delegate to the launch data of the tab group 
     */
    def protected void setLaunchData(KiCoLaunchData value) {
        tabGroup.launchData = value
    }
}