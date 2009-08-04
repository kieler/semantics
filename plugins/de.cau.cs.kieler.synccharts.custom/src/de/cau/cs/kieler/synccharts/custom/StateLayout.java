/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;

/**
 * A special layout for states: If the state is simple, its name is written in the center
 * and the compartments are reduced in size to zero. If the state is complex, the name is
 * written on top and the compartments are laid out in a column below the name.
 * @author schm
 *
 */

public class StateLayout extends ConstrainedToolbarLayout {

	boolean containsRegions;
	boolean containsSignals;
	boolean containsVariables;
	boolean containsEntryActions;
	boolean containsInnerActions;
	boolean containsExitActions;
	boolean containsSuspensionTrigger;
	
	/**
	 * Apply the layout.
	 */
	// A layout for states
	public void layout(IFigure parent) {
		if (!parent.isVisible())
			return;
		
		List children = getChildren(parent);
		Rectangle clientArea = transposer.t(parent.getClientArea());
		int x = clientArea.x;
		int y = clientArea.y;
		int width = clientArea.width;
		int height = clientArea.height;
		
		// Check if the figure is an attribute aware state and whether it is
		// a simple or a complex state
		if (parent instanceof AttributeAwareFigure) {
			EObject modelElement = ((AttributeAwareFigure) parent).getModelElement();
			if (modelElement instanceof State) {
				State state = (State) modelElement;
				retrieveContents(state);
				if (isSimple(state)) {
					simpleLayout(parent, children, x, y ,height, width);
				}
				else {
					complexLayout(parent, children, x, y ,height, width);
				}
			}
		}
	}
	
	/**
	 * Lookup which compartments of a state have contents.
	 * @param state The state to check.
	 */
	// Method to lookup which compartments have contents
	private void retrieveContents(State state) {
		containsRegions = false;
		containsSignals = false;
		containsVariables = false;
		containsEntryActions = false;
		containsInnerActions = false;
		containsExitActions = false;
		containsSuspensionTrigger = false;
		
		if ((state.getRegions() != null && state.getRegions().size() > 0)) {
			containsRegions = true;
		}
		if ((state.getSignals() != null && state.getSignals().size() > 0)) {
			containsSignals = true;
		}
		if ((state.getEntryActions() != null && state.getEntryActions().size() > 0)) {
			containsEntryActions = true;
		}
		if ((state.getInnerActions() != null && state.getInnerActions().size() > 0)) {
			containsInnerActions = true;
		}
		if ((state.getExitActions() != null && state.getExitActions().size() > 0)) {
			containsExitActions = true;
		}
		/*
		if ((state.getVariables() != null && state.getVariables().size() > 0)) {
			containsVariables = true;
		}
		*/
		if (state.getSuspensionTrigger() != null) {
			containsSuspensionTrigger = true;
		}
	}

