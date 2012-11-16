package de.cau.kieler.scc.ui.integration.scctext.parsers;

import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import de.cau.kieler.scc.model.scctext.ui.contentassist.antlr.SCCExpParser;
import de.cau.kieler.scc.model.scctext.ui.contentassist.antlr.internal.InternalSCCExpParser;

public class TransitionContentAssistParser extends SCCExpParser {
	@Override
	protected Collection<FollowElement> getFollowElements(
			AbstractInternalContentAssistParser parser) {
		try {
			InternalSCCExpParser typedParser = (InternalSCCExpParser) parser;
			typedParser.entryRuleTransitionSpecification();
			return typedParser.getFollowElements();
		} catch (RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}
}