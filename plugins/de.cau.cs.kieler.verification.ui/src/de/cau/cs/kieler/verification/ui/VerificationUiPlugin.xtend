/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.verification.ui

import org.eclipse.ui.plugin.AbstractUIPlugin
import org.osgi.framework.BundleContext

/** 
 * The activator class controls the plug-in life cycle
 */
class VerificationUiPlugin extends AbstractUIPlugin {
    // The plug-in ID
    public static final String PLUGIN_ID = "de.cau.cs.kieler.verification.ui"
    // $NON-NLS-1$
    // The shared instance
    static VerificationUiPlugin plugin

    /** 
     * The constructor
     */
    new() {
    }

    override void start(BundleContext context) throws Exception {
        super.start(context)
        plugin = this
    }

    override void stop(BundleContext context) throws Exception {
        plugin = null
        super.stop(context)
    }

    /** 
     * Returns the shared instance
     * @return the shared instance
     */
    def static VerificationUiPlugin getInstance() {
        return plugin
    }
}
