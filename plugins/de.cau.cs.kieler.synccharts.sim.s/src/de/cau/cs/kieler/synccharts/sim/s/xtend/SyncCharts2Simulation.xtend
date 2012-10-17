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
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import org.eclipse.emf.common.util.EList
import java.util.LinkedList
import java.util.List
import de.cau.cs.kieler.core.kexpressions.CombineOperator

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

    
     // New visualization of active states with immediate during actions
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
               } // end if normal termination present

               
               // auxiliary signal
               val auxiliarySignal = KExpressionsFactory::eINSTANCE.createSignal();
          
               // Setup the auxiliarySignal as an OUTPUT to the module
               auxiliarySignal.setName(UID);
               auxiliarySignal.setIsInput(false);
               auxiliarySignal.setIsOutput(true);
               auxiliarySignal.setType(ValueType::PURE);

               // Add emission of auxiliary Signal as an immediate during action for this state
               val immediateDuringAction = SyncchartsFactory::eINSTANCE.createAction();
               immediateDuringAction.setDelay(0);
               immediateDuringAction.setIsImmediate(true);
               val auxiliaryEmission = SyncchartsFactory::eINSTANCE.createEmission();
                   auxiliaryEmission.setSignal(auxiliarySignal);
               immediateDuringAction.effects.add(auxiliaryEmission);
               
               // Add during action to state
               state.innerActions.add(immediateDuringAction);

               // Add auxiliarySignal to first (and only) root region state SyncCharts main interface
               targetRootRegion.states.get(0).signals.add(auxiliarySignal);
          }
          
     }     


     
    //-------------------------------------------------------------------------
    //--                   C O U N T   D E L A Y S                           --
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
    //--                          S U S P E N D                              --
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
        
        // Now delete all suspends
        for(targetState :  ImmutableList::copyOf(targetStates.filter(e | e.suspensionTrigger != null))) {
            targetState.setSuspensionTrigger(null);
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
   
   
   // Build a new expression that disables the inExpression if the disabledWhenExpression
   // is enabled. It optimizes not(not(x)) = x.
   def Expression buildDisabledExpression(Expression inExpression, 
                                                  Expression disabledWhenExpression) {
                val andAuxiliaryTrigger = KExpressionsFactory::eINSTANCE.createOperatorExpression;
                    andAuxiliaryTrigger.setOperator(OperatorType::AND);
                val notAuxiliaryTrigger = KExpressionsFactory::eINSTANCE.createOperatorExpression;
                    notAuxiliaryTrigger.setOperator(OperatorType::NOT);
                var Expression auxiliaryTrigger;
                    // Add a copy because we want this trigger to be used in possibly several
                    // outgoing transitions
                    if ((disabledWhenExpression instanceof OperatorExpression) &&
                       ((disabledWhenExpression as OperatorExpression).operator == OperatorType::NOT)) {
                        // Optimize not(not(x)) = x
                        auxiliaryTrigger = ((disabledWhenExpression as OperatorExpression).subExpressions.get(0)
                            as Expression).copy;
                    }
                    else {
                        // Default case
                        notAuxiliaryTrigger.subExpressions.add(disabledWhenExpression.copy);
                        auxiliaryTrigger = notAuxiliaryTrigger;
                    }
                    if (inExpression != null) {
                      // There is an outgoing transition trigger  
                       andAuxiliaryTrigger.subExpressions.add(inExpression);
                       andAuxiliaryTrigger.subExpressions.add(auxiliaryTrigger);
                       return andAuxiliaryTrigger;
                    } else {
                       // The simple case, there is NO outgoing transition trigger yet
                       return auxiliaryTrigger;
                    }
   }

    // Encode suspensions by traversing all states and get their
    // hierarchical suspension trigger (if any).
    // In case there is such a trigger, to all outgoing transitions, add 
    // an "(<condition>) && !trigger" to disable ALL these transitions
    // if the suspension trigger is enabled.
    def void transformSuspend(State state, Region targetRootRegion) {
        val hierarchicalSuspendTrigger = state.hierarchicalSuspendTrigger;
        
        if (hierarchicalSuspendTrigger != null) {
            for (outgoingTransition : ImmutableList::copyOf(state.outgoingTransitions)) {
                
                val disabledExpression = buildDisabledExpression(outgoingTransition.trigger, 
                                                                 hierarchicalSuspendTrigger);
                outgoingTransition.setTrigger(disabledExpression);
            }
        }
    }
    

    //-------------------------------------------------------------------------
    //--                        H I S T O R Y                                --
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
            val auxiliarySuspendSignalUID = state.id + "Execute";
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
            //selfLoop.effects.add(auxiliaryEmission);
            state.outgoingTransitions.add(selfLoop);
            
            // Add auxiliary signal forcing internals NOT to suspend to all
            // outgoing WEAK abort transitions (consider NORMAL termination as weak aborts)
            val weakAbortTransitions = ImmutableList::copyOf(state.outgoingTransitions.filter(e | e.type != TransitionType::STRONGABORT));
            for (weakAbortTransition : weakAbortTransitions) {
                val auxiliaryEmission2 = SyncchartsFactory::eINSTANCE.createEmission();
                    auxiliaryEmission2.setSignal(auxiliarySuspendSignal);
                weakAbortTransition.effects.add(auxiliaryEmission2);
            }

            //---

            // Re-entry of a history state: Emit a second auxiliaryEntrySignal
            // and wait in all inner simple states with an additional self loop on
            // this signal.  
            
            // Auxiliary suspend re-entry signal
            val auxiliaryEntrySignal = KExpressionsFactory::eINSTANCE.createSignal();
            val auxiliaryEntrySignalUID = state.id + "Entry";
            auxiliaryEntrySignal.setName(auxiliaryEntrySignalUID);
            auxiliaryEntrySignal.setIsInput(false);
            auxiliaryEntrySignal.setIsOutput(false);
            auxiliaryEntrySignal.setType(ValueType::PURE);
            // Add auxiliarySignal to first (and only) root region state SyncCharts main interface
            targetRootRegion.states.get(0).signals.add(auxiliaryEntrySignal);


            // For all incoming transitions now add a suspendSignal emission (to immediately enable the execution of the body)
            // also for all history transitions (re-entry) add an entrySignal emission to (in most times) disabled outgoing transitions that are NOT immediate
            for (incomingTransition : allTransitions) {
                val auxiliarySuspendEmission = SyncchartsFactory::eINSTANCE.createEmission();
                    auxiliarySuspendEmission.setSignal(auxiliarySuspendSignal);
                incomingTransition.effects.add(auxiliarySuspendEmission);
            }
            for (historyTransition : historyTransitions) {
                   val auxiliaryEntryEmission = SyncchartsFactory::eINSTANCE.createEmission();
                       auxiliaryEntryEmission.setSignal(auxiliaryEntrySignal);
                   historyTransition.effects.add(auxiliaryEntryEmission);
            }
            
            // ...disabled outgoing transitions that are NOT immediate (s.a.)
            val innerStates = ImmutableList::copyOf(auxiliaryState.eAllContents.filter(typeof(State)));
            for (innerState : innerStates) {
                for (outgoingTransition : ImmutableList::copyOf(innerState.outgoingTransitions.filter(e | !e.isImmediate))) {
                   val auxiliaryEntrySignalRef = KExpressionsFactory::eINSTANCE.createValuedObjectReference
                       auxiliaryEntrySignalRef.setValuedObject(auxiliaryEntrySignal);
                    val disabledExpression = buildDisabledExpression(outgoingTransition.trigger, 
                                                                     auxiliaryEntrySignalRef);
                    outgoingTransition.setTrigger(disabledExpression);
                }
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
    
         
    //-------------------------------------------------------------------------
    //--             E N T R Y  /  D U R I N G       A C T I O N S           --
    //-------------------------------------------------------------------------
    
    // Helper function to gather all hierarchically higher outgoing transitions
    // for an inner state.
    def List<Transition> hierarchicallyHigherOutgoingTransitions(State state) {
        val List<Transition> returnTransitions = <Transition> newLinkedList;
        
        for (transition : state.outgoingTransitions) {
           returnTransitions.add(transition);
        }
        
        if (state.parentRegion != null) {
            if (state.parentRegion.parentState != null) {
                 val transitionListFromAbove 
                          = state.parentRegion.parentState.hierarchicallyHigherOutgoingTransitions;  
                 returnTransitions.addAll(transitionListFromAbove);
            }
        }
        
        return returnTransitions;     
    }
    

    // Transforming Entry and During Actions.
    def Region transformEntryDuringActions(Region rootRegion) {
        // Clone the complete SyncCharts region 
        val targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
        var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).toList();

        for(targetState : ImmutableList::copyOf(targetStates)) {
            // This statement we want to modify
            targetState.transformEntryDuringActions(targetRootRegion);
        }
        
        targetRootRegion;
    }
        
        
    // Traverse all states and transform macro states that have actions to transform
    def void transformEntryDuringActions(State state, Region targetRootRegion) {
        
        // ENTRY ACTIONS : Create a macro state for all incoming transitions. Weak abort the
        // macro state and connect it to the original target. Put the action into an
        // transition within the macro state.
        if (state.entryActions != null && state.entryActions.size > 0) {
               // If the state is an initial state, then we need an NEW initial state
               // connected with an immediate transition (the transition is considered
               // later as part of the incomingTransitions)               
               if (state.isInitial) {
                    val initialState  = SyncchartsFactory::eINSTANCE.createState();
                    val initialTransition =  SyncchartsFactory::eINSTANCE.createTransition();
                    initialState.setId("init" + state.hashCode);
                    initialState.setLabel("init " + state.label);
                    initialTransition.setTargetState(state);
                    initialTransition.setPriority(1);
                    initialTransition.setDelay(0);
                    initialTransition.setIsImmediate(true);
                    initialState.setIsInitial(true);
                    state.setIsInitial(false);
                    initialState.outgoingTransitions.add(initialTransition);
                    state.parentRegion.states.add(initialState);
               }
            
               // Add a macro state for every transition
               for (transition : ImmutableList::copyOf(state.incomingTransitions)) {
                   // Create a dummy state and connect it accordingly 
                   val dummyState = SyncchartsFactory::eINSTANCE.createState();
                   dummyState.setId("Entry" + transition.hashCode);
                   dummyState.setLabel("Entry " + state.label);
                   state.parentRegion.states.add(dummyState);
                   val dummyTransition =  SyncchartsFactory::eINSTANCE.createTransition();
                   dummyTransition.setLabel("#");
                   dummyTransition.setTargetState(state);
                   dummyTransition.setPriority(1);
                   dummyTransition.setDelay(0);
                   dummyTransition.setIsImmediate(true);
                   dummyState.outgoingTransitions.add(dummyTransition);
                   transition.setTargetState(dummyState);
                   
                   // Create the body of the dummy state - containing the entry action
                   // For every entry action: Create a region
                   for (entryAction : state.entryActions) {
                     val dummyInternalState1 = SyncchartsFactory::eINSTANCE.createState();
                     val dummyInternalState2 = SyncchartsFactory::eINSTANCE.createState();
                     dummyInternalState1.setId("Entry1Internal" + transition.hashCode);
                     dummyInternalState1.setLabel("i");
                     dummyInternalState1.setIsInitial(true);
                     dummyInternalState2.setId("Entry2Internal" + state.hashCode);
                     dummyInternalState2.setLabel("f");
                     val dummyInternalTransition =  SyncchartsFactory::eINSTANCE.createTransition();
                     dummyInternalTransition.setTargetState(dummyInternalState2);
                     dummyInternalTransition.setPriority(1);
                     dummyInternalTransition.setDelay(0);
                     dummyInternalTransition.setIsImmediate(true);
                     dummyInternalTransition.setTrigger(entryAction.trigger.copy);
                     for (action : entryAction.effects) {
                         dummyInternalTransition.effects.add(action.copy);
                     }
                     dummyInternalState1.outgoingTransitions.add(dummyInternalTransition);
                     val dummyInternalRegion = SyncchartsFactory::eINSTANCE.createRegion();
                     dummyInternalRegion.setId("EntryInternalRegion" + entryAction.hashCode);
                     dummyInternalRegion.states.add(dummyInternalState1);
                     dummyInternalRegion.states.add(dummyInternalState2);
                     dummyState.regions.add(dummyInternalRegion);
                   }
                }
                // After transforming entry actions, erase them
                state.entryActions.clear();
       }
       
       
        // DURING ACTIONS : 
        // For each action create a separate region in the state. 
        // Put the action into an transition within the macro state.
        // Add a loop back to the initial state of the added region.
        // In case the during action is immediate, the looping transition is non-immediate.
        // In case the during action is non-immediate, the looping transition is immediate.
        if (state.innerActions != null && state.innerActions.size > 0) {
               // Create the body of the dummy state - containing the during action
               // For every during action: Create a region
               for (innerAction : state.innerActions) {
                     val dummyInternalState1 = SyncchartsFactory::eINSTANCE.createState();
                     val dummyInternalState2 = SyncchartsFactory::eINSTANCE.createState();
                     dummyInternalState1.setId("During1Internal" + state.hashCode);
                     dummyInternalState1.setLabel("i");
                     dummyInternalState1.setIsInitial(true);
                     dummyInternalState2.setId("During2Internal" + state.hashCode);
                     dummyInternalState2.setLabel("f");
                     // Add action dummyTransition
                     val dummyInternalTransition =  SyncchartsFactory::eINSTANCE.createTransition();
                     dummyInternalTransition.setTargetState(dummyInternalState2);
                     dummyInternalTransition.setPriority(1);
                     dummyInternalTransition.setDelay(innerAction.delay);
                     dummyInternalTransition.setIsImmediate(innerAction.isImmediate);
                     dummyInternalTransition.setTrigger(innerAction.trigger.copy);
                     for (action : innerAction.effects) {
                        dummyInternalTransition.effects.add(action.copy);
                     }
                     dummyInternalState1.outgoingTransitions.add(dummyInternalTransition);
                     // Add self loop
                     val dummyInternalLoopTransition = SyncchartsFactory::eINSTANCE.createTransition();
                     dummyInternalLoopTransition.setTargetState(dummyInternalState1);
                     dummyInternalLoopTransition.setPriority(1);
                     dummyInternalLoopTransition.setIsImmediate(!innerAction.isImmediate);
                     if (!innerAction.isImmediate) {
                         dummyInternalLoopTransition.setLabel("#");
                         dummyInternalLoopTransition.setDelay(0);    
                     }
                     dummyInternalLoopTransition.setType(TransitionType::WEAKABORT);
                     dummyInternalState2.outgoingTransitions.add(dummyInternalLoopTransition);
                     // Add the region to the state
                     val dummyInternalRegion = SyncchartsFactory::eINSTANCE.createRegion();
                     dummyInternalRegion.setId("DuringDummyRegion" + innerAction.hashCode);
                     dummyInternalRegion.states.add(dummyInternalState1);
                     dummyInternalRegion.states.add(dummyInternalState2);
                     state.regions.add(dummyInternalRegion);
               }
         
               // After transforming during actions, erase them
               state.innerActions.clear();
       }
    }


    //-------------------------------------------------------------------------
    //--                      E X I T       A C T I O N S                    --
    //-------------------------------------------------------------------------
    // Helper function to gather all hierarchically higher outgoing transitions
    // for an inner state.

    // Transforming Exit Actions. 
    def Region transformExitActions(Region rootRegion) {
        // Clone the complete SyncCharts region 
        val targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
        var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).toList();

        for(targetState :  ImmutableList::copyOf(targetStates)) {
            // This statement we want to modify
            targetState.transformExitActions(targetRootRegion);
        }
        
        targetRootRegion;
    }
           
           
    // Traverse all states and transform macro states that have actions to transform
    def void transformExitActions(State state, Region targetRootRegion) {
        // EXIT ACTIONS : Create a macro state for all outgoing non-preempting(!) transitions. 
        // Weak abort the macro state and connect it to the original target. Put the action into an
        // transition within the macro state.
        //
        // From Charles Andre, Semantics of SyncCharts: Note that strong and weak abortions have the
        // same effect on exit actions. This explains why exit actions are primitive constructs: they 
        // cannot be expressed by a combination of the already studied constructs.
        //
        // Chris Motika: In other words, if an exit action is inside some hierarchical states and an
        // outer state is left by a strong preemption, surprisingly the exit action is still
        // executed.
        // To resolve this, we need to figure out ALL hierarchically outgoing strong preemption transition
        // and add the action also there. For weak preemption transitions we do not need to do this 
        // because the action from inside is allowed to take place as the "last wish".
        // 
        if (state.exitActions != null && state.exitActions.size > 0) {
               // Add a macro state for every transition               
               var List<Transition> consideredTransitions = <Transition> newLinkedList;
               val outgoingTransitions = state.outgoingTransitions.filter(e | e.type != TransitionType::STRONGABORT);
               consideredTransitions.addAll(outgoingTransitions);
               val hiearchicallyHigherTransitions = state.hierarchicallyHigherOutgoingTransitions.filter(e | e.type == TransitionType::STRONGABORT);
               consideredTransitions.addAll(hiearchicallyHigherTransitions);
               
               // Add reset of done signal flag as entry action
               val doneSignal = KExpressionsFactory::eINSTANCE.createSignal();
               doneSignal.setName("ExitDone" + state.id);
               doneSignal.setIsInput(false);
               doneSignal.setIsOutput(false);
               doneSignal.setType(ValueType::INT);
               // ATTENTION: This is very relevant for correct behavior of exit actions!
               // In order to reset (0) the done signal in the SAME tick when it was set (1)
               // we take the combination of the MIN function which resolves to 0! So the
               // signal is reset for the next tick - reset wins over set. 
               doneSignal.setCombineOperator(CombineOperator::MIN);
               val entryAction = SyncchartsFactory::eINSTANCE.createAction();
               entryAction.setDelay(0);
               entryAction.setIsImmediate(true);
               val auxiliaryEmission = SyncchartsFactory::eINSTANCE.createEmission();
                   auxiliaryEmission.setSignal(doneSignal);
                   val intValue = KExpressionsFactory::eINSTANCE.createIntValue;
                   intValue.setValue(0);
                   auxiliaryEmission.setNewValue(intValue);
               entryAction.effects.add(auxiliaryEmission);
               state.entryActions.add(entryAction);
               targetRootRegion.states.get(0).signals.add(doneSignal);
               
  
               for (transition : consideredTransitions) {
                   System::out.println(transition.sourceState.id + "=>" + transition.targetState.id);
                   // Create a dummy state and connect it accordingly 
                   val dummyState = SyncchartsFactory::eINSTANCE.createState();
                   dummyState.setId("Exit" + transition.hashCode + state.hashCode);
                   dummyState.setLabel("Exit " + state.label);
                   // Add this new state to the transition source state's parent region
                   transition.sourceState.parentRegion.states.add(dummyState);
                   val dummyTransition =  SyncchartsFactory::eINSTANCE.createTransition();
                   dummyTransition.setLabel("#");
                   dummyTransition.setTargetState(transition.targetState);
                   dummyTransition.setPriority(1);
                   dummyTransition.setDelay(0);
                   dummyTransition.setIsImmediate(true);
                   dummyState.outgoingTransitions.add(dummyTransition);
                   transition.setTargetState(dummyState);
                   
                   // Add exiting action to set the done entry signal flag
                   val auxiliaryEmission2 = SyncchartsFactory::eINSTANCE.createEmission();
                   auxiliaryEmission2.setSignal(doneSignal);
                   val intValue2 = KExpressionsFactory::eINSTANCE.createIntValue();
                   intValue2.setValue(1);
                   auxiliaryEmission2.setNewValue(intValue2);
                   dummyTransition.effects.add(auxiliaryEmission2);
                   
                   // Add suspend for the done entry signal flag - this suspends the exit action
                   // if it has already been executed
                   val doneSignalRef = KExpressionsFactory::eINSTANCE.createValuedObjectReference
                       doneSignalRef.setValuedObject(doneSignal);
                       val intValue3 = KExpressionsFactory::eINSTANCE.createIntValue; 
                       intValue3.setValue(1);
                       val doneSignalValue = KExpressionsFactory::eINSTANCE.createOperatorExpression;
                       doneSignalValue.setOperator(OperatorType::VAL);
                       doneSignalValue.subExpressions.add(doneSignalRef);
                       val preExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression;
                       preExpression.setOperator(OperatorType::PRE);
                       preExpression.subExpressions.add(doneSignalValue);
                       val doneSignalCompare = KExpressionsFactory::eINSTANCE.createOperatorExpression;
                       doneSignalCompare.setOperator(OperatorType::EQ);
                       doneSignalCompare.subExpressions.add(preExpression);
                       doneSignalCompare.subExpressions.add(intValue3);
                   System::out.println(":::" + doneSignalCompare.toString);
                   val suspensionAction = SyncchartsFactory::eINSTANCE.createAction();
                   suspensionAction.setTrigger(doneSignalCompare);
                   suspensionAction.setDelay(0);
                   suspensionAction.setIsImmediate(true);
                   dummyState.setSuspensionTrigger(suspensionAction);
                   
                   // Create the body of the dummy state - containing the exit action
                   // For every exit action: Create a region
                   for (exitAction : state.exitActions) {
                     val dummyInternalState1 = SyncchartsFactory::eINSTANCE.createState();
                     val dummyInternalState2 = SyncchartsFactory::eINSTANCE.createState();
                     dummyInternalState1.setId("Exit1Internal" + state.hashCode);
                     dummyInternalState1.setLabel("i");
                     dummyInternalState1.setIsInitial(true);
                     dummyInternalState2.setId("Exit2Internal" + state.hashCode);
                     dummyInternalState2.setLabel("f");
                     val dummyInternalTransition =  SyncchartsFactory::eINSTANCE.createTransition();
                     dummyInternalTransition.setTargetState(dummyInternalState2);
                     dummyInternalTransition.setPriority(1);
                     dummyInternalTransition.setDelay(0);
                     dummyInternalTransition.setIsImmediate(true);
                     dummyInternalTransition.setTrigger(exitAction.trigger.copy);
                     for (action : exitAction.effects) {
                         dummyInternalTransition.effects.add(action.copy);
                     }
                     dummyInternalState1.outgoingTransitions.add(dummyInternalTransition);
                     val dummyInternalRegion = SyncchartsFactory::eINSTANCE.createRegion();
                     dummyInternalRegion.setId("ExitInternalRegion" + exitAction.hashCode);
                     dummyInternalRegion.states.add(dummyInternalState1);
                     dummyInternalRegion.states.add(dummyInternalState2);
                     dummyState.regions.add(dummyInternalRegion);
                   }
                }
                // After transforming exit actions, erase them
                state.exitActions.clear();
       }
       
    }
           

}













