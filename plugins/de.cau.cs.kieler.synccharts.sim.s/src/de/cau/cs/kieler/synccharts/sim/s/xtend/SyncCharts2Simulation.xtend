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
		var originalStatesList = originalStates.toList;
		for(targetState : targetStates) {
			var originalState = originalStatesList.get(i);
			i = i + 1;
			val originalStateURIFragment = originalState.eResource.getURIFragment(originalState);
			var stateUID = AUXILIARY_VARIABLE_TAG + originalStateURIFragment.hashCode.toString().replace("-","M");
			// This statement we want to modify
			targetState.transformState(target, stateUID);
		}

		// For every state in the SyncChart do the transformation
		// Iterate over a copy of the list	
		i = 0;	
		var originalTransitionList = originalTransitions.toList;
		for(targetTransition : targetTransitions) {
			var originalTransition = originalTransitionList.get(i);
			i = i + 1;
			val originalTransitionURIFragment = originalTransition.eResource.getURIFragment(originalTransition);
			var transitionUID = AUXILIARY_VARIABLE_TAG + originalTransitionURIFragment.hashCode.toString().replace("-","M");
			// This statement we want to modify
			targetTransition.transformTransition(target, transitionUID);
		}
		
		target;
	}	
	
	def void transformTransition(Transition transition, Region targetRootRegion, String UID) {
		
	}
	
	def void transformState(State state, Region targetRootRegion, String UID) {
		
	}
	
//	// Instruction transformation in the fashion like described at the top.
//	def void transformInstruction(Instruction instruction, Program program, String UID) {
//		//SIMPLE TEST
//		if ((
//		   (instruction instanceof Prio)
//		   ||(instruction instanceof Trans)
//		   ||(instruction instanceof Fork)
//		   ||(instruction instanceof Join)
//		   ||(instruction instanceof Pause)
//		   ||(instruction instanceof Term)
//		   ||(instruction instanceof Halt)
//		   ||(instruction instanceof Emit)
//		   ||(instruction instanceof Abort)
//		   ||(instruction instanceof If)
//		   ||(instruction instanceof Await)
//		)) {
//			
//		// auxiliary signal
//		var auxiliarySignal = KExpressionsFactory::eINSTANCE.createSignal();
//		var auxiliaryEmitInstruction = SFactory::eINSTANCE.createEmit
//			
//		// Setup the auxiliarySignal as an OUTPUT to the module
//		auxiliarySignal.setName(UID);
//		auxiliarySignal.setIsInput(false);
//		auxiliarySignal.setIsOutput(true);
//		auxiliarySignal.setType(ValueType::PURE);
//		// Set the auxliiarySignal for emission 
//		auxiliaryEmitInstruction.setSignal(auxiliarySignal);
//		
//		// get the container of the instruction
//		var container = instruction.eContainer;
//		
//		if (container instanceof State) {
//			// Add auxiliarySignal to program
//			program.signals.add(auxiliarySignal);
//			val stateInstruction = container as State;
//			val instructionList = stateInstruction.instructions;
//			val index = instructionList.indexOf(instruction);
//			//System::out.println(index.toString + ":"+  stateInstruction.name.toString);
//			instructionList.add(index, auxiliaryEmitInstruction);
//		}
//		else if (container instanceof If) {
//			// Add auxiliarySignal to program
//			program.signals.add(auxiliarySignal);
//			val ifInstruction = container as If
//			val instructionList = ifInstruction.instructions;
//			val index = instructionList.indexOf(instruction);
//			instructionList.add(index, auxiliaryEmitInstruction);
//		}
//			
//		}
//		
//	}


}













