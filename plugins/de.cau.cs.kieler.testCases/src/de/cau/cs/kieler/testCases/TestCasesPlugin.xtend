/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2023 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.testCases

import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext

class TestCasesPlugin implements BundleActivator {
    /**
     * The id of the plugin.
     */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.testCases"
    
    /**
     * The context
     */
    static BundleContext context

    /**
     * Returns the context
     */
    def static package BundleContext getContext() {
        return context
    }

    /*
     * (non-Javadoc)
     * @see BundleActivator#start(org.osgi.framework.BundleContext)
     */
    override void start(BundleContext bundleContext) throws Exception {
        TestCasesPlugin.context = bundleContext
    }

    /*
     * (non-Javadoc)
     * @see BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    override void stop(BundleContext bundleContext) throws Exception {
        TestCasesPlugin.context = null
    }
}