package de.cau.cs.kieler.yakindu.sccharts.sim.scg.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Assignment;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Comment;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Conditional;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Dependency;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionSet;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Parallel;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Program;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Scope;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.services.SCGGrammarAccess;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Goto;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Label;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.LocalVariable;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Pause;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Variable;
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
				   context == grammarAccess.getInstructionOrCommentSequenceRule()) {
					sequence_Assignment_Instruction(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case ScgPackage.COMMENT:
				if(context == grammarAccess.getCommentRule() ||
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
				   context == grammarAccess.getInstructionOrCommentSequenceRule()) {
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
			case ScgPackage.INSTRUCTION:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getInstructionOrCommentSequenceRule()) {
					sequence_Instruction(context, (Instruction) semanticObject); 
					return; 
				}
				else break;
			case ScgPackage.INSTRUCTION_SET:
				if(context == grammarAccess.getInstructionSetRule()) {
					sequence_InstructionSet(context, (InstructionSet) semanticObject); 
					return; 
				}
				else break;
			case ScgPackage.PARALLEL:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getInstructionOrCommentSequenceRule()) {
					sequence_Instruction_Parallel(context, (Parallel) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getParallelRule()) {
					sequence_Parallel(context, (Parallel) semanticObject); 
					return; 
				}
				else break;
			case ScgPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case ScgPackage.SCOPE:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getInstructionOrCommentSequenceRule()) {
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
			case SclPackage.GOTO:
				if(context == grammarAccess.getGotoRule()) {
					sequence_Goto(context, (Goto) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.LABEL:
				if(context == grammarAccess.getLabelRule()) {
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
			case SclPackage.PAUSE:
				if(context == grammarAccess.getPauseRule()) {
					sequence_Pause(context, (Pause) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.VARIABLE:
				if(context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (dependencies+=Dependency*)
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dependencies+=Dependency* priority=INT)
	 */
	protected void sequence_Assignment_Instruction(EObject context, Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (expression=SCLExpression conditional=InstructionSet dependencies+=Dependency*)
	 */
	protected void sequence_Conditional(EObject context, Conditional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=SCLExpression conditional=InstructionSet dependencies+=Dependency* priority=INT)
	 */
	protected void sequence_Conditional_Instruction(EObject context, Conditional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dependencies=[Assignment|ID]
	 */
	protected void sequence_Dependency(EObject context, Dependency semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScgPackage.Literals.DEPENDENCY__DEPENDENCIES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScgPackage.Literals.DEPENDENCY__DEPENDENCIES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDependencyAccess().getDependenciesAssignmentIDTerminalRuleCall_1_0_1(), semanticObject.getDependencies());
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
	 *     priority=INT
	 */
	protected void sequence_Instruction(EObject context, Instruction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ScgPackage.Literals.INSTRUCTION__PRIORITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScgPackage.Literals.INSTRUCTION__PRIORITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
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
	 *     (variables+=LocalVariable* scope=InstructionSet priority=INT)
	 */
	protected void sequence_Instruction_Scope(EObject context, Scope semanticObject) {
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
}
