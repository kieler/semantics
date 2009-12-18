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

import java.util.List;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * Represents invisible figures, which usually serve as container for labels.
 * This is the figure for objects that are not supposed to be seen,
 * such as the background figures needed for signal and action labels.
 * 
 * @author schm
 */
public class InvisibleLabelFigure extends Shape {

     /**
     * The constructor.
     */
    public InvisibleLabelFigure() {
        super();
        setFill(false);
        setOutline(false);
    }

    private static final int WIDTH_GROW = 5;
    
    /**
     * Return the preferred size of the figure. This is usually a size that is
     * big enough to contain all its inner elements. The preferred size of the
     * invisible figure is the maximum preferred size of all its child labels.
     * 
     * @param hint width hint
     * @param hint2 height hint
     * @return The preferred size of the figure.
     */
    @Override
    public Dimension getPreferredSize(final int hint, final int hint2) {
        List<?> children = this.getChildren();
        Dimension prefSize = new Dimension();
        for (Object child : children) {
            if (child instanceof WrappingLabel) {
                WrappingLabel label = (WrappingLabel) child;
                int width = label.getPreferredSize().width + WIDTH_GROW;
                if (width > prefSize.width) {
                    prefSize.width = width;
                }
                int height = label.getPreferredSize().height;
                if (height > prefSize.height) {
                    prefSize.height = height;
                }
            }
        }
        return prefSize;
    }

    /**
     * Return the minimum size of the figure. Here it is the same as the
     * preferred size.
     * 
     * @param hint width hint
     * @param hint2 height hint
     * @return The minimum size of the figure.
     */
    @Override
    public Dimension getMinimumSize(final int hint, final int hint2) {
        return getPreferredSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void fillShape(final Graphics graphics) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void outlineShape(final Graphics graphics) {
    }
    
}
