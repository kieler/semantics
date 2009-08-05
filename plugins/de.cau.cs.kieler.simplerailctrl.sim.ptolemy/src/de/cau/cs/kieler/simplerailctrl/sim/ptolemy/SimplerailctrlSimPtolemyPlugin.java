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
package de.cau.cs.kieler.simplerailctrl.sim.ptolemy;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The SimpleRailCtrl Simulation Ptolemy plug-in activator class controls the 
 * plug-in's life cycle.<BR>
 * It provides a model2model transformation for SimpleRailCtrl EMF model 
 * instances as well as a Ptolemy simulator that can execute the generated
 * Ptolemy models. Additionally the build-in KIEM DataComponent enables
 * the component to work within a KIEM execution.
 */
public class SimplerailctrlSimPtolemyPlugin extends AbstractUIPlugin {

	/** The constant PLUGIN_ID. */
	public static final String PLUGIN_ID = 
								"de.cau.cs.kieler.simplerailctrl.sim.ptolemy";

	/** The shared instance of this plug-in. */
	private static SimplerailctrlSimPtolemyPlugin plugin;
	
	//-------------------------------------------------------------------------
	
	/**
	 * Instantiates a new SimplerailctrlSimPtolemy plug-in.
	 */
	public SimplerailctrlSimPtolemyPlugin() {
	}

	//-------------------------------------------------------------------------

	/**
	 * Returns the shared instance of this plug-in.
	 * 
	 * @return the shared instance
	 */
	public static SimplerailctrlSimPtolemyPlugin getDefault() {
		return plugin;
	}

	//-------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	//-------------------------------------------------------------------------

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

}
