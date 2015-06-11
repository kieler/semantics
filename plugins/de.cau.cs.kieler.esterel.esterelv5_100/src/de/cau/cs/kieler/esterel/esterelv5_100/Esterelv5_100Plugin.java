package de.cau.cs.kieler.esterel.esterelv5_100;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class Esterelv5_100Plugin extends Plugin {

	public static final String PLUGIN_ID = "de.cau.cs.kieler.esterel.esterelv5_100";

	private static Esterelv5_100Plugin plugin;
	
	public Esterelv5_100Plugin() {
		
	}

	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}
	
	@Override
	public void stop(final BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}
	
	public static Esterelv5_100Plugin getDefault() {
		return plugin;
	}

}
