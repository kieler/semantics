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
 package de.cau.cs.kieler.prom.simulation

import de.cau.cs.kieler.prom.common.EnvironmentData
import de.cau.cs.kieler.prom.common.ExtensionLookupUtil
import de.cau.cs.kieler.prom.common.FileData
import de.cau.cs.kieler.prom.common.PromPlugin
import de.cau.cs.kieler.prom.common.SimulationLaunchData
import de.cau.cs.kieler.prom.launchconfig.KiCoLaunchConfig
import de.cau.cs.kieler.prom.launchconfig.PromLaunchConfig
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Status
import org.eclipse.debug.core.ILaunch
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.xtend.lib.annotations.Accessors

class SimulationLaunchConfig extends PromLaunchConfig {
    
    /**
     * The extension id of this launch config type.
     * It is set in the plugin.xml.
     */
    public static String LAUNCH_CONFIGURATION_TYPE_ID = "de.cau.cs.kieler.prom.simulation.simulationLaunchConfig"
    
    // Objects loaded from configuration
    @Accessors
    private SimulationLaunchData launchData

    @Accessors
    private IProject project
    
    // Attribute names
    public static val ATTR_FILES = "de.cau.cs.kieler.prom.simulation.files"
    
    override launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
        println("Launching simulation "+configuration.name + " in "+ mode +" mode.")
        super.launch(configuration, mode, launch, monitor)

        // Init console for errors and messages
        clearConsole()

        // Get data from config.
        loadSettingsFromConfiguration()

        if (project != null) {
            val launchConfig = new KiCoLaunchConfig()
            
            // Prepare launch data for KiCo launch configuration
            val store = PromPlugin.^default.preferenceStore
            val environment = EnvironmentData.loadInstanceFromPreferenceStore(store, launchData.environmentName)
            // Use launch data of environment as start.
            // Note: This will not mutate the environment, because the environment will not be saved.
            val kicoLaunchData = environment.launchData
            // Set project            
            kicoLaunchData.projectName = project.name
            // Set files
            for(f : launchData.files) {
                if(!f.isProvidesInputs) {
                    kicoLaunchData.files += new FileData(f.projectRelativePath)
                }
            }
            
            // Start KiCo launch configuration
            val status = launchConfig.launch(kicoLaunchData)
            
            // Start simulator
            if(status.code == Status.OK) {
                val simulator = ExtensionLookupUtil.getSimulator(launchData.simulatorClassName)
                if(simulator != null) {
                    val inputFiles = launchData.files.map[return project.getFile(new Path(it.projectRelativePath)) ]
                    simulator.simulate(inputFiles, launchConfig.compiledFiles, launchConfig.compilationResults);
                } else {
                    writeToConsole("Simulator '"+launchData.simulatorClassName
                        + "' of launch configuration '" + configuration.name
                        + "' can not be instantiated.\n"); 
                }
            }
        } else {
            writeToConsole("Project of launch configuration '" + configuration.name
                + "' does not exist.\n");
        }
    }
    
    def loadSettingsFromConfiguration() {
        launchData = SimulationLaunchData.loadFromConfiguration(configuration)
        project = findProject(launchData.projectName)
    }    
}