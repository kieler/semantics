/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.ui;

/**
 * @author ssm
 *
 */

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class SCLHighlightingConfiguration extends DefaultHighlightingConfiguration {

    public static final String ANNOTATION = "SCL.annotation";

    public void configure(IHighlightingConfigurationAcceptor acceptor) {

        acceptor.acceptDefaultHighlighting( ANNOTATION, "Annotation", annotation() );

        super.configure( acceptor );
    }

    public TextStyle annotation() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor( new RGB( 0, 133, 0 ) );
        textStyle.setStyle( SWT.BOLD + SWT.ITALIC );
        return textStyle;
    }
}