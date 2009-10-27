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
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.ColorConstants;

/**
 * A circle decoration with an 'H' inside.
 * @author schm
 *
 */
public class HistoryDecoration extends CircleDecoration {

	/**
	 * Outline the shape and draw an 'H' inside.
	 */
	// Decoration for history transitions;
	// draws an "H" inside the circle.
	@Override
	protected void outlineShape(Graphics g) {
		super.outlineShape(g);
		Rectangle ovalBounds = getBoundsFromPoints();
		g.setForegroundColor(ColorConstants.black);
		g.drawString("H", ovalBounds.x + 2, ovalBounds.y -2);
	}
	
}
