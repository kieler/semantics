package de.cau.cs.kieler.esterel.sim;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author ctr, cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-05-31 yellow KI-7
 */
public class EsterelSimPlugin extends AbstractUIPlugin {

    /** The plug-in ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.esterel.sim";

    /** The shared instance of this plugin. */
    private static EsterelSimPlugin plugin;

    /**
     * The Constant AUXILIARY_VARIABLE_TAG. This TAG is also defined in Esterel2Simulation.xtend.
     * Both TAGs must match
     */
    public static final String AUXILIARY_VARIABLE_TAG =
            "oESTERELoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo";

    /** The Constant ESTEREL_EDITOR_ID points to the Esterel Xtext Editor. */
    public static final String ESTEREL_EDITOR_ID = "de.cau.cs.kieler.esterel.Esterel";

    // -----------------------------------------------------------------------------

    /**
     * The constructor.
     */

    public EsterelSimPlugin() {
    }

    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    // -----------------------------------------------------------------------------

    /**
     * Gets the default.
     * 
     * @return the default
     */
    public static EsterelSimPlugin getDefault() {
        return plugin;
    }

    // -----------------------------------------------------------------------------

}
