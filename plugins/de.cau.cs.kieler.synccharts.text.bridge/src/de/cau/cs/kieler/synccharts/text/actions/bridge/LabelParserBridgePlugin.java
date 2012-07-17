/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 */
package de.cau.cs.kieler.synccharts.text.actions.bridge;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author haf
 */
public class LabelParserBridgePlugin extends AbstractUIPlugin {

    /** The plug-in ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.synccharts.text.actions.bridge";

    // The shared instance
    private static LabelParserBridgePlugin plugin;

    public static final String AUTO_SERIALIZE = "LABELPARSER_AUTO_SERIALIZE";

    /**
     * The default constructor.
     */
    public LabelParserBridgePlugin() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext )
     */
    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;

        boolean b = new InstanceScope().getNode(PLUGIN_ID).getBoolean(
                AUTO_SERIALIZE, true);
        getPreferenceStore().setValue(AUTO_SERIALIZE, b);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext )
     */
    @Override
    public void stop(final BundleContext context) throws Exception {
        boolean b = getPreferenceStore().getBoolean(AUTO_SERIALIZE);
        new InstanceScope().getNode(PLUGIN_ID).putBoolean(AUTO_SERIALIZE, b);
        
    	plugin = null;
        
        
        super.stop(context);
    }

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static LabelParserBridgePlugin getDefault() {
        return plugin;
    }

    /**
     * Retrieves the value from the preference store indicating whether or not
     * parsed labels should be serialized automatically.
     * 
     * @return true if the automatic serialization is enabled
     */
    public boolean doAutomaticSerialization() {
        Boolean result = getPreferenceStore().getBoolean(AUTO_SERIALIZE);
        if (result == null) {
        	result = new InstanceScope().getNode(PLUGIN_ID).getBoolean(
                    AUTO_SERIALIZE, true);
            getPreferenceStore().setValue(AUTO_SERIALIZE, result);
        }
        return result;
    }
}
