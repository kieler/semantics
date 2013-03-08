package de.cau.cs.kieler.yakindu.synccharts.ui.integration.stext.parsers;

import org.yakindu.sct.model.stext.stext.StateSpecification;

import de.cau.cs.kieler.yakindu.synccharts.model.stext.parser.antlr.SyncChartstextParser;

public class StateAntlrParser extends SyncChartstextParser {
	@Override
	protected String getDefaultRuleName() {
		return StateSpecification.class.getSimpleName();
	}
}
