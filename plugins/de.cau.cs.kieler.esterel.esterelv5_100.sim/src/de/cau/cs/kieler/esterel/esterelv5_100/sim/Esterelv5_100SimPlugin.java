/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
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
package de.cau.cs.kieler.esterel.esterelv5_100.sim;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;


/**
 * 
 * @author sna
 *
 */
public class Esterelv5_100SimPlugin extends Plugin {

    /** The plug-in ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.esterel.esterelv5_100.sim";

    /** The shared instance of this plugin. */
    private static Esterelv5_100SimPlugin plugin;

    // -----------------------------------------------------------------------------

    /**
     * The constructor.
     */
    public Esterelv5_100SimPlugin() {
    }

    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    // -----------------------------------------------------------------------------

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static Esterelv5_100SimPlugin getDefault() {
        return plugin;
    }

    // -----------------------------------------------------------------------------
}
