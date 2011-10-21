/*
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
package de.cau.cs.kieler.core.kexpressions.formatting;

import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.Keyword;

import de.cau.cs.kieler.core.annotations.formatting.AnnotationsFormatter;
import de.cau.cs.kieler.core.kexpressions.services.KExpressionsGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * @author chsch
 * 
 */
public class KExpressionsFormatter extends AnnotationsFormatter {

    /**
     * Delegates to customConfigureFormatting.
     */
    @Override
    protected void configureFormatting(FormattingConfig c) {
        customConfigureFormatting(c, (KExpressionsGrammarAccess) getGrammarAccess());
    }

    /**
     * Method contains actual formatting instructions while GrammarAccess class maybe parameterized
     * allowing the reuse within ActionsFormatter.
     * 
     * @param c
     *            FormattingConfig provided by caller
     * @param f
     *            GrammarAccess provided by caller
     */
    protected void customConfigureFormatting(FormattingConfig c, KExpressionsGrammarAccess f) {
        super.customConfigureFormatting(c, f.getAnnotationsGrammarAccess());

        for (Keyword comma : f.findKeywords(",")) {
            c.setNoLinewrap().before(comma);
            c.setNoSpace().before(comma);
        }

        // Don't insert space after value test ('?') and 'pre' Operator
        c.setNoSpace().after(f.getValueTestOperatorRule());
        c.setNoSpace().after(f.getPreOperatorRule());

        for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("(", ")")) {
            Grammar g = EcoreUtil2.getContainerOfType(pair.getFirst(), Grammar.class);

            // For all pairs '(' ')' that are introduced in KExpression and Grammars
            //  leveraging KExpressions (i.e. not Annotations) ...
            if (g != null && !g.getName().equals(AnnotationsFormatter.LANGUAGE_NAME)) {
                // ... don't insert space after left parenthesis
                c.setNoSpace().after(pair.getFirst());
                // ... don't insert space before right parenthesis
                c.setNoSpace().before(pair.getSecond());
                c.setNoLinewrap().after(pair.getSecond());
            }
        }
    }

}
