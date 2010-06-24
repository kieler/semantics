package de.cau.cs.kieler.synccharts.text.kits.ui;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.antlr.DefaultAntlrTokenToAttributeIdMapper;

public class CustomAntlrTokenToAttributeIdMapper extends
		DefaultAntlrTokenToAttributeIdMapper {
	
	protected String calculateId(String tokenName, int tokenType) {
		if (tokenName.equals("'-->'")) {
			return DefaultHighlightingConfiguration.KEYWORD_ID;
		}
		if (tokenName.equals("'>->'")) {
			return DefaultHighlightingConfiguration.KEYWORD_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}

}
