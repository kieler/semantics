/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.maude;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * This activator class controls the life cycle of the MaudeInterfacePlugin. It also provides the
 * access to the one and only instance of this class and hence a way to access the maude interface
 * thread.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2010-08-15 yellow
 * 
 */
public class MaudeInterfacePlugin extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "de.cau.cs.kieler.maude"; //$NON-NLS-1$

    // The shared instance
    private static MaudeInterfacePlugin plugin;

    // ---------------------------------------------------------------------

    /**
     * The constructor
     */
    public MaudeInterfacePlugin() {
    }

    // ---------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    // ---------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    // ---------------------------------------------------------------------

    /**
     * Returns the shared instance of the Maude Interface plug-in. This is mainly used by the
     * execution thread to access the view of the KIELER Execution Manager or the other way round.
     * 
     * @return the shared instance
     */
    public static MaudeInterfacePlugin getDefault() {
        return plugin;
    }

    // -------------------------------------------------------------------------


}
