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
package de.cau.cs.kieler.kvid;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.annotations.NamedObject;
import de.cau.cs.kieler.core.kgraph.KEdge;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.kgraph.KPort;
import de.cau.cs.kieler.core.model.util.ModelingUtil;
import de.cau.cs.kieler.kiml.klayoutdata.KEdgeLayout;
import de.cau.cs.kieler.kiml.klayoutdata.KInsets;
import de.cau.cs.kieler.kiml.klayoutdata.KPoint;
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout;
import de.cau.cs.kieler.kiml.options.LayoutOptions;
import de.cau.cs.kieler.kiml.ui.layout.DiagramLayoutManager;
import de.cau.cs.kieler.kiml.ui.layout.EclipseLayoutServices;
import de.cau.cs.kieler.kvid.data.KvidUri;
import de.cau.cs.kieler.kvid.datadistributor.RuntimeConfiguration;

/**
 * Utility class for the KViD-Plugin. Holds commonly used methods statically.
 * 
 * @author jjc
 *
 */
public final class KvidUtil {
    
    /**
     * There shouldn't be an instance of this class.
     */
    private KvidUtil() { }

    /**
     * Converts a given AWT {@link Image} in it's SWT representation.
     * 
     * @param image The image in AWT format
     * @return The SWT {@link ImageData} for the given image
     */
    public static ImageData convertAWTImageToSWT(final Image image) {
        if (image == null) {
            throw new IllegalArgumentException("Null 'image' argument.");
        }
        int w = image.getWidth(null);
        int h = image.getHeight(null);
        if (w == -1 || h == -1) {
            return null;
        }
        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.getGraphics();
        g.drawImage(image, 0, 0, null);
        g.dispose();
        return convertToSWT(bi);
    }
    
    /**
     * Helper method for converting AWT images into SWT ones.
     * 
     * @param bufferedImage The {@link BufferedImage} resulting from the first step of conversion
     * @return The SWT {@link ImageData} for the given image
     */
    private static ImageData convertToSWT(final BufferedImage bufferedImage) {
        if (bufferedImage.getColorModel() instanceof DirectColorModel) {
            DirectColorModel colorModel
                    = (DirectColorModel) bufferedImage.getColorModel();
            PaletteData palette = new PaletteData(colorModel.getRedMask(),
                    colorModel.getGreenMask(), colorModel.getBlueMask());
            ImageData data = new ImageData(bufferedImage.getWidth(),
                    bufferedImage.getHeight(), colorModel.getPixelSize(),
                    palette);
            WritableRaster raster = bufferedImage.getRaster();
            final int rasterSize = 3;
            int[] pixelArray = new int[rasterSize];
            for (int y = 0; y < data.height; y++) {
                for (int x = 0; x < data.width; x++) {
                    raster.getPixel(x, y, pixelArray);
                    int pixel = palette.getPixel(new RGB(pixelArray[0],
                            pixelArray[1], pixelArray[2]));
                    data.setPixel(x, y, pixel);
                }
            }
            return data;
        } else if (bufferedImage.getColorModel() instanceof IndexColorModel) {
            IndexColorModel colorModel = (IndexColorModel)
                    bufferedImage.getColorModel();
            int size = colorModel.getMapSize();
            byte[] reds = new byte[size];
            byte[] greens = new byte[size];
            byte[] blues = new byte[size];
            colorModel.getReds(reds);
            colorModel.getGreens(greens);
            colorModel.getBlues(blues);
            RGB[] rgbs = new RGB[size];
            final int mask = 0xFF;
            for (int i = 0; i < rgbs.length; i++) {
                rgbs[i] = new RGB(reds[i] & mask, greens[i] & mask,
                        blues[i] & mask);
            }
            PaletteData palette = new PaletteData(rgbs);
            ImageData data = new ImageData(bufferedImage.getWidth(),
                    bufferedImage.getHeight(), colorModel.getPixelSize(),
                    palette);
            data.transparentPixel = colorModel.getTransparentPixel();
            WritableRaster raster = bufferedImage.getRaster();
            int[] pixelArray = new int[1];
            for (int y = 0; y < data.height; y++) {
                for (int x = 0; x < data.width; x++) {
                    raster.getPixel(x, y, pixelArray);
                    data.setPixel(x, y, pixelArray[0]);
                }
            }
            return data;
        }
        return null;
    }
    
    /**
     * Converts a EMF/GMF Fragment URI into a Ptolemy URI.
     * A Fragment URI looks like: //(type).(number of child of this type)/ etc.
     * A Ptolemy URI looks like: .(element name).(second element name)
     * 
     * This requires unique names on the same hierarchy level.
     * 
     * @param fragmentUri The Fragment URI to convert
     * @param resource The resource which holds the model element referred by
     *          the Fragment URI
     * @return A Ptolemy URI referring the model element
     */
    public static String fragmentUri2PtolemyUri(final String fragmentUri, final Resource resource) {
        String result = "";
        if (fragmentUri.startsWith("//")) {
            int lastOccurance = 2;
            int currentOccurance;
            while (fragmentUri.indexOf("/", lastOccurance) != -1) {
                currentOccurance = fragmentUri.indexOf("/", lastOccurance + 1);
                result += ".";
                String currentUri;
                if (currentOccurance != -1) {
                    currentUri = fragmentUri.substring(0, currentOccurance);
                    lastOccurance = currentOccurance;
                } else {
                    currentUri = fragmentUri;
                    lastOccurance = fragmentUri.length();
                }
                EObject model = resource.getEObject(currentUri);
                if (model instanceof NamedObject) {
                    result += ((NamedObject) model).getName();
                } else {
                    throw new RuntimeException("Ptolemy URIs will only work with NamedObjects");
                }
            }
        } else {
            throw new RuntimeException("Malformatted URI");
        }
        return result;
    }
    
