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
package de.cau.cs.kieler.core.annotations.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * Custom {@link IHighlightingConfiguration} contributing to text editors of DSLs based on this
 * Annotations language. Provides profile for key value annotations' keys highlighting.
 * 
 * @author chsch
 */
public class AnnotationsHighlightingConfiguration extends
		DefaultHighlightingConfiguration {

    public static final String ANNOTATION_KEY = "annotationKey";
    public static final String COMMENT_ANNOTATION = "commentAnnotation";

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(ANNOTATION_KEY, "AnnotationKey", annotationKeyTextStyle());
		acceptor.acceptDefaultHighlighting(COMMENT_ANNOTATION, "CommentAnnotation", commentAnnotationTextStyle());
	}
		
	public TextStyle annotationKeyTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0x86, 0x9D, 0xB9));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle commentAnnotationTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0x42, 0x60, 0xB8));
		return textStyle;
	}


}
