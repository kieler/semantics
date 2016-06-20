package de.cau.cs.kieler.prom.simulation

import org.eclipse.debug.core.model.ILaunchConfigurationDelegate
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunch
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.CoreException

class SimulationLaunchConfig implements ILaunchConfigurationDelegate {
    
    /**
     * The extension id of this launch config type.
     * It is set in the plugin.xml.
     */
    public static String LAUNCH_CONFIGURATION_TYPE_ID = "de.cau.cs.kieler.prom.simulation.simulationLaunchConfig"
    
    // Attribute names
    public static val ATTR_FILES = "de.cau.cs.kieler.prom.simulation.files"
    
    override launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
        println("Launching simulation "+configuration.name + " in "+ mode +" mode.")
        
        // TODO: compile via prom and get compilation result

        // TODO: Move to launch config
        // Start simulator
//        val simulator = getSimulatorFromDialog()
//        if(simulator != null) {
//            simulator.simulate(files, #[], #[]);
//        }
    }
    
}