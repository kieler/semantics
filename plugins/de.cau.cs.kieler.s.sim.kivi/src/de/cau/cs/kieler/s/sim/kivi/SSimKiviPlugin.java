package de.cau.cs.kieler.s.sim.kivi;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class SSimKiviPlugin extends AbstractUIPlugin {

	/** The Constant S_LANGUAGE points to the S Xtext Editor. */
	public static final String S_LANGUAGE = "de.cau.cs.kieler.s.S";

	// The plug-in ID
	public static final String PLUGIN_ID = "de.cau.cs.kieler.s.sim.kivi"; //$NON-NLS-1$

	// The shared instance
	private static SSimKiviPlugin plugin;
	
	/**
	 * The constructor
	 */
	public SSimKiviPlugin() {
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
	public static SSimKiviPlugin getDefault() {
		return plugin;
	}

}
