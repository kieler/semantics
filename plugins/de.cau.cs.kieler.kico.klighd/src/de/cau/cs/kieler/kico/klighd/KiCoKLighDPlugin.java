package de.cau.cs.kieler.kico.klighd;

import org.eclipse.core.runtime.Preferences;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class KiCoKLighDPlugin extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "de.cau.cs.kieler.kico.klighd"; //$NON-NLS-1$

    // The shared instance
    private static KiCoKLighDPlugin plugin;

    /**
     * The constructor
     */
    public KiCoKLighDPlugin() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static KiCoKLighDPlugin getDefault() {
        return plugin;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the last used directory from preferences
     * 
     * @return last used directory
     */
    public static String getLastDir() {
        Preferences prefs = getDefault().getPluginPreferences();
        String value = prefs.getString("lastdir");
        return value;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the last used directory from preferences
     * 
     * @param lastDir
     *             last used directory
     */
    public static void setLastDir(String lastDir) {
        Preferences prefs = getDefault().getPluginPreferences();
        prefs.setValue("lastdir", lastDir);
        plugin.savePluginPreferences();
    }

}
