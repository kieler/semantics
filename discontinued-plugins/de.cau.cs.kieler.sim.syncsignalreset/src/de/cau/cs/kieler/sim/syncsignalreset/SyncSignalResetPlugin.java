/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.syncsignalreset;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the SyncSignalReset plug-in's life cycle. This KIEM DataComponent
 * implements synchronous semantics for executions with the KIELER Execution Manager. It should be
 * scheduled to be the first or the last DataComponent. It then resets all signals that are present
 * to be absent again. When there are no present signals, this DataComponent does simply nothing.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
public class SyncSignalResetPlugin extends Plugin {

    /** The Constant PLUGIN_ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.sim.syncsignalreset";

    /** The shared instance. */
    private static SyncSignalResetPlugin plugin;

    // -------------------------------------------------------------------------

    /**
     * The constructor of the SyncSignalReset DataComponent.
     */
    public SyncSignalResetPlugin() {
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
     * Returns the shared instance of this plug-in.
     * 
     * @return the shared instance
     */
    public static SyncSignalResetPlugin getDefault() {
        return plugin;
    }

}
