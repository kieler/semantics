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
package de.cau.cs.kieler.scg.s;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.core.model.PluginLog;

/**
 * The activator class controls the plug-in life cycle
 */
public class SCG2SPlugin extends PluginLog implements BundleActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.cau.cs.kieler.scg.s"; //$NON-NLS-1$
	
    private static BundleContext context;

static BundleContext getContext() {
	return context;
}

/*
 * (non-Javadoc)
 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
 */
public void start(BundleContext bundleContext) throws Exception {
	SCG2SPlugin.context = bundleContext;
}

/*
 * (non-Javadoc)
 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
 */
public void stop(BundleContext bundleContext) throws Exception {
	SCG2SPlugin.context = null;
}

}
