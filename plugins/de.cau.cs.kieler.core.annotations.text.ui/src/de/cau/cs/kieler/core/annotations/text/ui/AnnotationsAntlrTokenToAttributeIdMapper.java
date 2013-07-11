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
package de.cau.cs.kieler.core.annotations.text.ui;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

/**
 * Custom {@link org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper}
 * contributing highlighting to Xtext editors encompassing Annotations. It defines custom mappings
 * of keywords and terminals to highlighting configurations.
 * 
 * @author chsch
 */
public class AnnotationsAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

    @Override
    protected String calculateId(final String tokenName, final int tokenType) {
        if ("RULE_COMMENT_ANNOTATION".equals(tokenName)) {
            return AnnotationsHighlightingConfiguration.COMMENT_ANNOTATION;
        }
        if ("'@'".equals(tokenName)) {
            return AnnotationsHighlightingConfiguration.ANNOTATION_KEY;
        }
        if ("RULE_ANNOTATION_KEY".equals(tokenName)) {
            return AnnotationsHighlightingConfiguration.ANNOTATION_KEY;
        }

        return super.calculateId(tokenName, tokenType);
    }

}
