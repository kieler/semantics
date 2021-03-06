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
package de.cau.cs.kieler.c.sccharts.processors

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.sccharts.SCCharts

/**
 * @author sle
 *
 */
class CbasedSCChartFeature  {
    
    public static val ID = "CbasedSCChart"
    
    @Inject extension AnnotationsExtensions
    
    def boolean isContained(SCCharts scchart) {
        scchart.rootStates.head.hasAnnotation(ID)
    }
    
}