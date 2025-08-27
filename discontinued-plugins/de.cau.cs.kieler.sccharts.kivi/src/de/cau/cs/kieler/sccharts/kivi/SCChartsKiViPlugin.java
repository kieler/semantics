/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.kivi;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.core.model.AbstractUIPluginLog;

/**
 * The activator class controls the plug-in life cycle.
 *
 * @author mmu
 * @kieler.ignore (excluded from review process)
 */
public class SCChartsKiViPlugin extends AbstractUIPluginLog {

    /**
     * The plug-in ID.
     */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.sccharts.kivi"; //$NON-NLS-1$

    // The shared instance
    private static SCChartsKiViPlugin plugin;

    /**
     * The constructor.
     */
    public SCChartsKiViPlugin() {
    }

    /**
     * {@inheritDoc}
     */
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    /**
     * {@inheritDoc}
     */
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance.
     *
     * @return the shared instance
     */
    public static SCChartsKiViPlugin getDefault() {
        return plugin;
    }

}
