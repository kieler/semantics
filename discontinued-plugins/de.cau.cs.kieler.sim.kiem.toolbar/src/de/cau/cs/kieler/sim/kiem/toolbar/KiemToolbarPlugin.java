package de.cau.cs.kieler.sim.kiem.toolbar;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class KiemToolbarPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.cau.cs.kieler.sim.kiem.toolbar"; //$NON-NLS-1$

	// The shared instance
	private static KiemToolbarPlugin plugin;
	
	/**
	 * The constructor
	 */
	public KiemToolbarPlugin() {
	}

    /**
     * {@inheritDoc}
     */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/**
	 * {@inheritDoc}
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
	public static KiemToolbarPlugin getDefault() {
		return plugin;
	}

}
