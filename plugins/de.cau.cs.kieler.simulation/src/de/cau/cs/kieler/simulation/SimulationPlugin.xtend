package de.cau.cs.kieler.simulation

import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext

class SimulationPlugin implements BundleActivator {
    /**
     * The id of the plugin.
     */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.simulation"
    
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
    }

    /*
     * (non-Javadoc)
     * @see BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    override void stop(BundleContext bundleContext) throws Exception {
        SimulationPlugin.context = null
    }
}
