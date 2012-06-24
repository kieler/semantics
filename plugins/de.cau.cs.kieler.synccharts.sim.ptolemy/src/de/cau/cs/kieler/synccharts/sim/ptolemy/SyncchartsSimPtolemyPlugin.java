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
package de.cau.cs.kieler.synccharts.sim.ptolemy;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author cmot
 */
public class SyncchartsSimPtolemyPlugin extends Plugin {

    /** The Constant PLUGIN_ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.synccharts.sim.ptolemy";

    /** The plugin. */
    private static SyncchartsSimPtolemyPlugin plugin;

    /** The Constant DEBUG. If true print out debug information. */
    public static final boolean DEBUG = !System.getProperty("java.vm.info", "").contains("sharing");

    // ---------------------------------------------------------------------

    /**
     * The constructor.
     */
    public SyncchartsSimPtolemyPlugin() {
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
    public static SyncchartsSimPtolemyPlugin getDefault() {
        return plugin;
    }

    // ---------------------------------------------------------------------

    /**
     * DEBUG.
     * 
     * @param debugOutputText
     *            the debug output text
     */
    public static void debug(final String debugOutputText) {
        if (DEBUG) {
            System.out.println(debugOutputText);
        }
    }

    // ---------------------------------------------------------------------

}
