/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.core

import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import org.eclipse.xtend.lib.annotations.Accessors

class CoreActivator implements BundleActivator {
    
    @Accessors(PUBLIC_GETTER)
    static var BundleContext CONTEXT
    
    override void start(BundleContext context) throws Exception {
        CoreActivator.CONTEXT = context
    }

    override void stop(BundleContext context) throws Exception {
        if (CoreActivator.CONTEXT === context) CoreActivator.CONTEXT = null
    }
}
