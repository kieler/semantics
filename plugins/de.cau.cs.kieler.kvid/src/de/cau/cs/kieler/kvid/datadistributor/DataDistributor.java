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
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
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
import de.cau.cs.kieler.kiml.util.KimlUtil;
import de.cau.cs.kieler.kvid.KvidPlugin;
import de.cau.cs.kieler.kvid.KvidUtil;
import de.cau.cs.kieler.kvid.data.DataObject;
import de.cau.cs.kieler.kvid.data.KvidUri;
import de.cau.cs.kieler.kvid.dataprovider.IDataProvider;
import de.cau.cs.kieler.kvid.visual.GmfAnimator;
import de.cau.cs.kieler.kvid.visual.GmfDrawer;

/**
 * This class organizes the distribution of the collected data to the objects that
 * visualize it.
 * 
 * This is the core class of the KViD Plugin. It collects the data provided by a
 * data source and distributes it to all registered classes that might visualize
 * it. This class is implemented as a singleton.
 * 
 * @author jjc
 *
 */
public final class DataDistributor implements IProviderListener, ResourceSetListener {
    
    /** The instance of the distributor. */
    private static final DataDistributor INSTANCE = new DataDistributor();
    
    /** The current data, organized in a hash map with the model element's URI as key. */
    private HashMap<KvidUri, DataObject> dataByUri = new HashMap<KvidUri, DataObject>();
    
    /** List of registered {@link IDataListener}s. */
    private List<IDataListener> listeners = new LinkedList<IDataListener>();
    
    /** The cached current layout of the regarded diagram. */
    private KNode currentDiagramLayout = null;
    
    /** The editor in which the current visualization takes place. */
    private DiagramEditor currentEditor = null;
    
    /** The {@link IDataProvider} which is the current data source. */ 
    private IDataProvider currentProvider;
    
    /** Flag for checking whether the layout has to be re-cached. */
    private boolean layoutChanged = false;
    
    /**
     * Private constructor to prevent external instantiation.
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
     * @param newProvider The new data source
     * @deprecated Kiem is the only used data source
     */
    public void changeDataProvider(final IDataProvider newProvider) {
        if (currentProvider != null) {
            currentProvider.removeProviderListener(this);
        }
        currentProvider = newProvider;
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
        registerDataListener(GmfDrawer.getInstance());
        final IEditorPart activeEditor = KvidUtil.getActiveEditor();
        if (activeEditor instanceof DiagramEditor) {
            //TODO DiagramEditor is restriction, is there a more generic way?
            //Cache the current editor
            currentEditor = (DiagramEditor) activeEditor;
            currentEditor.getEditingDomain().addResourceSetListener(this);
            PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
                //FIXME Evaluate using asyncExec!
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
     * 
     * {@inheritDoc}
     * 
     */
    public void update(final JSONObject data) {
        //Lazy reload of paths if layout was changed
        if (layoutChanged) {
            PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
                //FIXME Evaluate using asyncExec!
                public void run() {
                    //Receive the current diagram layout for path finding
                    currentDiagramLayout = EclipseLayoutServices.getInstance()
                            .getManager(currentEditor, null)
                            .buildLayoutGraph(currentEditor, null, false);
                    System.out.println("Done!");
                }
            });
            for (KvidUri key : dataByUri.keySet()) {
                List<List<Point>> paths = getPathsByNode(key);
                dataByUri.get(key).updatePaths(paths);
            }
        }
        //JSON implementation doesn't type the iterator
        @SuppressWarnings("unchecked")
        Iterator<Object> allKeys = (Iterator<Object>) data.keys();
        while (allKeys.hasNext()) {
            Object o = allKeys.next();
            try {
                KvidUri key = new KvidUri(o.toString());
                if (dataByUri.containsKey(key)) {
                    //Model data source is already known, just update it
                    dataByUri.get(key).updateData(data.getString(o.toString()));
                } else {
                    //New model data source, create paths and new entry in the data table
                    List<List<Point>> paths = getPathsByNode(key);
                    dataByUri.put(key, new DataObject(key, data.getString(o.toString()), paths));
                    //Also add Property object for the new entry
                    List<String> associatedObjects = new LinkedList<String>();
                    associatedObjects.add(KvidUtil.ptolemyUri2FragmentUri(key.getElementUri(), 
                            currentEditor.getDiagram().getElement().eResource()));
                    RuntimeConfiguration
                    .getInstance()
                    .addProperty(new Property("Display status " + key.getElementUri(),
                            new String[] { "Animating",
                                    "Static on Source Node",
                                    "Static on middlemost Bend Point", 
                                    "Static on Target Node", "Invisible" },
                                    associatedObjects));
                }
            } catch (JSONException e) {
                //We iterate over the keys, so we can't use a non-existing key.
                //Therefore, this exception can't be thrown.
                e.printStackTrace();
            }
        }
        for (IDataListener listener : listeners) {
            //Notify all listeners that data was updated
            listener.triggerDataChanged();
        }
    }
    
