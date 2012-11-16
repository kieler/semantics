package de.cau.kieler.scc.ui.integration.scctext.parsers;

import org.yakindu.sct.model.stext.stext.TransitionSpecification;
import de.cau.kieler.scc.model.scctext.parser.antlr.SCCExpParser;

public class TransitionAntlrParser extends SCCExpParser {
	@Override
	protected String getDefaultRuleName() {
		return TransitionSpecification.class.getSimpleName();
	}
}