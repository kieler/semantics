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
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.core.kivi.IEffect;
import de.cau.cs.kieler.core.kivi.UndoEffect;
import de.cau.cs.kieler.core.model.gmf.GmfFrameworkBridge;
import de.cau.cs.kieler.core.model.gmf.util.GmfModelingUtil;
import de.cau.cs.kieler.core.ui.util.EditorUtils;
import de.cau.cs.kieler.core.util.Pair;

/**
 * Draws a transient arrow pointing to some target edit part. This pointer only requires one target
 * (and no source). The pointer will either point towards the target or away from it. It can be
 * configured such that the pointer will be located on either side of the pointed object.
 * 
 * Much code is copied from the {@link ArrowEffect}.
 * 
 * @author haf
 * 
 */
public class PointerEffect extends AbstractEffect {

    /**
     * A direction or side relative to some object, e.g. a rectangle. NORTHEAST is the top right
     * while EASTNORTH is the right side at the top.
     */
    enum Direction {
        NORTH, NORTHEAST, NORTHWEST, SOUTH, SOUTHEAST, SOUTHWEST, 
        WEST, WESTNORTH, WESTSOUTH, EAST, EASTSOUTH, EASTNORTH
    };

    private static final int DEFAULT_LENGTH = 10;

    private static PointList template = new PointList();
    
    // CHECKSTYLEOFF MagicNumber

    static {
        template.addPoint(-2, -2);
        template.addPoint(-1, 0);
        template.addPoint(-2, 2);
        template.addPoint(0, 0);
    }

    private GraphicalEditPart target;

    private boolean useConnectionLayer;

    private PolylineConnection connection;

    private IFigure parent;

    private Color color;

    private Direction direction;

    private boolean isTarget = true;

    private int length = DEFAULT_LENGTH;

    /**
     * Default constructor.
     */
    public PointerEffect() {

    }

    /**
     * Create a new pointer (arrow with no concrete source) effect for the given target EObject. 
     * Attempts to find appropriate edit parts, will not do anything if target can not be found.
     * 
     * @param theTarget
     *            the target EObject
     * @param theColor
     *            the color to paint the arrow with
     * @param theLength
     *            the length of the pointing arrow
     * @param isTowards
     *            true iff the arrow should point towards the target, false if it should point away
     *            from the target
     * @param theDirection
     *            determines the side where the pointer will be located, e.g. on center top (NORTH)
     *            or center right (NORTHEAST)
     * @param connectionLayer
     *            true if the connection layer shall be used for drawing on instead of the figure of
     *            the source's parent
     */
    public PointerEffect(final EObject theTarget, final Color theColor, final int theLength,
            final boolean isTowards, final Direction theDirection, final boolean connectionLayer) {
        IEditorPart editorPart = EditorUtils.getLastActiveEditor();
        if (editorPart instanceof DiagramEditor) {
            DiagramEditPart diagram = ((DiagramEditor) editorPart).getDiagramEditPart();
            target = (GraphicalEditPart) GmfFrameworkBridge.getEditPart(diagram, theTarget);
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
        color = theColor;
        isTarget = isTowards;
        direction = theDirection;
        length = theLength;
    }

    /**
     * {@inheritDoc}
     */
    public void execute() {
        if (target == null) {
            return;
        }
        // TODO adapt selection of parent for connection figure to allow for more generic usage
        if (connection == null && target.getParent() instanceof GraphicalEditPart) {
            if (useConnectionLayer && target.getRoot() instanceof RenderedDiagramRootEditPart) {
                parent = ((RenderedDiagramRootEditPart) target.getRoot())
                        .getLayer(LayerConstants.CONNECTION_LAYER);
            } else {
                parent = ((GraphicalEditPart) target.getParent()).getFigure();
            }
            connection = new PolylineConnection();

            connection.setForegroundColor(color);
            connection.setLineWidth(2);
            PolygonDecoration dec = new PolygonDecoration();
            dec.setTemplate(template);
            connection.setTargetDecoration(dec);
            Pair<Point, Point> anchors = computeAnchors(target.getFigure().getBounds());
            connection.setStart(anchors.getFirst());
            connection.setEnd(anchors.getSecond());

            PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
                public void run() {
                    parent.add(connection);
                }
            });
        }
    }

    /**
     * {@inheritDoc}
     */
    public void undo() {
        if (connection != null && parent != null) {
            PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
                public void run() {
                    connection.getParent().remove(connection);
                    connection = null;
                    parent = null;
                }
            });
        }
    }

    @Override
    public boolean isMergeable() {
        return true;
    }

    @Override
    public IEffect merge(final IEffect other) {
        if (other instanceof PointerEffect) {
            PointerEffect otherArrow = (PointerEffect) other;
            if (otherArrow.target == target && otherArrow.isTarget == this.isTarget
                    && otherArrow.useConnectionLayer == useConnectionLayer) {
                return this;
            }
        } else if (other instanceof UndoEffect) {
            IEffect undo = ((UndoEffect) other).getEffect();
            if (undo instanceof PointerEffect) {
                PointerEffect otherArrow = (PointerEffect) undo;
                if (otherArrow.target == target && otherArrow.isTarget == this.isTarget
                        && otherArrow.useConnectionLayer == useConnectionLayer) {
                    connection = otherArrow.connection;
                    parent = otherArrow.parent;
                    return this;
                }
            }
        }
        return null;
    }

    private Pair<Point, Point> computeAnchors(final Rectangle reference) {
        Point start;
        Point end;
        switch (direction) {
        case NORTH:
            end = reference.getTop();
            start = new Point(reference.getTop().x, reference.getTop().y - length);
            break;
        case NORTHEAST:
            end = reference.getTopRight();
            start = new Point(reference.getTopRight().x, reference.getTopRight().y - length);
            break;
        case NORTHWEST:
            end = reference.getTopLeft();
            start = new Point(reference.getTopLeft().x, reference.getTopLeft().y - length);
            break;
        case SOUTH:
            end = reference.getBottom();
            start = new Point(reference.getBottom().x, reference.getBottom().y + length);
            break;
        case SOUTHEAST:
            end = reference.getBottomRight();
            start = new Point(reference.getBottomRight().x, reference.getBottomRight().y + length);
            break;
        case SOUTHWEST:
            end = reference.getBottomLeft();
            start = new Point(reference.getBottomLeft().x, reference.getBottomLeft().y + length);
            break;
        case WEST:
            end = reference.getLeft();
            start = new Point(reference.getLeft().x - length, reference.getLeft().y);
            break;
        case WESTNORTH:
            end = reference.getTopLeft();
            start = new Point(reference.getTopLeft().x - length, reference.getTopLeft().y);
            break;
        case WESTSOUTH:
            end = reference.getBottomLeft();
            start = new Point(reference.getBottomLeft().x - length, reference.getBottomLeft().y);
            break;
        case EAST:
            end = reference.getRight();
            start = new Point(reference.getRight().x + length, reference.getRight().y);
            break;
        case EASTNORTH:
            end = reference.getTopRight();
            start = new Point(reference.getTopRight().x + length, reference.getTopRight().y);
            break;
        default:
            end = reference.getBottomRight();
            start = new Point(reference.getBottomRight().x + length, reference.getBottomRight().y);
            break;
        }
        if (isTarget) {
            return new Pair<Point, Point>(start, end);
        } else {
            return new Pair<Point, Point>(end, start);
        }
    }
}
