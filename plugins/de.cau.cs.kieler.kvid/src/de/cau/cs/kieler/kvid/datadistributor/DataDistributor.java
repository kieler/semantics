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
package de.cau.cs.kieler.kvid.datadistributor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.json.JSONException;
import org.json.JSONObject;

import de.cau.cs.kieler.core.kgraph.KEdge;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.kgraph.KPort;
import de.cau.cs.kieler.kiml.klayoutdata.KInsets;
import de.cau.cs.kieler.kiml.klayoutdata.KPoint;
import de.cau.cs.kieler.kiml.options.LayoutOptions;
import de.cau.cs.kieler.kiml.ui.layout.EclipseLayoutServices;
import de.cau.cs.kieler.kiml.util.KimlLayoutUtil;
import de.cau.cs.kieler.kvid.data.DataObject;
import de.cau.cs.kieler.kvid.dataprovider.IDataProvider;
import de.cau.cs.kieler.kvid.dataprovider.KiemDataProvider;
import de.cau.cs.kieler.kvid.visual.GmfDrawer;
import de.cau.cs.kieler.kvid.visual.IDrawer;
import de.cau.cs.kieler.kvid.visual.complex.ScopeEditPart;

/**
 * This class organizes the distribution of the collected data to the object that
 * visualize it.
 * 
 * @author jjc
 *
 */
public class DataDistributor implements IProviderListener {
    
    private static final DataDistributor INSTANCE = new DataDistributor();
    
    private HashMap<String, EditPart> editPartsByURI = new HashMap<String, EditPart>();
    
    private HashMap<String, DataObject> dataByURI = new HashMap<String, DataObject>();
    
    private KNode currentDiagramLayout = null;
        
    private IDrawer drawer = new GmfDrawer();
    
    private IDataProvider currentProvider;
    
    public static DataDistributor getInstance() {
        return INSTANCE;
    }
    
    public void changeDataProvider(IDataProvider newprovider) {
        if (currentProvider != null) {
            currentProvider.removeProviderListener(this);
        }
        currentProvider = newprovider;
        currentProvider.registerProviderListener(this);
    }
    
    public IDataProvider getCurrentProvider() {
        return this.currentProvider;
    }
    
    public void initialize() {
        final IEditorPart activeEditor = getActiveEditor();
        if (activeEditor instanceof DiagramEditor) {
            PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
                public void run() {
                    currentDiagramLayout = EclipseLayoutServices.getInstance()
                            .getManager(activeEditor, null)
                            .buildLayoutGraph(activeEditor, null, false);
                }
            });
        }
    }
    
    public JSONObject update(final JSONObject data) {
        @SuppressWarnings("rawtypes")
        Iterator allKeys = data.keys();
        int figureCounter = 1;
        while (allKeys.hasNext()) {
            Object o = allKeys.next();
            List<List<Point>> paths = getPathsByNode(o.toString());
            try {
                String key = o.toString();
                if (dataByURI.containsKey(key)) {
                    dataByURI.get(key).updateData(data.getString(key));
                } else {
                    dataByURI.put(o.toString(), new DataObject(key, data.getString(key), paths));
                    RuntimeConfiguration
                    .getInstance()
                    .addProperty(new Property("Display status " + key,
                            new String[] { "Animating",
                                    "Static on Source Node",
                                    "Static on middlemost Bend Point", 
                                    "Static on Target Node", "Invisible" }));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            figureCounter++;
        }
        drawer.draw(dataByURI);
        ScopeEditPart.instances.get(0).setReferredObjectURI(".rampAdd.Ramp");
        return null;
    }
    
    public List<List<Point>> getPathsByNode(String URI) {
        List<List<Point>> result = new LinkedList<List<Point>>();
        
        //find node that matches URI
        String[] uriParts = URI.split("\\.");
        int currentUriPart = 1;
        String currentFoundUri = ".";
        KNode currentNode = currentDiagramLayout;
        while (!currentFoundUri.equals(URI) && !currentNode.getChildren().isEmpty()) {
            for(KNode node : currentNode.getChildren()) {
                if (node.getLabel().getText().equals(uriParts[currentUriPart])) {
                    currentNode = node;
                    currentFoundUri += node.getLabel().getText();
                    currentUriPart++;
                    if (currentUriPart < uriParts.length) {
                        currentFoundUri += ".";
                    }
                    break;
                }
            }
        }
        
        
        //if no node was found, return null
        if (!currentFoundUri.equals(URI)) {
            return null;
        }
        
        //get position of found node's parent
        Point parentPosition = new Point();
        KNode parent = currentNode;
        while (parent.getParent().getParent() != null) {
            parent = parent.getParent();
            parentPosition.x = (int) KimlLayoutUtil.getShapeLayout(parent).getXpos();
            parentPosition.y = (int) KimlLayoutUtil.getShapeLayout(parent).getYpos();
        }
        KInsets insets = LayoutOptions.getObject(KimlLayoutUtil.getShapeLayout(parent), KInsets.class);
        parentPosition.x += insets.getLeft();
        parentPosition.y += insets.getTop();
        
        //create paths from outgoing edges
        for (KPort port : currentNode.getPorts()) {
            if (port.getLabel().getText().equals("output")) {
                for (KEdge edge : port.getEdges()) {
                    List<Point> path = new LinkedList<Point>();
                    Point start = new Point(parentPosition);
                    start.x += KimlLayoutUtil.getShapeLayout(edge.getSource()).getXpos();
                    start.y += KimlLayoutUtil.getShapeLayout(edge.getSource()).getYpos();
                    start.x += KimlLayoutUtil.getShapeLayout(port).getXpos();
                    start.y += KimlLayoutUtil.getShapeLayout(port).getYpos();
                    path.add(start);
                    for (KPoint bendPoint : KimlLayoutUtil.getEdgeLayout(edge).getBendPoints()) {
                        Point pathStep = new Point(parentPosition);
                        pathStep.x += bendPoint.getX();
                        pathStep.y += bendPoint.getY();
                        path.add(pathStep);
                    }
                    Point finish = new Point(parentPosition);
                    finish.x += KimlLayoutUtil.getShapeLayout(edge.getTarget()).getXpos();
                    finish.y += KimlLayoutUtil.getShapeLayout(edge.getTarget()).getYpos();
                    finish.x += KimlLayoutUtil.getShapeLayout(edge.getTargetPort()).getXpos();
                    finish.y += KimlLayoutUtil.getShapeLayout(edge.getTargetPort()).getYpos();
                    path.add(finish);
                    result.add(path);
                } 
            }
        }
        return result;
    }
    
    public void cleanup() {
        drawer.clearDrawing();
    }
    
    public DataObject getDataObjectByURI(String URI) {
        return dataByURI.get(URI);
    }
    
    public EditPart getEditPartByURI(String fragmentURI) {
        return editPartsByURI.get(fragmentURI);
    }
    
    public IEditorPart getActiveEditor() {
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

    public void triggerInitialization() {
        initialize();
    }

    public void triggerWrapup() {
        cleanup();
        editPartsByURI = new HashMap<String, EditPart>();
        dataByURI = new HashMap<String, DataObject>();
        currentDiagramLayout = null;
    }

}
