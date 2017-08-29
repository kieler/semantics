/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.annotations.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * Custom {@link org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration} contributing
 * to text editors of DSLs based on this Annotations language. Provides profile for key value
 * annotations' keys highlighting.
 * 
 * @author chsch ssm
 */
public class AnnotationsHighlightingConfiguration extends DefaultHighlightingConfiguration {

    /** The String identifier of the highlighting profile of annotation keys. */
    public static final String ANNOTATION_KEY = "annotationKey";

    /** The String identifier of the highlighting profile of comment annotations and annotation
     * values. */
    public static final String COMMENT_ANNOTATION = "commentAnnotation";
    public static final String PRAGMA_KEY = "pragmaKey";

    @Override
    public void configure(final IHighlightingConfigurationAcceptor acceptor) {
        super.configure(acceptor);
        acceptor.acceptDefaultHighlighting(ANNOTATION_KEY, "AnnotationKey",
                annotationKeyTextStyle());
        acceptor.acceptDefaultHighlighting(COMMENT_ANNOTATION, "CommentAnnotation",
                commentAnnotationTextStyle());
        acceptor.acceptDefaultHighlighting(PRAGMA_KEY, "PragmaKey",
                pragmaStyle());
    }

    private TextStyle annotationKeyTextStyle() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor(new RGB(0x86, 0x9D, 0xB9)); // SUPPRESS CHECKSTYLE MagicNumber
        textStyle.setStyle(SWT.BOLD);
        return textStyle;
    }

    private TextStyle commentAnnotationTextStyle() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor(new RGB(0x42, 0x60, 0xB8)); // SUPPRESS CHECKSTYLE MagicNumber
        return textStyle;
    }
    
    private TextStyle pragmaStyle() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor(new RGB(0x32, 0xA9, 0x6D)); // SUPPRESS CHECKSTYLE MagicNumber
        return textStyle;
    }

}
