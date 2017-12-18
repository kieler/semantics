package de.cau.cs.kieler.simulation.ui

import com.google.inject.Module
import de.cau.cs.kieler.prom.build.RegisterVariablesFinder
import de.cau.cs.kieler.simulation.KiSimRuntimeModule
import de.cau.cs.kieler.simulation.trace.KTraceRuntimeModule
import de.cau.cs.kieler.simulation.ui.internal.KiSimActivator
import de.cau.cs.kieler.simulation.ui.trace.KTraceUiModule
import de.cau.cs.kieler.simulation.ui.trace.internal.KTraceActivator
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.osgi.framework.BundleContext

/**
 * The activator class controls the plug-in life cycle
 */
class SimulationUiPlugin extends KiSimActivator {
    /**
     *  The plug-in ID
     */
    public static val PLUGIN_ID = "de.cau.cs.kieler.simulation.ui"
    
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
    }

    /*
     * (non-Javadoc)
     * @see AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    override void start(BundleContext context) throws Exception {
        super.start(context)
        ktraceDelegate.start(context)
        plugin = this
        
        // Create register variables finder to communicate register variables
        new RegisterVariablesFinder
    }

    /*
     * (non-Javadoc)
     * @see AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
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
            return new KiSimRuntimeModule()
        } else if (KTraceActivator.DE_CAU_CS_KIELER_SIMULATION_TRACE_KTRACE.equals(grammar)) {
            return new KTraceRuntimeModule()
        }
        throw new IllegalArgumentException(grammar)
    }

    override protected Module getUiModule(String grammar) {
        if (DE_CAU_CS_KIELER_SIMULATION_KISIM.equals(grammar)) {
            return new KiSimUiModule(this)
        } else if (KTraceActivator.DE_CAU_CS_KIELER_SIMULATION_TRACE_KTRACE.equals(grammar)) {
            return new KTraceUiModule(this)
        }
        throw new IllegalArgumentException(grammar)
    }
}
