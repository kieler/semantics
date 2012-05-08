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
package de.cau.cs.kieler.core.model.graphiti;

import java.util.List;

import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

/**
 * Utility class for Graphiti editors.
 *
 * @author msp
 */
public final class GraphitiUtil {

    /**
     * Hidden constructor.
     */
    private GraphitiUtil() {
    }
    
    /**
     * Set the bounds of the given graphics algorithm.
     * 
     * @param ga a graphics algorithm
     * @param x the new x coordinate
     * @param y the new y coordinate
     * @param width the new width
     * @param height the new height
     * @return whether the bounds have changed
     */
    public static boolean setBounds(final GraphicsAlgorithm ga, final int x, final int y,
            final int width, final int height) {
        boolean changed = false;
        if (ga.getX() != x) {
            ga.setX(x);
            changed = true;
        }
        if (ga.getY() != y) {
            ga.setY(y);
            changed = true;
        }
        if (ga.getWidth() != width) {
            ga.setWidth(width);
            changed = true;
        }
        if (ga.getHeight() != height) {
            ga.setHeight(height);
            changed = true;
        }
        return changed;
    }
    
    /**
     * Set the points of the given polyline.
     * 
     * @param polyline a polyline
     * @param coords an array of alternating x / y coordinates
     * @return true if the points have changed
     */
    public static boolean setPoints(final Polyline polyline, final int[] coords) {
        boolean changed = false;
        IGaService gaService = Graphiti.getGaService();
        List<Point> linePoints = polyline.getPoints();
        for (int i = 0, p = 0; i < coords.length - 1; i += 2, p++) {
            if (p >= linePoints.size()) {
                Point point = gaService.createPoint(coords[i], coords[i + 1]);
                linePoints.add(point);
                changed = true;
            } else {
                Point point = linePoints.get(p);
                if (point.getX() != coords[i]) {
                    point.setX(coords[i]);
                    changed = true;
                }
                if (point.getY() != coords[i + 1]) {
                    point.setY(coords[i + 1]);
                    changed = true;
                }
            }
        }
        return changed;
    }
    
}
