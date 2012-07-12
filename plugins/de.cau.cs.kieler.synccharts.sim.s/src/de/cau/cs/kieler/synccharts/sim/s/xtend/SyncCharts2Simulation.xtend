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

import org.eclipse.xtend.util.stdlib.CloningExtensions

import de.cau.cs.kieler.synccharts.sim.s.SyncChartsSimSPlugin
import de.cau.cs.kieler.synccharts.Region
import de.cau.cs.kieler.synccharts.State
import de.cau.cs.kieler.synccharts.Transition
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.synccharts.TransitionType
import de.cau.cs.kieler.core.kexpressions.OperatorType

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
 * 
 * ATTENTION: Iff the state is a final state, then do not emit the
 * in-state-auxiliary signal inside (2.) because the thread in this case
 * cannot terminate! (This would change the semantics)
 * 
 * ATTENTION: Iff the state has an outgoing normal termination then
 * we cannot do (2.) because this would also corrupt the semantics
 * and the normal termination will never trigger.
 * In this case we need another construct (3.):
 * a) for every concurrent region we need a state representing its running or dead
 * b) 
 * 
 * 
 * Signal HT are generated in the following fashion for a
 * transition T:
 * 
 * As names for the signals are randomly generated and must be unique
 * there must be a mapping that keeps track which signal (name) belongs to
 * which original S statement.
 * 
 * @author cmot
 */
class SyncCharts2Simulation {
    
    // General method to create the enriched S simulation code.
   	def Region transform2Simulation (Region rootRegion) {
   		var AUXILIARY_VARIABLE_TAG = SyncChartsSimSPlugin::AUXILIARY_VARIABLE_TAG
   		
		// Clone the complete SyncCharts region 
   		var target = CloningExtensions::clone(rootRegion) as Region;

		var originalStates = rootRegion.eAllContents().toIterable().filter(typeof(State));
		var targetStates = target.eAllContents().toIterable().filter(typeof(State)).toList();

		var originalTransitions = rootRegion.eAllContents().toIterable().filter(typeof(Transition));
		var targetTransitions = target.eAllContents().toIterable().filter(typeof(Transition)).toList();

		// For every state in the SyncChart do the transformation
		// Iterate over a copy of the list	
		var i = 0;	
		val originalTransitionList = originalTransitions.toList;
		for(targetTransition : targetTransitions) {
			val originalTransition = originalTransitionList.get(i);
			i = i + 1;
			val originalTransitionURIFragment = originalTransition.eResource.getURIFragment(originalTransition);
			val transitionUID = AUXILIARY_VARIABLE_TAG + originalTransitionURIFragment.hashCode.toString().replace("-","M");
			// This statement we want to modify
			targetTransition.transformTransition(target, transitionUID);
		}
		

		// For every state in the SyncChart do the transformation
		// Iterate over a copy of the list	
		i = 0;	
		val originalStatesList = originalStates.toList;
		for(targetState : targetStates) {
			val originalState = originalStatesList.get(i);
			i = i + 1;
			val originalStateURIFragment = originalState.eResource.getURIFragment(originalState);
			val stateUID = AUXILIARY_VARIABLE_TAG + originalStateURIFragment.hashCode.toString().replace("-","M");
			// This statement we want to modify
			targetState.transformState(target, stateUID);
		}

		target;
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
		// Final states will be transformed if there is a normal termination with a self loop
		if (state.isFinal) {
			state.setIsFinal(false);
			return;
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
						// (this includes the just created selfloop
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
			
				normalTerminationTransition.setTrigger(triggerExpression);
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
		
			auxiliaryState.setId("state" + UID);
			auxiliaryState.setIsInitial(true);
			auxiliaryState.outgoingTransitions.add(auxiliarySelfLoop);
		
			auxiliaryRegion.states.add(auxiliaryState);
			state.regions.add(auxiliaryRegion);
		
			// Add auxiliarySignal to first (and only) root region state SyncCharts main interface
  			targetRootRegion.states.get(0).signals.add(auxiliarySignal);
		}
		
	}
	


}













