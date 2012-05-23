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
package de.cau.cs.kieler.synccharts.codegen.s;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author cmot
 */
public class CodegenSPlugin extends AbstractUIPlugin {

	/** The plug-in ID. */
	public static final String PLUGIN_ID = "de.cau.cs.kieler.synccharts.codegen.s"; //$NON-NLS-1$

	/** The shared instance. */
	private static CodegenSPlugin plugin;
	
    // -------------------------------------------------------------------------

	/**
	 * The constructor
	 */
	public CodegenSPlugin() {
	}

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	// -------------------------------------------------------------------------

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static CodegenSPlugin getDefault() {
		return plugin;
	}

    // -------------------------------------------------------------------------
}
