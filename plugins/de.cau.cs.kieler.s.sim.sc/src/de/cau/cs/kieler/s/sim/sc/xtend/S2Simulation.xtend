/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.s.sim.sc.xtend

import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.s.s.Abort
import de.cau.cs.kieler.s.s.Await
import de.cau.cs.kieler.s.s.Emit
import de.cau.cs.kieler.s.s.Fork
import de.cau.cs.kieler.s.s.Halt
import de.cau.cs.kieler.s.s.If
import de.cau.cs.kieler.s.s.Instruction
import de.cau.cs.kieler.s.s.Join
import de.cau.cs.kieler.s.s.Pause
import de.cau.cs.kieler.s.s.Prio
import de.cau.cs.kieler.s.s.Program
import de.cau.cs.kieler.s.s.SFactory
import de.cau.cs.kieler.s.s.State
import de.cau.cs.kieler.s.s.Term
import de.cau.cs.kieler.s.s.Trans
import org.eclipse.xtend.util.stdlib.CloningExtensions

import de.cau.cs.kieler.s.sim.sc.SSimSCPlugin

/**
 * Transformation of S code into S code that is
 * enriched with additional signals for each s statement.
 * 
 * These signals, here HP, are generated in the following fashion for a 
 * statement P:
 * 
 * Emit HP; P
 * 
 * As names for the signals are randomly generated and must be unique
 * there must be a mapping that keeps track which signal (name) belongs to
 * which original S statement.
 * 
 * @author cmot
 */
class S2Simulation {
    
    // General method to create the enriched S simulation code.
   	def Program transform2Simulation (Program program) {
   		var AUXILIARY_VARIABLE_TAG = SSimSCPlugin::AUXILIARY_VARIABLE_TAG
   		
		// Clone the complete S program 
   		var target = CloningExtensions::clone(program) as Program;

		var originalInstructions = program.eAllContents().toIterable().filter(typeof(Instruction));
		var targetInstructions = target.eAllContents().toIterable().filter(typeof(Instruction)).toList();
		
		// For every instruction in the S program do the transformation
		// Iterate over a copy of the list	
		var i = 0;	
		var originalInstructionsList = originalInstructions.toList;
		for(targetInstruction : targetInstructions) {
			var originalInstruction = originalInstructionsList.get(i);
			i = i + 1;
			val originalInstructionURIFragment = originalInstruction.eResource.getURIFragment(originalInstruction);
			var statementUID = AUXILIARY_VARIABLE_TAG + originalInstructionURIFragment.hashCode.toString().replace("-","M");
			// This statement we want to modify
			targetInstruction.transformInstruction(target, statementUID);
		}
		
		target;
	}	
	
	// Instruction transformation in the fashion like described at the top.
	def void transformInstruction(Instruction instruction, Program program, String UID) {
		//SIMPLE TEST
		if ((
		   (instruction instanceof Prio)
		   ||(instruction instanceof Trans)
		   ||(instruction instanceof Fork)
		   ||(instruction instanceof Join)
		   ||(instruction instanceof Pause)
		   ||(instruction instanceof Term)
		   ||(instruction instanceof Halt)
		   ||(instruction instanceof Emit)
		   ||(instruction instanceof Abort)
		   ||(instruction instanceof If)
		   ||(instruction instanceof Await)
		)) {
			
		// auxiliary signal
		var auxiliarySignal = KExpressionsFactory::eINSTANCE.createSignal();
		var auxiliaryEmitInstruction = SFactory::eINSTANCE.createEmit
			
		// Setup the auxiliarySignal as an OUTPUT to the module
		auxiliarySignal.setName(UID);
		auxiliarySignal.setIsInput(false);
		auxiliarySignal.setIsOutput(true);
		auxiliarySignal.setType(ValueType::PURE);
		// Set the auxliiarySignal for emission 
		auxiliaryEmitInstruction.setSignal(auxiliarySignal);
		
		// get the container of the instruction
		var container = instruction.eContainer;
		
		if (container instanceof State) {
			// Add auxiliarySignal to program
			program.signals.add(auxiliarySignal);
			val stateInstruction = container as State;
			val instructionList = stateInstruction.instructions;
			val index = instructionList.indexOf(instruction);
			System::out.println(index.toString + ":"+  stateInstruction.name.toString);
			instructionList.add(index, auxiliaryEmitInstruction);
		}
		else if (container instanceof If) {
			// Add auxiliarySignal to program
			program.signals.add(auxiliarySignal);
			val ifInstruction = container as If
			val instructionList = ifInstruction.instructions;
			val index = instructionList.indexOf(instruction);
			instructionList.add(index, auxiliaryEmitInstruction);
		}
			
		}
		
	}


}













