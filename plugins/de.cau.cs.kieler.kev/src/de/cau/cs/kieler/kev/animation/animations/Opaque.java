package de.cau.cs.kieler.kev.animation.animations;

import java.util.StringTokenizer;
import java.util.Vector;

import org.apache.batik.dom.svg.SVGStylableElement;
import org.apache.batik.swing.JSVGCanvas;

import de.cau.cs.kieler.kev.helpers.Tools;


/**
 * @author Steffen Jacobs
 * 
 */
public class Opaque extends Animation {

	String inputString;
	String opaqueString;
	Vector<Object> inputs = new Vector<Object>();
	Vector<Object> opaques = new Vector<Object>();
	Object defaultValueStroke;
	Object defaultValueFill;

	/**
	 * @param port
	 * @param element
	 * @param input
	 * @param opaque
	 * @param canvas
	 */
	public Opaque(int port, SVGStylableElement element, String input,
			String opaque, JSVGCanvas canvas) {
		super(port, element, canvas);
		this.inputString = input;
		this.opaqueString = opaque;
		StringTokenizer inputToken = new StringTokenizer(input, ",");
		StringTokenizer colorsToken = new StringTokenizer(opaque, ",");
		if (inputToken.countTokens() != colorsToken.countTokens()) {
			Tools.showDialog("Mapping file error at element '"
					+ this.getID()
					+ "'. Number of opaques and dimension of input "
					+ "vector must be exactly the same size.");
		}
		else {
			while (inputToken.hasMoreTokens()) {
				inputs.add(Tools.parseStringToDatatype(inputToken.nextToken()
						.trim()));
				opaques.add(Tools.parseStringToDatatype(colorsToken.nextToken()
						.trim()));
			}
		}

		String defaultStroke = element.getStyle().getPropertyValue(
				"stroke-opacity");
		String defaultFill = element.getStyle()
				.getPropertyValue("fill-opacity");

		if (defaultStroke.equals("")) {
			defaultStroke = "1.0";
		}
		if (defaultFill.equals("")) {
			defaultFill = "1.0";
		}
		defaultValueStroke = Tools.parseStringToDatatype(defaultStroke);
		defaultValueFill = Tools.parseStringToDatatype(defaultFill);
	}

	private void setOpacity(Object value) {
		if (value != null) {
			this.getElement().getStyle().setProperty("fill-opacity",
					"" + value, "10");
			this.getElement().getStyle().setProperty("stroke-opacity",
					"" + value, "10");
		}
		else {
			this.getElement().getStyle().setProperty("fill-opacity",
					"" + defaultValueFill, "10");
			this.getElement().getStyle().setProperty("stroke-opacity",
					"" + defaultValueStroke, "10");
		}
	}

	/**
	 * @param input
	 * @return
	 */
	public Object getOpacityForInput(Object dataFromModel) {
		for (int i = 0; i < inputs.size(); i++) {
			Object in = inputs.get(i);
			if (dataFromModel.equals(in))
				return opaques.get(i);
		}
		return null;
	}

	@Override
	public void animate() {
		try {
			Object opacity = this.getOpacityForInput(getData());
			this.setOpacity(opacity);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			Tools.showDialog("Trying to read port " + getPort()
					+ " for element " + this.getID() + " but nothing received!",e);
		}
	}

}
