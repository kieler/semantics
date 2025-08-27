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
package de.cau.cs.kieler.sccharts.prio.dependencies;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 * 
 */
public class SCChartsPrioDependenciesPlugin extends AbstractUIPlugin {

    /** The Constant PLUGIN_ID. */
    public static final String PLUGIN_ID 
    = "de.cau.cs.kieler.sccharts.prio.dependencies"; //$NON-NLS-1$

    /** The plugin. */
    private static SCChartsPrioDependenciesPlugin plugin;

    // ---------------------------------------------------------------------

    /**
     * The constructor.
     */
    public SCChartsPrioDependenciesPlugin() {
    }

    // ---------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    // ---------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    // ---------------------------------------------------------------------

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static SCChartsPrioDependenciesPlugin getDefault() {
        return plugin;
    }

    // ---------------------------------------------------------------------

}
