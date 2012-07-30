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
package de.cau.cs.kieler.core.model.gmf.figures;

import java.util.Hashtable;
import java.util.List;

import org.eclipse.draw2d.ArrowLocator;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.graphics.Path;

import de.cau.cs.kieler.core.model.gmf.util.SplineUtilities;

/**
 * Temporary class implementing the spline extension to polylines until the changes are merged into
 * GMF.
 * 
 * @author mmu, ckru
 */
public class SplineConnection extends PolylineConnectionEx {
    
    // CHECKSTYLEOFF MagicNumber
    
    /**
     * Mode for spline drawing.
     */
    private int splineMode = 0;
    /**
     * Remember if advanced graphics support is available, assume yes at first.
     */
    private boolean advancedGraphics = true;
    /**
     * Don't draw splines.
     */
    public static final int SPLINE_OFF = 0;
    /**
     * Draw cubic spline segments.
     */
    public static final int SPLINE_CUBIC = 1;
    /**
     * Approximate cubic spline segments.
     */
    public static final int SPLINE_CUBIC_APPROX = 2;

    /**
     * A dimension used by the isFeedbackLayer() method to check if we are on a feedback layer.
     */
    private static final Dimension DIMCHECK = new Dimension(100, 100);

    /**
     * Tolerance value for distance cursor-line.
     */
    private static final int TOLERANCE = 3;

    /**
     * Shape of line bounds.
     */
    private static final Rectangle LINEBOUNDS = Rectangle.SINGLETON;

    /**
     * Temporary preference key.
     */
    public static final String PREF_SPLINE_MODE = "Connectors.splineMode"; //$NON-NLS-1$

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx#containsPoint (int, int)
     */
    @Override
    public boolean containsPoint(final int x, final int y) {
        boolean isFeedbackLayer = isFeedbackLayer();
        int calculatedTolerance = calculateTolerance(isFeedbackLayer);

        LINEBOUNDS.setBounds(getBounds());
        LINEBOUNDS.expand(calculatedTolerance, calculatedTolerance);
        if (!LINEBOUNDS.contains(x, y)) {
            return false;
        }

        if (getSplineMode() == SPLINE_CUBIC) {
            PointList points = getPoints();
            int i = 1;
            for (; i < getPoints().size() - 2; i += 3) {
                // check individual spline bounds
                Point start = points.getPoint(i - 1);
                Point c1 = points.getPoint(i);
                Point c2 = points.getPoint(i + 1);
                Point end = points.getPoint(i + 2);
                Rectangle splineBound = new Rectangle(start, end);
                splineBound = splineBound.getUnion(new Rectangle(c1, c2));
                splineBound.expand(calculatedTolerance, calculatedTolerance);
                if (splineBound.contains(x, y)
                        && SplineUtilities.distanceFromSpline(start, c1, c2, end, new Point(x, y))
                        < calculatedTolerance) {
                    return true;
                }
            }

            if (i == getPoints().size() - 2) {
                // quad left
                if (SplineUtilities.distanceFromSpline(
                        getPoints().getPoint(getPoints().size() - 3),
                        getPoints().getPoint(getPoints().size() - 2),
                        getPoints().getPoint(getPoints().size() - 1), new Point(x, y))
                        < calculatedTolerance) {
                    return true;
                }
            } else if (i == getPoints().size() - 1) {
                // line left
                if (lineContainsPoint(getPoints().getPoint(i - 1).x, getPoints().getPoint(i - 1).y,
                        getPoints().getPoint(i).x, getPoints().getPoint(i).y, x, y, isFeedbackLayer)) {
                    return true;
                }
            }
        } else if (getSplineMode() == SPLINE_CUBIC_APPROX) {
            int[] ints = SplineUtilities.approximateSpline(getPoints()).toIntArray();
            for (int index = 0; index < ints.length - 3; index++) {
                if (lineContainsPoint(ints[index++], ints[index], ints[index + 1], ints[index + 2],
                        x, y, isFeedbackLayer)) {
                    return true;
                }
            }
        }

        return super.containsPoint(x, y);
    }

    /**
     * This method checks if we are on a feedback layer by comparing the value of a Dimension with
     * the value after translating it into relative coordinates.
     * 
     * Copied from PolylineConnectionEx because it is private there but required for
     * containsPoint().
     * 
     * @return true if we are on a feedback layer, which means the results after translating were
     *         the same as not translating, or false if we are not on a feedback layer.
     */
    protected boolean isFeedbackLayer() {
        Dimension copied = DIMCHECK.getCopy();
        translateToRelative(copied);
        return DIMCHECK.equals(copied);
    }

