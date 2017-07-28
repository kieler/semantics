/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.features

import com.google.inject.Inject
import de.cau.cs.kieler.kico.features.Feature
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions

/**
 * SCCharts For Feature.
 * 
 * @author cmot
 * @kieler.design 2015-03-12 proposed 
 * @kieler.rating 2015-03-12 proposed yellow
 */
class For extends Feature {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsFeature::FOR_ID
    }

    override getName() {
        return SCChartsFeature::FOR_NAME
    }

    //-------------------------------------------------------------------------
    @Inject extension SCChartsScopeExtensions
    @Inject extension de.cau.cs.kieler.sccharts.transformations.For

    // This method checks, if this feature is contained in a model
    def isContained(State model) {
        val allRegions = model.allContainedControlflowRegions.toList
            for (region : allRegions) {
                if (region.parseFor != null) {
                   return true
                }
        }
        return false
    }

}

