package de.cau.cs.kieler.esterel.kexpressions.serializer;

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
import de.cau.cs.kieler.core.annotations.text.serializer.AnnotationsSemanticSequencer;
import de.cau.cs.kieler.esterel.kexpressions.BooleanValue;
import de.cau.cs.kieler.esterel.kexpressions.ChannelDescription;
import de.cau.cs.kieler.esterel.kexpressions.FloatValue;
import de.cau.cs.kieler.esterel.kexpressions.ISignal;
import de.cau.cs.kieler.esterel.kexpressions.IVariable;
import de.cau.cs.kieler.esterel.kexpressions.Input;
import de.cau.cs.kieler.esterel.kexpressions.InputOutput;
import de.cau.cs.kieler.esterel.kexpressions.IntValue;
import de.cau.cs.kieler.esterel.kexpressions.InterfaceVariableDecl;
import de.cau.cs.kieler.esterel.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.esterel.kexpressions.OperatorExpression;
import de.cau.cs.kieler.esterel.kexpressions.Output;
import de.cau.cs.kieler.esterel.kexpressions.Return;
import de.cau.cs.kieler.esterel.kexpressions.TextExpression;
import de.cau.cs.kieler.esterel.kexpressions.TypeIdentifier;
import de.cau.cs.kieler.esterel.kexpressions.ValuedObjectReference;
import de.cau.cs.kieler.esterel.kexpressions.VariableDecl;
import de.cau.cs.kieler.esterel.kexpressions.services.KExpressionsGrammarAccess;
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
public abstract class AbstractKExpressionsSemanticSequencer extends AnnotationsSemanticSequencer {

