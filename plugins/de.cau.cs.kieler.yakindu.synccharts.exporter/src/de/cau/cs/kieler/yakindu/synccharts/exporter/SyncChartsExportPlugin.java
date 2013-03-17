package de.cau.cs.kieler.yakindu.synccharts.exporter;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class SyncChartsExportPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.cau.cs.kieler.yakindu.sccharts.synccharts.exporter"; //$NON-NLS-1$

	// The shared instance
	private static SyncChartsExportPlugin plugin;
	
	/**
	 * The constructor
	 */
	public SyncChartsExportPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		// DEBUG
		System.out.println("==== SCL Plugin loaded ====");
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
	public static SyncChartsExportPlugin getDefault() {
		return plugin;
	}

}
