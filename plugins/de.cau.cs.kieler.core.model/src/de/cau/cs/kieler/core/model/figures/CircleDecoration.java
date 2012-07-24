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
package de.cau.cs.kieler.core.model.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * A decoration that depicts a circle.
 * 
 * @author schm
 * @kieler.ignore (excluded from review process)
 */
public class CircleDecoration extends PolygonDecoration {

    /**
     * Sets the angle by which rotation is to be done on the PolygonDecoration.
     * This method has to be empty, otherwise the circle would change its size
     * at different angles.
     * 
     * @param angle angle of rotation
     */
    @Override
    public void setRotation(final double angle) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void outlineShape(final Graphics g) {
        Rectangle ovalBounds = getBounds().getCopy();
        ovalBounds.shrink(new Insets(1));
        g.drawOval(ovalBounds);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void fillShape(final Graphics g) {
        Rectangle ovalBounds = getBounds().getCopy();
        ovalBounds.shrink(new Insets(1));
        g.fillOval(ovalBounds);
    }

}
