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
 */

package de.cau.cs.kieler.krep.evalbench.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.krep.evalbench.ui.views.AssemblerView;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author ctr
 * 
 * @kieler.rating 2010-02-01 proposed yellow ctr
 */
public class Activator extends AbstractUIPlugin {

    /** The viewer to show the current program. */
    private AssemblerView viewer = null;

    /** The plug-in ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.krep.evalbench.ui";

    // The shared instance
    private static Activator plugin;

    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    @Override
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }

    /**
     * @return Viewer to display the current assembler.
     */
    public AssemblerView getViewer() {
        return viewer;
    }

    /**
     * @param v
     *            AssemblerView to display the current assembler. Only one assembler is shown at a
     *            time, as only one assembler can be currently on the processor.
     */
    public void setViewer(final AssemblerView v) {
        this.viewer = v;
    }
}
