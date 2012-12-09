package de.cau.cs.kieler.yakindu.sccharts.ui.integration.scchartstext.parsers;

import org.yakindu.sct.model.stext.stext.StateSpecification;

import de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.parser.antlr.SCChartsExpParser;

public class StateAntlrParser extends SCChartsExpParser {
	@Override
	protected String getDefaultRuleName() {
		return StateSpecification.class.getSimpleName();
	}
}
