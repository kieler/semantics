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
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * A rectangle figure that can be configured to draw only specific
 * outline sides, e.g. omit drawing one or multiple lines.
 * 
 * @author haf
 */
public class OpenRectangleFigure extends Shape {

    /** boolean flag that indicate whether this side shall be drawn. */
    private boolean north = true;
    /** boolean flag that indicate whether this side shall be drawn. */
    private boolean south = true;
    /** boolean flag that indicate whether this side shall be drawn. */
    private boolean west = true;
    /** boolean flag that indicate whether this side shall be drawn. */
    private boolean east = true;
    
    /** earlier bounds to check if bounds have changed. */
    private Rectangle preBounds;
    /** earlier bounds to check if bounds have changed. */
    private Rectangle preParentBounds;

    /**
     * Set which sides of the rectangle shall be drawn. If a value is true, 
     * the side gets drawn. It is not drawn otherwise.
     * 
     * @param thenorth north side
     * @param theeast east side
     * @param thesouth south side
     * @param thewest west side
     */
    public void setDrawSides(final boolean thenorth, final boolean theeast,
            final boolean thesouth, final boolean thewest) {
        this.north = thenorth;
        this.east = theeast;
        this.south = thesouth;
        this.west = thewest;
    }
    
    /**
     * {@inheritDoc}
     */
    protected void fillShape(final Graphics graphics) {
        graphics.fillRectangle(getBounds());
    }
    
    /**
     * Really repaint the Figure, i.e. the coordinates or dimensions
     * have been changed. This method may be overridden by subclasses to
     * do some action only when the figure has changed.
     * 
     * The base implementation does nothing.
     */
    public void realRepaint() {
        // empty, may be extended by subclasses
    }
    
    /**
     * Test whether the realRepaint should be called or not. May be 
     * overridden by subclasses. Default always to true.
     * 
     * @return true
     */
    public boolean shouldRepaint() {
        return true;
    }
    
    /**
     * Draws the outline of the shape, i.e. a rectangle where not all
     * border get drawn but only those specified by the setDrawSide() method.
     * 
     * @param graphics the graphics object
     */
    protected void outlineShape(final Graphics graphics) {
        // first part is taken from original rectangle
        float lineInset = Math.max(1.0f, getLineWidthFloat()) / 2.0f;
        int inset1 = (int)Math.floor(lineInset);
        int inset2 = (int)Math.ceil(lineInset);

        Rectangle r = Rectangle.SINGLETON.setBounds(getBounds());
        
        if (shouldRepaint()) {
            realRepaint();
        }
                
        r.x += inset1;
        r.y += inset1; 
        r.width -= inset1 + inset2;
        r.height -= inset1 + inset2;
        
        // here only draw certain sides
        if (north) {
            graphics.drawLine(r.getTopLeft(), r.getTopRight());
        }
        if (east) {
            graphics.drawLine(r.getTopRight(), r.getBottomRight());
        }
        if (south) {
            graphics.drawLine(r.getBottomRight(), r.getBottomLeft());
        }
        if (west) {
            graphics.drawLine(r.getBottomLeft(), r.getTopLeft());
        }
    }

    /**
     * Sets the north.
     *
     * @param thenorth the north to set
     */
    protected void setNorth(final boolean thenorth) {
        this.north = thenorth;
    }

    /**
     * Returns the north.
     *
     * @return the north
     */
    protected boolean isNorth() {
        return north;
    }

    /**
     * Sets the south.
     *
     * @param thesouth the south to set
     */
    protected void setSouth(final boolean thesouth) {
        this.south = thesouth;
    }

    /**
     * Returns the south.
     *
     * @return the south
     */
    protected boolean isSouth() {
        return south;
    }

    /**
     * Sets the west.
     *
     * @param thewest the west to set
     */
    protected void setWest(final boolean thewest) {
        this.west = thewest;
    }

    /**
     * Returns the west.
     *
     * @return the west
     */
    protected boolean isWest() {
        return west;
    }

    /**
     * Sets the east.
     *
     * @param theeast the east to set
     */
    protected void setEast(final boolean theeast) {
        this.east = theeast;
    }

    /**
     * Returns the east.
     *
     * @return the east
     */
    protected boolean isEast() {
        return east;
    }

    /**
     * Sets the preBounds.
     *
     * @param thepreBounds the preBounds to set
     */
    protected void setPreBounds(final Rectangle thepreBounds) {
        this.preBounds = thepreBounds;
    }

    /**
     * Returns the preBounds.
     *
     * @return the preBounds
     */
    protected Rectangle getPreBounds() {
        return preBounds;
    }

    /**
     * Sets the preParentBounds.
     *
     * @param thepreParentBounds the preParentBounds to set
     */
    protected void setPreParentBounds(final Rectangle thepreParentBounds) {
        this.preParentBounds = thepreParentBounds;
    }

    /**
     * Returns the preParentBounds.
     *
     * @return the preParentBounds
     */
    protected Rectangle getPreParentBounds() {
        return preParentBounds;
    }
    
    
}
