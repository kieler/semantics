/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.kivi;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.render.editparts.RenderedDiagramRootEditPart;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.core.ui.util.EditorUtils;
import de.cau.cs.kieler.core.ui.util.MonitoredOperation;
import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.core.kivi.IEffect;
import de.cau.cs.kieler.core.kivi.UndoEffect;
import de.cau.cs.kieler.core.model.gmf.GmfFrameworkBridge;
import de.cau.cs.kieler.core.model.gmf.util.GmfModelingUtil;

/**
 * Draws a transient arrow from source to target edit part.
 * 
 * @author mmu
 * 
 */
public class ArrowEffect extends AbstractEffect {

    private static PointList template = new PointList();
    
    // CHECKSTYLEOFF MagicNumber

    static {
        template.addPoint(-2, -2);
        template.addPoint(-1, 0);
        template.addPoint(-2, 2);
        template.addPoint(0, 0);
    }

    private GraphicalEditPart source;

    private GraphicalEditPart target;

    private boolean useConnectionLayer;

    private PolylineConnection connection;

    private IFigure parent;

    private Color color;

    /**
     * Default constructor.
     */
    public ArrowEffect() {

    }

    /**
     * Create a new arrow effect for the given source and target EObject. Attempts to find
     * appropriate edit parts, will not do anything if either can not be found.
     * 
     * @param s
     *            the source EObject
     * @param t
     *            the target EObject
     * @param c
     *            the color to paint the arrow with
     * @param connectionLayer
     *            true if the connection layer shall be used for drawing on instead of the figure of
     *            the source's parent
     */
    public ArrowEffect(final EObject s, final EObject t, final Color c,
            final boolean connectionLayer) {
        IEditorPart editorPart = EditorUtils.getLastActiveEditor();
        if (editorPart instanceof DiagramEditor) {
            DiagramEditPart diagram = ((DiagramEditor) editorPart).getDiagramEditPart();
            source = (GraphicalEditPart) GmfFrameworkBridge.getEditPart(diagram, s);
            if (source instanceof ConnectionEditPart) {
                // attempt to find a label
                LabelEditPart potential = null;
                for (Object child : source.getChildren()) {
                    if (child instanceof LabelEditPart) {
                        if (potential == null
                                || potential.getFigure().getSize().width < ((LabelEditPart) child)
                                        .getFigure().getSize().width) {
                            potential = (LabelEditPart) child;
                        }
                    }
                }
                source = potential;
            }
            target = (GraphicalEditPart) GmfFrameworkBridge.getEditPart(diagram, t);
            if (target instanceof ConnectionEditPart) {
                // attempt to find a label
                LabelEditPart potential = null;
                for (Object child : target.getChildren()) {
                    if (child instanceof LabelEditPart) {
                        if (potential == null
                                || potential.getFigure().getSize().width < ((LabelEditPart) child)
                                        .getFigure().getSize().width) {
                            potential = (LabelEditPart) child;
                        }
                    }
                }
                target = potential;
            }
        }
        useConnectionLayer = connectionLayer;
        color = c;
    }

    /**
     * {@inheritDoc}
     * 
     * FIXME handle collapsed target states/superstates.
     */
    public void execute() {
        if (source == null || target == null) {
            return;
        }
        // TODO adapt selection of parent for connection figure to allow for more generic usage
        if (connection == null && source.getParent() instanceof GraphicalEditPart) {
            if (useConnectionLayer && source.getRoot() instanceof RenderedDiagramRootEditPart) {
                parent = ((RenderedDiagramRootEditPart) source.getRoot())
                        .getLayer(LayerConstants.CONNECTION_LAYER);
            } else {
                parent = ((GraphicalEditPart) source.getParent()).getFigure();
            }
            connection = new PolylineConnection();

            connection.setForegroundColor(color);
            connection.setLineWidth(2);
            PolygonDecoration dec = new PolygonDecoration();
            dec.setTemplate(template);
            connection.setTargetDecoration(dec);
            Pair<Point, Point> anchors = computeAnchors(source.getFigure().getBounds(), target
                    .getFigure().getBounds());
            connection.setStart(anchors.getFirst());
            connection.setEnd(anchors.getSecond());

            MonitoredOperation.runInUI(new Runnable() {
                public void run() {
                    parent.add(connection);
                }
            }, false);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void undo() {
        if (connection != null && parent != null) {
            MonitoredOperation.runInUI(new Runnable() {
                public void run() {
                    connection.getParent().remove(connection);
                    connection = null;
                    parent = null;
                }
            }, false);
        }
    }

    @Override
    public boolean isMergeable() {
        return true;
    }

    @Override
    public IEffect merge(final IEffect other) {
        if (other instanceof ArrowEffect) {
            ArrowEffect otherArrow = (ArrowEffect) other;
            if (otherArrow.source == source && otherArrow.target == target
                    && otherArrow.useConnectionLayer == useConnectionLayer) {
                return this;
            }
        } else if (other instanceof UndoEffect) {
            IEffect undo = ((UndoEffect) other).getEffect();
            if (undo instanceof ArrowEffect) {
                ArrowEffect otherArrow = (ArrowEffect) undo;
                if (otherArrow.source == source && otherArrow.target == target
                        && otherArrow.useConnectionLayer == useConnectionLayer) {
                    connection = otherArrow.connection;
                    parent = otherArrow.parent;
                    return this;
                }
            }
        }
        return null;
    }

    private static Pair<Point, Point> computeAnchors(final Rectangle start, final Rectangle end) {
        Dimension difference = start.getCenter().getDifference(end.getCenter());
        Dimension sum = start.getSize().getExpanded(end.getSize());
        int startX, startY, endX, endY;
        if (difference.width < 0) {
            // going right
            if (difference.width * -1 > sum.width) {
                // going far right, use left/right sides
                startX = start.getRight().x;
                endX = end.getLeft().x;
            } else {
                // going right a short bit only, use middle
                startX = start.getCenter().x;
                endX = end.getCenter().x;
            }
        } else {
            // going left
            if (difference.width > sum.width) {
                // going far left, use left/right sides
                startX = start.getLeft().x;
                endX = end.getRight().x;
            } else {
                // going left a short bit only, use middle
                startX = start.getCenter().x;
                endX = end.getCenter().x;
            }
        }
        if (difference.height < 0) {
            // going down
            if (difference.height * -1 > sum.height) {
                // going far down, use top/bottom sides
                startY = start.getBottom().y;
                endY = end.getTop().y;
            } else {
                // going down a short bit only, use middle
                startY = start.getCenter().y;
                endY = end.getCenter().y;
            }
        } else {
            // going up
            if (difference.height > sum.height) {
                // going far up, use top/bottom sides
                startY = start.getTop().y;
                endY = end.getBottom().y;
            } else {
                // going up a short bit only, use middle
                startY = start.getCenter().y;
                endY = end.getCenter().y;
            }
        }

        return new Pair<Point, Point>(new Point(startX, startY), new Point(endX, endY));
    }

}
