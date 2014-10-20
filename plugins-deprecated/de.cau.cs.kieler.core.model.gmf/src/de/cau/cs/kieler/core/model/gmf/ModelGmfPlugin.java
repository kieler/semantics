/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 */
package de.cau.cs.kieler.core.model.gmf;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * The plug-in activator class.
 * 
 * @author msp
 */
public class ModelGmfPlugin implements BundleActivator {

    /** the plug-in identifier. */
    public static final String PLUGIN_ID
            = "de.cau.cs.kieler.core.model.gmf.policies.BalloonPopupEditPolicyProvider";
    
    private static BundleContext context;

    static BundleContext getContext() {
        return context;
    }

    /**
     * {@inheritDoc}
     */
    public void start(final BundleContext bundleContext) throws Exception {
        ModelGmfPlugin.context = bundleContext;
    }

    /**
     * {@inheritDoc}
     */
    public void stop(final BundleContext bundleContext) throws Exception {
        ModelGmfPlugin.context = null;
    }

}
