package de.cau.cs.kieler.simulation

import de.cau.cs.kieler.prom.ExtensionLookupUtil
import java.util.Set
import org.eclipse.xtend.lib.annotations.Accessors
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext

class SimulationPlugin implements BundleActivator {
    /**
     * The id of the plugin.
     */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.simulation"
    
    /**
     * The extension point id of simulation participants.
     */
    public static val SIMULATION_PARTICIPANT_EXTENSION_POINT = "de.cau.cs.kieler.simulation.simulationParticipant"
    
    @Accessors(PUBLIC_GETTER)
    private static val Set<SimulationParticipant> simulationParticipants = newHashSet
    
    /**
     * Flag to determine if the participants have been initialized.
     */
    private static var boolean initializedSimulationParticipants = false
    
    /**
     * The context
     */
    static BundleContext context

    /**
     * Returns the context
     */
    def static package BundleContext getContext() {
        return context
    }

    /*
     * (non-Javadoc)
     * @see BundleActivator#start(org.osgi.framework.BundleContext)
     */
    override void start(BundleContext bundleContext) throws Exception {
        SimulationPlugin.context = bundleContext
        
        // Create registered simulation participants
        if(!initializedSimulationParticipants) {
            initializedSimulationParticipants = true
            val configElements = ExtensionLookupUtil.getConfigurationElements(SIMULATION_PARTICIPANT_EXTENSION_POINT)
            if(!configElements.isNullOrEmpty) {
                for(configElement : configElements) {
                    val participant = ExtensionLookupUtil.instantiateClassFromConfiguration(configElement) as SimulationParticipant
                    simulationParticipants.add(participant)
                }
            }
        }
    }

    /*
     * (non-Javadoc)
     * @see BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    override void stop(BundleContext bundleContext) throws Exception {
        SimulationPlugin.context = null
    }
}
