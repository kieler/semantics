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
package de.cau.cs.kieler.core.model.figures;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;

/**
 * A Polyline that reacts to translation.
 *
 * @author msp
 * @kieler.ignore (excluded from review process)
 */
public class TranslatablePolyline extends org.eclipse.draw2d.Polyline {

    /**
     * {@inheritDoc}
     */
    public void primTranslate(final int x, final int y) {
        PointList oldPoints = getPoints();
        PointList newPoints = new PointList(oldPoints.size());
        for (int i = 0; i < oldPoints.size(); i++) {
            Point point = oldPoints.getPoint(i);
            point.translate(x, y);
            newPoints.addPoint(point);
        }
        setPoints(newPoints);
    }
    
}
