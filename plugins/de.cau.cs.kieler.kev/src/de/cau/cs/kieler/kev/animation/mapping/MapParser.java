package de.cau.cs.kieler.kev.animation.mapping;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author Steffen Jacobs
 * 
 */
public class MapParser {

	private Document document;
	private Element rootElement;
	private NodeList displayNodes;
	private NodeList controlNodes;

	/**
	 * @param mapFile
	 * @throws SAXException
	 * @throws IOException
	 * @throws URISyntaxException
	 * @throws ParserConfigurationException
	 */
	public MapParser(File mapFile) throws SAXException, IOException,
			URISyntaxException, ParserConfigurationException {
		DocumentBuilder parser = DocumentBuilderFactory.newInstance()
				.newDocumentBuilder();
		// System.out.println(mapURL.toURI().toString());
		Document document = parser.parse(mapFile);
		rootElement = document.getDocumentElement();
		// System.out.println("rootElement: " + rootElement.getNodeName());
	}

	public MapParser(URL mapFile) throws SAXException, IOException,
			URISyntaxException, ParserConfigurationException {
		DocumentBuilder parser = DocumentBuilderFactory.newInstance()
				.newDocumentBuilder();
		// System.out.println(mapURL.toURI().toString());
		Document document = parser.parse(mapFile.openStream());
		rootElement = document.getDocumentElement();
	}

	/**
	 * @return
	 */
	public NodeList getDisplayNodes() {
		displayNodes = rootElement
				.getElementsByTagName(AnimationMapping.DISPLAY_TAG);
		if (displayNodes.getLength() > 0) {
			return displayNodes;
		}
		else {
			// System.out.println("Nothing to animate! No 'display' element
			// found!");
			return null;
		}
	}

	/**
	 * @return
	 */
	public NodeList getControlNodes() {
		controlNodes = rootElement
				.getElementsByTagName(AnimationMapping.CONTROL_TAG);
		if (controlNodes.getLength() > 0) {
			return controlNodes;
		}
		else {
			// System.out.println("Nothing to control! No 'control' element
			// found!");
			return null;
		}
	}

	/**
	 * @return
	 */
	public Document getDocument() {
		return document;
	}

	/**
	 * @param node
	 * @return
	 */
	public int getPort(Node node) {
		if (node.getNodeName().equals(AnimationMapping.DISPLAY_TAG)
				|| node.getNodeName().equals(AnimationMapping.CONTROL_TAG)) {
			NamedNodeMap attributes = node.getAttributes();
			String value = attributes.getNamedItem(AnimationMapping.PORT_ATTR)
					.getNodeValue();
			int port = Integer.parseInt(value);
			return port;
		}
		else
			return -1;
	}

	public float getStartInput() {
		return 0;
	}

	public float getEndInput() {
		return 0;

	}

	/**
	 * @param port
	 * @return display node with specified port as value for <code>inport</code>
	 *         attribute. If such a node does not exist return <code>null</code>
	 */
	public Node getDisplayNodeByPort(int port) {
		if (displayNodes != null) {
			for (int i = 0; i < displayNodes.getLength(); i++) {
				// get attributes of current display node
				NamedNodeMap attributes = displayNodes.item(i).getAttributes();
				// actually, there is exactly one attribute 'port' if validation
				// succeeded, so we
				// don't have to search for it.
				if (attributes.item(0).getNodeValue().equals(
						Integer.toString(port))) {
					// matching display node found
					return displayNodes.item(i);
				}
			}
		}
		return null;
	}
}
