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
package de.cau.cs.kieler.core.ui;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.KielerNotSupportedException;
import de.cau.cs.kieler.core.util.Pair;

/**
 * A service for providing bridges to graphical editing frameworks.
 * 
 * @author msp
 */
public final class GraphicalFrameworkService {

    /** the extension point identifier. */
    public static final String EXTENSION_POINT_ID = "de.cau.cs.kieler.core.ui.graphicalFrameworkBridges";

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
     * A graphical framework bridge implementation that switches between all available bridges to
     * retrieve requested elements.
     */
    private class MultiplexingBridge implements IGraphicalFrameworkBridge {

        /**
         * {@inheritDoc}
         */
        public boolean supports(final Object object) {
            return false;
        }

        /**
         * {@inheritDoc}
         */
        public EObject getElement(final Object object) {
            for (Pair<IGraphicalFrameworkBridge, Integer> entry : bridgeList) {
                EObject result = entry.getFirst().getElement(object);
                if (result != null) {
                    return result;
                }
            }
            return null;
        }

        /**
         * {@inheritDoc}
         */
        public EditPart getEditPart(final Object object) {
            for (Pair<IGraphicalFrameworkBridge, Integer> entry : bridgeList) {
                EditPart result = entry.getFirst().getEditPart(object);
                if (result != null) {
                    return result;
                }
            }
            return null;
        }

        /**
         * {@inheritDoc}
         */
        public EditPart getEditPart(final IEditorPart editorPart, final Object object) {
            for (Pair<IGraphicalFrameworkBridge, Integer> entry : bridgeList) {
                EditPart result = entry.getFirst().getEditPart(editorPart, object);
                if (result != null) {
                    return result;
                }
            }
            return null;
        }

        /**
         * {@inheritDoc}
         */
        public EditingDomain getEditingDomain(final Object object) {
            for (Pair<IGraphicalFrameworkBridge, Integer> entry : bridgeList) {
                EditingDomain result = entry.getFirst().getEditingDomain(object);
                if (result != null) {
                    return result;
                }
            }
            return null;
        }

        /**
         * {@inheritDoc}
         */
        public IFigure getDrawingLayer(final EditPart editPart) {
            for (Pair<IGraphicalFrameworkBridge, Integer> entry : bridgeList) {
                IFigure result = entry.getFirst().getDrawingLayer(editPart);
                if (result != null) {
                    return result;
                }
            }
            return null;
        }

        /**
         * {@inheritDoc}
         */
        public ZoomManager getZoomManager(final EditPart editPart) {
            for (Pair<IGraphicalFrameworkBridge, Integer> entry : bridgeList) {
                ZoomManager result = entry.getFirst().getZoomManager(editPart);
                if (result != null) {
                    return result;
                }
            }
            return null;
        }

        /**
         * {@inheritDoc}
         */
        public ISelection getSelection(final IEditorPart editorPart) {
            for (Pair<IGraphicalFrameworkBridge, Integer> entry : bridgeList) {
                ISelection result = entry.getFirst().getSelection(editorPart);
                if (result != null) {
                    return result;
                }
            }
            return null;
        }

    }

    /** the sorted list of registered graphical framework bridges. */
    private List<Pair<IGraphicalFrameworkBridge, Integer>> bridgeList = new LinkedList<Pair<IGraphicalFrameworkBridge, Integer>>();
    /** the multiplexing bridge that is returned if no bridge directly supports an object. */
    private MultiplexingBridge multiplexingBridge = new MultiplexingBridge();

    /**
     * Inserts a given graphical framework bridge into the sorted list.
     * 
     * @param bridge
     *            a bridge implementation
     * @param priority
     *            the priority of the new implementation
     */
    private void insertBridge(final IGraphicalFrameworkBridge bridge, final int priority) {
        ListIterator<Pair<IGraphicalFrameworkBridge, Integer>> iter = bridgeList.listIterator();
        while (iter.hasNext()) {
            Pair<IGraphicalFrameworkBridge, Integer> next = iter.next();
            if (next.getSecond() <= priority) {
                iter.previous();
                break;
            }
        }
        iter.add(new Pair<IGraphicalFrameworkBridge, Integer>(bridge, priority));
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
                    int priority = 0;
                    try {
                        String prioStr = element.getAttribute("priority");
                        if (prioStr != null) {
                            priority = Integer.parseInt(prioStr);
                        }
                    } catch (NumberFormatException exception) {
                        // ignore exception
                    }
                    insertBridge(bridge, priority);
                } catch (CoreException exception) {
                    StatusManager.getManager().handle(exception, CoreUIPlugin.PLUGIN_ID);
                }
            }
        }
    }

    /**
     * Retrieve the first suitable graphical editing framework bridge for the given object.
     * 
     * @param object
     *            an edit part, editor part, or notational object
     * @return the first suitable bridge
     * @throws KielerNotSupportedException
     *             if there is no bridge available for the given object
     */
    public IGraphicalFrameworkBridge getBridge(final Object object)
            throws KielerNotSupportedException {
        for (Pair<IGraphicalFrameworkBridge, Integer> entry : bridgeList) {
            if (entry.getFirst().supports(object)) {
                return entry.getFirst();
            }
        }
        throw new KielerNotSupportedException("GraphicalFrameworkBridge",
                "No bridge available for the given input.", object);
    }

}
