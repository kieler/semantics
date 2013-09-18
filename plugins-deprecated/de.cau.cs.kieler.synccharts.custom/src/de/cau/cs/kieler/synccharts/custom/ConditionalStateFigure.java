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

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

/**
 * A filled circle with a 'C' inside, used for conditional states.
 * 
 * @author schm
 * @kieler.ignore (excluded from review process)
 */
public class ConditionalStateFigure extends Ellipse {

    /**
     * The constructor.
     */
    public ConditionalStateFigure() {
        super();
        this.setFill(true);
        this.setLineWidth(1);
        this.setForegroundColor(ColorConstants.black);
        this.setBackgroundColor(ColorConstants.black);
    }

    /**
     * Overriding BackgroundColor because otherwise also conditional states will be set a background
     * color automatically to the default background color set in the preferences.
     * 
     * @return the local background Color
     */
    @Override
    public Color getLocalBackgroundColor() {
        return ColorConstants.black;
    }

    private static final int C_SIZE_QUOT = 3;
    private static final int C_ARC_OFFSET = 45;
    private static final int C_ARC_LENGTH = 270;
    
    /**
     * Draw the outline of the circle and a 'C' inside.
     * 
     * @param graphics the graphics object
     */
    @Override
    protected void outlineShape(final Graphics graphics) {
        Rectangle t = Rectangle.SINGLETON;
        t.setBounds(getBounds());
        t.width--;
        t.height--;
        t.shrink((lineWidth - 1) / 2, (lineWidth - 1) / 2);
        graphics.setBackgroundColor(getBackgroundColor());
        graphics.drawOval(t);

        // Calculate the bounds of the "C"
        Rectangle f = Rectangle.SINGLETON;
        Rectangle r = getBounds();
        f.width = r.width / C_SIZE_QUOT;
        f.height = r.height / C_SIZE_QUOT;
        f.x = r.x + f.width;
        f.y = r.y + f.height;

        // Draw the "C"
        graphics.setForegroundColor(ColorConstants.white);
        graphics.drawArc(f, C_ARC_OFFSET, C_ARC_LENGTH);
    }

}
