/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.s;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.core.model.AbstractUIPluginLog;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author cmot
 * @kieler.design 2013-10-10 proposed
 * @kieler.rating 2013-10-10 proposed yellow
 */
public class SCChartsSPlugin extends AbstractUIPluginLog {

    /** The Constant PLUGIN_ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.sccharts.s"; //$NON-NLS-1$

    /** The plugin. */
    private static SCChartsSPlugin plugin;

    // -------------------------------------------------------------------------

    /**
     * The constructor of the SCCharts to S Code Generation Plugin.
     */
    public SCChartsSPlugin() {
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    // -------------------------------------------------------------------------

    /**
     * Returns the single shared instance.
     * 
     * @return the shared instance
     */
    public static SCChartsSPlugin getDefault() {
        return plugin;
    }

    // -------------------------------------------------------------------------

}
