package de.cau.cs.kieler.yakindu.synccharts.ui.integration.stext.parsers;

import java.util.Collection;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import de.cau.cs.kieler.yakindu.synccharts.model.stext.ui.contentassist.antlr.SyncExpParser;
import de.cau.cs.kieler.yakindu.synccharts.model.stext.ui.contentassist.antlr.internal.InternalSyncExpParser;



public class StateContentAssistParser extends SyncExpParser {
	@Override
	protected Collection<FollowElement> getFollowElements(
			AbstractInternalContentAssistParser parser) {
		try {
			InternalSyncExpParser typedParser = (InternalSyncExpParser) parser;
			typedParser.entryRuleStateSpecification();
			return typedParser.getFollowElements();
		} catch (RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}
}
