package de.cau.cs.kieler.yakindu.sccharts.sim.scl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Assignment;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Comment;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Goto;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionSet;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Label;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.LocalVariable;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Pause;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Scope;
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
		if(semanticObject.eClass().getEPackage() == SclPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SclPackage.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getInstructionOrCommentRule() ||
				   context == grammarAccess.getInstructionOrCommentSequenceRule() ||
				   context == grammarAccess.getInstructionSetSingleAssignmentRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.COMMENT:
				if(context == grammarAccess.getCommentRule() ||
				   context == grammarAccess.getInstructionOrCommentRule() ||
				   context == grammarAccess.getInstructionOrCommentSequenceRule()) {
					sequence_Comment(context, (Comment) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.CONDITIONAL:
				if(context == grammarAccess.getConditionalRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getInstructionOrCommentRule() ||
				   context == grammarAccess.getInstructionOrCommentSequenceRule() ||
				   context == grammarAccess.getInstructionSetSingleAssignmentRule()) {
					sequence_Conditional(context, (Conditional) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.GOTO:
				if(context == grammarAccess.getGotoRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getInstructionOrCommentRule() ||
				   context == grammarAccess.getInstructionOrCommentSequenceRule() ||
				   context == grammarAccess.getInstructionSetSingleAssignmentRule()) {
					sequence_Goto(context, (Goto) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.INSTRUCTION_SET:
				if(context == grammarAccess.getInstructionSetRule()) {
					sequence_InstructionSet(context, (InstructionSet) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.LABEL:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getInstructionOrCommentRule() ||
				   context == grammarAccess.getInstructionOrCommentSequenceRule() ||
				   context == grammarAccess.getInstructionSetSingleAssignmentRule() ||
				   context == grammarAccess.getLabelRule()) {
					sequence_Label(context, (Label) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.LOCAL_VARIABLE:
				if(context == grammarAccess.getLocalVariableRule()) {
					sequence_LocalVariable(context, (LocalVariable) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.PARALLEL:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getInstructionOrCommentRule() ||
				   context == grammarAccess.getInstructionOrCommentSequenceRule() ||
				   context == grammarAccess.getInstructionSetSingleAssignmentRule() ||
				   context == grammarAccess.getParallelRule()) {
					sequence_Parallel(context, (Parallel) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.PAUSE:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getInstructionOrCommentRule() ||
				   context == grammarAccess.getInstructionOrCommentSequenceRule() ||
				   context == grammarAccess.getInstructionSetSingleAssignmentRule() ||
				   context == grammarAccess.getPauseRule()) {
					sequence_Pause(context, (Pause) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.SCOPE:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getInstructionOrCommentRule() ||
				   context == grammarAccess.getInstructionOrCommentSequenceRule() ||
				   context == grammarAccess.getInstructionSetSingleAssignmentRule() ||
				   context == grammarAccess.getScopeRule()) {
					sequence_Scope(context, (Scope) semanticObject); 
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
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SclPackage.Literals.ASSIGNMENT__ASSIGNMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SclPackage.Literals.ASSIGNMENT__ASSIGNMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentAccess().getAssignmentSTRINGTerminalRuleCall_0(), semanticObject.getAssignment());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     comment=SL_COMMENT
	 */
	protected void sequence_Comment(EObject context, Comment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SclPackage.Literals.COMMENT__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SclPackage.Literals.COMMENT__COMMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCommentAccess().getCommentSL_COMMENTTerminalRuleCall_0(), semanticObject.getComment());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=SCLExpression conditional=InstructionSet)
	 */
	protected void sequence_Conditional(EObject context, Conditional semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SclPackage.Literals.CONDITIONAL__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SclPackage.Literals.CONDITIONAL__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, SclPackage.Literals.CONDITIONAL__CONDITIONAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SclPackage.Literals.CONDITIONAL__CONDITIONAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionalAccess().getExpressionSCLExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getConditionalAccess().getConditionalInstructionSetParserRuleCall_3_0(), semanticObject.getConditional());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Goto(EObject context, Goto semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SclPackage.Literals.GOTO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SclPackage.Literals.GOTO__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGotoAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (instructions+=InstructionOrCommentSequence+ instructions+=Instruction instructions+=Comment?) | 
	 *         (instructions+=Comment instructions+=Instruction) | 
	 *         (instructions+=Instruction instructions+=Comment) | 
	 *         instructions+=Instruction
	 *     )
	 */
	protected void sequence_InstructionSet(EObject context, InstructionSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Label(EObject context, Label semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SclPackage.Literals.LABEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SclPackage.Literals.LABEL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=STRING name=STRING)
	 */
	protected void sequence_LocalVariable(EObject context, LocalVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SclPackage.Literals.LOCAL_VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SclPackage.Literals.LOCAL_VARIABLE__TYPE));
			if(transientValues.isValueTransient(semanticObject, SclPackage.Literals.LOCAL_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SclPackage.Literals.LOCAL_VARIABLE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocalVariableAccess().getTypeSTRINGTerminalRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getLocalVariableAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (threads+=InstructionSet threads+=InstructionSet+)
	 */
	protected void sequence_Parallel(EObject context, Parallel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Pause}
	 */
	protected void sequence_Pause(EObject context, Pause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID variables+=Variable? program=InstructionSet)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variables+=LocalVariable* scope=InstructionSet)
	 */
	protected void sequence_Scope(EObject context, Scope semanticObject) {
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
