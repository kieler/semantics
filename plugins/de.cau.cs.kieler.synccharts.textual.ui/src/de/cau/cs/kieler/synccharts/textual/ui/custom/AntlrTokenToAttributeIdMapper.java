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
package de.cau.cs.kieler.synccharts.textual.ui.custom;

import org.eclipse.xtext.ui.common.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.antlr.DefaultAntlrTokenToAttributeIdMapper;

/**
 * @author oba maps the tokens to
 */
public class AntlrTokenToAttributeIdMapper extends
        DefaultAntlrTokenToAttributeIdMapper {

    /*
     * (non-Javadoc)
     * 
     * @seeorg.eclipse.xtext.ui.common.editor.syntaxcoloring.antlr.
     * AbstractAntlrTokenToAttributeIdMapper#calculateId(java.lang.String, int)
     */
    @Override
    protected String calculateId(String tokenName, int tokenType) {

        if (// TransitionType.NORMALTERMINATION.equals(tokenName) ||
        "'>->'".equals(tokenName)) {
            return TransitionTypeHighlighter.NORMALTERMINATION_KEYWORD;
        } else if ("'-->'".equals(tokenName)) {
            return TransitionTypeHighlighter.WEAKABORT_KEYWORD;
        } else if ("BOOLEAN".equals(tokenName)) {
            return DefaultHighlightingConfiguration.KEYWORD_ID;
        }
        // else if ("'true'".equals(tokenName)) {
        // return TransitionTypeHighlighter.TRUE_KEYWORD;
        // } else if ("false".equals(tokenName)) {
        // return TransitionTypeHighlighter.FALSE_KEYWORD;
        // }

        return super.calculateId(tokenName, tokenType);
    }
}
