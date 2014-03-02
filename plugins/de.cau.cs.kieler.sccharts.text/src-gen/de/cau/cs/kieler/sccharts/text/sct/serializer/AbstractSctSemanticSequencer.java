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
import de.cau.cs.kieler.core.kexpressions.FloatValue;
import de.cau.cs.kieler.core.kexpressions.IntValue;
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.kexpressions.OperatorExpression;
import de.cau.cs.kieler.core.kexpressions.TextExpression;
import de.cau.cs.kieler.core.kexpressions.TypeGroup;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference;
import de.cau.cs.kieler.sccharts.Assignment;
import de.cau.cs.kieler.sccharts.DuringAction;
import de.cau.cs.kieler.sccharts.Emission;
import de.cau.cs.kieler.sccharts.EntryAction;
import de.cau.cs.kieler.sccharts.ExitAction;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.Substitution;
import de.cau.cs.kieler.sccharts.SuspendAction;
import de.cau.cs.kieler.sccharts.TextEffect;
import de.cau.cs.kieler.sccharts.Transition;
import de.cau.cs.kieler.sccharts.text.actions.serializer.ActionsSemanticSequencer;
import de.cau.cs.kieler.sccharts.text.sct.services.SctGrammarAccess;
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
public abstract class AbstractSctSemanticSequencer extends ActionsSemanticSequencer {

