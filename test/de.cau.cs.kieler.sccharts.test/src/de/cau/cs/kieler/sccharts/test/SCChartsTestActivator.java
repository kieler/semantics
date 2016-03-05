package de.cau.cs.kieler.sccharts.test;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 * @author aas
 */
public class SCChartsTestActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.cau.cs.kieler.sccharts.test"; //$NON-NLS-1$

	// The shared instance
	private static SCChartsTestActivator plugin;
	
	/**
	 * The constructor
	 */
	public SCChartsTestActivator() {
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
	public static SCChartsTestActivator getDefault() {
		return plugin;
	}

}
