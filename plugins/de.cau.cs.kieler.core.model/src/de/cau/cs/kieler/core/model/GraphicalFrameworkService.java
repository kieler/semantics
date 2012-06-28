/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gef.EditPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.ui.CoreUIPlugin;
import de.cau.cs.kieler.core.ui.UnsupportedPartException;

/**
 * A service for providing bridges to graphical editing frameworks.
 * 
 * FIXME this service is still to specific and should be generalized
 * 
 * @author msp
 */
public final class GraphicalFrameworkService {

    /** framework identifier for GMF. */
    public static final String FW_GMF = "gmf";
    /** framework identifier for Graphiti. */
    public static final String FW_GRAPHITI = "graphiti";
    
    /** the extension point identifier. */
    public static final String EXTENSION_POINT_ID
            = "de.cau.cs.kieler.core.model.graphicalFrameworkBridges";

    /** the singleton instance. **/
    private static GraphicalFrameworkService instance;

    /**
     * Hidden constructor.
     */
    private GraphicalFrameworkService() {
    }

    /**
     * Start the graphical framework service. Only visible to classes from the same package.
     */
    static void start() {
        instance = new GraphicalFrameworkService();
        instance.loadExtensionPoint();
    }

    /**
     * Returns the singleton instance.
     * 
     * @return the singleton instance
     */
    public static GraphicalFrameworkService getInstance() {
        return instance;
    }

    /**
     * Tests whether the GraphicalFrameworkService instance can obtain Diagram data from the given
     * WorkBenchPart (Editor or View).
     * 
     * @author haf
     * @param part
     *            the corresponding WorkBenchPart, an Editor or View
     * @return true iff a GraphicalFrameworkBridge is registered for the part and an EditPart can be
     *         obtained.
     */
    public static boolean containsDiagram(final IWorkbenchPart part) {
        try {
            EditPart ep = GraphicalFrameworkService.getInstance().getBridge(part).getEditPart(part);
            if (ep != null) {
                return true;
            }
        } catch (UnsupportedPartException e) {
            /* nothing, fallthrough. */
        }
        return false;
    }
    
    /** bridge data held in the list of registered bridges. */
    private class BridgeData {
        private IGraphicalFrameworkBridge bridge;
        private int priority;
        private String id;
    }
    
    /** the sorted list of registered graphical framework bridges. */
    private List<BridgeData> bridgeList = new LinkedList<BridgeData>();

    /**
     * Inserts a given graphical framework bridge into the sorted list.
     * 
     * @param bridge
     *            a bridge implementation
     * @param id
     *            identifier for the graphical framework
     * @param priority
     *            the priority of the new implementation
     */
    private void insertBridge(final IGraphicalFrameworkBridge bridge, final String id,
            final int priority) {
        ListIterator<BridgeData> iter = bridgeList.listIterator();
        while (iter.hasNext()) {
            BridgeData next = iter.next();
            if (next.priority <= priority) {
                iter.previous();
                break;
            }
        }
        BridgeData data = new BridgeData();
        data.bridge = bridge;
        data.id = id;
        data.priority = priority;
        iter.add(data);
    }

    /**
     * Load the registered classes from the extension point.
     */
    private void loadExtensionPoint() {
        IConfigurationElement[] extensions = Platform.getExtensionRegistry()
                .getConfigurationElementsFor(EXTENSION_POINT_ID);

        for (IConfigurationElement element : extensions) {
            if (element.getName().equals("bridge")) {
                try {
                    IGraphicalFrameworkBridge bridge = (IGraphicalFrameworkBridge) element
                            .createExecutableExtension("class");
                    String id = element.getAttribute("id");
                    int priority = 0;
                    try {
                        String prioStr = element.getAttribute("priority");
                        if (prioStr != null) {
                            priority = Integer.parseInt(prioStr);
                        }
                    } catch (NumberFormatException exception) {
                        // ignore exception
                    }
                    insertBridge(bridge, id, priority);
                } catch (CoreException exception) {
                    StatusManager.getManager().handle(exception, CoreUIPlugin.PLUGIN_ID);
                }
            }
        }
    }

    /**
     * Retrieve the first suitable graphical editing framework bridge for the given object.
     * If a string is passed, the framework bridge is selected by its registered identifier.
     * 
     * @param object
     *            a framework identifier, or an edit part, editor part, or notational object
     * @return the first suitable bridge
     * @throws UnsupportedPartException
     *             if there is no bridge available for the given object
     */
    public IGraphicalFrameworkBridge getBridge(final Object object) {
        if (object instanceof String) {
            // retrieve a bridge with given identifier
            String id = (String) object;
            for (BridgeData entry : bridgeList) {
                if (entry.id.equals(id)) {
                    return entry.bridge;
                }
            }
        } else {
            // retrieve a bridge that supports the given object
            for (BridgeData entry : bridgeList) {
                if (entry.bridge.supports(object)) {
                    return entry.bridge;
                }
            }
        }
        throw new UnsupportedPartException("GraphicalFrameworkBridge",
                "No bridge available for the given input.", object);
    }
    
    /**
     * Check whether the given object is supported by any framework bridge.
     * 
     * @param object
     *          a framework identifier, or an edit part, editor part, or notational object
     * @return true if the object is supported
     */
    public boolean isSupported(final Object object) {
        if (object instanceof String) {
            // retrieve a bridge with given identifier
            String id = (String) object;
            for (BridgeData entry : bridgeList) {
                if (entry.id.equals(id)) {
                    return true;
                }
            }
        } else {
            // retrieve a bridge that supports the given object
            for (BridgeData entry : bridgeList) {
                if (entry.bridge.supports(object)) {
                    return true;
                }
            }
        }
        return false;
    }

}
