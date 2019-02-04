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
package de.cau.cs.kieler.kexpressions.ui

import org.eclipse.swt.SWT
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle
import de.cau.cs.kieler.annotations.ui.AnnotationsHighlightingConfiguration

/** 
 * @author ssm, als
 */
class KExpressionsHighlightingConfiguration extends AnnotationsHighlightingConfiguration {
    public static final String CALL = "KExpressions.call"

    override void configure(IHighlightingConfigurationAcceptor acceptor) {
        acceptor.acceptDefaultHighlighting(CALL, "Call", functionCall())
        super.configure(acceptor)
    }

    def TextStyle functionCall() {
        var TextStyle textStyle = defaultTextStyle().copy()
        textStyle.setStyle(SWT.ITALIC)
        return textStyle
    }
}
