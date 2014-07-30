package de.cau.cs.kieler.yakindu.sccharts.model.stext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.services.SynctextGrammarAccess;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalDuringReaction;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalEntryReaction;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalExitReaction;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.LocalSuspendReaction;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.NumericalMultiplyDivideExpression;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.OperationDefinition;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.PreReferenceExpression;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionEffect;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionTrigger;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SimpleScope;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ValReferenceExpression;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.VariableDefinition;
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
import org.yakindu.sct.model.stext.stext.NumericalUnaryExpression;
import org.yakindu.sct.model.stext.stext.ParenthesizedExpression;
import org.yakindu.sct.model.stext.stext.PrimitiveValueExpression;
import org.yakindu.sct.model.stext.stext.RealLiteral;
import org.yakindu.sct.model.stext.stext.RegularEventSpec;
import org.yakindu.sct.model.stext.stext.Root;
import org.yakindu.sct.model.stext.stext.ShiftExpression;
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

@SuppressWarnings("all")
public abstract class AbstractSynctextSemanticSequencer extends STextSemanticSequencer {

	@Inject
	private SynctextGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == StextPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
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
				if(context == grammarAccess.getEventDeclarartionRule() ||
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
				if(context == grammarAccess.getEventValueReferenceExpressionRule()) {
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
				if(context == grammarAccess.getLocalReactionRule() ||
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
			}
		else if(semanticObject.eClass().getEPackage() == SynctextPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SynctextPackage.EVENT_DEFINITION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getSignalDeclarationRule() ||
				   context == grammarAccess.getSignalDefinitionRule()) {
					sequence_SignalDefinition(context, (de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.EventDefinition) semanticObject); 
					return; 
				}
				else break;
			case SynctextPackage.LOCAL_DURING_REACTION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getLocalDuringReactionRule()) {
					sequence_LocalDuringReaction(context, (LocalDuringReaction) semanticObject); 
					return; 
				}
				else break;
			case SynctextPackage.LOCAL_ENTRY_REACTION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getLocalEntryReactionRule()) {
					sequence_LocalEntryReaction(context, (LocalEntryReaction) semanticObject); 
					return; 
				}
				else break;
			case SynctextPackage.LOCAL_EXIT_REACTION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getLocalExitReactionRule()) {
					sequence_LocalExitReaction(context, (LocalExitReaction) semanticObject); 
					return; 
				}
				else break;
			case SynctextPackage.LOCAL_SUSPEND_REACTION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getLocalSuspendReactionRule()) {
					sequence_LocalSuspendReaction(context, (LocalSuspendReaction) semanticObject); 
					return; 
				}
				else break;
			case SynctextPackage.NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION:
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
			case SynctextPackage.OPERATION_DEFINITION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getOperationDeclarationRule() ||
				   context == grammarAccess.getOperationDefinitionRule() ||
				   context == grammarAccess.getOperationFeatureRule()) {
					sequence_OperationDefinition(context, (OperationDefinition) semanticObject); 
					return; 
				}
				else break;
			case SynctextPackage.PRE_REFERENCE_EXPRESSION:
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
				   context == grammarAccess.getPreReferenceExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getStatementExpressionRule()) {
					sequence_PreReferenceExpression(context, (PreReferenceExpression) semanticObject); 
					return; 
				}
				else break;
			case SynctextPackage.REACTION_EFFECT:
				if(context == grammarAccess.getReactionEffectRule()) {
					sequence_ReactionEffect(context, (ReactionEffect) semanticObject); 
					return; 
				}
				else break;
			case SynctextPackage.REACTION_TRIGGER:
				if(context == grammarAccess.getLocalReactionTriggerRule()) {
					sequence_LocalReactionTrigger(context, (ReactionTrigger) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getReactionTriggerRule() ||
				   context == grammarAccess.getStextTriggerRule()) {
					sequence_ReactionTrigger(context, (ReactionTrigger) semanticObject); 
					return; 
				}
				else break;
			case SynctextPackage.SIMPLE_SCOPE:
				if(context == grammarAccess.getScopeRule() ||
				   context == grammarAccess.getStateScopeRule()) {
					sequence_StateScope(context, (SimpleScope) semanticObject); 
					return; 
				}
				else break;
			case SynctextPackage.VAL_REFERENCE_EXPRESSION:
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
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftOperandAction_1_0() ||
				   context == grammarAccess.getStatementExpressionRule() ||
				   context == grammarAccess.getValReferenceExpressionRule()) {
					sequence_ValReferenceExpression(context, (ValReferenceExpression) semanticObject); 
					return; 
				}
				else break;
			case SynctextPackage.VARIABLE_DEFINITION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getVariableDeclarationRule() ||
				   context == grammarAccess.getVariableDefinitionRule() ||
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
	 *     (isImmediate?='immediate'? trigger=ReactionTrigger? effect=ReactionEffect)
	 */
	protected void sequence_LocalDuringReaction(EObject context, LocalDuringReaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (trigger=ReactionTrigger? effect=ReactionEffect)
	 */
	protected void sequence_LocalEntryReaction(EObject context, LocalEntryReaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (trigger=ReactionTrigger? effect=ReactionEffect)
	 */
	protected void sequence_LocalExitReaction(EObject context, LocalExitReaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (delay=INT? expression=Expression?)
	 */
	protected void sequence_LocalReactionTrigger(EObject context, ReactionTrigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isImmediate?='immediate'? trigger=ReactionTrigger?)
	 */
	protected void sequence_LocalSuspendReaction(EObject context, LocalSuspendReaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         leftOperand=NumericalMultiplyDivideExpression_NumericalMultiplyDivideExpression_1_0 
	 *         operator=MultiplicativeOperator2 
	 *         rightOperand=NumericalUnaryExpression
	 *     )
	 */
	protected void sequence_NumericalMultiplyDivideExpression(EObject context, NumericalMultiplyDivideExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SynctextPackage.Literals.NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SynctextPackage.Literals.NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__LEFT_OPERAND));
			if(transientValues.isValueTransient(semanticObject, SynctextPackage.Literals.NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SynctextPackage.Literals.NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, SynctextPackage.Literals.NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SynctextPackage.Literals.NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__RIGHT_OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getNumericalMultiplyDivideExpressionLeftOperandAction_1_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorMultiplicativeOperator2EnumRuleCall_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandNumericalUnaryExpressionParserRuleCall_1_2_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (functionType=[Type|FQN] name=XID paramType=[Type|FQN])
	 */
	protected void sequence_OperationDefinition(EObject context, OperationDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=FeatureCall | expression=ValReferenceExpression | expression=PreReferenceExpression)
	 */
	protected void sequence_PreReferenceExpression(EObject context, PreReferenceExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (actions+=Expression actions+=Expression*)
	 */
	protected void sequence_ReactionEffect(EObject context, ReactionEffect semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (labelPriority=INT? delay=INT? expression=Expression?)
	 */
	protected void sequence_ReactionTrigger(EObject context, ReactionTrigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isInput?='input'? isOutput?='output'? name=ID (type=[Type|FQN] varInitialValue=Expression? varCombineOperator=CombineOperator?)?)
	 */
	protected void sequence_SignalDefinition(EObject context, de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.EventDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declarations+=Declaration*)
	 */
	protected void sequence_StateScope(EObject context, SimpleScope semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=FeatureCall | expression=PreReferenceExpression)
	 */
	protected void sequence_ValReferenceExpression(EObject context, ValReferenceExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         isInput?='input'? 
	 *         isOutput?='output'? 
	 *         isStatic?='static'? 
	 *         type=[Type|FQN] 
	 *         name=ID 
	 *         initialValue=Expression? 
	 *         varCombineOperator=CombineOperator?
	 *     )
	 */
	protected void sequence_VariableDefinition(EObject context, VariableDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
