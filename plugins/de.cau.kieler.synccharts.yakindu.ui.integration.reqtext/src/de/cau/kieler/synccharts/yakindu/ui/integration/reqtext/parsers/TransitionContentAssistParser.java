package de.cau.kieler.synccharts.yakindu.ui.integration.reqtext.parsers;

import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import de.cau.kieler.synccharts.yakindu.model.reqtext.ui.contentassist.antlr.KidsexpParser;
import de.cau.kieler.synccharts.yakindu.model.reqtext.ui.contentassist.antlr.internal.InternalKidsexpParser;

public class TransitionContentAssistParser extends KidsexpParser {
	@Override
	protected Collection<FollowElement> getFollowElements(
			AbstractInternalContentAssistParser parser) {
		try {
			InternalKidsexpParser typedParser = (InternalKidsexpParser) parser;
			typedParser.entryRuleTransitionSpecification();
			return typedParser.getFollowElements();
		} catch (RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}
}