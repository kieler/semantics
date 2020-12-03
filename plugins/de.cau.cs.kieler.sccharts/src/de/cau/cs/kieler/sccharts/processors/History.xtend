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
package de.cau.cs.kieler.sccharts.processors

import com.google.common.collect.ImmutableList
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtDeclarationExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import java.util.HashMap

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*

/**
 * SCCharts History Transformation.
 * 
 * @author cmot/wechselberg
 */
class History extends SCChartsProcessor implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.history"
    }

    override getName() {
        "History"
    }

    override process() {
        setModel(model.transform)
    }

    //-------------------------------------------------------------------------
    @Inject extension KExpressionsCreateExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions    
    @Inject extension KEffectsExtensions
    @Inject extension KExtDeclarationExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsTransitionExtensions

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_H"

    //-------------------------------------------------------------------------
    //--                        H I S T O R Y                                --
    //-------------------------------------------------------------------------

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }

    def State transform(State rootState) {
        // Traverse all regions and all states
        rootState.regions.filter(ControlflowRegion).forEach[ region |
            region.states.forEach [ state |
                state.transformHistory(rootState)
            ]
        ]

        rootState
    }

    def Iterable<ValuedObject> transformHistory(State state, State targetRootState) {
        state.setDefaultTrace

        // Grab all history transitions (deep and shallow)
        val historyTransitions = ImmutableList::copyOf(state.incomingTransitions.filter[isHistory])
        historyTransitions.setDefaultTrace
        // Grab all non-history transitions
        val nonHistoryTransitions = ImmutableList::copyOf(state.incomingTransitions.filter[!isHistory])

        // Check if we have any work at all to do
        if (!historyTransitions.isEmpty) {

            // Gather all regions in this state, if any (none for simple state)
            val stateRegions = ImmutableList::copyOf(state.regions.filter(ControlflowRegion))
            // Create a management VO for each region contained in this state
            val HashMap<ControlflowRegion, ValuedObject> stateEnums = new HashMap
            stateRegions.forEach[
                val stateEnum = rootState.createValuedObject(GENERATED_PREFIX + state.name, createIntDeclaration).uniqueName
                stateEnums.put(it, stateEnum)
                stateEnum.initialValue = 0.createIntValue
            ]

            // Reset the history enum on all non-history incoming transitions
            nonHistoryTransitions.forEach[ transition |
                stateEnums.values.forEach[ stateEnum |
                    transition.addEffect(stateEnum.createAssignment(0.createIntValue))
                ]
            ]

            // Check if we have any deep history or if we can get away with just one layer of work
            val boolean hasDeepHistory = historyTransitions.exists[isDeepHistory]

            // Process internal behaviour of all regions
            stateRegions.forEach[ region |
                val stateEnum = stateEnums.get(region)
                // Find the original initial state and mark not initial anymore
                val originalInitialState =  region.initialState
                originalInitialState.setNotInitial
                // Gather all other states, with the initial one as the first entry
                val originalStates = ImmutableList::copyOf(
                    #[originalInitialState] + region.states.filter[!equals(originalInitialState)]
                )
                // Create new initial dispatcher state
                val newInitialState = region.createInitialState(GENERATED_PREFIX + "Init").uniqueName

                // Create dispatcher transitions to all original states
                originalStates.forEach[ originalState, counter |
                    createDispatchingTransition(newInitialState, originalState, stateEnum, counter, hasDeepHistory)
                ]
            ]

            // Process child regions/states and gather the nested stateEnums that should be reset
            // on this states incoming transitions
            val nestedEnums = stateRegions.flatMap[ region |
                region.states.flatMap[ subState |
                    transformHistory(subState, targetRootState)
                ]
            ].toSet

            // Reset nested enums on all non-histoy and shallow-histoy transitions
            nestedEnums.forEach[ nestedEnum |
                nonHistoryTransitions.forEach[ trans |
                    trans.addEffect(nestedEnum.createAssignment(0.createIntValue))
                ]
                historyTransitions.filter[!isDeepHistory].forEach[ trans |
                    trans.addEffect(nestedEnum.createAssignment(0.createIntValue))
                ]
            ]

            // Remove history feature from all history transitions
            historyTransitions.forEach[ transition |
                transition.setHistory(HistoryType::RESET)
            ]

            return stateEnums.values + nestedEnums
        }

        return #[]
    }

    def void createDispatchingTransition(State newInitialState, State targetState, ValuedObject stateEnum,
        int counter, boolean needsNestedHistory
    ) {
        val transition = newInitialState.createImmediateTransitionTo(targetState)
        transition.setTrigger(stateEnum.reference.createEQExpression(counter.createIntValue))
        targetState.createEntryAction.addEffect(stateEnum.createAssignment(counter.createIntValue))
        if (needsNestedHistory) {
            transition.setHistory(HistoryType::DEEP)
        }
    }
}