	/**
	 * Apply the layout for complex states.
	 * @param parent The state figure.
	 * @param children The children of the state figure.
	 * @param x The x coordinate of the state figure.
	 * @param y The y coordinate of the state figure.
	 * @param height The height of the state figure.
	 * @param width The width of the state figure.
	 */
	// The layout for complex states
	private void complexLayout(IFigure parent, List children, int x, int y, int height, int width) {
		
		// Collect preferred widths and heights
		int numChildren = children.size();
		int totalWidth = 0;
		int totalHeight = 0;
		int [] prefWidths = new int[numChildren];
		int[] prefHeights = new int[numChildren];
		Rectangle newBounds = new Rectangle();
		for (int i = 0; i < numChildren; i++) {
			Object child = children.get(i);
			if (child instanceof IFigure) {
				IFigure childFigure = (IFigure) child;
				int newWidth = childFigure.getPreferredSize().width;
				int newHeight = childFigure.getPreferredSize().height;
				// Empty compartments are not considered
				if (child instanceof ResizableCompartmentFigure) {
				    String compartmentName = getName((ResizableCompartmentFigure)child);
					if ((compartmentName.equals("Signal:") && (!containsSignals))
							|| (compartmentName.equals("Variable:") && (!containsVariables))
							|| (compartmentName.equals("OnEntryAction:") && (!containsEntryActions))
							|| (compartmentName.equals("OnInsideAction:") && (!containsInnerActions))
							|| (compartmentName.equals("OnExitAction:") && (!containsExitActions))
							|| (compartmentName.equals("Suspend:") && (!containsSuspensionTrigger))
							|| (compartmentName.equals("RegionCompartment") && (!containsRegions))) {
						newWidth = 0;
						newHeight = 0;
					}
					// Make title label invisible if the compartment is not a region compartment and has only the title label as content
					if (compartmentName.equals("Signal:")) {
						if (!containsSignals) {
							setCompartmentTitleVisibility(child, false);
						} else {
							setCompartmentTitleVisibility(child, true);
						}
					}
					if (compartmentName.equals("Variable:")) {
						if (!containsVariables) {
							setCompartmentTitleVisibility(child, false);
						} else {
							setCompartmentTitleVisibility(child, true);
						}
					}
					if (compartmentName.equals("OnEntryAction:")) {
						if (!containsEntryActions) {
							setCompartmentTitleVisibility(child, false);
						} else {
							setCompartmentTitleVisibility(child, true);
						}
					}
					if (compartmentName.equals("OnInsideAction:")) {
						if (!containsInnerActions) {
							setCompartmentTitleVisibility(child, false);
						} else {
							setCompartmentTitleVisibility(child, true);
						}
					}
					if (compartmentName.equals("OnExitAction:")) {
						if (!containsExitActions) {
							setCompartmentTitleVisibility(child, false);
						} else {
							setCompartmentTitleVisibility(child, true);
						}
					}
					if (compartmentName.equals("Suspend:")) {
						if (!containsSuspensionTrigger) {
							setCompartmentTitleVisibility(child, false);
						} else {
							setCompartmentTitleVisibility(child, true);
						}
					}
				}
				// Take maximum width and sum of heights
				prefWidths[i] = newWidth;
				prefHeights[i] = newHeight;
				totalHeight += newHeight;
				if (newWidth > totalWidth) {
					totalWidth = newWidth;
				}
			}
		}

		// stretch if the node is larger than the 
		if (totalHeight < height){
		    totalHeight = height;
		}
		
		// Labels are centered in the upper area while compartments share the
		// rest of the space, always using the full available width
		for (int i = 0; i < numChildren; i++) {
			Object child = children.get(i);
			if (child instanceof Figure) {
				IFigure childFigure = (IFigure) child;
				if (child instanceof WrappingLabel) {
					newBounds.x = x + (width - prefWidths[i]) / 2;
					newBounds.y = y;
					newBounds.width = prefWidths[i];
					newBounds.height = prefHeights[i];
				}
				else if (child instanceof ShapeCompartmentFigure) {
					int offsetY = 0;
					for (int j = 0; j < i; j++) {
						Object child2 = children.get(j);
						if (child2 instanceof IFigure) {
							offsetY += prefHeights[j];
						}
					}
					// Leave a little border so that transition anchors
					// can be moved freely by the user
					newBounds.x = x + 1;
					newBounds.y = y + offsetY;
					newBounds.width = width - 2;
					newBounds.height = totalHeight - offsetY;
				}
				childFigure.setBounds(transposer.t(newBounds));
			}
		}	
	}

	/**
	 * Set the visibility of a compartment's title label.
	 * @param child The compartment.
	 * @param b True if visible, false otherwise.
	 */
	// Method to make the compartment's title figure invisible
	private void setCompartmentTitleVisibility(Object child, boolean b) {
		for (Object o : ((ShapeCompartmentFigure) child).getContentPane().getChildren()) {
			if (o instanceof WrappingLabel) {
				((WrappingLabel) o).setVisible(b);
			}
		}
	}

	/**
	 * Retrieve the name of a compartment.
	 * @param child The compartment.
	 * @return The name of the compartment.
	 */
	// Method to retrieve a compartment's name
	private String getName(ResizableCompartmentFigure child) {
		if ((child.getChildren() != null) && (child.getChildren().size() > 0)
				&& (child.getChildren().get(0) instanceof IFigure)) {
			IFigure rcf = (IFigure) child.getChildren().get(0);
			if ((rcf.getChildren() != null) && (rcf.getChildren().size() > 0)
					&& (rcf.getChildren().get(0) instanceof WrappingLabel)) {
				WrappingLabel label = (WrappingLabel) rcf.getChildren().get(0);
				return label.getText();
			}
		}
		return "";
	}

