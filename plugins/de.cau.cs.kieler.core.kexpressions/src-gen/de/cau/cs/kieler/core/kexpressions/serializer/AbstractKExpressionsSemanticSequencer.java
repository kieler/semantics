package de.cau.cs.kieler.core.kexpressions.serializer;

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
import de.cau.cs.kieler.core.annotations.serializer.AnnotationsSemanticSequencer;
import de.cau.cs.kieler.core.kexpressions.BooleanValue;
import de.cau.cs.kieler.core.kexpressions.ChannelDescription;
import de.cau.cs.kieler.core.kexpressions.FloatValue;
import de.cau.cs.kieler.core.kexpressions.ISignal;
import de.cau.cs.kieler.core.kexpressions.IVariable;
import de.cau.cs.kieler.core.kexpressions.Input;
import de.cau.cs.kieler.core.kexpressions.InputOutput;
import de.cau.cs.kieler.core.kexpressions.IntValue;
import de.cau.cs.kieler.core.kexpressions.InterfaceVariableDecl;
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.kexpressions.OperatorExpression;
import de.cau.cs.kieler.core.kexpressions.Output;
import de.cau.cs.kieler.core.kexpressions.Return;
import de.cau.cs.kieler.core.kexpressions.TextExpression;
import de.cau.cs.kieler.core.kexpressions.TypeIdentifier;
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference;
import de.cau.cs.kieler.core.kexpressions.VariableDecl;
import de.cau.cs.kieler.core.kexpressions.services.KExpressionsGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractKExpressionsSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected KExpressionsGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	@Inject
	protected Provider<AnnotationsSemanticSequencer> superSequencerProvider;
	 
	protected AnnotationsSemanticSequencer superSequencer; 
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.superSequencer = superSequencerProvider.get();
		this.superSequencer.init(sequencer, sequenceAcceptor, errorAcceptor); 
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AnnotationsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AnnotationsPackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getTagAnnotationRule()) {
					sequence_TagAnnotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.BOOLEAN_ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getKeyBooleanValueAnnotationRule()) {
					sequence_KeyBooleanValueAnnotation(context, (BooleanAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.FLOAT_ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getKeyFloatValueAnnotationRule()) {
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
				   context == grammarAccess.getKeyIntValueAnnotationRule()) {
					sequence_KeyIntValueAnnotation(context, (IntAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.STRING_ANNOTATION:
				if(context == grammarAccess.getAnnotationRule()) {
					sequence_Annotation(context, (StringAnnotation) semanticObject); 
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
				else break;
			case AnnotationsPackage.TYPED_STRING_ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getTypedKeyStringValueAnnotationRule()) {
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
				if(context == grammarAccess.getAtomicExpressionRule()) {
					sequence_AtomicExpression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAtomicValuedExpressionRule()) {
					sequence_AtomicValuedExpression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getRootRule()) {
					sequence_Expression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_NegExpression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()) {
					sequence_NotExpression(context, (OperatorExpression) semanticObject); 
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
	 *     (value=COMMENT_ANNOTATION | (name=ExtendedID value=EString annotations+=Annotation*))
	 *
	 * Features:
	 *    annotations[0, *]
	 *         EXCLUDE_IF_UNSET name
	 *         EXCLUDE_IF_UNSET value
	 *         EXCLUDE_IF_SET value
	 *    name[0, 1]
	 *         EXCLUDE_IF_UNSET value
	 *         MANDATORY_IF_SET value
	 *         MANDATORY_IF_SET annotations
	 *         EXCLUDE_IF_SET value
	 *    value[0, 2]
	 */
	protected void sequence_Annotation(EObject context, StringAnnotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (operator=PreOperator subExpressions+=ValuedObjectTestExpression) | 
	 *         (operator=ValueTestOperator subExpressions+=ValuedObjectReference) | 
	 *         (subExpressions+=CompareOperation_OperatorExpression_0_1_0 operator=CompareOperator subExpressions+=NotOrValuedExpression) | 
	 *         (operator=NotOperator subExpressions+=NotExpression) | 
	 *         (subExpressions+=AndExpression_OperatorExpression_1_0 operator=AndOperator subExpressions+=CompareOperation) | 
	 *         (subExpressions+=OrExpression_OperatorExpression_1_0 operator=OrOperator subExpressions+=AndExpression)
	 *     )
	 *
	 * Features:
	 *    subExpressions[0, 9]
	 *    operator[0, 6]
	 */
	protected void sequence_AtomicExpression(EObject context, OperatorExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (subExpressions+=ModExpression_OperatorExpression_1_0 operator=ModOperator subExpressions+=AtomicValuedExpression) | 
	 *         (operator=SubOperator subExpressions+=NegExpression) | 
	 *         (subExpressions+=DivExpression_OperatorExpression_1_0 operator=DivOperator subExpressions+=ModExpression) | 
	 *         (subExpressions+=MultExpression_OperatorExpression_1_0 operator=MultOperator subExpressions+=DivExpression) | 
	 *         (subExpressions+=SubExpression_OperatorExpression_1_0 operator=SubOperator subExpressions+=MultExpression) | 
	 *         (subExpressions+=AddExpression_OperatorExpression_1_0 operator=AddOperator subExpressions+=SubExpression) | 
	 *         (operator=PreOperator subExpressions+=ValuedObjectTestExpression) | 
	 *         (operator=ValueTestOperator subExpressions+=ValuedObjectReference) | 
	 *         (subExpressions+=CompareOperation_OperatorExpression_0_1_0 operator=CompareOperator subExpressions+=NotOrValuedExpression) | 
	 *         (operator=NotOperator subExpressions+=NotExpression) | 
	 *         (subExpressions+=AndExpression_OperatorExpression_1_0 operator=AndOperator subExpressions+=CompareOperation) | 
	 *         (subExpressions+=OrExpression_OperatorExpression_1_0 operator=OrOperator subExpressions+=AndExpression)
	 *     )
	 *
	 * Features:
	 *    subExpressions[0, 20]
	 *    operator[0, 12]
	 */
	protected void sequence_AtomicValuedExpression(EObject context, OperatorExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Boolean
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_BooleanValue(EObject context, BooleanValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KExpressionsPackage.Literals.BOOLEAN_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KExpressionsPackage.Literals.BOOLEAN_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanValueAccess().getValueBooleanTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeIdentifier | type=TypeIdentifier | (expression=Expression type=TypeIdentifier))
	 *
	 * Features:
	 *    type[0, 3]
	 *    expression[0, 1]
	 *         EXCLUDE_IF_UNSET type
	 *         MANDATORY_IF_SET type
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET type
	 */
	protected void sequence_ChannelDescription(EObject context, ChannelDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=COMMENT_ANNOTATION
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_CommentAnnotation(EObject context, StringAnnotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
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
	 *
	 * Features:
	 *    subExpressions[0, 20]
	 *    operator[0, 12]
	 */
	protected void sequence_Expression(EObject context, OperatorExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Float
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_FloatValue(EObject context, FloatValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KExpressionsPackage.Literals.FLOAT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KExpressionsPackage.Literals.FLOAT_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFloatValueAccess().getValueFloatTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID channelDescr=ChannelDescription?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    channelDescr[0, 1]
	 */
	protected void sequence_ISignal(EObject context, ISignal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expression=Expression?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    expression[0, 1]
	 */
	protected void sequence_IVariable(EObject context, IVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 *
	 * Features:
	 *    importURI[1, 1]
	 */
	protected void sequence_ImportAnnotation(EObject context, ImportAnnotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 *
	 * Features:
	 *    value[1, 1]
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
	 *
	 * Features:
	 *    signals[1, *]
	 */
	protected void sequence_InterfaceSignalDecl(EObject context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (signals+=ISignal signals+=ISignal*)
	 *
	 * Features:
	 *    signals[1, *]
	 */
	protected void sequence_InterfaceSignalDecl(EObject context, InputOutput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (signals+=ISignal signals+=ISignal*)
	 *
	 * Features:
	 *    signals[1, *]
	 */
	protected void sequence_InterfaceSignalDecl(EObject context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (signals+=ISignal signals+=ISignal*)
	 *
	 * Features:
	 *    signals[1, *]
	 */
	protected void sequence_InterfaceSignalDecl(EObject context, Return semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (varDecls+=VariableDecl varDecls+=VariableDecl*)
	 *
	 * Features:
	 *    varDecls[1, *]
	 */
	protected void sequence_InterfaceVariableDecl(EObject context, InterfaceVariableDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ExtendedID value=Boolean annotations+=Annotation*)
	 *
	 * Features:
	 *    annotations[0, *]
	 *    name[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_KeyBooleanValueAnnotation(EObject context, BooleanAnnotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ExtendedID value=Float annotations+=Annotation*)
	 *
	 * Features:
	 *    annotations[0, *]
	 *    name[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_KeyFloatValueAnnotation(EObject context, FloatAnnotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ExtendedID value=INT annotations+=Annotation*)
	 *
	 * Features:
	 *    annotations[0, *]
	 *    name[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_KeyIntValueAnnotation(EObject context, IntAnnotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ExtendedID value=EString annotations+=Annotation*)
	 *
	 * Features:
	 *    annotations[0, *]
	 *    name[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_KeyStringValueAnnotation(EObject context, StringAnnotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (operator=SubOperator subExpressions+=NegExpression) | 
	 *         (operator=PreOperator subExpressions+=ValuedObjectTestExpression) | 
	 *         (operator=ValueTestOperator subExpressions+=ValuedObjectReference) | 
	 *         (subExpressions+=CompareOperation_OperatorExpression_0_1_0 operator=CompareOperator subExpressions+=NotOrValuedExpression) | 
	 *         (operator=NotOperator subExpressions+=NotExpression) | 
	 *         (subExpressions+=AndExpression_OperatorExpression_1_0 operator=AndOperator subExpressions+=CompareOperation) | 
	 *         (subExpressions+=OrExpression_OperatorExpression_1_0 operator=OrOperator subExpressions+=AndExpression) | 
	 *         (subExpressions+=ModExpression_OperatorExpression_1_0 operator=ModOperator subExpressions+=AtomicValuedExpression) | 
	 *         (subExpressions+=DivExpression_OperatorExpression_1_0 operator=DivOperator subExpressions+=ModExpression) | 
	 *         (subExpressions+=MultExpression_OperatorExpression_1_0 operator=MultOperator subExpressions+=DivExpression) | 
	 *         (subExpressions+=SubExpression_OperatorExpression_1_0 operator=SubOperator subExpressions+=MultExpression) | 
	 *         (subExpressions+=AddExpression_OperatorExpression_1_0 operator=AddOperator subExpressions+=SubExpression)
	 *     )
	 *
	 * Features:
	 *    subExpressions[0, 20]
	 *    operator[0, 12]
	 */
	protected void sequence_NegExpression(EObject context, OperatorExpression semanticObject) {
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
	 *
	 * Features:
	 *    subExpressions[0, 9]
	 *    operator[0, 6]
	 */
	protected void sequence_NotExpression(EObject context, OperatorExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ExtendedID annotations+=Annotation*)
	 *
	 * Features:
	 *    annotations[0, *]
	 *    name[1, 1]
	 */
	protected void sequence_TagAnnotation(EObject context, Annotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (code=HOSTCODE type=ID?)
	 *
	 * Features:
	 *    code[1, 1]
	 *    type[0, 1]
	 */
	protected void sequence_TextExpression(EObject context, TextExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ValueType | typeID=ID | ((type=ValueType | typeID=ID) operator=CombineOperator))
	 *
	 * Features:
	 *    type[0, 2]
	 *         EXCLUDE_IF_SET typeID
	 *         EXCLUDE_IF_SET typeID
	 *    typeID[0, 2]
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET type
	 *    operator[0, 1]
	 *         MANDATORY_IF_SET type
	 *         MANDATORY_IF_SET typeID
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET typeID
	 */
	protected void sequence_TypeIdentifier(EObject context, TypeIdentifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ExtendedID type=ExtendedID value=EString annotations+=Annotation*)
	 *
	 * Features:
	 *    annotations[0, *]
	 *    name[1, 1]
	 *    value[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_TypedKeyStringValueAnnotation(EObject context, TypedStringAnnotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     valuedObject=[ValuedObject|ID]
	 *
	 * Features:
	 *    valuedObject[1, 1]
	 */
	protected void sequence_ValuedObjectReference(EObject context, ValuedObjectReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((operator=PreOperator subExpressions+=ValuedObjectTestExpression) | (operator=ValueTestOperator subExpressions+=ValuedObjectReference))
	 *
	 * Features:
	 *    subExpressions[0, 2]
	 *    operator[0, 2]
	 */
	protected void sequence_ValuedObjectTestExpression(EObject context, OperatorExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variables+=IVariable variables+=IVariable* type=TypeIdentifier)
	 *
	 * Features:
	 *    variables[1, *]
	 *    type[1, 1]
	 */
	protected void sequence_VariableDecl(EObject context, VariableDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
