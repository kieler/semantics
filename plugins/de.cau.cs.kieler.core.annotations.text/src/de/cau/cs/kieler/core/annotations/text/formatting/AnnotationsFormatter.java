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

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.Grammar;
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
     * @param c
     *            the provided {@link FormattingConfig} accepting the provided instructions.
     */
    @Override
    protected void configureFormatting(final FormattingConfig c) {
        customConfigureFormatting(c, (AnnotationsGrammarAccess) getGrammarAccess());
    }

    /**
     * Name of the annotations language. Need it to distinguish the formatting for 
     * parantheses in the annotations language and further languages like KExpressions.
     * 
     * Injecting this value does not work, doing so reveals e.g. the name of the KITS language.
     * 
     * @author chsch
     */
    public static final String LANGUAGE_NAME = "de.cau.cs.kieler.core.annotations.Annotations";

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

        c.setLinewrap().after(f.getImportAnnotationRule());

        c.setLinewrap().before(f.getCOMMENT_ANNOTATIONRule());
        c.setLinewrap().after(f.getCOMMENT_ANNOTATIONRule());
        c.setLinewrap().before(f.getTagAnnotationRule());
        c.setLinewrap().after(f.getTagAnnotationRule());
        c.setLinewrap().before(f.getKeyStringValueAnnotationRule());
        c.setLinewrap().after(f.getKeyStringValueAnnotationRule());
        c.setLinewrap().before(f.getKeyBooleanValueAnnotationRule());
        c.setLinewrap().after(f.getKeyBooleanValueAnnotationRule());
        c.setLinewrap().before(f.getKeyIntValueAnnotationRule());
        c.setLinewrap().after(f.getKeyIntValueAnnotationRule());
        c.setLinewrap().before(f.getKeyFloatValueAnnotationRule());
        c.setLinewrap().after(f.getKeyFloatValueAnnotationRule());
        c.setLinewrap().before(f.getTypedKeyStringValueAnnotationRule());
        c.setLinewrap().after(f.getTypedKeyStringValueAnnotationRule());

        // have no space between '@' and the annotation name
        for (Keyword at : f.findKeywords("@")) {
            c.setNoSpace().after(at);
        }

        // have no spaces in a typed string annotation
        // like "@position[de.cau.cs.kieler.core.math.KVector]"
        c.setNoSpace().before(
                f.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
        c.setNoSpace().after(
                f.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
        c.setNoSpace().before(
                f.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());

        // NESTED ANNOTATIONS
        // establish correct indentations and line breaks in case of nested annotations
        for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("(", ")")) {
            Grammar g = EcoreUtil2.getContainerOfType(pair.getFirst(), Grammar.class);
            if (g != null && g.getName().equals(LANGUAGE_NAME)) {
                // i.e. for all pairs of '(' and ')' declared in the Annotations grammar do...
                c.setIndentation(pair.getFirst(), pair.getSecond());
                c.setLinewrap().after(pair.getFirst());
                c.setLinewrap().before(pair.getSecond());
                c.setLinewrap().after(pair.getSecond());
            }
        }
    }
}
