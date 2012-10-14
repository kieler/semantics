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
package de.cau.cs.kieler.synccharts.sim.s.xtend

import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.synccharts.Region
import de.cau.cs.kieler.synccharts.State
import de.cau.cs.kieler.synccharts.SyncchartsFactory
import de.cau.cs.kieler.synccharts.Transition
import de.cau.cs.kieler.synccharts.TransitionType
import de.cau.cs.kieler.synccharts.sim.s.SyncChartsSimSPlugin
import org.eclipse.xtend.util.stdlib.CloningExtensions
import de.cau.cs.kieler.core.kexpressions.Expression
import com.google.common.collect.ImmutableList
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * Transformation of a SyncChart to another SyncChart
 * enriched with additional signals for each state and
 * each transition.
 * 
 * These signals are HS for auxiliary state signals
 * and HT for auxiliary transition signals.
 * 
 * Signals HS are generated in the following fashion for a 
 * state S:
 * 
 * 1. For every incoming transition, add an output-emit action for HS
 * 2. Create an auxiliary region that has one state and a self-loop 
 *    emitting HS.
 * 3. Initial states need new initial states connected with an
 *    immediate transition that emits the signal HS.
 * 
 * ATTENTION: Iff the state is a final state, then do not emit the
 * in-state-auxiliary signal inside (2.) because the thread in this case
 * cannot terminate! (This would change the semantics)
 * 
 * ATTENTION: Iff the state has an outgoing normal termination then
 * we cannot do (2.) because this would also corrupt the semantics
 * The normal termination is transformed into a weak abort - this is the
 * best approximation 
 * 
 * Signal HT are generated in the following fashion for a
 * transition T:
 * 
 * As names for the signals are randomly generated and must be unique
 * there must be a mapping that keeps track which signal (name) belongs to
 * which original S statement.
 * 
 * ********************
 *
 *  Additionally transforming count delayes into auxiliary variable counters
 *  with an additional counting transition and a modified immediate abort transition.
 *  All transitions entering the state need to reset the counter.
 * 
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
class SyncCharts2Simulation {
    
    // General method to create the enriched SyncCharts simulation models.
    def Region transform2Simulation (Region rootRegion) {
        var AUXILIARY_VARIABLE_TAG_STATE =  SyncChartsSimSPlugin::AUXILIARY_VARIABLE_TAG_STATE
        var AUXILIARY_VARIABLE_TAG_TRANSITION = SyncChartsSimSPlugin::AUXILIARY_VARIABLE_TAG_TRANSITION

        // Clone the complete SyncCharts region 
        var targetRootRegion = CloningExtensions::clone(rootRegion) as Region;

        var originalStates = rootRegion.eAllContents().toIterable().filter(typeof(State));
          var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).toList();

