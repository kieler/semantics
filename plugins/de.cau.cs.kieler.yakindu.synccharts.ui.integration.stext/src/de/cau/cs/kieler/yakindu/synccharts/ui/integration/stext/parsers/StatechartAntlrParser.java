package de.cau.cs.kieler.yakindu.synccharts.ui.integration.stext.parsers;

import org.yakindu.sct.model.stext.stext.StatechartSpecification;

import de.cau.cs.kieler.yakindu.synccharts.model.stext.parser.antlr.SyncExpParser;

public class StatechartAntlrParser extends SyncExpParser {
	@Override
	protected String getDefaultRuleName() {
		return StatechartSpecification.class.getSimpleName();
	}
}
