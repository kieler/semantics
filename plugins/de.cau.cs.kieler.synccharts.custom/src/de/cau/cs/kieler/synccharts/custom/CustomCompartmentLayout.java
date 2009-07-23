package de.cau.cs.kieler.synccharts.custom;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * A layout for compartments that lays out the compartment's children in rows, which
 * are wrapped around if they are longer than the available space.
 * @author schm
 *
 */
public class CustomCompartmentLayout extends XYLayout {

	// The maximum height of all elements in the current row
	int maxHeight;
	
	/**
	 * Apply the layout.
	 */
	// A custom layout for compartments which lays its children out in rows
	// and wraps them around if needed.
	public void layout(IFigure parent) {
		
		if (!parent.isVisible())
			return;
		
		List children = sort(parent.getChildren());
		Rectangle clientArea = parent.getClientArea();
		int width = clientArea.width;
		Rectangle newBounds = new Rectangle();
		newBounds.x = 0;
		newBounds.y = 0;
		newBounds.width = 0;
		newBounds.height = 0;
		maxHeight = 0;
		
		for (Object child : children) {
			if (child instanceof IFigure) {
				IFigure childFigure = (IFigure) child;
				// The first if decides whether the compartment is one of those that need a
				// special layout, which are those that contain AttributeAwareInvisibleFigures;
				// For these, only their minimum size is considered.
				if ((childFigure.getChildren() != null) && (childFigure.getChildren().size() > 0)
					&& (childFigure.getChildren().get(0) instanceof AttributeAwareInvisibleFigure)) {
					newBounds.width = childFigure.getMinimumSize(-1, -1).width;
					newBounds.height = childFigure.getMinimumSize(-1, -1).height;
				}
				else {
					newBounds.width = childFigure.getPreferredSize(-1, -1).width;
					newBounds.height = childFigure.getPreferredSize(-1, -1).height;
				}
				
				// The figures are laid out in rows and wrapped around if needed
				if (newBounds.x + newBounds.width > width) {
					newBounds.x = 0;
					newBounds.y += maxHeight;
					maxHeight = newBounds.height;
				}
				else if (newBounds.height > maxHeight) {
					maxHeight = newBounds.height;
				}
				
				childFigure.setBounds(newBounds);
				newBounds.x += newBounds.width;
			}
		}
	}

	/**
	 * Sort the list of children so that all WrappingLabels come first.
	 * @param list
	 * @return
	 */
	// Return a sorted list in which WrappingLabels come first
	private List sort(List list) {
		List newList = new LinkedList();
		for (Object object : list) {
			if (object instanceof WrappingLabel) {
				newList.add(object);
			}
		}
		for (Object object : list) {
			if (!(object instanceof WrappingLabel)) {
			newList.add(object);
			}
		}
		return newList;
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