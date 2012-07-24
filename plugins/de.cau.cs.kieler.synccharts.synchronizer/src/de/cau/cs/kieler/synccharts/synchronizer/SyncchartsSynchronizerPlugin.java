package de.cau.cs.kieler.synccharts.synchronizer;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @kieler.ignore (excluded from review process)
 */
public class SyncchartsSynchronizerPlugin extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.cau.cs.kieler.synccharts.synchronizer";

	// The shared instance
	private static SyncchartsSynchronizerPlugin plugin;
		
	/**
	 * The constructor
	 */
	public SyncchartsSynchronizerPlugin() {
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
	public static SyncchartsSynchronizerPlugin getDefault() {
		return plugin;
	}

}
