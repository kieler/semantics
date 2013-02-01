package de.cau.cs.kieler.yakindu.synccharts.ui.integration.stext.parsers;

import org.yakindu.sct.model.stext.stext.StateSpecification;

import de.cau.cs.kieler.yakindu.synccharts.model.text.parser.antlr.SyncTextParser;

public class StateAntlrParser extends SyncTextParser {
	@Override
	protected String getDefaultRuleName() {
		return StateSpecification.class.getSimpleName();
	}
}
