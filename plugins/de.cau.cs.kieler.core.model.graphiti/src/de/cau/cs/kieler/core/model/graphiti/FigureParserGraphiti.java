/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.core.model.graphiti;

import java.util.StringTokenizer;

import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.services.IPeService;
import org.eclipse.graphiti.util.IColorConstant;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * 
 * Class to read an svg document and return some graphiti pictogram.
 * 
 * @author ckru
 *
 */
public class FigureParserGraphiti {

    private static IPeCreateService peCreateService = Graphiti.getPeCreateService();
    private static IGaService gaService = Graphiti.getGaService();

    /**
     * This is a utility class and thus the constructor is hidden.
     */
    private FigureParserGraphiti() {

    }

    /**
     * Create an draw2d figure out of an svg document.
     * 
     * @param doc
     *            the svg document
     * @return the draw2d figure equivalent to the svg
     */
    public static void createFigure(final Document doc, final GraphicsAlgorithmContainer container, final Diagram diagram) {
        Element svgElement = (Element) doc.getElementsByTagName("svg").item(0);
        // Make an invisible container to hold the visible figures because we don't know the
        // structure of the svg.
        //GraphicsAlgorithm rootFigure = gaService.createInvisibleRectangle(root);
        //peCreateService.createContainerShape(null, true);
       // rootFigure.setWidth(
       //         (int) Math.abs(Float.parseFloat(svgElement.getAttribute("width"))));
       // rootFigure.setWidth(
       //         (int) Math.abs(Float.parseFloat(svgElement.getAttribute("height"))));
      //  rootFigure = buildFigure(svgElement, rootFigure);
        if (container instanceof Rectangle) {
            Rectangle rec = (Rectangle) container;
            try {
            rec.setHeight((int) Math.abs(Float.parseFloat(svgElement.getAttribute("height"))));
            rec.setWidth((int) Math.abs(Float.parseFloat(svgElement.getAttribute("width"))));
            }catch (Exception e){
                
            }
            
        }
        buildFigure(svgElement, container, diagram);
      //  return rootFigure;
    }

