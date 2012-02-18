package de.cau.cs.kieler.core.annotations.text.ui;

import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

/**
 * Custom {@link AbstractAntlrTokenToAttributeIdMapper} contributing highlighting to Xtext editors
 * encompassing Annotations. It defines custom mappings of keywords and terminals to highlighting
 * configurations.
 * 
 * @author chsch
 */
public class AnnotationsAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

    protected String calculateId(String tokenName, int tokenType) {
        if ("RULE_COMMENT_ANNOTATION".equals(tokenName)) {
            return AnnotationsHighlightingConfiguration.COMMENT_ANNOTATION;
        }
        if ("'@'".equals(tokenName)) {
            return AnnotationsHighlightingConfiguration.ANNOTATION_KEY;
        }

        return super.calculateId(tokenName, tokenType);
    }

}
