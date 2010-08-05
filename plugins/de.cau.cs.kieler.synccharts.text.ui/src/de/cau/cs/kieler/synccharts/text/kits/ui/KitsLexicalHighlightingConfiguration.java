package de.cau.cs.kieler.synccharts.text.kits.ui;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;

public class KitsLexicalHighlightingConfiguration extends
		DefaultHighlightingConfiguration {

    public static final String WEAKABORT_KEYWORD = "-->";
    public static final String NORMALTERMINATION_KEYWORD = ">->";

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
//		acceptor.acceptDefaultHighlighting(WEAKABORT_KEYWORD, "-->", keywordTextStyle());
//		acceptor.acceptDefaultHighlighting(NORMALTERMINATION_KEYWORD, "-->", keywordTextStyle());
	}
}
