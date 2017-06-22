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

import de.cau.cs.kieler.kico.features.Feature
import de.cau.cs.kieler.sccharts.State

/**
 * SCCharts Simulation Visualization Feature.
 * 
 * @author cmot
 * @kieler.design 2015-03-12 proposed 
 * @kieler.rating 2015-03-12 proposed yellow
 */
class SimulationVisualization extends Feature {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsFeature::SIMULATIONVISUALIZATION_ID
    }

    override getName() {
        return SCChartsFeature::SIMULATIONVISUALIZATION_NAME
    }

    //-------------------------------------------------------------------------

    // This method checks, if this feature is contained in a model
    def isContained(State model) {
        return true
    }

}
