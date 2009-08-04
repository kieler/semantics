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

package de.cau.cs.kieler.sim.abro;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The basic activator class controls the ABRO plug-in's life cycle.
 * It illustrates the famous ABRO example, the "hello world" of the
 * synchronous world. It is simply a Java plug-in implementing an 
 * observing and producing DataComponent that reacts to signals 
 * A, B, R with producing a present signal O whenever signal A and B
 * just became present (in any order or even at the same time). The 
 * state chart (or more specifically syncchart) then goes into the done
 * state and is reset by signal R, i.e. it becomes ready and again waits
 * for signals A and B. The strong abortion of the reset transition 
 * indicates that whenever R is present, in the same tick no O will be
 * produced. 
 *
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class AbroPlugin extends AbstractUIPlugin {

	/** The Constant PLUGIN_ID. */
	public static final String PLUGIN_ID = "de.cau.cs.kieler.sim.abro";

	/** The plugin. */
	private static AbroPlugin plugin;
	
	//-------------------------------------------------------------------------
	
	/**
	 * The constructor of the ABRO plug-in.
	 */
	public AbroPlugin() {
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

	//-------------------------------------------------------------------------

	/**
	 * Returns the shared instance of this plug-in.
	 *
	 * @return the shared instance
	 */
	public static AbroPlugin getDefault() {
		return plugin;
	}
	
}