	@Inject
	private KExpressionsGrammarAccess grammarAccess;
	
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
		else if(semanticObject.eClass().getEPackage() == KExpressionsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case KExpressionsPackage.BOOLEAN_VALUE:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanValueRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getRootRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_BooleanValue(context, (BooleanValue) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.CHANNEL_DESCRIPTION:
				if(context == grammarAccess.getChannelDescriptionRule()) {
					sequence_ChannelDescription(context, (ChannelDescription) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.FLOAT_VALUE:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFloatValueRule() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getRootRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_FloatValue(context, (FloatValue) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.ISIGNAL:
				if(context == grammarAccess.getISignalRule()) {
					sequence_ISignal(context, (ISignal) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.IVARIABLE:
				if(context == grammarAccess.getIVariableRule()) {
					sequence_IVariable(context, (IVariable) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.INPUT:
				if(context == grammarAccess.getInterfaceDeclarationRule() ||
				   context == grammarAccess.getInterfaceSignalDeclRule() ||
				   context == grammarAccess.getRootRule()) {
					sequence_InterfaceSignalDecl(context, (Input) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.INPUT_OUTPUT:
				if(context == grammarAccess.getInterfaceDeclarationRule() ||
				   context == grammarAccess.getInterfaceSignalDeclRule() ||
				   context == grammarAccess.getRootRule()) {
					sequence_InterfaceSignalDecl(context, (InputOutput) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.INT_VALUE:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIntValueRule() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getRootRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_IntValue(context, (IntValue) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.INTERFACE_VARIABLE_DECL:
				if(context == grammarAccess.getInterfaceDeclarationRule() ||
				   context == grammarAccess.getInterfaceVariableDeclRule() ||
				   context == grammarAccess.getRootRule()) {
					sequence_InterfaceVariableDecl(context, (InterfaceVariableDecl) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.OPERATOR_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getRootRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_AddExpression_AndExpression_CompareOperation_DivExpression_Expression_ModExpression_MultExpression_NegExpression_NotExpression_OrExpression_SubExpression_ValuedObjectTestExpression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()) {
					sequence_AndExpression_CompareOperation_NotExpression_OrExpression_ValuedObjectTestExpression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getValuedObjectTestExpressionRule()) {
					sequence_ValuedObjectTestExpression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.OUTPUT:
				if(context == grammarAccess.getInterfaceDeclarationRule() ||
				   context == grammarAccess.getInterfaceSignalDeclRule() ||
				   context == grammarAccess.getRootRule()) {
					sequence_InterfaceSignalDecl(context, (Output) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.RETURN:
				if(context == grammarAccess.getInterfaceDeclarationRule() ||
				   context == grammarAccess.getInterfaceSignalDeclRule() ||
				   context == grammarAccess.getRootRule()) {
					sequence_InterfaceSignalDecl(context, (Return) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.TEXT_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getRootRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getTextExpressionRule() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_TextExpression(context, (TextExpression) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.TYPE_IDENTIFIER:
				if(context == grammarAccess.getTypeIdentifierRule()) {
					sequence_TypeIdentifier(context, (TypeIdentifier) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.VALUED_OBJECT_REFERENCE:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getRootRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule() ||
				   context == grammarAccess.getValuedObjectReferenceRule() ||
				   context == grammarAccess.getValuedObjectTestExpressionRule()) {
					sequence_ValuedObjectReference(context, (ValuedObjectReference) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.VARIABLE_DECL:
				if(context == grammarAccess.getVariableDeclRule()) {
					sequence_VariableDecl(context, (VariableDecl) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         (operator=NotOperator subExpressions+=NotExpression) | 
	 *         (operator=PreOperator subExpressions+=ValuedObjectTestExpression) | 
	 *         (operator=ValueTestOperator subExpressions+=ValuedObjectReference) | 
	 *         (subExpressions+=CompareOperation_OperatorExpression_0_1_0 operator=CompareOperator subExpressions+=NotOrValuedExpression) | 
	 *         (subExpressions+=AndExpression_OperatorExpression_1_0 operator=AndOperator subExpressions+=CompareOperation) | 
	 *         (subExpressions+=OrExpression_OperatorExpression_1_0 operator=OrOperator subExpressions+=AndExpression) | 
	 *         (subExpressions+=ModExpression_OperatorExpression_1_0 operator=ModOperator subExpressions+=AtomicValuedExpression) | 
	 *         (operator=SubOperator subExpressions+=NegExpression) | 
	 *         (subExpressions+=DivExpression_OperatorExpression_1_0 operator=DivOperator subExpressions+=ModExpression) | 
	 *         (subExpressions+=MultExpression_OperatorExpression_1_0 operator=MultOperator subExpressions+=DivExpression) | 
	 *         (subExpressions+=SubExpression_OperatorExpression_1_0 operator=SubOperator subExpressions+=MultExpression) | 
	 *         (subExpressions+=AddExpression_OperatorExpression_1_0 operator=AddOperator subExpressions+=SubExpression)
	 *     )
	 */
	protected void sequence_AddExpression_AndExpression_CompareOperation_DivExpression_Expression_ModExpression_MultExpression_NegExpression_NotExpression_OrExpression_SubExpression_ValuedObjectTestExpression(EObject context, OperatorExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (operator=NotOperator subExpressions+=NotExpression) | 
	 *         (operator=PreOperator subExpressions+=ValuedObjectTestExpression) | 
	 *         (operator=ValueTestOperator subExpressions+=ValuedObjectReference) | 
	 *         (subExpressions+=CompareOperation_OperatorExpression_0_1_0 operator=CompareOperator subExpressions+=NotOrValuedExpression) | 
	 *         (subExpressions+=AndExpression_OperatorExpression_1_0 operator=AndOperator subExpressions+=CompareOperation) | 
	 *         (subExpressions+=OrExpression_OperatorExpression_1_0 operator=OrOperator subExpressions+=AndExpression)
	 *     )
	 */
	protected void sequence_AndExpression_CompareOperation_NotExpression_OrExpression_ValuedObjectTestExpression(EObject context, OperatorExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOLEAN
	 */
	protected void sequence_BooleanValue(EObject context, BooleanValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KExpressionsPackage.Literals.BOOLEAN_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KExpressionsPackage.Literals.BOOLEAN_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeIdentifier | type=TypeIdentifier | (expression=Expression type=TypeIdentifier))
	 */
	protected void sequence_ChannelDescription(EObject context, ChannelDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=FLOAT
	 */
	protected void sequence_FloatValue(EObject context, FloatValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KExpressionsPackage.Literals.FLOAT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KExpressionsPackage.Literals.FLOAT_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID channelDescr=ChannelDescription?)
	 */
	protected void sequence_ISignal(EObject context, ISignal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expression=Expression?)
	 */
	protected void sequence_IVariable(EObject context, IVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntValue(EObject context, IntValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KExpressionsPackage.Literals.INT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KExpressionsPackage.Literals.INT_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (signals+=ISignal signals+=ISignal*)
	 */
	protected void sequence_InterfaceSignalDecl(EObject context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (signals+=ISignal signals+=ISignal*)
	 */
	protected void sequence_InterfaceSignalDecl(EObject context, InputOutput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (signals+=ISignal signals+=ISignal*)
	 */
	protected void sequence_InterfaceSignalDecl(EObject context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (signals+=ISignal signals+=ISignal*)
	 */
	protected void sequence_InterfaceSignalDecl(EObject context, Return semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (varDecls+=VariableDecl varDecls+=VariableDecl*)
	 */
	protected void sequence_InterfaceVariableDecl(EObject context, InterfaceVariableDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (code=HOSTCODE type=ID?)
	 */
	protected void sequence_TextExpression(EObject context, TextExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ValueType | typeID=ID | ((type=ValueType | typeID=ID) operator=CombineOperator))
	 */
	protected void sequence_TypeIdentifier(EObject context, TypeIdentifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     valuedObject=[ValuedObject|ID]
	 */
	protected void sequence_ValuedObjectReference(EObject context, ValuedObjectReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((operator=PreOperator subExpressions+=ValuedObjectTestExpression) | (operator=ValueTestOperator subExpressions+=ValuedObjectReference))
	 */
	protected void sequence_ValuedObjectTestExpression(EObject context, OperatorExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variables+=IVariable variables+=IVariable* type=TypeIdentifier)
	 */
	protected void sequence_VariableDecl(EObject context, VariableDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