    /**
     * Checks if edge corners should be rounded. Same as super method, except it doesn't check if
     * edge routing is orthogonal.
     * 
     * @return {@code true} if edge corners should be rounded.
     */
    @Override
    public boolean isRoundingBendpoints() {
        if (super.getRoundedBendpointsRadius() > 0 && getSmoothness() == 0) {
            return true;
        }
        return false;
    }

    /**
     * Calculate and store the tolerance value for determining whether the line contains a point or
     * not.
     * 
     * Copied from PolylineConnectionEx because it is private there but required for
     * containsPoint().
     * 
     * @param isFeedbackLayer
     *            see the isFeedbackLayer() method
     * @return tolerance value
     */
    protected int calculateTolerance(final boolean isFeedbackLayer) {
        Dimension absTol = new Dimension(TOLERANCE, 0);

        if (!isFeedbackLayer) {
            MapModeUtil.getMapMode(this).DPtoLP(absTol);
        }

        return absTol.width + getLineWidth() / 2;
    }

    /**
     * Checks whether a point is near a line or not.
     * 
     * @param x1
     *            line start
     * @param y1
     *            line start
     * @param x2
     *            line end
     * @param y2
     *            line end
     * @param px
     *            point
     * @param py
     *            point
     * @param isFeedbackLayer
     *            whether we're on a feedback layer or not
     * @return true if (px,py) is near the line
     */
    protected boolean lineContainsPoint(final int x1, final int y1, final int x2, final int y2,
            final int px, final int py, final boolean isFeedbackLayer) {
        LINEBOUNDS.setSize(0, 0);
        LINEBOUNDS.setLocation(x1, y1);
        LINEBOUNDS.union(x2, y2);
        int calculatedTolerance = calculateTolerance(isFeedbackLayer);
        LINEBOUNDS.expand(calculatedTolerance, calculatedTolerance);
        if (!LINEBOUNDS.contains(px, py)) {
            return false;
        }

        double v1x, v1y, v2x, v2y;
        double numerator, denominator;
        double result = 0;

        if (x1 != x2 && y1 != y2) {
            v1x = (double) x2 - x1;
            v1y = (double) y2 - y1;
            v2x = (double) px - x1;
            v2y = (double) py - y1;

            numerator = v2x * v1y - v1x * v2y;

            denominator = v1x * v1x + v1y * v1y;

            result = numerator * numerator / denominator;
        }

        // if it is the same point, and it passes the bounding box test,
        // the result is always true.
        return result <= calculatedTolerance * calculatedTolerance;
    }

    /**
     * Set spline mode for this connection.
     * 
     * @param mode
     *            spline mode
     */
    public void setSplineMode(final int mode) {
        splineMode = mode;
        refreshLine();
    }

