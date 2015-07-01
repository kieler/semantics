package de.cau.cs.kieler.sccharts.launchconfig

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext

class LaunchConfigPlugin extends AbstractUIPlugin implements BundleActivator  {
    
    // The plug-in ID
    public static String ID = "de.cau.kieler.sccharts.launchconfig"
    
    // The shared instance
    private static LaunchConfigPlugin plugin;

    /**
     * The constructor
     */
    new(){
    }

    /*
     * (non-Javadoc)
     * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
     */
    override void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this
    }

    /*
     * (non-Javadoc)
     * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    override void stop(BundleContext context) throws Exception {
        plugin = null
        super.stop(context);
    }
    
    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static def LaunchConfigPlugin getDefault() {
        return plugin;
    }
}
