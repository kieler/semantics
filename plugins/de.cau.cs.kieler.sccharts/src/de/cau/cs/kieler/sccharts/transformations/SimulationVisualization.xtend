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

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
//import de.cau.cs.kieler.sccharts.sim.c.SCChartsSimCPlugin
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.sccharts.transformations.SCChartsTransformation
import de.cau.cs.kieler.sccharts.features.SCChartsFeature
import de.cau.cs.kieler.sccharts.featuregroups.SCChartsFeatureGroup
import com.google.common.collect.Sets
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransformationExtension
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.sccharts.SCChartsPlugin
import de.cau.cs.kieler.core.kexpressions.CombineOperator
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.keffects.HostcodeEffect
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsExtensions

/**
 * This class handles the<BR>
 *   - Simulation visualization<BR>
 *   - Local signals exposition<BR>
 * 
 * @author cmot
 * @kieler.design 2014-07-23 proposed cmot
 * @kieler.rating 2014-07-23 proposed yellow
 */
class SimulationVisualization extends AbstractExpansionTransformation {
    
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return SCChartsTransformation::SIMULATIONVISUALIZATION_ID
    }

    override getName() {
        return SCChartsTransformation::SIMULATIONVISUALIZATION_NAME
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

    @Inject
    extension KExpressionsCreateExtensions
    
    @Inject
    extension KEffectsExtensions;

    @Inject
    extension SCChartsExtension

    @Inject
    extension SCChartsTransformationExtension

    //-------------------------------------------------------------------------
    //--         S I M U L A T I O N    V I S U A L I Z A T I O N            --
    //-------------------------------------------------------------------------
    // Transformation of a SyncChart to another SyncChart
    // enriched with additional signals for each state and
    // each transition.
    // 
    // These signals are HS for auxiliary state signals
    // and HT for auxiliary transition signals.
    // 
    // Signals HS are generated in the following fashion for a 
    // state S:
    // 
    // 1. For every incoming transition, add an output-emit action for HS
    // 2. Create an auxiliary region that has one state and a self-loop 
    //    emitting HS.
    // 3. Initial states need new initial states connected with an
    //    immediate transition that emits the signal HS.
    // 
    // ATTENTION: Iff the state is a final state, then do not emit the
    // in-state-auxiliary signal inside (2.) because the thread in this case
    // cannot terminate! (This would change the semantics)
    // 
    // ATTENTION: Iff the state has an outgoing normal termination then
    // we cannot do (2.) because this would also corrupt the semantics
    // The normal termination is transformed into a weak abort - this is the
    // best approximation 
    // 
    // Signal HT are generated in the following fashion for a
    // transition T:
    // 
    // As names for the signals are randomly generated and must be unique
    // there must be a mapping that keeps track which signal (name) belongs to
    // which original S statement.
    // General method to create the enriched SyncCharts simulation models.
    var AUXILIARY_VARIABLE_TAG_STATE = SCChartsPlugin::AUXILIARY_VARIABLE_TAG_STATE
    var AUXILIARY_VARIABLE_TAG_TRANSITION = SCChartsPlugin::AUXILIARY_VARIABLE_TAG_TRANSITION
    
    // This prefix is used for naming of all generated signals, states and regions
    static public final String GENERATED_PREFIX = "_"
    
    def State transform(State rootState) {
        val res = rootState.eResource
        
        var targetRootState = rootState.fixAllPriorities


        var microtick = targetRootState.createVariable("_microtick").setTypeInt.setIsOutput.uniqueName
        targetRootState.createEntryAction.effects.add("_microtick = 0;".asHostcodeEffect);
//        microtick.combineOperator = CombineOperator::ADD;
//        microtick.initialValue = 0.createIntValue;
            

        // Traverse all transitions
        var i = 0;
        val originalTransitionsList = targetRootState.eAllContents().toIterable().filter(typeof(Transition)).toList
        for (targetTransition : originalTransitionsList.immutableCopy) {
            val originalTransition = originalTransitionsList.get(i);
            i = i + 1;
            val originalTransitionURIFragment = res.getURIFragment(originalTransition);
            val transitionUID = AUXILIARY_VARIABLE_TAG_TRANSITION +
                originalTransitionURIFragment.hashCode.toString().replace("-", "M");
                
                
            targetTransition.transformSimulationVisualizationTransition(targetRootState, transitionUID);
        }

// TEMPORARY DISABLED //

//        // Traverse all states
//        i = 0;
//        val originalStatesList = targetRootState.getAllStates.toList;
//        for (targetTransition : originalStatesList.immutableCopy) {
//            val originalState = originalStatesList.get(i);
//            i = i + 1;
//            val originalStateURIFragment = res.getURIFragment(originalState);
//            val stateUID = AUXILIARY_VARIABLE_TAG_STATE + originalStateURIFragment.hashCode.toString().replace("-", "M");
//            targetTransition.transformSimulationVisualizationState(targetRootState, stateUID);
//        }

        targetRootState;
    }




    // TEMPORARY DISABLED //
    //   remove "&& !state.hasInnerStatesOrRegions" in the future, problematic is this for self loop aborts
    //   of super states which create immediate self termination transitions and inner watcher (that will
    //   NOT terminate instantaneously. But currently this (pontentially instant. loops) cannot be handled
    //   by the SCG scheduler. So we disable these constructs for now.  

//    // New visualization of active states with immediate during actions
//    def void transformSimulationVisualizationState(State state, State targetRootState, String UID) {
//        if (!state.isRootState && !state.hasInnerStatesOrControlflowRegions) {
//            val active = targetRootState.createVariable(UID).setTypeBool.setIsOutput.uniqueName
//            
//            if (!state.final) {
//                // Add during action - TRUE iff this state is active
//                val duringAction = state.createDuringAction
//                duringAction.setImmediate(true)
//                //duringAction.setTrigger(TRUE)
//                duringAction.addEffect(active.assignRelative(TRUE));     
//            } else {
//                // Add entry action - TRUE iff this final state is entered
//                val entryAction = state.createEntryAction
//                //duringAction.setTrigger(TRUE)
//                entryAction.addEffect(active.assignRelative(TRUE));     
//            }
//            
//            // Add during action - FALSE otherwise
//            val duringAction2 = targetRootState.createDuringAction
//            duringAction2.setImmediate(true)
//            //duringAction2.setTrigger(TRUE)
//            duringAction2.addAssignment(active.assign(FALSE));
//        }
//    }


    // New visualization of active states with immediate during actions
    def void transformSimulationVisualizationState(State state, State targetRootState, String UID) {
        if (!state.isRootState && !state.hasInnerStatesOrControlflowRegions) {
            val active = targetRootState.createVariable(UID).setTypeInt.setIsOutput.uniqueName
            active.combineOperator = CombineOperator::ADD;
            val microtick = targetRootState.createVariable(UID).setTypeInt.setIsOutput.uniqueName
            microtick.initialValue = 0.createIntValue;
            
            if (!state.final) {
                // Add during action - TRUE iff this state is active
                val duringAction = state.createDuringAction
                duringAction.setImmediate(true)
                //duringAction.setTrigger(TRUE)
                duringAction.addEffect(active.assingCombined(microtick.reference));     
            } else {
                // Add entry action - TRUE iff this final state is entered
                val entryAction = state.createEntryAction
                //duringAction.setTrigger(TRUE)
                entryAction.addEffect(active.assingCombined(microtick.reference));     
            }
            
            // Add during action - FALSE otherwise
            val duringAction2 = targetRootState.createDuringAction
            duringAction2.setImmediate(true)
            //duringAction2.setTrigger(TRUE)
            duringAction2.addAssignment(active.assign(0.createIntValue));
        }
    }



//    // Transform a transition as described in 1.
//    def void transformSimulationVisualizationTransition(Transition transition, State targetRootState, String UID) {
//            val active = targetRootState.createVariable(UID).setTypeBool.setIsOutput.uniqueName
//            
//            // Add action - TRUE iff this transition is taken
//            transition.addAssignment(active.assignRelative(TRUE));
//            
//            // Add during action - FALSE otherwise
//            val duringAction2 = targetRootState.createDuringAction()
//            duringAction2.immediate = true
//            duringAction2.addAssignment(active.assign(FALSE));
//    }


    
        // Transform a transition as described in 1.
    def void transformSimulationVisualizationTransition(Transition transition, State targetRootState, String UID) {
            val active = targetRootState.createVariable(UID).setTypeInt.setIsOutput.uniqueName
            active.combineOperator = CombineOperator::ADD;

            // Add action - TRUE iff this transition is taken
            transition.effects.add("_microtick = _microtick + 1".asHostcodeEffect);
            transition.effects.add(active.assingCombined("_microtick".asTextExpression));

            // Add during action - FALSE otherwise
            val duringAction2 = targetRootState.createDuringAction()
            duringAction2.immediate = true
            duringAction2.addAssignment(active.assign("0".asTextExpression));

    }


//    // Transform a transition as described in 1.
//    def void transformSimulationVisualizationTransition(Transition transition, State targetRootState, String UID, ValuedObject microtick) {
//            val active = targetRootState.createVariable(UID).setTypeInt.setIsOutput.uniqueName
//            active.combineOperator = CombineOperator::ADD;
//
//            // Add action - TRUE iff this transition is taken
//            transition.effects.add(microtick.assingCombined(1.createIntValue));
//            transition.effects.add(active.assingCombined(microtick.reference));
//            //transition.addAssignment(active.assingCombined(microtick.reference));
//            
//            // Add during action - FALSE otherwise
//            val duringAction2 = targetRootState.createDuringAction()
//            duringAction2.immediate = true
//            duringAction2.addAssignment(active.assign(0.createIntValue));
//
//    }
    

}
