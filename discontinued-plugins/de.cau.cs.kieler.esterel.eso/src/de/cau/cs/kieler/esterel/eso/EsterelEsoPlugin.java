package de.cau.cs.kieler.esterel.eso;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

/**
 * The Esterel ESO Generator Plugin aims in generating randomized ESO input files
 * based on an Esterel program with an interface declaration. These files only declare inputs. Outputs
 * must be computed by a simulator in combination with a facility to read the randomized
 * generated inputs.
 * This activator class controls the plug-in life cycle.
 *
 * @author cmot
 * @kieler.design 2015-06-15 proposed cmot
 * @kieler.rating 2015-06-15 proposed yellow
 */
public class EsterelEsoPlugin extends AbstractUIPlugin {

    /** The Constant PLUGIN_ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.sccharts.eso"; //$NON-NLS-1$

    /** The shared instance of the plugin. */
    private static EsterelEsoPlugin plugin;

    // ---------------------------------------------------------------------

    /**
     * The constructor.
     */
    public EsterelEsoPlugin() {
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
    public static EsterelEsoPlugin getDefault() {
        return plugin;
    }

    // ---------------------------------------------------------------------

}
