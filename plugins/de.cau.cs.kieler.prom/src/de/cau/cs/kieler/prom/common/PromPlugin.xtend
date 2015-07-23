package de.cau.cs.kieler.prom.common

import org.eclipse.core.runtime.QualifiedName
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext

class PromPlugin extends AbstractUIPlugin implements BundleActivator  {
    
    // The plug-in ID
    public static val ID = "de.cau.kieler.prom.launchconfig"
    
    // The shared instance
    private static PromPlugin plugin;
    
    /**
     * Qualifier used to set the environment name property of a project.
     */
    public static val ENVIRIONMENT_QUALIFIER = new QualifiedName(PromPlugin.ID, "environment")
    /**
     * Qualifier used to set the main file's project relative path of a project.
     */
    public static val MAIN_FILE_QUALIFIER = new QualifiedName(PromPlugin.ID, "main.file")

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
    public static def PromPlugin getDefault() {
        return plugin;
    }
}
