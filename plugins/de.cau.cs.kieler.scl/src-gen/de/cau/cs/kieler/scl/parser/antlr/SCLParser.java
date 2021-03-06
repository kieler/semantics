/*
 * generated by Xtext
 */
package de.cau.cs.kieler.scl.parser.antlr;

import com.google.inject.Inject;
import de.cau.cs.kieler.scl.parser.antlr.internal.InternalSCLParser;
import de.cau.cs.kieler.scl.services.SCLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SCLParser extends AbstractAntlrParser {

	@Inject
	private SCLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSCLParser createParser(XtextTokenStream stream) {
		return new InternalSCLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "SCLProgram";
	}

	public SCLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SCLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
