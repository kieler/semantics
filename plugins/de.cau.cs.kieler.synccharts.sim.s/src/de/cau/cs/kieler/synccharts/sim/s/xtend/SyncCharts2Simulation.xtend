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
import java.util.List

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
//          if (state.isFinal) {
//               state.setIsFinal(false);
//               // Final states will be transformed if there is a normal termination with a self loop
//               // so we do not want to add a superfluous self loop and return here.
////               return;
//          }

          // Do the following only for NON-final states
          // Do the following only for NON-top-most-states
          if (!state.isFinal && state.parentRegion != targetRootRegion) {
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
    // @requires: auxiliary (host) variables
     
    // Transforming Count Delays entry function.
    def Region transformCountDelay (Region rootRegion) {
        // Clone the complete SyncCharts region 
        var targetRootRegion = CloningExtensions::clone(rootRegion) as Region;

        var targetTransitions = targetRootRegion.eAllContents().toIterable().filter(typeof(Transition)).toList();

        // For every transition in the SyncChart do the transformation
        // Iterate over a copy of the list  
        for(targetTransition : targetTransitions) {
            // This statement we want to modify
            targetTransition.transformCountDelay(targetRootRegion);
        }
        
        targetRootRegion;
    }
         
     // This will encode count delays in transitions and insert additional counting
     // host code variables plus modifying the trigger of the count delayed transition
     // to be immediate and guarded by a host code expression (with the specific
    // number of ticks).
     def void transformCountDelay(Transition transition, Region targetRootRegion) {
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
    
    //@requires: during
    //@run-before: entry (because these are considered here)
    
    // For a suspend statement of state S create a new top-level region
    // with two states (NotSuspended (initial) and Suspended). Connect them
    // with the suspension trigger.
    // If the trigger is immediate, then connect them immediately and have
    // the transition back be non-immediate. If it is non immediate then
    // have the transition back be immediate.
    // Create an immediate during action of the Suspended state that emits
    // an auxiliaryDisableSignal that is added to all outgoing transitions
    // (within the disabledExpression) 
    
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

        if (state.suspensionTrigger != null) {
             val suspendTrigger = state.suspensionTrigger.trigger;
             val immediateSuspension = state.suspensionTrigger.isImmediate;
             val notSuspendTrigger = KExpressionsFactory::eINSTANCE.createOperatorExpression;
                 notSuspendTrigger.setOperator(OperatorType::NOT);
                 notSuspendTrigger.subExpressions.add(suspendTrigger.copy);
            
               // Add SET and RESET signal signal flag 
               val disabledSignal = KExpressionsFactory::eINSTANCE.createSignal();
               disabledSignal.setName("disabled" + state.id);
               disabledSignal.setIsInput(false);
               disabledSignal.setIsOutput(false);
               disabledSignal.setType(ValueType::PURE);
               targetRootRegion.states.get(0).signals.add(disabledSignal);
               
               // Add a NonSuspended and Suspended state
               val runningState = SyncchartsFactory::eINSTANCE.createState();
               runningState.setId("NonSuspended" + state.hashCode);
               runningState.setLabel(state.id + " running");
               runningState.setIsInitial(true);
               val disabledState = SyncchartsFactory::eINSTANCE.createState();
               disabledState.setId("Suspended" + state.hashCode);
               disabledState.setLabel(state.id + "disabled");
               
               // Add during action that emits the disable signal 
               val immediateDuringAction = SyncchartsFactory::eINSTANCE.createAction();
               immediateDuringAction.setDelay(0);
               immediateDuringAction.setIsImmediate(true);
               val auxiliaryEmission = SyncchartsFactory::eINSTANCE.createEmission();
                   auxiliaryEmission.setSignal(disabledSignal);
               immediateDuringAction.effects.add(auxiliaryEmission);
               disabledState.innerActions.add(immediateDuringAction);
               
               // Create the body of the intermediate state - containing the entry actions
               // as during actions.
               val actionState = SyncchartsFactory::eINSTANCE.createState();
               actionState.setId("Awake" + state.hashCode);
               actionState.setLabel("Awake " + state.label);
               // For every entry action: Create a region
               for (entryAction : state.entryActions) {
                     val entryActionCopy = entryAction.copy;
                     entryActionCopy.setIsImmediate(true);
                     actionState.innerActions.add(entryActionCopy); 
               }               
               
               // Connect Suspended and NonSuspended States with transitions (s.a. for a more detailed explanation)
               val disabled2actionTransition =  SyncchartsFactory::eINSTANCE.createTransition();
                   disabled2actionTransition.setTargetState(actionState);
                   disabled2actionTransition.setTrigger(notSuspendTrigger.copy);
                   disabled2actionTransition.setIsImmediate(!immediateSuspension);
                   if (!immediateSuspension) {
                      disabled2actionTransition.setDelay(0);
                   }
                   disabledState.outgoingTransitions.add(disabled2actionTransition);
                   // Do not emit the disableSignal when the suspend trigger is not true any more!
                   disabled2actionTransition.setType(TransitionType::STRONGABORT);
               val action2runningTransition =  SyncchartsFactory::eINSTANCE.createTransition();
                   action2runningTransition.setTargetState(runningState);
                   action2runningTransition.setLabel("#");
                   action2runningTransition.setIsImmediate(true);
                   action2runningTransition.setDelay(0);
                   actionState.outgoingTransitions.add(action2runningTransition);
               val running2disabledTransition =  SyncchartsFactory::eINSTANCE.createTransition();
                   running2disabledTransition.setTargetState(disabledState);
                   running2disabledTransition.setIsImmediate(immediateSuspension);
                   if (immediateSuspension) {
                      running2disabledTransition.setDelay(0);
                   }
                   running2disabledTransition.setTrigger(suspendTrigger.copy);
                   runningState.outgoingTransitions.add(running2disabledTransition);
               
               // Create a region with two states running and disabled and the intermediate entry-action-macro-state
               val suspendActionRegion = SyncchartsFactory::eINSTANCE.createRegion();
               suspendActionRegion.setId("SuspendActionRegion" + state.hashCode);
               suspendActionRegion.states.add(actionState);
               suspendActionRegion.states.add(runningState);
               suspendActionRegion.states.add(disabledState);
               targetRootRegion.states.get(0).regions.add(suspendActionRegion);
               

            // Add disabled signal  to ALL hierarchically lower (immediate) transitions
            // that appear INSIDE the considered state (in its regions)
            var List<Transition> consideredTransitions = <Transition> newLinkedList;
            for (region : state.regions) {
               if (immediateSuspension) {
                   // consider ALL transitions (also immediate ones)
                   consideredTransitions.addAll(region.eAllContents().filter(typeof(Transition)).toList());
               } else {
                   // consider only NON-immediate transitions
                   consideredTransitions.addAll(region.eAllContents().filter(typeof(Transition)).filter(e | !e.isImmediate).toList());
               }
            } 
            
            for (consideredTransition : ImmutableList::copyOf(consideredTransitions)) {
                val disabledSignalRef = KExpressionsFactory::eINSTANCE.createValuedObjectReference
                    disabledSignalRef.setValuedObject(disabledSignal);
                val disabledExpression = buildDisabledExpression(consideredTransition.trigger, 
                                                                 disabledSignalRef);
                consideredTransition.setTrigger(disabledExpression);
            }
        } // if any suspension there
    }
    

    //-------------------------------------------------------------------------
    //--                        H I S T O R Y                                --
    //-------------------------------------------------------------------------
    // @requires: suspend
    
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
    //--                     D U R I N G       A C T I O N S                 --
    //-------------------------------------------------------------------------
    
    // Transforming During Actions.
    def Region transformDuringAction(Region rootRegion) {
        // Clone the complete SyncCharts region 
        val targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
        var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).toList();

        for(targetState : ImmutableList::copyOf(targetStates)) {
            // This statement we want to modify
            targetState.transformDuringAction(targetRootRegion);
        }
        
        targetRootRegion;
    }
    
    // Traverse all states and transform macro states that have actions to transform
    def void transformDuringAction(State state, Region targetRootRegion) {
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
    //--                     E N T R Y         A C T I O N S                 --
    //-------------------------------------------------------------------------
    // @requires: during actions

    // Transforming Entry and During Actions.
    def Region transformEntryAction(Region rootRegion) {
        // Clone the complete SyncCharts region 
        val targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
        var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).toList();

        for(targetState : ImmutableList::copyOf(targetStates)) {
            // This statement we want to modify
            targetState.transformEntryAction(targetRootRegion);
        }
        
        targetRootRegion;
    }
        
    // Traverse all states and transform macro states that have actions to transform
    def void transformEntryAction(State state, Region targetRootRegion) {
        // ENTRY ACTIONS :
        // First Idea: Create a macro state for all incoming transitions. Weak abort the
        // macro state and connect it to the original target. Put the action into an
        // transition within the macro state.
        //
        // Charles Andre: "Immediate abortions may cause instantaneous abortion of the state.
        // In this case the status stays IDLE, the transition is taken, DONE is returned: the
        // state is by-passed. If there is not an immediate strong abortion, then the state is 
        // effectively entered, and the entry actions are performed."
        //
        // This means that entry actions must be immediately-strong-abortable by the original outgoing
        // transitions.
        //
        // We create a new macro state EntrySurround around the original state, and connect the incoming and
        // outgoing transitions to it. Within the new macro state, we then create an initial state
        // with the entry actions as during actions. Then we connect this initial state to the
        // original state with an immediate (true triggered) transition.
        if (state.entryActions != null && state.entryActions.size > 0) {
                val surroundState = SyncchartsFactory::eINSTANCE.createState();
                surroundState.setId("EntrySurround" + state.hashCode);
                surroundState.setLabel("EntrySurround " + state.label);
                state.parentRegion.states.add(surroundState);
                // If the original state is an initial stat then the new surround state must also be
                // marked to be initial
                surroundState.setIsInitial(state.isInitial);
                // Move transitions to the new state
                for (transition : ImmutableList::copyOf(state.incomingTransitions)) {
                    surroundState.incomingTransitions.add(transition);
                }
                for (transition : ImmutableList::copyOf(state.outgoingTransitions)) {
                    surroundState.outgoingTransitions.add(transition);
                }
                state.incomingTransitions.clear();
                state.outgoingTransitions.clear();
                // Move original state into new state
                val surroundRegion = SyncchartsFactory::eINSTANCE.createRegion();
                surroundRegion.setId("EntrySurroundRegion" + state.hashCode);
                surroundState.regions.add(surroundRegion);
                surroundRegion.states.add(state);
                
                // Create initial state add it to the surround state
                val initialState  = SyncchartsFactory::eINSTANCE.createState();
                val initialTransition =  SyncchartsFactory::eINSTANCE.createTransition();
                initialState.setId("init" + state.hashCode);
                initialState.setLabel("init " + state.label);
                initialTransition.setLabel("#");
                initialTransition.setTargetState(state);
                initialTransition.setPriority(1);
                initialTransition.setDelay(0);
                initialTransition.setIsImmediate(true);
                initialState.setIsInitial(true);
                state.setIsInitial(false);
                initialState.outgoingTransitions.add(initialTransition);
                surroundRegion.states.add(initialState);
                
                // Create the body of the dummy state - containing the entry action
                // For every entry action: Create a region
                for (entryAction : state.entryActions) {
                    val entryActionCopy = entryAction.copy;
                    entryActionCopy.setIsImmediate(true);
                    // Create during actions for the initial state
                    initialState.innerActions.add(entryActionCopy);
                }

                // After transforming entry actions, erase them
                state.entryActions.clear();
       }
    }


    //-------------------------------------------------------------------------
    //--                      E X I T       A C T I O N S                    --
    //-------------------------------------------------------------------------
    // @requires: entry actions
    // @requires: during actions
    // @requires: suspend
    // @requires: valued signals

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
    
    // Transforming Exit Actions. 
    def Region transformExitAction(Region rootRegion) {
        // Clone the complete SyncCharts region 
        val targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
        var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).toList();

        for(targetState :  ImmutableList::copyOf(targetStates)) {
            // This statement we want to modify
            targetState.transformExitAction(targetRootRegion);
        }
        
        targetRootRegion;
    }
           
           
   // For a state, have a look at all outgoing transition weak abort triggers and collect them
   // OR them together and do this hierarchically to the outside.        
   def Expression getDisjunctionOfAllHierachicallyOutgoingWeakAborts(State state) {
       val returnExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression();
       val expressionList = state.getDisjunctionOfAllHierachicallyOutgoingWeakAbortsHelper;
       returnExpression.setOperator(OperatorType::OR);
       if (expressionList.size == 0) {
           return null;
       }
       else if (expressionList.size == 1) {
           return expressionList.head;
       }
       else {
          for (expression : expressionList) {
             if (expression != null) {
                returnExpression.subExpressions.add(expression);
             }
          }
          return returnExpression;
       }
   }
   def List<Expression> getDisjunctionOfAllHierachicallyOutgoingWeakAbortsHelper(State state) {
       var List<Expression> expressionList = <Expression> newLinkedList;
       val outgoingTransitions = state.outgoingTransitions.filter(e|e.type == TransitionType::WEAKABORT);
       for (outgoingTransition : outgoingTransitions) {
          expressionList.add(outgoingTransition.trigger.copy);
       }
       // collect from higher hierarchy level
       if (state.parentRegion != null && state.parentRegion.parentState != null) {
           expressionList.addAll(state.parentRegion.parentState.getDisjunctionOfAllHierachicallyOutgoingWeakAbortsHelper);
       }
       expressionList;
   }           
           
    // Traverse all states and transform macro states that have actions to transform
    def void transformExitAction(State state, Region targetRootRegion) {
        // EXIT ACTIONS : For every state with exit actions create a new top-level region and
        // create SET and RESET signals. This region contains a set and reset (inital) state
        // connected from reset to set with an intermediate macro state containing all the
        // exit actions and labeled with SET and not RESET. Another arc from set to reset labeled
        // with RESET. A self-arc from reset labeled with SET and RESET.
        // Every transition considered to be outgoing in any way emits the SET signal.
        // The entry action emits the RESET signal.
        // The state in question must have an immediate during action, resetting (emit RESET), BUT
        // important is that this is triggered and the trigger is excluded hierarchically by ALL
        // possibly outgoing transitions to the outside that are weak (in this case we do not want
        // to reset because we know we leave the state and want to remember the exiting 
        // (and NOT reset!!!) 
         //
        // DEPRECATED IDEA (has drawbacks, see below)
        // Create a macro state for all outgoing non-preempting(!) transitions. 
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
        // FLAW I: When re-entering one has to give precedence to reset but when exiting one wants
        // to giv precedence to set. => Valued signals are too limited, more preciseley the combine
        // function of valued signals. Better use a two state representation.
        //
        // FLAW II: When transforming a history transition with suspend, when re-entering,
        // entry actions are currently not executed again (propably they should?! FIXME: find out about
        // entry actions & history transitions). If using sustain actions this problem is solved BUT another
        // one arises. In the same state there will be a set and reset. Giving precedence to reset this
        // will result in calling the exit action AGAIN if the state is left outside.
        // 
        if (state.exitActions != null && state.exitActions.size > 0) {
               var List<Transition> consideredTransitions = <Transition> newLinkedList;
               consideredTransitions.addAll(state.hierarchicallyHigherOutgoingTransitions);
               
               // Add SET and RESET signal signal flag 
               val setSignal = KExpressionsFactory::eINSTANCE.createSignal();
               setSignal.setName("ExitSet" + state.id);
               setSignal.setIsInput(false);
               setSignal.setIsOutput(false);
               setSignal.setType(ValueType::PURE);
               targetRootRegion.states.get(0).signals.add(setSignal);
               
               val resetSignal = KExpressionsFactory::eINSTANCE.createSignal();
               resetSignal.setName("ExitReset" + state.id);
               resetSignal.setIsInput(false);
               resetSignal.setIsOutput(false);
               resetSignal.setType(ValueType::PURE);
               targetRootRegion.states.get(0).signals.add(resetSignal);
               
               // Add a Set and Reset State
               val resetState = SyncchartsFactory::eINSTANCE.createState();
               resetState.setId("ExitReset" + state.hashCode);
               resetState.setLabel("r");
               val setState = SyncchartsFactory::eINSTANCE.createState();
               setState.setId("ExitSet" + state.hashCode);
               setState.setIsInitial(true);
               setState.setLabel("s");
               
               // Create the body of the intermediate exit-action-macro-state - containing the exit actions
               // as during actions.
               val actionState = SyncchartsFactory::eINSTANCE.createState();
               actionState.setId("Exit" + state.hashCode);
               actionState.setLabel("Exit " + state.label);
               // For every exit action: Create a region
               for (exitAction : state.exitActions) {
                     val exitActionCopy = exitAction.copy;
                     exitActionCopy.setIsImmediate(true);
                     actionState.innerActions.add(exitActionCopy); 
               }               
               
               // Connect Set and Reset States with transitions (s.a. for a more detailed explanation)
               val reset2actionTransition =  SyncchartsFactory::eINSTANCE.createTransition();
                   reset2actionTransition.setTargetState(actionState);
                   val setSignalReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
                       setSignalReference.setValuedObject(setSignal);
                   reset2actionTransition.setTrigger(setSignalReference);
                   reset2actionTransition.setIsImmediate(true);
                   reset2actionTransition.setDelay(0);
                   resetState.outgoingTransitions.add(reset2actionTransition);
               val action2setTransition =  SyncchartsFactory::eINSTANCE.createTransition();
                   action2setTransition.setTargetState(setState);
                   actionState.outgoingTransitions.add(action2setTransition);
               val set2resetTransition =  SyncchartsFactory::eINSTANCE.createTransition();
                   set2resetTransition.setTargetState(resetState);
                   set2resetTransition.setIsImmediate(true);
                   set2resetTransition.setDelay(0);
                   val resetSignalReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference()
                       resetSignalReference.setValuedObject(resetSignal);
                   set2resetTransition.setTrigger(resetSignalReference);
                   setState.outgoingTransitions.add(set2resetTransition);
               
               // Create a region with two states set and reset and the intermediate exit-action-macro-state
               val exitActionRegion = SyncchartsFactory::eINSTANCE.createRegion();
               exitActionRegion.setId("ExitActionRegion" + state.hashCode);
               exitActionRegion.states.add(actionState);
               exitActionRegion.states.add(resetState);
               exitActionRegion.states.add(setState);
               targetRootRegion.states.get(0).regions.add(exitActionRegion);
               

               // Add a during action that resets the exit action
               val duringAction = SyncchartsFactory::eINSTANCE.createAction();
               duringAction.setDelay(0);
               duringAction.setIsImmediate(true);
               val resetEmission = SyncchartsFactory::eINSTANCE.createEmission();
                   resetEmission.setSignal(resetSignal);
               duringAction.effects.add(resetEmission);
//               val trigger = state.getDisjunctionOfAllHierachicallyOutgoingWeakAborts;
//               val notTrigger = KExpressionsFactory::eINSTANCE.createOperatorExpression;
//                   notTrigger.setOperator(OperatorType::NOT);
//                   notTrigger.subExpressions.add(trigger);
//               duringAction.setTrigger(notTrigger);
               state.innerActions.add(duringAction);

  
               for (transition : consideredTransitions) {
                   // For every considered transition add an emission of the set signal
                   // that will result in executing the exit action if it was not
                   // previously executed.
                   val setEmission = SyncchartsFactory::eINSTANCE.createEmission();
                       setEmission.setSignal(setSignal);
                   transition.effects.add(setEmission);
                }
                
                // After transforming exit actions, erase them
                state.exitActions.clear();
       }
       
    }
           
           
    //-------------------------------------------------------------------------
    //--              N O R M A L   T E R M I N A T I O N                    --
    //-------------------------------------------------------------------------
    // @requires: during actions

    
    // Transforming Normal Termination. 
    def Region transformNormalTermination(Region rootRegion) {
        // Clone the complete SyncCharts region 
        val targetRootRegion = CloningExtensions::clone(rootRegion) as Region;
        var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).toList();

        for(targetState :  ImmutableList::copyOf(targetStates)) {
            // This statement we want to modify
            targetState.transformNormalTermination(targetRootRegion);
        }
        
        targetRootRegion;
    }
           
    // Traverse all states and transform outgoing normal termination transitions into weak aborts
    def void transformNormalTermination(State state, Region targetRootRegion) {
               // This is the special case where we must taken care of a normal termination 
               if (state.outgoingTransitions.filter(e | e.type == TransitionType::NORMALTERMINATION).size > 0) {
                    val normalTerminationTransition = state.outgoingTransitions.filter(e | e.type == TransitionType::NORMALTERMINATION).head;
                    normalTerminationTransition.setType(TransitionType::WEAKABORT);
                    val triggerExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression();
                         triggerExpression.setOperator(OperatorType::AND);
                         triggerExpression.subExpressions
               
                    // Walk thru all regions that must terminate and create one termination signal per
                    // region. For the weak abort create a conjunction of these signals as the trigger.
                    for (region : state.regions) {
                         // Setup the auxiliarySignal as an OUTPUT to the module
                         val termSignal = KExpressionsFactory::eINSTANCE.createSignal();
                         termSignal.setName("term" + region.hashCode);
                         termSignal.setIsInput(false);
                         termSignal.setIsOutput(false);
                         termSignal.setType(ValueType::PURE);
                    
                         val finalStates = region.states.filter(e | e.isFinal == true);
                         // For all final states add a during action that emits the termination signal
                         for (finalState : finalStates) {
                              val termEmission = SyncchartsFactory::eINSTANCE.createEmission();
                              termEmission.setSignal(termSignal);
                              val termDuringAction =  SyncchartsFactory::eINSTANCE.createAction
                              termDuringAction.setDelay(0);
                              termDuringAction.setIsImmediate(true);
                              termDuringAction.effects.add(termEmission);
                              finalState.innerActions.add(termDuringAction);
                              // Set the final state flag to false
                              finalState.setIsFinal(false);
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

    }
           
           

}













