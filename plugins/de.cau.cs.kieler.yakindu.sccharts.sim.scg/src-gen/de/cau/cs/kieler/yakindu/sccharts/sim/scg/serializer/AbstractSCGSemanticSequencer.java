package de.cau.cs.kieler.yakindu.sccharts.sim.scg.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Assignment;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Comment;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Conditional;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Dependency;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Goto;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionSet;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Label;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Parallel;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Pause;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Scope;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.services.SCGGrammarAccess;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.LocalVariable;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.serializer.SCLSemanticSequencer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.yakindu.sct.model.stext.stext.StextPackage;
import org.yakindu.sct.model.stext.stext.VariableDefinition;

@SuppressWarnings("all")
public abstract class AbstractSCGSemanticSequencer extends SCLSemanticSequencer {

	@Inject
	private SCGGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ScgPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ScgPackage.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getInstructionOrCommentRule() ||
				   context == grammarAccess.getInstructionOrCommentSequenceRule() ||
				   context == grammarAccess.getInstructionSetSingleAssignmentRule()) {
					sequence_Assignment_Instruction(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case ScgPackage.COMMENT:
				if(context == grammarAccess.getCommentRule() ||
				   context == grammarAccess.getInstructionOrCommentRule() ||
				   context == grammarAccess.getInstructionOrCommentSequenceRule()) {
					sequence_Comment(context, (Comment) semanticObject); 
					return; 
				}
				else break;
			case ScgPackage.CONDITIONAL:
				if(context == grammarAccess.getConditionalRule()) {
					sequence_Conditional(context, (Conditional) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getInstructionOrCommentRule() ||
				   context == grammarAccess.getInstructionOrCommentSequenceRule() ||
				   context == grammarAccess.getInstructionSetSingleAssignmentRule()) {
					sequence_Conditional_Instruction(context, (Conditional) semanticObject); 
					return; 
				}
				else break;
			case ScgPackage.DEPENDENCY:
				if(context == grammarAccess.getDependencyRule()) {
					sequence_Dependency(context, (Dependency) semanticObject); 
					return; 
				}
				else break;
			case ScgPackage.GOTO:
				if(context == grammarAccess.getGotoRule()) {
					sequence_Goto(context, (Goto) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getInstructionOrCommentRule() ||
				   context == grammarAccess.getInstructionOrCommentSequenceRule() ||
				   context == grammarAccess.getInstructionSetSingleAssignmentRule()) {
					sequence_Goto_Instruction(context, (Goto) semanticObject); 
					return; 
				}
				else break;
			case ScgPackage.INSTRUCTION_SET:
				if(context == grammarAccess.getInstructionSetRule()) {
					sequence_InstructionSet(context, (InstructionSet) semanticObject); 
					return; 
				}
				else break;
			case ScgPackage.LABEL:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getInstructionOrCommentRule() ||
				   context == grammarAccess.getInstructionOrCommentSequenceRule() ||
				   context == grammarAccess.getInstructionSetSingleAssignmentRule()) {
					sequence_Instruction_Label(context, (Label) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getLabelRule()) {
					sequence_Label(context, (Label) semanticObject); 
					return; 
				}
				else break;
			case ScgPackage.PARALLEL:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getInstructionOrCommentRule() ||
				   context == grammarAccess.getInstructionOrCommentSequenceRule() ||
				   context == grammarAccess.getInstructionSetSingleAssignmentRule()) {
					sequence_Instruction_Parallel(context, (Parallel) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getParallelRule()) {
					sequence_Parallel(context, (Parallel) semanticObject); 
					return; 
				}
				else break;
			case ScgPackage.PAUSE:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getInstructionOrCommentRule() ||
				   context == grammarAccess.getInstructionOrCommentSequenceRule() ||
				   context == grammarAccess.getInstructionSetSingleAssignmentRule()) {
					sequence_Instruction(context, (Pause) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPauseRule()) {
					sequence_Pause(context, (Pause) semanticObject); 
					return; 
				}
				else break;
			case ScgPackage.SCOPE:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getInstructionOrCommentRule() ||
				   context == grammarAccess.getInstructionOrCommentSequenceRule() ||
				   context == grammarAccess.getInstructionSetSingleAssignmentRule()) {
					sequence_Instruction_Scope(context, (Scope) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScopeRule()) {
					sequence_Scope(context, (Scope) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == SclPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SclPackage.LOCAL_VARIABLE:
				if(context == grammarAccess.getLocalVariableRule()) {
					sequence_LocalVariable(context, (LocalVariable) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
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
	 *     (assignment=STRING dependencies=Dependency)
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (assignment=STRING dependencies=Dependency priority=INT)
	 */
	protected void sequence_Assignment_Instruction(EObject context, Assignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SclPackage.Literals.ASSIGNMENT__ASSIGNMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SclPackage.Literals.ASSIGNMENT__ASSIGNMENT));
			if(transientValues.isValueTransient(semanticObject, ScgPackage.Literals.ASSIGNMENT__PRIORITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScgPackage.Literals.ASSIGNMENT__PRIORITY));
			if(transientValues.isValueTransient(semanticObject, ScgPackage.Literals.ASSIGNMENT__DEPENDENCIES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScgPackage.Literals.ASSIGNMENT__DEPENDENCIES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentAccess().getAssignmentSTRINGTerminalRuleCall_0_0(), semanticObject.getAssignment());
		feeder.accept(grammarAccess.getAssignmentAccess().getDependenciesDependencyParserRuleCall_1_0(), semanticObject.getDependencies());
		feeder.accept(grammarAccess.getInstructionAccess().getPriorityINTTerminalRuleCall_2_0(), semanticObject.getPriority());
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
	 *     (expression=SCLExpression conditional=InstructionSet dependencies=Dependency)
	 */
	protected void sequence_Conditional(EObject context, Conditional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=SCLExpression conditional=InstructionSet dependencies=Dependency priority=INT)
	 */
	protected void sequence_Conditional_Instruction(EObject context, Conditional semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SclPackage.Literals.CONDITIONAL__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SclPackage.Literals.CONDITIONAL__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, SclPackage.Literals.CONDITIONAL__CONDITIONAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SclPackage.Literals.CONDITIONAL__CONDITIONAL));
			if(transientValues.isValueTransient(semanticObject, ScgPackage.Literals.CONDITIONAL__PRIORITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScgPackage.Literals.CONDITIONAL__PRIORITY));
			if(transientValues.isValueTransient(semanticObject, ScgPackage.Literals.CONDITIONAL__DEPENDENCIES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScgPackage.Literals.CONDITIONAL__DEPENDENCIES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionalAccess().getExpressionSCLExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getConditionalAccess().getConditionalInstructionSetParserRuleCall_3_0(), semanticObject.getConditional());
		feeder.accept(grammarAccess.getConditionalAccess().getDependenciesDependencyParserRuleCall_5_0(), semanticObject.getDependencies());
		feeder.accept(grammarAccess.getInstructionAccess().getPriorityINTTerminalRuleCall_2_0(), semanticObject.getPriority());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (dependencies+=[Assignment|ID]*)
	 */
	protected void sequence_Dependency(EObject context, Dependency semanticObject) {
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
	 *     (name=ID priority=INT)
	 */
	protected void sequence_Goto_Instruction(EObject context, Goto semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SclPackage.Literals.GOTO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SclPackage.Literals.GOTO__NAME));
			if(transientValues.isValueTransient(semanticObject, ScgPackage.Literals.GOTO__PRIORITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScgPackage.Literals.GOTO__PRIORITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGotoAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInstructionAccess().getPriorityINTTerminalRuleCall_2_0(), semanticObject.getPriority());
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
	 *     (name=ID priority=INT)
	 */
	protected void sequence_Instruction_Label(EObject context, Label semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SclPackage.Literals.LABEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SclPackage.Literals.LABEL__NAME));
			if(transientValues.isValueTransient(semanticObject, ScgPackage.Literals.LABEL__PRIORITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScgPackage.Literals.LABEL__PRIORITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInstructionAccess().getPriorityINTTerminalRuleCall_2_0(), semanticObject.getPriority());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (threads+=InstructionSet threads+=InstructionSet+ priority=INT)
	 */
	protected void sequence_Instruction_Parallel(EObject context, Parallel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     priority=INT
	 */
	protected void sequence_Instruction(EObject context, Pause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScgPackage.Literals.PAUSE__PRIORITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScgPackage.Literals.PAUSE__PRIORITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstructionAccess().getPriorityINTTerminalRuleCall_2_0(), semanticObject.getPriority());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variables+=LocalVariable* scope=InstructionSet priority=INT)
	 */
	protected void sequence_Instruction_Scope(EObject context, Scope semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Label(EObject context, Label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (variables+=LocalVariable* scope=InstructionSet)
	 */
	protected void sequence_Scope(EObject context, Scope semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
