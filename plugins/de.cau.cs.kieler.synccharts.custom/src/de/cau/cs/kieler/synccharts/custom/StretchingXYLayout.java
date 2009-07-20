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

import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @author haf
 * 
 */
public class StretchingXYLayout extends XYLayout {

    /**
     * Implements the algorithm to layout the components of the given container
     * figure. Each component is laid out using its own layout constraint
     * specifying its size and position.
     * 
     * @see LayoutManager#layout(IFigure)
     */
    public void layout(IFigure parent) {
        // set bounds according to original simple XY layout first
        super.layout(parent);
        
        List<IFigure> children = parent.getChildren();
        Rectangle boundingBox = this.getBoundingBox(children);
        System.out.println("Bounding Box: "+boundingBox);
        
        for (IFigure child : children) {
            
            // get usual size of Figure
            Rectangle bounds = child.getBounds();
            System.out.print("Bounds: "+bounds );
            
            // calculate how much this figure can be stretched to each side
            int minEast = boundingBox.getBottomRight().x;
            int minSouth = boundingBox.getBottomRight().y;
            int minWest =  boundingBox.getTopLeft().x;
            int minNorth = boundingBox.getTopLeft().y;
            
            // check east side
            for (IFigure sibling : children) {
                if(sibling == child) continue;
                Rectangle siblingBounds = sibling.getBounds();
                if(child.intersects(siblingBounds)){
                    minEast = 0;
                    minSouth = 0;
                    minWest = 0;
                    minNorth = 0;
                    System.out.println("Intersects "+siblingBounds);
                }
                else{
                    // check if sibling is right of us
                    minEast = getMin(bounds.getTopRight().x, bounds.getTopRight().y, bounds.getBottomRight().y,
                                 siblingBounds.getTopLeft().x, siblingBounds.getTopLeft().y, siblingBounds.getBottomLeft().y, minEast);
                }
            }
            // now adjust bounds according to the minimal possible value
            bounds.width = minEast - bounds.x;
            
            // check south side
            for (IFigure sibling : children) {
                if(sibling == child) continue;
                Rectangle siblingBounds = sibling.getBounds();
                    minSouth = getMin(bounds.getBottomRight().y, bounds.getBottomLeft().x, bounds.getBottomRight().x,
                            siblingBounds.getTopRight().y, siblingBounds.getTopLeft().x, siblingBounds.getTopRight().x, minSouth);
                }
            bounds.height = minSouth - bounds.y;

            // check north side
            for (IFigure sibling : children) {
                if(sibling == child) continue;
                Rectangle siblingBounds = sibling.getBounds();
                    minNorth = getMax(bounds.getTopLeft().y, bounds.getBottomLeft().x, bounds.getBottomRight().x,
                            siblingBounds.getBottomLeft().y, siblingBounds.getTopLeft().x, siblingBounds.getTopRight().x, minNorth);
                }
            // make sure the south border stays at the old position
            bounds.height += bounds.y - minNorth;
            bounds.y = minNorth;
            
            // check west side
            for (IFigure sibling : children) {
                if(sibling == child) continue;
                Rectangle siblingBounds = sibling.getBounds();
                    minWest = getMax(bounds.getTopLeft().x, bounds.getTopLeft().y, bounds.getBottomLeft().y,
                            siblingBounds.getTopRight().x, siblingBounds.getTopRight().y, siblingBounds.getBottomRight().y, minWest);
                }
            // make sure the south border stays at the old position
            bounds.width += bounds.x - minWest;
            bounds.x = minWest;
            
            // reapply the new bounds
            System.out.println(" New: "+bounds);
            child.setBounds(bounds);
        }
    }
    
    int getMin(int myValToChange, int myVal1, int myVal2, int siblingValToChange, int siblingVal1, int siblingVal2, int minVal){
        if(myValToChange <= siblingValToChange){
            // also sibling is in an intersecting height
            if((myVal1 >= siblingVal1 &&
                myVal1 <= siblingVal2) 
                ||
                (myVal2 >= siblingVal1 &&
                 myVal2 <= siblingVal2)
                ||
                (myVal1 <= siblingVal1 &&
                myVal2 >= siblingVal2)
            ){
                // now check if it is nearer than something we've seen before
                if(siblingValToChange < minVal)
                    return siblingValToChange;
            }
        }
        return minVal;
    }
    
    int getMax(int myValToChange, int myVal1, int myVal2, int siblingValToChange, int siblingVal1, int siblingVal2, int minVal){
        if(myValToChange >= siblingValToChange){
            // also sibling is in an intersecting height
            if((myVal1 >= siblingVal1 &&
                myVal1 <= siblingVal2) 
                ||
                (myVal2 >= siblingVal1 &&
                 myVal2 <= siblingVal2)
                ||
                (myVal1 <= siblingVal1 &&
                myVal2 >= siblingVal2)
            ){
                // now check if it is nearer than something we've seen before
                if(siblingValToChange > minVal)
                    return siblingValToChange;
            }
        }
        return minVal;
    }
    
    Rectangle getBoundingBox(List<IFigure> children){
        Rectangle boundingBox = new Rectangle(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        for (IFigure child : children) {
            Rectangle bounds = child.getBounds();
            if(bounds.getTopLeft().x < boundingBox.getTopLeft().x)
                boundingBox.x = bounds.getTopLeft().x;
            if(bounds.getTopLeft().y < boundingBox.getTopLeft().y)
                boundingBox.y = bounds.getTopLeft().y; 
            if(bounds.getBottomRight().x > boundingBox.getBottomRight().x)
                boundingBox.width = boundingBox.width + bounds.getBottomRight().x - boundingBox.getBottomRight().x;
            if(bounds.getBottomRight().y > boundingBox.getBottomRight().y)
                boundingBox.height = boundingBox.height + bounds.getBottomRight().y - boundingBox.getBottomRight().y;
        }
        return boundingBox;
    }
}
