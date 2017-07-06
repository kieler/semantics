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
package de.cau.cs.kieler.simulation.launch

import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.debug.core.ILaunch
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate

class SimulationLaunchConfig implements ILaunchConfigurationDelegate  {
    
    /**
     * The extension id of this launch config type.
     * It is set in the plugin.xml.
     */
    public static String LAUNCH_CONFIGURATION_TYPE_ID = "de.cau.cs.kieler.simulation.simulationLaunchConfig"
    
    override launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
        // TODO: Start simulation manager
    }
}