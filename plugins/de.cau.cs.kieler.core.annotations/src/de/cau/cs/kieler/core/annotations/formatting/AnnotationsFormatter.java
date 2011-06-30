/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.annotations.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

import de.cau.cs.kieler.core.annotations.services.AnnotationsGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * @author chsch
 */
public class AnnotationsFormatter extends AbstractDeclarativeFormatter {
    /**
     * The interface method called by the runtime, delegating to
     * {@link AnnotationsFormatter#customConfigureFormatting(FormattingConfig, AnnotationsGrammarAccess)}
     * .
     * 
     * @param c the provided {@link FormattingConfig} accepting the provided instructions. 
     */
    @Override
    protected void configureFormatting(final FormattingConfig c) {
        customConfigureFormatting(c, (AnnotationsGrammarAccess) getGrammarAccess());
    }

    /**
     * Method contains actual formatting instructions while GrammarAccess class maybe parameterized
     * allowing the reuse within ExpressionsFormatter.
     * 
     * @param c
     *            FormattingConfig provided by caller
     * @param f
     *            GrammarAccess provided by caller
     */
    protected void customConfigureFormatting(final FormattingConfig c,
            final AnnotationsGrammarAccess f) {
        c.setNoSpace().before(
                f.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
        c.setNoSpace().after(
                f.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
        c.setNoSpace().before(
                f.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());

        c.setLinewrap().after(f.getImportAnnotationRule());

        c.setLinewrap().after(f.getCOMMENT_ANNOTATIONRule());
        c.setLinewrap().after(f.getTagAnnotationRule());
        c.setLinewrap().after(f.getKeyStringValueAnnotationRule());
        c.setLinewrap().after(f.getKeyBooleanValueAnnotationRule());
        c.setLinewrap().after(f.getKeyIntValueAnnotationRule());
        c.setLinewrap().after(f.getKeyFloatValueAnnotationRule());
        c.setLinewrap().after(f.getTypedKeyStringValueAnnotationRule());

        c.setLinewrap().after(
                f.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0());
        c.setLinewrap().after(f.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
        c.setLinewrap().after(
                f.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0());
        c.setLinewrap().after(
                f.getKeyBooleanValueAnnotationAccess().getValueBooleanTerminalRuleCall_2_0());
        c.setLinewrap().after(f.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0());
        c.setLinewrap().after(
                f.getKeyFloatValueAnnotationAccess().getValueFloatTerminalRuleCall_2_0());

        for (Keyword at : f.findKeywords("@")) {
            c.setNoSpace().after(at);
        }

        for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("(", ")")) {
            c.setIndentation(pair.getFirst(), pair.getSecond());
        }
    }
}
