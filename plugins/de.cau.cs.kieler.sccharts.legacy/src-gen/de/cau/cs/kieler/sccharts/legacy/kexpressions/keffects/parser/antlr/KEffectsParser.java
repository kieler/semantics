/*
 * generated by Xtext
 */
package de.cau.cs.kieler.sccharts.legacy.kexpressions.keffects.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import de.cau.cs.kieler.sccharts.legacy.kexpressions.keffects.services.KEffectsGrammarAccess;

public class KEffectsParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private KEffectsGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected de.cau.cs.kieler.sccharts.legacy.kexpressions.keffects.parser.antlr.internal.InternalKEffectsParser createParser(XtextTokenStream stream) {
		return new de.cau.cs.kieler.sccharts.legacy.kexpressions.keffects.parser.antlr.internal.InternalKEffectsParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Effect";
	}
	
	public KEffectsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(KEffectsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
