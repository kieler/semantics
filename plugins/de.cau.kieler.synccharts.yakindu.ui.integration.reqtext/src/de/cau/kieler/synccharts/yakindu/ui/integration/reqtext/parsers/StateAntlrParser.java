package de.cau.kieler.synccharts.yakindu.ui.integration.reqtext.parsers;

import org.yakindu.sct.model.stext.stext.StateSpecification;

import de.cau.kieler.synccharts.yakindu.model.reqtext.parser.antlr.KidsexpParser;

public class StateAntlrParser extends KidsexpParser {
	@Override
	protected String getDefaultRuleName() {
		return StateSpecification.class.getSimpleName();
	}
}