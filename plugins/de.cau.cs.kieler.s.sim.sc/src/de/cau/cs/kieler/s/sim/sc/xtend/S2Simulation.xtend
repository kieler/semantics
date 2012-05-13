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


// Transformation of S code into S code that is
// enriched with additional signals for each s statement.

// These signals, here HP, are generated in the following fashion for a 
// statement P:
// 
// Emit HP; P 
//
// As names for the signals are randomly generated and must be unique
// there must be a mapping that keeps track which signal (name) belongs to
// which original S statement.

class S2Simulation {
    
    // Generale method to create the enriched Esterel simulation code
   	def Program transform2Simulation (Program program) {
   		var AUXILIARY_VARIABLE_TAG = "oSoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo"
   		
		// Clone the complete S program
   		var target = CloningExtensions::clone(program) as Program;

		var originalInstructions = program.eAllContents().toIterable().filter(typeof(Instruction));
		var targetInstructions = target.eAllContents().toIterable().filter(typeof(Instruction));
		var targetInstructionsCopy = targetInstructions.toList;
		
		// Ensure an interface declaration
		if (program.programInterface == null) {
			var programInterface = SFactory::eINSTANCE.createProgramInterface(); 
			program.setProgramInterface(programInterface);
		} 
		
		// For every instruction in the S program do the transformation
		// Iterate over a copy of the list	
		var i = 0;	
		var originalInstructionsList = originalInstructions.toList;
		for(targetInstruction : targetInstructionsCopy) {
			var originalInstruction = originalInstructionsList.get(i);
			i = i + 1;
			var statementUID = AUXILIARY_VARIABLE_TAG + originalInstruction.eResource.getURIFragment(originalInstruction).hashCode.toString().replace("-","M");
			// This statement we want to modify
			targetInstruction.transformInstruction(program, statementUID);
		}
		
		target;
	}	
	
	

	// Instruction transformation in the fashion like described at the top
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
				// Must be linked in Output
		var auxiliarySignalISignal = KExpressionsFactory::eINSTANCE.createISignal();
				// Must be linked in ModuleBody->interface
		var auxiliarySignalOutput = KExpressionsFactory::eINSTANCE.createOutput();
		var auxiliaryEmitInstruction = SFactory::eINSTANCE.createEmit
			
		// Setup the auxiliarySignal as an OUTPUT to the module
		auxiliarySignalISignal.setName(UID);
		auxiliarySignalISignal.setIsInput(false);
		auxiliarySignalISignal.setIsOutput(false);
		auxiliarySignalISignal.setType(ValueType::PURE);
		// Add auxiliarySignal to module
		auxiliarySignalOutput.signals.add(auxiliarySignalISignal);
		program.programInterface.interfaceSignalDecls.add(auxiliarySignalOutput);
		// Set the auxliiarySignal for emission and for sustain
		auxiliaryEmitInstruction.setSignal(auxiliarySignalISignal);
		
		// get the container of the instruction
		var container = instruction.eContainer;
		
		if (container instanceof State) {
			val stateInstruction = container as State;
			val instructionList = stateInstruction.instructions;
			val index = instructionList.indexOf(instruction);
			instructionList.add(index, auxiliaryEmitInstruction);
		}
		if (container instanceof If) {
			val ifInstruction = container as If
			val instructionList = ifInstruction.instructions;
			val index = instructionList.indexOf(instruction);
			instructionList.add(index, auxiliaryEmitInstruction);
		}
			
		}
		
	}


}













