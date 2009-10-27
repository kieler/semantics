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
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.custom;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * A decoration that depicts a circle.
 * @author schm
 *
 */
// A new decoration that depicts a circle
public class CircleDecoration extends PolygonDecoration {
	
	/**
	 * This method has to be empty. Otherwise the circle would change its size at different angles.
	 */
	@Override
	public void setRotation(double angle) {
	// This has to be empty, otherwise the circle would be deformed at
	// different angles
	}
	
	/**
	 * Draw the outline of the circle.
	 */
	@Override
	protected void outlineShape(Graphics g) {
		Rectangle ovalBounds = getBoundsFromPoints();
		g.drawOval(ovalBounds);
	}
	
	/**
	 * Fill the circle.
	 */
	@Override
	protected void fillShape(Graphics g) {
		Rectangle ovalBounds = getBoundsFromPoints();
		g.fillOval(ovalBounds);
	}
	
	/**
	 * Calculate the bounds of the decoration.
	 * @return The bounds of the decoration.
	 */
	// Transforms the PointList into bounds that can be used to draw the circle
	protected Rectangle getBoundsFromPoints() {
		if (getPoints().size() < 2) {
			return null;
		}
		
		PointList pointList = getPoints();
		
		int top  = pointList.getFirstPoint().y;
		int left = pointList.getFirstPoint().x;
		int right = pointList.getFirstPoint().x;
		int bottom = pointList.getFirstPoint().y;
		
		// Take the outermost coordinates of all points as bounds 
		for (int i = 1; i < getPoints().size(); i++) {
			Point p = pointList.getPoint(i);
			if (p.x < left)
				left = p.x;
			if (p.x > right)
				right = p.x;
			if (p.y < top)
				top = p.y;
			if (p.y > bottom)
				bottom = p.y;
		}
		return new Rectangle(left, top, right-left, bottom-top);
	}
	
}
