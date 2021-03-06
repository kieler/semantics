/*
 * generated by Xtext
 */
package de.cau.cs.kieler.annotations.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.cau.cs.kieler.annotations.ide.contentassist.antlr.internal.InternalAnnotationsParser;
import de.cau.cs.kieler.annotations.services.AnnotationsGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class AnnotationsParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(AnnotationsGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, AnnotationsGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAnnotationAccess().getAlternatives(), "rule__Annotation__Alternatives");
			builder.put(grammarAccess.getPragmaAccess().getAlternatives(), "rule__Pragma__Alternatives");
			builder.put(grammarAccess.getValuedAnnotationAccess().getAlternatives(), "rule__ValuedAnnotation__Alternatives");
			builder.put(grammarAccess.getRestrictedTypeAnnotationAccess().getAlternatives(), "rule__RestrictedTypeAnnotation__Alternatives");
			builder.put(grammarAccess.getQuotedStringAnnotationAccess().getAlternatives(), "rule__QuotedStringAnnotation__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEStringBooleanAccess().getAlternatives(), "rule__EStringBoolean__Alternatives");
			builder.put(grammarAccess.getEStringAllTypesAccess().getAlternatives(), "rule__EStringAllTypes__Alternatives");
			builder.put(grammarAccess.getExtendedIDAccess().getAlternatives_1_0(), "rule__ExtendedID__Alternatives_1_0");
			builder.put(grammarAccess.getTagAnnotationAccess().getGroup(), "rule__TagAnnotation__Group__0");
			builder.put(grammarAccess.getPragmaTagAccess().getGroup(), "rule__PragmaTag__Group__0");
			builder.put(grammarAccess.getKeyStringValueAnnotationAccess().getGroup(), "rule__KeyStringValueAnnotation__Group__0");
			builder.put(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3(), "rule__KeyStringValueAnnotation__Group_3__0");
			builder.put(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup(), "rule__RestrictedKeyStringValueAnnotation__Group__0");
			builder.put(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getGroup_3(), "rule__RestrictedKeyStringValueAnnotation__Group_3__0");
			builder.put(grammarAccess.getStringPragmaAccess().getGroup(), "rule__StringPragma__Group__0");
			builder.put(grammarAccess.getStringPragmaAccess().getGroup_3(), "rule__StringPragma__Group_3__0");
			builder.put(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup(), "rule__TypedKeyStringValueAnnotation__Group__0");
			builder.put(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6(), "rule__TypedKeyStringValueAnnotation__Group_6__0");
			builder.put(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup(), "rule__RestrictedTypedKeyStringValueAnnotation__Group__0");
			builder.put(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getGroup_6(), "rule__RestrictedTypedKeyStringValueAnnotation__Group_6__0");
			builder.put(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup(), "rule__QuotedKeyStringValueAnnotation__Group__0");
			builder.put(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getGroup_3(), "rule__QuotedKeyStringValueAnnotation__Group_3__0");
			builder.put(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup(), "rule__QuotedTypedKeyStringValueAnnotation__Group__0");
			builder.put(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getGroup_6(), "rule__QuotedTypedKeyStringValueAnnotation__Group_6__0");
			builder.put(grammarAccess.getExtendedIDAccess().getGroup(), "rule__ExtendedID__Group__0");
			builder.put(grammarAccess.getExtendedIDAccess().getGroup_1(), "rule__ExtendedID__Group_1__0");
			builder.put(grammarAccess.getExtendedIDAccess().getGroup_2(), "rule__ExtendedID__Group_2__0");
			builder.put(grammarAccess.getQualifiedIDAccess().getGroup(), "rule__QualifiedID__Group__0");
			builder.put(grammarAccess.getQualifiedIDAccess().getGroup_1(), "rule__QualifiedID__Group_1__0");
			builder.put(grammarAccess.getIntegerAccess().getGroup(), "rule__Integer__Group__0");
			builder.put(grammarAccess.getFloategerAccess().getGroup(), "rule__Floateger__Group__0");
			builder.put(grammarAccess.getCommentAnnotationAccess().getValuesAssignment(), "rule__CommentAnnotation__ValuesAssignment");
			builder.put(grammarAccess.getCommentAnnotatonSLAccess().getValuesAssignment(), "rule__CommentAnnotatonSL__ValuesAssignment");
			builder.put(grammarAccess.getTagAnnotationAccess().getNameAssignment_1(), "rule__TagAnnotation__NameAssignment_1");
			builder.put(grammarAccess.getPragmaTagAccess().getNameAssignment_1(), "rule__PragmaTag__NameAssignment_1");
			builder.put(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1(), "rule__KeyStringValueAnnotation__NameAssignment_1");
			builder.put(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_2(), "rule__KeyStringValueAnnotation__ValuesAssignment_2");
			builder.put(grammarAccess.getKeyStringValueAnnotationAccess().getValuesAssignment_3_1(), "rule__KeyStringValueAnnotation__ValuesAssignment_3_1");
			builder.put(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameAssignment_1(), "rule__RestrictedKeyStringValueAnnotation__NameAssignment_1");
			builder.put(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_2(), "rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_2");
			builder.put(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesAssignment_3_1(), "rule__RestrictedKeyStringValueAnnotation__ValuesAssignment_3_1");
			builder.put(grammarAccess.getStringPragmaAccess().getNameAssignment_1(), "rule__StringPragma__NameAssignment_1");
			builder.put(grammarAccess.getStringPragmaAccess().getValuesAssignment_2(), "rule__StringPragma__ValuesAssignment_2");
			builder.put(grammarAccess.getStringPragmaAccess().getValuesAssignment_3_1(), "rule__StringPragma__ValuesAssignment_3_1");
			builder.put(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1(), "rule__TypedKeyStringValueAnnotation__NameAssignment_1");
			builder.put(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3(), "rule__TypedKeyStringValueAnnotation__TypeAssignment_3");
			builder.put(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_5(), "rule__TypedKeyStringValueAnnotation__ValuesAssignment_5");
			builder.put(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1(), "rule__TypedKeyStringValueAnnotation__ValuesAssignment_6_1");
			builder.put(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameAssignment_1(), "rule__RestrictedTypedKeyStringValueAnnotation__NameAssignment_1");
			builder.put(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3(), "rule__RestrictedTypedKeyStringValueAnnotation__TypeAssignment_3");
			builder.put(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5(), "rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_5");
			builder.put(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1(), "rule__RestrictedTypedKeyStringValueAnnotation__ValuesAssignment_6_1");
			builder.put(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameAssignment_1(), "rule__QuotedKeyStringValueAnnotation__NameAssignment_1");
			builder.put(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_2(), "rule__QuotedKeyStringValueAnnotation__ValuesAssignment_2");
			builder.put(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesAssignment_3_1(), "rule__QuotedKeyStringValueAnnotation__ValuesAssignment_3_1");
			builder.put(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameAssignment_1(), "rule__QuotedTypedKeyStringValueAnnotation__NameAssignment_1");
			builder.put(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeAssignment_3(), "rule__QuotedTypedKeyStringValueAnnotation__TypeAssignment_3");
			builder.put(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_5(), "rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_5");
			builder.put(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesAssignment_6_1(), "rule__QuotedTypedKeyStringValueAnnotation__ValuesAssignment_6_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private AnnotationsGrammarAccess grammarAccess;

	@Override
	protected InternalAnnotationsParser createParser() {
		InternalAnnotationsParser result = new InternalAnnotationsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AnnotationsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AnnotationsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
