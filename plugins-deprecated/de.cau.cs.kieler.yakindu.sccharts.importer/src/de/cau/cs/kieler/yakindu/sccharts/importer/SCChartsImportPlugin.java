package de.cau.cs.kieler.yakindu.sccharts.importer;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author cmot
 * @kieler.design 2013-06-06 proposed cmot
 * @kieler.rating 2013-06-06 proposed yellow
 */
public class SCChartsImportPlugin extends AbstractUIPlugin {

    /** The Constant PLUGIN_ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.yakindu.sccharts.synccharts.importer"; //$NON-NLS-1$

    /** The shared instance. */
    private static SCChartsImportPlugin plugin;

    // -------------------------------------------------------------------------

    /**
     * The constructor.
     */
    public SCChartsImportPlugin() {
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
     * Returns the shared instance.
     *
     * @return the shared instance
     */
    public static SCChartsImportPlugin getDefault() {
        return plugin;
    }

    // -------------------------------------------------------------------------
}