	@Inject
	private SctGrammarAccess grammarAccess;
	
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
				   context == grammarAccess.getKeyBooleanValueAnnotationRule() ||
				   context == grammarAccess.getValuedAnnotationRule()) {
					sequence_KeyBooleanValueAnnotation(context, (BooleanAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.FLOAT_ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getKeyFloatValueAnnotationRule() ||
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
				   context == grammarAccess.getTypedKeyStringValueAnnotationRule() ||
				   context == grammarAccess.getValuedAnnotationRule()) {
					sequence_TypedKeyStringValueAnnotation(context, (TypedStringAnnotation) semanticObject); 
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
				   context == grammarAccess.getBoolExpressionRule() ||
				   context == grammarAccess.getBoolValueRule() ||
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
				   context == grammarAccess.getOrAndExpressionRule() ||
				   context == grammarAccess.getOrAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0_0() ||
				   context == grammarAccess.getOrAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_1_0() ||
				   context == grammarAccess.getRootRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_BoolValue(context, (BoolValue) semanticObject); 
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
					sequence_AddExpression_CompareOperation_DivExpression_Expression_ModExpression_MultExpression_NegExpression_NotExpression_OrAndExpression_SubExpression_ValuedObjectTestExpression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getBoolExpressionRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getOrAndExpressionRule() ||
				   context == grammarAccess.getOrAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0_0() ||
				   context == grammarAccess.getOrAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_1_0()) {
					sequence_CompareOperation_NotExpression_OrAndExpression_ValuedObjectTestExpression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getValuedObjectTestExpressionRule()) {
					sequence_ValuedObjectTestExpression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.TEXT_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getBoolExpressionRule() ||
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
				   context == grammarAccess.getOrAndExpressionRule() ||
				   context == grammarAccess.getOrAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0_0() ||
				   context == grammarAccess.getOrAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_1_0() ||
				   context == grammarAccess.getRootRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getTextExpressionRule() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_TextExpression(context, (TextExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTextualCodeRule()) {
					sequence_TextualCode(context, (TextExpression) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.TYPE_GROUP:
				if(context == grammarAccess.getTypeGroupRule()) {
					sequence_TypeGroup(context, (TypeGroup) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.VALUED_OBJECT:
				if(context == grammarAccess.getValuedObject2Rule()) {
					sequence_ValuedObject2(context, (ValuedObject) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getValuedObjectRule()) {
					sequence_ValuedObject(context, (ValuedObject) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.VALUED_OBJECT_REFERENCE:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getBoolExpressionRule() ||
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
				   context == grammarAccess.getOrAndExpressionRule() ||
				   context == grammarAccess.getOrAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0_0() ||
				   context == grammarAccess.getOrAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_1_0() ||
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
			}
		else if(semanticObject.eClass().getEPackage() == SCChartsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SCChartsPackage.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getEffectRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
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
			case SCChartsPackage.EMISSION:
				if(context == grammarAccess.getEffectRule() ||
				   context == grammarAccess.getEmissionRule()) {
					sequence_Emission(context, (Emission) semanticObject); 
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
			case SCChartsPackage.EXIT_ACTION:
				if(context == grammarAccess.getExitActionRule() ||
				   context == grammarAccess.getLocalActionRule()) {
					sequence_ExitAction(context, (ExitAction) semanticObject); 
					return; 
				}
				else break;
			case SCChartsPackage.REGION:
				if(context == grammarAccess.getRegionRule()) {
					sequence_Region(context, (Region) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRootRegionRule()) {
					sequence_RootRegion(context, (Region) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSingleRegionRule()) {
					sequence_SingleRegion(context, (Region) semanticObject); 
					return; 
				}
				else break;
			case SCChartsPackage.STATE:
				if(context == grammarAccess.getSCChartRule()) {
					sequence_SCChart(context, (State) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case SCChartsPackage.SUBSTITUTION:
				if(context == grammarAccess.getSubstitutionRule()) {
					sequence_Substitution(context, (Substitution) semanticObject); 
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
			case SCChartsPackage.TEXT_EFFECT:
				if(context == grammarAccess.getEffectRule() ||
				   context == grammarAccess.getTextEffectRule()) {
					sequence_TextEffect(context, (TextEffect) semanticObject); 
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
	 *     (
	 *         annotations+=Annotation* 
	 *         id=ID? 
	 *         label=STRING? 
	 *         valuedObjects+=ValuedObject* 
	 *         bodyText+=TextualCode* 
	 *         states+=State+
	 *     )
	 */
	protected void sequence_Region(EObject context, Region semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotations+=ImportAnnotation* 
	 *         (annotations+=Annotation* id=ID label=STRING? valuedObjects+=ValuedObject* bodyText+=TextualCode*)? 
	 *         states+=SCChart*
	 *     )
	 */
	protected void sequence_RootRegion(EObject context, Region semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotations+=Annotation* 
	 *         type=StateType? 
	 *         id=ID 
	 *         label=STRING? 
	 *         (
	 *             (bodyReference=[State|ID] (renamings+=Substitution renamings+=Substitution*)?) | 
	 *             ((valuedObjects+=ValuedObject | localActions+=LocalAction)* bodyText+=TextualCode* (regions+=SingleRegion regions+=Region*)?)
	 *         )?
	 *     )
	 */
	protected void sequence_SCChart(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((annotations+=Annotation* id=ID? label=STRING? valuedObjects+=ValuedObject* bodyText+=TextualCode*)? states+=State*)
	 */
	protected void sequence_SingleRegion(EObject context, Region semanticObject) {
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
	 *             (bodyReference=[State|ID] (renamings+=Substitution renamings+=Substitution*)?) | 
	 *             ((typeGroups+=TypeGroup | localActions+=LocalAction)* bodyText+=TextualCode* (regions+=SingleRegion regions+=Region*)?)
	 *         )? 
	 *         outgoingTransitions+=Transition*
	 *     )
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (actual=ID formal=ID)
	 */
	protected void sequence_Substitution(EObject context, Substitution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     text=HOSTCODE
	 */
	protected void sequence_TextualCode(EObject context, TextExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, KExpressionsPackage.Literals.TEXT_EXPRESSION__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, KExpressionsPackage.Literals.TEXT_EXPRESSION__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextualCodeAccess().getTextHOSTCODETerminalRuleCall_0_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotations+=Annotation* 
	 *         type=TransitionType 
	 *         targetState=[State|ID] 
	 *         (
	 *             immediate?='immediate'? 
	 *             deferred?='deferred'? 
	 *             history=HistoryType? 
	 *             ((delay=INT? trigger=BoolExpression? (effects+=Effect effects+=Effect*)?) | label=STRING)?
	 *         )?
	 *     )
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ValueType arrayCardinalities+=INT* valuedObjects+=ValuedObject2 valuedObjects+=ValuedObject2*)
	 */
	protected void sequence_TypeGroup(EObject context, TypeGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID initialValue=Expression? combineOperator=CombineOperator?)
	 */
	protected void sequence_ValuedObject2(EObject context, ValuedObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotations+=Annotation* 
	 *         input?='input'? 
	 *         output?='output'? 
	 *         static?='static'? 
	 *         signal?='signal'? 
	 *         type=ValueType? 
	 *         name=ID 
	 *         initialValue=Expression? 
	 *         combineOperator=CombineOperator?
	 *     )
	 */
	protected void sequence_ValuedObject(EObject context, ValuedObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
