package de.cau.cs.kieler.yakindu.sccharts.sim.scl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Annotation;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Assignment;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Goto;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionList;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Label;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Pause;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclPackage;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.VariableDeclaration;
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

@SuppressWarnings("all")
public abstract class AbstractSCLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SCLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SclPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SclPackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule()) {
					sequence_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInstructionRule()) {
					sequence_Assignment_Instruction(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.CONDITIONAL:
				if(context == grammarAccess.getConditionalRule()) {
					sequence_Conditional(context, (Conditional) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInstructionRule()) {
					sequence_Conditional_Instruction(context, (Conditional) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.GOTO:
				if(context == grammarAccess.getGotoRule()) {
					sequence_Goto(context, (Goto) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInstructionRule()) {
					sequence_Goto_Instruction(context, (Goto) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.INSTRUCTION_LIST:
				if(context == grammarAccess.getInstructionListRule()) {
					sequence_InstructionList(context, (InstructionList) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.LABEL:
				if(context == grammarAccess.getInstructionRule()) {
					sequence_Instruction_Label(context, (Label) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getLabelRule()) {
					sequence_Label(context, (Label) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.PARALLEL:
				if(context == grammarAccess.getInstructionRule()) {
					sequence_Instruction_Parallel(context, (Parallel) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getParallelRule()) {
					sequence_Parallel(context, (Parallel) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.PAUSE:
				if(context == grammarAccess.getInstructionRule()) {
					sequence_Instruction(context, (Pause) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPauseRule()) {
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
			case SclPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getVariableDeclarationRule()) {
					sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     comment=SL_COMMENT
	 */
	protected void sequence_Annotation(EObject context, Annotation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SclPackage.Literals.ANNOTATION__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SclPackage.Literals.ANNOTATION__COMMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnnotationAccess().getCommentSL_COMMENTTerminalRuleCall_0(), semanticObject.getComment());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (assignment=[Expression|ID] dependencies+=[Instruction|ID]*)
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (assignment=[Expression|ID] dependencies+=[Instruction|ID]* priority=INT?)
	 */
	protected void sequence_Assignment_Instruction(EObject context, Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=SCLExpression conditional=InstructionList dependencies+=[Instruction|ID]*)
	 */
	protected void sequence_Conditional(EObject context, Conditional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=SCLExpression conditional=InstructionList dependencies+=[Instruction|ID]* priority=INT?)
	 */
	protected void sequence_Conditional_Instruction(EObject context, Conditional semanticObject) {
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
	 *     (name=ID priority=INT?)
	 */
	protected void sequence_Goto_Instruction(EObject context, Goto semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ((instructions+=Instruction | instructions+=Annotation)+ instructions+=Instruction instructions+=Annotation?) | 
	 *         (instructions+=Annotation instructions+=Instruction) | 
	 *         (instructions+=Instruction instructions+=Annotation)
	 *     )
	 */
	protected void sequence_InstructionList(EObject context, InstructionList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID priority=INT?)
	 */
	protected void sequence_Instruction_Label(EObject context, Label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (threads+=InstructionList threads+=InstructionList+ priority=INT?)
	 */
	protected void sequence_Instruction_Parallel(EObject context, Parallel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (priority=INT?)
	 */
	protected void sequence_Instruction(EObject context, Pause semanticObject) {
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
	 *     (threads+=InstructionList threads+=InstructionList+)
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
	 *     (name=ID interface+=VariableDeclaration* program=InstructionList)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (Input?='input'? Output?='output'? name=STRING type=[Type|ID]?)
	 */
	protected void sequence_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
