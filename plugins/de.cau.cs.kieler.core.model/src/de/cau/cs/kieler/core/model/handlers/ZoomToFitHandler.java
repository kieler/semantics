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
package de.cau.cs.kieler.core.model.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.draw2d.FreeformFigure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;

import de.cau.cs.kieler.core.model.GraphicalFrameworkService;
import de.cau.cs.kieler.core.model.IGraphicalFrameworkBridge;

/**
 * A handler used to zoom the diagram to fit.
 * 
 * @author haf
 * @kieler.ignore We'd like to get rid of this.
 */
public class ZoomToFitHandler extends AbstractHandler {

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        IEditorPart editor = HandlerUtil.getActiveEditor(event);
        zoomToFitAllNodes(editor);
        resetViewLocation(editor);
        return null;
    }

    /**
     * Zoom-to-fit the diagram in the given editor. This considers only nodes
     * and no edges. The problem with edges is that zooming fails in case of
     * collapsed compartments that contain edges.
     * 
     * @param editor
     *            the editor to zoom
     */
    public static void zoomToFitAllNodes(final IEditorPart editor) {
        IGraphicalFrameworkBridge bridge = GraphicalFrameworkService.getInstance().getBridge(editor);
        if (bridge != null) {
            EditPart diagramEditPart = bridge.getEditPart(editor);
            ZoomManager zoomManager = bridge.getZoomManager(diagramEditPart);

            if (diagramEditPart instanceof GraphicalEditPart) {
                IFigure diagramFigure = ((GraphicalEditPart) diagramEditPart).getFigure();
                double zoomFactor = getZoomLevel(zoomManager, diagramFigure);
                if (zoomFactor > 0) {
                    zoomManager.setZoom(zoomFactor);
                } else {
                    // fallback if zoom was not calculated correctly
                    zoomManager.setZoomAsText(ZoomManager.FIT_ALL);
                }
            }
        }
    }

    /**
     * Reset the scrolling of the editor to the upper left corner.
     * 
     * @param editor the current editor
     */
    public static void resetViewLocation(final IEditorPart editor) {
        IGraphicalFrameworkBridge bridge = GraphicalFrameworkService.getInstance().getBridge(editor);
        if (bridge != null) {
            EditPart diagramEditPart = bridge.getEditPart(editor);
            ZoomManager zoomManager = bridge.getZoomManager(diagramEditPart);
            Viewport viewport = zoomManager.getViewport();
            //viewport.getUpdateManager().performUpdate();
            viewport.setViewLocation(viewport.getHorizontalRangeModel().getMinimum(), viewport
                    .getVerticalRangeModel().getMinimum());
        }
    }

    /**
     * Calculate the correct zoomlevel to zoom-to-fit. Mainly taken from
     * 
     * <pre>
     * org.eclipse.gef.editparts.ZoomManager
     * </pre>
     * 
     * but added the parameters to pass it the figure to which to zoom to fit.
     * 
     * @param manager
     *            the current ZoomManager
     * @param desiredZoomTarget
     *            the target figure that should be zoomed to fit to
     * @return the required zoom level
     */
    private static double getZoomLevel(final ZoomManager manager, final IFigure desiredZoomTarget) {
        // IFigure fig = manager.getScalableFigure();

        Dimension available = manager.getViewport().getClientArea().getSize();
        Dimension desired;
        if (desiredZoomTarget instanceof FreeformFigure) {
            desired = ((FreeformFigure) desiredZoomTarget).getFreeformExtent().getCopy()
                    .union(0, 0).getSize();
        } else {
            desired = desiredZoomTarget.getPreferredSize().getCopy();
        }

        desired.width -= desiredZoomTarget.getInsets().getWidth();
        desired.height -= desiredZoomTarget.getInsets().getHeight();

        IFigure tempZoomTarget = desiredZoomTarget;
        while (tempZoomTarget != manager.getViewport()) {
            available.width -= tempZoomTarget.getInsets().getWidth();
            available.height -= tempZoomTarget.getInsets().getHeight();
            tempZoomTarget = tempZoomTarget.getParent();
        }

        double scaleX = available.width /*  * manager.getZoom() */ / (double) desired.width;
        scaleX = Math.min(scaleX, manager.getMaxZoom());
        double scaleY = available.height /*  * manager.getZoom() */ / (double) desired.height;
        scaleY = Math.min(scaleY, manager.getMaxZoom());
        return Math.min(scaleX, scaleY);
    }

}
