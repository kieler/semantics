/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
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
package de.cau.cs.kieler.esterel.cec.sim;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author ctr, cmot
 */
public class EsterelCECSimPlugin extends Plugin {

    /** The plug-in ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.esterel.cec.sim";
    
    /** The Constant AUXILIARY_VARIABLE_TAG.
     *  This TAG is also defined in Esterel2Simulation.xtend. Both TAGs must match */
    public static final String AUXILIARY_VARIABLE_TAG = "oESTERELoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo";

	/** The Constant ESTEREL_LANGUAGE points to the Esterel Xtext Editor. */
	public static final String ESTEREL_LANGUAGE = "de.cau.cs.kieler.esterel.Esterel";
    
    /** The The shared instance of this plugin. */
    private static EsterelCECSimPlugin plugin;

	// -----------------------------------------------------------------------------

    /**
     * The constructor.
     */
    public EsterelCECSimPlugin() {
    }

	// -----------------------------------------------------------------------------

    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

	// -----------------------------------------------------------------------------

    @Override
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

	// -----------------------------------------------------------------------------

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static EsterelCECSimPlugin getDefault() {
        return plugin;
    }

	// -----------------------------------------------------------------------------
}
