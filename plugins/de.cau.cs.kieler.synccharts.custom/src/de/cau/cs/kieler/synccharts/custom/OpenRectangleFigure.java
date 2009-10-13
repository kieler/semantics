/******************************************************************************
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
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * A rectangle figure that can be configured to draw only specific
 * outline sides, e.g. omit drawing one or multiple lines.
 * @author haf
 *
 */
public class OpenRectangleFigure extends Shape {

    /** boolean flag that indicate whether this side shall be drawn */
    protected boolean north = true;
    /** boolean flag that indicate whether this side shall be drawn */
    protected boolean south = true;
    /** boolean flag that indicate whether this side shall be drawn */
    protected boolean west = true;
    /** boolean flag that indicate whether this side shall be drawn */
    protected boolean east = true;
    
    /** earlier bounds to check if bounds have changed
     */
    protected Rectangle preBounds;
    /** earlier bounds to check if bounds have changed
     */
    protected Rectangle preParentBounds;

    /**
     * Set which sides of the rectangle shall be drawn. If a value is true, 
     * the side gets drawn. It is not drawn otherwise
     * @param north north side
     * @param east east side
     * @param south south side
     * @param west west side
     */
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
    
    /**
     * Really repaint the Figure, i.e. the coordinates or dimensions
     * have been changed. This method may be overriden by subclasses to
     * do some action only when the figure has changed.
     * 
     * The base implementation does nothing.
     */
    public void realRepaint(){
        // empty, may be extended by subclasses
    }
    
    /**
     * Test whether the realRepaint should be called or not. May be 
     * overriden by subclasse. Default always to true.
     * @return true
     */
    public boolean shouldRepaint(){
        return true;
    }
    
    /**
     * Draws the outline of the shape, i.e. a rectangle where not all
     * border get drawn but only those specified by the setDrawSide() method.
     * @see Shape#outlineShape(Graphics)
     */
    protected void outlineShape(Graphics graphics) {
        // first part is taken from original rectangle
        float lineInset = Math.max(1.0f, getLineWidthFloat()) / 2.0f;
        int inset1 = (int)Math.floor(lineInset);
        int inset2 = (int)Math.ceil(lineInset);

        Rectangle r = Rectangle.SINGLETON.setBounds(getBounds());
        
        if(shouldRepaint())
            this.realRepaint();
                
        r.x += inset1 ; 
        r.y += inset1; 
        r.width -= inset1 + inset2;
        r.height -= inset1 + inset2;
        
        // here only draw certain sides
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
