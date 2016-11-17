/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.sim.java;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author cmot
 * @kieler.design 2014-07-17 proposed cmot
 * @kieler.rating 2014-07-17 proposed yellow
 */
public class SCChartsSimCPlugin extends AbstractUIPlugin {

    /** The Constant PLUGIN_ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.sccharts.sim.java"; //$NON-NLS-1$

    /**
     * The Constant AUXILIARY_VARIABLE_TAG for a Transition.
     */
    public static final String AUXILIARY_VARIABLE_TAG_TRANSITION = "_T";

    /**
     * The Constant AUXILIARY_VARIABLE_TAG for a State.
     */
//    public static final String AUXILIARY_VARIABLE_TAG_STATE = "oSCCHARTSoAUXSTATEo";
    public static final String AUXILIARY_VARIABLE_TAG_STATE = "_S";

    /** The shared instance. */
    private static SCChartsSimCPlugin plugin;

    // ---------------------------------------------------------------------

    /**
     * The constructor
     */
    public SCChartsSimCPlugin() {
    }

    // ---------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    // ---------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    // ---------------------------------------------------------------------

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static SCChartsSimCPlugin getDefault() {
        return plugin;
    }

    // ---------------------------------------------------------------------

}
