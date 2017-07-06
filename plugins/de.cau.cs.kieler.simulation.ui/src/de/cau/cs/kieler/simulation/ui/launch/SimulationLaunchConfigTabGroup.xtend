/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.simulation.ui.launch

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