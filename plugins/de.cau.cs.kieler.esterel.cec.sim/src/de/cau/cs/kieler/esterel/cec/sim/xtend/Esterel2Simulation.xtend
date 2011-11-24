package de.cau.cs.kieler.esterel.cec.sim.xtend

import de.cau.cs.kieler.synccharts.*
import de.cau.cs.kieler.core.kexpressions.*
import java.util.*
import com.google.inject.Inject
import org.eclipse.xtend.util.stdlib.cloning
import org.eclipse.xtend.util.stdlib.tracing

import org.eclipse.emf.ecore.EObject

import de.cau.cs.kieler.core.kexpressions.*
import de.cau.cs.kieler.kies.esterel.*
import de.cau.cs.kieler.kies.esterel.impl.*

import org.eclipse.xtext.xtend2.lib.StringConcatenation
import org.eclipse.xtend.util.stdlib.CloningExtensions

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
		// Clone the complete Esterel program
		for (module : program.modules) {
			target.modules.add(CloningExtensions::clone(module) as Module);	
		}
		
		var statements = target.allContentsIterable.filter(typeof(Statement));
		var statementsCopy = statements;
		
		// For every statement in the Esterel program do the transformation
		// Iterate over a copy of the list		
		for(statementCopy : statementsCopy) {
			// First find the according statement in the orginal statements list
			val predicate = [ Statement statement | statementCopy == statement ]
			var statement = statements.filter(predicate).toList.get(0) as Statement;
			// This statement we want to modify
			statement.transformStatement();
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
	def void transformStatement(Statement statement) {
		var container = statement.eContainer;

		var parallelStatement = EsterelFactory::eINSTANCE.createParallel()
		var pauseStatement = EsterelFactory::eINSTANCE.createPause()
		var sequenceStatement1 = EsterelFactory::eINSTANCE.createSequence()
		var sequenceStatement2 = EsterelFactory::eINSTANCE.createSequence()
		var blockStatement = EsterelFactory::eINSTANCE.createBlock()
		var blockStatement2 = EsterelFactory::eINSTANCE.createBlock()
		var abortSignalDecl = EsterelFactory::eINSTANCE.createLocalSignalDecl()
		var abortSignalLink = EsterelFactory::eINSTANCE.createLocalSignal()
		
		var emitAbortStatement = EsterelFactory::eINSTANCE.createEmit();
		//var emitH = EsterelFactory::eINSTANCE.createEmit();
		
		//var abortISignal = KExpressionsFactory::eINSTANCE.createISignal();
		var abortISignal = KExpressionsFactory::eINSTANCE.createISignal();
//		var List<Signal> abortSignalArrayList = new ArrayList();
		//var abortSignalList = EsterelFactory::eINSTANCE.createLocalSignalList();
//		var pauseStatement = createPause(statement)
//		var sequenceStatement = createSequence(statement)
//		var parallelStatement = createParallel(statement)
		
		//No Parallel
		//No Sequence
		if ((
//			 (statement instanceof LocalSignalDecl)
//		   ||(statement instanceof Assignment)
//		   ||(statement instanceof Abort)
//		     (statement instanceof Await)
//		   ||(statement instanceof ProcCall)
//		   ||(statement instanceof Do)
		   (statement instanceof Emit)
//		   ||(statement instanceof EveryDo)
//		   ||(statement instanceof Exit)
//		   ||(statement instanceof Halt)
//		   ||(statement instanceof IfTest)
//		   ||(statement instanceof Loop)
//		   ||(statement instanceof LoopDelay)
//		   ||(statement instanceof Nothing)
//		   ||(statement instanceof Pause)
//		   ||(statement instanceof Present)
//		   ||(statement instanceof Repeat)
//		   ||(statement instanceof Run)
//		   ||(statement instanceof Suspend)
//		   ||(statement instanceof Sustain)
//		   ||(statement instanceof Trap)
//		   ||(statement instanceof LocalVariable)
//		   ||(statement instanceof Exec)
		)) {
//				abortISignal.setName("AP");
//				abortISignal.setIsInput(false);
//				abortISignal.setIsOutput(false);
//				abortISignal.setType(ValueType::PURE);
//				abortSignalLink.signal.add(abortISignal);
//				abortSignalDecl.setSignalList(abortSignalLink as LocalSignalList);
//				abortSignalDecl.addStatement(blockStatement)
//				
//				sequenceStatement1.list.add(statement);
//				sequenceStatement1.list.add(emitAbortStatement);
//				
//			    // After this statement will have a new EContainer (wrapperStatement)
//				parallelStatement.list.add(sequenceStatement1)
//				parallelStatement.list.add(pauseStatement)
//				blockStatement.addStatement(parallelStatement)
//
//				// Encapsulate inner [ || ] in local abort signal declaration
//				// Add outer [] to this
//				blockStatement2.addStatement(abortSignalDecl)
//				// Add it to initial container
//				container.addStatement(blockStatement2);

				blockStatement.addStatement(statement)
				container.addStatement(blockStatement);
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
	def dispatch void addStatement(LocalSignalDecl parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
	def dispatch void addStatement(Block parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
	def dispatch void addStatement(Abort parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
	def dispatch void addStatement(AbortInstance parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
	def dispatch void addStatement(AbortCaseSingle parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
	def dispatch void addStatement(AwaitInstance parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
	def dispatch void addStatement(Do parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
	def dispatch void addStatement(DoWatchingEnd parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
	def dispatch void addStatement(EveryDo parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
	def dispatch void addStatement(ThenPart parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
	def dispatch void addStatement(ElsePart parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
	def dispatch void addStatement(LoopBody parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
	def dispatch void addStatement(PresentCase parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
	def dispatch void addStatement(Repeat parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
	def dispatch void addStatement(Suspend parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
	def dispatch void addStatement(Trap parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
	def dispatch void addStatement(TrapHandler parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
	def dispatch void addStatement(LocalVariable parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
	def dispatch void addStatement(Exec parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
	def dispatch void addStatement(ExecCase parent, Statement addStatement) {
		parent.setStatement(addStatement);
	}
	// Default case
	def dispatch void addStatement(Statement parent, Statement addStatement) {
		// Do nothing in the default case
	}

}













