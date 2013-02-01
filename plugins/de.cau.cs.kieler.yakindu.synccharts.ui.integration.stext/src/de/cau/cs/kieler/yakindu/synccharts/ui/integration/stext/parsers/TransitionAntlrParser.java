package de.cau.cs.kieler.yakindu.synccharts.ui.integration.stext.parsers;

import org.yakindu.sct.model.stext.stext.TransitionSpecification;

import de.cau.cs.kieler.yakindu.synccharts.model.text.parser.antlr.SyncTextParser;

public class TransitionAntlrParser extends SyncTextParser {
	@Override
	protected String getDefaultRuleName() {
		return TransitionSpecification.class.getSimpleName();
	}
}
