package de.cau.cs.kieler.yakindu.synccharts.ui.integration.text.parsers;

import java.util.Collection;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import de.cau.cs.kieler.yakindu.synccharts.model.text.ui.contentassist.antlr.internal.InternalSyncTextParser;
import de.cau.cs.kieler.yakindu.synccharts.model.text.ui.contentassist.antlr.SyncTextParser;

public class StatechartContentAssistParser extends SyncTextParser {
	@Override
	protected Collection<FollowElement> getFollowElements(
			AbstractInternalContentAssistParser parser) {
		try {
			InternalSyncTextParser typedParser = (InternalSyncTextParser) parser;
			typedParser.entryRuleStatechartSpecification();
			return typedParser.getFollowElements();
		} catch (RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}
}