    /**
     * Parsing the svg and creating figures accordingly. Builds a hirachical structure.
     * 
     * @param root
     *            the top level svg element.
     * @param parentFigure
     *            an invisible figure as container for the actual figures
     * @return a hirachical figure representing the svg
     */
    private static void buildFigure(final Element root, final GraphicsAlgorithmContainer parentFigure, final Diagram diagram) {
        NodeList childList = root.getChildNodes();
        for (int i = 0; i < childList.getLength(); i++) {
            Node child = childList.item(i);
            if (child instanceof Element) {
                //ContainerShape shape = peCreateService.createContainerShape(parentFigure, true);
                Element childElement = (Element) child;
                String tag = childElement.getTagName();
                // make a RectangleFigure from a rectangle element
                if (tag.equals("rect")) {
                    Rectangle figure = gaService.createRectangle(parentFigure);
                    Double x = Double.parseDouble(childElement.getAttribute("x"));
                    Double y = Double.parseDouble(childElement.getAttribute("y"));
                    Double width = Double.parseDouble(childElement.getAttribute("width"));
                    Double height = Double.parseDouble(childElement.getAttribute("height"));
                    String style = (String) childElement.getAttribute("style");
                    figure.setHeight((int) Math.abs(height));
                    figure.setWidth((int) Math.abs(width));
                    figure.setX((int) Math.abs(x));
                    figure.setY((int) Math.abs(y));
                    applyStyle(figure, style, diagram);
                    //shape.setGraphicsAlgorithm(figure);
                    buildFigure(childElement, figure, diagram);
                    // make a CircleFigure from a circle element.
                    // structure is different between draw2d and svg so positions are a bit hacked
                } else if (tag.equals("circle")) {
                    Double x = Double.parseDouble(childElement.getAttribute("cx"));
                    // Float y = Float.parseFloat(childElement.getAttribute("cy"));
                    Double r = Double.parseDouble(childElement.getAttribute("r"));
                    String style = (String) childElement.getAttribute("style");
                    Ellipse figure = gaService.createEllipse(parentFigure);
                    figure.setX((int) Math.abs((x + 1 - r)));
                    figure.setY((int) Math.abs((x + 1 - r)));
                    figure.setWidth(r.intValue() * 2);
                    figure.setHeight(r.intValue() * 2);
                    applyStyle(figure, style, diagram);
                    //shape.setGraphicsAlgorithm(figure);
                    buildFigure(childElement, figure, diagram);
                    // make a CircleFigure from a ellipse element.
                    // structure is different between draw2d and svg so positions are a bit hacked
                } else if (tag.equals("ellipse")) {
                    Ellipse figure = gaService.createEllipse(parentFigure);
                    Double x = Double.parseDouble(childElement.getAttribute("cx"));
                    Double y = Double.parseDouble(childElement.getAttribute("cy"));
                    Double rx = Double.parseDouble(childElement.getAttribute("rx"));
                    Double ry = Double.parseDouble(childElement.getAttribute("ry"));
                    String style = (String) childElement.getAttribute("style");
                    figure.setX((int) Math.abs(x + 1 - rx));
                    figure.setX((int) Math.abs(y + 1 - ry));
                    figure.setWidth(rx.intValue() * 2);
                    figure.setHeight(ry.intValue() * 2);
                    applyStyle(figure, style, diagram);
                    //shape.setGraphicsAlgorithm(figure);
                    buildFigure(childElement, figure, diagram);
                    // make a PolyLineShape from a line element
                } else if (tag.equals("line")) {
                    Double x1 = Double.parseDouble(childElement.getAttribute("x1"));
                    Double y1 = Double.parseDouble(childElement.getAttribute("y1"));
                    Double x2 = Double.parseDouble(childElement.getAttribute("x2"));
                    Double y2 = Double.parseDouble(childElement.getAttribute("y2"));
                    String style = (String) childElement.getAttribute("style");
                    Polyline figure = gaService.createPolyline(parentFigure,
                            new int[] { (int) Math.abs(x1), (int) Math.abs(y1), (int) Math.abs(x2),
                                    (int) Math.abs(y2) });
                    applyStyle(figure, style, diagram);
                    //shape.setGraphicsAlgorithm(figure);
                    buildFigure(childElement, figure, diagram);
                    // figure.getBounds().setSize(figure.getParent().getBounds().getSize().getCopy());
                    // make a PolylineShape from a polyline element.
                } else if (tag.equals("polyline")) {
                    String allpoints = childElement.getAttribute("points");
                    String style = (String) childElement.getAttribute("style");
                    String[] pointsarray = allpoints.split(" +");
                    PointList pointList = new PointList();
                    for (String coords : pointsarray) {
                        String[] coordsarray = coords.split(",");
                        Double x = Double.parseDouble(coordsarray[0]);
                        Double y = Double.parseDouble(coordsarray[1]);
                        pointList.addPoint(new PrecisionPoint(x, y));
                    }

                    Polyline figure = gaService
                            .createPolyline(parentFigure, pointList.toIntArray());
                    applyStyle(figure, style, diagram);
                    //shape.setGraphicsAlgorithm(figure);
                    buildFigure(childElement, figure, diagram);
                    // figure.getBounds().setSize(figure.getParent().getBounds().getSize().getCopy());
                    // make a PolygonShape from a polygon element
                } else if (tag.equals("polygon")) {
                    String allpoints = childElement.getAttribute("points");
                    String style = (String) childElement.getAttribute("style");
                    String[] pointsarray = allpoints.split(" +");
                    PointList pointList = new PointList();
                    for (String coords : pointsarray) {
                        String[] coordsarray = coords.split(",");
                        Double x = Double.parseDouble(coordsarray[0]);
                        Double y = Double.parseDouble(coordsarray[1]);
                        pointList.addPoint(new PrecisionPoint(x, y));
                    }
                    Polygon figure = gaService.createPolygon(parentFigure, pointList.toIntArray());
                    applyStyle(figure, style, diagram);
                    //shape.setGraphicsAlgorithm(figure);
                    buildFigure(childElement, figure, diagram);
                    // figure.getBounds().setSize(figure.getParent().getBounds().getSize().getCopy());
                    // make a Label from a text element
                    // TODO weird behavior of y value
                } else if (tag.equals("text")) {
                    Double x = Double.parseDouble(childElement.getAttribute("x"));
                    Double y = Double.parseDouble(childElement.getAttribute("y"));
                    String style = (String) childElement.getAttribute("style");
                    String text = childElement.getTextContent();
                    text = text.replaceAll("\n", "");
                    text = text.trim();
                    Text figure = gaService.createText(parentFigure, text);
                    applyTextStyle(figure, style, diagram);
                    figure.setX((int) Math.abs(x));
                    figure.setY((int) Math.abs(y));
                    //shape.setGraphicsAlgorithm(figure);
                    buildFigure(childElement, figure, diagram);
                    // figure.getBounds().setLocation(new PrecisionPoint(x, y -
                    // (figure.getTextBounds().getSize().height - 2)));
                    // figure.getBounds().setSize(figure.getTextBounds().getSize());
                    // figure.setLayoutManager(new BorderLayout());
                    // make an ImageFigureEx out of an image element
                } else if (tag.equals("image")) {
                    // TODO currently not supported
                    /*
                     * Double x = Double.parseDouble(childElement.getAttribute("x")); Double y =
                     * Double.parseDouble(childElement.getAttribute("y")); Double width =
                     * Double.parseDouble(childElement.getAttribute("width")); Double height =
                     * Double.parseDouble(childElement.getAttribute("height")); String link =
                     * (String) childElement.getAttribute("xlink:href"); String style = (String)
                     * childElement.getAttribute("style"); URL url =
                     * ClassLoader.getSystemResource(link); if (url == null) { try { url = new
                     * URL(link); } catch (MalformedURLException e) { e.printStackTrace(); } } Image
                     * img = null; ImageFigureEx figure = null; try { img = new Image(null,
                     * url.openStream()); figure = new ImageFigureEx(img); } catch (IOException e) {
                     * // TODO Auto-generated catch block e.printStackTrace(); }
                     * figure.setBounds(new Rectangle(new PrecisionPoint(x, y), new PrecisionPoint(
                     * width, height))); applyStyle(figure, style);
                     * parentFigure.add(buildFigure(childElement, figure));
                     */
                }

            }
        }
     //   return parentFigure;
    }

