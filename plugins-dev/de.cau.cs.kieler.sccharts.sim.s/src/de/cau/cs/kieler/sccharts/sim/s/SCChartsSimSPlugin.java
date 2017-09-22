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
package de.cau.cs.kieler.sccharts.sim.s;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;

import de.cau.cs.kieler.sccharts.extensions.SCChartsSimulation;
import de.cau.cs.kieler.sccharts.s.SCCharts2STransformation;

/**
 * The activator class controls the plug-in life cycle.
 *
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
public class SCChartsSimSPlugin extends AbstractUIPlugin {

    /** The plug-in ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.sccharts.sim.s"; //$NON-NLS-1$

    /** The shared instance. */
    private static SCChartsSimSPlugin plugin;

    /**
     * The Constant AUXILIARY_VARIABLE_TAG for a Transition.
     */
    public static final String AUXILIARY_VARIABLE_TAG_TRANSITION
                           = "oSCCHARTSoAUXTRANSo";

    /**
     * The Constant AUXILIARY_VARIABLE_TAG for a State.
     */
    public static final String AUXILIARY_VARIABLE_TAG_STATE
                           = "oSCCHARTSoAUXSTATEo";

    // -------------------------------------------------------------------------

    /**
     * The constructor.
     */
    public SCChartsSimSPlugin() {
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
    public static SCChartsSimSPlugin getDefault() {
        return plugin;
    }

    // -------------------------------------------------------------------------
}