          var originalTransitions = rootRegion.eAllContents().toIterable().filter(typeof(Transition));
          var targetTransitions = targetRootRegion.eAllContents().toIterable().filter(typeof(Transition)).toList();

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
               targetTransition.transformTransition(targetRootRegion, transitionUID);
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
               targetState.transformState(targetRootRegion, stateUID);
          }

          targetRootRegion;
     }     
     
     // Transform a transition as described in 1.
     def void transformTransition(Transition transition, Region targetRootRegion, String UID) {
          // auxiliary signal
          val auxiliarySignal = KExpressionsFactory::eINSTANCE.createSignal();
          val auxiliaryEmission = SyncchartsFactory::eINSTANCE.createEmission();
          
          // Setup the auxiliarySignal as an OUTPUT to the module
          auxiliarySignal.setName(UID);
          auxiliarySignal.setIsInput(false);
          auxiliarySignal.setIsOutput(true);
          auxiliarySignal.setType(ValueType::PURE);
          // Set the auxliiarySignal for emission 
          auxiliaryEmission.setSignal(auxiliarySignal);
          
          // Add emission of auxiliary Signal to tansition
          transition.effects.add(auxiliaryEmission);

          // Add auxiliarySignal to first (and only) root region state SyncCharts main interface
          targetRootRegion.states.get(0).signals.add(auxiliarySignal);
     }
     
     // Transform a state as described in 2.
     def void transformState(State state, Region targetRootRegion, String UID) {
          if (state.isFinal) {
               state.setIsFinal(false);
               // Final states will be transformed if there is a normal termination with a self loop
               // so we do not want to add a superfluous self loop and return here.
//               return;
          }

          // Do the following only for NON-final states
          // Do the following only for NON-top-most-states
          if (!state.isFinal && state.parentRegion != targetRootRegion) {
               
               // this is the special case where we must taken care of a normal termination
               // this is transformed into a weak abort
               if (state.outgoingTransitions.filter(e | e.type == TransitionType::NORMALTERMINATION).size > 0) {
                    val normalTerminationTransition = state.outgoingTransitions.filter(e | e.type == TransitionType::NORMALTERMINATION).head;
                    normalTerminationTransition.setType(TransitionType::WEAKABORT);
                    val triggerExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression();
                         triggerExpression.setOperator(OperatorType::AND);
                         triggerExpression.subExpressions
               
                    for (region : state.regions) {
                         // Setup the auxiliarySignal as an OUTPUT to the module
                         val termSignal = KExpressionsFactory::eINSTANCE.createSignal();
                         termSignal.setName("terminated" + region.hashCode);
                         termSignal.setIsInput(false);
                         termSignal.setIsOutput(false);
                         termSignal.setType(ValueType::PURE);
                    
                         val finalStates = region.states.filter(e | e.isFinal == true);
                         for (finalState : finalStates) {
                              val termSelfLoop =  SyncchartsFactory::eINSTANCE.createTransition();
                              termSelfLoop.setTargetState(finalState);
                              termSelfLoop.setPriority(1);
                              termSelfLoop.setDelay(1);
                              finalState.outgoingTransitions.add(termSelfLoop);
                              //finalState.setIsFinal(false);
                              
                              // add termSignal to all incoming transitions
                              // (this includes the just created selfloop)
                              for ( incomingTransition : finalState.incomingTransitions) {
                                   val termEmission = SyncchartsFactory::eINSTANCE.createEmission();
                                   termEmission.setSignal(termSignal);
                                   incomingTransition.effects.add(termEmission);
                              }
                         }
                    
                           targetRootRegion.states.get(0).signals.add(termSignal);
                         val valuedObjectReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
                         valuedObjectReference.setValuedObject(termSignal);
                         triggerExpression.subExpressions.add(valuedObjectReference);
                    }
               
                    if (triggerExpression.subExpressions.size == 1) {
                         // if there is just one signal, we do not need an AND!
                         normalTerminationTransition.setTrigger(triggerExpression.subExpressions.get(0));
                    }
                    else if (triggerExpression.subExpressions.size > 1) {
                         normalTerminationTransition.setTrigger(triggerExpression);
                    }
               }

               
               // auxiliary signal
               val auxiliarySignal = KExpressionsFactory::eINSTANCE.createSignal();
          
               // Setup the auxiliarySignal as an OUTPUT to the module
               auxiliarySignal.setName(UID);
               auxiliarySignal.setIsInput(false);
               auxiliarySignal.setIsOutput(true);
               auxiliarySignal.setType(ValueType::PURE);
          
               // 1. Add emission of auxiliary Signal to every incoming transition
               for (transition : state.incomingTransitions) {
                    // Set the auxliiarySignal for emission 
                    val auxiliaryEmission = SyncchartsFactory::eINSTANCE.createEmission();
                       auxiliaryEmission.setSignal(auxiliarySignal);
                       // Add emission to effect of incoming transition
                    transition.effects.add(auxiliaryEmission);
               }

               // If the state is an initial state, then we need an NEW initial state
               // connected with an immediate transition that outputs the auxiliary signal.               
               if (state.isInitial) {
                    val initialState  = SyncchartsFactory::eINSTANCE.createState();
                    val initialTransition =  SyncchartsFactory::eINSTANCE.createTransition();
                    val initialEmission = SyncchartsFactory::eINSTANCE.createEmission();
                    initialState.setId("init" + state.hashCode);
                    initialTransition.setTargetState(state);
                    initialTransition.setPriority(1);
                    initialTransition.setDelay(0);
                    initialTransition.setIsImmediate(true);
                    initialState.setIsInitial(true);
                    state.setIsInitial(false);
                    initialState.outgoingTransitions.add(initialTransition);
                       initialEmission.setSignal(auxiliarySignal);
                    initialTransition.effects.add(initialEmission);
                    state.parentRegion.states.add(initialState);
               }
          
               // 2. Create auxiliary region and an inner state with a self-loop
               // emitting the signal
               val auxiliaryRegion = SyncchartsFactory::eINSTANCE.createRegion()
               val auxiliaryState  = SyncchartsFactory::eINSTANCE.createState();
               val auxiliarySelfLoop =  SyncchartsFactory::eINSTANCE.createTransition();
          
               auxiliarySelfLoop.setTargetState(auxiliaryState);
               auxiliarySelfLoop.setPriority(1);
               auxiliarySelfLoop.setDelay(1);
               // Set the auxliiarySignal for emission 
               val auxiliaryEmission = SyncchartsFactory::eINSTANCE.createEmission();
               auxiliaryEmission.setSignal(auxiliarySignal);
               auxiliarySelfLoop.effects.add(auxiliaryEmission);
          
               auxiliaryState.setId("selfloopstate" + UID);
               auxiliaryState.setLabel("selfloopstate" + UID);
               auxiliaryState.setIsInitial(true);
               auxiliaryState.outgoingTransitions.add(auxiliarySelfLoop);
          
               auxiliaryRegion.states.add(auxiliaryState);
               state.regions.add(auxiliaryRegion);
          
               // Add auxiliarySignal to first (and only) root region state SyncCharts main interface
                 targetRootRegion.states.get(0).signals.add(auxiliarySignal);
          }
          
     }
     
     //-------------------------------------------------------------------------
     
    // Transforming Count Delays entry function.
    def Region transformCountDelayes (Region rootRegion) {
        // Clone the complete SyncCharts region 
        var targetRootRegion = CloningExtensions::clone(rootRegion) as Region;

        var targetTransitions = targetRootRegion.eAllContents().toIterable().filter(typeof(Transition)).toList();

        // For every transition in the SyncChart do the transformation
        // Iterate over a copy of the list  
        for(targetTransition : targetTransitions) {
            // This statement we want to modify
            targetTransition.transformCountDelayes(targetRootRegion);
        }
        
        targetRootRegion;
    }
         
     // This will encode count delays in transitions and insert additional counting
     // host code variables plus modifying the trigger of the count delayed transition
     // to be immediate and guarded by a host code expression (with the specific
    // number of ticks).
     def void transformCountDelayes(Transition transition, Region targetRootRegion) {
          if (transition.delay > 1) {
               // auxiliary signal
               val auxiliaryVariable = KExpressionsFactory::eINSTANCE.createVariable;
               val auxiliaryVariableName = "countDelay" + transition.hashCode + "";
               auxiliaryVariable.setName(auxiliaryVariableName);
               auxiliaryVariable.setType(ValueType::INT);
               auxiliaryVariable.setInitialValue("0");

               // add auxiliaryVariable to first (and only) root region state SyncCharts main interface
                 targetRootRegion.states.get(0).variables.add(auxiliaryVariable);
                 
                 // add self-loop transition, counting up the variable
                val selfLoop = SyncchartsFactory::eINSTANCE.createTransition();
                val state = transition.sourceState;
               selfLoop.setTargetState(state);
               selfLoop.setPriority(1);
              selfLoop.setDelay(1);
               val selfLoopEffect = SyncchartsFactory::eINSTANCE.createTextEffect;
               selfLoopEffect.setCode(auxiliaryVariableName + "++");
               selfLoop.effects.add(selfLoopEffect);
               selfLoop.setTrigger(transition.trigger);
               state.outgoingTransitions.add(selfLoop);

               // calculate a new terminating expression, based on the auxiliary variable
               val terminatingExpression = KExpressionsFactory::eINSTANCE.createTextExpression;
               terminatingExpression.setCode(auxiliaryVariableName + " >= " + transition.delay);
               transition.setTrigger(terminatingExpression);
               
               // disable old delay, set it to be immediate
               transition.setDelay(1);
               transition.setIsImmediate(true);
               
            // reset the variable for all incoming transition
            val resetEffect = SyncchartsFactory::eINSTANCE.createTextEffect;
            resetEffect.setCode(auxiliaryVariableName + "= 0");
            for (incomingTransition : state.incomingTransitions) {
                // Add reset text effect of incoming transition
                transition.effects.add(resetEffect);
            }
               
          }
     }
     
    
    //-------------------------------------------------------------------------
    
    // Transforming Suspends.
    def Region transformSuspend(Region rootRegion) {
        // Clone the complete SyncCharts region 
        var targetRootRegion = CloningExtensions::clone(rootRegion) as Region;

        var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).toList();

        // For every state in the SyncChart do the transformation
        // Iterate over a copy of the list  
        for(targetState :  ImmutableList::copyOf(targetStates)) {
            // This statement we want to modify
            targetState.transformSuspend(targetRootRegion);
        }
        
        targetRootRegion;
    }
        
        
    // Gather the trigger of all hierarchically higher suspensions in an OR-fashion. Do this
    // recursively until reaching the top level region (with no further parent state).
    def Expression getHierarchicalSuspendTrigger(State state) {
        val parentState = state.parentRegion.parentState;
        var returnExpression = KExpressionsFactory::eINSTANCE.createExpression;
        var complexExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression;
            complexExpression.setOperator(OperatorType::OR);
        
        if (parentState != null) {
            if (parentState.suspensionTrigger != null && parentState.suspensionTrigger.trigger != null) {
              // Copy: from org.eclipse.emf.ecore.util.EcoreUtil
              complexExpression.subExpressions.add(parentState.suspensionTrigger.copy.trigger)
              returnExpression = complexExpression;
            }
            // Do the same recursively for the parent (until reaching the top region)
            var parentHierarchicalSuspendTrigger = getHierarchicalSuspendTrigger(parentState);
            if (parentHierarchicalSuspendTrigger != null) {
                complexExpression.subExpressions.add(parentHierarchicalSuspendTrigger);
                returnExpression = complexExpression;
            }
            
            // if there are no subExpressions, return null
            if (complexExpression.subExpressions.size < 1) {
               returnExpression = null; 
            }
            else if (complexExpression.subExpressions.size < 2) {
               returnExpression = complexExpression.subExpressions.get(0);
            }
        }
        else {
           // Reached top region, end of recursion
           returnExpression = null; 
        }       
        
        returnExpression
    }    


   // Tells whether a state is a macro state
   def boolean isHierarchical(State state) {
       (state.regions != null && state.regions.size > 0);
   }

    // Encode suspensions by traversing all states and get their
    // hierarchical suspension trigger (if any).
    // In case there is such a trigger, to all outgoing transitions, add 
    // an "(<condition>) && !trigger" to disable ALL these transitions
    // if the suspension trigger is enabled.
    def void transformSuspend(State state, Region targetRootRegion) {
        val hierarchicalSuspendTrigger = state.hierarchicalSuspendTrigger;
        
        if (hierarchicalSuspendTrigger != null) {
            // Add one to the priority off all other outgoing transitions
            for (outgoingTransition : ImmutableList::copyOf(state.outgoingTransitions)) {
                val andAuxiliaryTrigger = KExpressionsFactory::eINSTANCE.createOperatorExpression;
                    andAuxiliaryTrigger.setOperator(OperatorType::AND);
                val notAuxiliaryTrigger = KExpressionsFactory::eINSTANCE.createOperatorExpression;
                    notAuxiliaryTrigger.setOperator(OperatorType::NOT);
                    // Add a copy because we want this trigger to be used in possibly several
                    // outgoing transitions
                    notAuxiliaryTrigger.subExpressions.add(hierarchicalSuspendTrigger.copy);
                    if (outgoingTransition.trigger != null) {
                      // There is an outgoing transition trigger  
                       andAuxiliaryTrigger.subExpressions.add(outgoingTransition.trigger);
                       andAuxiliaryTrigger.subExpressions.add(notAuxiliaryTrigger);
                       outgoingTransition.setTrigger(andAuxiliaryTrigger);
                    } else {
                      // The simple case, there is NO outgoing transition trigger yet   
                       outgoingTransition.setTrigger(notAuxiliaryTrigger);
                    }
            }
        }
    }
    
    //-------------------------------------------------------------------------
    
    // Transforming History. This is using the concept of suspend so it must
    // be followed by resolving suspension
    def Region transformHistory(Region rootRegion) {
        // Clone the complete SyncCharts region 
        val targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
        var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).toList();

        // For every state in the SyncChart do the transformation
        // Iterate over a copy of the list
        // The following can also be written functional:
        //        ImmutableList::copyOf(targetStates).forEach[
        //             it.transformHistory(targetRootRegion);
        //        ]
        for(targetState :  ImmutableList::copyOf(targetStates)) {
            // This statement we want to modify
            targetState.transformHistory(targetRootRegion);
        }
        
        targetRootRegion;
    }
        
        
    // Traverse all states and transform macro states that have connecting
    // (incoming) history transitions.    
    def void transformHistory(State state, Region targetRootRegion) {
        val historyTransitions = ImmutableList::copyOf(state.incomingTransitions.filter(e | e.isHistory));
        val nonHistoryTransitions = ImmutableList::copyOf(state.incomingTransitions.filter(e | !e.isHistory));
        val allTransitions = ImmutableList::copyOf(state.incomingTransitions);
        
        if (historyTransitions != null && historyTransitions.size > 0 
            && state.regions != null && state.regions.size > 0) {
            // Put the inside of the state (all inner regions) into
            // a NEW state of a NEW region in parallel to the one before
            val auxiliaryRegion = SyncchartsFactory::eINSTANCE.createRegion()
            val auxiliaryState  = SyncchartsFactory::eINSTANCE.createState();
            auxiliaryState.setId(state.id + "History");
            auxiliaryState.setLabel(state.id + "History");
            auxiliaryState.setIsInitial(true);
            
            // Move all regions to new auxiliary State
            for (region : ImmutableList::copyOf(state.regions)) {
                auxiliaryState.regions.add(region)
            }
            state.regions.removeAll(auxiliaryState.regions);
            
            // Auxiliary state gets suspended by NOT auxiliary signal
            val auxiliarySuspendSignal = KExpressionsFactory::eINSTANCE.createSignal();
            val auxiliarySuspendSignalUID = state.id + "Suspend";
            auxiliarySuspendSignal.setName(auxiliarySuspendSignalUID);
            auxiliarySuspendSignal.setIsInput(false);
            auxiliarySuspendSignal.setIsOutput(false);
            auxiliarySuspendSignal.setType(ValueType::PURE);

            // Add auxiliarySignal to first (and only) root region state SyncCharts main interface
            targetRootRegion.states.get(0).signals.add(auxiliarySuspendSignal);
            
            var Expression suspensionTrigger;
                val notAuxiliaryTrigger = KExpressionsFactory::eINSTANCE.createOperatorExpression;
                    notAuxiliaryTrigger.setOperator(OperatorType::NOT);
                val auxiliarySignalRef = KExpressionsFactory::eINSTANCE.createValuedObjectReference
                    auxiliarySignalRef.setValuedObject(auxiliarySuspendSignal);
                    notAuxiliaryTrigger.subExpressions.add(auxiliarySignalRef);
            if (state.suspensionTrigger != null) {
                // If there already is a suspension trigger than combine it with OR
                val suspensionTrigger2 = KExpressionsFactory::eINSTANCE.createOperatorExpression;
                    suspensionTrigger2.setOperator(OperatorType::OR);
                    suspensionTrigger2.subExpressions.add(notAuxiliaryTrigger);
                    suspensionTrigger2.subExpressions.add(state.suspensionTrigger.trigger);
                suspensionTrigger = suspensionTrigger2;
            }
            else {
                // If there is not already a suspension trigger we use the simpler case
                suspensionTrigger = notAuxiliaryTrigger;
            }
            
            // Add a dummy suspension action
            val suspensionAction = SyncchartsFactory::eINSTANCE.createAction;
            suspensionAction.setTrigger(suspensionTrigger);
            auxiliaryState.setSuspensionTrigger(suspensionAction);
            
            // Add the NEW state to the NEW region and add the NEW region in parallel 
            auxiliaryRegion.states.add(auxiliaryState);
            state.parentRegion.parentState.regions.add(auxiliaryRegion);
            
            // For all history transitions now erase the history marker
            for (historyTransition : historyTransitions) {
                historyTransition.setIsHistory(false);
            }
            
            // Add a self loop to the original state that emits the auxiliary signal
            // forcing the internals NOT to suspend
            val selfLoop = SyncchartsFactory::eINSTANCE.createTransition();
            selfLoop.setTargetState(state);
            selfLoop.setPriority(state.outgoingTransitions.size + 1);
            selfLoop.setDelay(1);
            val auxiliaryEmission = SyncchartsFactory::eINSTANCE.createEmission();
                auxiliaryEmission.setSignal(auxiliarySuspendSignal);
            selfLoop.effects.add(auxiliaryEmission);
            state.outgoingTransitions.add(selfLoop);
            
            // Add auxiliary signal forcing internals NOT to suspend to all
            // outgoing WEAK abort transitions (consider NORMAL termination as weak aborts)
            val weakAbortTransitions = ImmutableList::copyOf(state.outgoingTransitions.filter(e | e.type != TransitionType::STRONGABORT));
            for (weakAbortTransition : weakAbortTransitions) {
                val auxiliaryEmission2 = SyncchartsFactory::eINSTANCE.createEmission();
                    auxiliaryEmission2.setSignal(auxiliarySuspendSignal);
                weakAbortTransition.effects.add(auxiliaryEmission2);
            }

            // For all incoming transitions now add a suspendSignal emission (to immediately enable the execution of the body)
            for (incomingTansition : allTransitions) {
                val auxiliarySuspendEmission = SyncchartsFactory::eINSTANCE.createEmission();
                    auxiliarySuspendEmission.setSignal(auxiliarySuspendSignal);
                incomingTansition.effects.add(auxiliarySuspendEmission);
            }

            //---
            
            // For resetting the inner states when entering by a normal transition
            // add a reset signal and emit it when entering
            val auxiliaryResetSignal = KExpressionsFactory::eINSTANCE.createSignal();
            val auxiliaryResetSignalUID = state.id + "Reset";
            auxiliaryResetSignal.setName(auxiliaryResetSignalUID);
            auxiliaryResetSignal.setIsInput(false);
            auxiliaryResetSignal.setIsOutput(false);
            auxiliaryResetSignal.setType(ValueType::PURE);

            // Add auxiliarySignal to first (and only) root region state SyncCharts main interface
            targetRootRegion.states.get(0).signals.add(auxiliaryResetSignal);
            
            // Add a self loop to the NEW state that resets it if auxiliary reset signal is present
            val resetSelfLoop = SyncchartsFactory::eINSTANCE.createTransition();
            resetSelfLoop.setTargetState(auxiliaryState);
            resetSelfLoop.setPriority(1);
            resetSelfLoop.setDelay(1);
            resetSelfLoop.setType(TransitionType::STRONGABORT);
                val auxiliaryResetSignalRef = KExpressionsFactory::eINSTANCE.createValuedObjectReference
                    auxiliaryResetSignalRef.setValuedObject(auxiliaryResetSignal);
            resetSelfLoop.setTrigger(auxiliaryResetSignalRef);
            auxiliaryState.outgoingTransitions.add(resetSelfLoop);
            
            // For all non-history transitions now add a resetSignal emission
            for (nonHistoryTransition : nonHistoryTransitions) {
                val auxiliaryResetEmission = SyncchartsFactory::eINSTANCE.createEmission();
                    auxiliaryResetEmission.setSignal(auxiliaryResetSignal);
                nonHistoryTransition.effects.add(auxiliaryResetEmission);
            }
            
        }
    }
    
     


}













