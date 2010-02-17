package de.cau.cs.kieler.simplerailctrl.kev;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import org.apache.batik.dom.svg.SAXSVGDocumentFactory;
import org.apache.batik.dom.svg.SVGOMRectElement;
import org.apache.batik.swing.JSVGCanvas;
import org.apache.batik.swing.svg.JSVGComponent;
import org.apache.batik.util.XMLResourceDescriptor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.svg.SVGDocument;
import org.w3c.dom.svg.SVGGElement;
import org.w3c.dom.svg.SVGPathElement;
import org.w3c.dom.svg.SVGRectElement;

import de.cau.cs.kieler.kev.mapping.Colorize;
import de.cau.cs.kieler.kev.mapping.MappingFactory;
import de.cau.cs.kieler.kev.mapping.MovePath;
import de.cau.cs.kieler.kev.mapping.Opacity;
import de.cau.cs.kieler.kev.mapping.SVGElement;
import de.cau.cs.kieler.kev.mapping.SVGFile;
import de.cau.cs.kieler.kev.mapping.Text;

/**
 * A static main application that creates a mapping SVG file for the railway
 * example.
 * 
 * @author haf
 * 
 */
public class CreateRailwayMapping {
	/** generating the mapping for the railway example */

	private static final String svgFilename = "railway.svg";
	private static final String mapFilename = "railway.mapping";
	// private static final String path =
	// "/Users/haf/shared/kieler/trunk/plugins/de.cau.cs.kieler.simplerailctrl.kev/images/";
	private static final String path = "X:\\dop_eclipse\\GALILEO32\\de.cau.cs.kieler.simplerailctrl.kev\\images\\";
	private static final String resourcePath = "resource:examples/";

