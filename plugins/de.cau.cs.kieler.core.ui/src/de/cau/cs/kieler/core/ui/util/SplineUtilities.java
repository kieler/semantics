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
package de.cau.cs.kieler.core.ui.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.gmf.runtime.draw2d.ui.geometry.LineSeg;

import de.cau.cs.kieler.core.util.KielerMath;

/**
 * Helper methods for handling splines.
 * 
 * @author mmu
 * 
 */
public final class SplineUtilities {

    /**
     * Experimental value to determine the number of bend points for
     * approximation based on the estimated bendiness of the spline.
     */
    private static final int BEND_POINT_FACTOR = 20;

    /**
     * Minimum number of bend points for approximation: start and end points,
     * two bend points.
     */
    private static final int BEND_POINT_MINIMUM = 4;
    
    /**
     * Maximum number of bend points for approximation.
     */
    private static final int BEND_POINT_MAXIMUM = 25;

    private SplineUtilities() {

    }

    /**
     * Approximates a spline based on the control list.
     * 
     * @param control
     *            list of control points
     * @return approximated bend points
     */
    public static PointList approximateSpline(final PointList control) {
        PointList points = new PointList();
        points.addPoint(control.getFirstPoint());
        int i = 1;
        // CHECKSTYLEOFF MagicNumber
        // code needs lots of 3s and 4s for splines consisting of 3/4 points
        for (; i < control.size() - 2; i += 3) {
            List<KielerMath.Point> spline = new ArrayList<KielerMath.Point>(4);
            spline.add(new KielerMath.Point(control.getPoint(i - 1).x, control.getPoint(i - 1).y));
            spline.add(new KielerMath.Point(control.getPoint(i).x, control.getPoint(i).y));
            spline.add(new KielerMath.Point(control.getPoint(i + 1).x, control.getPoint(i + 1).y));
            spline.add(new KielerMath.Point(control.getPoint(i + 2).x, control.getPoint(i + 2).y));
            for (KielerMath.Point p : KielerMath.calcBezierPoints(spline, approxCount(spline))) {
                points.addPoint(new Point(p.x, p.y));
            }
        }
        switch (control.size() - i) {
        case 1:
            points.addPoint(control.getPoint(i));
            break;
        case 2:
            List<KielerMath.Point> spline = new ArrayList<KielerMath.Point>(3);
            spline.add(new KielerMath.Point(control.getPoint(i - 1).x, control.getPoint(i - 1).y));
            spline.add(new KielerMath.Point(control.getPoint(i).x, control.getPoint(i).y));
            spline.add(new KielerMath.Point(control.getPoint(i + 1).x, control.getPoint(i + 1).y));
            for (KielerMath.Point p : KielerMath.calcBezierPoints(spline, approxCount(spline))) {
                points.addPoint(new Point(p.x, p.y));
            }
            break;
        default: // nothing
        }
        // CHECKSTYLEON MagicNumber
        return points;
    }

    /**
     * Calculate number of approximation points for given spline. The more bendy
     * the spline, the more points to be used.
     * 
     * @param spline
     * @return
     */
    private static int approxCount(final List<KielerMath.Point> spline) {
        int count = BEND_POINT_MINIMUM;
        long distance = 0;
        KielerMath.Point start = spline.get(0);
        KielerMath.Point end = spline.get(spline.size() - 1);
        LineSeg line = new LineSeg(new Point(start.x, start.y), new Point(end.x, end.y));
        for (int i = 1; i < spline.size() - 1; i++) {
            KielerMath.Point k = spline.get(i);
            distance += line.distanceToPoint((int) k.x, (int) k.y);
        }
        System.out.println(distance);
        count += distance / BEND_POINT_FACTOR;
        if (count < BEND_POINT_MAXIMUM) {
            return count;
        } else {
            return BEND_POINT_MAXIMUM;
        }
    }

