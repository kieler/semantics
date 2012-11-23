package de.cau.cs.kieler.yakindu.scc.ui.integration.scctext.parsers;

import java.util.Collection;

import org.antlr.runtime.RecognitionException;

import de.cau.cs.kieler.yakindu.scc.model.scctext.ui.contentassist.antlr.SCCExpParser;

import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import de.cau.cs.kieler.yakindu.scc.model.scctext.ui.contentassist.antlr.internal.InternalSCCExpParser;

public class StatechartContentAssistParser extends SCCExpParser {
	@Override
	protected Collection<FollowElement> getFollowElements(
			AbstractInternalContentAssistParser parser) {
		try {
			InternalSCCExpParser typedParser = (InternalSCCExpParser) parser;
			typedParser.entryRuleStatechartSpecification();
			return typedParser.getFollowElements();
		} catch (RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}
}
