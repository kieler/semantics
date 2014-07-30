package de.cau.cs.kieler.yakindu.sccharts.ui.integration.stext.parsers;

import org.yakindu.sct.model.stext.stext.StateSpecification;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.parser.antlr.SynctextParser;

public class StateAntlrParser extends SynctextParser {
	@Override
	protected String getDefaultRuleName() {
		return StateSpecification.class.getSimpleName();
	}
}
