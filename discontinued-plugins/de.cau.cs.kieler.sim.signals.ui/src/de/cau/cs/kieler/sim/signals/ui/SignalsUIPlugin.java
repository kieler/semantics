/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.signals.ui;

import org.eclipse.core.runtime.Preferences;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The class SignalsUIPlugin is the activator of this plug-in.<BR>
 * <BR>
 * The activator is currently not used and not referenced from the MANIFEST.MF. The only thing
 * currently used from this class is the PLUGIN_ID constant.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-08-08 yellow KI-22
 */
public class SignalsUIPlugin extends AbstractUIPlugin {

    /** The Constant PLUGIN_ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.sim.signals.ui";

    /** The shared instance. */
    private static SignalsUIPlugin plugin;

    // -------------------------------------------------------------------------

    /**
     * The constructor of the table plug-in.
     */
    public SignalsUIPlugin() {
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    // -------------------------------------------------------------------------

    /**
     * Returns the shared instance of the signals UI plug-in.
     * 
     * @return the shared instance
     */
    public static SignalsUIPlugin getDefault() {
        return plugin;
    }

    // -------------------------------------------------------------------------

    /**
     * Returns an image descriptor for the image file at the given plug-in relative path.
     * 
     * @param path
     *            the relative path to the image
     * @return the image descriptor of the image
     */
    public static ImageDescriptor getImageDescriptor(final String path) {
        return imageDescriptorFromPlugin(PLUGIN_ID, path);
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is black background set.
     *
     * @return true, if is black background set
     */
    public static boolean isBlackBackgroundSet() {
        Preferences prefs = getDefault().getPluginPreferences();
        boolean value = prefs.getBoolean("blackbackground");
        return value;
    }

    // -------------------------------------------------------------------------
    
    /**
     * Sets the black background.
     *
     * @param isSet the new black background
     */
    public static void setBlackBackground(boolean isSet) {
        Preferences prefs = getDefault().getPluginPreferences();
        prefs.setValue("blackbackground", isSet);
        plugin.savePluginPreferences();
    }
}
