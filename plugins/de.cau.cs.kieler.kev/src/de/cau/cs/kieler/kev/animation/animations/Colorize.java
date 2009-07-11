package de.cau.cs.kieler.kev.animation.animations;

import java.util.StringTokenizer;
import java.util.Vector;

import org.apache.batik.dom.svg.SVGOMElement;
import org.apache.batik.dom.svg.SVGOMGElement;
import org.apache.batik.dom.svg.SVGStylableElement;
import org.apache.batik.swing.JSVGCanvas;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.PlatformUI;
import org.w3c.dom.NodeList;
import org.w3c.dom.css.CSSStyleDeclaration;

import de.cau.cs.kieler.kev.KevPlugin;
import de.cau.cs.kieler.kev.helpers.Tools;


/**
 * An animation to change an SVG element's 'fill-color' attribute. Basically
 * this class maps a n-tuple of input values into a set of output color strings
 * of same length. Actually, every input value at index <code>i</code> is
 * mapped to the corresponding color value at index <code>i</code>. Therefore
 * the current color value depends on the currently received input value.
 * 
 * @author sja
 */
public class Colorize extends Animation {

	String inputString;
	String colorsString;
	Vector<Object> inputs = new Vector<Object>();
	Vector<Object> colors = new Vector<Object>();
	/**
	 * only "stroke" or "fill" are allowed
	 */
	String colorProperty;

	/**
	 * Creates a new colorize object to change color property of an svg element
	 * <code>element</code>
	 * 
	 * @param port
	 *            input port (specified in map file)
	 * @param element
	 *            graphics element to be manipulated
	 * @param input
	 *            comma separated input value range string (specified in map
	 *            file)
	 * @param color
	 *            comma separated color value range string (specified in map
	 *            file)
	 * @param colorProperty
	 *            only "stroke" or "fill" are allowed
	 * @param canvas
	 */
	public Colorize(int port, SVGStylableElement element, String input,
			String color, String colorProperty, JSVGCanvas canvas) {
		super(port, element, canvas);
// System.out.println("Creating colorize for "+this.getID());
		this.inputString = input;
		this.colorsString = color;
		this.colorProperty = colorProperty;
		StringTokenizer inputToken = new StringTokenizer(input, ",");
		StringTokenizer colorsToken = new StringTokenizer(color, ",");
		if (inputToken.countTokens() != colorsToken.countTokens()) {
			Tools.showDialog("Mapping file error at element '"
					+ this.getID()
					+ "'. Number of colors and dimension of input "
					+ "vector must be exactly the same size.");
			
		}
		else {
			while (inputToken.hasMoreTokens()) {
				inputs.add(Tools.parseStringToDatatype(inputToken.nextToken()
						.trim()));
				colors.add(Tools.parseStringToDatatype(colorsToken.nextToken()
						.trim()));
			}
		}
	}

	/**
	 * Writes a color string (e.g. #0000ff for blue) to a graphics element's
	 * attribute which is specified by setting <code>colorProperty</code> to
	 * either "fill" or "stroke". If <code>colorProperty</code> is set to
	 * "fill" element's style property "fill" is changed, if
	 * <code>colorProperty</code> is "stroke", element's strokes are
	 * colorized. This also works with any SVG group element. In that case this
	 * method searches for all stylable children in that group and colorizes
	 * them. Note: this method does not yet work for a group in a group, because
	 * we don't search for stylable elements recursivly.
	 * 
	 * @param element
	 * @param colorString
	 * @param fillProperty
	 *            either "fill" or "stroke"
	 */
	public void setColor(SVGStylableElement element, String colorString,
			String fillProperty) {
		if (element instanceof SVGOMGElement) {
			SVGOMGElement e = (SVGOMGElement) element;
			NodeList children = e.getChildNodes();
			for (int i = 0; i < children.getLength(); i++) {
				if (children.item(i) instanceof SVGOMElement)
					setColor((SVGStylableElement) children.item(i),
							colorString, fillProperty);
			}
		}
		else {
			CSSStyleDeclaration style = element.getStyle();
			if (fillProperty == null || fillProperty.equals("")) {
				style.setProperty("fill", colorString, null);
			}
			else
				style.setProperty(fillProperty, colorString, null);
		}
	}

	/**
	 * Returns color hex string (e.g. #00ff00 for green) that corresponds to a
	 * given input value. If no matching color can be found, it returns
	 * <code>null</code>
	 * 
	 * @param input
	 * @return a hex color string (e.g. #ffffff for white)
	 */
	public Object getColorForInput(Object dataFromModel) {
		for (int i = 0; i < inputs.size(); i++) {
			Object in = inputs.get(i);
			if (dataFromModel.equals(in))
				return colors.get(i);
		}
		return null;
	}

	@Override
	public void animate() {
		try {
// if(this.getID().equals("b_KH_LN_0")){
// System.out.println("animate "+this.getID()+getData());
// }

			Object color = this.getColorForInput(getData());

			if (color != null) {
				this.setColor(this.getElement(), color.toString(),
						this.colorProperty);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			Tools.showDialog(e);
		}
	}

}
