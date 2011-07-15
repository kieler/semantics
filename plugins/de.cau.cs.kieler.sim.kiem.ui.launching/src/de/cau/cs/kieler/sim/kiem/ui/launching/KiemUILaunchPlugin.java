package de.cau.cs.kieler.sim.kiem.ui.launching;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2011-07-15 proposed yellow
 * 
 */
public class KiemUILaunchPlugin extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "de.cau.cs.kieler.sim.kiem.ui.run"; //$NON-NLS-1$

    /**
     * The constant ATTR_EXECUTION_SCHEDULE for storing execution schedules in the launch
     * configuration.
     */
    public static final String ATTR_EXECUTION_SCHEDULE = "de.cau.cs.kieler.sim.kiem.executionschedule"; //$NON-NLS-1$

    // The shared instance
    private static KiemUILaunchPlugin plugin;

    // --------------------------------------------------------------------------

    /**
     * The constructor
     */
    public KiemUILaunchPlugin() {
    }

    // --------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    // --------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    // --------------------------------------------------------------------------

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static KiemUILaunchPlugin getDefault() {
        return plugin;
    }

}