    /**
     * Converts a Ptolemy URI into a EMF/GMF Fragment URI.
     * A Fragment URI looks like: //(type).(number of child of this type)/ etc.
     * A Ptolemy URI looks like: .(element name).(second element name)
     * 
     * This requires unique names on the same hierarchy level.
     * 
     * @param ptolemyUri A Ptolemy URI referring the model element
     * @param resource The resource which holds the model element referred by
     *          the Fragment URI
     * @return The Fragment URI
     */
    public static String ptolemyUri2FragmentUri(final String ptolemyUri, final Resource resource) {
        String result = "";
        if (ptolemyUri.startsWith(".")) {
            EObject root = resource.getContents().get(0);
            result = "/";
            int lastOccurance = 1;
            int currentOccurance;
            
            while (ptolemyUri.indexOf(".", lastOccurance) != -1) {
                //parse Ptolemy URI and find corresponding EObject on the current level 
                result += "/";
                currentOccurance = ptolemyUri.indexOf(".", lastOccurance);
                String currentUri;
                
                if (currentOccurance != lastOccurance) {
                    currentUri = ptolemyUri.substring(lastOccurance, currentOccurance);
                    lastOccurance = currentOccurance;
                } else {
                    //when this is the last referrer, just take the rest
                    currentUri = ptolemyUri.substring(lastOccurance);
                    currentUri = currentUri.replaceAll("\\.", "");
                    lastOccurance = ptolemyUri.length();
                }
                String currentResult = new String(result);
                for (EObject eo : root.eContents()) {
                    //iterate through the current level and find the NamedObject with the same name
                    if (eo instanceof NamedObject) {
                        if (((NamedObject) eo).getName().equals(currentUri)) {
                            result += ((InternalEObject) eo.eContainer())
                                    .eURIFragmentSegment(
                                            eo.eContainingFeature(), eo);
                            root = eo;
                            break;
                        }
                    }
                }
                if (currentResult.equals(result)) {
                    //Element wasn't found, although this was the right level
                    //Return null then
                    return null;
                }
            }
        } else {
            throw new RuntimeException("Malformatted URI");
        }
        return result;
    }
    
    /**
     * Will return the absolute position on the canvas of an KNode from a KGraph.
     * 
     * @param node The node to find the absolute position for
     * @param parent The parent node of the node to analyse
     * @return The absolute position on the canvas of the KNode
     * 
     */
    public static Point getAbsolutePosition(final KNode node, final KNode parent) {
        KShapeLayout parentLayout = parent.getData(KShapeLayout.class);
        Point parentPosition = new Point(parentLayout.getXpos(), parentLayout.getYpos());
        KInsets insets = parentLayout.getProperty(LayoutOptions.INSETS);
        parentPosition.translate((int) insets.getLeft(), (int) insets.getTop());
        KShapeLayout nodeLayout = node.getData(KShapeLayout.class);
        Point position = new Point(parentPosition);
        position.translate((int) nodeLayout.getXpos(), (int) nodeLayout.getYpos());
        return position;
    }
    
    /**
     * Will return the absolute position on the canvas of an KPort from a KGraph.
     * 
     * @param port The port to find the absolute position for
     * @param parent The parent node of the port's node to analyse
     * @return The absolute position on the canvas of the KPort
     * 
     */
    public static Point getAbsolutePosition(final KPort port, final KNode parent) {
        Point nodePosition = getAbsolutePosition(port.getNode(), parent);
        KShapeLayout portLayout = port.getData(KShapeLayout.class);
        Point position = new Point(nodePosition);
        position.translate((int) portLayout.getXpos(), (int) portLayout.getYpos());
        return position;
    }
    
    /**
     * Gives the absolute positions of all bend points on the given edge.
     * 
     * @param edge The edge to get the bend points from
     * @param parent The containing node of the edge
     * @return A list of points, being the absolute positions of the bend points
     * 
     */
    public static List<Point> getBendPointsAbsolutePositions(final KEdge edge, final KNode parent) {
        List<Point> result = new LinkedList<Point>();
        KShapeLayout parentLayout = parent.getData(KShapeLayout.class);
        Point parentPosition = new Point(parentLayout.getXpos(), parentLayout.getYpos());
        for (KPoint bendPoint : edge.getData(KEdgeLayout.class).getBendPoints()) {
            Point pathStep = new Point(parentPosition);
            pathStep.translate((int) bendPoint.getX(), (int) bendPoint.getY());
            result.add(pathStep);
        }
        return result;
    }
    
