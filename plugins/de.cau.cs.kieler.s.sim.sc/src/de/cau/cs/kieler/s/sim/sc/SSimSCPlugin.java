/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.s.sim.sc;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class SSimSCPlugin extends AbstractUIPlugin {
	
    /** The plug-in ID. */
	public static final String PLUGIN_ID = "de.cau.cs.kieler.s.sim.sc"; //$NON-NLS-1$
    
    /** The Constant AUXILIARY_VARIABLE_TAG.
     *  This TAG is also defined in S2Simulation.xtend. Both TAGs must match */
    public static final String AUXILIARY_VARIABLE_TAG = "oSoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo";


	// The shared instance
	private static SSimSCPlugin plugin;
	
	/**
	 * The constructor
	 */
	public SSimSCPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static SSimSCPlugin getDefault() {
		return plugin;
	}

}
