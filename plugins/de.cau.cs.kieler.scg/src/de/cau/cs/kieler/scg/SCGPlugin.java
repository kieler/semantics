package de.cau.cs.kieler.scg;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class SCGPlugin implements BundleActivator {

        public static String EDITOR_ID = "de.cau.cs.kieler.scg.presentation.SCGEditorID";

        private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		SCGPlugin.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		SCGPlugin.context = null;
	}

}
