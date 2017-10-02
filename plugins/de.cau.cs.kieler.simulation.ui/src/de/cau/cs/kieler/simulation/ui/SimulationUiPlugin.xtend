package de.cau.cs.kieler.simulation.ui

import org.osgi.framework.BundleContext
import com.google.inject.Module
import de.cau.cs.kieler.simulation.ui.internal.KiSimActivator
import de.cau.cs.kieler.simulation.ui.trace.internal.KTraceActivator
import de.cau.cs.kieler.prom.ExtensionLookupUtil

/** 
 * The activator class controls the plug-in life cycle
 */
class SimulationUiPlugin extends KiSimActivator {
    /**
     *  The plug-in ID
     */
    public static val PLUGIN_ID = "de.cau.cs.kieler.simulation.ui"
    
    /**
     * The extension point id of simulation participants
     */
    public static val SIMULATION_PARTICIPANT_EXTENSION_POINT = "de.cau.cs.kieler.simulation.ui.simulationParticipant"
    
    /**
     *  The shared instance
     */
    static SimulationUiPlugin plugin
    
    /**
     * KTrace delegate
     */
    static KTraceActivator ktraceDelegate

    /** 
     * The constructor
     */
    new() {
        ktraceDelegate = new KTraceActivator()
        
        // Create registered simulation visualizers
        val configElements = ExtensionLookupUtil.getConfigurationElements(SIMULATION_PARTICIPANT_EXTENSION_POINT)
        if(!configElements.isNullOrEmpty) {
            for(configElement : configElements) {
                ExtensionLookupUtil.instantiateClassFromConfiguration(configElement)
            }
        }
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    override void start(BundleContext context) throws Exception {
        super.start(context)
        ktraceDelegate.start(context)
        plugin = this
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    override void stop(BundleContext context) throws Exception {
        plugin = null
        ktraceDelegate.stop(context)
        super.stop(context)
    }

    /** 
     * Returns the shared instance
     * @return the shared instance
     */
    def static SimulationUiPlugin getDefault() {
        return plugin
    }

    override protected Module getRuntimeModule(String grammar) {
        if (DE_CAU_CS_KIELER_SIMULATION_KISIM.equals(grammar)) {
            return new de.cau.cs.kieler.simulation.KiSimRuntimeModule()
        } else if (KTraceActivator.DE_CAU_CS_KIELER_SIMULATION_TRACE_KTRACE.equals(grammar)) {
            return new de.cau.cs.kieler.simulation.trace.KTraceRuntimeModule()
        }
        throw new IllegalArgumentException(grammar)
    }

    override protected Module getUiModule(String grammar) {
        if (DE_CAU_CS_KIELER_SIMULATION_KISIM.equals(grammar)) {
            return new de.cau.cs.kieler.simulation.ui.KiSimUiModule(this)
        } else if (KTraceActivator.DE_CAU_CS_KIELER_SIMULATION_TRACE_KTRACE.equals(grammar)) {
            return new de.cau.cs.kieler.simulation.ui.trace.KTraceUiModule(this)
        }
        throw new IllegalArgumentException(grammar)
    }
}
