package de.cau.cs.kieler.yakindu.sccharts.ui.integration.stext.parsers;

import org.yakindu.sct.model.stext.stext.TransitionSpecification;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.parser.antlr.SCChartsExpParser;

public class TransitionAntlrParser extends SCChartsExpParser {
	@Override
	protected String getDefaultRuleName() {
		return TransitionSpecification.class.getSimpleName();
	}
}
