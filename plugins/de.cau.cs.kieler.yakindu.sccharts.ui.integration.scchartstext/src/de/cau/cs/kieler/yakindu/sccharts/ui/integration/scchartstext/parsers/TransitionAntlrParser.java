package de.cau.cs.kieler.yakindu.sccharts.ui.integration.scchartstext.parsers;

import org.yakindu.sct.model.stext.stext.TransitionSpecification;
import de.cau.cs.kieler.yakindu.sccharts.model.scchartstext.parser.antlr.SCChartsExpParser;

public class TransitionAntlrParser extends SCChartsExpParser {
	@Override
	protected String getDefaultRuleName() {
		return TransitionSpecification.class.getSimpleName();
	}
}