package de.cau.cs.kieler.kev.animation.controls;

import javax.swing.JTextField;

import org.apache.batik.dom.events.DOMKeyEvent;
import org.apache.batik.dom.svg.SVGGraphicsElement;
import org.apache.batik.dom.svg.SVGOMDocument;
import org.apache.batik.dom.svg.SVGOMElement;
import org.apache.batik.swing.JSVGCanvas;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.w3c.dom.events.Event;
import org.w3c.dom.events.EventListener;
import org.w3c.dom.svg.SVGTextElement;

import de.cau.cs.kieler.kev.extension.AnimationData;
import de.cau.cs.kieler.kev.helpers.Tools;


/**
 * Implements a simple interactive textbox element for SVG documents. Clicking
 * on textbox graphic activates KeyEvent listener. Pressing enter sends input
 * data to connected programming environment client.
 * 
 * @author sja
 */
public class Textbox extends Control {

	final SVGOMDocument document;

	int counter = 0;

	EventListener initTyping;

	EventListener stopTyping;

	EventListener typeText;

	final Textbox textbox = this;

	boolean initialized = false;

	Text textNode;

	final Element textElement;

	final SVGGraphicsElement borderElement;

	final JSVGCanvas canvas;

	private String text = "";

	private int columns = 15;

	private int keyCount = 0;

	JTextField field;

	/**
	 * Used in {@link SVGApplication} if map file contains a \<text\> element
	 * 
	 * @param port
	 *            output port specified in map file (actually, the position in
	 *            output data structure {@link JavaStringData})
	 * @param element
	 * @param dataToSend
	 * @param doc
	 * @param status
	 * @param canvas
	 */
	public Textbox(int port, SVGOMElement element, AnimationData dataToSend,
			SVGOMDocument doc, String status, JSVGCanvas canvas) {
		super(port, element, dataToSend, status);
		// set default value
		dataToSend.setData(port, "");
		
		this.document = doc;
		this.canvas = canvas;
		System.out.println("init textbox");
		NodeList children = element.getChildNodes();

		// TODO: check element's class instance. Must be SVGOMGElement

		// System.out.println(children.getLength());
		// element.setAttribute("stroke", "rgb(0,0,250)");
		Element te = null;
		SVGGraphicsElement ge = null;
		for (int i = 0; i < children.getLength(); i++) {
			// System.out.println(children.item(i).getNodeName());
			if (children.item(i) instanceof SVGTextElement) {
				System.out.println("text element found");
				te = (Element) children.item(i);
			}
			if (children.item(i) instanceof SVGGraphicsElement) {
				System.out.println("border element found");
				ge = (SVGGraphicsElement) children.item(i);
			}
		}
		textElement = te;
		borderElement = ge;
		if (textElement != null && borderElement != null) {
			if (textElement.getAttribute("pointer-events") == null) {
				textElement.setAttribute("pointer-events", "none");
			}
			document.getRootElement().setAttribute("text-rendering",
					"geometricPrecision");
			initListeners();
			element.addEventListener("click", initTyping, false);
			this.setText(status);
		}
		else {
			Tools.showDialog("Not a Textbox: " + this.getID());
		}
	}

	/**
	 * 
	 */
	public void initListeners() {
		typeText = new EventListener() {
			public void handleEvent(Event evt) {
				if (evt instanceof DOMKeyEvent) {
					// System.out.println("key event");
					DOMKeyEvent keyEvent = (DOMKeyEvent) evt;
					String input = Character.toString((char) keyEvent
							.getCharCode());
					if (keyEvent.getCharCode() == 10
							|| keyEvent.getCharCode() == 13) {
						setStatus(text);
						stopTyping.handleEvent(keyEvent);
					}
					else if (keyEvent.getCharCode() == 8 && keyCount > 0) {
						// delete last character
						textbox.setText(textbox.getText().substring(0,
								textbox.getText().length() - 1));
						keyCount--;
					}
					else if (keyEvent.getCharCode() > 31
							&& keyEvent.getCharCode() != 127
							&& keyEvent.getCharCode() < 65535
							&& keyCount < columns) {
						textbox.appendText(input);
						keyCount++;
					}
				}
			}
		};

		initTyping = new EventListener() {
			public void handleEvent(Event evt) {
				if (!initialized) {
					document.addEventListener("keypress", typeText, false);
					document.addEventListener("click", stopTyping, false);
					String borderStrokeWidth = borderElement.getStyle()
							.getPropertyValue("stroke-width");
					if (borderStrokeWidth != null
							&& !borderStrokeWidth.equals("")) {
						borderElement.getStyle().setProperty(
								"stroke-width",
								Float.toString(Float
										.parseFloat(borderStrokeWidth) * 2),
								"10");
					}

					initialized = true;
				}
				evt.stopPropagation();
			}
		};
		stopTyping = new EventListener() {
			public void handleEvent(Event evt) {
				document.removeEventListener("keypress", typeText, false);
				document.removeEventListener("click", stopTyping, false);
				String borderStrokeWidth = borderElement.getStyle()
						.getPropertyValue("stroke-width");
				if (borderStrokeWidth != null && !borderStrokeWidth.equals("")) {
					borderElement
							.getStyle()
							.setProperty(
									"stroke-width",
									Float.toString(Float
											.parseFloat(borderStrokeWidth) / 2),
									"10");
				}
				initialized = false;
			}
		};
	}

	/**
	 * @param text
	 */
	public void appendText(String text) {
		textElement.getFirstChild().setNodeValue(this.text + text);
		this.text = this.text + text;
	}

	/**
	 * @param cols
	 */
	public void setColumns(int cols) {
		columns = cols;
	}

	public int getColumns() {
		return columns;
	}

	/**
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
		//textElement.setTextContent(text);
		textElement.setNodeValue(text);
	}

	/**
	 * @return
	 */
	public String getText() {
		//this.text = textElement.getTextContent();
		this.text = textElement.getNodeValue();
		return text;
	}

	@Override
	public void setDisabledLayout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabledLayout() {
		// TODO Auto-generated method stub
		
	}
}
