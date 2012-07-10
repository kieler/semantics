/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
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
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * A layout for compartments that lays out the compartment's children in rows,
 * which are wrapped around if they are longer than the available space.
 * 
 * @author schm
 * @author msp
 */
public class ListCompartmentLayout extends XYLayout {

    /**
     * Apply the layout.
     * 
     * @param container the figure
     */
    public void layout(final IFigure container) {
        @SuppressWarnings("unchecked")
        List<IFigure> children = sort(container.getChildren());
        IFigure compartment = getParentCompartment(container);
        int parentWidth = compartment.getParent().getBounds().width;
        Rectangle newBounds = new Rectangle();
        int maxHeight = 0;

        for (IFigure childFigure : children) {
            // First decide whether the compartment is one of those that need a
            // special layout, which are those that contain attribute aware invisible
            // figures; for these, only their minimum size is considered.
            if ((childFigure.getChildren().size() > 0)
                    && (childFigure.getChildren().get(0) instanceof InvisibleLabelFigure)) {
                newBounds.setSize(childFigure.getMinimumSize());
            } else {
                newBounds.setSize(childFigure.getPreferredSize());
            }

            // The figures are laid out in rows and wrapped around if needed
            if (newBounds.x + newBounds.width > parentWidth) {
                newBounds.x = 0;
                newBounds.y += maxHeight;
                maxHeight = newBounds.height;
            } else if (newBounds.height > maxHeight) {
                maxHeight = newBounds.height;
            }

            childFigure.setBounds(newBounds);
            newBounds.x += newBounds.width;
        }
    }

    /**
     * Sort a list of figures so that all wrapping labels come first.
     * 
     * @param list a list of figures
     * @return a new list with wrapping labels first.
     */
    private static List<IFigure> sort(final List<IFigure> list) {
        List<IFigure> newList = new ArrayList<IFigure>(list.size());
        for (IFigure object : list) {
            if (object instanceof WrappingLabel) {
                newList.add(object);
            }
        }
        for (IFigure object : list) {
            if (!(object instanceof WrappingLabel)) {
                newList.add(object);
            }
        }
        return newList;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dimension getMinimumSize(final IFigure container, final int wHint, final int hHint) {
        return calculateMinimumSize(container, wHint, hHint);
    }
    
    /**
     * Performs calculation of the minimum size of the container.
     * 
     * @param container the container figure
     * @param wHint width hint
     * @param hHint height hint
     * @return the minimum size
     */
    protected Dimension calculateMinimumSize(final IFigure container,
            final int wHint, final int hHint) {
        Dimension minSize = new Dimension();
        IFigure nodeParent = getParentCompartment(container);
        Insets insets = calcInsets(nodeParent, container);
        @SuppressWarnings("unchecked")
        List<IFigure> children = container.getChildren();
        for (IFigure childFigure : children) {
            Dimension size;
            if ((childFigure.getChildren().size() > 0)
                    && (childFigure.getChildren().get(0) instanceof InvisibleLabelFigure)) {
                size = childFigure.getMinimumSize();
            } else {
                size = childFigure.getPreferredSize();
            }
            if (size.height > minSize.height) {
                minSize.height = size.height;
            }
            minSize.width += size.width;
        }
        minSize.expand(insets.left + insets.right, insets.top + insets.bottom);
        return minSize;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Dimension calculatePreferredSize(final IFigure container,
            final int wHint, final int hHint) {
        @SuppressWarnings("unchecked")
        List<IFigure> children = sort(container.getChildren());
        IFigure compartment = getParentCompartment(container);
        Insets insets = calcInsets(compartment, container);
        // use either the width hint or the width of the containing node
        int parentWidth = wHint <= 0 ? compartment.getParent().getBounds().width : wHint;
        int x = 0, y = 0, maxHeight = 0;
        for (IFigure childFigure : children) {
            Dimension size;
            if ((childFigure.getChildren() != null) && (childFigure.getChildren().size() > 0)
                    && (childFigure.getChildren().get(0) instanceof InvisibleLabelFigure)) {
                size = childFigure.getMinimumSize();
            } else {
                size = childFigure.getPreferredSize();
            }
            if (x + size.width > parentWidth) {
                x = 0;
                y += maxHeight;
                maxHeight = size.height;
            } else if (size.height > maxHeight) {
                maxHeight = size.height;
            }
            x += size.width;
        }
        return new Dimension(parentWidth, y + maxHeight + insets.top + insets.bottom);
    }

    /**
     * Determines the containing compartment by marching up the figure hierarchy.
     * 
     * @param container the figure to which the layout is attached
     * @return the containing compartment
     */
    private IFigure getParentCompartment(final IFigure container) {
        IFigure parent = container;
        while (!(parent instanceof ShapeCompartmentFigure)) {
            parent = parent.getParent();
        }
        return parent;
    }

    /**
     * Determines the insets for a parent figure, relative to the given child.
     * 
     * @param parent the figure of a parent edit part
     * @param child the figure of a child edit part
     * @return the insets to add to the relative coordinates of the child
     */
    private static Insets calcInsets(final IFigure parent, final IFigure child) {
        Insets result = new Insets(0);
        IFigure currentChild = child;
        IFigure currentParent = child.getParent();
        Point coordsToAdd = null;
        boolean isRelative = false;
        while (currentChild != parent && currentParent != null) {
            if (currentParent.isCoordinateSystem()) {
                isRelative = true;
                result.add(currentParent.getInsets());
                if (coordsToAdd != null) {
                    result.left += coordsToAdd.x;
                    result.top += coordsToAdd.y;
                }
                coordsToAdd = currentParent.getBounds().getLocation();
            } else if (currentParent == parent && coordsToAdd != null) {
                Point parentCoords = parent.getBounds().getLocation();
                result.left += coordsToAdd.x - parentCoords.x;
                result.top += coordsToAdd.y - parentCoords.y;
            }
            currentChild = currentParent;
            currentParent = currentChild.getParent();
        }
        if (!isRelative) {
            Rectangle parentBounds = parent.getBounds();
            Rectangle containerBounds = child.getParent().getBounds();
            result.left = containerBounds.x - parentBounds.x;
            result.top = containerBounds.y - parentBounds.y;
        }
        result.right = result.left;
        result.bottom = result.left;
        return result;
    }
    
}
