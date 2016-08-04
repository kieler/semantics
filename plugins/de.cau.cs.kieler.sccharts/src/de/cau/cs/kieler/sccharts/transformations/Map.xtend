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
import com.google.inject.Inject
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.features.SCChartsFeature
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup
import de.cau.cs.kieler.sccharts.SCCharts

/**
 * SCCharts Map Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class Map extends AbstractExpansionTransformation {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::MAP_ID
    }

    override getName() {
        return SCChartsTransformation::MAP_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::MAP_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet()
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::REFERENCE_ID) //TODO check FOR dependency
    }

    //-------------------------------------------------------------------------
    @Inject
    extension SCChartsExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    //-------------------------------------------------------------------------
    //--                             F O R                                   --
    //-------------------------------------------------------------------------
    // ...
    def State transform(State rootState) {
        var targetRootState = rootState.fixAllPriorities;

        // Traverse all states
        for (targetTransition : targetRootState.getAllContainedStates.immutableCopy) {
            targetTransition.transformMap(targetRootState);
        }
        targetRootState;
    }

    def void transformMap(State state, State targetRootState) {
        //TODO
    }

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }

}
