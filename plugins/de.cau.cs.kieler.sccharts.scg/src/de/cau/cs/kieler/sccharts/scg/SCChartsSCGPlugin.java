/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.scg;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Injector;

import de.cau.cs.kieler.sccharts.scg.processors.SCChartsAnnotationModelCreatorForUnschedulableNodes;
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup;
import de.cau.cs.kieler.scg.processors.SimpleGuardScheduler;

/**
 * The Class SCChartsSCGPlugin.
 */
public class SCChartsSCGPlugin extends Plugin {

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        
        Injector injector = SCTXStandaloneSetup.doSetup();
        SimpleGuardScheduler.annotationModelCreatorDelegate = 
                injector.getInstance(SCChartsAnnotationModelCreatorForUnschedulableNodes.class);
    }
    
}
