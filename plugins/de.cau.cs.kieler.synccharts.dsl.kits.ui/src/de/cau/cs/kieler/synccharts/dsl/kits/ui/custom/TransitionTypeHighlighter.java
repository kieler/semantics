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
package de.cau.cs.kieler.synccharts.dsl.kits.ui.custom;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.core.editor.utils.TextStyle;

/**
 * @author oba
 * 
 */
public class TransitionTypeHighlighter extends
// DefaultLexicalHighlightingConfiguration {
        DefaultHighlightingConfiguration {

    public static final String WEAKABORT_KEYWORD = "-->";
    public static final String NORMALTERMINATION_KEYWORD = ">->";

    // public static final String TRUE_KEYWORD = "true";
    // public static final String FALSE_KEYWORD = "false";

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.xtext.ui.common.editor.syntaxcoloring.
     * ILexicalHighlightingConfiguration
     * #configure(org.eclipse.xtext.ui.common.editor
     * .syntaxcoloring.IHighlightingConfigurationAcceptor)
     */
    @Override
    public void configure(IHighlightingConfigurationAcceptor acceptor) {

        acceptor.acceptDefaultHighlighting(NORMALTERMINATION_KEYWORD,
                "NormalTermination", keywordTextStyle());
        acceptor.acceptDefaultHighlighting(WEAKABORT_KEYWORD, "WeakAbort",
                keywordTextStyle());
        // acceptor.acceptDefaultHighlighting(FALSE_KEYWORD, "False",
        // keywordTextStyle());
        // acceptor.acceptDefaultHighlighting(TRUE_KEYWORD, "True",
        // keywordTextStyle());
        super.configure(acceptor);
    }

    /**
     * @return keywordTextStyle copied from
     * 
     *         {@link org.eclipse.xtext.ui.common.editor.syntaxcoloring.DefaultLexicalHighlightingConfiguration#keywordTextStyle()}
     */
    @Override
    public TextStyle keywordTextStyle() {
        TextStyle textStyle = defaultTextStyle().copy();
        textStyle.setColor(new RGB(127, 0, 85));
        textStyle.setStyle(SWT.BOLD);
        return textStyle;
    }

    /**
     * @return defaultTextStyle copied from
     * 
     *         {@link org.eclipse.xtext.ui.common.editor.syntaxcoloring.DefaultLexicalHighlightingConfiguration#defaultTextStyle()}
     */
    @Override
    public TextStyle defaultTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setBackgroundColor(new RGB(255, 255, 255));
        textStyle.setColor(new RGB(0, 0, 0));
        return textStyle;
    }
}
