package de.cau.cs.kieler.kev.animation.animations;

import java.util.StringTokenizer;
import java.util.Vector;

import org.apache.batik.dom.svg.SVGDOMImplementation;
import org.apache.batik.dom.svg.SVGGraphicsElement;
import org.apache.batik.dom.svg.SVGOMDocument;
import org.apache.batik.dom.svg.SVGStylableElement;
import org.apache.batik.swing.JSVGCanvas;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

import de.cau.cs.kieler.kev.extension.AnimationData;


/**
 * Abstract class used for object animation. The most important thing, which is
 * done by this class is the supply of an animate method. That method must be
 * implemented by any extending class (e.g. Move, Colorize, MovePath, Rotate,
 * ...) to change visualization and to react on values in {@link JavaStringData}.
 * For that purpose, it is possible to get the current port value by calling
 * getPort().
 * 
 * The animate method is being called by an instance of
 * {@link ControlAnimationServer} every time a new input value arrives.
 * 
 * @author sja
 * @see
 */
public abstract class Animation {

	private int port;
	private String id;
	private SVGStylableElement element;
	private Object lastData = null;
	boolean renderElements = false;
	private Element text_element;
	private JSVGCanvas canvas;

	private AnimationData dataObject;
	private int countAnimations = 0;

	/**
	 * @param port
	 * @param element
	 * @param canvas
	 */
	public Animation(int port, SVGStylableElement element, JSVGCanvas canvas) {
		this.id = element.getId();
		this.port = port;
		if (element instanceof SVGGraphicsElement){
			// if this is true, another animation made a copy of this element before
			// so we have to find it first
			if (element.getAttribute("visibility").equals("hidden")){
				SVGStylableElement clone = (SVGStylableElement)element.getOwnerDocument().getElementById("copy_" + element.getId() + "_" + port);
				if (clone != null){
					this.element = clone;
				} else {
					SVGGraphicsElement newClone = (SVGGraphicsElement) element.cloneNode(true);
					
					element.getParentNode().insertBefore(newClone, element);
					newClone.setAttribute("id", "copy_" + element.getId() + "_" + port);
					element.setAttribute("visibility", "hidden");
					this.element = newClone;
					
				}
			} else {
				// here we are first to animate this element so we can make a new clone
				SVGGraphicsElement clone = (SVGGraphicsElement) element.cloneNode(true);
				
				element.getParentNode().insertBefore(clone, element);
				clone.setAttribute("id", "copy_" + element.getId() + "_" + port);
				element.setAttribute("visibility", "hidden");
				this.element = clone;
			}
			//System.out.println("Bounding Box: "+((SVGGraphicsElement)element).getBBox());
		} else {
			this.element = element;
		}
		this.canvas = canvas;

		/*
		 * final SVGOMDocument doc =
		 * (SVGOMDocument)getElement().getOwnerDocument(); textElement =
		 * doc.createElementNS(SVGDOMImplementation.SVG_NAMESPACE_URI,
		 * SVG12Constants.SVG_TEXT_TAG);
		 * textElement.setAttribute(SVG12Constants.SVG_X_ATTRIBUTE, "0");
		 * textElement.setAttribute(SVG12Constants.SVG_Y_ATTRIBUTE, "0");
		 * textElement.setAttribute(SVG12Constants.SVG_FONT_SIZE_ATTRIBUTE,
		 * "10px");
		 * textElement.setAttribute(SVG12Constants.SVG_FONT_STYLE_ATTRIBUTE,
		 * "normal");
		 * textElement.setAttribute(SVG12Constants.SVG_FONT_WEIGHT_ATTRIBUTE,
		 * "normal"); textElement.setAttribute("xml:space", "preserve");
		 * textElement.setAttribute(SVG12Constants.SVG_FONT_FAMILY_ATTRIBUTE,
		 * "Verdana");
		 * textElement.setAttribute(SVG12Constants.SVG_STROKE_ATTRIBUTE,
		 * "none");
		 * textElement.setAttribute(SVG12Constants.CSS_DISPLAY_PROPERTY,
		 * "none");
		 */
		// this.addElementInformations();
	}

	/**
	 * @return
	 */
	public String getID() {
		return id;
	}

	/**
	 * @return
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @return
	 */
	public SVGStylableElement getElement() {
		return element;
	}