	/**
	 * Apply the layout for simple states.
	 * @param parent The state figure.
	 * @param children The children of the state figure.
	 * @param x The x coordinate of the state figure.
	 * @param y The y coordinate of the state figure.
	 * @param height The height of the state figure.
	 * @param width The width of the state figure.
	 */
	// The layout for simple states
	private void simpleLayout(IFigure parent, List children, int x, int y, int height, int width) {
		String name;
		int prefWidth = 0;
		int prefHeight = 0;
		Rectangle newBounds = new Rectangle();
		for (Object child : children) {
			if (child instanceof WrappingLabel) {
				IFigure childFigure = (IFigure) child;
				int newWidth = childFigure.getPreferredSize().width;
				int newHeight = childFigure.getPreferredSize().height;
				if (newWidth > prefWidth) {
					prefWidth = newWidth; 
				}
				if (newHeight > prefHeight) {
					prefHeight = newHeight; 
				}
			}
		}

		// The label is centered in the middle, and the compartments are hidden
		// by setting their size to 0
		for (Object child : children) {
			if (child instanceof Figure) {
				IFigure childFigure = (IFigure) child;
				if (child instanceof WrappingLabel) {
					prefWidth = childFigure.getPreferredSize().width;
					prefHeight = childFigure.getPreferredSize().height;
					newBounds.x = x + (width / 2) - (prefWidth / 2);
					newBounds.y = y + (height / 2) - (prefHeight / 2);
					newBounds.width = prefWidth;
					newBounds.height = prefHeight;
				}
				else if (child instanceof ResizableCompartmentFigure) {
					name = ((ResizableCompartmentFigure) child).getCompartmentTitle();
					int offsetY = 0;
					newBounds.x = x;
					newBounds.y = y;
					newBounds.width = 0;
					newBounds.height = 0;
				}
				childFigure.setBounds(transposer.t(newBounds));
			}
		}
	}

	/**
	 * Gets the list of children after applying the layout options of
	 * ignore invisible children & reverse children
	 */
	private List getChildren(IFigure container) {
		List children = new ArrayList(container.getChildren());
		if (getIgnoreInvisibleChildren()) {
			Iterator iter = children.iterator();
			while (iter.hasNext()) {
				IFigure f = (IFigure) iter.next();
				if (!f.isVisible())
					iter.remove();
			}
		}
		if (isReversed())
			Collections.reverse(children);
		return children;
	}

	/**
	 * Check whether a state is simple.
	 * @param state The state to check.
	 * @return True if simple, false otherwise.
	 */
	// Method to decide whether a state is simple
	private boolean isSimple(State state) {
		if ((state.getRegions() == null || state.getRegions().size() == 0)
				&& (state.getSignals() == null || state.getSignals().size() == 0)
				&& (state.getEntryActions() == null || state.getEntryActions().size() == 0)
				&& (state.getInnerActions() == null || state.getInnerActions().size() == 0)
				&& (state.getExitActions() == null || state.getExitActions().size() == 0)) {
		return true;	
		}
		return false;
	}

	/**
	 * Calculate the minimum size of the figure.
	 */
	// Method to calculate the minimum size of a figure
	@Override
	public Dimension calculateMinimumSize(IFigure parent, int hint, int hint2) {
		
		int minWidth = 0;
		int minHeight = 0;
		for (Object child : parent.getChildren()) {
			if (child instanceof Figure) {
				IFigure childFigure = (IFigure) child;
				int newWidth = childFigure.getPreferredSize().width;
				if (newWidth > minWidth) {
					minWidth = newWidth;
				}
				minHeight += childFigure.getPreferredSize().height;
			}
		}
		
		// simple states can be made smaller in height than the compartments would allow
		if (parent instanceof AttributeAwareFigure) {
			EObject modelElement = ((AttributeAwareFigure) parent).getModelElement();
			if (modelElement instanceof State) {
				State state = (State) modelElement;
				if (isSimple(state)) {
					minHeight = 40;
					if (minWidth < 40) {
						minWidth = 40;
					}
				}
			}
		}	
		
		return new Dimension(minWidth, minHeight);
	}
	
	/**
	 * Calculate the preferred size of the figure.
	 */
	// Method to calculate the preferred size of a figure
	@Override
	protected Dimension calculatePreferredSize(IFigure parent, int hint, int hint2) {
		
		// The height of simple states is reduced,
		// the height of complex states considers only
		// the compartments with contents
		if (parent instanceof AttributeAwareFigure) {
			EObject modelElement = ((AttributeAwareFigure) parent).getModelElement();
			if (modelElement instanceof State) {
				State state = (State) modelElement;
				if (isSimple(state)) {
					Dimension newDimension = super.calculatePreferredSize(parent, hint, hint2);
					newDimension.height = 40;
					return newDimension;
				} 
			}
		}
		return super.calculatePreferredSize(parent, hint, hint2);
	}
}