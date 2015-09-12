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
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup
import de.cau.cs.kieler.sccharts.features.SCChartsFeature
import java.util.ArrayList
import java.util.List

import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions

/**
 * SCCharts ComplexFinalState Transformation.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class ComplexFinalState extends AbstractExpansionTransformation implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::COMPLEXFINALSTATE_ID
    }

    override getName() {
        return SCChartsTransformation::COMPLEXFINALSTATE_NAME
    }

    override getExpandsFeatureId() {
        return SCChartsFeature::COMPLEXFINALSTATE_ID
    }

    override getProducesFeatureIds() {
        return Sets.newHashSet(SCChartsFeature::ABORT_ID, SCChartsFeature::INITIALIZATION_ID)
    }

    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCChartsFeatureGroup::EXPANSION_ID)
    }

    //-------------------------------------------------------------------------
    @Inject
    extension KExpressionsCreateExtensions

    @Inject
    extension KExpressionsComplexCreateExtensions
    
    @Inject
    extension KExpressionsDeclarationExtensions    
    
    @Inject
    extension KExpressionsValuedObjectExtensions   
    
    @Inject
    extension SCChartsExtension

    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"

    //-------------------------------------------------------------------------
    //--              C O M P L E X   F I N A L   S T A T E                  --
    //-------------------------------------------------------------------------
    //
    // PRODUCES: ABORTS
    //
    // ...
    // Optimizations: 
    // (1)   In transitions from one ComplexFinalState (CFS) to another CFS
    //       optimize: Do not set term to false and to true again later
    //       (-> .filter[!complexFinalStates.contains(sourceState)])
    //  ATTENTION: if using this optimization make sure that if there is a
    //  final&INITIAL-state, the term-variable is initialized with TRUE!!! (not FALSE as usual) ***
    // (2)   Share a unique final state if possible (-> retrieveFinalState())
    // (3)   If just one regions: No watcher region is needed, no abort signal and
    //       only a single term signal 
    //       (TODO)                
    def State transform(State rootState) {
        var targetRootState = rootState.fixAllPriorities;

        //Find all possible complex final states
        val globalFinalStates = targetRootState.getAllStates.filter(e|e.isFinal)

        val globalComplexFinalStates = globalFinalStates.filter(
            e|
                ((!e.outgoingTransitions.nullOrEmpty && e.allContainedStates.size > 0)) || e.entryActions.size > 0 ||
                    e.duringActions.size > 0 || e.exitActions.size > 0).toList

        // Traverse all states containing complex final states
        for (targetState : globalComplexFinalStates.map[it.parentRegion.parentState].toList) {
            targetState.transformComplexFinalState(rootState, globalComplexFinalStates);
        }
        targetRootState.fixAllTextualOrdersByPriorities;
    }

    def void transformComplexFinalState(State state, State targetRootState, List<State> globalComplexFinalStates) {

        //als-7.8> Data optimization: Moved state independent filtering to transform method with one single evaluation improving performance
        //        val complexFinalStates = state.allContainedStates.filter(
        //            e|
        //                e.parentRegion.parentState == state && e.isFinal && (!e.outgoingTransitions.nullOrEmpty &&
        //                    e.allContainedStates.size > 0 || e.entryActions.size > 0 || e.duringActions.size > 0 ||
        //                    e.exitActions.size > 0)).toList()
        val complexFinalStates = globalComplexFinalStates.filter[it.parentRegion.parentState == state].toList
        state.setDefaultTrace

        if (!complexFinalStates.nullOrEmpty) {

            var abortFlag = state.createValuedObject(GENERATED_PREFIX + "abort", createBoolDeclaration).uniqueName
            abortFlag.setInitialValue(FALSE)

            var ArrayList<ValuedObject> termVariables = new ArrayList

            for (region : state.regions.filter(ControlflowRegion)) {
                val termVariable = state.createValuedObject(GENERATED_PREFIX + "term", createBoolDeclaration).uniqueName
                termVariable.setInitialValue(FALSE)
                if (region.initialState.final) {
                    termVariable.setInitialValue(TRUE)
                }
                termVariables.add(termVariable)

                val finalStates = region.states.filter[final && incomingTransitions.size > 0]

                for (finalState : finalStates) {
                    for (transition : finalState.incomingTransitions.filter[!complexFinalStates.contains(sourceState)]) {
                        transition.addEffect(termVariable.assign(TRUE))
                    }
                    for (transition : finalState.outgoingTransitions.filter[!complexFinalStates.contains(targetState)]) {
                        transition.addEffect(termVariable.assign(FALSE))
                    }
                }

            }

            //Add Watcher Region
            val watcherRegion = state.createControlflowRegion(GENERATED_PREFIX + "Watch").uniqueName
            val watcherTransition = watcherRegion.createInitialState(GENERATED_PREFIX + "Watch").
                createImmediateTransitionTo(watcherRegion.createFinalState(GENERATED_PREFIX + "Aborted"))
            watcherTransition.addEffect(abortFlag.assign(TRUE))
            for (termVariable : termVariables) {
                watcherTransition.setTrigger(watcherTransition.trigger.and(termVariable.reference))
            }

            //Add additional final state
            for (complexFinalState : complexFinalStates) {
                complexFinalState.setFinal(false)
                val finalState = complexFinalState.parentRegion.retrieveFinalState(GENERATED_PREFIX + "Final")
                complexFinalState.createImmediateTransitionTo(finalState).setTrigger(abortFlag.reference)
            }

        }

    }

}
