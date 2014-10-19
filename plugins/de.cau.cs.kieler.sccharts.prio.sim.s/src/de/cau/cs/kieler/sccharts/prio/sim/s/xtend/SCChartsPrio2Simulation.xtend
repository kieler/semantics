/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.prio.sim.s.xtend

import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.TransitionType
import de.cau.cs.kieler.sccharts.prio.sim.s.SCChartsPrioSimSPlugin
import org.eclipse.xtend.util.stdlib.CloningExtensions
import de.cau.cs.kieler.core.kexpressions.Expression
import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import java.util.List
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.Emission
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.sccharts.StateType
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension

/**
 * This class handles the<BR>
 *   - Simulation visualization<BR>
 *   - Local signals exposition<BR>
 *   - SCCharts pre-processing, replacing the following advanced constructs<BR>
 *     by core constructs:<BR>
 *     - Normal termination<BR>
 *     - Count delay<BR>
 *     - Suspend<BR>
 *     - History transitions<BR>
 *     - Entry actions<BR>
 *     - During actions<BR>
 *     - Exit actions<BR>
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
class SCChartsPrio2Simulation {
     
    @Inject
    extension SCChartsExtension

    @Inject
    extension KExpressionsExtension
         
    //-------------------------------------------------------------------------
    //--         S I M U L A T I O N    V I S U A L I Z A T I O N            --
    //-------------------------------------------------------------------------
    def State transform2Simulation (State rootState) {
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
          // General method to create the enriched SCCharts simulation models.
          var AUXILIARY_VARIABLE_TAG_STATE =  SCChartsPrioSimSPlugin::AUXILIARY_VARIABLE_TAG_STATE
          var AUXILIARY_VARIABLE_TAG_TRANSITION = SCChartsPrioSimSPlugin::AUXILIARY_VARIABLE_TAG_TRANSITION

          // Clone the complete SCCharts region 
          var targetRootState = CloningExtensions::clone(rootState) as State;

          var originalStates = rootState.eAllContents().toIterable().filter(typeof(State));
          var targetStates = targetRootState.eAllContents().toIterable().filter(typeof(State)).toList();

          var originalTransitions = rootState.eAllContents().toIterable().filter(typeof(Transition));
          var targetTransitions = targetRootState.eAllContents().toIterable().filter(typeof(Transition)).toList();

          // For every state in the SyncChart do the transformation
          // Iterate over a copy of the list     
          var i = 0;     
          val originalTransitionList = originalTransitions.toList;
          for(targetTransition : targetTransitions) {
               val originalTransition = originalTransitionList.get(i);
               i = i + 1;
               val originalTransitionURIFragment = originalTransition.eResource.getURIFragment(originalTransition);
               val transitionUID = AUXILIARY_VARIABLE_TAG_TRANSITION + originalTransitionURIFragment.hashCode.toString().replace("-","M");
               // This statement we want to modify
               targetTransition.transformTransition(targetRootState, transitionUID);
          }
          

          // For every state in the SyncChart do the transformation
          // Iterate over a copy of the list     
          i = 0;     
          val originalStatesList = originalStates.toList;
          for(targetState : targetStates) {
               val originalState = originalStatesList.get(i);
               i = i + 1;
               val originalStateURIFragment = originalState.eResource.getURIFragment(originalState);
               val stateUID = AUXILIARY_VARIABLE_TAG_STATE + originalStateURIFragment.hashCode.toString().replace("-","M");
               // This statement we want to modify
               targetState.transformState(targetRootState, stateUID);
          }

          targetRootState;
     }     
     
     // Transform a transition as described in 1.
     def void transformTransition(Transition transition, State targetRootState, String UID) {
          // auxiliary signal
          val auxiliarySignal = KExpressionsFactory::eINSTANCE.createValuedObject();
          val auxiliaryEmission = SCChartsFactory::eINSTANCE.createEmission();
          
          // Setup the auxiliarySignal as an OUTPUT to the module
          auxiliarySignal.setName(UID);
          auxiliarySignal.setInput(false);
          auxiliarySignal.setOutput(true);
          auxiliarySignal.setSignal(true);
          auxiliarySignal.setType(ValueType::PURE);
          // Set the auxliiarySignal for emission 
          auxiliaryEmission.setValuedObject(auxiliarySignal);
          
          // Add emission of auxiliary Signal to tansition
          transition.effects.add(auxiliaryEmission);

          // Add auxiliarySignal to first (and only) root region state SCCharts main interface
          targetRootState.signals.add(auxiliarySignal);
     }

    
     // New visualization of active states with immediate during actions
     def void transformState(State state, State targetRootState, String UID) {
//          if (state.isFinal) {
//               state.setIsFinal(false);
//               // Final states will be transformed if there is a normal termination with a self loop
//               // so we do not want to add a superfluous self loop and return here.
////               return;
//          }

          // Do the following only for NON-final states
          // Do the following only for NON-top-most-states
          if (!state.isFinal && state != targetRootState) {
               // auxiliary signal
               val auxiliarySignal = KExpressionsFactory::eINSTANCE.createValuedObject();
          
               // Setup the auxiliarySignal as an OUTPUT to the module
               auxiliarySignal.setName(UID);
               auxiliarySignal.setInput(false);
               auxiliarySignal.setOutput(true);
               auxiliarySignal.setSignal(true);
               auxiliarySignal.setType(ValueType::PURE);

               // Add emission of auxiliary Signal as an immediate during action for this state
               val immediateDuringAction = state.createImmediateDuringAction
               val auxiliaryEmission = SCChartsFactory::eINSTANCE.createEmission();
                   auxiliaryEmission.setValuedObject(auxiliarySignal);
               immediateDuringAction.effects.add(auxiliaryEmission);
               
               // Add during action to state
               state.localActions.add(immediateDuringAction);

               // Add auxiliarySignal to first (and only) root region state SCCharts main interface
               targetRootState.signals.add(auxiliarySignal);
          }
          
     }     
     
    //-------------------------------------------------------------------------
    //--            H O T F I X   F O R   S Y N C H A R T S                  --
    //-------------------------------------------------------------------------
    // Because the SCCharts KExpressions Parser has a problem with
    // AND / OR lists of more than two elements the following fixes
    // an OperatorExpression of such kind.
    // Test 141
    def OperatorExpression fixForOperatorExpressionLists(OperatorExpression operatorExpression) {
        if (operatorExpression.subExpressions.size <= 2) {
            // In this case we do not need the fix
            return operatorExpression;
        }
        // Here we apply the fix recursively
        val operatorExpressionCopy = operatorExpression.copy;
        val newOperatorExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression();
        newOperatorExpression.setOperator(operatorExpression.operator);
        newOperatorExpression.subExpressions.add(operatorExpression.subExpressions.head);
        // Call recursively without the first element
        operatorExpressionCopy.subExpressions.remove(0);
        newOperatorExpression.subExpressions.add(operatorExpressionCopy.fixForOperatorExpressionLists);
        return newOperatorExpression;
    }
    
     
//    //-------------------------------------------------------------------------
//    //--             E X P O S E   L O C A L   S I G N A L S                 --
//    //-------------------------------------------------------------------------
//    // @requires: none
//
//    // Transforming Local Signals.
//    def Region transformExposeLocalSignal(Region rootRegion) {
//        // Clone the complete SCCharts region 
//        val targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
//        var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).toList();
//
//        for(targetState : targetStates) {
//            // This statement we want to modify
//            targetState.transformExposeLocalSignal(targetRootRegion);
//        }
//        
//        targetRootRegion;
//    }
//    
//    // For C variables it is necessary to remove special characters, this may lead
//    // to name clashes in unlikely cases. 
//    def String removeSpecialCharacters(String string) {
//        if (string == null) {
//            return null;
//        }
//        return string.replace("-","").replace("_","").replace(" ","").replace("+","")
//               .replace("#","").replace("$","").replace("?","")
//               .replace("!","").replace("%","").replace("&","")
//               .replace("[","").replace("]","").replace("<","")
//               .replace(">","").replace(".","").replace(",","")
//               .replace(":","").replace(";","").replace("=","");
//    }
//    
//    // This helper method returns the hierarchical name of a state considering all hierarchical
//    // higher states. A string is formed by the traversed state IDs.
//    def String getHierarchicalName(State state, String StartSymbol) {
//        if (state.parentRegion != null) {
//            if (state.parentRegion.parentState != null) {
//                var higherHierarchyReturnedName = state.parentRegion.parentState.getHierarchicalName(StartSymbol);
//                var regionId = state.parentRegion.id.removeSpecialCharacters;
//                var stateId = state.id.removeSpecialCharacters;
//                // Region IDs can be empty, state IDs normally aren't but the code generation handles 
//                // also this case. 
//                if (stateId.nullOrEmpty) {
//                    stateId = state.hashCode + "";
//                }
//                if (regionId.nullOrEmpty) {
//                    regionId = state.parentRegion.hashCode + "";
//                }
//                if (!higherHierarchyReturnedName.nullOrEmpty) {
//                    higherHierarchyReturnedName = higherHierarchyReturnedName + "_";
//                }
//                if (state.parentRegion.parentState.regions.size > 1) {
//                    return higherHierarchyReturnedName 
//                           + regionId  + "_" +  stateId;
//                }
//                else {
//                    // this is the simplified case, where there is just one region and we can
//                    // omit the region id
//                    return higherHierarchyReturnedName  
//                           + stateId;
//                }
//            }
//        }
//        return StartSymbol + "_";
//    }
//           
//    // Traverse all states and transform possible local signals
//    def void transformExposeLocalSignal(State state, Region targetRootRegion) {
//        // EXPOSE LOCAL SIGNALS: For every local signal create a global signal
//        // and wherever the local signal is emitted, also emit the new global 
//        // signal.
//        // Name the new global signals according to the local signal's hierarchy. 
//               
//               // Exclude the top level state
//               if (state.parentRegion == targetRootRegion) {
//                   return;
//               }
//        
//               // There are local signals, raise them
//               if (state.signals != null && state.signals.size > 0) {
//                    val hierarchicalStateName = state.getHierarchicalName("LOCAL");
//                    
//                    for (Signal stateSignal : ImmutableList::copyOf(state.signals)) {
//                        
//                       val newSignalName = hierarchicalStateName + "_" + stateSignal.name;
//                       val globalSignal = KExpressionsFactory::eINSTANCE.createSignal();
//                       globalSignal.setName(newSignalName);
//                       globalSignal.setIsInput(false);
//                       globalSignal.setIsOutput(true);
//                       globalSignal.setType(ValueType::PURE);
//                       targetRootRegion.states.get(0).signals.add(globalSignal);
//                       
//                       // for every emission of the local signal add an emission of the new
//                       // global signal
//                       val allActions = state.eAllContents().toIterable().filter(typeof(Action)).toList();
//                       val localSignalActions = allActions.filter(e | (e.eAllContents().toIterable().
//                           filter(typeof(Emission)).toList().filter(ee | ee.signal == stateSignal)).size > 0);
//
//                       for (localSignalAction : ImmutableList::copyOf(localSignalActions)) {
//                           val emission = SCChartsFactory::eINSTANCE.createEmission();
//                           emission.setSignal(globalSignal);
//                           localSignalAction.effects.add(emission);
//                       }
//                    }
//               } // end if local signals present
//
//    }
//    
//
//    
//    //-------------------------------------------------------------------------
//    //--              N O R M A L   T E R M I N A T I O N                    --
//    //-------------------------------------------------------------------------
//    // @requires: during actions
//    
//    // Edit: 30.11.2012: Normal Terminations are considered to be immediate
//    // This means that e.g. test10 with a normal termination self loop can
//    // be executed as long as the body not immediately.
//    // For this reason ANOTHER signal terminated is introduced not per region
//    // byt per normal termination, indicating a taken normal termination
//    // and preventing the same to be taken again within a tick.
//    // Like adding a pause in Esterel to
//    // loop
//    // [ p || pause ]
//    // end loop
//    // when p may or may not be instantanous.
//    
//    // Edit: 08.01.2013: Normal Terminations must not be taken after a self
//    // loop returns to the macro state that is left by the normal termination
//    // like in test147.
//    // Therefore a transformed transition must explicitly negate all triggers
//    // of other outgoing transitions.
//
//    
//    // Transforming Normal Termination. 
//    def Region transformNormalTermination(Region rootRegion) {
//        // Clone the complete SCCharts region 
//        val targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
//        var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).toList();
//
//        for(targetState :  ImmutableList::copyOf(targetStates)) {
//            targetState.transformNormalTermination(targetRootRegion);
//        }
//        
//        targetRootRegion;
//    }
//           
//    // Traverse all states and transform outgoing normal termination transitions into weak aborts
//    def void transformNormalTermination(State state, Region targetRootRegion) {
//        // NORMAL TERMINATION : For every state with normal termination transitions transform these into
//        // weak abort transitions. Create a trigger for these new transitions that contains a conjunction
//        // of a new termSignal, one for every contained region.
//        // For every region add an immediate during action to all final state emitting this termSignal
//        // (belonging to the region).
//        // Explicitly negate triggers of other outgoing transitions (see test147)
//        
//               // This is the special case where we must taken care of a normal termination 
//               if (state.outgoingTransitions.filter(e | e.type == TransitionType::NORMALTERMINATION).size > 0) {
//                    val normalTerminationTransition = state.outgoingTransitions.filter(e | e.type == TransitionType::NORMALTERMINATION).head;
//                    val otherTransitions = state.outgoingTransitions.filter(e | e.type != TransitionType::NORMALTERMINATION);
//                    
//                    normalTerminationTransition.setType(TransitionType::WEAKABORT);
//                    val triggerExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression();
//                         triggerExpression.setOperator(OperatorType::AND);
//               
//                    // Setup the auxiliary terminated signal indicating that a normal termination
//                    // has been taken in the same synchronous tick and must not be taken again.
//                    val terminatedSignal = KExpressionsFactory::eINSTANCE.createSignal();
//                        terminatedSignal.setName("terminated" + state.hashCode);
//                        terminatedSignal.setIsInput(false);
//                        terminatedSignal.setIsOutput(false);
//                        terminatedSignal.setType(ValueType::PURE);
////                        state.parentRegion.parentState.signals.add(terminatedSignal);
//                        targetRootRegion.states.get(0).signals.add(terminatedSignal);
//                        
//                    val terminatedSignalReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
//                        terminatedSignalReference.setValuedObject(terminatedSignal);
//                    val notTerminatedExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression();
//                        notTerminatedExpression.setOperator(OperatorType::NOT);
//                        notTerminatedExpression.subExpressions.add(terminatedSignalReference);
//                    val terminatedEmission = SCChartsFactory::eINSTANCE.createEmission();
//                        terminatedEmission.setSignal(terminatedSignal);
//                    // Add the prevention of re-run of normal termination within the same tick
//                    triggerExpression.subExpressions.add(notTerminatedExpression);
//                    // Explicitly prevent that a normal termination is taken when another transition
//                    // has been taken before (e.g., a weak abort self loop like in test 147)
//                    for (otherTransition : otherTransitions) {
//                        if (otherTransition.trigger != null) {
//                            val negatedExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression();
//                            negatedExpression.setOperator(OperatorType::NOT);
//                            negatedExpression.subExpressions.add(otherTransition.trigger.copy);
//                            triggerExpression.subExpressions.add(negatedExpression);
//                        }
//                    }
//                    
//                    // Prevent the normal termination to be taken again by emitting this helper signal (test10)
//                    normalTerminationTransition.effects.add(terminatedEmission);
//                                        
//                    // Walk thru all regions that must terminate and create one termination signal per
//                    // region. For the weak abort create a conjunction of these signals as the trigger.
//                    for (region : state.regions) {
//                         // Setup the auxiliary termination signal indicating that a normal termination
//                         // should be taken.
//                         val finishedSignal = KExpressionsFactory::eINSTANCE.createSignal();
//                         finishedSignal.setName("finished" + region.hashCode);
//                         finishedSignal.setIsInput(false);
//                         finishedSignal.setIsOutput(false);
//                         finishedSignal.setType(ValueType::PURE);
//
//                         val finalStates = region.states.filter(e | e.isFinal == true);
//                         // For all final states add a during action that emits the termination signal
//                         for (finalState : finalStates) {
//                              val finishedEmission = SCChartsFactory::eINSTANCE.createEmission();
//                              finishedEmission.setSignal(finishedSignal);
//                              val termDuringAction = SCChartsFactory::eINSTANCE.createAction
//                              termDuringAction.setIsImmediate(true);
//                              termDuringAction.effects.add(finishedEmission);
//                              finalState.innerActions.add(termDuringAction);
//                              // Set the final state flag to false
//                              finalState.setIsFinal(false);
//                         }
//                    
////                         state.parentRegion.parentState.signals.add(finishedSignal);
//                       targetRootRegion.states.get(0).signals.add(finishedSignal);
//                         val valuedObjectReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
//                         valuedObjectReference.setValuedObject(finishedSignal);
//                         triggerExpression.subExpressions.add(valuedObjectReference);
//                    }
//               
//                    // A normal termination should immediately be triggerable! (test 145) 
//                    normalTerminationTransition.setIsImmediate(true);
//                    if (triggerExpression.subExpressions.size == 1) {
//                         // if there is just one signal, we do not need an AND!
//                         normalTerminationTransition.setTrigger(triggerExpression.subExpressions.get(0));
//                    }
//                    else if (triggerExpression.subExpressions.size > 1) {
//                         normalTerminationTransition.setTrigger(triggerExpression.fixForOperatorExpressionLists);
//                    }
//               } // end if normal termination present
//
//    }
//           
//           
//
//    //-------------------------------------------------------------------------
//    //--                S U R F A C E  &   D E P T H                         --
//    //-------------------------------------------------------------------------
//    //@requires: abort transformation (there must not be any weak or strong aborts outgoing from
//    //                                 macro state, hence we just consider simple states here)
//
//    // For every non-hierarchical state S that has outgoing transitions and is of type NORMAL:
//    // Create an auxiliary signal isDepth_S that indicates that the state was
//    // entered in an earlier tick and add it to the parent state P of the parent region R of S.
//    // Modify all triggers of outgoing non-immediate transitions T of S: 1. set them to be
//    // immediate and 2. add "isDepth_S &&" to its trigger.
//    // Modify state S and make it a conditional.
//    // Now walk through all n transitions T_1..n outgoing from S (ordered ascended by their priority):
//    // For T_i create a conditional C_i. Connect C_i-1 and C_i with a true triggered immediate transition
//    // of priority 2. Set priority of T_i to 1. Note that T_i's original priority is now implicitly encoded
//    // by the sequential order of evaluating the conditionals C_1..n.
//    // The last conditional C_n connect with a new a normal state D (the explicit depth of S).
//    // Connect D with C_1 using a transition that emits isDepth_S.
//    
//    // Note that conditionals cannot be marked to be initial. Hence, if a state S is marked initial 
//    // then an additional initial state I with a true triggered immediate transition to S will
//    // be inserted. \code{S} is then marked not to be initial. This is a necessary pre-processing for
//    // the above transformation.
//    
//    def Region transformSurfaceDepth (Region rootRegion) {
//        // Clone the complete SCCharts region 
//        var targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
//
//        var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).filter(e | !e.hierarchical).toList();
//
//        // For every state in the SyncChart do the transformation
//        // Iterate over a copy of the list  
//        for(targetState : targetStates) {
//            targetState.transformSurfaceDepth(targetRootRegion);
//        }
//        
//        targetRootRegion;
//    }
//         
//     def void transformSurfaceDepth(State state, Region targetRootRegion) {
//       if (state.outgoingTransitions.size > 0 && state.type == StateType::NORMAL) {
//         val parentRegion = state.parentRegion;
//         val stateId = state.id;
//         val stateLabel = state.label;
//
//         // SPECIAL CASE OF INITIAL STATES 
//         // Insert a state and a transition here because conditional states cannot be initial
//         if (state.isInitial) {
//             val initialState  = SCChartsFactory::eINSTANCE.createState();
//             initialState.setId("Initial" + state.hashCode);
//             initialState.setLabel("I"); 
//             initialState.setIsInitial(true);
//             parentRegion.states.add(initialState);
//             state.setIsInitial(false);
//             // Connect             
//             val connect = SCChartsFactory::eINSTANCE.createTransition();
//             connect.setIsImmediate(true);
//             connect.setLabel("#");
//             connect.setPriority(1);
//             connect.setTargetState(state);
//             initialState.outgoingTransitions.add(connect);
//         }             
//           
//         // Create auxiliary signal
//         var isDepthSignalUID = "isDepth_" + parentRegion.hashCode + "_" + state.id;
//         val isDepthSignal = KExpressionsFactory::eINSTANCE.createSignal();
//         isDepthSignal.setName(isDepthSignalUID);
//         isDepthSignal.setIsInput(false);
//         isDepthSignal.setIsOutput(false);
//         isDepthSignal.setType(ValueType::PURE);
//         parentRegion.parentState.signals.add(isDepthSignal);  
//
//         // Modify triggers of non immediate transitions and make them immediate
//         val nonImmediateTransitions = state.outgoingTransitions.filter(e | !e.isImmediate).toList;
//         val auxiliaryTrigger =  KExpressionsFactory::eINSTANCE.createValuedObjectReference
//             auxiliaryTrigger.setValuedObject(isDepthSignal);
//         for (transition : nonImmediateTransitions) {
//             // Make this transition immediate now
//             transition.setIsImmediate(true);
//             // Modify trigger if any
//             if (transition.trigger != null) {
//                 val andAuxiliaryTrigger = KExpressionsFactory::eINSTANCE.createOperatorExpression;
//                 andAuxiliaryTrigger.setOperator(OperatorType::AND);
//                 andAuxiliaryTrigger.subExpressions.add(auxiliaryTrigger.copy);
//                 andAuxiliaryTrigger.subExpressions.add(transition.trigger);
//                 transition.setTrigger(andAuxiliaryTrigger);
//             }  else {
//                 transition.setTrigger(auxiliaryTrigger.copy);
//             }
//         } 
//
//         // Modify surfaceState (the original state)
//         val surfaceState = state;
//         surfaceState.setType(StateType::CONDITIONAL);
//         surfaceState.setId(stateId + "Surface");
//         surfaceState.setLabel(stateLabel + "Surface");
//         
//         // For every state create a number of surface nodes
//         val orderedTransitionList = state.outgoingTransitions.sort(e1, e2 | if (e1.priority < e2.priority) {-1} else {1});
//         
//         var previousSurfState = surfaceState;
//         var State surfState = null;
//         for (transition : orderedTransitionList) {
//            surfState  = SCChartsFactory::eINSTANCE.createState();
//            surfState.setType(StateType::CONDITIONAL);
//            surfState.setId(stateId + "Surface" + transition.hashCode);
//            surfState.setLabel(stateLabel + "Surface");
//            parentRegion.states.add(surfState);
//            // Move transition to this state
//            surfState.outgoingTransitions.add(transition);
//            // We can now set the transition priority to 1 (it is reflected implicityly by the sequential order now)
//            transition.setPriority(1);
//            // Connect
//            val connect = SCChartsFactory::eINSTANCE.createTransition();
//            connect.setIsImmediate(true);
//            connect.setLabel("#");
//            connect.setPriority(2);
//            connect.setTargetState(surfState);
//            previousSurfState.outgoingTransitions.add(connect);
//            // Next cycle
//            previousSurfState = surfState; 
//         }
//         
//         // Add an additional last state that will become depth State
//         val depthState  = SCChartsFactory::eINSTANCE.createState();
//         depthState.setType(StateType::NORMAL);
//         depthState.setId(stateId); // + "Depth");
//         depthState.setLabel(stateLabel); // + "Depth");
//         parentRegion.states.add(depthState);
//         // Connect
//         val connect = SCChartsFactory::eINSTANCE.createTransition();
//         connect.setIsImmediate(true);
//         connect.setLabel("#");
//         connect.setPriority(2);
//         connect.setTargetState(depthState);
//         surfState.outgoingTransitions.add(connect);
//         
//         // Connect back depth with surface state
//         val connectBack = SCChartsFactory::eINSTANCE.createTransition();
//         // This MUST be highest priority so that the control flow restarts and takes other 
//         // outgoing transition.
//         // There should not be any other outgoing transition.
//         connectBack.setPriority(1);
//         connectBack.setTargetState(surfaceState);
//         depthState.outgoingTransitions.add(connectBack);
//         val auxiliaryEmission = SCChartsFactory::eINSTANCE.createEmission();
//         auxiliaryEmission.setSignal(isDepthSignal);
//         connectBack.effects.add(auxiliaryEmission);
//         
//       }
//     }
//
//
//
//    //-------------------------------------------------------------------------
//    //--                 S P L I T   T R A N S I T I O N                     --
//    //-------------------------------------------------------------------------
//
//    // For every transition T that has both, a trigger and an effect do the following:
//    // Create a conditional C and add it to the parent of T's source state S_src.
//    // Create a new true triggered immediate effect transition T_eff and move all effects of T to T_eff.
//    // Set the T_eff to have T's target state. Set T to have the target C.
//    // Add T_eff to C's outgoing transitions. 
//    
//    def Region transformSplitTransition (Region rootRegion) {
//        // Clone the complete SCCharts region 
//        var targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
//
//        var targetTransitions = targetRootRegion.eAllContents().toIterable().filter(typeof(Transition)).toList();
//
//        // For every transition in the SyncChart do the transformation
//        // Iterate over a copy of the list  
//        for(targetTransition : targetTransitions) {
//            targetTransition.transformSplitTransition(targetRootRegion);
//        }
//        
//        targetRootRegion;
//    }
//         
//     def void transformSplitTransition(Transition transition, Region targetRootRegion) {
//         
//         // Only apply this to transition that have both, a trigger and effects!
//         if (transition.trigger != null && !transition.effects.nullOrEmpty) {
//              val targetState = transition.targetState;
//              val parentRegion = targetState.parentRegion;
//              val triggerTransition = transition;
//             
//             val triggeredState  = SCChartsFactory::eINSTANCE.createState();
//             triggeredState.setId(targetState.id + "_Triggered_" + targetState.hashCode);
//             triggeredState.setLabel( targetState.id + "_Triggered"); 
//             triggeredState.setType(StateType::CONDITIONAL);
//             parentRegion.states.add(triggeredState);
//             // Create new effect transition             
//             val effectTransition = SCChartsFactory::eINSTANCE.createTransition();
//             effectTransition.setIsImmediate(true);
//             effectTransition.setLabel("#");
//             effectTransition.setPriority(1);
//             // Move effect to effect transition
//             for (effect : transition.effects) {
//                 effectTransition.effects.add(effect.copy);
//             } 
//             transition.effects.clear;
//             // Re-connect
//             effectTransition.setTargetState(transition.targetState);
//             triggerTransition.setTargetState(triggeredState);
//             triggeredState.outgoingTransitions.add(effectTransition);
//         }
//     }
//
//
//
//    //-------------------------------------------------------------------------
//    //--           F I N A L   S T A T E S    T R A N S I T I O N            --
//    //-------------------------------------------------------------------------
//    
//    // For every region R that contains final states with outgoing transitions do the following:
//    // Create an Abort signal and add it to R's parent state P.
//    // Go through every region of P other then R and search for final states Q_1..n. For all incoming transitions
//    // of all Q_1..n add an emission of Abort.
//    // Find a common final state F of region R that has no outgoing transition. If no one exists, create one.
//    
//    // For every final state S with outgoing transitions inside R do the following:
//    // Finally add an immediate transition with maximal (lowest) priority from S to F triggered by Abort.
//
//
//    def Region transformFinalStateTransition (Region rootRegion) {
//        // Clone the complete SCCharts region 
//        var targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
//
//        var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).toList();
//
//        // For every state in the SyncChart do the transformation
//        // Iterate over a copy of the list  
//        for(targetState : targetStates) {
//            targetState.transformFinalStateTransition(rootRegion);
//        }
//        
//        targetRootRegion;
//    }
//         
//     def void transformFinalStateTransition(State parentState, Region targetRootRegion) {
//       val parentStatesIsConsidered = parentState.eAllContents().toIterable().filter(typeof(State)).filter(e | e.parentRegion.parentState == parentState && e.isFinal && !e.outgoingTransitions.nullOrEmpty).toList();
//         
//       if (!parentStatesIsConsidered.nullOrEmpty) {
//            // Auxiliary reset signal
//            var auxiliaryResetSignalUID = "Abort" + parentState.hashCode;
//            val auxiliaryResetSignal = KExpressionsFactory::eINSTANCE.createSignal();
//            auxiliaryResetSignal.setName(auxiliaryResetSignalUID);
//            auxiliaryResetSignal.setIsInput(false);
//            auxiliaryResetSignal.setIsOutput(false);
//            auxiliaryResetSignal.setType(ValueType::PURE);
//            parentState.signals.add(auxiliaryResetSignal);
//            
//            // Auxiliary watch master region with macro WatchMasterState and AbortedState
//            val auxiliaryWatchMasterRegion  = SCChartsFactory::eINSTANCE.createRegion();
//            parentState.regions.add(auxiliaryWatchMasterRegion);
//            auxiliaryWatchMasterRegion.setId("Watch" + parentState.hashCode);
//            val auxiliaryWatchMasterState  = SCChartsFactory::eINSTANCE.createState();
//            auxiliaryWatchMasterRegion.states.add(auxiliaryWatchMasterState);
//            auxiliaryWatchMasterState.setId("Watch" + parentState.hashCode);
//            auxiliaryWatchMasterState.setLabel("Watch");
//            auxiliaryWatchMasterState.setIsInitial(true);
//            val auxiliaryAbortedState  = SCChartsFactory::eINSTANCE.createState();
//            auxiliaryWatchMasterRegion.states.add(auxiliaryAbortedState);
//            auxiliaryAbortedState.setId("Aborted" + parentState.hashCode);
//            auxiliaryAbortedState.setLabel("Aborted");
//            auxiliaryAbortedState.setIsFinal(true);
//            // Connect WatchMaster and Aborted state
//            val abortRegionTransition = SCChartsFactory::eINSTANCE.createTransition();
//            abortRegionTransition.setPriority(1)
//            abortRegionTransition.setType(TransitionType::NORMALTERMINATION);
//            abortRegionTransition.setTargetState(auxiliaryAbortedState);
//            auxiliaryWatchMasterState.outgoingTransitions.add(abortRegionTransition);
//            // In this normal termination emit reset signal for the region           
//            val auxiliaryResetSignalEmission = SCChartsFactory::eINSTANCE.createEmission();
//            auxiliaryResetSignalEmission.setSignal(auxiliaryResetSignal);   
//            abortRegionTransition.effects.add(auxiliaryResetSignalEmission);                       
//            
//            // For every parallel region W
//            for (parallelRegion : parentState.regions) {
//                   if (parallelRegion != auxiliaryWatchMasterRegion) {
//                        // Auxiliary term signal - Try to find existing for parallelRegion
//                        val auxiliaryRegionTermSignalUID = "Term" + parallelRegion.hashCode;
//                        var Signal auxiliaryRegionTermSignal = null; 
//                        auxiliaryRegionTermSignal = KExpressionsFactory::eINSTANCE.createSignal();
//                        auxiliaryRegionTermSignal.setName(auxiliaryRegionTermSignalUID);
//                        auxiliaryRegionTermSignal.setIsInput(false);
//                        auxiliaryRegionTermSignal.setIsOutput(false);
//                        auxiliaryRegionTermSignal.setType(ValueType::PURE);
//                        parentState.signals.add(auxiliaryRegionTermSignal);
//                            
//                        for (finalState : parallelRegion.states.filter(e | e.isFinal))  {
//                                for (finalStateTransition : finalState.incomingTransitions) {
//                                   val auxiliaryTermSignalEmission = SCChartsFactory::eINSTANCE.createEmission();
//                                   auxiliaryTermSignalEmission.setSignal(auxiliaryRegionTermSignal);   
//                                   finalStateTransition.effects.add(auxiliaryTermSignalEmission);                       
//                                }
//                        }
//                        
//                        // Now add regions for all parallelRegions in the auxiliaryWatchMasterState
//                        val auxiliaryWatchRegion  = SCChartsFactory::eINSTANCE.createRegion();
//                        auxiliaryWatchMasterState.regions.add(auxiliaryWatchRegion);
//                        auxiliaryWatchRegion.setId("Watch" + parallelRegion.hashCode);
//                        val auxiliaryWatchState  = SCChartsFactory::eINSTANCE.createState();
//                        auxiliaryWatchRegion.states.add(auxiliaryWatchState);
//                        auxiliaryWatchState.setId("I" + parallelRegion.hashCode);
//                        auxiliaryWatchState.setLabel("I");
//                        auxiliaryWatchState.setIsInitial(true);
//                        val auxiliaryTerminatedState  = SCChartsFactory::eINSTANCE.createState();
//                        auxiliaryWatchRegion.states.add(auxiliaryTerminatedState);
//                        auxiliaryTerminatedState.setId("T" + parallelRegion.hashCode);
//                        auxiliaryTerminatedState.setLabel("T");
//                        auxiliaryTerminatedState.setIsFinal(true);
//                        // Connect
//                        val terminatedRegionTransition = SCChartsFactory::eINSTANCE.createTransition();
//                        val terminatedRegionTransitionTrigger =  KExpressionsFactory::eINSTANCE.createValuedObjectReference
//                        terminatedRegionTransitionTrigger.setValuedObject(auxiliaryRegionTermSignal);
//                        terminatedRegionTransition.setPriority(1)
//                        terminatedRegionTransition.setIsImmediate(true);
//                        terminatedRegionTransition.setTrigger(terminatedRegionTransitionTrigger);
//                        terminatedRegionTransition.setTargetState(auxiliaryTerminatedState);
//                        auxiliaryWatchState.outgoingTransitions.add(terminatedRegionTransition);
//                   }
//            } // end for every parallelRegion
//           
//            for (region : parentState.regions) {
//                // Consider regions that contain final states with outgoing transitions
//                val consideredFinalStates = region.states.filter(e | e.isFinal && !e.outgoingTransitions.nullOrEmpty);
//
//                if (!consideredFinalStates.nullOrEmpty) {
//                    val parentRegion = region;
//
//                    // Find the one final state for the parentRegion to abort to
//                    var State finalStateAbortTarget = null;
//                    val finalStates = parentRegion.states.filter(e | e.isFinal && e.outgoingTransitions.nullOrEmpty);
//                    if (finalStates.nullOrEmpty) {
//                        // Create one 
//                        finalStateAbortTarget  = SCChartsFactory::eINSTANCE.createState();
//                        finalStateAbortTarget.setId("final" + parentRegion.hashCode);
//                        finalStateAbortTarget.setLabel("final");
//                        finalStateAbortTarget.setIsInitial(false);
//                        parentRegion.states.add(finalStateAbortTarget);
//                    } else {
//                        finalStateAbortTarget = finalStates.head;
//                    }
//            
//                    // Now handle the consider states, make them non-final and add abort transition
//                    for (state : consideredFinalStates) {
//                        val sourceState = state;
//                        val maxPrio = sourceState.outgoingTransitions.size + 1;
//               
//                        // Set source state not to be final any more
//                        sourceState.setIsFinal(false);
//               
//                        // Add aborting transition
//                        val resetTransition = SCChartsFactory::eINSTANCE.createTransition();
//                        val auxiliaryResetTrigger =  KExpressionsFactory::eINSTANCE.createValuedObjectReference
//                        auxiliaryResetTrigger.setValuedObject(auxiliaryResetSignal);
//                        resetTransition.setTrigger(auxiliaryResetTrigger);
//                        resetTransition.setPriority(maxPrio)
//                        resetTransition.setIsImmediate(true);
//                        resetTransition.setLabel("#");
//                        resetTransition.setTargetState(finalStateAbortTarget);
//                        sourceState.outgoingTransitions.add(resetTransition);
//                    } // end for
//                } // end if considered states <> null                
//            }
//
//
//           
//       }  // end if considered
//     }
//
//
//
//    //-------------------------------------------------------------------------
//    //--                   C O U N T   D E L A Y S                           --
//    //-------------------------------------------------------------------------
//
//    // For every transition T from state S with a count delay n create a region R. Put the
//    // region into S (hence, S may become a macro state). Create a new signal countDelay that is emitted
//    // by the last transition of the auxiliary region R. Create n+1 states within R and connect
//    // these by the same trigger of T just without the count delay. The n+1's state must be final
//    // in order to handle possible outgoing normal terminations of S correctly.
//    
//    def Region transformCountDelay (Region rootRegion) {
//        // Clone the complete SCCharts region 
//        var targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
//
//        var targetTransitions = targetRootRegion.eAllContents().toIterable().filter(typeof(Transition)).toList();
//
//        // For every transition in the SyncChart do the transformation
//        // Iterate over a copy of the list  
//        for(targetTransition : targetTransitions) {
//            // This statement we want to modify
//            targetTransition.transformCountDelay(targetRootRegion);
//        }
//        
//        targetRootRegion;
//    }
//         
//     // This will encode count delays in transitions.
//     def void transformCountDelay(Transition transition, Region targetRootRegion) {
//          if (transition.delay > 1) {
//               val targetRootState = targetRootRegion.states.get(0);
//               val sourceState = transition.sourceState;
//               
//               // Optimization: If there is no outgoing normal termination out of S then do not mark states as final
//               val existsNormalTermination = !(sourceState.parentRegion.parentState.outgoingTransitions.filter(e | e.type == TransitionType::NORMALTERMINATION).nullOrEmpty);
//
//               // auxiliary trigger signal
//               var auxiliarySignalUID = "countDelay" + transition.hashCode;
//               val auxiliarySignal = KExpressionsFactory::eINSTANCE.createSignal();
//               auxiliarySignal.setName(auxiliarySignalUID);
//               auxiliarySignal.setIsInput(false);
//               auxiliarySignal.setIsOutput(false);
//               auxiliarySignal.setType(ValueType::PURE);
//               targetRootState.signals.add(auxiliarySignal);
//
//               val triggerExpression = transition.trigger;
//               
//
//               // Create auxiliary region R and add it to the source state.
//               // Also add the auxiliary signal to this common parent state
//               val auxiliaryRegion = SCChartsFactory::eINSTANCE.createRegion()
//               sourceState.regions.add(auxiliaryRegion);
//
//               var delay = 0;
//               var State previousAuxiliaryState = null;
//               var State auxiliaryState = null;
//               while (delay <= transition.delay) {
//                   delay = delay + 1;
//                   previousAuxiliaryState = auxiliaryState;
//                   
//                   auxiliaryState  = SCChartsFactory::eINSTANCE.createState();
//                   auxiliaryState.setId("delay" + delay);
//                   auxiliaryState.setLabel(delay + "");
//                   auxiliaryState.setIsInitial(delay == 1);
//                   auxiliaryRegion.states.add(auxiliaryState);
//                   
//                   if (previousAuxiliaryState != null) {
//                       val connect = SCChartsFactory::eINSTANCE.createTransition();
//                       connect.setPriority(2);
//                       connect.targetState = auxiliaryState
//                       previousAuxiliaryState.outgoingTransitions.add(connect);
//                       connect.setTrigger(triggerExpression.copy);
//                       if (delay > transition.delay) {
//                           // Connect last state
//                           val auxiliaryEmission = SCChartsFactory::eINSTANCE.createEmission();
//                           auxiliaryEmission.setSignal(auxiliarySignal);
//                           connect.effects.add(auxiliaryEmission);
//                       } 
//                       
//                       // Make state final (just in case, because there could be
//                       // a normal termination outgoing)
//                       if (existsNormalTermination) {
//                          auxiliaryState.setIsFinal(true);
//                       }
//                   }
//               }
//               
//               // Modify original trigger
//               transition.setDelay(0);
//               val auxiliaryTrigger =  KExpressionsFactory::eINSTANCE.createValuedObjectReference
//               auxiliaryTrigger.setValuedObject(auxiliarySignal);
//               transition.setTrigger(auxiliaryTrigger);
//          }
//     }
//     
////    //-------------------------------------------------------------------------
////    //--                   C O U N T   D E L A Y S                           --
////    //-------------------------------------------------------------------------
////    // @requires: auxiliary (host) variables
////     
////    // Transforming Count Delays entry function.
////    def Region transformCountDelay (Region rootRegion) {
////        // Clone the complete SCCharts region 
////        var targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
////
////        var targetTransitions = targetRootRegion.eAllContents().toIterable().filter(typeof(Transition)).toList();
////
////        // For every transition in the SyncChart do the transformation
////        // Iterate over a copy of the list  
////        for(targetTransition : targetTransitions) {
////            // This statement we want to modify
////            targetTransition.transformCountDelay(targetRootRegion);
////        }
////        
////        targetRootRegion;
////    }
////         
////     // This will encode count delays in transitions and insert additional counting
////     // host code variables plus modifying the trigger of the count delayed transition
////     // to be immediate and guarded by a host code expression (with the specific
////    // number of ticks).
////     def void transformCountDelay(Transition transition, Region targetRootRegion) {
////          if (transition.delay > 1) {
////               // auxiliary signal
////               val auxiliaryVariable = KExpressionsFactory::eINSTANCE.createVariable;
////               val auxiliaryVariableName = "countDelay" + transition.hashCode + "";
////               auxiliaryVariable.setName(auxiliaryVariableName);
////               auxiliaryVariable.setType(ValueType::INT);
////               auxiliaryVariable.setInitialValue("0");
////
////               // add auxiliaryVariable to first (and only) root region state SCCharts main interface
////                 targetRootRegion.states.get(0).variables.add(auxiliaryVariable);
////                 
////               // add self-loop transition, counting up the variable
////               val selfLoop = SCChartsFactory::eINSTANCE.createTransition();
////               val state = transition.sourceState;
////               selfLoop.setTargetState(state);
////               selfLoop.setPriority(1);
////               val selfLoopEffect = SCChartsFactory::eINSTANCE.createTextEffect;
////               selfLoopEffect.setCode(auxiliaryVariableName + "++");
////               selfLoop.effects.add(selfLoopEffect);
////               selfLoop.setTrigger(transition.trigger);
////               state.outgoingTransitions.add(selfLoop);
////
////               // calculate a new terminating expression, based on the auxiliary variable
////               val terminatingExpression = KExpressionsFactory::eINSTANCE.createTextExpression;
////               terminatingExpression.setCode(auxiliaryVariableName + " >= " + transition.delay);
////               transition.setTrigger(terminatingExpression);
////               
////               // disable old delay, set it to be immediate
////               transition.setDelay(1);
////               transition.setIsImmediate(true);
////               
////            // reset the variable for all incoming transition
////            val resetEffect = SCChartsFactory::eINSTANCE.createTextEffect;
////            resetEffect.setCode(auxiliaryVariableName + "= 0");
////            for (incomingTransition : state.incomingTransitions) {
////                // Add reset text effect of incoming transition
////                transition.effects.add(resetEffect);
////            }
////               
////          }
////     }
//     
//    
//    //-------------------------------------------------------------------------
//    //--                          S U S P E N D                              --
//    //-------------------------------------------------------------------------
//    
//    //@requires: during
//    //@run-before: entry (because these are considered here)
//    
//    // For a suspend statement of state S create a new top-level region
//    // with two states (NotSuspended (initial) and Suspended). Connect them
//    // with the suspension trigger.
//    // If the trigger is immediate, then connect them immediately and have
//    // the transition back be non-immediate. If it is non immediate then
//    // have the transition back be immediate.
//    // Create an immediate during action of the Suspended state that emits
//    // an auxiliaryDisableSignal that is added to all outgoing transitions
//    // (within the disabledExpression) 
//    
//    // Transforming Suspends.
//    def Region transformSuspend(Region rootRegion) {
//        // Clone the complete SCCharts region 
//        var targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
//
//        var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).toList();
//
//        // For every state in the SyncChart do the transformation
//        // Iterate over a copy of the list  
//        for(targetState :  ImmutableList::copyOf(targetStates)) {
//            // This statement we want to modify
//            targetState.transformSuspend(targetRootRegion);
//        }
//        
//        // Now delete all suspends
//        for(targetState :  ImmutableList::copyOf(targetStates.filter(e | e.suspensionTrigger != null))) {
//            targetState.setSuspensionTrigger(null);
//        }
//        
//        targetRootRegion;
//    }
//    
//    
//
//   // Tells whether a state is a macro state
//   def boolean isHierarchical(State state) {
//       (state.regions != null && state.regions.size > 0);
//   }
//   
//   
//   // Build a new expression that disables the inExpression if the disabledWhenExpression
//   // is enabled. It optimizes not(not(x)) = x.
//   def Expression buildDisabledExpression(Expression inExpression, 
//                                          Expression disabledWhenExpression) {
//                val andAuxiliaryTrigger = KExpressionsFactory::eINSTANCE.createOperatorExpression;
//                    andAuxiliaryTrigger.setOperator(OperatorType::AND);
//                val notAuxiliaryTrigger = KExpressionsFactory::eINSTANCE.createOperatorExpression;
//                    notAuxiliaryTrigger.setOperator(OperatorType::NOT);
//                var Expression auxiliaryTrigger;
//                    // Add a copy because we want this trigger to be used in possibly several
//                    // outgoing transitions
//                    if ((disabledWhenExpression instanceof OperatorExpression) &&
//                       ((disabledWhenExpression as OperatorExpression).operator == OperatorType::NOT)) {
//                        // Optimize not(not(x)) = x
//                        auxiliaryTrigger = ((disabledWhenExpression as OperatorExpression).subExpressions.get(0)
//                            as Expression).copy;
//                    }
//                    else {
//                        // Default case
//                        notAuxiliaryTrigger.subExpressions.add(disabledWhenExpression.copy);
//                        auxiliaryTrigger = notAuxiliaryTrigger;
//                    }
//                    if (inExpression != null) {
//                      // There is an outgoing transition trigger  
//                       andAuxiliaryTrigger.subExpressions.add(inExpression);
//                       andAuxiliaryTrigger.subExpressions.add(auxiliaryTrigger);
//                       return andAuxiliaryTrigger;
//                    } else {
//                       // The simple case, there is NO outgoing transition trigger yet
//                       return auxiliaryTrigger;
//                    }
//   }
//
//    // Encode suspensions by traversing all states and get their
//    // hierarchical suspension trigger (if any).
//    // In case there is such a trigger, to all outgoing transitions, add 
//    // an "(<condition>) && !trigger" to disable ALL these transitions
//    // if the suspension trigger is enabled.
//    def void transformSuspend(State state, Region targetRootRegion) {
//
//        if (state.suspensionTrigger != null) {
//             val suspendTrigger = state.suspensionTrigger.trigger;
//             val immediateSuspension = state.suspensionTrigger.isImmediate;
//             val notSuspendTrigger = KExpressionsFactory::eINSTANCE.createOperatorExpression;
//                 notSuspendTrigger.setOperator(OperatorType::NOT);
//                 notSuspendTrigger.subExpressions.add(suspendTrigger.copy);
//            
//               // Add SET and RESET signal signal flag 
//               val disabledSignal = KExpressionsFactory::eINSTANCE.createSignal();
//               disabledSignal.setName("disabled" + state.id);
//               disabledSignal.setIsInput(false);
//               disabledSignal.setIsOutput(false);
//               disabledSignal.setType(ValueType::PURE);
//               targetRootRegion.states.get(0).signals.add(disabledSignal);
//               
//               // Add a NonSuspended and Suspended state
//               val runningState = SCChartsFactory::eINSTANCE.createState();
//               runningState.setId("NonSuspended" + state.hashCode);
//               runningState.setLabel(state.id + "Running");
//               runningState.setIsInitial(true);
//               val disabledState = SCChartsFactory::eINSTANCE.createState();
//               disabledState.setId("Suspended" + state.hashCode);
//               disabledState.setLabel(state.id + "Disabled");
//               
//               // Add during action that emits the disable signal 
//               val immediateDuringAction = SCChartsFactory::eINSTANCE.createAction();
//               immediateDuringAction.setIsImmediate(true);
//               val auxiliaryEmission = SCChartsFactory::eINSTANCE.createEmission();
//                   auxiliaryEmission.setSignal(disabledSignal);
//               immediateDuringAction.effects.add(auxiliaryEmission);
//               disabledState.innerActions.add(immediateDuringAction);
//               
//               // Create the body of the intermediate state - containing the entry actions
//               // as during actions.
//               val actionState = SCChartsFactory::eINSTANCE.createState();
//               actionState.setId("Awake" + state.hashCode);
//               actionState.setLabel("Awake " + state.label);
//               // For every entry action: Create a region
//               for (entryAction : state.entryActions) {
//                     val entryActionCopy = entryAction.copy;
//                     entryActionCopy.setIsImmediate(true);
//                     actionState.innerActions.add(entryActionCopy); 
//               }               
//               
//               // Connect Suspended and NonSuspended States with transitions (s.a. for a more detailed explanation)
//               val disabled2actionTransition =  SCChartsFactory::eINSTANCE.createTransition();
//                   disabled2actionTransition.setTargetState(actionState);
//                   disabled2actionTransition.setTrigger(notSuspendTrigger.copy);
//                   disabled2actionTransition.setIsImmediate(!immediateSuspension);
//                   disabled2actionTransition.setPriority(1);
//                   disabledState.outgoingTransitions.add(disabled2actionTransition);
//                   // Do not emit the disableSignal when the suspend trigger is not true any more!
//                   disabled2actionTransition.setType(TransitionType::STRONGABORT);
//               val action2runningTransition =  SCChartsFactory::eINSTANCE.createTransition();
//                   action2runningTransition.setTargetState(runningState);
//                   action2runningTransition.setLabel("#");
//                   action2runningTransition.setIsImmediate(true);
//                   action2runningTransition.setPriority(1);
//                   actionState.outgoingTransitions.add(action2runningTransition);
//               val running2disabledTransition =  SCChartsFactory::eINSTANCE.createTransition();
//                   running2disabledTransition.setTargetState(disabledState);
//                   running2disabledTransition.setIsImmediate(immediateSuspension);
//                   running2disabledTransition.setTrigger(suspendTrigger.copy);
//                   running2disabledTransition.setPriority(1);
//                   runningState.outgoingTransitions.add(running2disabledTransition);
//               
//               // Create a region with two states running and disabled and the intermediate entry-action-macro-state
//               val suspendActionRegion = SCChartsFactory::eINSTANCE.createRegion();
//               suspendActionRegion.setId("SuspendActionRegion" + state.hashCode);
//               suspendActionRegion.states.add(actionState);
//               suspendActionRegion.states.add(runningState);
//               suspendActionRegion.states.add(disabledState);
//               targetRootRegion.states.get(0).regions.add(suspendActionRegion);
//               
//
//            // Add disabled signal  to ALL hierarchically lower (immediate) transitions
//            // that appear INSIDE the considered state (in its regions)
//            var List<Transition> consideredTransitions = <Transition> newLinkedList;
//            for (region : state.regions) {
//               if (immediateSuspension) {
//                   // consider ALL transitions (also immediate ones)
//                   consideredTransitions.addAll(region.eAllContents().filter(typeof(Transition)).toList());
//               } else {
//                   // consider only NON-immediate transitions
//                   consideredTransitions.addAll(region.eAllContents().filter(typeof(Transition)).filter(e | !e.isImmediate).toList());
//               }
//            } 
//            
//            for (consideredTransition : ImmutableList::copyOf(consideredTransitions)) {
//                val disabledSignalRef = KExpressionsFactory::eINSTANCE.createValuedObjectReference
//                    disabledSignalRef.setValuedObject(disabledSignal);
//                val disabledExpression = buildDisabledExpression(consideredTransition.trigger, 
//                                                                 disabledSignalRef);
//                consideredTransition.setTrigger(disabledExpression);
//            }
//        } // if any suspension there
//    }
//    
//
//    //-------------------------------------------------------------------------
//    //--                        H I S T O R Y                                --
//    //-------------------------------------------------------------------------
//    // @requires: suspend
//    
//    // Transforming History. This is using the concept of suspend so it must
//    // be followed by resolving suspension
//    def Region transformHistory(Region rootRegion) {
//        // Clone the complete SCCharts region 
//        val targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
//        var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).toList();
//
//        // For every state in the SyncChart do the transformation
//        // Iterate over a copy of the list
//        // The following can also be written functional:
//        //        ImmutableList::copyOf(targetStates).forEach[
//        //             it.transformHistory(targetRootRegion);
//        //        ]
//        for(targetState :  ImmutableList::copyOf(targetStates)) {
//            // This statement we want to modify
//            targetState.transformHistory(targetRootRegion);
//        }
//        
//        targetRootRegion;
//    }
//        
//        
//    // Traverse all states and transform macro states that have connecting
//    // (incoming) history transitions.    
//    def void transformHistory(State state, Region targetRootRegion) {
//        val historyTransitions = ImmutableList::copyOf(state.incomingTransitions.filter(e | e.isHistory));
//        val nonHistoryTransitions = ImmutableList::copyOf(state.incomingTransitions.filter(e | !e.isHistory));
//        val allTransitions = ImmutableList::copyOf(state.incomingTransitions);
//        
//        if (historyTransitions != null && historyTransitions.size > 0 
//            && state.regions != null && state.regions.size > 0) {
//            // Put the inside of the state (all inner regions) into
//            // a NEW state of a NEW region in parallel to the one before
//            val auxiliaryRegion = SCChartsFactory::eINSTANCE.createRegion()
//            val auxiliaryState  = SCChartsFactory::eINSTANCE.createState();
//            auxiliaryState.setId(state.id + "History");
//            auxiliaryState.setLabel(state.id + "History");
//            auxiliaryState.setIsInitial(true);
//            
//            // Move local signal declaration to auxiliary state (test 139)
//            auxiliaryState.signals.addAll(state.signals);
//            
//            // Move all regions to new auxiliary State
//            for (region : ImmutableList::copyOf(state.regions)) {
//                auxiliaryState.regions.add(region)
//            }
//            state.regions.removeAll(auxiliaryState.regions);
//            
//            // Auxiliary state gets suspended by NOT auxiliary signal
//            val auxiliarySuspendSignal = KExpressionsFactory::eINSTANCE.createSignal();
//            val auxiliarySuspendSignalUID = state.id + "Execute";
//            auxiliarySuspendSignal.setName(auxiliarySuspendSignalUID);
//            auxiliarySuspendSignal.setIsInput(false);
//            auxiliarySuspendSignal.setIsOutput(false);
//            auxiliarySuspendSignal.setType(ValueType::PURE);
//
//            // Add auxiliarySignal to first (and only) root region state SCCharts main interface
//            targetRootRegion.states.get(0).signals.add(auxiliarySuspendSignal);
//            
//            var Expression suspensionTrigger;
//                val notAuxiliaryTrigger = KExpressionsFactory::eINSTANCE.createOperatorExpression;
//                    notAuxiliaryTrigger.setOperator(OperatorType::NOT);
//                val auxiliarySignalRef = KExpressionsFactory::eINSTANCE.createValuedObjectReference
//                    auxiliarySignalRef.setValuedObject(auxiliarySuspendSignal);
//                    notAuxiliaryTrigger.subExpressions.add(auxiliarySignalRef);
//            if (state.suspensionTrigger != null) {
//                // If there already is a suspension trigger than combine it with OR
//                val suspensionTrigger2 = KExpressionsFactory::eINSTANCE.createOperatorExpression;
//                    suspensionTrigger2.setOperator(OperatorType::OR);
//                    suspensionTrigger2.subExpressions.add(notAuxiliaryTrigger);
//                    suspensionTrigger2.subExpressions.add(state.suspensionTrigger.trigger);
//                suspensionTrigger = suspensionTrigger2;
//            }
//            else {
//                // If there is not already a suspension trigger we use the simpler case
//                suspensionTrigger = notAuxiliaryTrigger;
//            }
//            
//            // Add a dummy suspension action
//            val suspensionAction = SCChartsFactory::eINSTANCE.createAction;
//            suspensionAction.setTrigger(suspensionTrigger);
//            auxiliaryState.setSuspensionTrigger(suspensionAction);
//            
//            // Add the NEW state to the NEW region and add the NEW region in parallel 
//            auxiliaryRegion.states.add(auxiliaryState);
//            state.parentRegion.parentState.regions.add(auxiliaryRegion);
//            
//            // For all history transitions now erase the history marker
//            for (historyTransition : historyTransitions) {
//                historyTransition.setIsHistory(false);
//            }
//            
//            // Add a self loop to the original state that emits the auxiliary signal
//            // forcing the internals NOT to suspend
//            val selfLoop = SCChartsFactory::eINSTANCE.createTransition();
//            selfLoop.setTargetState(state);
//            selfLoop.setPriority(state.outgoingTransitions.size + 1);
//            val auxiliaryEmission = SCChartsFactory::eINSTANCE.createEmission();
//                auxiliaryEmission.setSignal(auxiliarySuspendSignal);
//            //selfLoop.effects.add(auxiliaryEmission);
//            state.outgoingTransitions.add(selfLoop);
//            
//            // Add auxiliary signal forcing internals NOT to suspend to all
//            // outgoing WEAK abort transitions (consider NORMAL termination as weak aborts)
//            val weakAbortTransitions = ImmutableList::copyOf(state.outgoingTransitions.filter(e | e.type != TransitionType::STRONGABORT));
//            for (weakAbortTransition : weakAbortTransitions) {
//                val auxiliaryEmission2 = SCChartsFactory::eINSTANCE.createEmission();
//                    auxiliaryEmission2.setSignal(auxiliarySuspendSignal);
//                weakAbortTransition.effects.add(auxiliaryEmission2);
//            }
//
//            //---
//
//            // Re-entry of a history state: Emit a second auxiliaryEntrySignal
//            // and wait in all inner simple states with an additional self loop on
//            // this signal.  
//            
//            // Auxiliary suspend re-entry signal
//            val auxiliaryEntrySignal = KExpressionsFactory::eINSTANCE.createSignal();
//            val auxiliaryEntrySignalUID = state.id + "Entry";
//            auxiliaryEntrySignal.setName(auxiliaryEntrySignalUID);
//            auxiliaryEntrySignal.setIsInput(false);
//            auxiliaryEntrySignal.setIsOutput(false);
//            auxiliaryEntrySignal.setType(ValueType::PURE);
//            // Add auxiliarySignal to first (and only) root region state SCCharts main interface
//            targetRootRegion.states.get(0).signals.add(auxiliaryEntrySignal);
//
//
//            // For all incoming transitions now add a suspendSignal emission (to immediately enable the execution of the body)
//            // also for all history transitions (re-entry) add an entrySignal emission to (in most times) disabled outgoing transitions that are NOT immediate
//            for (incomingTransition : allTransitions) {
//                val auxiliarySuspendEmission = SCChartsFactory::eINSTANCE.createEmission();
//                    auxiliarySuspendEmission.setSignal(auxiliarySuspendSignal);
//                incomingTransition.effects.add(auxiliarySuspendEmission);
//            }
//            for (historyTransition : historyTransitions) {
//                   val auxiliaryEntryEmission = SCChartsFactory::eINSTANCE.createEmission();
//                       auxiliaryEntryEmission.setSignal(auxiliaryEntrySignal);
//                   historyTransition.effects.add(auxiliaryEntryEmission);
//            }
//            
//            // ...disabled outgoing transitions that are NOT immediate (s.a.)
//            val innerStates = ImmutableList::copyOf(auxiliaryState.eAllContents.filter(typeof(State)));
//            for (innerState : innerStates) {
//                for (outgoingTransition : ImmutableList::copyOf(innerState.outgoingTransitions.filter(e | !e.isImmediate))) {
//                   val auxiliaryEntrySignalRef = KExpressionsFactory::eINSTANCE.createValuedObjectReference
//                       auxiliaryEntrySignalRef.setValuedObject(auxiliaryEntrySignal);
//                    val disabledExpression = buildDisabledExpression(outgoingTransition.trigger, 
//                                                                     auxiliaryEntrySignalRef);
//                    outgoingTransition.setTrigger(disabledExpression);
//                }
//            }
//
//            //---
//            
//            // For resetting the inner states when entering by a normal transition
//            // add a reset signal and emit it when entering.
//            // On entering also all local (valued) signals will be reset automatically.
//            val auxiliaryResetSignal = KExpressionsFactory::eINSTANCE.createSignal();
//            val auxiliaryResetSignalUID = state.id + "Reset";
//            auxiliaryResetSignal.setName(auxiliaryResetSignalUID);
//            auxiliaryResetSignal.setIsInput(false);
//            auxiliaryResetSignal.setIsOutput(false);
//            auxiliaryResetSignal.setType(ValueType::PURE);
//
//            // Add auxiliarySignal to first (and only) root region state SCCharts main interface
//            targetRootRegion.states.get(0).signals.add(auxiliaryResetSignal);
//            
//            // Add a self loop to the NEW state that resets it if auxiliary reset signal is present
//            val resetSelfLoop = SCChartsFactory::eINSTANCE.createTransition();
//            resetSelfLoop.setTargetState(auxiliaryState);
//            resetSelfLoop.setPriority(1);
//            resetSelfLoop.setType(TransitionType::STRONGABORT);
//                val auxiliaryResetSignalRef = KExpressionsFactory::eINSTANCE.createValuedObjectReference
//                    auxiliaryResetSignalRef.setValuedObject(auxiliaryResetSignal);
//            resetSelfLoop.setTrigger(auxiliaryResetSignalRef);
//            auxiliaryState.outgoingTransitions.add(resetSelfLoop);
//            
//            // For all non-history transitions now add a resetSignal emission
//            for (nonHistoryTransition : nonHistoryTransitions) {
//                val auxiliaryResetEmission = SCChartsFactory::eINSTANCE.createEmission();
//                    auxiliaryResetEmission.setSignal(auxiliaryResetSignal);
//                nonHistoryTransition.effects.add(auxiliaryResetEmission);
//            }
//            
//        }
//    }
//    
//         
//    //-------------------------------------------------------------------------
//    //--                     D U R I N G       A C T I O N S                 --
//    //-------------------------------------------------------------------------
//    
//    // Transforming During Actions.
//    def Region transformDuringAction(Region rootRegion) {
//        // Clone the complete SCCharts region 
//        val targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
//        var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).toList();
//
//        for(targetState : ImmutableList::copyOf(targetStates)) {
//            // This statement we want to modify
//            targetState.transformDuringAction(targetRootRegion);
//        }
//        
//        targetRootRegion;
//    }
//    
//    // Traverse all states and transform macro states that have actions to transform
//    def void transformDuringAction(State state, Region targetRootRegion) {
//        // DURING ACTIONS : 
//        // For each action create a separate region in the state. 
//        // Put the action into an transition within the macro state.
//        // Add a loop back to the initial state of the added region.
//        // In case the during action is immediate, the looping transition is non-immediate.
//        // In case the during action is non-immediate, the looping transition is immediate.
//        if (state.innerActions != null && state.innerActions.size > 0) {
//               // Create the body of the dummy state - containing the during action
//               // For every during action: Create a region
//               for (innerAction : state.innerActions) {
//                     val dummyInternalState1 = SCChartsFactory::eINSTANCE.createState();
//                     val dummyInternalState2 = SCChartsFactory::eINSTANCE.createState();
//                     dummyInternalState1.setId("During1Internal" + state.hashCode);
//                     dummyInternalState1.setLabel("i");
//                     dummyInternalState1.setIsInitial(true);
//                     dummyInternalState2.setId("During2Internal" + state.hashCode);
//                     dummyInternalState2.setLabel("f");
//                     // Add action dummyTransition
//                     val dummyInternalTransition =  SCChartsFactory::eINSTANCE.createTransition();
//                     dummyInternalTransition.setTargetState(dummyInternalState2);
//                     dummyInternalTransition.setPriority(1);
//                     dummyInternalTransition.setDelay(innerAction.delay);
//                     dummyInternalTransition.setIsImmediate(innerAction.isImmediate);
//                     dummyInternalTransition.setTrigger(innerAction.trigger.copy);
//                     for (action : innerAction.effects) {
//                        dummyInternalTransition.effects.add(action.copy);
//                     }
//                     dummyInternalState1.outgoingTransitions.add(dummyInternalTransition);
//                     // Add self loop
//                     val dummyInternalLoopTransition = SCChartsFactory::eINSTANCE.createTransition();
//                     dummyInternalLoopTransition.setTargetState(dummyInternalState1);
//                     dummyInternalLoopTransition.setPriority(1);
//                     dummyInternalLoopTransition.setIsImmediate(!innerAction.isImmediate);
//                     if (!innerAction.isImmediate) {
//                         dummyInternalLoopTransition.setLabel("#");
//                     }
//                     dummyInternalLoopTransition.setType(TransitionType::WEAKABORT);
//                     dummyInternalState2.outgoingTransitions.add(dummyInternalLoopTransition);
//                     // Add the region to the state
//                     val dummyInternalRegion = SCChartsFactory::eINSTANCE.createRegion();
//                     dummyInternalRegion.setId("DuringDummyRegion" + innerAction.hashCode);
//                     dummyInternalRegion.states.add(dummyInternalState1);
//                     dummyInternalRegion.states.add(dummyInternalState2);
//                     state.regions.add(dummyInternalRegion);
//               }
//         
//               // After transforming during actions, erase them
//               state.innerActions.clear();
//       }
//    }
//
//    
//    //-------------------------------------------------------------------------
//    //--                     E N T R Y         A C T I O N S                 --
//    //-------------------------------------------------------------------------
//    // @requires: during actions
//
//    // Transforming Entry and During Actions.
//    def Region transformEntryAction(Region rootRegion) {
//        // Clone the complete SCCharts region 
//        val targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
//        var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).toList();
//
//        for(targetState : ImmutableList::copyOf(targetStates)) {
//            // This statement we want to modify
//            targetState.transformEntryAction(targetRootRegion);
//        }
//        
//        targetRootRegion;
//    }
//        
//    // Traverse all states and transform macro states that have actions to transform
//    def void transformEntryAction(State state, Region targetRootRegion) {
//        // ENTRY ACTIONS :
//        // First Idea: Create a macro state for all incoming transitions. Weak abort the
//        // macro state and connect it to the original target. Put the action into an
//        // transition within the macro state.
//        //
//        // Charles Andre: "Immediate abortions may cause instantaneous abortion of the state.
//        // In this case the status stays IDLE, the transition is taken, DONE is returned: the
//        // state is by-passed. If there is not an immediate strong abortion, then the state is 
//        // effectively entered, and the entry actions are performed."
//        //
//        // This means that entry actions must be immediately-strong-abortable by the original outgoing
//        // transitions.
//        //
//        // We create a new macro state EntrySurround around the original state, and connect the incoming and
//        // outgoing transitions to it. Within the new macro state, we then create an initial state
//        // with the entry actions as during actions. Then we connect this initial state to the
//        // original state with an immediate (true triggered) transition.
//        if (state.entryActions != null && state.entryActions.size > 0) {
//                val surroundState = SCChartsFactory::eINSTANCE.createState();
//                surroundState.setId("EntrySurround" + state.hashCode);
//                surroundState.setLabel("EntrySurround " + state.label);
//                state.parentRegion.states.add(surroundState);
//                // If the original state is an initial stat then the new surround state must also be
//                // marked to be initial
//                surroundState.setIsInitial(state.isInitial);
//                // Move transitions to the new state
//                for (transition : ImmutableList::copyOf(state.incomingTransitions)) {
//                    surroundState.incomingTransitions.add(transition);
//                }
//                for (transition : ImmutableList::copyOf(state.outgoingTransitions)) {
//                    surroundState.outgoingTransitions.add(transition);
//                }
//                state.incomingTransitions.clear();
//                state.outgoingTransitions.clear();
//                // Move original state into new state
//                val surroundRegion = SCChartsFactory::eINSTANCE.createRegion();
//                surroundRegion.setId("EntrySurroundRegion" + state.hashCode);
//                surroundState.regions.add(surroundRegion);
//                surroundRegion.states.add(state);
//                
//                // Create initial state add it to the surround state
//                val initialState  = SCChartsFactory::eINSTANCE.createState();
//                val initialTransition =  SCChartsFactory::eINSTANCE.createTransition();
//                initialState.setId("init" + state.hashCode);
//                initialState.setLabel("init " + state.label);
//                initialTransition.setLabel("#");
//                initialTransition.setTargetState(state);
//                initialTransition.setPriority(1);
//                initialTransition.setIsImmediate(true);
//                initialState.setIsInitial(true);
//                state.setIsInitial(false);
//                initialState.outgoingTransitions.add(initialTransition);
//                surroundRegion.states.add(initialState);
//                
//                // Create the body of the dummy state - containing the entry action
//                // For every entry action: Create a region
//                for (entryAction : state.entryActions) {
//                    val entryActionCopy = entryAction.copy;
//                    entryActionCopy.setIsImmediate(true);
//                    // Create during actions for the initial state
//                    initialState.innerActions.add(entryActionCopy);
//                }
//
//                // After transforming entry actions, erase them
//                state.entryActions.clear();
//       }
//    }
//
//
//    //-------------------------------------------------------------------------
//    //--                      E X I T       A C T I O N S                    --
//    //-------------------------------------------------------------------------
//    // @requires: entry actions
//    // @requires: during actions
//    // @requires: suspend
//    // @requires: valued signals
//
//    // Helper function to gather all hierarchically higher outgoing transitions
//    // for an inner state.
//    def List<Transition> hierarchicallyHigherOutgoingTransitions(State state) {
//        val List<Transition> returnTransitions = <Transition> newLinkedList;
//        
//        for (transition : state.outgoingTransitions) {
//           returnTransitions.add(transition);
//        }
//        
//        if (state.parentRegion != null) {
//            if (state.parentRegion.parentState != null) {
//                 val transitionListFromAbove 
//                          = state.parentRegion.parentState.hierarchicallyHigherOutgoingTransitions;  
//                 returnTransitions.addAll(transitionListFromAbove);
//            }
//        }
//        
//        return returnTransitions;     
//    }
//    
//    // Transforming Exit Actions. 
//    def Region transformExitAction(Region rootRegion) {
//        // Clone the complete SCCharts region 
//        val targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
//        var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).toList();
//
//        for(targetState :  ImmutableList::copyOf(targetStates)) {
//            // This statement we want to modify
//            targetState.transformExitAction(targetRootRegion);
//        }
//        
//        targetRootRegion;
//    }
//           
//           
//   // For a state, have a look at all outgoing transition weak abort triggers and collect them
//   // OR them together and do this hierarchically to the outside.        
//   def Expression getDisjunctionOfAllHierachicallyOutgoingWeakAborts(State state) {
//       val returnExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression();
//       val expressionList = state.getDisjunctionOfAllHierachicallyOutgoingWeakAbortsHelper;
//       returnExpression.setOperator(OperatorType::OR);
//       if (expressionList.size == 0) {
//           return null;
//       }
//       else if (expressionList.size == 1) {
//           return expressionList.head;
//       }
//       else {
//          for (expression : expressionList) {
//             if (expression != null) {
//                returnExpression.subExpressions.add(expression);
//             }
//          }
//          return returnExpression;
//       }
//   }
//   def List<Expression> getDisjunctionOfAllHierachicallyOutgoingWeakAbortsHelper(State state) {
//       var List<Expression> expressionList = <Expression> newLinkedList;
//       val outgoingTransitions = state.outgoingTransitions.filter(e|e.type == TransitionType::WEAKABORT);
//       for (outgoingTransition : outgoingTransitions) {
//          expressionList.add(outgoingTransition.trigger.copy);
//       }
//       // collect from higher hierarchy level
//       if (state.parentRegion != null && state.parentRegion.parentState != null) {
//           expressionList.addAll(state.parentRegion.parentState.getDisjunctionOfAllHierachicallyOutgoingWeakAbortsHelper);
//       }
//       expressionList;
//   }       
//   
//   // Tries to follow immediate chains of transitions in order to exclude possible self loops
//   def boolean isPossibleSelfLoop(Transition transition) {
//       return isPossibleSelfLoop(transition, transition.sourceState);
//   }    
//   def boolean isPossibleSelfLoop(Transition transition, State startState) {
//       var boolean isLoop = false;
//       for (Transition nextTransition : transition.targetState.outgoingTransitions.filter(e | e.isImmediate)) {
//           isLoop = isLoop || nextTransition.isPossibleSelfLoop(startState);
//       }
//       isLoop = isLoop || (transition.targetState == startState);
//       return isLoop;
//   }    
//           
//    // Traverse all states and transform macro states that have actions to transform
//    def void transformExitAction(State state, Region targetRootRegion) {
//        // EXIT ACTIONS : For every state with exit actions create a new top-level region and
//        // create SET and RESET signals. This region contains a set and reset (inital) state
//        // connected from reset to set with an intermediate macro state containing all the
//        // exit actions and labeled with SET and not RESET. Another arc from set to reset labeled
//        // with RESET. A self-arc from reset labeled with SET and RESET.
//        // Every transition considered to be outgoing in any way emits the SET signal.
//        // The entry action emits the RESET signal.
//        // The state in question must have an immediate during action, resetting (emit RESET), BUT
//        // important is that this is triggered and the trigger is excluded hierarchically by ALL
//        // possibly outgoing transitions to the outside that are weak (in this case we do not want
//        // to reset because we know we leave the state and want to remember the exiting 
//        // (and NOT reset!!!) 
//         //
//        // DEPRECATED IDEA (has drawbacks, see below)
//        // Create a macro state for all outgoing non-preempting(!) transitions. 
//        // Weak abort the macro state and connect it to the original target. Put the action into an
//        // transition within the macro state.
//        //
//        // From Charles Andre, Semantics of SCCharts: Note that strong and weak abortions have the
//        // same effect on exit actions. This explains why exit actions are primitive constructs: they 
//        // cannot be expressed by a combination of the already studied constructs.
//        //
//        // Chris Motika: In other words, if an exit action is inside some hierarchical states and an
//        // outer state is left by a strong preemption, surprisingly the exit action is still
//        // executed.
//        // To resolve this, we need to figure out ALL hierarchically outgoing strong preemption transition
//        // and add the action also there. For weak preemption transitions we do not need to do this 
//        // because the action from inside is allowed to take place as the "last wish".
//        //
//        // FLAW I: When re-entering one has to give precedence to reset but when exiting one wants
//        // to giv precedence to set. => Valued signals are too limited, more preciseley the combine
//        // function of valued signals. Better use a two state representation.
//        //
//        // FLAW II: When transforming a history transition with suspend, when re-entering,
//        // entry actions are currently not executed again (propably they should?! FIXME: find out about
//        // entry actions & history transitions). If using sustain actions this problem is solved BUT another
//        // one arises. In the same state there will be a set and reset. Giving precedence to reset this
//        // will result in calling the exit action AGAIN if the state is left outside.
//        // 
//        if (state.exitActions != null && state.exitActions.size > 0) {
//               var List<Transition> consideredTransitions = <Transition> newLinkedList;
//               consideredTransitions.addAll(state.hierarchicallyHigherOutgoingTransitions);
//               
//               // Add SET and SETI and RESETI and RESETN signal signal flag 
//               val setSignal = KExpressionsFactory::eINSTANCE.createSignal();
//               setSignal.setName("Set" + state.id);
//               setSignal.setIsInput(false);
//               setSignal.setIsOutput(false);
//               setSignal.setType(ValueType::PURE);
//               targetRootRegion.states.get(0).signals.add(setSignal);
//
//               // This signal is produced by ALL immediate outputs (also hierarchically higher)
//               // it is able to trigger an immediate transition back from reset to set (when entering reset)
//               // set ---> reset -#-> set
//               val setISignal = KExpressionsFactory::eINSTANCE.createSignal();
//               setISignal.setName("SetI" + state.id);
//               setISignal.setIsInput(false);
//               setISignal.setIsOutput(false);
//               setISignal.setType(ValueType::PURE);
//               targetRootRegion.states.get(0).signals.add(setISignal);
//               
//               val resetISignal = KExpressionsFactory::eINSTANCE.createSignal();
//               resetISignal.setName("ResetI" + state.id);
//               resetISignal.setIsInput(false);
//               resetISignal.setIsOutput(false);
//               resetISignal.setType(ValueType::PURE);
//               targetRootRegion.states.get(0).signals.add(resetISignal);
//
//               val resetNSignal = KExpressionsFactory::eINSTANCE.createSignal();
//               resetNSignal.setName("ResetN" + state.id);
//               resetNSignal.setIsInput(false);
//               resetNSignal.setIsOutput(false);
//               resetNSignal.setType(ValueType::PURE);
//               targetRootRegion.states.get(0).signals.add(resetNSignal);
//               
//               // Add a Set and Reset state
//               val resetState = SCChartsFactory::eINSTANCE.createState();
//               resetState.setId("ExitReset" + state.hashCode);
//               resetState.setLabel("r");
//               val setState = SCChartsFactory::eINSTANCE.createState();
//               setState.setId("ExitSet" + state.hashCode);
//               // The Set state has to be the initial state
//               setState.setIsInitial(true);
//               setState.setLabel("s");
//               
//
//               // Connect Set and Reset States with transitions (s.a. for a more detailed explanation)
//               val reset2setTransition =  SCChartsFactory::eINSTANCE.createTransition();
//                   reset2setTransition.setTargetState(setState);
//                   resetState.outgoingTransitions.add(reset2setTransition);
//               val reset2setITransition =  SCChartsFactory::eINSTANCE.createTransition();
//                   reset2setITransition.setTargetState(setState);
//                   resetState.outgoingTransitions.add(reset2setITransition);
//               val set2resetTransition =  SCChartsFactory::eINSTANCE.createTransition();
//                   set2resetTransition.setTargetState(resetState);
//                   setState.outgoingTransitions.add(set2resetTransition);
//               val set2setTransition =  SCChartsFactory::eINSTANCE.createTransition();
//                   set2setTransition.setTargetState(setState);
//                   setState.outgoingTransitions.add(set2setTransition);
//
//               // Build triggers for transitions 
//               // (A) set -- ResetI --> reset
//               // (B) set -- Set and ResetI and ResetN --> set (means started in C, ending in C by outputting O)
//               // (C) reset -- Set --> set (means starting NOT in C, ending in C by outputting O)
//               // (D) reset -- #SetI --> set (possibly a chain coming from inside set and ending in inside set over transient reset)
//               val setSignalReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
//                   setSignalReference.setValuedObject(setSignal);
//               val setISignalReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
//                   setISignalReference.setValuedObject(setISignal);
//               val resetISignalReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
//                   resetISignalReference.setValuedObject(resetISignal);
//               val resetNSignalReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
//                   resetNSignalReference.setValuedObject(resetNSignal);
//               val andExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression;
//                   andExpression.setOperator(OperatorType::AND);
//               
//               // (A)
//               set2resetTransition.setTrigger(resetISignalReference.copy);
//               set2resetTransition.setPriority(2); // Set a LOWER prio than set to set (B)
//               
//               // (B)
//               val set2setTrigger = andExpression.copy;
//                   val set2setTrigger2 = andExpression.copy;
//                       set2setTrigger2.subExpressions.add(setSignalReference.copy);
//                       set2setTrigger2.subExpressions.add(resetISignalReference.copy);
//                   set2setTrigger.subExpressions.add(set2setTrigger2);
//                   set2setTrigger.subExpressions.add(resetNSignalReference.copy);
//               set2setTransition.setTrigger(set2setTrigger);
//               set2setTransition.setPriority(1); // Set a HIGHER prio than set to reset (A)
//               
//               // (C)
//               reset2setTransition.setTrigger(setSignalReference.copy);
//               reset2setTransition.setPriority(2);
//               
//               // (D)
//               reset2setITransition.setTrigger(setISignalReference.copy);
//               reset2setITransition.setIsImmediate(true);
//               reset2setITransition.setPriority(1);
//               
//               // Create a region with two states set and reset 
//               val exitActionRegion = SCChartsFactory::eINSTANCE.createRegion();
//               exitActionRegion.setId("ExitActionRegion" + state.hashCode);
//               exitActionRegion.states.add(resetState);
//               exitActionRegion.states.add(setState);
//               targetRootRegion.states.get(0).regions.add(exitActionRegion);
//               
//               // Create conditioned sustain and actions for Set state containing the exit actions
//               // For every exit action: Create a during and entry action for Set state
//               // the entry action is triggered by Set
//               // the during action is triggered by Set and ResetI and ResetN
//               for (exitAction : state.exitActions) {
//                     val entryAction  = exitAction.copy;
//                     entryAction.setIsImmediate(true);
//                     var entryActionTrigger = KExpressionsFactory::eINSTANCE.createOperatorExpression;
//                         entryActionTrigger.setOperator(OperatorType::AND);
//                         entryActionTrigger.subExpressions.add(setSignalReference.copy); // (C)
//                         if (entryAction.trigger != null) {
//                             entryActionTrigger.subExpressions.add(entryAction.trigger);
//                             entryAction.setTrigger(entryActionTrigger);
//                         } else {
//                             entryAction.setTrigger(setSignalReference.copy);
//                         }
//                     setState.entryActions.add(entryAction);
//
//                     val duringAction = exitAction.copy;
//                     duringAction.setIsImmediate(true);
//                     var duringActionTrigger = KExpressionsFactory::eINSTANCE.createOperatorExpression;
//                         duringActionTrigger.setOperator(OperatorType::AND);
//                         duringActionTrigger.subExpressions.add(set2setTrigger.copy); // (B)
//                         if (duringAction.trigger != null) {
//                             duringActionTrigger.subExpressions.add(duringAction.trigger);
//                             duringAction.setTrigger(duringActionTrigger);
//                         } else {
//                             duringAction.setTrigger(set2setTrigger.copy);
//                         }
//                     setState.innerActions.add(duringAction);
//               }               
//
//
//               // CORNER CASE: 78 & 79 (also 80)
//               // Execute ExitAction if permanent PREEMPTIVE reset is present.
//               // DO NOT execute when was left before.
//               val strongAbortSelfLoopPresent = consideredTransitions.filter(e | e.type == TransitionType::STRONGABORT && e.isPossibleSelfLoop);
//               val cornerCaseTransition = consideredTransitions.filter(e | !e.isPossibleSelfLoop);
//               if (strongAbortSelfLoopPresent.size > 0) {
//                 // Create SetInner signal only for outgoing transitions that are no self loops
//                 // this includes also possible chains of immediate transitions
//                 // Optimization: only consider strong aborts, because for weak aborts 78 is not a problem!
//                 val setSignalInner = KExpressionsFactory::eINSTANCE.createSignal();
//                 setSignalInner.setName("SetInner" + state.id);
//                 setSignalInner.setIsInput(false);
//                  setSignalInner.setIsOutput(false);
//                  setSignalInner.setType(ValueType::PURE);
//                  targetRootRegion.states.get(0).signals.add(setSignalInner);
//                  val setSignalInnerReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
//                     setSignalInnerReference.setValuedObject(setSignalInner);
//                 //Create In state and Out state
//                 val inState = SCChartsFactory::eINSTANCE.createState();
//                 inState.setId("ExitIn" + state.hashCode);
//                 inState.setIsInitial(true);
//                 inState.setLabel("in");
//                 val outState = SCChartsFactory::eINSTANCE.createState();
//                 outState.setId("ExitOut" + state.hashCode);
//                 outState.setLabel("out");
//                 // Connect In and Out states with transitions triggered #SetCC
//                 val in2outTransition =  SCChartsFactory::eINSTANCE.createTransition();
//                     in2outTransition.setTargetState(outState);
//                     in2outTransition.setIsImmediate(true);
//                     inState.outgoingTransitions.add(in2outTransition);
//                     in2outTransition.setTrigger(setSignalInnerReference.copy);
//                 // Create InOut region    
//                 val setInOutRegion = SCChartsFactory::eINSTANCE.createRegion();
//                 setInOutRegion.setId("ExitInOutRegion" + state.hashCode);
//                 setInOutRegion.states.add(inState);
//                 setInOutRegion.states.add(outState);
//                 setState.regions.add(setInOutRegion);
//                 // Add emission to corner case transitions 
//                 for (transition : cornerCaseTransition) {
//                     val setEmission = SCChartsFactory::eINSTANCE.createEmission();
//                          setEmission.setSignal(setSignalInner);
//                     transition.effects.add(setEmission);
//                  }
//                 // Add during action for inState
//                 val duringIActionResetSignalN = SCChartsFactory::eINSTANCE.createAction();
//                 val resetNEmission2 = SCChartsFactory::eINSTANCE.createEmission();
//                 resetNEmission2.setSignal(resetNSignal);
//                 duringIActionResetSignalN.effects.add(resetNEmission2);
//                 inState.innerActions.add(duringIActionResetSignalN);
//               } // End corner case
//
//               
//               // Add a during action that resets the exit action
//               // more specifically add an immediate during action for resetI
//               //                   and a  normal during action for resetN
//               val duringIAction = SCChartsFactory::eINSTANCE.createAction();
//               duringIAction.setIsImmediate(true);
//               val resetIEmission = SCChartsFactory::eINSTANCE.createEmission();
//                   resetIEmission.setSignal(resetISignal);
//               duringIAction.effects.add(resetIEmission);
//               val duringNAction = SCChartsFactory::eINSTANCE.createAction();
//               val resetNEmission = SCChartsFactory::eINSTANCE.createEmission();
//                   resetNEmission.setSignal(resetNSignal);
//               duringNAction.effects.add(resetNEmission);
//               state.innerActions.add(duringIAction);
//               state.innerActions.add(duringNAction);
//               
//               
//// André says: Do not execute exitActions if the state is bypassed (by an enabled immediate strong abort)
//// Hence, the following is incorrect.                
////               // For every incoming transitions add a ResetI emission
////               // (if the state is an initial state, then add another initial state before and
////               // connect both with an immediate true triggered transition)
////               if (state.isInitial) {
////                   val newInitialState = SCChartsFactory::eINSTANCE.createState();
////                   newInitialState.setId("initial" + state.hashCode);
////                   newInitialState.setLabel("i");
////                   newInitialState.setIsInitial(true);
////                   state.setIsInitial(false);
////                   state.parentRegion.states.add(newInitialState);
////                   val immediateTransition =  SCChartsFactory::eINSTANCE.createTransition();
////                   immediateTransition.setIsImmediate(true);
////                   immediateTransition.setLabel("#");
////                   immediateTransition.setTargetState(state);
////                   newInitialState.outgoingTransitions.add(immediateTransition);
////               }
////               for (incomingTransition : ImmutableList::copyOf(state.incomingTransitions)) {
////                   incomingTransition.effects.add(resetIEmission.copy);
////               }
//               
//  
//               for (transition : consideredTransitions) {
//                   // For every considered transition add an emission of the set signal
//                   // that will result in executing the exit action if it was not
//                   // previously executed.
//                   val setEmission = SCChartsFactory::eINSTANCE.createEmission();
//                       setEmission.setSignal(setSignal);
//                   transition.effects.add(setEmission);
//                }
//                
//               for (transition : consideredTransitions.filter(e | e.isImmediate)) {
//                   // For every considered immediate transition add an emission of the setI signal
//                   val setIEmission = SCChartsFactory::eINSTANCE.createEmission();
//                       setIEmission.setSignal(setISignal);
//                   transition.effects.add(setIEmission);
//                }
//                
//                
//                // After transforming exit actions, erase them
//                state.exitActions.clear();
//       }
//       
//    }
//           
//           
//    //-------------------------------------------------------------------------
//    //--                        P R E -  O P E R A T O R                     --
//    //-------------------------------------------------------------------------
//           
//    // Transforming PRE Operator.
//    def Region transformPreOperator(Region rootRegion) {
//        // Clone the complete SCCharts region 
//        val targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
//        var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).toList();
//
//        for(targetState : ImmutableList::copyOf(targetStates)) {
//            // This statement we want to modify
//            targetState.transformPreOperator(targetRootRegion);
//        }
//        
//        targetRootRegion;
//    }
//
//    // Return a list of Pre Expressions for an action that references the signal
//    def List<OperatorExpression> getPreExpression(Action action, Signal signal) {
//        val List<OperatorExpression> returnPreExpressions = <OperatorExpression> newLinkedList;
//        val preExpressions = action.eAllContents.filter(typeof(OperatorExpression)).toList().filter(e | 
//            (e.operator == OperatorType::PRE) && 
//            (e.subExpressions.size() == 1) &&  
//            (e.subExpressions.get(0) instanceof ValuedObjectReference) &&
//            ((e.subExpressions.get(0) as ValuedObjectReference).valuedObject == signal)
//        );
//        returnPreExpressions.addAll(preExpressions);
//        return returnPreExpressions;
//    }
//
//    // Return a list of Pre Expressions for an action that references the value of a signal
//    def List<OperatorExpression> getPreValExpression(Action action, Signal signal) {
//        val List<OperatorExpression> returnPreValExpressions = <OperatorExpression> newLinkedList;
//        val preValExpressions = action.eAllContents.filter(typeof(OperatorExpression)).toList().filter(e | 
//            (e.operator == OperatorType::PRE) && 
//            (e.subExpressions.size() == 1) &&  
//            (e.subExpressions.get(0) instanceof OperatorExpression) &&
//            ((e.subExpressions.get(0) as OperatorExpression).operator == OperatorType::VAL) &&
//            ((e.subExpressions.get(0) as OperatorExpression).subExpressions.size() == 1) &&
//            ((e.subExpressions.get(0) as OperatorExpression).subExpressions.get(0) instanceof ValuedObjectReference) &&
//            (((e.subExpressions.get(0) as OperatorExpression).subExpressions.get(0) as ValuedObjectReference).valuedObject == signal)
//        );
//        returnPreValExpressions.addAll(preValExpressions);
//        return returnPreValExpressions;
//    }
//
//    
//    // Traverse all states that might declare a signal that is used with the PRE operator
//    def void transformPreOperator(State state, Region targetRootRegion) {
//        
//        // Filter all signals and retrieve those that are referenced
//        val allActions = state.eAllContents.filter(typeof(Action)).toList();
//        val allPreSignals = state.signals.filter (signal | allActions.filter(action | action.getPreExpression(signal).size > 0 || action.getPreValExpression(signal).size > 0).size > 0); 
//        
//        for (preSignal : ImmutableList::copyOf(allPreSignals)) {
//
//            // Create PreS / PreV
//            val explicitPreSignal = KExpressionsFactory::eINSTANCE.createSignal();
//            explicitPreSignal.setName("Pre" + preSignal.name);
//            explicitPreSignal.setIsInput(false);
//            explicitPreSignal.setIsOutput(false);
//            explicitPreSignal.setType(preSignal.type);
//            if (!preSignal.initialValue.nullOrEmpty) {
//                explicitPreSignal.setInitialValue(preSignal.initialValue);
//            }
//            // Add to the current state
//            state.signals.add(explicitPreSignal);
//
//            // PreSignal and ExplicitPreSignal References                
//            val explicitPreSignalReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
//                explicitPreSignalReference.setValuedObject(explicitPreSignal);
//            val preSignalReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
//                preSignalReference.setValuedObject(preSignal);
//            
//            // Add a Pre and NotPre state
//            val preState = SCChartsFactory::eINSTANCE.createState();
//            preState.setId("Pre" + preSignal.hashCode);
//            preState.setLabel("Pre");
//            val notPreState = SCChartsFactory::eINSTANCE.createState();
//            notPreState.setId("NotPre" + preSignal.hashCode);
//            notPreState.setIsInitial(true);
//            notPreState.setLabel("NotPre");       
//            
//            // Add a region     
//            val preRegion = SCChartsFactory::eINSTANCE.createRegion();
//            preRegion.setId("PreRegion" + preSignal.hashCode);
//            preRegion.states.add(preState);
//            preRegion.states.add(notPreState);
//            state.regions.add(preRegion);
//   
//            // Transitions         
//            val notPre2PreTransition =  SCChartsFactory::eINSTANCE.createTransition();
//            notPre2PreTransition.setTargetState(preState);
//            notPre2PreTransition.setPriority(1);
//            notPreState.outgoingTransitions.add(notPre2PreTransition);
//            val pre2NotPreTransition =  SCChartsFactory::eINSTANCE.createTransition();
//            pre2NotPreTransition.setPriority(2);
//            pre2NotPreTransition.setTargetState(notPreState);
//            preState.outgoingTransitions.add(pre2NotPreTransition);
//            
//            if (preSignal.type == ValueType::PURE) {
//                // Simple Signal Case
//                notPre2PreTransition.setTrigger(preSignalReference.copy);
//                val explicitPreSignalEmission = SCChartsFactory::eINSTANCE.createEmission();
//                    explicitPreSignalEmission.setSignal(explicitPreSignal);
//                val preSelfTransition =  SCChartsFactory::eINSTANCE.createTransition();
//                    preSelfTransition.setTargetState(preState);
//                    preSelfTransition.setPriority(1);
//                    preState.outgoingTransitions.add(preSelfTransition);
//                preSelfTransition.setTrigger(preSignalReference.copy);
//                // PreSignal emission must be added as an inner action
//                // to be decoupled from deciding for a specific transition (B is present or B is not present)
//                val explicitPreSignalEmissionAction = SCChartsFactory::eINSTANCE.createAction();
//                explicitPreSignalEmissionAction.effects.add(explicitPreSignalEmission.copy);
//                preState.innerActions.add(explicitPreSignalEmissionAction);
//                //preSelfTransition.effects.add(explicitPreSignalEmission.copy);
//                //pre2NotPreTransition.effects.add(explicitPreSignalEmission.copy);
//            }
//            else {
//                // Valued Signal Case
//                
//                // Additional PreB state
//                val preBState = SCChartsFactory::eINSTANCE.createState();
//                    preBState.setId("PreB" + preSignal.hashCode);
//                    preBState.setLabel("PreB");
//                preRegion.states.add(preBState);
//                
//                val preB2PreTransition =  SCChartsFactory::eINSTANCE.createTransition();
//                    preB2PreTransition.setTargetState(preState);
//                    preB2PreTransition.setPriority(1);
//                    preBState.outgoingTransitions.add(preB2PreTransition);
//                val preB2NotPreTransition =  SCChartsFactory::eINSTANCE.createTransition();
//                    preB2NotPreTransition.setTargetState(notPreState);
//                    preB2NotPreTransition.setPriority(2);
//                    preBState.outgoingTransitions.add(preB2NotPreTransition);
//                val pre2PreBTransition =  SCChartsFactory::eINSTANCE.createTransition();
//                    pre2PreBTransition.setTargetState(preBState);
//                    pre2PreBTransition.setPriority(1);
//                    preState.outgoingTransitions.add(pre2PreBTransition);
//                    
//                // Additional Signals                    
//                val explicitPre1Signal = KExpressionsFactory::eINSTANCE.createSignal();
//                explicitPre1Signal.setName("Pre1" + preSignal.name);
//                explicitPre1Signal.setIsInput(false);
//                explicitPre1Signal.setIsOutput(false);
//                explicitPre1Signal.setType(preSignal.type);
//                if (!preSignal.initialValue.nullOrEmpty) {
//                    explicitPre1Signal.setInitialValue(preSignal.initialValue);
//                }
//                state.signals.add(explicitPre1Signal);
//                val explicitPre2Signal = KExpressionsFactory::eINSTANCE.createSignal();
//                explicitPre2Signal.setName("Pre2" + preSignal.name);
//                explicitPre2Signal.setIsInput(false);
//                explicitPre2Signal.setIsOutput(false);
//                explicitPre2Signal.setType(preSignal.type);
//                if (!preSignal.initialValue.nullOrEmpty) {
//                    explicitPre2Signal.setInitialValue(preSignal.initialValue);
//                }
//                state.signals.add(explicitPre2Signal);
//                
//                // Transition triggers & effects
//                val explicitPre1SignalReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference
//                    explicitPre1SignalReference.setValuedObject(explicitPre1Signal);
//                val explicitPre2SignalReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference
//                    explicitPre2SignalReference.setValuedObject(explicitPre2Signal);
//                                    
//                val valPreExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression;
//                    valPreExpression.setOperator(OperatorType::VAL);   
//                    valPreExpression.subExpressions.add(preSignalReference.copy);             
//                val valExplicitPre1Expression = KExpressionsFactory::eINSTANCE.createOperatorExpression;
//                    valExplicitPre1Expression.setOperator(OperatorType::VAL);   
//                    valExplicitPre1Expression.subExpressions.add(explicitPre1SignalReference.copy);             
//                val valExplicitPre2Expression = KExpressionsFactory::eINSTANCE.createOperatorExpression;
//                    valExplicitPre2Expression.setOperator(OperatorType::VAL);   
//                    valExplicitPre2Expression.subExpressions.add(explicitPre2SignalReference.copy);             
//                
//                val explicitPreSignalEmissionFromPre1 = SCChartsFactory::eINSTANCE.createEmission();
//                    explicitPreSignalEmissionFromPre1.setSignal(explicitPreSignal);
//                    explicitPreSignalEmissionFromPre1.setNewValue(valExplicitPre1Expression.copy);
//                val explicitPreSignalEmissionFromPre2 = SCChartsFactory::eINSTANCE.createEmission();
//                    explicitPreSignalEmissionFromPre2.setSignal(explicitPreSignal);
//                    explicitPreSignalEmissionFromPre2.setNewValue(valExplicitPre2Expression.copy);
//                    
//                val explicitPre1SignalEmission = SCChartsFactory::eINSTANCE.createEmission();
//                    explicitPre1SignalEmission.setSignal(explicitPre1Signal);
//                    explicitPre1SignalEmission.setNewValue(valPreExpression.copy);
//                val explicitPre2SignalEmission = SCChartsFactory::eINSTANCE.createEmission();
//                    explicitPre2SignalEmission.setSignal(explicitPre2Signal);
//                    explicitPre2SignalEmission.setNewValue(valPreExpression.copy);
//                    
//                // PreSignal emission must be added as an inner action
//                // to be decoupled from deciding for a specific transition (B is present or B is not present)
//                val explicitPreSignalEmissionFromPre1Action = SCChartsFactory::eINSTANCE.createAction();
//                explicitPreSignalEmissionFromPre1Action.effects.add(explicitPreSignalEmissionFromPre1);
//                val explicitPreSignalEmissionFromPre2Action = SCChartsFactory::eINSTANCE.createAction();
//                explicitPreSignalEmissionFromPre2Action.effects.add(explicitPreSignalEmissionFromPre2);
//                preState.innerActions.add(explicitPreSignalEmissionFromPre1Action);
//                preBState.innerActions.add(explicitPreSignalEmissionFromPre2Action);
//                    
//                // Fill transitions
////                pre2NotPreTransition.effects.add(explicitPreSignalEmissionFromPre1.copy);
//
//                pre2PreBTransition.setTrigger(preSignalReference.copy);
////                pre2PreBTransition.effects.add(explicitPreSignalEmissionFromPre1.copy);
//                pre2PreBTransition.effects.add(explicitPre2SignalEmission.copy);
//                 
//                preB2PreTransition.setTrigger(preSignalReference.copy);
////                preB2PreTransition.effects.add(explicitPreSignalEmissionFromPre2.copy);
//                preB2PreTransition.effects.add(explicitPre1SignalEmission.copy);
//                 
////                preB2NotPreTransition.effects.add(explicitPreSignalEmissionFromPre2.copy);
//                 
//                notPre2PreTransition.setTrigger(preSignalReference.copy);
//                notPre2PreTransition.effects.add(explicitPre1SignalEmission.copy);
//            }
//
//            // Replace the ComplexExpression Pre(S) by the SignalReference PreS in all actions            
//            // Replace the ComplexExpression Pre(?S) by the OperatorExpression ?PreS in all actions            
//            for (action : allActions) {
//               val preExpressions = action.getPreExpression(preSignal);
//               val preValExpressions = action.getPreValExpression(preSignal);
//
//               for (preExpression : preExpressions) {
//                   val container = preExpression.eContainer;
//                   
//                   if (container instanceof ComplexExpression) {
//                       // If nested PRE or PRE inside another complex expression
//                       (container as ComplexExpression).subExpressions.remove(preExpression);
//                       (container as ComplexExpression).subExpressions.add(explicitPreSignalReference.copy);
//                   } else if(container instanceof Action) {
//                       // If PRE directly a trigger
//                       (container as Action).setTrigger(explicitPreSignalReference.copy)
//                   }
//               }
//                   
//               for (preValExpression : preValExpressions) {
//                   val container = preValExpression.eContainer;
//                   
//
//                   
//                   if ((!preValExpression.subExpressions.nullOrEmpty) && 
//                       preValExpression.subExpressions.get(0) instanceof OperatorExpression && 
//                       (preValExpression.subExpressions.get(0) as OperatorExpression).operator == OperatorType::VAL
//                   ) {
//                       // Transform pre(?V) --> ?PreV
//                       val valueExpression = preValExpression.subExpressions.get(0);
//                       (valueExpression as OperatorExpression).subExpressions.remove(0);
//                       (valueExpression as OperatorExpression).subExpressions.add(explicitPreSignalReference.copy);
//                       if (container instanceof Emission) {
//                            (container as Emission).setNewValue(valueExpression.copy);
//                       }
//                       else if (container instanceof ComplexExpression) {
//                           // If nested PRE or PRE inside another complex expression
//                           (container as ComplexExpression).subExpressions.remove(preValExpression);
//                           (container as ComplexExpression).subExpressions.add(valueExpression.copy);
//                      }
//                  }
//               
//               }
//            }
//        }
//    }
//    
//    
//    //-------------------------------------------------------------------------
//    //--          S C C -  A B O R T S -  T R A N S F O R M A T I O N        --
//    //-------------------------------------------------------------------------
//           
//    // Transforming SCC Aborts.
//    def Region transformSCCAborts(Region rootRegion) {
//        // Clone the complete SCCharts region 
//        val targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
//        var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).toList();
//
//        for(targetState : ImmutableList::copyOf(targetStates)) {
//            // This statement we want to modify
//            targetState.transformSCCAborts(targetRootRegion);
//        }
//        
//        targetRootRegion;
//    }
//    
//    // For all transitions of a state compute the maximal priority
//    def int maxPriority(State state) {
//        var priority = 0;
//        for (transition : state.outgoingTransitions) {
//            val newPriority = transition.priority;
//            if (newPriority > priority) {
//                priority = newPriority;
//            }
//        }
//        priority;
//    }
//
//    // Traverse all states 
//    def void transformSCCAborts(State state, Region targetRootRegion) {
//        
//        if (state.hierarchical && state.outgoingTransitions.size() > 0) {
//            // Remember all outgoing transitions
//            val originalOutgoingTransitions = ImmutableList::copyOf(state.outgoingTransitions);
//            val outgoingStrongTransitions = ImmutableList::copyOf(originalOutgoingTransitions.filter(e | e.type == TransitionType::STRONGABORT));
//            val outgoingWeakTransitions = ImmutableList::copyOf(originalOutgoingTransitions.filter(e | e.type == TransitionType::WEAKABORT));
//            val normalTerminationExists = originalOutgoingTransitions.filter(e | e.type == TransitionType::NORMALTERMINATION).size > 0;
//            // Remember all regions
//            val originalRegions = ImmutableList::copyOf(state.regions);
//            
//            
//            // For a hierarchical state:
//            // 1. for each existing region, create a new Aborted-auxiliary state
//            // 2. create a watcher region
//            
//            // 2. Watcher region
//            // Add a Pre and NotPre state
//            val runState = SCChartsFactory::eINSTANCE.createState();
//            runState.setId("Run" + state.hashCode);
//            runState.setLabel("Run");
//            runState.setIsInitial(true);
//            //runState.setIsFinal(true);  // DO NOT SET THE RUN STATE AS FINAL! //
//            val abortState = SCChartsFactory::eINSTANCE.createState();
//            abortState.setId("Abort" + state.hashCode);
//            abortState.setLabel("Abort");             
//            abortState.setIsFinal(true);
//            val watcherRegion = SCChartsFactory::eINSTANCE.createRegion();
//            watcherRegion.setId("Ctrl" + state.hashCode);
//            watcherRegion.states.add(runState);
//            watcherRegion.states.add(abortState);
//            val needWatcherRegion = (originalOutgoingTransitions.filter(e| e.type != TransitionType::NORMALTERMINATION).size > 0);
//            if (needWatcherRegion) {
//                state.regions.add(watcherRegion);
//            }
//            
//            // Add a conditional node outside of the state and connect it with
//            // a normal termination transition
//            val conditionalState = SCChartsFactory::eINSTANCE.createState();
//            conditionalState.setId("_Conditional" + state.hashCode);
//            conditionalState.setType(StateType::CONDITIONAL);
//            state.parentRegion.states.add(conditionalState);
//            val normalTerminationTransition = SCChartsFactory::eINSTANCE.createTransition();
//                normalTerminationTransition.setTargetState(conditionalState);
//                normalTerminationTransition.setPriority(1);
//                normalTerminationTransition.setType(TransitionType::NORMALTERMINATION);
//                state.outgoingTransitions.add(normalTerminationTransition);            
//                        
//            // Create complex triggers to be filled with auxiliary signals (sorted strong or weak)                        
//            var Expression strongTrigger; 
//            val strongTriggerOperatorExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression;
//                strongTriggerOperatorExpression.setOperator(OperatorType::OR); 
//                strongTrigger = strongTriggerOperatorExpression;                
//            var Expression weakTrigger; 
//            val weakTriggerOperatorExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression;
//                weakTriggerOperatorExpression.setOperator(OperatorType::OR);                  
//                weakTrigger = weakTriggerOperatorExpression;                
//            
//            
//            // For every transition 
//            for (transition : originalOutgoingTransitions) {
//                // Add transition to watcher region
//                // ONLY iff this is not a normal termination
//                if (transition.type != TransitionType::NORMALTERMINATION) {
//                    // Create a signal 
//                    val transitionSignal = KExpressionsFactory::eINSTANCE.createSignal();
//                    val transitionSignalReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
//                        transitionSignalReference.setValuedObject(transitionSignal);
//                    if (transition.type == TransitionType::STRONGABORT) {
//                        transitionSignal.setName("_" + state.id + "_S" + transition.priority);
//                        strongTriggerOperatorExpression.subExpressions.add(transitionSignalReference.copy);
//                    } else {
//                        transitionSignal.setName("_" + state.id + "_W" + transition.priority);
//                        weakTriggerOperatorExpression.subExpressions.add(transitionSignalReference.copy);
//                    }                    
//                    transitionSignal.setIsInput(false);
//                    transitionSignal.setIsOutput(false);
//                    state.parentRegion.parentState.signals.add(transitionSignal);
//                
//                    val watcherTransition =  SCChartsFactory::eINSTANCE.createTransition();
//                    watcherTransition.setTargetState(abortState);
//                    runState.outgoingTransitions.add(watcherTransition);
//                    // Move trigger from original transition to watcher transition
//                    watcherTransition.setTrigger(transition.trigger.copy);
//                    // Watcher transition gets the same priority / immediate / delay
//                    watcherTransition.setPriority(transition.priority);
//                    watcherTransition.setIsImmediate(transition.isImmediate);
//                    watcherTransition.setDelay(transition.delay);
//                    // Watcher transition emits the auxiliary signal
//                    val transitionSignalEmission = SCChartsFactory::eINSTANCE.createEmission();
//                        transitionSignalEmission.setSignal(transitionSignal);
//                    watcherTransition.effects.add(transitionSignalEmission);
//                    // Change trigger of original transition to transitionSignalReference
//                    transition.setTrigger(transitionSignalReference.copy);
//                }
//                
//                // Move original transition from state to conditionalState
//                // and remove strong, normal termination attributes
//                // put immediate attribute
//                conditionalState.outgoingTransitions.add(transition);
//                transition.setType(TransitionType::WEAKABORT);
//                transition.setIsImmediate(true); 
//            }
//            
//            // Simplify triggers (if they only consist of one signal reference)
//            if (strongTriggerOperatorExpression.subExpressions.size == 1) {
//                strongTrigger = strongTriggerOperatorExpression.subExpressions.get(0);
//            }
//            if (weakTriggerOperatorExpression.subExpressions.size == 1) {
//                weakTrigger = weakTriggerOperatorExpression.subExpressions.get(0);
//            }
//            // Hotfix for SCCharts
//            if (strongTrigger instanceof OperatorExpression) {
//                strongTrigger = (strongTrigger as OperatorExpression).fixForOperatorExpressionLists;
//            }
//            if (weakTrigger instanceof OperatorExpression) {
//                weakTrigger = (weakTrigger as OperatorExpression).fixForOperatorExpressionLists;
//            }
//
//            
//            // Create an Aborted state for every region
//            for (region : originalRegions) {
//                // Remember all outgoing transitions
//                val regionStates = ImmutableList::copyOf(region.states);
//                
//                val abortedState = SCChartsFactory::eINSTANCE.createState();
//                abortedState.setId("_Aborted" + state.hashCode);
//                abortedState.setLabel("_Aborted");             
//                abortedState.setIsFinal(true);
//                val needAbortedState = ((outgoingStrongTransitions.size > 0 || 
//                                         outgoingWeakTransitions.size > 0
//                                        ) && (regionStates.filter(e | !e.isFinal).size > 0));
//                if (needAbortedState) {
//                       region.states.add(abortedState);
//                }
//                // Do not add the state here, only add the state iff there are any transitions
//                // ending up in this _Aborted state (within the if-for-constructs below)
//                
//                // For every inner state, connect with a weak and a strong transition
//                if (outgoingStrongTransitions.size > 0) {
//                    for (regionState : regionStates) {
//                        // If the state is a final state do NOT connect it with the _Aborted state
//                        if (!regionState.isFinal) {
//                            // Create a transition ending up in _Aborted
//                            val strongAbortTransition =  SCChartsFactory::eINSTANCE.createTransition();
//                            strongAbortTransition.setTargetState(abortedState);
//                            strongAbortTransition.setIsImmediate(true);
//                            // Now add all strong abort watcher signals as a trigger
//                            strongAbortTransition.setTrigger(strongTrigger.copy);
//                            // Set the highest priority
//                            strongAbortTransition.setPriority(1);
//                            for (regionStateOutgoingTransition : regionState.outgoingTransitions) {
//                                regionStateOutgoingTransition.setPriority(regionStateOutgoingTransition.priority + 1);
//                            }
//                            // Add transition
//                            regionState.outgoingTransitions.add(0, strongAbortTransition);
//                        }
//                    }
//                }
//                
//                if (outgoingWeakTransitions.size > 0) {
//                    for (regionState : regionStates) {
//                        // If the state is a final state do NOT connect it with the _Aborted state
//                        if (!regionState.isFinal) {
//                            // Create a transition ending up in _Aborted
//                            val weakAbortTransition =  SCChartsFactory::eINSTANCE.createTransition();
//                            weakAbortTransition.setTargetState(abortedState);
//                            weakAbortTransition.setIsImmediate(true);
//                            // Now add all weak abort watcher signals as a trigger
//                            weakAbortTransition.setTrigger(weakTrigger.copy);
//                            // Set the lowest priority
//                            weakAbortTransition.setPriority(regionState.maxPriority + 1);
//                            // Add transition
//                            regionState.outgoingTransitions.add(weakAbortTransition);
//                        }
//                    }
//                }
//                                 
//            }
//            
//            // Optimization: If a normal termination is outgoing then the following 
//            // transformation is necessary to be able to abort the watcher in case
//            // of triggering the normal termination.
//            if (normalTerminationExists) {
//                // If there is at least one such transition then whe need an "_Exit" signal
//                val exitSignal = KExpressionsFactory::eINSTANCE.createSignal();
//                val exitSignalReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
//                    exitSignalReference.setValuedObject(exitSignal);
//                exitSignal.setName("_Term_" + state.id);
//                state.signals.add(exitSignal);
//                // Add a watcher transition from Run to Abort triggered by _Exit
//                val watcherTransition =  SCChartsFactory::eINSTANCE.createTransition();
//                watcherTransition.setTargetState(abortState);
//                runState.outgoingTransitions.add(watcherTransition);
//                watcherTransition.setTrigger(exitSignalReference);
//                watcherTransition.setPriority(runState.maxPriority + 1);
//                watcherTransition.setIsImmediate(true);
//                watcherTransition.setDelay(0);
//                              
//                val mainRegion = SCChartsFactory::eINSTANCE.createRegion();
//                mainRegion.setId("Body" + state.hashCode);
//                val mainState = SCChartsFactory::eINSTANCE.createState();
//                mainState.setId("Main" + state.hashCode);
//                mainState.setLabel("Main");
//                mainState.setIsInitial(true);
//                val termState = SCChartsFactory::eINSTANCE.createState();
//                termState.setId("Term" + state.hashCode);
//                termState.setLabel("Term");
//                termState.setIsFinal(true);
//                // Move all inner regions of the state to the mainState
//                val regions = ImmutableList::copyOf(state.regions);
//                for (region : regions) {
//                    mainState.regions.add(region);
//                    if (region.id.nullOrEmpty) {
//                        region.setId("R" + region.hashCode);
//                    }
//                }
//                mainRegion.states.add(mainState);
//                mainRegion.states.add(termState);
//                state.regions.add(mainRegion);
//                // Create a transition from Main to Term
//                val transition = SCChartsFactory::eINSTANCE.createTransition();
//                transition.setTargetState(termState);
//                transition.setPriority(1);
//                transition.setType(TransitionType::NORMALTERMINATION);
//                mainState.outgoingTransitions.add(transition);            
//                val exitSignalEmission = SCChartsFactory::eINSTANCE.createEmission();
//                exitSignalEmission.setSignal(exitSignal);
//                transition.effects.add(exitSignalEmission);
//                
//                // Move the watcher region outside the mainState
//                state.regions.add(watcherRegion);
//            }
//            
//             
//        }
//        
//    }
    

}













