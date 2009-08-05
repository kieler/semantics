/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
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
 ******************************************************************************/

package de.cau.cs.kieler.simplerailctrl.viewmanagement;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The class SimpleRailCtrlViewmanagementPlugin implements the
 * activator for this plug-in. This plug-in is able to highlight the
 * states of the SimpleRailCtrl editor during an execution with the
 * KIELER Execution Manager (KIEM) project.
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class SimpleRailCtrlViewmanagementPlugin extends Plugin {

	/** The constant PLUGIN_ID. */
	public static final String PLUGIN_ID = "de.cau.cs.kieler.simplerailctrl.viewmanagement";

	/** The shared instance of this plug-in. */
	private static SimpleRailCtrlViewmanagementPlugin plugin;

	//-------------------------------------------------------------------------
	
	/**
	 * Instantiates a new SimpleRailCtrlViewmanagementPlugin.
	 */
	public SimpleRailCtrlViewmanagementPlugin() {
	}

	//-------------------------------------------------------------------------

	/**
	 * Returns the shared instance of this plug-in.
	 *
	 * @return the shared instance
	 */
	public static SimpleRailCtrlViewmanagementPlugin getDefault() {
		return plugin;
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

}
