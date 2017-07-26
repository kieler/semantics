package de.cau.cs.kieler.simulation.ui;

import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.simulation.ui.internal.KiSimActivator;

/**
 * The activator class controls the plug-in life cycle
 */
public class SimulationUiPlugin extends KiSimActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.cau.cs.kieler.simulation.ui"; //$NON-NLS-1$
	
	public static final String LAST_LAUNCHED_SELECTION = "last_launched_selection";
	
	// The shared instance
	private static SimulationUiPlugin plugin;
	
	/**
	 * The constructor
	 */
	public SimulationUiPlugin() {
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
	public static SimulationUiPlugin getDefault() {
		return plugin;
	}

}
