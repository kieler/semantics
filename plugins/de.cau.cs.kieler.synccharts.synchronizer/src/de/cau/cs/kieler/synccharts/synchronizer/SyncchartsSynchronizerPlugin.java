/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.synchronizer;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author chsch
 * @kieler.ignore (excluded from review process)
 */
public class SyncchartsSynchronizerPlugin extends Plugin {

    /** The plug-in ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.synccharts.synchronizer";

    // The shared instance
    private static SyncchartsSynchronizerPlugin plugin;

    /**
     * The constructor.
     */
    public SyncchartsSynchronizerPlugin() {
    }

    /**
     * {@inheritDoc}
     * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
     */
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;

    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static SyncchartsSynchronizerPlugin getDefault() {
        return plugin;
    }

}
