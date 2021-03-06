/*
 * generated by Xtext
 */
package de.cau.cs.kieler.sim.eso.formatting;

import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting on how and when to
 * use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 * 
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow cmot
 */
public class EsoFormatter extends AbstractDeclarativeFormatter {

    @Override
    protected void configureFormatting(FormattingConfig c) {
        de.cau.cs.kieler.sim.eso.services.EsoGrammarAccess f = (de.cau.cs.kieler.sim.eso.services.EsoGrammarAccess) getGrammarAccess();
        Iterable<Keyword> keywords = GrammarUtil.containedKeywords(f.getGrammar());

        for (Keyword keyword : keywords) {
            if (("!".equals(keyword.getValue()))) {
                c.setNoSpace().after(keyword);
            } else if (";".equals(keyword.getValue())) {
                c.setLinewrap().after(keyword);
            }
        }

        // ...
    }
}
