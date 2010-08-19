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

import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusManager;
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
import de.cau.cs.kieler.kvid.KvidPlugin;
import de.cau.cs.kieler.kvid.KvidUtil;
import de.cau.cs.kieler.kvid.data.DataObject;
import de.cau.cs.kieler.kvid.dataprovider.IDataProvider;
import de.cau.cs.kieler.kvid.visual.GmfDrawer;

/**
 * This class organizes the distribution of the collected data to the object that
 * visualize it.
 * 
 * @author jjc
 *
 */
public final class DataDistributor implements IProviderListener {
    
    /** The instance of the distributor. See Singleton Design Pattern. */
    private static final DataDistributor INSTANCE = new DataDistributor();
    
    /** The current data, organized in a hash map with the model element's URI as key. */
    private HashMap<String, DataObject> dataByUri = new HashMap<String, DataObject>();
    
    /** List of registered {@link IDataListener}s. */
    private List<IDataListener> listeners = new LinkedList<IDataListener>();
    
    /** The cached current layout of the regarded diagram. */
    private KNode currentDiagramLayout = null;
    
    /** The editor in which the current visualization takes place. */
    private DiagramEditor currentEditor = null;
    
    /** The {@link IDataProvider} which is the current data source. */ 
    private IDataProvider currentProvider;
    
    /**
     * Private constructor to prevent external instatiation.
     */
    private DataDistributor() { }
    
    /**
     * Gives the single instance of the DataDistributor.
     * 
     * @return The single instance of the DataDistributor
     */
    public static DataDistributor getInstance() {
        return INSTANCE;
    }
    
    /**
     * Changes the current data source to a new one.
     * 
     * @param newprovider The new data source
     */
    public void changeDataProvider(final IDataProvider newprovider) {
        if (currentProvider != null) {
            currentProvider.removeProviderListener(this);
        }
        currentProvider = newprovider;
        currentProvider.registerProviderListener(this);
    }
    
    /**
     * Getter for the current data source.
     * 
     * @return The currently used data source
     */
    public IDataProvider getCurrentProvider() {
        return this.currentProvider;
    }
    
    /**
     * Method which prepares a new visualization.
     * Make sure this is called before any data is provided. 
     */
    public void initialize() {
        if (!listeners.contains(GmfDrawer.getInstance())) {
            registerDataListener(GmfDrawer.getInstance());
        }
        final IEditorPart activeEditor = KvidUtil.getActiveEditor();
        if (activeEditor instanceof DiagramEditor) {
            //Cache the current editor
            currentEditor = (DiagramEditor) activeEditor;
            PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
                public void run() {
                    //Receive the current diagram layout for path finding
                    currentDiagramLayout = EclipseLayoutServices.getInstance()
                            .getManager(currentEditor, null)
                            .buildLayoutGraph(currentEditor, null, false);
                }
            });
        }
    }
    
    /**
     * Call this every time the data to visualize has changed to trigger
     * the visualization of the new data.
     * 
     * @param data The new data for the next visualization step in JSON
     * @return Always null, could return a {@link JSONObject} if it is 
     *          to produce data for the {@link IDataProvider}
     */
    public JSONObject update(final JSONObject data) {
        @SuppressWarnings("rawtypes")
        Iterator allKeys = data.keys();
        while (allKeys.hasNext()) {
            Object o = allKeys.next();
            try {
                String key = o.toString();
                if (dataByUri.containsKey(key)) {
                    //Model data source is alredy known, just update it
                    dataByUri.get(key).updateData(data.getString(key));
                } else {
                    //New model data source, create paths and new entry in the data table
                    List<List<Point>> paths = getPathsByNode(key);
                    dataByUri.put(o.toString(), new DataObject(key, data.getString(key), paths));
                    //Also add Property object for the new entry
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
        }
        for (IDataListener listener : listeners) {
            //Notify all listeners that data was updated
            listener.triggerDataChanged();
        }
        return null;
    }
    
    /**
     * Compute animation paths and location for a given model element (referred by URI).
     * 
     * @param uri Referring URI, either in Ptolemy Notation or a Fragment URI
     * @return A list of paths, represented by a list of {@link Point}s
     */
    public List<List<Point>> getPathsByNode(final String uri) {
        List<List<Point>> result = new LinkedList<List<Point>>();
        //Is URI in Ptolemy Notation?
        if (!uri.startsWith(".")) {
            try {
                //If not, it might be a Fragment URI, try to translate
                KvidUtil.fragmentUri2PtolemyUri(uri, currentEditor.getDiagram().eResource());
            } catch (RuntimeException ex) {
                //Notify user about malformatted URI and ignore value during visualization
                Status status = new Status(Status.WARNING, KvidPlugin.PLUGIN_ID, 
                        "Needs Fragment URI or URI in Ptolemy Notation. Got: " + uri
                        + " The concrete problem was: " + ex.getMessage());
                StatusManager.getManager().handle(status, StatusManager.SHOW);
                return null;
            }
        } 
        
        //Find node that matches URI
        String[] uriParts = uri.split("\\.");
        int currentUriPart = 1;
        String currentFoundUri = ".";
        KNode currentNode = currentDiagramLayout;
        while (!currentFoundUri.equals(uri) && !currentNode.getChildren().isEmpty()) {
            for (KNode node : currentNode.getChildren()) {
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
        
        
        //If no node was found, return null
        if (!currentFoundUri.equals(uri)) {
            return null;
        }
        
        //Get position of found node's parent
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
        
        //Create paths from outgoing edges
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
    
    /**
     * Getter for a {@link DataObject} by it's model element's URI.
     *  
     * @param uri The URI of the model element
     * @return The {@link DataObject} associated with the model element
     */
    public DataObject getDataObjectByURI(final String uri) {
        return dataByUri.get(uri);
    }
    
    /**
     * Getter for the data table.
     * 
     * @return The data table, holding the data referred by the model element's URI
     */
    public HashMap<String, DataObject> getData() {
        return dataByUri;
    }
    
    /**
     * Will be triggered when the current {@link IDataProvider} starts giving data.
     */
    public void triggerInitialization() {
        initialize();
    }

    /**
     * Will be triggered when the current {@link IDataProvider} stops giving data.
     */
    public void triggerWrapup() {
        dataByUri = new HashMap<String, DataObject>();
        currentDiagramLayout = null;
        currentEditor = null;
        for (IDataListener listener : listeners) {
            listener.triggerWrapup();
        }
    }
    
    /**
     * Registers a new listener which will be notified when the data changes.
     * 
     * @param thelistener The {@link IDataListener} to add
     */
    public void registerDataListener(final IDataListener thelistener) {
        listeners.add(thelistener);
    }
    
    /**
     * Removes a listener from the listeners list.
     * 
     * @param thelistener The {@link IDataListener} to remove
     */
    public void removeDataListener(final IDataListener thelistener) {
        listeners.remove(thelistener);
    }

    /**
     * This will be called when the current layout changes.
     * 
     * @param layoutGraph The new diagram layout
     */
    public void layoutChanged(final KNode layoutGraph) {
        currentDiagramLayout = layoutGraph;
        for (String key : dataByUri.keySet()) {
            List<List<Point>> paths = getPathsByNode(key);
            dataByUri.get(key).updatePaths(paths);
        }
    }

}
