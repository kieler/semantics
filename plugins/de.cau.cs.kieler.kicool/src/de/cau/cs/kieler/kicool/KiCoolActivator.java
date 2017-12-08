package de.cau.cs.kieler.kicool;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class KiCoolActivator implements BundleActivator {

	private static BundleContext context;
	
	public static final String PLUGIN_ID = "de.cau.cs.kieler.kicool";
	
    private static KiCoolActivator instance;	
    
	static BundleContext getContext() {
		return context;
	}
	
	public static KiCoolActivator getInstance() {
	    return instance;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		KiCoolActivator.context = bundleContext;
		instance = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		KiCoolActivator.context = null;
		instance = null;
	}

}
