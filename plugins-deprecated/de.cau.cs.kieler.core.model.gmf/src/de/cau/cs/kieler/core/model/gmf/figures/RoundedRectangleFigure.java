/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 *****************************************************************************/
package de.cau.cs.kieler.core.model.gmf.figures;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;

import de.cau.cs.kieler.core.model.figures.IRoundedRectangleAnchorableFigure;

/**
 * A 2D figure which provides anchoring on the outline of a rounded rectangle.
 * 
 * @author mri
 * @kieler.ignore (excluded from review process)
 */
public class RoundedRectangleFigure extends NodeFigure implements
        IRoundedRectangleAnchorableFigure {

    /** the default corner radius. */
    private static final int DEFAULT_CORNER_RADIUS = 8;

    /** The width and height radii applied to each corner. */
    private Dimension corner = new Dimension(DEFAULT_CORNER_RADIUS,
            DEFAULT_CORNER_RADIUS);

    /**
     * Constructs a RoundedRectangleFigure.
     */
    public RoundedRectangleFigure() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    protected void paintFigure(final Graphics g) {
        //Rectangle r = Rectangle.SINGLETON.setBounds(getBounds());
        //g.drawRoundRectangle(r, corner.width, corner.height);
    }

    /**
     * {@inheritDoc}
     */
    protected ConnectionAnchor createAnchor(final PrecisionPoint p) {
        if (p == null) {
            // If the old terminal for the connection anchor cannot be resolved
            // (by SlidableAnchor) a null
            // PrecisionPoint will passed in - this is handled here
            return createDefaultAnchor();
        }
        return new SlidableRoundedRectangleAnchor(this, p);
    }

    /**
     * {@inheritDoc}
     */
    protected ConnectionAnchor createDefaultAnchor() {
        return new SlidableRoundedRectangleAnchor(this);
    }

    /**
     * Sets the dimensions of each corner. This will form the radii of the arcs
     * which form the corners.
     * 
     * @param d
     *            the dimensions of the corner
     */
    public void setCornerDimensions(final Dimension d) {
        corner.width = d.width;
        corner.height = d.height;
    }

    /**
     * {@inheritDoc}
     */
    public Rectangle getRoundedRectangleBounds() {
        return getBounds();
    }

    /**
     * {@inheritDoc}
     */
    public Dimension getCornerDimensions() {
        return corner;
    }
}
