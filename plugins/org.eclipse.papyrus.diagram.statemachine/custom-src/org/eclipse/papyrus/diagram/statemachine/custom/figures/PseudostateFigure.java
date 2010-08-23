package org.eclipse.papyrus.diagram.statemachine.custom.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RectangleFigure;

public class PseudostateFigure extends RectangleFigure {

	protected void fillShape(Graphics graphics) {

		graphics.pushState();
		graphics.setBackgroundColor(ColorConstants.black);
		graphics.fillRectangle(getBounds());
		graphics.popState();

	}

}
