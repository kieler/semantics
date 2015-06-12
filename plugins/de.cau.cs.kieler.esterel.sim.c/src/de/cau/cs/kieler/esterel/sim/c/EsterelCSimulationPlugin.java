package de.cau.cs.kieler.esterel.sim.c;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @autor cmot
 * @kieler.design 2014-11-26 proposed cmot
 * @kieler.rating 2014-11-26 proposed yellow
 */
public class EsterelCSimulationPlugin extends AbstractUIPlugin {

    /** The plug-in ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.esterel.sim.c"; //$NON-NLS-1$

    /**
     * The Constant AUXILIARY_VARIABLE_TAG. This TAG is also defined in Esterel2Simulation.xtend.
     * Both TAGs must match
     */
    public static final String AUXILIARY_VARIABLE_TAG =
            "oESTERELoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo";
    
    /**
     * The shared instance
     */
    private static EsterelCSimulationPlugin plugin;

    //-------------------------------------------------------------------------

    /**
     * The constructor
     */
    public EsterelCSimulationPlugin() {
    }

    //-------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    //-------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    //-------------------------------------------------------------------------

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static EsterelCSimulationPlugin getDefault() {
        return plugin;
    }

    //-------------------------------------------------------------------------

}
