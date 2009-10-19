package de.cau.cs.kieler.xkev.mapping;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.batik.dom.svg.SAXSVGDocumentFactory;
import org.apache.batik.util.XMLResourceDescriptor;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;

public class SVGDocumentParser {

	private SVGDocument svgDocument;

	public SVGDocumentParser(String filename) {
		try {
			svgDocument = getSVGDocumentFromFile(new URI(filename));
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public SVGDocument getSVGDocumentFromFile(URI uri) {
		SVGDocument doc = null;
		try {
		    String parser = XMLResourceDescriptor.getXMLParserClassName();
		    SAXSVGDocumentFactory f = new SAXSVGDocumentFactory(parser);
		    doc = (SVGDocument) f.createDocument(uri.toString());
		} catch (IOException ex) {
		    System.out.println("Error occurs during fileparsing");
		}
		return doc;
	}
	
	public Document getSVGDocument() {
		return svgDocument;
	}
	
	public void changeColor(String elementid, String value) {
		Element e = svgDocument.getElementById(elementid);
		String s = e.getAttribute("style");
		int start = s.indexOf("fill:");//+"fill:".length();
		int ende = s.substring(start).indexOf(";")+1;
		String old_string = s.substring(start,start+ende);
		String new_string = "fill:"+value+";";
		
		System.out.println(s);
		System.out.println(old_string);
		System.out.println(new_string);
		System.out.println(s.replace(old_string, new_string));
		e.setAttribute("style", s.replace(old_string, new_string));
		
	}	
	
}
