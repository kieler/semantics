package de.cau.cs.kieler.scl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.cau.cs.kieler.scl.scl.Annotation;
import de.cau.cs.kieler.scl.scl.Assignment;
import de.cau.cs.kieler.scl.scl.Conditional;
import de.cau.cs.kieler.scl.scl.Goto;
import de.cau.cs.kieler.scl.scl.InstructionScope;
import de.cau.cs.kieler.scl.scl.Label;
import de.cau.cs.kieler.scl.scl.Parallel;
import de.cau.cs.kieler.scl.scl.Pause;
import de.cau.cs.kieler.scl.scl.Program;
import de.cau.cs.kieler.scl.scl.SclPackage;
import de.cau.cs.kieler.scl.scl.VariableDeclaration;
import de.cau.cs.kieler.scl.services.SCLGrammarAccess;
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
import org.yakindu.base.types.Parameter;
import org.yakindu.base.types.TypesPackage;
import org.yakindu.sct.model.stext.serializer.STextSemanticSequencer;
import org.yakindu.sct.model.stext.stext.ActiveStateReferenceExpression;
import org.yakindu.sct.model.stext.stext.AlwaysEvent;
import org.yakindu.sct.model.stext.stext.AssignmentExpression;
import org.yakindu.sct.model.stext.stext.BitwiseAndExpression;
import org.yakindu.sct.model.stext.stext.BitwiseOrExpression;
import org.yakindu.sct.model.stext.stext.BitwiseXorExpression;
import org.yakindu.sct.model.stext.stext.BoolLiteral;
import org.yakindu.sct.model.stext.stext.ConditionalExpression;
import org.yakindu.sct.model.stext.stext.DefaultTrigger;
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression;
import org.yakindu.sct.model.stext.stext.EntryEvent;
import org.yakindu.sct.model.stext.stext.EntryPointSpec;
import org.yakindu.sct.model.stext.stext.EventDefinition;
import org.yakindu.sct.model.stext.stext.EventRaisingExpression;
import org.yakindu.sct.model.stext.stext.EventValueReferenceExpression;
import org.yakindu.sct.model.stext.stext.ExitEvent;
import org.yakindu.sct.model.stext.stext.ExitPointSpec;
import org.yakindu.sct.model.stext.stext.FeatureCall;
import org.yakindu.sct.model.stext.stext.HexLiteral;
import org.yakindu.sct.model.stext.stext.IntLiteral;
import org.yakindu.sct.model.stext.stext.InterfaceScope;
import org.yakindu.sct.model.stext.stext.InternalScope;
import org.yakindu.sct.model.stext.stext.LocalReaction;
import org.yakindu.sct.model.stext.stext.LogicalAndExpression;
import org.yakindu.sct.model.stext.stext.LogicalNotExpression;
import org.yakindu.sct.model.stext.stext.LogicalOrExpression;
import org.yakindu.sct.model.stext.stext.LogicalRelationExpression;
import org.yakindu.sct.model.stext.stext.NumericalAddSubtractExpression;
import org.yakindu.sct.model.stext.stext.NumericalMultiplyDivideExpression;
import org.yakindu.sct.model.stext.stext.NumericalUnaryExpression;
import org.yakindu.sct.model.stext.stext.OperationDefinition;
import org.yakindu.sct.model.stext.stext.ParenthesizedExpression;
import org.yakindu.sct.model.stext.stext.PrimitiveValueExpression;
import org.yakindu.sct.model.stext.stext.ReactionEffect;
import org.yakindu.sct.model.stext.stext.ReactionTrigger;
import org.yakindu.sct.model.stext.stext.RealLiteral;
import org.yakindu.sct.model.stext.stext.RegularEventSpec;
import org.yakindu.sct.model.stext.stext.Root;
import org.yakindu.sct.model.stext.stext.ShiftExpression;
import org.yakindu.sct.model.stext.stext.SimpleScope;
import org.yakindu.sct.model.stext.stext.StateRoot;
import org.yakindu.sct.model.stext.stext.StateSpecification;
import org.yakindu.sct.model.stext.stext.StatechartRoot;
import org.yakindu.sct.model.stext.stext.StatechartSpecification;
import org.yakindu.sct.model.stext.stext.StextPackage;
import org.yakindu.sct.model.stext.stext.StringLiteral;
import org.yakindu.sct.model.stext.stext.TimeEventSpec;
import org.yakindu.sct.model.stext.stext.TransitionReaction;
import org.yakindu.sct.model.stext.stext.TransitionRoot;
import org.yakindu.sct.model.stext.stext.TransitionSpecification;
import org.yakindu.sct.model.stext.stext.VariableDefinition;

