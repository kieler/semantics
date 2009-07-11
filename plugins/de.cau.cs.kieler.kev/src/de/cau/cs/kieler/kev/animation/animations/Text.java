package de.cau.cs.kieler.kev.animation.animations;


import org.apache.batik.dom.svg.SVGStylableElement;
import org.apache.batik.swing.JSVGCanvas;
import org.w3c.dom.svg.SVGTextElement;

import de.cau.cs.kieler.kev.helpers.Tools;


public class Text extends Animation {

	/**
	 * The shown text might be suffixed with some namespace tag as in SCADE,
	 * e.g. "value__namespace". To shorten things, the prefix is not displayed.
	 * This array comprises the suffix delimiters. This is a regular expression,
	 * to be used in the String.split method.
	 */
	String suffixDelimiters = "__";

	public Text(int port, SVGStylableElement element, JSVGCanvas canvas) {
		super(port, element, canvas);

	}

	@Override
	public void animate() {
		try {
			String text[] = getData().toString().split(suffixDelimiters);
			if (this.getElement() instanceof SVGTextElement) {
				((SVGTextElement) this.getElement())
						.setNodeValue(text[0]);
						//.setTextContent((text.length > 1 ? text[0] : text[0]));
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			Tools.showDialog("Trying to read port " + getPort()
					+ " for element " + this.getID() + " but nothing received!",e);
		}
	}
}
