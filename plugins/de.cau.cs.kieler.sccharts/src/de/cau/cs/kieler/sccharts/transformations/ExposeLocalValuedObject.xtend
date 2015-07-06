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
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup
import de.cau.cs.kieler.sccharts.features.SCChartsFeature

/**
 * SCCharts ExposeLocalValuedObject Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class ExposeLocalValuedObject extends AbstractExpansionTransformation implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::EXPOSELOCALVALUEDOBJECT_ID
    }

    override getName() {
        return SCChartsTransformation::EXPOSELOCALVALUEDOBJECT_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::EXPOSELOCALVALUEDOBJECT_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet();
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::SIGNAL_ID, SCChartsFeatureGroup::EXPANSION_ID)
    }

    //-------------------------------------------------------------------------
    @Inject
    extension SCChartsExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    //-------------------------------------------------------------------------
    //--        E X P O S E   L O C A L   V A L U E D  O B J E C T           --
    //-------------------------------------------------------------------------
    // Transforming Local ValuedObjects and optionally exposing them as
    // output signals.
    def State transform(State rootState) {
        val targetRootState = rootState;

        // Traverse all states
        targetRootState.getAllStates.forEach [ targetState |
            targetState.transformExposeLocalValuedObject(targetRootState, true);
        ]
        targetRootState;
    }

}
