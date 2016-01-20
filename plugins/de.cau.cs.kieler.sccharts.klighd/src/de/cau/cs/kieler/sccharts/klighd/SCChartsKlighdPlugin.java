package de.cau.cs.kieler.sccharts.klighd;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class SCChartsKlighdPlugin implements BundleActivator {

    // The plug-in ID
    public static final String PLUGIN_ID = "de.cau.cs.kieler.sccharts.klighd"; //$NON-NLS-1$

    // The shared instance
    private static SCChartsKlighdPlugin plugin;

    /**
     * The constructor
     */
    public SCChartsKlighdPlugin() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    @Override
    public void start(BundleContext context) throws Exception {
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        plugin = null;
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static SCChartsKlighdPlugin getDefault() {
        return plugin;
    }
}
