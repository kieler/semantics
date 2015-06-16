package de.cau.cs.kieler.sccharts.text.sct.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.cau.cs.kieler.core.annotations.Annotation;
import de.cau.cs.kieler.core.annotations.AnnotationsPackage;
import de.cau.cs.kieler.core.annotations.BooleanAnnotation;
import de.cau.cs.kieler.core.annotations.FloatAnnotation;
import de.cau.cs.kieler.core.annotations.ImportAnnotation;
import de.cau.cs.kieler.core.annotations.IntAnnotation;
import de.cau.cs.kieler.core.annotations.StringAnnotation;
import de.cau.cs.kieler.core.annotations.TypedStringAnnotation;
import de.cau.cs.kieler.core.kexpressions.BoolValue;
import de.cau.cs.kieler.core.kexpressions.Declaration;
import de.cau.cs.kieler.core.kexpressions.FloatValue;
import de.cau.cs.kieler.core.kexpressions.FunctionCall;
import de.cau.cs.kieler.core.kexpressions.IntValue;
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.kexpressions.OperatorExpression;
import de.cau.cs.kieler.core.kexpressions.Parameter;
import de.cau.cs.kieler.core.kexpressions.StringValue;
import de.cau.cs.kieler.core.kexpressions.TextExpression;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference;
import de.cau.cs.kieler.core.kexpressions.keffects.Assignment;
import de.cau.cs.kieler.core.kexpressions.keffects.Emission;
import de.cau.cs.kieler.core.kexpressions.keffects.FunctionCallEffect;
import de.cau.cs.kieler.core.kexpressions.keffects.HostcodeEffect;
import de.cau.cs.kieler.core.kexpressions.keffects.KEffectsPackage;
import de.cau.cs.kieler.core.kexpressions.text.kext.Kext;
import de.cau.cs.kieler.core.kexpressions.text.kext.KextPackage;
import de.cau.cs.kieler.sccharts.Binding;
import de.cau.cs.kieler.sccharts.CallNode;
import de.cau.cs.kieler.sccharts.ControlflowRegion;
import de.cau.cs.kieler.sccharts.DataflowRegion;
import de.cau.cs.kieler.sccharts.DefineNode;
import de.cau.cs.kieler.sccharts.DuringAction;
import de.cau.cs.kieler.sccharts.EntryAction;
import de.cau.cs.kieler.sccharts.Equation;
import de.cau.cs.kieler.sccharts.ExitAction;
import de.cau.cs.kieler.sccharts.IterateAction;
import de.cau.cs.kieler.sccharts.ReferenceNode;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.SuspendAction;
import de.cau.cs.kieler.sccharts.Transition;
import de.cau.cs.kieler.sccharts.text.actions.serializer.ActionsSemanticSequencer;
import de.cau.cs.kieler.sccharts.text.sct.services.SctGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public abstract class AbstractSctSemanticSequencer extends ActionsSemanticSequencer {

	@Inject
	private SctGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AnnotationsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AnnotationsPackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getRestrictedAnnotationRule() ||
				   context == grammarAccess.getTagAnnotationRule()) {
					sequence_TagAnnotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.BOOLEAN_ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getKeyBooleanValueAnnotationRule() ||
				   context == grammarAccess.getRestrictedAnnotationRule() ||
				   context == grammarAccess.getValuedAnnotationRule()) {
					sequence_KeyBooleanValueAnnotation(context, (BooleanAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.FLOAT_ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getKeyFloatValueAnnotationRule() ||
				   context == grammarAccess.getRestrictedAnnotationRule() ||
				   context == grammarAccess.getValuedAnnotationRule()) {
					sequence_KeyFloatValueAnnotation(context, (FloatAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.IMPORT_ANNOTATION:
				if(context == grammarAccess.getImportAnnotationRule()) {
					sequence_ImportAnnotation(context, (ImportAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.INT_ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getKeyIntValueAnnotationRule() ||
				   context == grammarAccess.getRestrictedAnnotationRule() ||
				   context == grammarAccess.getValuedAnnotationRule()) {
					sequence_KeyIntValueAnnotation(context, (IntAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.STRING_ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getValuedAnnotationRule()) {
					sequence_Annotation_CommentAnnotation_KeyStringValueAnnotation(context, (StringAnnotation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRestrictedAnnotationRule()) {
					sequence_CommentAnnotation_QuotedKeyStringValueAnnotation_RestrictedAnnotation(context, (StringAnnotation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getCommentAnnotationRule()) {
					sequence_CommentAnnotation(context, (StringAnnotation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getKeyStringValueAnnotationRule()) {
					sequence_KeyStringValueAnnotation(context, (StringAnnotation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getQuotedKeyStringValueAnnotationRule()) {
					sequence_QuotedKeyStringValueAnnotation(context, (StringAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.TYPED_STRING_ANNOTATION:
				if(context == grammarAccess.getQuotedTypedKeyStringValueAnnotationRule() ||
				   context == grammarAccess.getRestrictedAnnotationRule()) {
					sequence_QuotedTypedKeyStringValueAnnotation(context, (TypedStringAnnotation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getTypedKeyStringValueAnnotationRule() ||
				   context == grammarAccess.getValuedAnnotationRule()) {
					sequence_TypedKeyStringValueAnnotation(context, (TypedStringAnnotation) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == KEffectsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case KEffectsPackage.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getEffectRule()) {
					sequence_Assignment_Effect_PostfixEffect(context, (Assignment) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPostfixEffectRule()) {
					sequence_PostfixEffect(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case KEffectsPackage.EMISSION:
				if(context == grammarAccess.getEffectRule() ||
				   context == grammarAccess.getEmissionRule()) {
					sequence_Emission(context, (Emission) semanticObject); 
					return; 
				}
				else break;
			case KEffectsPackage.FUNCTION_CALL_EFFECT:
				if(context == grammarAccess.getEffectRule() ||
				   context == grammarAccess.getFunctionCallEffectRule()) {
					sequence_FunctionCallEffect(context, (FunctionCallEffect) semanticObject); 
					return; 
				}
				else break;
			case KEffectsPackage.HOSTCODE_EFFECT:
				if(context == grammarAccess.getEffectRule() ||
				   context == grammarAccess.getTextEffectRule()) {
					sequence_TextEffect(context, (HostcodeEffect) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == KExpressionsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case KExpressionsPackage.BOOL_VALUE:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getBoolExpressionRule() ||
				   context == grammarAccess.getBoolValueRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_BoolValue(context, (BoolValue) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.DECLARATION:
				if(context == grammarAccess.getDeclarationRule()) {
					sequence_Declaration(context, (Declaration) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.FLOAT_VALUE:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getBoolExpressionRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFloatValueRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_FloatValue(context, (FloatValue) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.FUNCTION_CALL:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getBoolExpressionRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFunctionCallRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_FunctionCall(context, (FunctionCall) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.INT_VALUE:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getBoolExpressionRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIntValueRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_IntValue(context, (IntValue) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.OPERATOR_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getBoolExpressionRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_AddExpression_BitwiseAndExpression_BitwiseOrExpression_CompareOperation_DivExpression_LogicalAndExpression_LogicalOrExpression_ModExpression_MultExpression_NegExpression_NotExpression_NotOrValuedExpression_SubExpression_ValuedObjectTestExpression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getValuedObjectTestExpressionRule()) {
					sequence_ValuedObjectTestExpression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.STRING_VALUE:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getBoolExpressionRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getStringValueRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_StringValue(context, (StringValue) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.TEXT_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getBoolExpressionRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getTextExpressionRule() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_TextExpression(context, (TextExpression) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.VALUED_OBJECT:
				if(context == grammarAccess.getValuedObjectRule()) {
					sequence_ValuedObject(context, (ValuedObject) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.VALUED_OBJECT_REFERENCE:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionRule() ||
				   context == grammarAccess.getBitwiseAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getBitwiseOrExpressionRule() ||
				   context == grammarAccess.getBitwiseOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getBoolExpressionRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionRule() ||
				   context == grammarAccess.getLogicalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getLogicalOrExpressionRule() ||
				   context == grammarAccess.getLogicalOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule() ||
				   context == grammarAccess.getValuedObjectReferenceRule() ||
				   context == grammarAccess.getValuedObjectTestExpressionRule()) {
					sequence_ValuedObjectReference(context, (ValuedObjectReference) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == KextPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case KextPackage.KEXT:
				if(context == grammarAccess.getKextRule()) {
					sequence_Kext(context, (Kext) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == SCChartsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SCChartsPackage.BINDING:
				if(context == grammarAccess.getBindingRule()) {
					sequence_Binding(context, (Binding) semanticObject); 
					return; 
				}
				else break;
			case SCChartsPackage.CALL_NODE:
				if(context == grammarAccess.getCallNodeRule() ||
				   context == grammarAccess.getNodeRule()) {
					sequence_CallNode(context, (CallNode) semanticObject); 
					return; 
				}
				else break;
			case SCChartsPackage.CONTROLFLOW_REGION:
				if(context == grammarAccess.getControlflowRegionRule() ||
				   context == grammarAccess.getRegionRule()) {
					sequence_ControlflowRegion(context, (ControlflowRegion) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSingleControlflowRegionRule()) {
					sequence_SingleControlflowRegion(context, (ControlflowRegion) semanticObject); 
					return; 
				}
				else break;
			case SCChartsPackage.DATAFLOW_REGION:
				if(context == grammarAccess.getDataflowRegionRule() ||
				   context == grammarAccess.getRegionRule()) {
					sequence_DataflowRegion(context, (DataflowRegion) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSingleDataflowRegionRule()) {
					sequence_SingleDataflowRegion(context, (DataflowRegion) semanticObject); 
					return; 
				}
				else break;
			case SCChartsPackage.DEFINE_NODE:
				if(context == grammarAccess.getDefineNodeRule() ||
				   context == grammarAccess.getNodeRule()) {
					sequence_DefineNode(context, (DefineNode) semanticObject); 
					return; 
				}
				else break;
			case SCChartsPackage.DURING_ACTION:
				if(context == grammarAccess.getDuringActionRule() ||
				   context == grammarAccess.getLocalActionRule()) {
					sequence_DuringAction(context, (DuringAction) semanticObject); 
					return; 
				}
				else break;
			case SCChartsPackage.ENTRY_ACTION:
				if(context == grammarAccess.getEntryActionRule() ||
				   context == grammarAccess.getLocalActionRule()) {
					sequence_EntryAction(context, (EntryAction) semanticObject); 
					return; 
				}
				else break;
			case SCChartsPackage.EQUATION:
				if(context == grammarAccess.getEquationRule()) {
					sequence_Equation(context, (Equation) semanticObject); 
					return; 
				}
				else break;
			case SCChartsPackage.EXIT_ACTION:
				if(context == grammarAccess.getExitActionRule() ||
				   context == grammarAccess.getLocalActionRule()) {
					sequence_ExitAction(context, (ExitAction) semanticObject); 
					return; 
				}
				else break;
			case SCChartsPackage.ITERATE_ACTION:
				if(context == grammarAccess.getIterateActionRule() ||
				   context == grammarAccess.getLocalActionRule()) {
					sequence_IterateAction(context, (IterateAction) semanticObject); 
					return; 
				}
				else break;
			case SCChartsPackage.REFERENCE_NODE:
				if(context == grammarAccess.getNodeRule() ||
				   context == grammarAccess.getReferenceNodeRule()) {
					sequence_ReferenceNode(context, (ReferenceNode) semanticObject); 
					return; 
				}
				else break;
			case SCChartsPackage.STATE:
				if(context == grammarAccess.getRootRule() ||
				   context == grammarAccess.getSCChartRule()) {
					sequence_SCChart(context, (State) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case SCChartsPackage.SUSPEND_ACTION:
				if(context == grammarAccess.getLocalActionRule() ||
				   context == grammarAccess.getSuspendActionRule()) {
					sequence_SuspendAction(context, (SuspendAction) semanticObject); 
					return; 
				}
				else break;
			case SCChartsPackage.TRANSITION:
				if(context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (annotations+=Annotation* formal=[ValuedObject|ID] actual=[ValuedObject|ID])
	 */
	protected void sequence_Binding(EObject context, Binding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID callReference=[DefineNode|ID] parameters+=ValuedObjectReference? parameters+=ValuedObjectReference*)
	 */
	protected void sequence_CallNode(EObject context, CallNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=Annotation* id=ID? label=STRING? declarations+=Declaration* states+=State+)
	 */
	protected void sequence_ControlflowRegion(EObject context, ControlflowRegion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=Annotation* id=ID? label=STRING? declarations+=Declaration* (equations+=Equation | nodes+=Node)*)
	 */
	protected void sequence_DataflowRegion(EObject context, DataflowRegion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID inputs+=Declaration* outputs+=Declaration* ((valuedObjects+=[ValuedObject|ID] expressions+=Expression)* | states+=State*))
	 */
	protected void sequence_DefineNode(EObject context, DefineNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((valuedObject=[ValuedObject|ID] expression=Expression) | (valuedObject=[ValuedObject|ID] node=[Node|ID] expression=ValuedObjectReference))
	 */
	protected void sequence_Equation(EObject context, Equation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID label=STRING? referencedScope=[State|ID] parameters+=ValuedObjectReference? parameters+=ValuedObjectReference*)
	 */
	protected void sequence_ReferenceNode(EObject context, ReferenceNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotations+=Annotation* 
	 *         id=ID 
	 *         label=STRING? 
	 *         (
	 *             (referencedScope=[State|ID] (bindings+=Binding bindings+=Binding*)?) | 
	 *             (
	 *                 (declarations+=Declaration | localActions+=LocalAction)* 
	 *                 ((regions+=SingleControlflowRegion | regions+=SingleDataflowRegion) regions+=Region*)?
	 *             )
	 *         )?
	 *     )
	 */
	protected void sequence_SCChart(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((annotations+=Annotation* id=ID? label=STRING? declarations+=Declaration*)? states+=State*)
	 */
	protected void sequence_SingleControlflowRegion(EObject context, ControlflowRegion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((annotations+=Annotation* id=ID? label=STRING? declarations+=Declaration*)? (equations+=Equation | nodes+=Node)*)
	 */
	protected void sequence_SingleDataflowRegion(EObject context, DataflowRegion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotations+=Annotation* 
	 *         ((initial?='initial' final?='final'?) | (final?='final' initial?='initial'?))? 
	 *         type=StateType? 
	 *         id=ID 
	 *         label=STRING? 
	 *         (
	 *             (referencedScope=[State|ID] (bindings+=Binding bindings+=Binding*)?) | 
	 *             ((declarations+=Declaration | localActions+=LocalAction)* (regions+=SingleControlflowRegion | regions+=SingleDataflowRegion) regions+=Region*)
	 *         )? 
	 *         outgoingTransitions+=Transition*
	 *     )
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotations+=Annotation* 
	 *         (type=TransitionTypeLegacy | type=TransitionType) 
	 *         targetState=[State|ID] 
	 *         (
	 *             immediate?='immediate'? 
	 *             deferred?='deferred'? 
	 *             history=HistoryType? 
	 *             (((delay=INT? trigger=BoolExpression)? (effects+=Effect effects+=Effect*)?) | label=STRING)?
	 *         )?
	 *     )
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
