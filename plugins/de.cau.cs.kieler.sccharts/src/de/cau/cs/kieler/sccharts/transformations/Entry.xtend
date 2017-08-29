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
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup
import de.cau.cs.kieler.sccharts.features.SCChartsFeature

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsActionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsControlflowRegionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsStateExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsUniqueNameExtensions
import de.cau.cs.kieler.annotations.extensions.UniqueNameCache

/**
 * SCCharts Entry Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class Entry extends AbstractExpansionTransformation implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::ENTRY_ID
    }

    override getName() {
        return SCChartsTransformation::ENTRY_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::ENTRY_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::CONNECTOR_ID)
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::ABORT_ID, SCChartsFeatureGroup::EXPANSION_ID, SCChartsFeature.EXIT_ID, SCChartsFeature.DURING_ID)
    }

    //-------------------------------------------------------------------------
    @Inject extension SCChartsScopeExtensions
    @Inject extension SCChartsControlflowRegionExtensions
    @Inject extension SCChartsStateExtensions
    @Inject extension SCChartsActionExtensions
    @Inject extension SCChartsTransitionExtensions
    @Inject extension SCChartsUniqueNameExtensions


    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "__EA_"
    
    private val nameCache = new UniqueNameCache

    //-------------------------------------------------------------------------
    //--                      E N T R Y         A C T I O N                  --
    //-------------------------------------------------------------------------
    // @requires: during actions
    //
    // Idea: Setup or create a firstState and a lastState and place the
    // entry actions of a state in between these two states.
    // Transforming Entry Actions.
    def State transform(State rootState) {
        nameCache.clear

        // Traverse all states
        for (targetState : rootState.getAllStates.toList) {
            targetState.transformEntry(rootState);
        }
        rootState
    }

    // Traverse all states and transform macro states that have actions to transform
    def void transformEntry(State state, State targetRootState) {
        if (!state.entryActions.nullOrEmpty) {

            var State firstState
            var State lastState 
            
            state.setDefaultTrace //All following states etc. will be traced to state
            
            if (state.final && !state.initial && !state.incomingTransitions.empty) {
                val connector = state.parentRegion.createState(GENERATED_PREFIX + "C").uniqueName(nameCache).setTypeConnector
                for (transition : state.incomingTransitions.immutableCopy) {
                    transition.setTargetState(connector)
                }
                firstState = connector
                lastState = state
            } else if (!state.controlflowRegionsContainStates) { // other inner behavior is already expanded
                state.regions.clear // FIX: need to erase dummy single region
                val region = state.createControlflowRegion(GENERATED_PREFIX + "Entry")
                firstState = region.createInitialState(GENERATED_PREFIX + "Init")
                lastState = region.createState(GENERATED_PREFIX + "Done")
                lastState.final = state.outgoingTransitions.exists[!isTermination]
                if (!state.outgoingTransitions.empty) {
                    val exitState = state.parentRegion.createState(GENERATED_PREFIX + "Exit").uniqueName(nameCache)
                    exitState.final = state.final // propagate final state
                    for (transition : state.outgoingTransitions.immutableCopy) {
                        exitState.outgoingTransitions.add(transition)
                    }
                    state.createTransitionTo(exitState).setTypeTermination
                }
                state.final = false // Do not create complex final state
            } else if (state.regions.filter(ControlflowRegion).size == 1) {
                val region = state.regions.filter(ControlflowRegion).get(0)
                lastState = region.states.filter[initial].get(0) //every region MUST have an initial state
                lastState.setNotInitial
                firstState = region.createInitialState(GENERATED_PREFIX + "Init").uniqueName(nameCache)
            } else { // state has several regions
                val region = state.createControlflowRegion(GENERATED_PREFIX + "Entry").uniqueName(nameCache)
                lastState = region.createState(GENERATED_PREFIX + "Main")
                for (mainRegion : state.regions.filter(e|e != region).toList.immutableCopy) {
                    lastState.regions.add(mainRegion)
                }
                firstState = region.createInitialState(GENERATED_PREFIX + "Init")
                val finalState = region.createFinalState(GENERATED_PREFIX + "Done")
                lastState.createTransitionTo(finalState).setTypeTermination
            }

            val entryRegion = firstState.parentRegion
            val lastEntryAction = state.entryActions.last
            for (entryAction : state.entryActions.toList) {
                entryAction.setDefaultTrace //All following states etc. will be traced to their entryAction
                
                var connector = lastState
                if (entryAction != lastEntryAction) {
                    connector = entryRegion.createState(GENERATED_PREFIX + "C").uniqueName(nameCache).setTypeConnector
                }
                val transition = firstState.createImmediateTransitionTo(connector)
                for (effect : entryAction.effects) {
                    transition.addEffect(effect.copy)
                }
                if (entryAction.trigger != null) {
                    transition.setTrigger(entryAction.trigger)

                    // add default transition
                    firstState.createImmediateTransitionTo(connector)
                }
                firstState = connector

                // After transforming entry actions, erase them
                state.actions.remove(entryAction)
            }
        }
    }

    def SCCharts transform(SCCharts sccharts) {
        sccharts => [ rootStates.forEach[ transform ] ]
    }

}
