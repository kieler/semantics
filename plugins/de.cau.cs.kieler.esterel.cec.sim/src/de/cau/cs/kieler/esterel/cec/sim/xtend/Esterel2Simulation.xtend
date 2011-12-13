package de.cau.cs.kieler.esterel.cec.sim.xtend

import de.cau.cs.kieler.synccharts.*
import de.cau.cs.kieler.core.kexpressions.*
import java.util.*
import com.google.inject.Inject


import org.eclipse.emf.ecore.EObject

import de.cau.cs.kieler.core.kexpressions.*
import de.cau.cs.kieler.kies.esterel.*
import de.cau.cs.kieler.kies.esterel.impl.*

import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipse.xtend.util.stdlib.CloningExtensions
import org.eclipse.xtend.util.stdlib.TraceComponent

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import static extension org.eclipse.xtext.xtend2.lib.ResourceSetExtensions.*
import static extension org.eclipse.xtext.xtend2.lib.EObjectExtensions.*

// Transformation of Esterel code into Esterelcode that is
// enriched with additional signals for each statement.

// These signals, here HP, are generated in the following fashion for a 
// statement P:
// 
//  signal AP in 
//  	[P; emit AP; || emit HP; abort sustain HP when immediate AP] 
//  end 
//
// As names for the signals are randomly generated and must be unique
// there must be a mapping that keeps track which sigal (name) belongs to
// which original Esterel statement.

class Esterel2Simulation {
    
    // Generale method to create the enriched Esterel simulation code
   	def create target : EsterelFactory::eINSTANCE.createProgram transform2Simulation (Program program) {
   		var AUXILIARY_VARIABLE_TAG = "oESTERELoAUXILIARYoVARIABLEoTAGoWILLoBEoREMOVEDo"
   		
		// Clone the complete Esterel program
		for (module : program.modules) {
			target.modules.add(CloningExtensions::clone(module) as Module);	
		}
		
		var originalStatements = program.allContentsIterable.filter(typeof(Statement));
		var targetStatements = target.allContentsIterable.filter(typeof(Statement));
		var targetStatementsCopy = targetStatements.toList;
		
		var targetMainmodule = target.allContentsIterable.filter(typeof(Module)).toList.get(0);
		
		// For every statement in the Esterel program do the transformation
		// Iterate over a copy of the list	
		var i = 0;	
		var originalStatementsList = originalStatements.toList;
		for(targetStatement : targetStatementsCopy) {
			var originalStatement = originalStatementsList.get(i);
			i = i + 1;
			// First find the according statement in the orginal statements list
			//val predicate = [ Statement statement | originalStatement == statement ]
			//var targetStatement = targetStatements.filter(predicate).toList.get(0) as Statement;
//			var statementUID = AUXILIARY_VARIABLE_TAG + originalStatement.eResource.getURIFragment(originalStatement).replace("/","x").replace("@","").replace(".","") ;//.hashCode.toString();
			var statementUID = AUXILIARY_VARIABLE_TAG + originalStatement.eResource.getURIFragment(originalStatement).hashCode.toString().replace("-","M");
			// This statement we want to modify
			targetStatement.transformStatement(targetMainmodule, statementUID);
		}
		
	}	
	
	
	def create pause : EsterelFactory::eINSTANCE.createPause createPause(Object object) {
	}
	def create parallel : EsterelFactory::eINSTANCE.createParallel createParallel(Object object) {
	}
	def create sequence : EsterelFactory::eINSTANCE.createSequence createSequence(Object object) {
	}
	
	
//	def create reslut: new PauseImpl() createPause() {
//	 resu
//	}

