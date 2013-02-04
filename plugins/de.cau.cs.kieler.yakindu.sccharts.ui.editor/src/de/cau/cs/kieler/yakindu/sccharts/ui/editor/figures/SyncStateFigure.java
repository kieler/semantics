package de.cau.cs.kieler.yakindu.sccharts.ui.editor.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.yakindu.sct.ui.editor.editor.figures.StateFigure;
import org.yakindu.sct.ui.editor.preferences.StatechartColorConstants;

public class SyncStateFigure extends StateFigure {

	/** width of the rectangle border. */
	public static final int NORMAL_BORDER_WIDTH = 1;
	public static final int THICK_BORDER_WIDTH = 2;

	private boolean isDoubleLineBorder = false;
	private boolean isThickBorder = false;

	public SyncStateFigure() {
		GridLayout layout = new GridLayout(1, false);
		this.setLayoutManager(layout);
		this.setCornerDimensions(new Dimension(15, 15));
		this.setLineWidth(getBorderWidth());
		this.setOutline(true);
		createContents();
	}

	protected void outlineShape(final Graphics graphics) {
		// if the isDoubleLineBorder is true, draw a second rectangle.
		if (isDoubleLineBorder) {
			// call the super method to draw the first RoundRectangle
			super.outlineShape(graphics);
			// set the second rectangle. It is calculated according the border
			// line width
			Rectangle rect = new Rectangle();
			rect.x = getBounds().x + 3 * getLineWidth() / 2 + 1;
			rect.y = getBounds().y + 3 * getLineWidth() / 2 + 1;
			rect.width = getBounds().width - 3 * getLineWidth() - 2;
			rect.height = getBounds().height - 3 * getLineWidth() - 2;
			// Draw the second rectangle inside the first one
			graphics.drawRoundRectangle(rect, getCornerDimensions().width
					- (getLineWidth() + 1) * getLineWidth(),
					getCornerDimensions().height - (getLineWidth() + 1)
							* getLineWidth());
			setForegroundColor(ColorConstants.black);
		} else if (isThickBorder) {
			this.setLineWidth(getBorderWidth());
			setForegroundColor(ColorConstants.black);
			super.outlineShape(graphics);
		} else {
			setForegroundColor(StatechartColorConstants.STATE_LINE_COLOR);
			super.outlineShape(graphics);
		}
	}

	/**
	 * Return the Rounded Rectangle border width
	 * 
	 * @return the border width
	 */
	private int getBorderWidth() {
		return (isThickBorder ? THICK_BORDER_WIDTH : NORMAL_BORDER_WIDTH);
	}

	/**
	 * Return true if a Thick line border, false otherwise
	 * 
	 * @return the true if a Thick line border, false otherwise
	 */
	public boolean isThickBorder() {
		return isThickBorder;
	}

	/**
	 * Set the border to thick
	 * 
	 * @param isThickBorder
	 *            true for a thick border, and false otherwise
	 */
	public void setThickBorder(boolean isThickBorder) {
		this.isThickBorder = isThickBorder;
	}

	/**
	 * Return true if a double line border, false otherwise
	 * 
	 * @return the true if a double line border, false otherwise
	 */
	public boolean isDoubleLineBorder() {
		return isDoubleLineBorder;
	}

	/**
	 * Set the line border to double
	 * 
	 * @param isDoubleLineBorder
	 *            true for a double line border, and false otherwise
	 */
	public void setDoubleLineBorder(boolean isDoubleLineBorder) {
		this.isDoubleLineBorder = isDoubleLineBorder;
	}

	public void refreshBorder() {
		this.setLineWidth(getBorderWidth());

	}

}
