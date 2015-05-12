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
package de.cau.cs.kieler.sccharts.transformations

import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.features.SCChartsFeature

import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*

/**
 * SCCharts CountDelay Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class CountDelay extends AbstractExpansionTransformation {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::COUNTDELAY_ID
    }

    override getName() {
        return SCChartsTransformation::COUNTDELAY_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::COUNTDELAY_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::DURING_ID, SCChartsFeature::ENTRY_ID)
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet()
    }

    //-------------------------------------------------------------------------
    @Inject
    extension KExpressionsExtension

    @Inject
    extension SCChartsExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    //-------------------------------------------------------------------------
    //--                   C O U N T   D E L A Y                             --
    //-------------------------------------------------------------------------
    // ...
    def State transform(State rootState) {
        var targetRootState = rootState.fixAllPriorities;

        // Traverse all transitions
        for (targetTransition : targetRootState.getAllContainedTransitions) {
            targetTransition.transformCountDelay(targetRootState);
        }

        targetRootState.fixAllTextualOrdersByPriorities;
    }

    // This will encode count delays in transitions.
    def void transformCountDelay(Transition transition, State targetRootState) {
        if (transition.delay > 1) {
            transition.setDefaultTrace
            val sourceState = transition.sourceState
            val parentState = sourceState.parentRegion.parentState

            val counter = parentState.createVariable(GENERATED_PREFIX + "counter").setTypeInt.uniqueName

            //Add entry action
            val entryAction = sourceState.createEntryAction
            entryAction.addEffect(counter.assign(0.createIntValue))

            // The during action MUST be added to the PARENT state NOT the SOURCE state because
            // otherwise (for a strong abort) taking the strong abort transition would not be
            // allowed to be triggered from inside!
            // Add during action
            val duringAction = parentState.createDuringAction
            duringAction.setTrigger(transition.trigger)
            duringAction.addEffect(counter.assign((1.createIntValue).add(counter.reference)))

            // Modify original trigger
            // trigger := (counter == delay)
            val trigger = counter.reference.isEqual(transition.delay.createIntValue)
            transition.setTrigger(trigger)
            transition.setDelay(1)
        }
    }

}
