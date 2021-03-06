/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.product;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * Activator class for the KIELER core product plugin.
 * 
 * @kieler.rating 2011-11-02 proposed yellow chsch
 * @author chsch
 */
public class CoreProductPlugin extends Plugin {


    /** the plug-in ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.core.product"; //$NON-NLS-1$

    /** the shared instance. */
    private static CoreProductPlugin plugin;

    /**
     * The constructor.
     */
    public CoreProductPlugin() {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static CoreProductPlugin getDefault() {
        return plugin;
    }
}
