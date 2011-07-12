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

import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.annotations.NamedObject;
import de.cau.cs.kieler.core.kgraph.KEdge;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.kgraph.KPort;
import de.cau.cs.kieler.core.model.gmf.util.GmfModelingUtil;
import de.cau.cs.kieler.kaom.Port;
import de.cau.cs.kieler.kiml.klayoutdata.KShapeLayout;
import de.cau.cs.kieler.kiml.options.LayoutOptions;
import de.cau.cs.kieler.kiml.ui.diagram.LayoutMapping;
import de.cau.cs.kieler.kiml.ui.util.KimlUiUtil;
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
        //Ptolemy URIs do not tend to be larger than fragment URIs
        StringBuilder result = new StringBuilder(fragmentUri.length());
        if (fragmentUri.startsWith("//")) {
            EObject model = resource.getEObject(fragmentUri);
            while (model.eContainer() != null) {
                if (model instanceof NamedObject) {
                    result.insert(0, ((NamedObject) model).getName());
                    if (model instanceof Port) {
                        result.insert(0, ":");
                    } else  {
                        result.insert(0, ".");
                    }
                } else {
                    throw new IllegalArgumentException("Ptolemy URIs will only work with NamedObjects");
                }
                model = model.eContainer();
            }
        } else {
            throw new IllegalArgumentException("Malformatted Fragment URI");
        }
        return result.toString();
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
        //Fragmemt URIs are about twice as long as PtolemyURIs
        StringBuilder result = new StringBuilder(ptolemyUri.length() * 2);
        if (ptolemyUri.startsWith(".")) {
            EObject root = resource.getContents().get(0);
            result.append("/");
            StringTokenizer tokenizer = new StringTokenizer(ptolemyUri, ".");
            while (tokenizer.hasMoreTokens()) {
                //parse Ptolemy URI and find corresponding EObject on the current level 
                result.append("/");
                String currentUri = tokenizer.nextToken();
                
                String currentResult = new String(result.toString());
                for (EObject eo : root.eContents()) {
                    //iterate through the current level and find the NamedObject with the same name
                    if (eo instanceof NamedObject) {
                        if (((NamedObject) eo).getName() != null
                                && ((NamedObject) eo).getName().equals(
                                        currentUri)) {
                            result.append(((InternalEObject) eo.eContainer())
                                    .eURIFragmentSegment(
                                            eo.eContainingFeature(), eo));
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
            throw new IllegalArgumentException("Malformatted Name-based URI");
        }
        return result.toString();
    }
    
    /**
     * Compute animation paths and location for a port.
     * 
     * @param port The port to perform pathfinding for
     * @return A list of paths for animation purposes
     */
    private static List<List<Point>> getPathsByPort(final KPort port) {
        List<List<Point>> result = new LinkedList<List<Point>>();
        List<List<Point>> subresult = new LinkedList<List<Point>>();
        for (KEdge edge : port.getEdges()) {
            if (edge.getSourcePort() != null && edge.getSourcePort().equals(port)) {
                List<Point> path = new LinkedList<Point>();
                path.addAll(KimlUiUtil.getBendPointsAbsolutePositions(edge));
                if (edge.getTargetPort() == null) {
                    KShapeLayout targetLayout = edge.getTarget().getData(KShapeLayout.class);
                    if (targetLayout.getProperty(LayoutOptions.HYPERNODE)) {
                        subresult.addAll(getPathsByNode(edge.getTarget()));
                    }
                }
                if (subresult.size() > 0) {
                    for (List<Point> subpath : subresult) {
                        List<Point> completePath = new LinkedList<Point>();
                        completePath.addAll(path);
                        completePath.addAll(subpath);
                        result.add(completePath);
                    }
                } else {
                    result.add(path);
                }
                subresult.clear();
            }
        }
        return result;
    }
    
    /**
     * Compute animation paths and location for a node.
     * 
     * @param port The node to perform pathfinding for
     * @return A list of paths for animation purposes
     */
    private static List<List<Point>> getPathsByNode(final KNode node) {
        List<List<Point>> result = new LinkedList<List<Point>>();
        List<List<Point>> subresult = new LinkedList<List<Point>>();
        for (KEdge edge : node.getOutgoingEdges()) {
            List<Point> path = new LinkedList<Point>();
            path.addAll(KimlUiUtil.getBendPointsAbsolutePositions(edge));
            if (edge.getTargetPort() == null) {
                KShapeLayout targetLayout = edge.getTarget().getData(
                        KShapeLayout.class);
                if (targetLayout.getProperty(LayoutOptions.HYPERNODE)
                        .booleanValue()) {
                    subresult.addAll(getPathsByNode(edge.getTarget()));
                }
            }
            if (subresult.size() > 0) {
                for (List<Point> subpath : subresult) {
                    List<Point> completePath = new LinkedList<Point>();
                    completePath.addAll(path);
                    completePath.addAll(subpath);
                    result.add(completePath);
                }
            } else {
                result.add(path);
            }
            subresult.clear();
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
            final DiagramEditor currentEditor, final LayoutMapping<?> diagramLayout) {
        List<List<Point>> result = new LinkedList<List<Point>>();
        String elementUriPart = elementUri.getElementUri();
        Resource resource;
        if (currentEditor.getDiagram() != null && currentEditor.getDiagram().getElement() != null) {
            resource = currentEditor.getDiagram().getElement().eResource();
        } else {
            Status status = new Status(Status.WARNING, KvidPlugin.PLUGIN_ID, 
                    "There was a problem with the diagram's resource.");
            StatusManager.getManager().handle(status, StatusManager.SHOW);
            return null;
        }
        
        if (!elementUriPart.startsWith("/")) {
            try {
                //If not, it might be a Fragment URI, try to translate
                elementUriPart = ptolemyUri2FragmentUri(elementUriPart, resource);
            } catch (IllegalArgumentException iaex) {
                //Notify user about malformatted URI and ignore value during visualization
                Status status = new Status(Status.WARNING, KvidPlugin.PLUGIN_ID, 
                        "Needs Fragment URI or URI in Ptolemy Notation. Got: " + elementUriPart,
                        iaex);
                StatusManager.getManager().handle(status, StatusManager.SHOW);
                return null;
            }
        }
        
        if (elementUriPart == null) {
            //Element couldn't be resolved, can't decide on paths then
            return null;
        }
        EObject modelElement;
        try {
            modelElement = resource.getEObject(elementUriPart);
        } catch (StringIndexOutOfBoundsException siobex) {
            //Workaround for an error in the getEObject method
            //Should return null for a non existing model element
            //When something was deleted, it sometimes throws this exception instead
            return null;
        }
        if (modelElement == null) {
            //Element couldn't be resolved, can't decide on paths then
            return null;
        }
        List<EditPart> parts = GmfModelingUtil.getEditParts(
                currentEditor.getDiagramEditPart(), modelElement);
        KNode currentNode = null;
        for (EditPart part : parts) {
            currentNode = (KNode) diagramLayout.getGraphMap().inverse().get(part);
            if (currentNode != null) {
                break;
            }
        }
        if (currentNode == null) {
            //Couldn't find the referred element, so no paths are created
            return null;
        }
        
        if (currentNode.getPorts().size() > 0) {
            for (KPort port : currentNode.getPorts()) {
                String portName = "";
                String portOption = RuntimeConfiguration.getInstance()
                        .currentValueOfProperty(RuntimeConfiguration.DEFAULT_PORT);
                if (elementUri.hasPort()) {
                    portName = elementUri.getPort();
                } else if (portOption != "") {
                    portName = portOption;
                }
                if (port.getLabel().getText().equals(portName) || portName.isEmpty()) {
                    result.addAll(getPathsByPort(port));
                }
            }
        } else {
            result.addAll(getPathsByNode(currentNode));
        }
        return result;
    }
    
    /**
     * Helper method for getting the currently active editor.
     * 
     * @return The currently active editor in the UI or null
     */
    public static IEditorPart getActiveEditor() {
        IEditorPart editor = null;
        IWorkbenchWindow[] activeWindows = PlatformUI.getWorkbench()
                .getWorkbenchWindows();
        for (int i = 0; i < activeWindows.length; i++) {
            IWorkbenchPage page = activeWindows[i].getActivePage();
            if (page.getActiveEditor() != null) {
                editor = page.getActiveEditor();
            }
        }
        return editor;
    }
}
