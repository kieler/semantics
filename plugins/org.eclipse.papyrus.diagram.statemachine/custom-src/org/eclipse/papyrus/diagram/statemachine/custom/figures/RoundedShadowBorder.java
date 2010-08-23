package org.eclipse.papyrus.diagram.statemachine.custom.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.eclipse.papyrus.diagram.common.figure.node.RectangularShadowBorder;
import org.eclipse.swt.graphics.Color;

/**
 * Rounded shadow border, extends RectangularShadowBorder otherwise problem in
 * hierarchy of figures Works with borderwidth of 3 and arcwidth of 20
 * 
 * @author David
 * 
 */
public class RoundedShadowBorder extends RectangularShadowBorder {

	int borderwidth;

	int arcwidth;

	public RoundedShadowBorder(Color color) {
		super(3, color);
		this.borderwidth = 3;
		arcwidth = 20;
		setWidth(1);
	}

	/**
	 * Method for determining the inset the border will take up on the shape.
	 * 
	 * @param figure
	 *        Figure that will be inset from the border
	 * @return Insets the Insets for the border on the given figure.
	 */
	@Override
	public Insets getInsets(IFigure figure) {
		Insets insetsNew = super.getInsets(figure);
		insetsNew.top = 0;
		insetsNew.left = 0;
		insetsNew.bottom = MapModeUtil.getMapMode(figure).DPtoLP(insetsNew.bottom + borderwidth);
		insetsNew.right = MapModeUtil.getMapMode(figure).DPtoLP(insetsNew.right + borderwidth);
		return insetsNew;
	}

	/**
	 * @see org.eclipse.draw2d.Border#paint(IFigure, Graphics, Insets)
	 */
	@Override
	public void paint(IFigure figure, Graphics graphics, Insets insets) {
		// draw the normal line border
		tempRect.setBounds(getPaintRectangle(figure, insets));

		if(getWidth() % 2 == 1) {
			tempRect.width--;
			tempRect.height--;
		}

		tempRect.shrink(getWidth() / 2 + 1, getWidth() / 2 + 1).translate(-1, -1);
		graphics.setLineWidth(getWidth());
		if(getColor() != null)
			graphics.setForegroundColor(getColor());
		graphics.drawRoundRectangle(tempRect, arcwidth, arcwidth);

		graphics.setBackgroundColor(getColor());

		// graphics.drawArc(tempRect.x+tempRect.width-arcwidth+borderwidth,
		// tempRect.y+borderwidth,
		// arcwidth, arcwidth, 0, 50);
		graphics.drawArc(tempRect.x + tempRect.width - arcwidth + borderwidth, tempRect.y + borderwidth, arcwidth - 1, arcwidth - 1, 0, 40);
		// graphics.drawArc(tempRect.x+tempRect.width-arcwidth+borderwidth,
		// tempRect.y+borderwidth,
		// arcwidth-2, arcwidth-2, 0, 20);

		// graphics.drawArc(tempRect.x+tempRect.width-arcwidth+borderwidth,
		// tempRect.y+borderwidth+tempRect.height-arcwidth, arcwidth, arcwidth,
		// 270, 90);
		graphics.drawArc(tempRect.x + tempRect.width - arcwidth + borderwidth, tempRect.y + borderwidth + tempRect.height - arcwidth, arcwidth - 1, arcwidth - 1, 270, 90);
		graphics.drawArc(tempRect.x + tempRect.width - arcwidth + borderwidth, tempRect.y + borderwidth + tempRect.height - arcwidth, arcwidth - 2, arcwidth - 2, 270, 90);
		graphics.drawArc(tempRect.x + tempRect.width - arcwidth + borderwidth, tempRect.y + borderwidth + tempRect.height - arcwidth, arcwidth - 3, arcwidth - 3, 270, 90);

		// graphics.drawArc(tempRect.x+borderwidth,
		// tempRect.y+borderwidth+tempRect.height-arcwidth,
		// arcwidth, arcwidth, 220, 50);
		graphics.drawArc(tempRect.x + borderwidth, tempRect.y + borderwidth + tempRect.height - arcwidth, arcwidth - 1, arcwidth - 1, 230, 40);
		// graphics.drawArc(tempRect.x+borderwidth,
		// tempRect.y+borderwidth+tempRect.height-arcwidth,
		// arcwidth-2, arcwidth-2, 240, 20);

		graphics.fillRectangle(tempRect.x + tempRect.width + 1, tempRect.y + arcwidth - 2 * borderwidth - 4, borderwidth, tempRect.height - arcwidth + borderwidth);
		graphics.fillRectangle(tempRect.x + arcwidth - 2 * borderwidth - 4, tempRect.y + tempRect.height + 1, tempRect.width - arcwidth + borderwidth, borderwidth);

	}

}