    /**
     * Compute animation paths and location for a given model element (referred by an URI).
     * 
     * @param elementUri The URI object referring the model element
     * @param currentEditor The editor which holds the model element
     * @param diagramLayout The layout of the diagram which contains the model element
     * @return A list of paths, represented by a list of {@link Point}s
     * 
     */
    public static List<List<Point>> getPathsByElement(final KvidUri elementUri,
            final DiagramEditor currentEditor, final KNode diagramLayout) {
        List<List<Point>> result = new LinkedList<List<Point>>();
        String elementUriPart = elementUri.getElementUri();
        Resource resource = currentEditor.getDiagram().getElement().eResource();
        DiagramLayoutManager manager = EclipseLayoutServices.getInstance()
                                            .getManager(currentEditor, null);
        
        if (!elementUriPart.startsWith("/")) {
            try {
                //If not, it might be a Fragment URI, try to translate
                elementUriPart = ptolemyUri2FragmentUri(elementUriPart, resource);
            } catch (RuntimeException ex) {
                //Notify user about malformatted URI and ignore value during visualization
                Status status = new Status(Status.WARNING, KvidPlugin.PLUGIN_ID, 
                        "Needs Fragment URI or URI in Ptolemy Notation. Got: " + elementUri
                        + " The concrete problem was: " + ex.getMessage());
                StatusManager.getManager().handle(status, StatusManager.SHOW);
                return null;
            }
        }
        
        EObject modelElement = resource.getEObject(elementUriPart);
        List<EditPart> parts = ModelingUtil.getEditParts(
                currentEditor.getDiagramEditPart(), modelElement);
        KNode currentNode = null;
        for (EditPart part : parts) {
            currentNode = (KNode) manager.getElement(part);
            if (currentNode != null) {
                break;
            }
        }
        if (currentNode == null) {
            //Couldn't find the referred element, so no paths are created
            return null;
        }
        
        String parentUri = elementUriPart.substring(0, elementUriPart.lastIndexOf("/"));
        EObject parentModelElement = resource.getEObject(parentUri);
        parts = ModelingUtil.getEditParts(currentEditor.getDiagramEditPart(), parentModelElement);
        KNode parentNode = null;
        for (EditPart part : parts) {
            parentNode = (KNode) manager.getElement(part);
            if (parentNode != null) {
                break;
            }
        }
        if (parentNode == null) {
            //Couldn't find the referred element's parent, so no paths are created
            return null;
        }
        
        if (currentNode.getPorts().size() > 0) {
            for (KPort port : currentNode.getPorts()) {
                String portName = "";
                if (elementUri.hasPort()) {
                    portName = elementUri.getPort();
                } else if (RuntimeConfiguration.getInstance()
                        .currentValueOfProperty(
                                "Default output port") != "") {
                    portName = RuntimeConfiguration
                            .getInstance()
                            .currentValueOfProperty(
                                    "Default output port");
                }
                if (port.getLabel().getText().equals(portName) || portName.isEmpty()) {
                    for (KEdge edge : port.getEdges()) {
                        if (edge.getSourcePort() != null && edge.getSourcePort().equals(port)) {
                            List<Point> path = new LinkedList<Point>();
                            path.add(getAbsolutePosition(port, parentNode));
                            path.addAll(getBendPointsAbsolutePositions(edge, parentNode));
                            if (edge.getTargetPort() != null) {
                                path.add(getAbsolutePosition(edge.getTargetPort(), parentNode));
                            } else {
                                KShapeLayout targetLayout = edge.getTarget().getData(KShapeLayout.class);
                                if (targetLayout.getProperty(LayoutOptions.HYPERNODE).booleanValue()) {
                                    
                                } else {
                                    path.add(getAbsolutePosition(edge.getTarget(), parentNode));
                                }
                            }
                            result.add(path);
                        }
                    }
                }
            }
        } else {
            for (KEdge edge : currentNode.getOutgoingEdges()) {
                List<Point> path = new LinkedList<Point>();
                path.add(getAbsolutePosition(currentNode, parentNode));
                path.addAll(getBendPointsAbsolutePositions(edge, parentNode));
                KShapeLayout targetLayout = edge.getTarget().getData(
                        KShapeLayout.class);
                if (targetLayout.getProperty(LayoutOptions.HYPERNODE)
                        .booleanValue()) {
                    
                } else {
                    path.add(getAbsolutePosition(edge.getTarget(), parentNode));
                }
                result.add(path);
            }
        }
        return result;
    }
    
    /**
     * Helper method for getting the currently active editor.
     * 
     * @return The currently active editor in the UI
     */
    public static IEditorPart getActiveEditor() {
        IEditorPart editor = null;
        IWorkbenchWindow[] activeWindows = PlatformUI.getWorkbench().getWorkbenchWindows();
        for (int i = 0; i < activeWindows.length; i++) {
            IWorkbenchPage page = activeWindows[i].getActivePage();
            if (page.getActiveEditor() != null) {
                editor = page.getActiveEditor();
            }
        }
        return editor;        
    }
}