	/**
	 * @param str
	 * @return
	 */
	public int[] parseStringToIntRange(String str) {
		StringTokenizer token = new StringTokenizer(str, "..");
		if (token.countTokens() == 2) {
			int first = Integer.parseInt(token.nextToken());
			int second = Integer.parseInt(token.nextToken());
			// System.out.println("tokens: " + first + " ::: " + second);
			int[] range;
			if (first <= second) {
				int min = first;
				int max = second;
				int count = max - min + 1;
				System.out.println("count: " + count);
				range = new int[count];
				for (int i = 0; i < range.length; i++) {
					range[i] = min++;
				}
			}
			else {
				int max = first;
				int min = second;
				int count = max - min + 1;
				System.out.println("count: " + count);
				range = new int[count];
				for (int i = 0; i < range.length; i++) {
					range[i] = max--;
				}
			}
			return range;
		}
		else {
			return null;
		}
	}

	/**
	 * @param start
	 * @param end
	 * @param delta
	 * @return
	 */
	public Vector<Float> getRange(float start, float end, float delta) {
		Vector<Float> range = new Vector<Float>(100);
		if (start <= end) {
			float min = start;
			float max = end;
			float current = min;
			while (current <= max) {
				range.add(current);
				current = current + delta;
			}
		}
		else {
			float max = start;
			float min = end;
			float current = max;
			while (current >= min) {
				range.add(current);
				current = current - delta;
			}
		}
		range.trimToSize();
		return range;
	}

	/**
	 * @param start
	 * @param end
	 * @param size
	 * @return
	 */
	public Vector<Float> getRange(float start, float end, int size) {
		Vector<Float> range = new Vector<Float>(size);
		if (start < end) {
			float min = start;
			float max = end;
			float current = min;
			while (current <= max) {
				range.add(current);
				current = current + (max - min) / size;
				System.out.println(current);
			}
		}
		else if (start > end) {
			float max = start;
			float min = end;
			float current = max;
			while (current >= min) {
				range.add(current);
				current = current - (max - min) / size;
				System.out.println(current);
			}
		}
		else if (start == end) {
			for (int i = 0; i < range.size(); i++) {
				range.add(start);
			}
		}
		range.trimToSize();
		return range;
	}

	/**
	 * @param doc
	 * @param desc_text
	 * @param element
	 */
	public static void setDescTooltip(SVGOMDocument doc, String desc_text,
			SVGGraphicsElement element) {
		// remove the old <desc> tooltip, if any
		NodeList nodelist = element.getElementsByTagNameNS(
				SVGDOMImplementation.SVG_NAMESPACE_URI, "desc");

		for (int i = 0; i < nodelist.getLength(); i++)
			element.removeChild(nodelist.item(i));

		// now add the new <desc> tooltip, if any
		if (desc_text != null) {
			// create a <desc> element and its text node which contains the tip
			// text.

			Element desc_element = doc.createElementNS(
					SVGDOMImplementation.SVG_NAMESPACE_URI, "desc");
			Text text_node = doc.createTextNode(desc_text);
			desc_element.appendChild(text_node);

			// append the tooltip <desc> to the ID'd element
			element.appendChild(desc_element);
		}
	}

	public JSVGCanvas getCanvas() {
		return canvas;
	}

	/**
	 * @param a
	 * @param separator
	 * @return
	 */
	public String arrayToString(Object[] a, String separator) {
		StringBuffer result = new StringBuffer();
		if (a.length > 0) {
			result.append(a[0]);
			for (int i = 1; i < a.length; i++) {
				result.append(separator);
				result.append(a[i]);
			}
		}
		return result.toString();
	}

	public void doAnimation(AnimationData dataObject) {
		// do some stuff before DOM modification:
		this.dataObject = dataObject;
		if (this.dataObject.getData().size() - 1 < getPort())
			return;
		// modify SVG DOM elements:
		if (!dataObject.getData().get(getPort()).equals(lastData)){
			lastData = dataObject.getData().get(getPort());
			animate();
		}
		// do some stuff after DOM modification:
	}

	protected Object getData() {
		return dataObject.getData().get(this.getPort());
	}

	/**
	 * @param dataObject
	 */
	protected abstract void animate();
}
