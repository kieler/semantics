package de.cau.cs.kieler.synccharts.sim.ptolemy;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class SyncchartsSimPtolemyPlugin extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.cau.cs.kieler.synccharts.sim.ptolemy";

	// The shared instance
	private static SyncchartsSimPtolemyPlugin plugin;
	
	/** The Constant DEBUG. If true print out debug information. */
	public static final boolean DEBUG = !System.getProperty("java.vm.info", "").contains("sharing");

	
	/**
	 * The constructor
	 */
	public SyncchartsSimPtolemyPlugin() {
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
	public static SyncchartsSimPtolemyPlugin getDefault() {
		return plugin;
	}
	
	public static void DEBUG(final String debugOutputText) {
	    if (DEBUG) {
	        System.out.println(debugOutputText);
	    }
	}

}
