package de.cau.cs.kieler.prom.simulation

import org.eclipse.debug.core.model.ILaunchConfigurationDelegate
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunch
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.CoreException

class SimulationLaunchConfig implements ILaunchConfigurationDelegate {
    
    override launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
        println("Launching simulation "+configuration.name + " in "+ mode +" mode.")
    }
    
}