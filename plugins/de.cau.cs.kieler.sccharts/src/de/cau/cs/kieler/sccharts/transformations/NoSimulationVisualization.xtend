/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.transformations

import com.google.common.collect.Sets
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup
import de.cau.cs.kieler.sccharts.features.SCChartsFeatureimport de.cau.cs.kieler.sccharts.SCCharts

/**
 * This class handles the default NO simulation visualization
 * 
 * @author cmot
 * @kieler.design 2014-07-23 proposed cmot
 * @kieler.rating 2014-07-23 proposed yellow
 */
class NoSimulationVisualization extends AbstractExpansionTransformation {
    
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::NOSIMULATIONVISUALIZATION_ID
    }

    override getName() {
        return SCChartsTransformation::NOSIMULATIONVISUALIZATION_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::SIMULATIONVISUALIZATION_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet(); //SCChartsFeatureGroup::EXTENDED_ID)
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet()
    }
    
    //-------------------------------------------------------------------------

    // Do nothing
    def State transform(State rootState) {
        rootState;
    }

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }

}
