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
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * A grey filled circle with a 'P' inside.
 * 
 * @author schm
 * 
 */
public class ConditionalStateFigure extends Ellipse {

    static final Font CONDITIONALFIGURE_FONT = new Font(Display.getCurrent(), "Sans", 12,
            SWT.NORMAL);

    /**
     * The constructor.
     */
    // A class that draws a 'C' inside of an ellipse
    public ConditionalStateFigure() {
        super();
        this.setFill(true);
        this.setLineWidth(1);
        this.setForegroundColor(ColorConstants.black);
        this.setBackgroundColor(ColorConstants.black);
    }

    /*
     * Overriding BackgroundColor because otherwise also conditional states will be set a background
     * color automatically to the default background color set in the preferences...
     * 
     * (non-Javadoc)
     * 
     * @see org.eclipse.draw2d.Figure#getLocalBackgroundColor()
     */
    @Override
    public Color getLocalBackgroundColor() {
        return ColorConstants.black;
    }

    /**
     * Draw the outline of the circle and a 'C' inside.
     */
    @Override
    protected void outlineShape(Graphics graphics) {
        Rectangle t = Rectangle.SINGLETON;
        t.setBounds(getBounds());
        t.width--;
        t.height--;
        t.shrink((lineWidth - 1) / 2, (lineWidth - 1) / 2);
        graphics.setBackgroundColor(this.getBackgroundColor());
        graphics.drawOval(t);
        // graphics.fillOval(t);

        // Calculate the bounds of the "C"
        Rectangle f = Rectangle.SINGLETON;
        Rectangle r = getBounds();
        f.x = r.x + (r.width / 3);
        f.y = r.y + (r.height / 3);
        f.width = r.width / 3;
        f.height = r.height / 3;

        //Draw the "C" 
        graphics.setForegroundColor(ColorConstants.white);
        graphics.drawArc(f, 45, 270);
    }

}
