package de.cau.cs.kieler.esterel.test;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class EsterelTestActivator implements BundleActivator {

    // The plug-in ID
    public static final String PLUGIN_ID = "de.cau.cs.kieler.esterel.test"; //$NON-NLS-1$

    // The shared instance
    private static EsterelTestActivator plugin;
    
    /**
     * The constructor
     */
    public EsterelTestActivator() {
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
    public static EsterelTestActivator getDefault() {
        return plugin;
    }

}
