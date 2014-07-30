package de.cau.cs.kieler.yakindu.sccharts.ui.integration.stext.parsers;

import java.util.Collection;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.ui.contentassist.antlr.SynctextParser;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.ui.contentassist.antlr.internal.InternalSynctextParser;

public class StateContentAssistParser extends SynctextParser {
	@Override
	protected Collection<FollowElement> getFollowElements(
			AbstractInternalContentAssistParser parser) {
		try {
		    InternalSynctextParser typedParser = (InternalSynctextParser) parser;
			typedParser.entryRuleStateSpecification();
			return typedParser.getFollowElements();
		} catch (RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}
}
