package de.cau.cs.kieler.simplerailctrl.kev;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.batik.swing.JSVGCanvas;
import org.apache.batik.swing.svg.JSVGComponent;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.svg.SVGDocument;
import org.w3c.dom.svg.SVGPathElement;

import de.cau.cs.kieler.xkev.mapping.Colorize;
import de.cau.cs.kieler.xkev.mapping.MappingFactory;
import de.cau.cs.kieler.xkev.mapping.MovePath;
import de.cau.cs.kieler.xkev.mapping.Opacity;
import de.cau.cs.kieler.xkev.mapping.SVGElement;
import de.cau.cs.kieler.xkev.mapping.SVGFile;
import de.cau.cs.kieler.xkev.mapping.Text;

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
    private static final String path = "/Users/haf/shared/kieler/trunk/plugins/de.cau.cs.kieler.simplerailctrl.kev/images/";

    public static void main(String[] args) {
        try {
            MappingFactory mapFactory = MappingFactory.eINSTANCE;
            SVGFile svgFile = mapFactory.createSVGFile();
            svgFile.setFilename(svgFilename);

            JSVGCanvas canvas = new JSVGCanvas();
            canvas.setDocumentState(JSVGComponent.ALWAYS_DYNAMIC);
            canvas.setDoubleBufferedRendering(true);
            URL svgURL = new URL("file://" + path + svgFilename);
            System.out.println("File: " + svgURL);
            canvas.setURI(svgURL.toString());
            Thread.sleep(5000);
            SVGDocument imageDoc = canvas.getSVGDocument();

            System.out.println(imageDoc);

            NodeList children = imageDoc.getChildNodes();
            Node root = children.item(1);
            children = root.getChildNodes();

            ArrayList childList = new ArrayList();
            for (int i = 0; i < children.getLength(); i++) {
                String type = children.item(i).getLocalName();

                if (type != null && type.equals("path")) {
                    childList.add(children.item(i));
                    SVGPathElement path = (SVGPathElement) children.item(i);
                    System.out.println("found: " + path.getId());
                }
            }
            Object[] sortedChildren = childList.toArray();
            Arrays.sort(sortedChildren, new Comparator<Object>() {
                public int compare(Object a, Object b) {
                    return (((SVGPathElement) a).getId().compareTo(((SVGPathElement) b).getId()));
                }

                public boolean equals(Object a, Object b) {
                    return (((SVGPathElement) a).getId().equals(((SVGPathElement) b).getId()));
                }
            });

            int counter = 0;
            for (int i = 0; i < sortedChildren.length; i++) {
                SVGPathElement path = (SVGPathElement) sortedChildren[i];
                System.out.println(i);
                System.out.println(path.getId());
                String pathNameRegEx = "KH.*|OC.*|IC.*|KIO.*|IO.*|OI.*";
                if (path.getId().matches(pathNameRegEx)) {

                    // moving animation for engines
                    int port = counter + 0 * 48;
                    SVGElement mappingSVGElement = mapFactory.createSVGElement();
                    mappingSVGElement.setId("engine");
                    svgFile.getSvgElement().add(mappingSVGElement);
                    MovePath mappingMovePath = mapFactory.createMovePath();
                    mappingMovePath.setInput("1..100");
                    mappingMovePath.setAuto_orientation("true");
                    mappingMovePath.setKey("engine-" + path.getId());
                    mappingSVGElement.getAnimation().add(mappingMovePath);

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
                    SVGElement mappingSVGElement2 = mapFactory.createSVGElement();
                    mappingSVGElement2.setId("trailer");
                    svgFile.getSvgElement().add(mappingSVGElement2);
                    MovePath mappingMovePath2 = mapFactory.createMovePath();
                    mappingMovePath2.setInput("1..100");
                    mappingMovePath2.setAuto_orientation("true");
                    mappingMovePath2.setKey("trailer-" + path.getId());
                    mappingSVGElement2.getAnimation().add(mappingMovePath2);

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
                    trackColorize.setStroke_color("#ffffff, #00ff00, #ff0000, #000000");
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
                    mappingTextOpacity.setInput("E_OK__simulation");
                    mappingTextOpacity.setOpacity("0");
                    mappingSVGText.getAnimation().add(mappingTextOpacity);

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
                        SVGElement mappingPointStraight = mapFactory.createSVGElement();
                        svgFile.getSvgElement().add(mappingPointStraight);
                        mappingPointStraight.setId("point_straight_" + counter);
                        Opacity mappingPointStraightOpacity = mapFactory.createOpacity();
                        mappingPointStraightOpacity.setKey("point-" + counter);
                        mappingPointStraightOpacity
                                .setInput("P_STRAIGHT__simulation, P_TURN__simulation");
                        mappingPointStraightOpacity.setOpacity("1, 0.3");
                        mappingPointStraight.getAnimation().add(mappingPointStraightOpacity);

                        // opacity for the turn part of a switch point
                        SVGElement mappingPointTurn = mapFactory.createSVGElement();
                        svgFile.getSvgElement().add(mappingPointTurn);
                        mappingPointTurn.setId("point_turn_" + counter);
                        Opacity mappingPointTurnOpacity = mapFactory.createOpacity();
                        mappingPointTurnOpacity.setKey("point-" + counter);
                        mappingPointTurnOpacity
                                .setInput("P_STRAIGHT__simulation, P_TURN__simulation");
                        mappingPointTurnOpacity.setOpacity("0.3, 1");
                        mappingPointTurn.getAnimation().add(mappingPointTurnOpacity);

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
                        SVGElement mappingSVGPointText = mapFactory.createSVGElement();
                        svgFile.getSvgElement().add(mappingSVGPointText);
                        mappingSVGPointText.setId("t_point_" + counter);
                        Text mappingPointText = mapFactory.createText();
                        mappingPointText.setKey("point-text-" + counter);
                        mappingSVGPointText.getAnimation().add(mappingPointText);
                        // set to show or hide the error message text
                        Opacity mappingPointTextOpacity = mapFactory.createOpacity();
                        mappingPointTextOpacity.setKey("point-text-" + counter);
                        mappingPointTextOpacity.setInput("E_OK__simulation");
                        mappingPointTextOpacity.setOpacity("0");
                        mappingSVGPointText.getAnimation().add(mappingPointTextOpacity);

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
            resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                    Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

            // Get the URI of the model file.
            URI fileURI = URI.createFileURI(new File(path + mapFilename).getAbsolutePath());

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
