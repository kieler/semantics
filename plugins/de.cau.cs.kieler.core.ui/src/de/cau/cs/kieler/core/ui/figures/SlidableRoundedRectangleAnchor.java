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
 * 
 *****************************************************************************/
package de.cau.cs.kieler.core.ui.figures;

import org.eclipse.gmf.runtime.draw2d.ui.geometry.LineSeg;
import org.eclipse.gmf.runtime.gef.ui.figures.SlidableAnchor;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * A slideable anchor for rounded rectangle figures.
 * 
 * @author mri
 */
public class SlidableRoundedRectangleAnchor extends SlidableAnchor {

    /**
     * The default constructor.
     */
    public SlidableRoundedRectangleAnchor() {
        super();
    }

    /**
     * Constructs a SlidableRoundedRectangleAnchor without a desired anchor
     * point.
     * 
     * @param figure
     *            the anchorable figure
     */
    public SlidableRoundedRectangleAnchor(
            final IRoundedRectangleAnchorableFigure figure) {
        super(figure);
    }

    /**
     * Constructs a SlidableRoundedRectangleAnchor.
     * 
     * @param figure
     *            the anchorable figure
     * @param p
     *            the desired anchor point
     */
    public SlidableRoundedRectangleAnchor(
            final IRoundedRectangleAnchorableFigure figure,
            final PrecisionPoint p) {
        super(figure, p);
    }

    /**
     * {@inheritDoc}
     */
    protected Rectangle getBox() {
        PrecisionRectangle rBox = new PrecisionRectangle(
                ((IRoundedRectangleAnchorableFigure) getOwner())
                        .getRoundedRectangleBounds());
        getOwner().translateToAbsolute(rBox);
        return rBox;
    }

    /**
     * {@inheritDoc}
     */
    protected PointList getIntersectionPoints(final Point ownReference,
            final Point foreignReference) {
        Rectangle rect = getBox();
        Dimension dimension = ((IRoundedRectangleAnchorableFigure) getOwner())
                .getCornerDimensions();
        return getLineIntersectionsWithRoundedRectangle(new LineSeg(
                ownReference, foreignReference), rect.x, rect.y, rect.width,
                rect.height, dimension.width, dimension.height);
    }

    /**
     * Computes the intersections of a line segment with a rounded rectangle.
     * 
     * @param line
     *            the line segment
     * @param rectX
     *            the x-coordinate of the rounded rectangle
     * @param rectY
     *            the y-coordinate of the rounded rectangle
     * @param rectW
     *            the width of the rounded rectangle
     * @param rectH
     *            the height of the rounded rectangle
     * @param arcW
     *            the arc width of the rounded rectangle
     * @param arcH
     *            the arc height of the rounded rectangle
     * @return the intersections
     */
    private PointList getLineIntersectionsWithRoundedRectangle(
            final LineSeg line, final int rectX, final int rectY,
            final int rectW, final int rectH, final int arcW, final int arcH) {

        PointList intersections = new PointList();

        PointList rect;
        PointList rectIntersections;

        // intersection with top line segment
        rect = new PointList();
        rect.addPoint(new PrecisionPoint(rectX + arcW / 2, rectY));
        rect.addPoint(new PrecisionPoint(rectX + rectW - arcW / 2, rectY));
        rectIntersections = line.getLineIntersectionsWithLineSegs(rect);
        if (rectIntersections.size() > 0) {
            intersections.addPoint(rectIntersections.getFirstPoint());
        }

        // intersection with bottom line segment
        rect = new PointList();
        rect.addPoint(new PrecisionPoint(rectX + arcW / 2, rectY + rectH));
        rect.addPoint(new PrecisionPoint(rectX + rectW - arcW / 2, rectY
                + rectH));
        rectIntersections = line.getLineIntersectionsWithLineSegs(rect);
        if (rectIntersections.size() > 0) {
            intersections.addPoint(rectIntersections.getFirstPoint());
        }

        // intersection with left line segment
        rect = new PointList();
        rect.addPoint(new PrecisionPoint(rectX, rectY + arcH / 2));
        rect.addPoint(new PrecisionPoint(rectX, rectY + rectH - arcH / 2));
        rectIntersections = line.getLineIntersectionsWithLineSegs(rect);
        if (rectIntersections.size() > 0) {
            intersections.addPoint(rectIntersections.getFirstPoint());
        }

        // intersection with right line segment
        rect = new PointList();
        rect.addPoint(new PrecisionPoint(rectX + rectW, rectY + arcH / 2));
        rect.addPoint(new PrecisionPoint(rectX + rectW, rectY + rectH - arcH
                / 2));
        rectIntersections = line.getLineIntersectionsWithLineSegs(rect);
        if (rectIntersections.size() > 0) {
            intersections.addPoint(rectIntersections.getFirstPoint());
        }

        PointList ellipseIntersections;

        // intersection with top left ellipse
        ellipseIntersections = line
                .getLineIntersectionsWithEllipse(new Rectangle(rectX, rectY,
                        arcW, arcH));
        for (int i = 0; i < ellipseIntersections.size(); ++i) {
            Point point = ellipseIntersections.getPoint(i);
            if (point.x < rectX + arcW / 2 && point.y < rectY + arcH / 2) {
                intersections.addPoint(point);
            }
        }

        // intersection with top right ellipse
        ellipseIntersections = line
                .getLineIntersectionsWithEllipse(new Rectangle(rectX + rectW
                        - arcW, rectY, arcW, arcH));
        for (int i = 0; i < ellipseIntersections.size(); ++i) {
            Point point = ellipseIntersections.getPoint(i);
            if (point.x > rectX + rectW - arcW / 2
                    && point.y < rectY + arcH / 2) {
                intersections.addPoint(point);
            }
        }

        // intersection with bottom left ellipse
        ellipseIntersections = line
                .getLineIntersectionsWithEllipse(new Rectangle(rectX, rectY
                        + rectH - arcH, arcW, arcH));
        for (int i = 0; i < ellipseIntersections.size(); ++i) {
            Point point = ellipseIntersections.getPoint(i);
            if (point.x < rectX + arcW / 2
                    && point.y > rectY + rectH - arcH / 2) {
                intersections.addPoint(point);
            }
        }

        // intersection with bottom right ellipse
        ellipseIntersections = line
                .getLineIntersectionsWithEllipse(new Rectangle(rectX + rectW
                        - arcW, rectY + rectH - arcH, arcW, arcH));
        for (int i = 0; i < ellipseIntersections.size(); ++i) {
            Point point = ellipseIntersections.getPoint(i);
            if (point.x > rectX + rectW - arcW / 2
                    && point.y > rectY + rectH - arcH / 2) {
                intersections.addPoint(point);
            }
        }

        return intersections;
    }
}
