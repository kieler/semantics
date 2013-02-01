package de.cau.cs.kieler.yakindu.synccharts.ui.integration.stext.parsers;

import org.yakindu.sct.model.stext.stext.StatechartSpecification;
import de.cau.cs.kieler.yakindu.synccharts.model.text.parser.antlr.SyncTextParser;

public class StatechartAntlrParser extends SyncTextParser {
	@Override
	protected String getDefaultRuleName() {
		return StatechartSpecification.class.getSimpleName();
	}
}
