/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 * 
 * @author cmot
 * @kieler.design 2013-10-10 proposed 
 * @kieler.rating 2013-10-10 proposed yellow
 */
public class SCChartsPlugin implements BundleActivator {

        public static String EDITOR_ID = "de.cau.cs.kieler.sccharts.presentation.SCChartsEditorID";
        
        public static String TEXT_EDITOR_ID = "de.cau.cs.kieler.sccharts.text.sct.Sct";
        
//        /**
//         * The Constant AUXILIARY_VARIABLE_TAG for a Transition.
//         */
//        public static final String AUXILIARY_VARIABLE_TAG_TRANSITION 
//                               = "oSCCHARTSoAUXTRANSo";
//
//        /**
//         * The Constant AUXILIARY_VARIABLE_TAG for a State.
//         */
//        public static final String AUXILIARY_VARIABLE_TAG_STATE 
//                               = "oSCCCHARTSoAUXSTATEo";
        
    
        /**
         * The Constant AUXILIARY_VARIABLE_TAG for a Transition.
         */
        public static final String AUXILIARY_VARIABLE_TAG_TRANSITION = "_T";

        /**
         * The Constant AUXILIARY_VARIABLE_TAG for a State.
         */
//        public static final String AUXILIARY_VARIABLE_TAG_STATE = "oSCCHARTSoAUXSTATEo";
        public static final String AUXILIARY_VARIABLE_TAG_STATE = "_S";
        
        
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