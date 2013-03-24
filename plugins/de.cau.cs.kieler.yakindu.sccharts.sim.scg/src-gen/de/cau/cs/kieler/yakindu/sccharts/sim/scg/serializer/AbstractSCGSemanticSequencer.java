package de.cau.cs.kieler.yakindu.sccharts.sim.scg.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Conditional;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Goto;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.InstructionSet;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Label;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Parallel;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Pause;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.SCLExpression;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.services.SCGGrammarAccess;
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
			case ScgPackage.CONDITIONAL:
				if(context == grammarAccess.getConditionalRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Conditional(context, (Conditional) semanticObject); 
					return; 
				}
				else break;
			case ScgPackage.GOTO:
				if(context == grammarAccess.getGotoRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Goto(context, (Goto) semanticObject); 
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
				if(context == grammarAccess.getLabelRule()) {
					sequence_Label(context, (Label) semanticObject); 
					return; 
				}
				else break;
			case ScgPackage.PARALLEL:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getParallelRule()) {
					sequence_Parallel(context, (Parallel) semanticObject); 
					return; 
				}
				else break;
			case ScgPackage.PAUSE:
				if(context == grammarAccess.getInstructionRule()) {
					sequence_Instruction_Pause(context, (Pause) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPauseRule()) {
					sequence_Pause(context, (Pause) semanticObject); 
					return; 
				}
				else break;
			case ScgPackage.SCL_EXPRESSION:
				if(context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Assignment(context, (SCLExpression) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == SclPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SclPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.SCL_EXPRESSION:
				if(context == grammarAccess.getSCLExpressionRule()) {
					sequence_SCLExpression(context, (de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SCLExpression) semanticObject); 
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
			if(transientValues.isValueTransient(semanticObject, SclPackage.Literals.SCL_EXPRESSION__ASSIGNMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SclPackage.Literals.SCL_EXPRESSION__ASSIGNMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentAccess().getAssignmentSTRINGTerminalRuleCall_0(), semanticObject.getAssignment());
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
	 *     instructions+=Instruction+
	 */
	protected void sequence_InstructionSet(EObject context, InstructionSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pause='pause' priority=INT dependencies+=Instruction*)
	 */
	protected void sequence_Instruction_Pause(EObject context, Pause semanticObject) {
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
	 *     (threads+=InstructionSet threads+=InstructionSet+)
	 */
	protected void sequence_Parallel(EObject context, Parallel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     pause='pause'
	 */
	protected void sequence_Pause(EObject context, Pause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
