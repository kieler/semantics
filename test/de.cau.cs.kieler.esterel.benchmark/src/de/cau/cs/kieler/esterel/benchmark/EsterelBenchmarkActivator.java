package de.cau.cs.kieler.esterel.benchmark;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class EsterelBenchmarkActivator implements BundleActivator {

    // The plug-in ID
    public static final String PLUGIN_ID = "de.cau.cs.kieler.esterel.benchmark"; //$NON-NLS-1$

    // The shared instance
    private static EsterelBenchmarkActivator plugin;
    
    /**
     * The constructor
     */
    public EsterelBenchmarkActivator() {
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
//        super.start(context);
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
//        super.stop(context);
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static EsterelBenchmarkActivator getDefault() {
        return plugin;
    }
}
