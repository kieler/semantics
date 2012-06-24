/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.sim.s;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author cmot
 */
public class SyncChartsSimSPlugin extends AbstractUIPlugin {

    /** The plug-in ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.synccharts.sim.s"; //$NON-NLS-1$

    /** The shared instance. */
    private static SyncChartsSimSPlugin plugin;
    
    /**
     * The Constant AUXILIARY_VARIABLE_TAG. This TAG is also defined in S2Simulation.xtend. Both
     * TAGs must match
     */
    public static final String AUXILIARY_VARIABLE_TAG 
                           = "oSYNCCHARTSoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo";

    // -------------------------------------------------------------------------

    /**
     * The constructor.
     */
    public SyncChartsSimSPlugin() {
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
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static SyncChartsSimSPlugin getDefault() {
        return plugin;
    }

    // -------------------------------------------------------------------------
}
