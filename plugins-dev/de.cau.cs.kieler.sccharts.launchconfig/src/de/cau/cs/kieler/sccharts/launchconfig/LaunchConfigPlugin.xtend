package de.cau.cs.kieler.sccharts.launchconfig

import org.eclipse.core.runtime.QualifiedName
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext

class LaunchConfigPlugin extends AbstractUIPlugin implements BundleActivator  {
    
    // The plug-in ID
    public static val ID = "de.cau.kieler.sccharts.launchconfig"
    
    // The shared instance
    private static LaunchConfigPlugin plugin;
    
    /**
     * Qualifier used to set the environment name property of a SCCharts project.
     */
    public static val ENVIRIONMENT_QUALIFIER = new QualifiedName(LaunchConfigPlugin.ID, "environment")
    /**
     * Qualifier used to set the main file's project relative path of a SCCharts project.
     */
    public static val MAIN_FILE_QUALIFIER = new QualifiedName(LaunchConfigPlugin.ID, "main.file")

    /**
     * The constructor
     */
    new(){
    }

    /*
     * (non-Javadoc)
     * @see BundleActivator#start(org.osgi.framework.BundleContext)
     */
    override void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this
    }

    /*
     * (non-Javadoc)
     * @see BundleActivator#stop(org.osgi.framework.BundleContext)
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
