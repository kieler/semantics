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
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * A layout for compartments that lays out the compartment's children in rows,
 * which are wrapped around if they are longer than the available space.
 * 
 * @author schm
 */
public class ListCompartmentLayout extends XYLayout {

    /**
     * Apply the layout.
     * 
     * @param parent the figure
     */
    public void layout(final IFigure parent) {
        if (!parent.isVisible()) {
            return;
        }

        @SuppressWarnings("unchecked")
        List<IFigure> children = sort(parent.getChildren());
        Rectangle clientArea = parent.getClientArea();
        int width = clientArea.width;
        Rectangle newBounds = new Rectangle();
        int maxHeight = 0;

        for (IFigure childFigure : children) {
            // First decide whether the compartment is one of those that need a
            // special layout, which are those that contain attribute aware invisible
            // figures; for these, only their minimum size is considered.
            if ((childFigure.getChildren() != null) && (childFigure.getChildren().size() > 0)
                    && (childFigure.getChildren().get(0) instanceof InvisibleLabelFigure)) {
                newBounds.width = childFigure.getMinimumSize().width;
                newBounds.height = childFigure.getMinimumSize().height;
            } else {
                newBounds.width = childFigure.getPreferredSize().width;
                newBounds.height = childFigure.getPreferredSize().height;
            }

            // The figures are laid out in rows and wrapped around if needed
            if (newBounds.x + newBounds.width > width) {
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
     * Calculate the preferred size of the figure.
     */
//    @Override
//    protected Dimension calculatePreferredSize(final IFigure parent,
//            final int whint, final int hhint) {
//        return parent.getPreferredSize(whint, hhint);
//    }
    
}