	// Statement transformation in the fashion like described at the top
	def void transformStatementSimple(Statement statement, Module mainmodule, String UID) {
		//SIMPLE TEST
		if ((
		   (statement instanceof Abort)
		   ||(statement instanceof Await)
		   ||(statement instanceof Do)
		   ||(statement instanceof Emit)
		   ||(statement instanceof EveryDo)
		   ||(statement instanceof Exit)
		   ||(statement instanceof Halt)
		   ||(statement instanceof IfTest)
		   ||(statement instanceof Loop)
		   ||(statement instanceof Nothing)
		   ||(statement instanceof Pause)
		   ||(statement instanceof Present)
		   ||(statement instanceof Repeat)
		   ||(statement instanceof Run)
		   ||(statement instanceof Suspend)
		   ||(statement instanceof Sustain)
		)) {
			var container = statement.eContainer;
			var blockStatement = EsterelFactory::eINSTANCE.createBlock()
			blockStatement.addStatement(statement);
			container.addStatement(blockStatement);
		}
		
	}

	
	// Statement transformation in the fashion like described at the top
	def void transformStatement(Statement statement, Module mainmodule, String UID) {
		var container = statement.eContainer;

		var parallelStatement = EsterelFactory::eINSTANCE.createParallel()
		var pauseStatement = EsterelFactory::eINSTANCE.createPause()
		var sequenceStatement1 = EsterelFactory::eINSTANCE.createSequence()
		var sequenceStatement2 = EsterelFactory::eINSTANCE.createSequence()
		var blockStatement = EsterelFactory::eINSTANCE.createBlock()
		var blockStatement2 = EsterelFactory::eINSTANCE.createBlock()

		// abort signal
		var abortSignalDecl = EsterelFactory::eINSTANCE.createLocalSignalDecl()
		var abortSignalLink = EsterelFactory::eINSTANCE.createLocalSignal()
		var abortISignal = KExpressionsFactory::eINSTANCE.createISignal();
		var abortEmitStatement = EsterelFactory::eINSTANCE.createEmit();

		// auxiliary signal
				// Must be linked in Output
		var auxiliarySignalISignal = KExpressionsFactory::eINSTANCE.createISignal();
				// Must be linked in ModuleBody->interface
		var auxiliarySignalOutput = KExpressionsFactory::eINSTANCE.createOutput();
		var auxiliaryEmitStatement = EsterelFactory::eINSTANCE.createEmit();
		var auxiliarySustainStatement = EsterelFactory::eINSTANCE.createSustain();


		var abortStatement = EsterelFactory::eINSTANCE.createAbort();
		var abortInstanceStatement =  EsterelFactory::eINSTANCE.createAbortInstance();
		var abortDelay =  EsterelFactory::eINSTANCE.createDelayExpr();
		var abortDelayEvent = EsterelFactory::eINSTANCE.createDelayEvent();
		var abortValuedObjectReference = KExpressionsFactory::eINSTANCE.createValuedObjectReference();
		
		//No Parallel
		//No Sequence
		if ((
//			 (statement instanceof LocalSignalDecl)
//		   ||(statement instanceof Assignment)
		   (statement instanceof Abort)
		   ||(statement instanceof Await)
//		   ||(statement instanceof ProcCall)
		   ||(statement instanceof Do)
		   ||(statement instanceof Emit)
		   ||(statement instanceof EveryDo)
		   ||(statement instanceof Exit)
		   ||(statement instanceof Halt)
		   ||(statement instanceof IfTest)
		   ||(statement instanceof Loop)
//		   ||(statement instanceof LoopDelay)
		   ||(statement instanceof Nothing)
		   ||(statement instanceof Pause)
		   ||(statement instanceof Present)
		   ||(statement instanceof Repeat)
		   ||(statement instanceof Run)
		   ||(statement instanceof Suspend)
		   ||(statement instanceof Sustain)
//		   ||(statement instanceof Trap)
//		   ||(statement instanceof LocalVariable)
//		   ||(statement instanceof Exec)
		)) {
			    // Setup the abortSignal
				abortISignal.setName("AP");
				abortISignal.setIsInput(false);
				abortISignal.setIsOutput(false);
				abortISignal.setType(ValueType::PURE);
				abortSignalLink.signal.add(abortISignal);
				abortSignalDecl.setSignalList(abortSignalLink as LocalSignalList);
				// Set the abortSignal for emission (to abort parallel sustain)
				abortEmitStatement.setSignal(abortISignal);

				// Setup the auxiliarySignal as an OUTPUT to the module
				auxiliarySignalISignal.setName(UID);
				auxiliarySignalISignal.setIsInput(false);
				auxiliarySignalISignal.setIsOutput(false);
				auxiliarySignalISignal.setType(ValueType::PURE);
				// Add auxiliarySignal to module
				auxiliarySignalOutput.signals.add(auxiliarySignalISignal);
				mainmodule.interface.intSignalDecls.add(auxiliarySignalOutput);
				// Set the auxliiarySignal for emission and for sustain
				auxiliaryEmitStatement.setSignal(auxiliarySignalISignal);
				auxiliarySustainStatement.setSignal(auxiliarySignalISignal);
				
		 		// Build immediate abort
		 		abortStatement.setStatement(auxiliarySustainStatement);
		 		        abortValuedObjectReference.setValuedObject(abortISignal);
  		 		      abortDelayEvent.setExpr(abortValuedObjectReference);
  		 		    abortDelay.setEvent(abortDelayEvent);
    	 		    abortDelay.setIsImmediate(true);
		 		  abortInstanceStatement.setDelay(abortDelay)
		 		abortStatement.setBody(abortInstanceStatement);
		 		
				
				// Sequence of sustain statement
				sequenceStatement2.list.add(auxiliaryEmitStatement)
				sequenceStatement2.list.add(abortStatement)
				
				// Sequence of original statement followed by the emit of the strong abort signal
				sequenceStatement1.list.add(statement);
				sequenceStatement1.list.add(abortEmitStatement);
				
			    // After this statement will have a new EContainer (wrapperStatement)
				parallelStatement.list.add(sequenceStatement1)
				parallelStatement.list.add(sequenceStatement2)
				blockStatement.addStatement(parallelStatement)

				abortSignalDecl.addStatement(blockStatement)

				// Encapsulate inner [ || ] in local abort signal declaration
				// Add outer [] to this
				blockStatement2.addStatement(abortSignalDecl)
				// Add it to initial container
				container.addStatement(blockStatement2);

// SIMPLE TEST
//				blockStatement.addStatement(statement)
//				container.addStatement(blockStatement);
		}
		
	}
	
	// Replace an removeStatement with an addStatement
	// Multiple statements
	def dispatch void addStatement(ModuleBody parent, Statement addStatement) {
		parent.statements.clear();
		parent.statements.add(addStatement);
	}
	def dispatch void addStatement(Parallel parent, Statement addStatement) {
		parent.list.add(addStatement);
	}
	def dispatch void addStatement(Sequence parent, Statement addStatement) {
		parent.list.add(addStatement);
	}
	
	
	// Single statement
	def dispatch void addStatement(StatementContainer parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
//	// Default case
//	def dispatch void addStatement(Statement parent, Statement addStatement) {
//		// Do nothing in the default case
//	}

}













