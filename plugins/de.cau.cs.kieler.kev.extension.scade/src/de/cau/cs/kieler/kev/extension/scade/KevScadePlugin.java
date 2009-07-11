package de.cau.cs.kieler.kev.extension.scade;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class KevScadePlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.cau.cs.kieler.kev.extension.scade";

	// The shared instance
	private static KevScadePlugin plugin;
	
	/**
	 * The constructor
	 */
	public KevScadePlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		// set the default values of preferences
		IPreferenceStore preferenceStore = KevScadePlugin.getDefault().getPreferenceStore();
		preferenceStore.setDefault(WorkbenchPreferencePage.HOST_EDITOR, "127.0.0.1");
		preferenceStore.setDefault(WorkbenchPreferencePage.PORT_EDITOR, 12345);
		preferenceStore.setDefault(WorkbenchPreferencePage.PROFILE_EDITOR, "Simulation");
		preferenceStore.setDefault(WorkbenchPreferencePage.ROOT_EDITOR, "simulation::Simulation");
		preferenceStore.setDefault(WorkbenchPreferencePage.OUTPUTPATH_EDITOR, "simulation::Simulation/displayData");
		preferenceStore.setDefault(WorkbenchPreferencePage.INPUTPATH_EDITOR, "simulation::Simulation/controlData");
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
	public static KevScadePlugin getDefault() {
		return plugin;
	}

}
