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
 */
package de.cau.cs.kieler.kvid;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Activator class for the KViD-Plugin. Controls the plugin's lifecycle.
 * 
 * @author jjc
 * 
 */
public class KvidPlugin extends AbstractUIPlugin implements BundleActivator {

    /** The ID of this plugin. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.kvid"; //$NON-NLS-1$

    /** The shared instance. */
    private static KvidPlugin plugin;


    /*
     * (non-Javadoc)
     * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
     */
    @Override
    public void start(final BundleContext bundleContext) throws Exception {
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop(final BundleContext bundleContext) throws Exception {
    }

    /**
     * Returns the shared instance of the KViD-Plugin.
     * 
     * @return The only instance of this plugin activator
     */
    public static KvidPlugin getDefault() {
        return plugin;
    }

}
