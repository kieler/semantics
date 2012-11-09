package de.cau.kieler.synccharts.yakindu.ui.integration.reqtext.parsers;

import org.yakindu.sct.model.stext.stext.TransitionSpecification;
import de.cau.kieler.synccharts.yakindu.model.reqtext.parser.antlr.KidsexpParser;

public class TransitionAntlrParser extends KidsexpParser {
	@Override
	protected String getDefaultRuleName() {
		return TransitionSpecification.class.getSimpleName();
	}
}