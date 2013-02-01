package de.cau.cs.kieler.yakindu.sccharts.ui.integration.stext.parsers;

import org.yakindu.sct.model.stext.stext.StatechartSpecification;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.parser.antlr.SCChartsExpParser;

public class StatechartAntlrParser extends SCChartsExpParser {
	@Override
	protected String getDefaultRuleName() {
		return StatechartSpecification.class.getSimpleName();
	}
}