    /**
     * Compute animation paths and location for a given model element (referred by URI).
     * 
     * @param uri Referring URI, either in Ptolemy Notation or a Fragment URI
     * @return A list of paths, represented by a list of {@link Point}s
     */
    public List<List<Point>> getPathsByNode(final KvidUri uri) {
        //FIXME Move to Util Class
        //FIXME When new KIML getModelStuff is finished, rewrite this
        List<List<Point>> result = new LinkedList<List<Point>>();
        //Is URI in Ptolemy Notation?
        if (!uri.getElementUri().startsWith(".")) {
            try {
                //If not, it might be a Fragment URI, try to translate
                KvidUtil.fragmentUri2PtolemyUri(uri.getElementUri(),
                        currentEditor.getDiagram().eResource());
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
        String[] uriParts = uri.getElementUri().split("\\.");
        int currentUriPart = 1;
        String currentFoundUri = ".";
        KNode currentNode = currentDiagramLayout;
        while (!currentFoundUri.equals(uri.getElementUri()) && !currentNode.getChildren().isEmpty()) {
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
        if (!currentFoundUri.equals(uri.getElementUri())) {
            return null;
        }
        
        //Get position of found node's parent
        //FIXME Think about some refactoring, extract into more methods! Watch for NullPointers.
        Point parentPosition = new Point();
        KNode parent = currentNode;
        while (parent.getParent().getParent() != null) {
            parent = parent.getParent();
            parentPosition.x = (int) KimlUtil.getShapeLayout(parent).getXpos();
            parentPosition.y = (int) KimlUtil.getShapeLayout(parent).getYpos();
        }
        KInsets insets = KimlUtil.getShapeLayout(parent).getProperty(LayoutOptions.INSETS);
        parentPosition.x += insets.getLeft();
        parentPosition.y += insets.getTop();
        
        //Create paths from outgoing edges
        for (KPort port : currentNode.getPorts()) {
            if (port.getLabel().getText().equals("output")) {
                for (KEdge edge : port.getEdges()) {
                    List<Point> path = new LinkedList<Point>();
                    Point start = new Point(parentPosition);
                    start.x += KimlUtil.getShapeLayout(edge.getSource()).getXpos();
                    start.y += KimlUtil.getShapeLayout(edge.getSource()).getYpos();
                    start.x += KimlUtil.getShapeLayout(port).getXpos();
                    start.y += KimlUtil.getShapeLayout(port).getYpos();
                    path.add(start);
                    for (KPoint bendPoint : KimlUtil.getEdgeLayout(edge).getBendPoints()) {
                        Point pathStep = new Point(parentPosition);
                        pathStep.x += bendPoint.getX();
                        pathStep.y += bendPoint.getY();
                        path.add(pathStep);
                    }
                    Point finish = new Point(parentPosition);
                    finish.x += KimlUtil.getShapeLayout(edge.getTarget()).getXpos();
                    finish.y += KimlUtil.getShapeLayout(edge.getTarget()).getYpos();
                    finish.x += KimlUtil.getShapeLayout(edge.getTargetPort()).getXpos();
                    finish.y += KimlUtil.getShapeLayout(edge.getTargetPort()).getYpos();
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
    public DataObject getDataObjectByURI(final KvidUri uri) {
        return dataByUri.get(uri);
    }
    
    /**
     * Getter for the data table.
     * 
     * @return The data table, holding the data referred by the model element's URI
     */
    public HashMap<KvidUri, DataObject> getData() {
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
        dataByUri = new HashMap<KvidUri, DataObject>();
        currentDiagramLayout = null;
        GmfAnimator.resetSteps();
        if (currentEditor != null) {
            currentEditor.getEditingDomain().removeResourceSetListener(this);
        }
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
        if (!listeners.contains(thelistener)) {
           listeners.add(thelistener); 
        }
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
     * {@inheritDoc}
     */
    public NotificationFilter getFilter() {
        //does not use a filter, thus ignored
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public Command transactionAboutToCommit(final ResourceSetChangeEvent event)
            throws RollbackException {
        //not needed, ignored
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public void resourceSetChanged(final ResourceSetChangeEvent event) {
        layoutChanged = true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isAggregatePrecommitListener() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isPrecommitOnly() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isPostcommitOnly() {
        return true;
    }

}
