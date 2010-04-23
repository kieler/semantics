package de.cau.cs.kieler.esterel.highlighting;

import org.eclipse.xtext.ui.common.editor.syntaxcoloring.DefaultLexicalHighlightingConfiguration;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.antlr.DefaultAntlrTokenToAttributeIdMapper;

public class EsterelAntlrTokenToAttributeIdMapper extends
		DefaultAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		// Highlighting for Esterel comments
		if ("RULE_ESTEREL_ML_COMMENT".equals(tokenName)
				| "RULE_ESTEREL_SL_COMMENT".equals(tokenName)) {
			return DefaultLexicalHighlightingConfiguration.COMMENT_ID;
		}
		// remove highlighting for default comments
		if ("RULE_ML_COMMENT".equals(tokenName)
				| "RULE_SL_COMMENT".equals(tokenName)) {
			return DefaultLexicalHighlightingConfiguration.DEFAULT_ID;
		}
		return super.calculateId(tokenName, tokenType);

	}

}
