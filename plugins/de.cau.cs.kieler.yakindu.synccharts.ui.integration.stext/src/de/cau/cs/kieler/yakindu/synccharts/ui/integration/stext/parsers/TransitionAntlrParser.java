package de.cau.cs.kieler.yakindu.synccharts.ui.integration.stext.parsers;

import org.yakindu.sct.model.stext.stext.TransitionSpecification;

import de.cau.cs.kieler.yakindu.synccharts.model.stext.parser.antlr.SyncChartstextParser;


public class TransitionAntlrParser extends SyncChartstextParser {
	@Override
	protected String getDefaultRuleName() {
		return TransitionSpecification.class.getSimpleName();
	}
}
