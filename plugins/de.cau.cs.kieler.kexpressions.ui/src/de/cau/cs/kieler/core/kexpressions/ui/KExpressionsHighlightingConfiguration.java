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
package de.cau.cs.kieler.core.kexpressions.ui;

import org.eclipse.swt.SWT;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

import de.cau.cs.kieler.core.annotations.text.ui.AnnotationsHighlightingConfiguration;

/**
 *
 * @author ssm
 */
public class KExpressionsHighlightingConfiguration extends
AnnotationsHighlightingConfiguration {

    public static final String FUNCTIONCALL = "KEXPRESSIONS.functionCall";

    public void configure(IHighlightingConfigurationAcceptor acceptor) {

        acceptor.acceptDefaultHighlighting( FUNCTIONCALL, "FunctionCall", functionCall() );

        super.configure( acceptor );
    }

    public TextStyle functionCall() {
        TextStyle textStyle = defaultTextStyle().copy();
//        textStyle.setColor( new RGB( 0, 133, 0 ) ); 
        textStyle.setStyle( SWT.ITALIC );
        return textStyle;
    }
}

