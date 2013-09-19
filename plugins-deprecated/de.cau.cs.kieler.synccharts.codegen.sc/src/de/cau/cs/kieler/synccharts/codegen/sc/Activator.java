/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 *
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.codegen.sc;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @kieler.rating 2010-06-14 yellow
 * @author tam
 */
public class Activator extends AbstractUIPlugin {

    /**
     * The plug-in ID.
     */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.synccharts.codegen";

    // The shared instance
    private static Activator plugin;

    /**
     * The constructor.
     */
    public Activator() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext )
     */
    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext )
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
    public static Activator getDefault() {
        return plugin;
    }

    /**
     * Returns the URI of a given state.
     * @param s state
     * @return URI of state s
     */
    public static String getUri(final State s) {
        return s.eResource().getURIFragment(s).toString();
    }

    /**
     * Returns the URI of a given transition.
     * @param t transition
     * @return URI of transition t
     */
    public static String getUri(final Transition t) {
        return t.eResource().getURIFragment(t).toString();
    }

}
