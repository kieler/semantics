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

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * A rounded rectangle with a double border.
 * 
 * @author schm
 * 
 */
public class DoubleRoundedRectangle extends RoundedRectangle {

    int actualCornerWidth  = 0;
    int actualCornerHeight = 0;
    
    /**
     * The constructor.
     */
    // A class that draws two rectangles instead of only one
    public DoubleRoundedRectangle() {
        super();
    }

    /**
     * Draw the outline twice.
     */
    protected void outlineShape(Graphics graphics) {
        Rectangle f = Rectangle.SINGLETON;
        Rectangle r = getBounds();
        f.x = r.x + lineWidth / 2;
        f.y = r.y + lineWidth / 2;
        f.width = r.width - lineWidth;
        f.height = r.height - lineWidth;
        // calculate corners according to current dimensions
        actualCornerWidth = Math.min(corner.width, r.width);
        actualCornerHeight = Math.min(corner.height, r.height);
        
        graphics.drawRoundRectangle(f, actualCornerWidth, actualCornerHeight);
        // Draw the second rectangle inside the first one
        f.x += 3;
        f.y += 3;
        f.width -= 6;
        f.height -= 6;
        graphics.drawRoundRectangle(f, actualCornerWidth-6, actualCornerHeight-6);
    }
}
