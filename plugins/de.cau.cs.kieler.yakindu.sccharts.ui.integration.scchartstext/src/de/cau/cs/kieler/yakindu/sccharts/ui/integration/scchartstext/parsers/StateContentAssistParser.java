package de.cau.cs.kieler.yakindu.sccharts.ui.integration.scchartstext.parsers;

import java.util.Collection;

import org.antlr.runtime.RecognitionException;

import de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.ui.contentassist.antlr.SCChartsExpParser;

import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.ui.contentassist.antlr.internal.InternalSCChartsExpParser;

public class StateContentAssistParser extends SCChartsExpParser {
	@Override
	protected Collection<FollowElement> getFollowElements(
			AbstractInternalContentAssistParser parser) {
		try {
			InternalSCChartsExpParser typedParser = (InternalSCChartsExpParser) parser;
			typedParser.entryRuleStateSpecification();
			return typedParser.getFollowElements();
		} catch (RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}
}