	public static void main(String[] args) {
		File file = new File(path + svgFilename);
		java.net.URI localFileAsUri = file.toURI();

		try {
			MappingFactory mapFactory = MappingFactory.eINSTANCE;
			SVGFile svgFile = mapFactory.createSVGFile();
			svgFile.setFilename(resourcePath + svgFilename);

			try {
				String parser = XMLResourceDescriptor.getXMLParserClassName();
				SAXSVGDocumentFactory f = new SAXSVGDocumentFactory(parser);
				// Document doc = f.createDocument("file://" + path +
				// svgFilename);
				Document doc = f.createDocument(localFileAsUri.toString());
				System.out.println(doc.getClass().getName());
			} catch (IOException ex) {
				ex.printStackTrace();
			}

			JSVGCanvas canvas = new JSVGCanvas();
			canvas.setDocumentState(JSVGComponent.ALWAYS_DYNAMIC);
			canvas.setDoubleBufferedRendering(true);
			URL svgURL = new URL("file://" + path + svgFilename);
			System.out.println("File: " + svgURL);
			// canvas.setURI(svgURL.toString());
			canvas.setURI(localFileAsUri.toString());
			Thread.sleep(5000);
			SVGDocument imageDoc = canvas.getSVGDocument();

			System.out.println(imageDoc);

			NodeList children = imageDoc.getChildNodes();
			Node root = children.item(1);
			children = root.getChildNodes();

			ArrayList childPathList = new ArrayList();
			ArrayList childRectList = new ArrayList();
			ArrayList childGList = new ArrayList();
			for (int i = 0; i < children.getLength(); i++) {
				String type = children.item(i).getLocalName();

				if (type != null && type.equals("path")) {
					childPathList.add(children.item(i));
					SVGPathElement path = (SVGPathElement) children.item(i);
					System.out.println("found path: " + path.getId());
				}
				if (type != null && type.equals("rect")) {
					childRectList.add(children.item(i));
					SVGRectElement rect = (SVGRectElement) children.item(i);
					System.out.println("found rect: " + rect.getId());
				}
				if (type != null && type.equals("g")) {
					childGList.add(children.item(i));
					SVGGElement g = (SVGGElement) children.item(i);
					System.out.println("found g: " + g.getId());
				}
			}
			// Object[] sortedChildren = childList.toArray();
			// Arrays.sort(sortedChildren, new Comparator<Object>() {
			// public int compare(Object a, Object b) {
			// return (((SVGPathElement) a).getId()
			// .compareTo(((SVGPathElement) b).getId()));
			// }
			//
			// public boolean equals(Object a, Object b) {
			// return (((SVGPathElement) a).getId()
			// .equals(((SVGPathElement) b).getId()));
			// }
			// });

			for (int i = 0; i < childGList.size(); i++) {
				SVGGElement g = (SVGGElement) childGList.get(i);
				String elementName = g.getId();
				String idNameRegExSignals = "R0.*|R1.*|Y0.*|Y1.*|G0.*|G1.*";
				if (g.hasChildNodes()) {
					SVGRectElement gChild = null;
					for (int ii = 0; ii < g.getChildNodes().getLength(); ii++) {
						try {
							Object currentChild = g.getChildNodes().item(ii);
							gChild = (SVGRectElement) currentChild;

							if (gChild.getId().matches(idNameRegExSignals)) {
								String signalType = gChild.getId().split("_")[0];
								String signalTrack = gChild.getId().substring(
										signalType.length() + 1);
								String signalNo = signalType.substring(1);

								if (signalType.substring(0, 1).equals("R")) {
									SVGElement mappingSVGElementSigR0 = mapFactory
											.createSVGElement();
									svgFile.getSvgElement().add(
											mappingSVGElementSigR0);
									mappingSVGElementSigR0.setId("R" + signalNo
											+ "_" + signalTrack);
									Opacity mappingMovePathOpacitySigR0 = mapFactory
											.createOpacity();
									mappingMovePathOpacitySigR0.setKey("signal"
											+ signalNo + "-" + signalTrack);
									mappingMovePathOpacitySigR0
											.setInput("S_OFF__simulation, S_RED__simulation, S_YELLOW__simulation, S_GREEN__simulation");
									mappingMovePathOpacitySigR0
											.setOpacity("0.3,1,0.3,0.3");
									mappingSVGElementSigR0.getAnimation().add(
											mappingMovePathOpacitySigR0);
								} else if (signalType.substring(0, 1).equals(
										"Y")) {
									SVGElement mappingSVGElementSigY0 = mapFactory
											.createSVGElement();
									svgFile.getSvgElement().add(
											mappingSVGElementSigY0);
									mappingSVGElementSigY0.setId("Y" + signalNo
											+ "_" + signalTrack);
									Opacity mappingMovePathOpacitySigY0 = mapFactory
											.createOpacity();
									mappingMovePathOpacitySigY0.setKey("signal"
											+ signalNo + "-" + signalTrack);
									mappingMovePathOpacitySigY0
											.setInput("S_OFF__simulation, S_RED__simulation, S_YELLOW__simulation, S_GREEN__simulation");
									mappingMovePathOpacitySigY0
											.setOpacity("0.3,0.3,1,0.3");
									mappingSVGElementSigY0.getAnimation().add(
											mappingMovePathOpacitySigY0);
								} else if (signalType.substring(0, 1).equals(
										"G")) {
									SVGElement mappingSVGElementSigG0 = mapFactory
											.createSVGElement();
									svgFile.getSvgElement().add(
											mappingSVGElementSigG0);
									mappingSVGElementSigG0.setId("G" + signalNo
											+ "_" + signalTrack);
									Opacity mappingMovePathOpacitySigG0 = mapFactory
											.createOpacity();
									mappingMovePathOpacitySigG0.setKey("signal"
											+ signalNo + "-" + signalTrack);
									mappingMovePathOpacitySigG0
											.setInput("S_OFF__simulation, S_RED__simulation, S_YELLOW__simulation, S_GREEN__simulation");
									mappingMovePathOpacitySigG0
											.setOpacity("0.3,0.3,0.3,1");
									mappingSVGElementSigG0.getAnimation().add(
											mappingMovePathOpacitySigG0);
								}
							}
						} catch (Exception e) {
							continue;
						}
					}
					if (gChild == null)
						continue;

				}
			}

			int counter = 0;
			for (int i = 0; i < childPathList.size(); i++) {
				SVGPathElement path = (SVGPathElement) childPathList.get(i);
				System.out.println(i);
				System.out.println(path.getId());
				String pathNameRegEx = "KH.*|OC.*|IC.*|KIO.*|IO.*|OI.*";
				if (path.getId().matches(pathNameRegEx)) {
					// moving animation for engines
					int port = counter + 0 * 48;
					SVGElement mappingSVGElement = mapFactory
							.createSVGElement();
					mappingSVGElement.setId("engine");
					svgFile.getSvgElement().add(mappingSVGElement);
					MovePath mappingMovePath = mapFactory.createMovePath();
					mappingMovePath.setInput("1..100");
					mappingMovePath.setAnchor_point("10,10");
					mappingMovePath.setPath(path.getId());
					mappingMovePath.setAuto_orientation("false");
					mappingMovePath.setKey("engine-" + path.getId());
					mappingSVGElement.getAnimation().add(mappingMovePath);

					Opacity mappingMovePathOpacity = mapFactory.createOpacity();
					mappingMovePathOpacity.setKey("engine-" + path.getId());
					mappingMovePathOpacity.setInput("-1");
					mappingMovePathOpacity.setOpacity("0");
					mappingSVGElement.getAnimation()
							.add(mappingMovePathOpacity);

					Opacity mappingMovePathOpacity2 = mapFactory
							.createOpacity();
					mappingMovePathOpacity2.setKey("engine-" + path.getId());
					mappingMovePathOpacity2.setInput("1..100");
					mappingMovePathOpacity2.setOpacity("1");
					mappingSVGElement.getAnimation().add(
							mappingMovePathOpacity2);

					// Element display = mappingDoc.createElement("display");
					// display.setAttribute("port", "" + port);
					// mappingRoot.appendChild(display);
					// Element movePath = mappingDoc.createElement("move-path");
					// movePath.setAttribute("direction-angle", "90");
					// movePath.setAttribute("id", "engine");
					// movePath.setAttribute("input", "1..100");
					// movePath.setAttribute("path", path.getId());
					// display.appendChild(movePath);

					// moving animation for trailer
					port = counter + 1 * 48;
					SVGElement mappingSVGElement2 = mapFactory
							.createSVGElement();
					mappingSVGElement2.setId("trailer");
					svgFile.getSvgElement().add(mappingSVGElement2);
					MovePath mappingMovePath2 = mapFactory.createMovePath();
					mappingMovePath2.setInput("1..100");
					mappingMovePath2.setAnchor_point("10,10");
					mappingMovePath2.setPath(path.getId());
					mappingMovePath2.setAuto_orientation("false");
					mappingMovePath2.setKey("trailer-" + path.getId());
					mappingSVGElement2.getAnimation().add(mappingMovePath2);

					Opacity mappingMovePathOpacity3 = mapFactory
							.createOpacity();
					mappingMovePathOpacity3.setKey("trailer-" + path.getId());
					mappingMovePathOpacity3.setInput("-1");
					mappingMovePathOpacity3.setOpacity("0");
					mappingSVGElement2.getAnimation().add(
							mappingMovePathOpacity3);

					Opacity mappingMovePathOpacity4 = mapFactory
							.createOpacity();
					mappingMovePathOpacity4.setKey("trailer-" + path.getId());
					mappingMovePathOpacity4.setInput("1..100");
					mappingMovePathOpacity4.setOpacity("1");
					mappingSVGElement2.getAnimation().add(
							mappingMovePathOpacity4);

					// Element displayMove2 =
					// mappingDoc.createElement("display");
					// displayMove2.setAttribute("port", "" + port);
					// mappingRoot.appendChild(displayMove2);
					// Element movePath2 =
					// mappingDoc.createElement("move-path");
					// movePath2.setAttribute("direction-angle", "90");
					// movePath2.setAttribute("id", "trailer");
					// movePath2.setAttribute("input", "1..100");
					// movePath2.setAttribute("path", path.getId());
					// displayMove2.appendChild(movePath2);

					// Colorize the tracks according to the direction
					port = counter + 2 * 48;
					SVGElement mappingSVGtrack = mapFactory.createSVGElement();
					mappingSVGtrack.setId("b_" + path.getId());
					Colorize trackColorize = mapFactory.createColorize();
					trackColorize.setKey("track-" + path.getId());
					trackColorize
							.setInput("M_OFF__simulation, M_PRIMARY__simulation, M_SECONDARY__simulation, M_BRAKE__simulation");
					// trackColorize.setFill_color("#ffffff, #00ff00, #ff0000, #000000");
					trackColorize
							.setStroke_color("#ffffff, #00ff00, #ff0000, #000000");
					mappingSVGtrack.getAnimation().add(trackColorize);
					svgFile.getSvgElement().add(mappingSVGtrack);

					// Element displayColor =
					// mappingDoc.createElement("display");
					// displayColor.setAttribute("port", "" + port);
					// mappingRoot.appendChild(displayColor);
					// Element colorize = mappingDoc.createElement("colorize");
					// colorize.setAttribute("id", "b_" + path.getId());
					// colorize
					// .setAttribute(
					// "input",
					// "M_OFF__simulation, M_PRIMARY__simulation, M_SECONDARY__simulation, M_BRAKE__simulation");
					// colorize.setAttribute("color",
					// "#ffffff, #00ff00, #ff0000, #000000");
					// colorize.setAttribute("color-property", "stroke");
					// displayColor.appendChild(colorize);

					// set the error text message
					port = counter + 3 * 48;
					SVGElement mappingSVGText = mapFactory.createSVGElement();
					svgFile.getSvgElement().add(mappingSVGText);
					mappingSVGText.setId("t_" + path.getId());
					Text mappingText = mapFactory.createText();
					mappingText.setKey("text-" + path.getId());
					mappingSVGText.getAnimation().add(mappingText);
					// set to show or hide the error message text
					Opacity mappingTextOpacity = mapFactory.createOpacity();
					mappingTextOpacity.setKey("text-" + path.getId());
					mappingTextOpacity.setOpacity("1");
					mappingSVGText.getAnimation().add(mappingTextOpacity);

					Opacity mappingTextOpacity2 = mapFactory.createOpacity();
					mappingTextOpacity2.setKey("text-" + path.getId());
					mappingTextOpacity2.setInput("E_OK__simulation");
					mappingTextOpacity2.setOpacity("0");
					mappingSVGText.getAnimation().add(mappingTextOpacity2);

					// Element displayText =
					// mappingDoc.createElement("display");
					// displayText.setAttribute("port", "" + port);
					// mappingRoot.appendChild(displayText);
					// Element opaque = mappingDoc.createElement("opaque");
					// opaque.setAttribute("id", "t_" + path.getId());
					// opaque.setAttribute("input", "E_OK__simulation");
					// opaque.setAttribute("opacity", "0");
					// displayText.appendChild(opaque);
					// Element text = mappingDoc.createElement("textbox");
					// text.setAttribute("id", "t_" + path.getId());
					// displayText.appendChild(text);

					// switch points
					if (counter <= 29) {
						// opacity for the straight part of a switch point
						port = counter + 4 * 48;
						SVGElement mappingPointStraight = mapFactory
								.createSVGElement();
						svgFile.getSvgElement().add(mappingPointStraight);
						mappingPointStraight.setId("point_straight_" + counter);
						Opacity mappingPointStraightOpacity = mapFactory
								.createOpacity();
						mappingPointStraightOpacity.setKey("point-" + counter);
						mappingPointStraightOpacity
								.setInput("P_STRAIGHT__simulation, P_TURN__simulation");
						mappingPointStraightOpacity.setOpacity("1, 0.3");
						mappingPointStraight.getAnimation().add(
								mappingPointStraightOpacity);

						// opacity for the turn part of a switch point
						SVGElement mappingPointTurn = mapFactory
								.createSVGElement();
						svgFile.getSvgElement().add(mappingPointTurn);
						mappingPointTurn.setId("point_turn_" + counter);
						Opacity mappingPointTurnOpacity = mapFactory
								.createOpacity();
						mappingPointTurnOpacity.setKey("point-" + counter);
						mappingPointTurnOpacity
								.setInput("P_STRAIGHT__simulation, P_TURN__simulation");
						mappingPointTurnOpacity.setOpacity("0.3, 1");
						mappingPointTurn.getAnimation().add(
								mappingPointTurnOpacity);

						// Element displayPoint = mappingDoc
						// .createElement("display");
						// displayPoint.setAttribute("port", "" + port);
						// mappingRoot.appendChild(displayPoint);
						// Element opaque2 = mappingDoc.createElement("opaque");
						// opaque2.setAttribute("id", "point_straight_" +
						// counter);
						// opaque2.setAttribute("input",
						// "P_STRAIGHT__simulation, P_TURN__simulation");
						// opaque2.setAttribute("opacity", "1, 0.3");
						//                                          
						//                                          
						// displayPoint.appendChild(opaque2);
						// Element opaque3 = mappingDoc.createElement("opaque");
						// opaque3.setAttribute("id", "point_turn_" + counter);
						// opaque3.setAttribute("input",
						// "P_STRAIGHT__simulation, P_TURN__simulation");
						// opaque3.setAttribute("opacity", "0.3, 1");
						// displayPoint.appendChild(opaque3);

						// text error message for switch points
						port = counter + 5 * 48;
						SVGElement mappingSVGPointText = mapFactory
								.createSVGElement();
						svgFile.getSvgElement().add(mappingSVGPointText);
						mappingSVGPointText.setId("t_point_" + counter);
						Text mappingPointText = mapFactory.createText();
						mappingPointText.setKey("point-text-" + counter);
						mappingSVGPointText.getAnimation()
								.add(mappingPointText);
						// set to show or hide the error message text
						Opacity mappingPointTextOpacity = mapFactory
								.createOpacity();
						mappingPointTextOpacity.setKey("point-text-" + counter);
						mappingPointTextOpacity.setOpacity("1");
						mappingSVGPointText.getAnimation().add(
								mappingPointTextOpacity);

						Opacity mappingPointTextOpacity2 = mapFactory
								.createOpacity();
						mappingPointTextOpacity2
								.setKey("point-text-" + counter);
						mappingPointTextOpacity2.setInput("E_OK__simulation");
						mappingPointTextOpacity2.setOpacity("0");
						mappingSVGPointText.getAnimation().add(
								mappingPointTextOpacity2);
						// Element displayText2 = mappingDoc
						// .createElement("display");
						// displayText2.setAttribute("port", "" + port);
						// mappingRoot.appendChild(displayText2);
						// Element text2 = mappingDoc.createElement("textbox");
						// text2.setAttribute("id", "t_point_" + counter);
						// displayText2.appendChild(text2);
						// Element opaque4 = mappingDoc.createElement("opaque");
						// opaque4.setAttribute("id", "t_point_" + counter);
						// opaque4.setAttribute("input", "E_OK__simulation");
						// opaque4.setAttribute("opacity", "0");
						// displayText2.appendChild(opaque4);
					}

					counter++;
				}
			}

			// write SVG
			// ================================================================
			// OutputFormat format = new OutputFormat(imageDoc);
			// String file =
			// "/home/haf/shared/modelgui/trunk/examples/railway-new2.svg";
			// OutputStream os = new FileOutputStream(file);
			// XMLSerializer serializer = new XMLSerializer(os,format);
			// serializer.serialize(imageDoc);
			// write mapping
			// ================================================================
			// OutputFormat format2 = new OutputFormat();
			// format2.setEncoding("UTF-8");
			// format2.setIndent(2);
			// format2.setIndenting(true);
			// String file2 = "/Users/haf/Desktop/railway-new2.map";
			// OutputStream os2 = new FileOutputStream(file2);
			// XMLSerializer serializer2 = new XMLSerializer(os2, format2);
			// serializer2.serialize(mappingDoc);
			//
			// System.out.println("finished.");

			// Create a resource set.
			ResourceSet resourceSet = new ResourceSetImpl();

			// Register the default resource factory -- only needed for
			// stand-alone!
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
							new XMIResourceFactoryImpl());

			// Get the URI of the model file.
			URI fileURI = URI.createFileURI(new File(path + mapFilename)
					.getAbsolutePath());

			// Create a resource for this file.
			Resource resource = resourceSet.createResource(fileURI);

			// Add the book and writer objects to the contents.
			resource.getContents().add(svgFile);

			// Save the contents of the resource to the file system.
			try {
				resource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
