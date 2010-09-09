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

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;

import de.cau.cs.kieler.core.ui.util.MonitoredOperation;
import de.cau.cs.kieler.kivi.core.impl.AbstractEffect;

/**
 * Draws a transient arrow from source to target edit part.
 * 
 * @author mmu
 * 
 */
public class ArrowEffect extends AbstractEffect {

    private static PointList template = new PointList();

    static {
        template.addPoint(-2, -2);
        template.addPoint(-1, 0);
        template.addPoint(-2, 2);
        template.addPoint(0, 0);
    }

    private GraphicalEditPart source;

    private GraphicalEditPart target;

    private PolylineConnection connection;

    private IFigure parent;

    /**
     * Create a new arrow effect for the given source and target edit part.
     * 
     * @param s
     *            the source edit part
     * @param t
     *            the target edit part
     */
    public ArrowEffect(final GraphicalEditPart s, final GraphicalEditPart t) {
        source = s;
        target = t;
    }

    @Override
    public void execute() {
        if (connection == null) {
            connection = new PolylineConnection();
            connection.setForegroundColor(ColorConstants.red);
            connection.setLineWidth(2);
            PolygonDecoration dec = new PolygonDecoration();
            dec.setTemplate(template);
            connection.setTargetDecoration(dec);

            Rectangle start = source.getFigure().getBounds();
            Rectangle end = target.getFigure().getBounds();

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

            connection.setStart(new Point(startX, startY));
            connection.setEnd(new Point(endX, endY));
            parent = ((GraphicalEditPart) source.getParent()).getFigure();
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

}
