package de.cau.cs.kieler.kaom.sim.ptolemy;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class KaomSimPtolemyPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.cau.cs.kieler.kaom.sim.ptolemy";

	// The shared instance
	private static KaomSimPtolemyPlugin plugin;
	
        /** The Constant DEBUG. If true print out debug information. */
        public static final boolean DEBUG = true;	
        
        /**
       	 * The constructor
	 */
	public KaomSimPtolemyPlugin() {
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
	public static KaomSimPtolemyPlugin getDefault() {
		return plugin;
	}

        public static void DEBUG(final String debugOutputText) {
            if (DEBUG) {
                System.out.println(debugOutputText);
            }
        }
}
