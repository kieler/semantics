package de.cau.cs.kieler.sccharts;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class SCChartsPlugin implements BundleActivator {

        public static String EDITOR_ID = "de.cau.cs.kieler.sccharts.presentation.SCChartsEditorID";
        
        public static String TEXT_EDITOR_ID = "de.cau.cs.kieler.sccharts.text.sct.Sct";
        
        /**
         * The Constant AUXILIARY_VARIABLE_TAG for a Transition.
         */
        public static final String AUXILIARY_VARIABLE_TAG_TRANSITION 
                               = "oSCCHARTSoAUXTRANSo";

        /**
         * The Constant AUXILIARY_VARIABLE_TAG for a State.
         */
        public static final String AUXILIARY_VARIABLE_TAG_STATE 
                               = "oSCCCHARTSoAUXSTATEo";
        
    
	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		SCChartsPlugin.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		SCChartsPlugin.context = null;
	}

}
