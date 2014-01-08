/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.ktm.test.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.ktm.extensions.TransformationMapping
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension

/**
 * @author als
 */
class SCChartTestTransformation {

    @Inject
    extension TransformationMapping

    @Inject
    extension SCChartsExtension

    // NEW - Mapping Access delegation  
    def extractMapping() {
        extractMappingData;
    }

    //-------------------------------------------------------------------------
    //--                 S P L I T   T R A N S I T I O N                     --
    //-------------------------------------------------------------------------
    // For every transition T that has both, a trigger and an effect do the following:
    //   For every effect:
    //     Create a conditional C and add it to the parent of T's source state S_src.
    //     create a new true triggered immediate effect transition T_eff and move all effects of T to T_eff.
    //     Set the T_eff to have T's target state. Set T to have the target C.
    //     Add T_eff to C's outgoing transitions. 
    def Region transformTriggerEffect(Region rootRegion) {

        // Clone the complete SCCharts region 
        var targetRootRegion = rootRegion.mappedCopy; //NEW - mapping information (changed copy to mappedCopy)

        // Traverse all transitions
        for (targetTransition : targetRootRegion.getAllContainedTransitions) {
            targetTransition.transformTriggerEffect(targetRootRegion);
        }

        //check if mapping is complete (only for test proposes)
        val diff = rootRegion.checkMappingCompleteness(targetRootRegion);
        if (diff.key.empty && diff.value.empty) {
            targetRootRegion;
        } else {
            null
        }
    }

    def void transformTriggerEffect(Transition transition, Region targetRootRegion) {

        // Only apply this to transition that have both, a trigger and one or more effects 
        if (((transition.trigger != null || !transition.immediate) && !transition.effects.nullOrEmpty) ||
            transition.effects.size > 1) {
            val targetState = transition.targetState
            val parentRegion = targetState.parentRegion
            val transitionOriginalTarget = transition.targetState
            var Transition lastTransition = transition

            for (effect : transition.effects.immutableCopy) {
                val effectState = parentRegion.createState(targetState.id + effect.id)
                effectState.mapParents(transition.mappedParents); //NEW - mapping information
                effectState.setTypeConnector
                val effectTransition = createImmediateTransition.addEffect(effect)
                effectTransition.mapParents(transition.mappedParents); //NEW - mapping information

                effectTransition.setSourceState(effectState)
                lastTransition.setTargetState(effectState)
                lastTransition = effectTransition
            }

            lastTransition.setTargetState(transitionOriginalTarget)
        }
    }

}
