package de.cau.cs.kieler.synccharts.custom;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Rectangle;

public class DoubleRoundedRectangle extends RoundedRectangle {

	// A class that draws two rectangles instead of only one
	public DoubleRoundedRectangle() {
		super();
	}
	
	protected void outlineShape(Graphics graphics) {
		Rectangle f = Rectangle.SINGLETON;
		Rectangle r = getBounds();
		f.x = r.x + lineWidth / 2;
		f.y = r.y + lineWidth / 2;
		f.width = r.width - lineWidth;
		f.height = r.height - lineWidth;
		graphics.drawRoundRectangle(f, corner.width, corner.height);
		// Draw the second rectangle inside the first one
		f.x += 5;
		f.y += 5;
		f.width -= 10;
		f.height -= 10;
		graphics.drawRoundRectangle(f, corner.width, corner.height);
	}
}