    /**
     * Applys the style attribute of the svg element to the figure.
     * 
     * @param figure
     *            the figure whoose style to set
     * @param style
     *            the style as a string
     */
    private static void applyStyle(final GraphicsAlgorithm ga, final String style, final Diagram diagram) {
        if (style != null) {
            StringTokenizer t = new StringTokenizer(style, ";");
            while (t.hasMoreTokens()) {
                String string = t.nextToken().trim();
                int index = string.indexOf(":");
                String name = string.substring(0, index);
                String value = string.substring(index + 1);
                // fill might be background, stroke foreground. Works fine so far.
                if (name.equals("fill")) {
                    ga.setBackground(lookupColor(value, diagram));
                } else if (name.equals("stroke")) {
                    ga.setForeground(lookupColor(value, diagram));
                } else if (name.equals("stroke-width")) {
                    Float width = Float.parseFloat(value);
                    ga.setLineWidth(width.intValue());
                }
            }
        }
    }

    /**
     * Applys the style attribute of the svg element to the figure.
     * 
     * @param figure
     *            the figure whoose style to set
     * @param style
     *            the style as a string
     */
    private static void applyTextStyle(final GraphicsAlgorithm ga, final String style, final Diagram diagram) {
        if (style != null) {
            StringTokenizer t = new StringTokenizer(style, ";");

            while (t.hasMoreTokens()) {
                String string = t.nextToken().trim();
                int index = string.indexOf(":");
                String name = string.substring(0, index);
                String value = string.substring(index + 1);
                // foreground color determines the text color
                if (name.equals("fill")) {
                    ga.setForeground(lookupColor(value, diagram));
                    // some hacked size stuff without having a fitting font.
                } else if (name.equals("font-size")) {
                    int size = Integer.parseInt(value);
                    if (ga instanceof Text) {
                        Text text = (Text) ga;
                        // FontData[] fonts = PlatformUI.getWorkbench().getDisplay()
                        // .getFontList("arial", true);
                        // FontData fd = fonts[0];
                        // fd.setHeight(size - 2);
                        // Font font = new Font(PlatformUI.getWorkbench().getDisplay(), fd);

                        Font font = gaService.createFont(text, "arial", size);
                        text.setFont(font);
                    }
                }
                // TODO set a font.Problem: Svg has an attribute that loosely describes the font
                // family.
                // This has to be mapped to existing fonts on a specific system.
            }
        }
    }

    /**
     * Make a draw2d color object out of a color name.
     * 
     * @param color
     *            string representation of a color
     * @return the color described by the string. black if not found.
     */
    private static Color lookupColor(final String color, final Diagram diagram) {
        String s = color.toLowerCase();
        if (s.equals("black")) {
            return gaService.manageColor(diagram, IColorConstant.BLACK);
        } else if (s.equals("blue")) {
            return gaService.manageColor(diagram, IColorConstant.BLUE);
        } else if (s.equals("cyan")) {
            return gaService.manageColor(diagram, IColorConstant.CYAN);
        } else if (s.equals("darkgray") || s.equals("darkgrey")) {
            return gaService.manageColor(diagram, IColorConstant.DARK_GRAY);
        } else if (s.equals("lightgray") || s.equals("lightgrey")) {
            return gaService.manageColor(diagram, IColorConstant.LIGHT_GRAY);
        } else if (s.equals("gray") || s.equals("grey")) {
            return gaService.manageColor(diagram, IColorConstant.GRAY);
        } else if (s.equals("green")) {
            return gaService.manageColor(diagram, IColorConstant.GREEN);
        } else if (s.equals("orange")) {
            return gaService.manageColor(diagram, IColorConstant.ORANGE);
        } else if (s.equals("red")) {
            return gaService.manageColor(diagram, IColorConstant.RED);
        } else if (s.equals("white")) {
            return gaService.manageColor(diagram, IColorConstant.WHITE);
        } else if (s.equals("yellow")) {
            return gaService.manageColor(diagram, IColorConstant.YELLOW);
        } else {
            Color c = gaService.manageColor(diagram, IColorConstant.BLACK);
            return c;
        }
        
    }

}