    /**
     * Calculate reference Point for source RotatableDecoration.
     * 
     * @param points
     *            line segment
     * @param distance
     *            distance from source
     * @return reference point
     */
    public static Point sourcePoint(final PointList points, final int distance) {
        // CHECKSTYLEOFF MagicNumber
        if (points.size() < 3) { // line
            return points.getLastPoint();
        }

        // calculate a Point on the first line segment at the given distance
        Point p1 = points.getPoint(0);
        Point p2 = points.getPoint(1);
        double scale = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2)) / distance;
        Point scaledPoint = new Point(p1.x + (p2.x - p1.x) / scale, p1.y + (p2.y - p1.y) / scale);

        // get first spline segment
        Point splinePoint = new Point();
        if (points.size() > 3) { // cubic section
            SplineUtilities.nearestPointOnSpline(points.getPoint(0), points.getPoint(1), points
                    .getPoint(2), points.getPoint(3), scaledPoint, splinePoint);
        } else { // quad section
            SplineUtilities.nearestPointOnSpline(points.getPoint(0), points.getPoint(1), points
                    .getPoint(2), scaledPoint, splinePoint);
        }
        // CHECKSTYLEON MagicNumber
        return splinePoint;

    }

    /**
     * Calculate reference Point for target RotatableDecoration.
     * 
     * @param points
     *            line segment
     * @param distance
     *            distance from target
     * @return reference point
     */
    public static Point targetPoint(final PointList points, final int distance) {
        // CHECKSTYLEOFF MagicNumber
        if (points.size() < 3) {
            return points.getFirstPoint();
        }

        // calculate a Point on the last line segment at the given distance
        Point p1 = points.getPoint(points.size() - 1);
        Point p2 = points.getPoint(points.size() - 2);
        double scale = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2)) / distance;
        Point scaledPoint = new Point(p1.x + (p2.x - p1.x) / scale, p1.y + (p2.y - p1.y) / scale);

        // get last spline segment
        Point splinePoint = new Point();
        int size = points.size();
        if (size % 3 == 1) { // cubic section
            SplineUtilities.nearestPointOnSpline(points.getPoint(size - 1), points
                    .getPoint(size - 2), points.getPoint(size - 3), points.getPoint(size - 2 - 2),
                    scaledPoint, splinePoint);
        } else if (size % 3 == 0) { // quad section
            SplineUtilities.nearestPointOnSpline(points.getPoint(size - 1), points
                    .getPoint(size - 2), points.getPoint(size - 3), scaledPoint, splinePoint);
        } else { // straight section
            return points.getPoint(size - 2);
        }
        // CHECKSTYLEON MagicNumber
        return splinePoint;
    }

    private static final int MAXDEPTH = 64; // Maximum depth for recursion
    private static final double EPSILON = 1.0 * Math.pow(2, -MAXDEPTH - 1); // Flatness
    private static final int DEGREE = 3; // Cubic Bezier curve
    private static final int W_DEGREE = 5; // Degree of equation to find roots
    // of
    private static final double[][] CUBIC_Z = { { 1.0, 0.6, 0.3, 0.1 }, { 0.4, 0.6, 0.6, 0.4 },
            { 0.1, 0.3, 0.6, 1.0 }, }; // Precomputed "z" for cubics

    /**
     * Calculate the distance from quadratic spline curve to point needle.
     * 
     * @param start
     *            Starting point
     * @param c
     *            Control point
     * @param end
     *            End point
     * @param needle
     *            Point to look for
     * @return distance from needle to curve
     */
    public static double distanceFromSpline(final Point start, final Point c, final Point end,
            final Point needle) {
        return nearestPointOnSpline(start, c, end, needle, new Point());
    }

    /**
     * Calculate the distance from quadratic spline curve to point needle and
     * set nearest to the point on the curve closest to needle.
     * 
     * @param start
     *            Starting point
     * @param c
     *            Control point
     * @param end
     *            End point
     * @param needle
     *            Point to look for
     * @param nearest
     *            Container for point on curve nearest to needle
     * @return distance from needle to curve
     */
    public static double nearestPointOnSpline(final Point start, final Point c, final Point end,
            final Point needle, final Point nearest) {
        // bump quadratic spline up to cubic spline
        // new control points are two thirds of the way from start (end) to the
        // single control point of the quadratic spline
        // CHECKSTYLEOFF MagicNumber
        Point c1 = new Point((start.x + 2 * c.x) / 3, (start.y + 2 * c.y) / 3);
        Point c2 = new Point((end.x + 2 * c.x) / 3, (end.y + 2 * c.y) / 3);
        // CHECKSTYLEON MagicNumber
        return nearestPointOnSpline(start, c1, c2, end, needle, nearest);
    }

    /**
     * Calculate the distance from cubic spline curve to point needle.
     * 
     * @param start
     *            Starting point
     * @param c1
     *            Control point 1
     * @param c2
     *            Control point 2
     * @param end
     *            End point
     * @param needle
     *            Point to look for
     * @return distance from needle to curve
     */
    public static double distanceFromSpline(final Point start, final Point c1, final Point c2,
            final Point end, final Point needle) {
        return nearestPointOnSpline(start, c1, c2, end, needle, new Point());
    }

    /**
     * Return the distance from cubic spline curve to point needle and set
     * location of nearest to nearest point on the spline curve.
     * 
     * Calculations come from: "Solving the Nearest Point-on-Curve Problem" and
     * "A Bezier Curve-Based Root-Finder" by Philip J. Schneider from
     * "Graphics Gems", Academic Press, 1990.
     * 
     * @param start
     *            Starting Point
     * @param c1
     *            Control point 1
     * @param c2
     *            Control point 2
     * @param end
     *            End point
     * @param needle
     *            Point to look for
     * @param nearest
     *            Container for point on curve nearest to needle
     * @return distance from needle to curve
     */
    public static double nearestPointOnSpline(final Point start, final Point c1, final Point c2,
            final Point end, final Point needle, final Point nearest) {
        PrecisionPoint pn = new PrecisionPoint(nearest);
        PrecisionPoint pa = new PrecisionPoint(needle);
        double[] tCandidate = new double[W_DEGREE]; // Possible roots
        PrecisionPoint[] v = { new PrecisionPoint(start), new PrecisionPoint(c1),
                new PrecisionPoint(c2), new PrecisionPoint(end) };

        // Convert problem to 5th-degree Bezier form
        PrecisionPoint[] w = convertToBezierForm(v, pa);

        // Find all possible roots of 5th-degree equation
        int nSolutions = findRoots(w, W_DEGREE, tCandidate, 0);

        // Compare distances of P5 to all candidates, and to t=0, and t=1
        // Check distance to beginning of curve, where t = 0
        double minDistance = pa.getDistance2(new PrecisionPoint(start));
        double t = 0.0;

        // Find distances for candidate points
        for (int i = 0; i < nSolutions; i++) {
            PrecisionPoint p = bezier(v, DEGREE, tCandidate[i], null, null);
            double distance = pa.getDistance2(p);
            if (distance < minDistance) {
                minDistance = distance;
                t = tCandidate[i];
            }
        }

        // Finally, look at distance to end point, where t = 1.0
        double distance = pa.getDistance2(new PrecisionPoint(end));
        if (distance < minDistance) {
            minDistance = distance;
            t = 1.0;
        }

        // Return the point on the curve at parameter value t
        pn.setLocation(bezier(v, DEGREE, t, null, null));
        nearest.setLocation(pn);
        return Math.sqrt(pn.getDistance2(pa));
    }

    /**
     * Given a 5th-degree equation in Bernstein-Bezier form, find all of the
     * roots in the interval [0, 1]. Return the number of roots found.
     * 
     * @param v
     * @param degree
     * @param t
     * @param depth
     * @return
     */
    private static int findRoots(final PrecisionPoint[] w, final int degree, final double[] t,
            final int depth) {

        switch (crossingCount(w, degree)) {
        case 0: // No solutions here
            return 0;
        case 1: // Unique solution
            // Stop recursion when the tree is deep enough
            // if deep enough, return 1 solution at midpoint
            if (depth >= MAXDEPTH) {
                t[0] = (w[0].preciseX + w[W_DEGREE].preciseX) / 2.0;
                return 1;
            }
            if (controlPolygonFlatEnough(w, degree)) {
                t[0] = computeXIntercept(w, degree);
                return 1;
            }
            break;
        default: // nothing
        }

        // Otherwise, solve recursively after
        // subdividing control polygon
        PrecisionPoint[] left = new PrecisionPoint[W_DEGREE + 1]; // New left
        // and right
        PrecisionPoint[] right = new PrecisionPoint[W_DEGREE + 1]; // control
        // polygons
        double[] leftT = new double[W_DEGREE + 1]; // Solutions from kids
        double[] rightT = new double[W_DEGREE + 1];

        // CHECKSTYLEOFF MagicNumber
        // start in the middle of the bezier curve, t=0.5
        bezier(w, degree, 0.5, left, right);
        // CHECKSTYLEON MagicNumber
        int leftCount = findRoots(left, degree, leftT, depth + 1);
        int rightCount = findRoots(right, degree, rightT, depth + 1);

        // Gather solutions together
        for (int i = 0; i < leftCount; i++) {
            t[i] = leftT[i];
        }
        for (int i = 0; i < rightCount; i++) {
            t[i + leftCount] = rightT[i];
        }

        // Send back total number of solutions */
        return leftCount + rightCount;
    }

    /**
     * Given a point and a Bezier curve, generate a 5th-degree Bezier-format
     * equation whose solution finds the point on the curve nearest the
     * user-defined point.
     * 
     * @param v
     * @param pa
     * @return
     */
    private static PrecisionPoint[] convertToBezierForm(final PrecisionPoint[] v,
            final PrecisionPoint pa) {

        PrecisionPoint[] c = new PrecisionPoint[DEGREE + 1]; // v(i) - pa
        PrecisionPoint[] d = new PrecisionPoint[DEGREE]; // v(i+1) - v(i)
        double[][] cdTable = new double[DEGREE][DEGREE + 1]; // Dot product of
        // c, d
        PrecisionPoint[] w = new PrecisionPoint[W_DEGREE + 1]; // Ctl pts of
        // 5th-degree
        // curve

        // Determine the c's -- these are vectors created by subtracting
        // point pa from each of the control points
        for (int i = 0; i <= DEGREE; i++) {
            c[i] = new PrecisionPoint(v[i].preciseX - pa.preciseX, v[i].preciseY - pa.preciseY);
        }

        // Determine the d's -- these are vectors created by subtracting
        // each control point from the next
        double s = DEGREE;
        for (int i = 0; i <= DEGREE - 1; i++) {
            d[i] = new PrecisionPoint(s * (v[i + 1].preciseX - v[i].preciseX), s
                    * (v[i + 1].preciseY - v[i].preciseY));
        }

        // Create the c,d table -- this is a table of dot products of the
        // c's and d's */
        for (int row = 0; row <= DEGREE - 1; row++) {
            for (int column = 0; column <= DEGREE; column++) {
                cdTable[row][column] = (d[row].preciseX * c[column].preciseX)
                        + (d[row].preciseY * c[column].preciseY);
            }
        }

        // Now, apply the z's to the dot products, on the skew diagonal
        // Also, set up the x-values, making these "points"
        for (int i = 0; i <= W_DEGREE; i++) {
            w[i] = new PrecisionPoint((double) (i) / W_DEGREE, 0.0);
        }

        int n = DEGREE;
        int m = DEGREE - 1;
        for (int k = 0; k <= n + m; k++) {
            int lb = Math.max(0, k - m);
            int ub = Math.min(k, n);
            for (int i = lb; i <= ub; i++) {
                int j = k - i;
                w[i + j].preciseY = w[i + j].preciseY + cdTable[j][i] * CUBIC_Z[j][i];
            }
        }

        return w;
    }

    /**
     * Count the number of times a Bezier control polygon crosses the 0-axis.
     * This number is >= the number of roots.
     * 
     * @param v
     * @param degree
     * @return
     */
    private static int crossingCount(final PrecisionPoint[] v, final int degree) {
        int nCrossings = 0;
        int sign = v[0].preciseY < 0 ? -1 : 1;
        int oldSign = sign;
        for (int i = 1; i <= degree; i++) {
            sign = v[i].preciseY < 0 ? -1 : 1;
            if (sign != oldSign) {
                nCrossings++;
            }
            oldSign = sign;
        }
        return nCrossings;
    }

    /**
     * Check if the control polygon of a Bezier curve is flat enough for
     * recursive subdivision to bottom out.
     * 
     * @param v
     * @param degree
     * @return
     */
    private static boolean controlPolygonFlatEnough(final PrecisionPoint[] v, final int degree) {

        // Find the perpendicular distance
        // from each interior control point to
        // line connecting v[0] and v[degree]

        // Derive the implicit equation for line connecting first
        // and last control points
        double a = v[0].preciseY - v[degree].preciseY;
        double b = v[degree].preciseX - v[0].preciseX;
        double c = v[0].preciseX * v[degree].preciseY - v[degree].preciseX * v[0].preciseY;

        double abSquared = (a * a) + (b * b);
        double[] distance = new double[degree + 1]; // Distances from pts to
        // line

        for (int i = 1; i < degree; i++) {
            // Compute distance from each of the points to that line
            distance[i] = a * v[i].preciseX + b * v[i].preciseY + c;
            if (distance[i] > 0.0) {
                distance[i] = (distance[i] * distance[i]) / abSquared;
            }
            if (distance[i] < 0.0) {
                distance[i] = -((distance[i] * distance[i]) / abSquared);
            }
        }

        // Find the largest distance
        double maxDistanceAbove = 0.0;
        double maxDistanceBelow = 0.0;
        for (int i = 1; i < degree; i++) {
            if (distance[i] < 0.0) {
                maxDistanceBelow = Math.min(maxDistanceBelow, distance[i]);
            }
            if (distance[i] > 0.0) {
                maxDistanceAbove = Math.max(maxDistanceAbove, distance[i]);
            }
        }

        // Implicit equation for zero line
        double a1 = 0.0;
        double b1 = 1.0;
        double c1 = 0.0;

        // Implicit equation for "above" line
        double a2 = a;
        double b2 = b;
        double c2 = c + maxDistanceAbove;

        double det = a1 * b2 - a2 * b1;
        double dInv = 1.0 / det;

        double intercept1 = (b1 * c2 - b2 * c1) * dInv;

        // Implicit equation for "below" line
        a2 = a;
        b2 = b;
        c2 = c + maxDistanceBelow;

        det = a1 * b2 - a2 * b1;
        dInv = 1.0 / det;

        double intercept2 = (b1 * c2 - b2 * c1) * dInv;

        // Compute intercepts of bounding box
        double leftIntercept = Math.min(intercept1, intercept2);
        double rightIntercept = Math.max(intercept1, intercept2);

        double error = (rightIntercept - leftIntercept) / 2;

        return error < EPSILON;
    }

    /**
     * 
     * Compute intersection of chord from first control point to last with
     * 0-axis.
     * 
     * @param v
     * @param degree
     * @return
     */
    private static double computeXIntercept(final PrecisionPoint[] v, final int degree) {

        double xnm = v[degree].preciseX - v[0].preciseX;
        double ynm = v[degree].preciseY - v[0].preciseY;
        double xmk = v[0].preciseX;
        double ymk = v[0].preciseY;

        double detInv = -1.0 / ynm;

        return (xnm * ymk - ynm * xmk) * detInv;
    }

    /**
     * Compute bezier curve.
     * 
     * @param c
     *            control points
     * @param degree
     *            degree of curve
     * @param t
     *            parameter for bezier function
     * @param left
     * @param right
     * @return
     */
    private static PrecisionPoint bezier(final PrecisionPoint[] c, final int degree,
            final double t, final PrecisionPoint[] left, final PrecisionPoint[] right) {
        PrecisionPoint[][] p = new PrecisionPoint[W_DEGREE + 1][W_DEGREE + 1];

        for (int j = 0; j <= degree; j++) {
            p[0][j] = new PrecisionPoint();
            p[0][j].setLocation(c[j]);
        }

        for (int i = 1; i <= degree; i++) {
            for (int j = 0; j <= degree - i; j++) {
                p[i][j] = new PrecisionPoint((1.0 - t) * p[i - 1][j].preciseX + t
                        * p[i - 1][j + 1].preciseX, (1.0 - t) * p[i - 1][j].preciseY + t
                        * p[i - 1][j + 1].preciseY);
            }
        }

        if (left != null) {
            for (int j = 0; j <= degree; j++) {
                left[j] = p[j][0];
            }
        }

        if (right != null) {
            for (int j = 0; j <= degree; j++) {
                right[j] = p[degree - j][j];
            }
        }
        return p[degree][0];
    }
}
