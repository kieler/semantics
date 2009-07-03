package de.cau.cs.kieler.synccharts.custom;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class HistoryDecoration extends CircleDecoration {

	// Decoration for history transitions;
	// draws an "H" inside the circle.
	@Override
	protected void outlineShape(Graphics g) {
		super.outlineShape(g);
		Rectangle ovalBounds = getBoundsFromPoints();
		
		int wUnit = ovalBounds.width / 3;
		int hUnit = ovalBounds.height / 4;
		
		Point p1 = new Point(ovalBounds.x + wUnit, ovalBounds.y + hUnit);
		Point p2 = new Point(ovalBounds.x + wUnit, ovalBounds.y + 3*hUnit);
		Point p3 = new Point(ovalBounds.x + 2*wUnit, ovalBounds.y + hUnit);
		Point p4 = new Point(ovalBounds.x + 2*wUnit, ovalBounds.y + 3*hUnit);
		Point p5 = new Point(ovalBounds.x + wUnit, ovalBounds.y + 2*hUnit);
		Point p6 = new Point(ovalBounds.x + 2*wUnit, ovalBounds.y + 2*hUnit);
		
		g.drawLine(p1.x, p1.y, p2.x, p2.y);
		g.drawLine(p3.x, p3.y, p4.x, p5.y);
		g.drawLine(p5.x, p5.y, p6.x, p6.y);
	}
	
}
