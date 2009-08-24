package de.cau.cs.kieler.sim.mobile.tablemaster;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class TablemasterPlugin extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.cau.cs.kieler.sim.mobile.tablemaster";

	// The shared instance
	private static TablemasterPlugin plugin;
	
	/**
	 * The constructor
	 */
	public TablemasterPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
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
	public static TablemasterPlugin getDefault() {
		return plugin;
	}

}
