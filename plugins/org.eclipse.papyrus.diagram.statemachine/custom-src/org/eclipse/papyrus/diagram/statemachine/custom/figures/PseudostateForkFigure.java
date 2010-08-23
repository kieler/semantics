package org.eclipse.papyrus.diagram.statemachine.custom.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Dimension;

public class PseudostateForkFigure extends RectangleFigure {

	public PseudostateForkFigure() {
		super();
		Dimension dim1 = new Dimension(34, 4);
		this.setPreferredSize(new Dimension(dim1));
		this.setMaximumSize(new Dimension(dim1));
		this.setMinimumSize(new Dimension(dim1));
		this.setSize(dim1);
	}

	protected void fillShape(Graphics graphics) {

		graphics.pushState();
		graphics.setBackgroundColor(ColorConstants.black);
		graphics.fillRectangle(getBounds());
		graphics.popState();

	}

}
