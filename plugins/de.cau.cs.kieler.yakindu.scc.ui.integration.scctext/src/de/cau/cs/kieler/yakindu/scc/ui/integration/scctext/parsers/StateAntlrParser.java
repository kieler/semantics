package de.cau.cs.kieler.yakindu.scc.ui.integration.scctext.parsers;

import org.yakindu.sct.model.stext.stext.StateSpecification; 
import de.cau.cs.kieler.yakindu.scc.model.scctext.parser.antlr.SCCExpParser;

public class StateAntlrParser extends SCCExpParser {
	@Override
	protected String getDefaultRuleName() {
		return StateSpecification.class.getSimpleName();
	}
}
