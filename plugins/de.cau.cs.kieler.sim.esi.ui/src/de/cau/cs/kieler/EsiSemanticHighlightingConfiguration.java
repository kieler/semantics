package de.cau.cs.kieler;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.ISemanticHighlightingConfiguration;
import org.eclipse.xtext.ui.core.editor.utils.TextStyle;

public class EsiSemanticHighlightingConfiguration implements
		ISemanticHighlightingConfiguration {

	// provide an id string for the highlighting calculator
	public static final String DUMMYHL = "dummyHighlighting";

	// configure the acceptor providing the id, the description string
	// that will appear in the preference page and the initial text style
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(DUMMYHL, "AdditionalDummyType",
				dummytype());
	}

	// method for calculating an actual text styles
	public TextStyle dummytype() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(155, 55, 255));
		textStyle.setColor(new RGB(100, 0, 0));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
}
