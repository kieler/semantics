/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem.ui.launching;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2011-07-15 proposed yellow
 * 
 */
public class KiemUILaunchPlugin extends AbstractUIPlugin {

    /** The constant PLUGIN_ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.sim.kiem.ui.run"; //$NON-NLS-1$

    /**
     * The constant ATTR_EXECUTION_SCHEDULE for storing execution schedules in the launch
     * configuration.
     */
    public static final String ATTR_EXECUTION_SCHEDULE = "de.cau.cs.kieler.sim."
            + "kiem.executionschedule"; //$NON-NLS-1$

    /** The shared instance. */
    private static KiemUILaunchPlugin plugin;

    // --------------------------------------------------------------------------

    /**
     * The constructor of the plugin.
     */
    public KiemUILaunchPlugin() {
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    // --------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    // --------------------------------------------------------------------------

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static KiemUILaunchPlugin getDefault() {
        return plugin;
    }

}
