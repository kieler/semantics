/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.railsl.ui

import de.cau.cs.kieler.railsl.ui.internal.RailslActivator
import org.osgi.framework.BundleContext
import de.cau.cs.kieler.railsl.ui.visualizer.Visualizer
import com.google.inject.Injector
import com.google.inject.Inject
import com.google.inject.Guice

/**
 * @author stu121235
 *
 */
class CustomRailSLActivator extends RailslActivator{
    
    @Override
    override void start(BundleContext context) {
        super.start(context)
        val injector = Guice.createInjector()
        Visualizer.initialize(injector)
    }
    
}