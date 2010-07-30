/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.expressions.formatting;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.util.Pair;

import de.cau.cs.kieler.core.expressions.services.ExpressionsGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 * 
 * @author chsch
 * 
 */
public class ExpressionsFormatter extends AbstractDeclarativeFormatter {
	
    /**
     * Delegates to customConfigureFormatting.
     */
	@Override
	protected void configureFormatting(FormattingConfig c) {
		customConfigureFormatting(c, (ExpressionsGrammarAccess) getGrammarAccess());
	}
	
	/**
	 * Method contains actual formatting instructions while GrammarAccess class
	 * maybe parameterized allowing the reuse within ActionsFormatter. 
	 * @param c FormattingConfig provided by caller
	 * @param f GrammarAccess provided by caller
	 */
	protected void customConfigureFormatting(FormattingConfig c, ExpressionsGrammarAccess f) {
		
		for(Pair<Keyword, Keyword> pair: f.findKeywordPairs("{", "}")) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
			c.setLinewrap(1).after(pair.getFirst());
			c.setLinewrap(1).before(pair.getSecond());
			c.setLinewrap(1).after(pair.getSecond());
		}
		for(Keyword comma: f.findKeywords(",")) {
			c.setNoLinewrap().before(comma);
			c.setNoSpace().before(comma);
		}
		
		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());
		
		
		// Added by chsch:
		
		//Don't insert space after left parenthesis
		c.setNoSpace().after(f.getValueTestOperatorRule());
		for (Keyword lPar : f.findKeywords("(")) {
			c.setNoSpace().after(lPar);
		}

		//Don't insert space before right parenthesis
		for (Keyword lPar : f.findKeywords(")")) {
			c.setNoSpace().before(lPar);
		}
		
		//Don't insert space after value test operator ('?')
		c.setNoSpace().after(f.getPreOperatorRule());
		
		c.setNoSpace().before(f.getTextExpressionRule());
	}
	
}
