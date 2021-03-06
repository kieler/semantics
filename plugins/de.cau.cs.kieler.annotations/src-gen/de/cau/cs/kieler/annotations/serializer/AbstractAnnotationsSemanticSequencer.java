/*
 * generated by Xtext
 */
package de.cau.cs.kieler.annotations.serializer;

import com.google.inject.Inject;
import de.cau.cs.kieler.annotations.AnnotationsPackage;
import de.cau.cs.kieler.annotations.CommentAnnotation;
import de.cau.cs.kieler.annotations.Pragma;
import de.cau.cs.kieler.annotations.StringAnnotation;
import de.cau.cs.kieler.annotations.StringPragma;
import de.cau.cs.kieler.annotations.TagAnnotation;
import de.cau.cs.kieler.annotations.TypedStringAnnotation;
import de.cau.cs.kieler.annotations.services.AnnotationsGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractAnnotationsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AnnotationsGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AnnotationsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AnnotationsPackage.COMMENT_ANNOTATION:
				if (rule == grammarAccess.getAnnotationRule()
						|| rule == grammarAccess.getValuedAnnotationRule()
						|| rule == grammarAccess.getRestrictedTypeAnnotationRule()
						|| rule == grammarAccess.getQuotedStringAnnotationRule()
						|| rule == grammarAccess.getCommentAnnotationRule()) {
					sequence_CommentAnnotation(context, (CommentAnnotation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getCommentAnnotatonSLRule()) {
					sequence_CommentAnnotatonSL(context, (CommentAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.PRAGMA:
				sequence_PragmaTag(context, (Pragma) semanticObject); 
				return; 
			case AnnotationsPackage.STRING_ANNOTATION:
				if (rule == grammarAccess.getAnnotationRule()
						|| rule == grammarAccess.getValuedAnnotationRule()
						|| rule == grammarAccess.getKeyStringValueAnnotationRule()) {
					sequence_KeyStringValueAnnotation(context, (StringAnnotation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getQuotedStringAnnotationRule()
						|| rule == grammarAccess.getQuotedKeyStringValueAnnotationRule()) {
					sequence_QuotedKeyStringValueAnnotation(context, (StringAnnotation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getRestrictedTypeAnnotationRule()
						|| rule == grammarAccess.getRestrictedKeyStringValueAnnotationRule()) {
					sequence_RestrictedKeyStringValueAnnotation(context, (StringAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.STRING_PRAGMA:
				sequence_StringPragma(context, (StringPragma) semanticObject); 
				return; 
			case AnnotationsPackage.TAG_ANNOTATION:
				sequence_TagAnnotation(context, (TagAnnotation) semanticObject); 
				return; 
			case AnnotationsPackage.TYPED_STRING_ANNOTATION:
				if (rule == grammarAccess.getQuotedStringAnnotationRule()
						|| rule == grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()) {
					sequence_QuotedTypedKeyStringValueAnnotation(context, (TypedStringAnnotation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getRestrictedTypeAnnotationRule()
						|| rule == grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule()) {
					sequence_RestrictedTypedKeyStringValueAnnotation(context, (TypedStringAnnotation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAnnotationRule()
						|| rule == grammarAccess.getValuedAnnotationRule()
						|| rule == grammarAccess.getTypedKeyStringValueAnnotationRule()) {
					sequence_TypedKeyStringValueAnnotation(context, (TypedStringAnnotation) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Annotation returns CommentAnnotation
	 *     ValuedAnnotation returns CommentAnnotation
	 *     RestrictedTypeAnnotation returns CommentAnnotation
	 *     QuotedStringAnnotation returns CommentAnnotation
	 *     CommentAnnotation returns CommentAnnotation
	 *
	 * Constraint:
	 *     values+=COMMENT_ANNOTATION
	 */
	protected void sequence_CommentAnnotation(ISerializationContext context, CommentAnnotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CommentAnnotatonSL returns CommentAnnotation
	 *
	 * Constraint:
	 *     values+=SL_COMMENT_ANNOTATION
	 */
	protected void sequence_CommentAnnotatonSL(ISerializationContext context, CommentAnnotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Annotation returns StringAnnotation
	 *     ValuedAnnotation returns StringAnnotation
	 *     KeyStringValueAnnotation returns StringAnnotation
	 *
	 * Constraint:
	 *     (name=ExtendedID values+=EStringAllTypes values+=EStringAllTypes*)
	 */
	protected void sequence_KeyStringValueAnnotation(ISerializationContext context, StringAnnotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pragma returns Pragma
	 *     PragmaTag returns Pragma
	 *
	 * Constraint:
	 *     name=ExtendedID
	 */
	protected void sequence_PragmaTag(ISerializationContext context, Pragma semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnnotationsPackage.Literals.NAMED_OBJECT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnotationsPackage.Literals.NAMED_OBJECT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPragmaTagAccess().getNameExtendedIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     QuotedStringAnnotation returns StringAnnotation
	 *     QuotedKeyStringValueAnnotation returns StringAnnotation
	 *
	 * Constraint:
	 *     (name=ExtendedID values+=STRING values+=STRING*)
	 */
	protected void sequence_QuotedKeyStringValueAnnotation(ISerializationContext context, StringAnnotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     QuotedStringAnnotation returns TypedStringAnnotation
	 *     QuotedTypedKeyStringValueAnnotation returns TypedStringAnnotation
	 *
	 * Constraint:
	 *     (name=ExtendedID type=ExtendedID values+=STRING values+=STRING*)
	 */
	protected void sequence_QuotedTypedKeyStringValueAnnotation(ISerializationContext context, TypedStringAnnotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RestrictedTypeAnnotation returns StringAnnotation
	 *     RestrictedKeyStringValueAnnotation returns StringAnnotation
	 *
	 * Constraint:
	 *     (name=ExtendedID values+=EStringBoolean values+=EStringBoolean*)
	 */
	protected void sequence_RestrictedKeyStringValueAnnotation(ISerializationContext context, StringAnnotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RestrictedTypeAnnotation returns TypedStringAnnotation
	 *     RestrictedTypedKeyStringValueAnnotation returns TypedStringAnnotation
	 *
	 * Constraint:
	 *     (name=ExtendedID type=ExtendedID values+=EStringBoolean values+=EStringBoolean*)
	 */
	protected void sequence_RestrictedTypedKeyStringValueAnnotation(ISerializationContext context, TypedStringAnnotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pragma returns StringPragma
	 *     StringPragma returns StringPragma
	 *
	 * Constraint:
	 *     (name=ExtendedID values+=EStringAllTypes values+=EStringAllTypes*)
	 */
	protected void sequence_StringPragma(ISerializationContext context, StringPragma semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Annotation returns TagAnnotation
	 *     RestrictedTypeAnnotation returns TagAnnotation
	 *     QuotedStringAnnotation returns TagAnnotation
	 *     TagAnnotation returns TagAnnotation
	 *
	 * Constraint:
	 *     name=ExtendedID
	 */
	protected void sequence_TagAnnotation(ISerializationContext context, TagAnnotation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnnotationsPackage.Literals.NAMED_OBJECT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnnotationsPackage.Literals.NAMED_OBJECT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Annotation returns TypedStringAnnotation
	 *     ValuedAnnotation returns TypedStringAnnotation
	 *     TypedKeyStringValueAnnotation returns TypedStringAnnotation
	 *
	 * Constraint:
	 *     (name=ExtendedID type=ExtendedID values+=EStringAllTypes values+=EStringAllTypes*)
	 */
	protected void sequence_TypedKeyStringValueAnnotation(ISerializationContext context, TypedStringAnnotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
