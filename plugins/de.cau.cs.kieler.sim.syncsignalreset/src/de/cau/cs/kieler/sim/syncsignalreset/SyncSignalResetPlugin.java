/******************************************************************************
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
 ******************************************************************************/

package de.cau.cs.kieler.sim.syncsignalreset;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the SyncSignalReset plug-in's life cycle. This
 * KIEM DataComponent implements synchronous semantics for executions with
 * the KIELER Execution Manager. It should be scheduled to be the first or
 * the last DataComponent. It then resets all signals that are present to be
 * absent again. When there are no present signals, this DataComponent does
 * simply nothing.
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class SyncSignalResetPlugin extends Plugin {

	/** The Constant PLUGIN_ID. */
	public static final String PLUGIN_ID = "de.cau.cs.kieler.sim.syncsignalreset";

	/** The shared instance. */
	private static SyncSignalResetPlugin plugin;
	
	//-------------------------------------------------------------------------
	
	/**
	 * The constructor of the SyncSignalReset DataComponent.
	 */
	public SyncSignalResetPlugin() {
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
	 * Returns the shared instance of this plug-in.
	 *
	 * @return the shared instance
	 */
	public static SyncSignalResetPlugin getDefault() {
		return plugin;
	}

}
