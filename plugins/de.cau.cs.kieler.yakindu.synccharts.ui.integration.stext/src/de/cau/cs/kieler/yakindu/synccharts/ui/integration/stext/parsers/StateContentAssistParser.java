package de.cau.cs.kieler.yakindu.synccharts.ui.integration.stext.parsers;

import java.util.Collection;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import de.cau.cs.kieler.yakindu.synccharts.model.stext.ui.contentassist.antlr.SyncChartstextParser;
import de.cau.cs.kieler.yakindu.synccharts.model.stext.ui.contentassist.antlr.internal.InternalSyncChartstextParser;



public class StateContentAssistParser extends SyncChartstextParser {
	@Override
	protected Collection<FollowElement> getFollowElements(
			AbstractInternalContentAssistParser parser) {
		try {
			InternalSyncChartstextParser typedParser = (InternalSyncChartstextParser) parser;
			typedParser.entryRuleStateSpecification();
			return typedParser.getFollowElements();
		} catch (RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}
}
