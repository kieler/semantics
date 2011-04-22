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

package de.cau.cs.kieler.sim.mobile.tablemaster;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle. The TablemasterPlugin 
 * extends the DataComponent extension point of the KIELER Execution Manager
 * three times:<BR>
 * 1. DataComponentMaster - the master, responsible for the communication and
 * enabling of the master functionality.<BR>
 * 2. DataComponentObserver - the observer, responsible for notifying the 
 * remote unit about new or update data.<BR>
 * 3. DataComponentProducer - the producer, responsible for inserting new or
 * update data, changed by the remote unit within the execution of KIEM.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 *
 */
public class TablemasterPlugin extends Plugin {

	/** The plug-in ID. */
	public static final String PLUGIN_ID = "de.cau.cs.kieler.sim.mobile.tablemaster";

	/** The shared instance. */
	private static TablemasterPlugin plugin;
	
	//-------------------------------------------------------------------------

	/**
	 * The constructor of the TablemasterPlugin.
	 */
	public TablemasterPlugin() {
	}

	//-------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	//-------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	//-------------------------------------------------------------------------

	/**
	 * Returns the shared instance.
	 *
	 * @return the shared instance
	 */
	public static TablemasterPlugin getDefault() {
		return plugin;
	}

}
