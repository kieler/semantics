/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.s;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator implements BundleActivator {

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
	Activator.context = bundleContext;
}

/*
 * (non-Javadoc)
 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
 */
public void stop(BundleContext bundleContext) throws Exception {
	Activator.context = null;
}

}
