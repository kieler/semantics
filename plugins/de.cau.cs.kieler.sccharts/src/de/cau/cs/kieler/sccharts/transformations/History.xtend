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

import com.google.common.collect.ImmutableList
import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.features.SCChartsFeature
import java.util.ArrayList
import java.util.List

import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.sccharts.ControlflowRegion

/**
 * SCCharts History Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class History extends AbstractExpansionTransformation implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::HISTORY_ID
    }

    override getName() {
        return SCChartsTransformation::HISTORY_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::HISTORY_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::STATIC_ID, SCChartsFeature::INITIALIZATION_ID, SCChartsFeature::ENTRY_ID)
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
    //--                        H I S T O R Y                                --
    //-------------------------------------------------------------------------
    // @requires: suspend
    // Transforming History. This is using the concept of suspend so it must
    // be followed by resolving suspension
    def State transform(State rootState) {
        val targetRootState = rootState.fixAllPriorities;

        // Traverse all states
        targetRootState.getAllStates.forEach [ targetState |
            targetState.transformHistory(targetRootState);
        ]
        targetRootState.fixAllTextualOrdersByPriorities;
    }

    // Traverse all states and transform macro states that have connecting
    // (incoming) history transitions.    
    def void transformHistory(State state, State targetRootState) {
        val historyTransitions = ImmutableList::copyOf(state.incomingTransitions.filter[isHistory])
        val deepHistoryTransitions = historyTransitions.filter[!isDeepHistory]
        val nonHistoryTransitions = ImmutableList::copyOf(state.incomingTransitions.filter[!isHistory])
        historyTransitions.setDefaultTrace

        if (historyTransitions != null && historyTransitions.size > 0 && state.regions != null && state.regions.size > 0) {
            var int initialValue
            val List<ValuedObject> stateEnumsAll = new ArrayList
            val List<ValuedObject> stateEnumsDeep = new ArrayList

            val regions = state.regions.filter(ControlflowRegion).toList
            var regionsDeep = state.regions.filter(ControlflowRegion).toList as List<ControlflowRegion>
            if (!deepHistoryTransitions.nullOrEmpty) {
                regionsDeep = state.allContainedControlflowRegions
            }

            for (region : regionsDeep.toList) {
                var counter = 0

                // FIXME: stateEnum should be static
                val stateEnum = state.parentRegion.parentState.createVariable(GENERATED_PREFIX + state.id).setTypeInt.
                    uniqueName
                stateEnumsAll.add(stateEnum)
                if (!regions.contains(region)) {
                    stateEnumsDeep.add(stateEnum)
                }
                val originalInitialState = region.initialState
                originalInitialState.setNotInitial
                val subStates = region.states.immutableCopy
                val initialState = region.createInitialState(GENERATED_PREFIX + "Init").uniqueName

                for (subState : subStates) {
                    val transition = initialState.createImmediateTransitionTo(subState)
                    transition.setTrigger(stateEnum.reference.isEqual(counter.createIntValue))
                    subState.createEntryAction.addEffect(stateEnum.assign(counter.createIntValue))
                    if (subState == originalInitialState) {
                        initialValue = counter
                        stateEnum.setInitialValue(counter.createIntValue)
                    }
                    counter = counter + 1
                }
            }

            for (transition : historyTransitions) {
                if (!transition.deepHistory) {

                    // Reset deepStateEnums
                    for (stateEnum : stateEnumsDeep) {
                        transition.addEffect(stateEnum.assign(initialValue.createIntValue)).trace(transition)
                    }
                }
                transition.setHistory(HistoryType::RESET)
            }

            for (transition : nonHistoryTransitions) {
                for (stateEnum : stateEnumsAll) {
                    transition.addEffect(stateEnum.assign(initialValue.createIntValue))
                }
            }

        }
    }

}
