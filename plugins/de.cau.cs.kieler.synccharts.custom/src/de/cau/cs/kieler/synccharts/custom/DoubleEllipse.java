package de.cau.cs.kieler.synccharts.custom;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * An ellipse with a double border
 * @author schm
 *
 */
public class DoubleEllipse extends Ellipse {
	
	/**
	 * The constructor.
	 */
	// A class that draws two ellipses instead of only one
	public DoubleEllipse() {
		super();
	}

	/**
	 * Draw the outline twice.
	 */
	@Override
	protected void outlineShape(Graphics graphics) {
		Rectangle r = Rectangle.SINGLETON;
		r.setBounds(getBounds());
		r.width--;
		r.height--;
		r.shrink((lineWidth - 1) / 2, (lineWidth - 1) / 2);
		graphics.drawOval(r);
		// Draw the second ellipse inside the first one
		r.x += 5;
		r.y += 5;
		r.width -= 10;
		r.height -= 10;
		graphics.drawOval(r);
	}
	
}
