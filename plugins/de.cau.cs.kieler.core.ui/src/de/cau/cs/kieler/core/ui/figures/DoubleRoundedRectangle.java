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
package de.cau.cs.kieler.core.ui.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * A rounded rectangle with a double border.
 * 
 * @kieler.rating 2010-01-26 proposed yellow msp
 * @author schm
 */
public class DoubleRoundedRectangle extends RoundedRectangle {

    /** width of the double rectangle border. */
    public static final int BORDER_WIDTH = 3;
    
    /**
     * The constructor.
     */
    public DoubleRoundedRectangle() {
        super();
    }

    /**
     * Draw the outline twice.
     * 
     * @param graphics the graphics object
     */
    protected void outlineShape(final Graphics graphics) {
        Rectangle rect = new Rectangle();
        Rectangle bounds = getBounds();
        rect.x = bounds.x + lineWidth / 2;
        rect.y = bounds.y + lineWidth / 2;
        rect.width = bounds.width - lineWidth;
        rect.height = bounds.height - lineWidth;
        // calculate corners according to current dimensions
        int cornerWidth = Math.min(corner.width, bounds.width);
        int cornerHeight = Math.min(corner.height, bounds.height);
        
        graphics.drawRoundRectangle(rect, cornerWidth, cornerHeight);
        // Draw the second rectangle inside the first one
        rect.x += BORDER_WIDTH;
        rect.y += BORDER_WIDTH;
        rect.width -=  2 * BORDER_WIDTH;
        rect.height -= 2 * BORDER_WIDTH;
        graphics.drawRoundRectangle(rect, cornerWidth - 2 * BORDER_WIDTH,
                cornerHeight - 2 * BORDER_WIDTH);
    }
}