@SuppressWarnings("all")
public abstract class AbstractSCLSemanticSequencer extends STextSemanticSequencer {

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
			case SclPackage.INSTRUCTION_SCOPE:
				if(context == grammarAccess.getInstructionScopeRule()) {
					sequence_InstructionScope(context, (InstructionScope) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInstructionRule()) {
					sequence_Instruction_InstructionScope(context, (InstructionScope) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.LABEL:
				if(context == grammarAccess.getLabelRule()) {
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
			case SclPackage.THREAD:
				if(context == grammarAccess.getThreadRule()) {
					sequence_Thread(context, (de.cau.cs.kieler.scl.scl.Thread) semanticObject); 
					return; 
				}
				else break;
			case SclPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == StextPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case StextPackage.ACTIVE_STATE_REFERENCE_EXPRESSION:
				if(context == grammarAccess.getActiveStateReferenceExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0() ||
				   context == grammarAccess.getBitwiseAndExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseXorExpressionRule() ||
				   context == grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getConditionalExpressionRule() ||
				   context == grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalNotExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalRelationExpressionRule() ||
				   context == grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalAddSubtractExpressionRule() ||
				   context == grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalMultiplyDivideExpressionRule() ||
				   context == grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalUnaryExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getStatementExpressionRule()) {
					sequence_ActiveStateReferenceExpression(context, (ActiveStateReferenceExpression) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.ALWAYS_EVENT:
				if(context == grammarAccess.getAlwaysEventRule() ||
				   context == grammarAccess.getBuiltinEventSpecRule() ||
				   context == grammarAccess.getEventSpecRule()) {
					sequence_AlwaysEvent(context, (AlwaysEvent) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.ASSIGNMENT_EXPRESSION:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getStatementExpressionRule()) {
					sequence_AssignmentExpression(context, (AssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.BITWISE_AND_EXPRESSION:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0() ||
				   context == grammarAccess.getBitwiseAndExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseXorExpressionRule() ||
				   context == grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getConditionalExpressionRule() ||
				   context == grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalNotExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getStatementExpressionRule()) {
					sequence_BitwiseAndExpression(context, (BitwiseAndExpression) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.BITWISE_OR_EXPRESSION:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseXorExpressionRule() ||
				   context == grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getConditionalExpressionRule() ||
				   context == grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalNotExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getStatementExpressionRule()) {
					sequence_BitwiseOrExpression(context, (BitwiseOrExpression) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.BITWISE_XOR_EXPRESSION:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0() ||
				   context == grammarAccess.getBitwiseXorExpressionRule() ||
				   context == grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getConditionalExpressionRule() ||
				   context == grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalNotExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getStatementExpressionRule()) {
					sequence_BitwiseXorExpression(context, (BitwiseXorExpression) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.BOOL_LITERAL:
				if(context == grammarAccess.getBoolLiteralRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_BoolLiteral(context, (BoolLiteral) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.CONDITIONAL_EXPRESSION:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0() ||
				   context == grammarAccess.getConditionalExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getStatementExpressionRule()) {
					sequence_ConditionalExpression(context, (ConditionalExpression) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.DEFAULT_TRIGGER:
				if(context == grammarAccess.getDefaultTriggerRule() ||
				   context == grammarAccess.getStextTriggerRule()) {
					sequence_DefaultTrigger(context, (DefaultTrigger) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.ELEMENT_REFERENCE_EXPRESSION:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0() ||
				   context == grammarAccess.getBitwiseAndExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseXorExpressionRule() ||
				   context == grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getConditionalExpressionRule() ||
				   context == grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getElementReferenceExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFeatureCallRule() ||
				   context == grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalNotExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalRelationExpressionRule() ||
				   context == grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalAddSubtractExpressionRule() ||
				   context == grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalMultiplyDivideExpressionRule() ||
				   context == grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalUnaryExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getStatementExpressionRule()) {
					sequence_ElementReferenceExpression(context, (ElementReferenceExpression) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.ENTRY_EVENT:
				if(context == grammarAccess.getBuiltinEventSpecRule() ||
				   context == grammarAccess.getEntryEventRule() ||
				   context == grammarAccess.getEventSpecRule()) {
					sequence_EntryEvent(context, (EntryEvent) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.ENTRY_POINT_SPEC:
				if(context == grammarAccess.getEntryPointSpecRule() ||
				   context == grammarAccess.getTransitionPropertyRule()) {
					sequence_EntryPointSpec(context, (EntryPointSpec) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.EVENT_DEFINITION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getEventDeclarartionRule() ||
				   context == grammarAccess.getEventDefinitionRule() ||
				   context == grammarAccess.getEventFeatureRule()) {
					sequence_EventDefinition(context, (EventDefinition) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.EVENT_RAISING_EXPRESSION:
				if(context == grammarAccess.getEventRaisingExpressionRule()) {
					sequence_EventRaisingExpression(context, (EventRaisingExpression) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.EVENT_VALUE_REFERENCE_EXPRESSION:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0() ||
				   context == grammarAccess.getBitwiseAndExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseXorExpressionRule() ||
				   context == grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getConditionalExpressionRule() ||
				   context == grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getEventValueReferenceExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalNotExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalRelationExpressionRule() ||
				   context == grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalAddSubtractExpressionRule() ||
				   context == grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalMultiplyDivideExpressionRule() ||
				   context == grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalUnaryExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getStatementExpressionRule()) {
					sequence_EventValueReferenceExpression(context, (EventValueReferenceExpression) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.EXIT_EVENT:
				if(context == grammarAccess.getBuiltinEventSpecRule() ||
				   context == grammarAccess.getEventSpecRule() ||
				   context == grammarAccess.getExitEventRule()) {
					sequence_ExitEvent(context, (ExitEvent) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.EXIT_POINT_SPEC:
				if(context == grammarAccess.getExitPointSpecRule() ||
				   context == grammarAccess.getTransitionPropertyRule()) {
					sequence_ExitPointSpec(context, (ExitPointSpec) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.FEATURE_CALL:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0() ||
				   context == grammarAccess.getBitwiseAndExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseXorExpressionRule() ||
				   context == grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getConditionalExpressionRule() ||
				   context == grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFeatureCallRule() ||
				   context == grammarAccess.getFeatureCallAccess().getFeatureCallOwnerAction_1_0() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalNotExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalRelationExpressionRule() ||
				   context == grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalAddSubtractExpressionRule() ||
				   context == grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalMultiplyDivideExpressionRule() ||
				   context == grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalUnaryExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getStatementExpressionRule()) {
					sequence_FeatureCall(context, (FeatureCall) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.HEX_LITERAL:
				if(context == grammarAccess.getHexLiteralRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_HexLiteral(context, (HexLiteral) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.INT_LITERAL:
				if(context == grammarAccess.getIntLiteralRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_IntLiteral(context, (IntLiteral) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.INTERFACE_SCOPE:
				if(context == grammarAccess.getInterfaceScopeRule() ||
				   context == grammarAccess.getNamedInterfaceScopeRule() ||
				   context == grammarAccess.getScopeRule() ||
				   context == grammarAccess.getStatechartScopeRule()) {
					sequence_InterfaceScope(context, (InterfaceScope) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.INTERNAL_SCOPE:
				if(context == grammarAccess.getInternalScopeRule() ||
				   context == grammarAccess.getScopeRule() ||
				   context == grammarAccess.getStatechartScopeRule()) {
					sequence_InternalScope(context, (InternalScope) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.LOCAL_REACTION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getLocalReactionRule() ||
				   context == grammarAccess.getReactionRule()) {
					sequence_LocalReaction(context, (LocalReaction) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.LOGICAL_AND_EXPRESSION:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0() ||
				   context == grammarAccess.getConditionalExpressionRule() ||
				   context == grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getStatementExpressionRule()) {
					sequence_LogicalAndExpression(context, (LogicalAndExpression) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.LOGICAL_NOT_EXPRESSION:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0() ||
				   context == grammarAccess.getConditionalExpressionRule() ||
				   context == grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalNotExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getStatementExpressionRule()) {
					sequence_LogicalNotExpression(context, (LogicalNotExpression) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.LOGICAL_OR_EXPRESSION:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0() ||
				   context == grammarAccess.getConditionalExpressionRule() ||
				   context == grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getStatementExpressionRule()) {
					sequence_LogicalOrExpression(context, (LogicalOrExpression) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.LOGICAL_RELATION_EXPRESSION:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0() ||
				   context == grammarAccess.getBitwiseAndExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseXorExpressionRule() ||
				   context == grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getConditionalExpressionRule() ||
				   context == grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalNotExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalRelationExpressionRule() ||
				   context == grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getStatementExpressionRule()) {
					sequence_LogicalRelationExpression(context, (LogicalRelationExpression) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.NUMERICAL_ADD_SUBTRACT_EXPRESSION:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0() ||
				   context == grammarAccess.getBitwiseAndExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseXorExpressionRule() ||
				   context == grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getConditionalExpressionRule() ||
				   context == grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalNotExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalRelationExpressionRule() ||
				   context == grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalAddSubtractExpressionRule() ||
				   context == grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getStatementExpressionRule()) {
					sequence_NumericalAddSubtractExpression(context, (NumericalAddSubtractExpression) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0() ||
				   context == grammarAccess.getBitwiseAndExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseXorExpressionRule() ||
				   context == grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getConditionalExpressionRule() ||
				   context == grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalNotExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalRelationExpressionRule() ||
				   context == grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalAddSubtractExpressionRule() ||
				   context == grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalMultiplyDivideExpressionRule() ||
				   context == grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getStatementExpressionRule()) {
					sequence_NumericalMultiplyDivideExpression(context, (NumericalMultiplyDivideExpression) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.NUMERICAL_UNARY_EXPRESSION:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0() ||
				   context == grammarAccess.getBitwiseAndExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseXorExpressionRule() ||
				   context == grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getConditionalExpressionRule() ||
				   context == grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalNotExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalRelationExpressionRule() ||
				   context == grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalAddSubtractExpressionRule() ||
				   context == grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalMultiplyDivideExpressionRule() ||
				   context == grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalUnaryExpressionRule() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getStatementExpressionRule()) {
					sequence_NumericalUnaryExpression(context, (NumericalUnaryExpression) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.OPERATION_DEFINITION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getOperationDeclarationRule() ||
				   context == grammarAccess.getOperationDefinitionRule() ||
				   context == grammarAccess.getOperationFeatureRule()) {
					sequence_OperationDefinition(context, (OperationDefinition) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.PARENTHESIZED_EXPRESSION:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0() ||
				   context == grammarAccess.getBitwiseAndExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseXorExpressionRule() ||
				   context == grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getConditionalExpressionRule() ||
				   context == grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalNotExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalRelationExpressionRule() ||
				   context == grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalAddSubtractExpressionRule() ||
				   context == grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalMultiplyDivideExpressionRule() ||
				   context == grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalUnaryExpressionRule() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getStatementExpressionRule()) {
					sequence_ParenthesizedExpression(context, (ParenthesizedExpression) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.PRIMITIVE_VALUE_EXPRESSION:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0() ||
				   context == grammarAccess.getBitwiseAndExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseXorExpressionRule() ||
				   context == grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getConditionalExpressionRule() ||
				   context == grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalNotExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalRelationExpressionRule() ||
				   context == grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalAddSubtractExpressionRule() ||
				   context == grammarAccess.getNumericalAddSubtractExpressionAccess().getNumericalAddSubtractExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalMultiplyDivideExpressionRule() ||
				   context == grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getNumericalUnaryExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getPrimitiveValueExpressionRule() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getStatementExpressionRule()) {
					sequence_PrimitiveValueExpression(context, (PrimitiveValueExpression) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.REACTION_EFFECT:
				if(context == grammarAccess.getReactionEffectRule()) {
					sequence_ReactionEffect(context, (ReactionEffect) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.REACTION_TRIGGER:
				if(context == grammarAccess.getReactionTriggerRule() ||
				   context == grammarAccess.getStextTriggerRule()) {
					sequence_ReactionTrigger(context, (ReactionTrigger) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.REAL_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getRealLiteralRule()) {
					sequence_RealLiteral(context, (RealLiteral) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.REGULAR_EVENT_SPEC:
				if(context == grammarAccess.getEventSpecRule() ||
				   context == grammarAccess.getRegularEventSpecRule()) {
					sequence_RegularEventSpec(context, (RegularEventSpec) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.ROOT:
				if(context == grammarAccess.getRootRule()) {
					sequence_Root(context, (Root) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.SHIFT_EXPRESSION:
				if(context == grammarAccess.getAssignmentExpressionRule() ||
				   context == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionVarRefAction_1_0() ||
				   context == grammarAccess.getBitwiseAndExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionAccess().getBitwiseAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getBitwiseOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getBitwiseXorExpressionRule() ||
				   context == grammarAccess.getBitwiseXorExpressionAccess().getBitwiseXorExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getConditionalExpressionRule() ||
				   context == grammarAccess.getConditionalExpressionAccess().getConditionalExpressionConditionAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalNotExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getLogicalRelationExpressionRule() ||
				   context == grammarAccess.getLogicalRelationExpressionAccess().getLogicalRelationExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getStatementExpressionRule()) {
					sequence_ShiftExpression(context, (ShiftExpression) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.SIMPLE_SCOPE:
				if(context == grammarAccess.getScopeRule() ||
				   context == grammarAccess.getStateScopeRule()) {
					sequence_StateScope(context, (SimpleScope) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.STATE_ROOT:
				if(context == grammarAccess.getDefRootRule() ||
				   context == grammarAccess.getStateRootRule()) {
					sequence_StateRoot(context, (StateRoot) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.STATE_SPECIFICATION:
				if(context == grammarAccess.getStateSpecificationRule()) {
					sequence_StateSpecification(context, (StateSpecification) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.STATECHART_ROOT:
				if(context == grammarAccess.getDefRootRule() ||
				   context == grammarAccess.getStatechartRootRule()) {
					sequence_StatechartRoot(context, (StatechartRoot) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.STATECHART_SPECIFICATION:
				if(context == grammarAccess.getScopedElementRule() ||
				   context == grammarAccess.getStatechartSpecificationRule()) {
					sequence_StatechartSpecification(context, (StatechartSpecification) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.STRING_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getStringLiteralRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.TIME_EVENT_SPEC:
				if(context == grammarAccess.getEventSpecRule() ||
				   context == grammarAccess.getTimeEventSpecRule()) {
					sequence_TimeEventSpec(context, (TimeEventSpec) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.TRANSITION_REACTION:
				if(context == grammarAccess.getReactionRule() ||
				   context == grammarAccess.getTransitionReactionRule()) {
					sequence_TransitionReaction(context, (TransitionReaction) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.TRANSITION_ROOT:
				if(context == grammarAccess.getDefRootRule() ||
				   context == grammarAccess.getTransitionRootRule()) {
					sequence_TransitionRoot(context, (TransitionRoot) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.TRANSITION_SPECIFICATION:
				if(context == grammarAccess.getTransitionSpecificationRule()) {
					sequence_TransitionSpecification(context, (TransitionSpecification) semanticObject); 
					return; 
				}
				else break;
			case StextPackage.VARIABLE_DEFINITION:
				if(context == grammarAccess.getVariableDefinitionRule() ||
				   context == grammarAccess.getVariableFeatureRule()) {
					sequence_VariableDefinition(context, (VariableDefinition) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == TypesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TypesPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
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
	 *     assignment=Expression
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (assignment=Expression priority=INT?)
	 */
	protected void sequence_Assignment_Instruction(EObject context, Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         expression=Expression 
	 *         (
	 *             ((instructions+=Instruction | instructions+=Annotation | instructions+=Label)* instructions+=Instruction) | 
	 *             instructions+=Annotation | 
	 *             instructions+=Label
	 *         )*
	 *     )
	 */
	protected void sequence_Conditional(EObject context, Conditional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         expression=Expression 
	 *         (
	 *             ((instructions+=Instruction | instructions+=Annotation | instructions+=Label)* instructions+=Instruction) | 
	 *             instructions+=Annotation | 
	 *             instructions+=Label
	 *         )* 
	 *         priority=INT?
	 *     )
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
	 *         interface+=VariableDeclaration* 
	 *         (
	 *             ((instructions+=Instruction | instructions+=Annotation | instructions+=Label)* instructions+=Instruction) | 
	 *             instructions+=Annotation | 
	 *             instructions+=Label
	 *         )*
	 *     )
	 */
	protected void sequence_InstructionScope(EObject context, InstructionScope semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         interface+=VariableDeclaration* 
	 *         (
	 *             ((instructions+=Instruction | instructions+=Annotation | instructions+=Label)* instructions+=Instruction) | 
	 *             instructions+=Annotation | 
	 *             instructions+=Label
	 *         )* 
	 *         priority=INT?
	 *     )
	 */
	protected void sequence_Instruction_InstructionScope(EObject context, InstructionScope semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (threads+=Thread threads+=Thread+ priority=INT?)
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
	 *     (threads+=Thread threads+=Thread+)
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
	 *     (
	 *         name=ID 
	 *         interface+=VariableDeclaration* 
	 *         (
	 *             ((instructions+=Instruction | instructions+=Annotation | instructions+=Label)* instructions+=Instruction) | 
	 *             instructions+=Annotation | 
	 *             instructions+=Label
	 *         )*
	 *     )
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             ((instructions+=Instruction | instructions+=Annotation | instructions+=Label)* instructions+=Instruction) | 
	 *             instructions+=Annotation | 
	 *             instructions+=Label
	 *         )*
	 *     )
	 */
	protected void sequence_Thread(EObject context, de.cau.cs.kieler.scl.scl.Thread semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (Input?='input'? Output?='output'? name=ID type=[Type|ID]?)
	 */
	protected void sequence_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
