package de.cau.cs.kieler.synccharts.custom;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * A layout for compartments.
 * @deprecated It is currently not used.
 */
public class CustomRegionCompartmentLayout extends XYLayout {

	/**
	 * Apply the layout.
	 */
	// A custom layout for the region compartment which lays its children out
	// in columns that equally share the maximal available width;
	// it is currently not used.
	public void layout(IFigure parent) {
		
		if (!parent.isVisible())
			return;
		
		List children = parent.getChildren();
		int numChildren = children.size();
		Rectangle clientArea = parent.getClientArea();
		int x = clientArea.x;
		int y = clientArea.y;
		int width = clientArea.width;
		int height = clientArea.height;
		Rectangle newBounds = new Rectangle();
		newBounds.x = 0;
		newBounds.y = y;
		newBounds.width = width;
		if (numChildren > 0) {
			newBounds.width =  width / numChildren;
		}
		newBounds.height = height;
		int counter = 0;
		
		for (Object child : children) {
			if (child instanceof IFigure) {
				IFigure childFigure = (IFigure) child;
				newBounds.x = x + (counter * (width / numChildren));
				childFigure.setBounds(newBounds);
				counter++;
			}
		}
	}

	/**
	 * Calculate the preferred size of the figure.
	 */
	// Method to calculate the preferred size of a figure
	@Override
	protected Dimension calculatePreferredSize(IFigure parent, int hint, int hint2) {
		return parent.getPreferredSize(hint, hint2);
	}
}