package de.cau.cs.kieler.sccharts.launchconfig;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class LaunchConfigPlugin implements BundleActivator {

        public static String ID = "de.cau.kieler.sccharts.launchconfig";
    
	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		LaunchConfigPlugin.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		LaunchConfigPlugin.context = null;
	}

}
