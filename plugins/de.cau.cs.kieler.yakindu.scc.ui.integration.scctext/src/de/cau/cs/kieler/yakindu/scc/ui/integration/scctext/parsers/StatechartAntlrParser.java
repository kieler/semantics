package de.cau.cs.kieler.yakindu.scc.ui.integration.scctext.parsers;

import org.yakindu.sct.model.stext.stext.StatechartSpecification; 
import de.cau.cs.kieler.yakindu.scc.model.scctext.parser.antlr.SCCExpParser;

public class StatechartAntlrParser extends SCCExpParser {
	@Override
	protected String getDefaultRuleName() {
		return StatechartSpecification.class.getSimpleName();
	}
}
