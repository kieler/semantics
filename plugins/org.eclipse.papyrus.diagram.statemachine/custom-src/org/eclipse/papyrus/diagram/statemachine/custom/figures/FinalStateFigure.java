package org.eclipse.papyrus.diagram.statemachine.custom.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

public class FinalStateFigure extends Ellipse {

	/**
	 * Default Constructor.
	 */
	public FinalStateFigure() {
		super();
		Dimension dim1 = new Dimension(22, 22);
		this.setPreferredSize(new Dimension(dim1));
		this.setMaximumSize(new Dimension(dim1));
		this.setMinimumSize(new Dimension(dim1));
		this.setSize(dim1);
	}

	/**
	 * @see org.eclipse.draw2d.Shape#fillShape(org.eclipse.draw2d.Graphics)
	 */
	@Override
	protected void fillShape(Graphics graphics) {
		final int space = 5;
		Rectangle f = Rectangle.SINGLETON;
		Rectangle r = getBounds();
		f.x = r.x + space;
		f.y = r.y + space;
		f.width = r.width - space * 2;
		f.height = r.height - space * 2;
		graphics.setBackgroundColor(ColorConstants.black);
		graphics.fillOval(f);

	}

}
