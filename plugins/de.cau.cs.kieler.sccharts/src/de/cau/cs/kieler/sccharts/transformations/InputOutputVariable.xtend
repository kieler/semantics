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
 * SCCharts InputOutputVariable Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class InputOutputVariable extends AbstractExpansionTransformation implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::INPUTOUTPUT_ID
    }

    override getName() {
        return SCChartsTransformation::INPUTOUTPUT_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::INPUTOUTPUT_ID
    }

    override getProducesFeatureIds() {

        // TODO: Check
        return Sets.newHashSet()
    }

    override getNotHandlesFeatureIds() {

        // TODO: Check
        return Sets.newHashSet(SCChartsFeatureGroup::EXPANSION_ID)
    }

    //-------------------------------------------------------------------------
    @Inject
    extension SCChartsExtension

    //-------------------------------------------------------------------------
    //--          I N P U T   O U T P U T   V A R I A B L E                  --
    //-------------------------------------------------------------------------
    // ...
    def State transform(State rootState) {
        var targetRootState = rootState.fixAllPriorities;

        // Traverse all states
        for (targetTransition : targetRootState.getAllStates.immutableCopy) {
            targetTransition.transformInputOutputVariable(targetRootState);
        }
        targetRootState;
    }

    def void transformInputOutputVariable(State state, State targetRootState) {
        //TODO: Implement this transformation
    }

}
