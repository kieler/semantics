package de.cau.cs.kieler.yakindu.synccharts.ui.integration.stext.parsers;

import org.yakindu.sct.model.stext.stext.TransitionSpecification;

import de.cau.cs.kieler.yakindu.synccharts.model.stext.parser.antlr.SyncExpParser;


public class TransitionAntlrParser extends SyncExpParser {
	@Override
	protected String getDefaultRuleName() {
		return TransitionSpecification.class.getSimpleName();
	}
}
