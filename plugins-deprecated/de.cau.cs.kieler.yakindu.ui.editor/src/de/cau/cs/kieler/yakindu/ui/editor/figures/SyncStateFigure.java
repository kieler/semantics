/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.ui.editor.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.yakindu.sct.ui.editor.editor.figures.StateFigure;
import org.yakindu.sct.ui.editor.preferences.StatechartColorConstants;

/**
 * The SyncState figure which extends the StateFigure. The StateFigure is
 * extended to draw a double line border if the state is a final state and a
 * thicker border if an initial state.
 * 
 * @author wah
 * @kieler.rating green 2013-04-13
 * 
 */
public class SyncStateFigure extends StateFigure {

	/** width of the rectangle border. */
	public static final int NORMAL_BORDER_WIDTH = 1;
	public static final int THICK_BORDER_WIDTH = 2;

	/** Margin constant **/
	private static final int MARGIN_DOUBLE_LINE = 3;

	private boolean isDoubleLineBorder = false;
	private boolean isThickBorder = false;

	public SyncStateFigure() {
		// reduce white spaces
		((GridLayout) this.getLayoutManager()).verticalSpacing = -1;
	}

	/**
	 * Override to create a double border lined State when a final state
	 */
	@Override
	protected void outlineShape(final Graphics graphics) {
		// if the isDoubleLineBorder is true, draw a second rectangle.
		if (isDoubleLineBorder) {
			// call the super method to draw the first RoundRectangle
			super.outlineShape(graphics);
			// set the second rectangle. It is calculated according the border
			// line width
			Rectangle rect = new Rectangle();
			rect.x = getBounds().x + MARGIN_DOUBLE_LINE * getLineWidth() / 2
					+ 1;
			rect.y = getBounds().y + MARGIN_DOUBLE_LINE * getLineWidth() / 2
					+ 1;
			rect.width = getBounds().width - MARGIN_DOUBLE_LINE
					* getLineWidth() - 2;
			rect.height = getBounds().height - MARGIN_DOUBLE_LINE
					* getLineWidth() - 2;
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
	 * Override to change the State preferred height.
	 */
	@Override
	public Dimension getPreferredSize(int wHint, int hHint) {
		Dimension result = super.getPreferredSize(wHint, hHint);
		return new Dimension(result.width + BLUR_SHADOW_WIDTH, 0);
	}

	/**
	 * Return the Rounded Rectangle border width.
	 * 
	 * @return the border width
	 */
	private int getBorderWidth() {
		return (isThickBorder ? THICK_BORDER_WIDTH : NORMAL_BORDER_WIDTH);
	}

	/**
	 * Return true if a Thick line border, false otherwise.
	 * 
	 * @return the true if a Thick line border, false otherwise
	 */
	public boolean isThickBorder() {
		return isThickBorder;
	}

	/**
	 * Set the border to thick.
	 * 
	 * @param isThickBorder
	 *            true for a thick border, and false otherwise
	 */
	public void setThickBorder(boolean isThickBorder) {
		this.isThickBorder = isThickBorder;
	}

	/**
	 * Return true if a double line border, false otherwise.
	 * 
	 * @return the true if a double line border, false otherwise
	 */
	public boolean isDoubleLineBorder() {
		return isDoubleLineBorder;
	}

	/**
	 * Set the line border to double.
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
