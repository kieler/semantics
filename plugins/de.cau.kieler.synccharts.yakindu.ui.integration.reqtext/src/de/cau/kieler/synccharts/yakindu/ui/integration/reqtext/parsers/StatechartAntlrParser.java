package de.cau.kieler.synccharts.yakindu.ui.integration.reqtext.parsers;

import org.yakindu.sct.model.stext.stext.StatechartSpecification;

import de.cau.kieler.synccharts.yakindu.model.reqtext.parser.antlr.KidsexpParser;

public class StatechartAntlrParser extends KidsexpParser {
	@Override
	protected String getDefaultRuleName() {
		return StatechartSpecification.class.getSimpleName();
	}
}