    /**
     * Gets the spline mode for this connection. Fall back to approximation if smooth splines are
     * selected but no advanced graphics support is available
     * 
     * @return spline mode
     */
    public int getSplineMode() {
        if (splineMode == SPLINE_CUBIC && !advancedGraphics) {
            // fall back to approximation
            return SPLINE_CUBIC_APPROX;
        } else {
            return splineMode;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx#outlineShape
     * (org.eclipse.draw2d.Graphics)
     */
    @Override
    public void outlineShape(final Graphics g) {
        if (this.joinPointDecoration != null) {
            this.drawJoinPointDecoration();
        }
        if (getSplineMode() == SPLINE_CUBIC) {
            try {
                PointList points = getPoints();
                int size = points.size();
                if (size < 1) {
                    return; // nothing to do
                }
                Path p = new Path(null);
                p.moveTo(points.getFirstPoint().x, points.getFirstPoint().y);

                // draw cubic sections
                int pI = 1;
                for (; pI < size - 2; pI += 3) {
                    p.cubicTo(points.getPoint(pI).x, points.getPoint(pI).y,
                            points.getPoint(pI + 1).x, points.getPoint(pI + 1).y,
                            points.getPoint(pI + 2).x, points.getPoint(pI + 2).y);
                }

                // draw remaining sections, won't happen if DOT was applied
                // size-1: one straight line
                // size-2: one quadratic
                switch (size - pI) {
                case 1:
                    p.lineTo(points.getPoint(pI).x, points.getPoint(pI).y);
                    break;
                case 2:
                    p.quadTo(points.getPoint(pI).x, points.getPoint(pI).y,
                            points.getPoint(pI + 1).x, points.getPoint(pI + 1).y);
                    break;
                }

                g.drawPath(p);
                p.dispose();
            } catch (SWTException e) {
                // Exception due to no advanced graphics?
                if (e.code == SWT.ERROR_NO_GRAPHICS_LIBRARY) {
                    advancedGraphics = false;
                }
                g.drawPolyline(SplineUtilities.approximateSpline(getPoints()));
            }
        } else if (getSplineMode() == SPLINE_CUBIC_APPROX) {
            g.drawPolyline(SplineUtilities.approximateSpline(getPoints()));
        } else if (isRoundingBendpoints()) {
            /*
             * if (!this.canRoundBendpoints(this.getPoints())) { int origBendpointRadius =
             * this.getRoundedBendpointsRadius(); this.setRoundedBendpointsRadius(0);
             * super.outlineShape(g); this.setRoundedBendpointsRadius(origBendpointRadius); } else {
             */
            int radius = this.getRoundedBendpointsRadius();
            // TODO Auto-generated method stub
            // super.outlineShape(g);

            PointList originalPoints = getPoints();
            PointList newPoints = new PointList();
            newPoints.addPoint(originalPoints.getFirstPoint());
            for (int i = 1; i < originalPoints.size() - 1; i++) {
                Point refPoint = originalPoints.getPoint(i);
                Point prevPoint = originalPoints.getPoint(i - 1);
                Point nextPoint = originalPoints.getPoint(i + 1);

                int lengPrevious = Math.max(Math.abs(refPoint.x - prevPoint.x),
                        Math.abs(refPoint.y - prevPoint.y));
                int lengNext = Math.max(Math.abs(refPoint.x - nextPoint.x),
                        Math.abs(refPoint.y - nextPoint.y));
                // The bend radius is reduced to 6 from 10
                int r = Math.min(Math.min(lengPrevious / 2, lengNext / 2), radius);

                int dxPrev = r * sign(prevPoint.x - refPoint.x);
                int dyPrev = r * sign(prevPoint.y - refPoint.y);
                int dxNext = r * sign(nextPoint.x - refPoint.x);
                int dyNext = r * sign(nextPoint.y - refPoint.y);

                Point prevLineEnd = new Point(refPoint.x + dxPrev, refPoint.y + dyPrev);
                newPoints.addPoint(prevLineEnd);
                Point nextLineStart = new Point(refPoint.x + dxNext, refPoint.y + dyNext);

                if (r < 3) { // too small radius
                    g.drawLine(prevLineEnd, nextLineStart);
                } else {
                    int arcCenterX = refPoint.x + dxNext + dxPrev;
                    int arcCenterY = refPoint.y + dyNext + dyPrev;

                    // Step reduced to .05 from .2
                    double step = Math.min(Math.max(Math.PI / r, 0.08), 0.05);
                    Point arcPoint = null;
                    for (double rad = 0.0; rad <= Math.PI / 2; rad += step) {
                        Point newArcPoint = new Point(arcCenterX
                                - (int) Math.round(r * Math.cos(rad)) * sign(dxNext + dxPrev),
                                arcCenterY - (int) Math.round(r * Math.sin(rad))
                                        * sign(dyNext + dyPrev));
                        if (arcPoint != null) {
                            g.drawLine(arcPoint, newArcPoint);
                        } else {
                            g.drawLine(newArcPoint,
                                    (newArcPoint.getDistance(prevLineEnd) < newArcPoint
                                            .getDistance(nextLineStart)) ? prevLineEnd
                                            : nextLineStart);
                        }
                        arcPoint = newArcPoint;
                    }
                    g.drawLine(arcPoint, (arcPoint.getDistance(prevLineEnd) < arcPoint
                            .getDistance(nextLineStart)) ? prevLineEnd : nextLineStart);
                }
                newPoints.addPoint(nextLineStart);
            }
            newPoints.addPoint(originalPoints.getLastPoint());
            for (int i = 0; i < newPoints.size(); i += 2) {
                g.drawLine(newPoints.getPoint(i), newPoints.getPoint(i + 1));
            }

            // }
        } else {
            super.outlineShape(g);
        }
    }

    private int sign(final int test) {
        if (test > 0) {
            return 1;
        }
        if (test < 0) {
            return -1;
        }
        return 0;
    }

    /**
     * Method to determine whether the connection meets all requirements to do rounded bendpoints or
     * not. Requirements are: - connection is othogonal - connection has no small bends
     * 
     * FIXME this isn't used anymore
     * 
     * @param bendpoints
     *            the bendpoints of the connection to check
     * @return true if connection meets requirements
     */
    @SuppressWarnings("unused")
    private boolean canRoundBendpoints(final PointList bendpoints) {
        boolean canRound = true;
        boolean horizontal;
        Point a = bendpoints.getPoint(0);
        Point b = bendpoints.getPoint(1);

        if (a.x == b.x) {
            horizontal = false;
        } else if (a.y == b.y) {
            horizontal = true;
        } else {
            return false;
        }

        for (int i = 1; i < (bendpoints.size() - 1); i++) {
            a = bendpoints.getPoint(i);
            b = bendpoints.getPoint(i + 1);
            if (horizontal) {
                if ((i % 2) == 1) {
                    if ((a.x != b.x) || (Math.abs(a.y - b.y) < 4)) {
                        canRound = false;
                        break;
                    }
                } else {
                    if ((a.y != b.y) || (Math.abs(a.x - b.x) < 4)) {
                        canRound = false;
                        break;
                    }
                }
            } else {
                if ((i % 2) == 1) {
                    if ((a.y != b.y) || (Math.abs(a.x - b.x) < 4)) {
                        canRound = false;
                        break;
                    }
                } else {
                    if ((a.x != b.x) || (Math.abs(a.y - b.y) < 4)) {
                        canRound = false;
                        break;
                    }
                }
            }
        }
        return canRound;
    }

    // /////////////////////////////////////////////////////
    // ///////////Temporary gmf bugfix//////////////////////
    // https://bugs.eclipse.org/bugs/show_bug.cgi?id=345886
    // /////////////////////////////////////////////////////
    private Hashtable<Integer, Integer> rForBendpointArc;

    @Override
    public PointList getRoundedCornersPoints(final boolean calculateAppoxPoints) {
        if (rForBendpointArc != null) {
            rForBendpointArc.clear();
        } else {
            rForBendpointArc = new Hashtable<Integer, Integer>();
        }
        return SplineUtilities.calcRoundedCornersPolyline(getPoints(),
                getRoundedBendpointsRadius(), rForBendpointArc, calculateAppoxPoints);
    }

    // bugfix end

    private IFigure joinPointDecoration = null;

    /**
     * Get the current join point decoration. If it is null the mechanism is deactivated.
     * 
     * @return the join point decoration or null
     */
    public IFigure getJoinPointDecoration() {
        return joinPointDecoration;
    }

    /**
     * Set a join point decoration. Set it to null to not draw join points.
     * 
     * @param dec
     *            the new join point decoration
     */
    public void setJoinPointDecoration(final IFigure dec) {
        if (joinPointDecoration != null) {
            if (this.getChildren().contains(joinPointDecoration)) {
                this.remove(joinPointDecoration);
            }
            joinPointDecoration = null;
        }
        joinPointDecoration = dec;
    }

    /**
     * Check if we have to draw those JoinPoints and calculate their location.
     */
    private void drawJoinPointDecoration() {
        IFigure parent = this.getParent();
        @SuppressWarnings("unchecked")
        List<IFigure> children = parent.getChildren();
        // compare yourself with all the other connections
        for (IFigure child : children) {
            if ((child instanceof SplineConnection) && (this != child)) {
                SplineConnection connection = (SplineConnection) child;
                Point joinPoint = null;
                // if there are two consecutive points that are intersections assume this is
                // one of those joins we want to draw that starts with the first one
                for (int i = 0; i < (this.getPoints().size() - 1); i++) {
                    Point pointA = this.getPoints().getPoint(i);
                    if (connection.getPoints().polygonContainsPoint(pointA.x, pointA.y)) {
                        Point pointB = this.getPoints().getPoint(i + 1);
                        if (connection.getPoints().polygonContainsPoint(pointB.x, pointB.y)) {
                            // if connections have same source take the latter point
                            if (this.getPoints().getFirstPoint()
                                    .equals(connection.getPoints().getFirstPoint())) {
                                joinPoint = pointB;
                                // if connections have same target take the first point
                            } else if (this.getPoints().getLastPoint()
                                    .equals(connection.getPoints().getLastPoint())) {
                                joinPoint = pointA;
                            } else {
                                // the connections have neither the same target nor source so don't
                                // draw joinpoint for them
                                joinPoint = null;
                            }
                        }
                    }
                }
                // if this is null there is no join so don't draw anything
                if (joinPoint != null) {
                    // if decoration exists and location hasn't changed stop here
                    // otherwise it would end in an infinite loop
                    if ((this.getChildren().contains(joinPointDecoration))
                            && (joinPointDecoration.getBounds().getLocation().equals(joinPoint))) {
                        return;
                    }
                    // offset so that the center of the figure is at the joinpoint.
                    int yOffset = joinPointDecoration.getBounds().height / 2;
                    int xOffset = joinPointDecoration.getBounds().width / 2;
                    joinPointDecoration.getBounds().setLocation(
                            new Point(joinPoint.x - xOffset, joinPoint.y - yOffset));
                    this.add(joinPointDecoration);
                    return;
                }
            }
        }

        // if no joins are found for any other connection stop drawing this joinpoin
        if (this.getChildren().contains(joinPointDecoration)) {
            this.remove(joinPointDecoration);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.draw2d.PolylineConnection#setTargetDecoration(org.eclipse
     * .draw2d.RotatableDecoration)
     */
    @Override
    public void setTargetDecoration(final RotatableDecoration dec) {
        super.setTargetDecoration(dec, new ArrowLocatorEx(this, ConnectionLocator.TARGET));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.draw2d.PolylineConnection#setSourceDecoration(org.eclipse
     * .draw2d.RotatableDecoration)
     */
    @Override
    public void setSourceDecoration(final RotatableDecoration dec) {
        super.setSourceDecoration(dec, new ArrowLocatorEx(this, ConnectionLocator.SOURCE));
    }

    /**
     * This method will bring the connection to the front of the ConnectionLayer.
     */
    //Can't help bad usage of generics in code that is not mine.
    @SuppressWarnings("unchecked")
    public void bringToFront() {
        ConnectionLayer layer = this.getConnectionLayer(this);
        if (layer != null) {
            layer.getChildren().remove(this);
            layer.getChildren().add(this);
        }
    }
    
    /**
     * Method to get the ConnectionLayer the given Connection belongs to.
     * @param c The connection whose ConnectionLayer to get.
     * @return The ConnectionLayer of the given Connection. Might be null if connection
     *          is not yet added to the ConnectionLayer.
     */
    private ConnectionLayer getConnectionLayer(final Connection c) {
        if (c.getParent() == null) {
            return null;
        }
        if (c.getParent() instanceof ConnectionLayer) {
            return (ConnectionLayer) c.getParent();
        } else {
            return getConnectionLayer((Connection) c.getParent());
        }
    }
    
    /**
     * An extension of the ArrowLocator that is capable of using spline points as references.
     * 
     * @author mmu
     * 
     */
    public static class ArrowLocatorEx extends ArrowLocator {

        /**
         * 
         * @param connection
         *            the connection
         * @param location
         *            source or target
         */
        public ArrowLocatorEx(final Connection connection, final int location) {
            super(connection, location);
        }

        /**
         * Relocates the passed in figure (which must be a {@link RotatableDecoration}) at either
         * the start or end of the connection.
         * 
         * If the connection is a SplineConnection with spline mode enabled the angle is computed
         * from the spline itself, not from the draggable points.
         * 
         * @param target
         *            The RotatableDecoration to relocate
         */
        public void relocate(final IFigure target) {
            PointList points = getConnection().getPoints();
            RotatableDecoration arrow = (RotatableDecoration) target;
            arrow.setLocation(getLocation(points));

            if (getConnection() instanceof SplineConnection) {
                SplineConnection spline = (SplineConnection) getConnection();
                if (spline.getSplineMode() == SplineConnection.SPLINE_CUBIC) {
                    // int size = (arrow.getBounds().height + arrow.getBounds().width) / 2;
                    // this caused the wobbling arrowheads
                    // FIXME find a better mechanism of determining the size of an arrowhead
                    int size = 10;
                    if (getAlignment() == SOURCE) {
                        arrow.setReferencePoint(SplineUtilities.sourceReferencePoint(points, size));
                    } else if (getAlignment() == TARGET) {
                        arrow.setReferencePoint(SplineUtilities.targetReferencePoint(points, size));
                    }
                } else if (spline.getSplineMode() == SplineConnection.SPLINE_CUBIC_APPROX) {
                    points = SplineUtilities.approximateSpline(points);
                    if (getAlignment() == SOURCE) {
                        arrow.setReferencePoint(points.getPoint(1));
                    } else if (getAlignment() == TARGET) {
                        arrow.setReferencePoint(points.getPoint(points.size() - 2));
                    }
                } else {
                    if (getAlignment() == SOURCE) {
                        arrow.setReferencePoint(points.getPoint(1));
                    } else if (getAlignment() == TARGET) {
                        arrow.setReferencePoint(points.getPoint(points.size() - 2));
                    }
                }
            } else {
                if (getAlignment() == SOURCE) {
                    arrow.setReferencePoint(points.getPoint(1));
                } else if (getAlignment() == TARGET) {
                    arrow.setReferencePoint(points.getPoint(points.size() - 2));
                }
            }
        }
    }
}
