package de.cau.cs.kieler.synccharts.custom;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.ColorConstants;

public class HistoryDecoration extends CircleDecoration {

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
