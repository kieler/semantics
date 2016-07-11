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
package de.cau.cs.kieler.c.sccharts.transformation

import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kico.features.Feature
import de.cau.cs.kieler.sccharts.State

/**
 * @author SL
 *
 */
class CbasedSCChartFeature extends Feature {
    
    public static val ID = "CbasedSCChart"
    
    override getId() {
        return ID
    }
    
    override getName() {
        return "Immediate Transitions"
    }
    
    //-------------------------------------------------------------------------
    @Inject
    extension AnnotationsExtensions
    
    def boolean isContained(State scchart) {
        scchart.hasAnnotation(ID)
    }
    
}