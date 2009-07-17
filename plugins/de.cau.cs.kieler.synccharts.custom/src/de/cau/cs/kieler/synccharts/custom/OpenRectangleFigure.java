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

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.ui.internal.dnd.SwtUtil;

/**
 * A rectangle figure that can be configured to draw only specific
 * outline sides, e.g. omit drawing one or multiple lines.
 * @author haf
 *
 */
public class OpenRectangleFigure extends Shape {

    protected boolean north = true;
    protected boolean south = true;
    protected boolean west = true;
    protected boolean east = true;
    
    // earlier bounds to check if bounds have changed
    protected Rectangle preBounds;
    
    public void setDrawSides(boolean north, boolean east, boolean south, boolean west){
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
    }
    
    /**
     * @see Shape#fillShape(Graphics)
     */
    protected void fillShape(Graphics graphics) {
            graphics.fillRectangle(getBounds());
    }
    
    public void realRepaint(){
        // empty, may be extended by subclasses
    }
    
    /**
     * @see Shape#outlineShape(Graphics)
     */
    protected void outlineShape(Graphics graphics) {
        float lineInset = Math.max(1.0f, getLineWidthFloat()) / 2.0f;
        int inset1 = (int)Math.floor(lineInset);
        int inset2 = (int)Math.ceil(lineInset);

        Rectangle r = Rectangle.SINGLETON.setBounds(getBounds());
        
        if( preBounds == null || ! r.equals(preBounds)){
            preBounds = r.getCopy();
            this.realRepaint();
        }
        
        r.x += inset1 ; 
        r.y += inset1; 
        r.width -= inset1 + inset2;
        r.height -= inset1 + inset2;
        
        //graphics.drawRectangle(r);
        if (north)
            graphics.drawLine(r.getTopLeft(), r.getTopRight());
        if (east)
            graphics.drawLine(r.getTopRight(), r.getBottomRight());
        if (south)
            graphics.drawLine(r.getBottomRight(), r.getBottomLeft());
        if (west)
            graphics.drawLine(r.getBottomLeft(), r.getTopLeft());
    }
}
