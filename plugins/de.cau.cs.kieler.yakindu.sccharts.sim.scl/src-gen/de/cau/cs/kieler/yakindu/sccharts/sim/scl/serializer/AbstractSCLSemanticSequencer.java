package de.cau.cs.kieler.yakindu.sccharts.sim.scl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.Conditional;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.Goto;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.Instruction;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.Label;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.Parallel;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.Program;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.SCLExpression;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.s.SPackage;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.services.SCLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.yakindu.sct.model.stext.stext.StextPackage;
import org.yakindu.sct.model.stext.stext.VariableDefinition;

@SuppressWarnings("all")
public abstract class AbstractSCLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SCLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SPackage.CONDITIONAL:
				if(context == grammarAccess.getConditionalRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Conditional(context, (Conditional) semanticObject); 
					return; 
				}
				else break;
			case SPackage.GOTO:
				if(context == grammarAccess.getGotoRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Goto(context, (Goto) semanticObject); 
					return; 
				}
				else break;
			case SPackage.INSTRUCTION:
				if(context == grammarAccess.getInstructionRule()) {
					sequence_Instruction(context, (Instruction) semanticObject); 
					return; 
				}
				else break;
			case SPackage.LABEL:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLabelRule()) {
					sequence_Label(context, (Label) semanticObject); 
					return; 
				}
				else break;
			case SPackage.PARALLEL:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getParallelRule()) {
					sequence_Parallel(context, (Parallel) semanticObject); 
					return; 
				}
				else break;
			case SPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case SPackage.SCL_EXPRESSION:
				if(context == grammarAccess.getAssignmentRule()) {
					sequence_Assignment(context, (SCLExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSCLExpressionRule()) {
					sequence_SCLExpression(context, (SCLExpression) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == StextPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case StextPackage.VARIABLE_DEFINITION:
				if(context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (VariableDefinition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     assignment=STRING
	 */
	protected void sequence_Assignment(EObject context, SCLExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SPackage.Literals.SCL_EXPRESSION__ASSIGNMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SPackage.Literals.SCL_EXPRESSION__ASSIGNMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentAccess().getAssignmentSTRINGTerminalRuleCall_0(), semanticObject.getAssignment());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=SCLExpression instructions=Instruction)
	 */
	protected void sequence_Conditional(EObject context, Conditional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Goto(EObject context, Goto semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (instruction=Assignment | secondinstructions=Instruction?)
	 */
	protected void sequence_Instruction(EObject context, Instruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     instruction=Instruction
	 */
	protected void sequence_Label(EObject context, Label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (firstinstruction=Instruction secondinstruction=Instruction)
	 */
	protected void sequence_Parallel(EObject context, Parallel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID variables+=Variable? instruction=Instruction)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {SCLExpression}
	 */
	protected void sequence_SCLExpression(EObject context, SCLExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Type|ID] name=STRING)
	 */
	protected void sequence_Variable(EObject context, VariableDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
