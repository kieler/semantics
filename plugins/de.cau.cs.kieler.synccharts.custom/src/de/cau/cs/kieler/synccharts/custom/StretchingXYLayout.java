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

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * A Draw2D Layout Manager that leaves all children at their original positions,
 * but stretches their bounds such that they fully cover their bounding box.
 * It bases on the standard XYLayout and hence uses the coordinates and 
 * dimensions set in the constraints of each child.
 * Then it iterates all children and for each child decides how far its bounds 
 * may be extended without overlapping.
 * 
 * TODO: This manager still has some limitations:
 *  - It's hardly usable for an interactive environment where the user
 *    needs to manually move items around
 *  - Introducing new children is problematic, because all previous
 *    children might already take all available space
 *    
 * Hence for now it is not used in KIELER.
 * @author haf
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
        //Rectangle boundingBox = this.getBoundingBox(children);
        Rectangle boundingBox = parent.getClientArea();
        //Rectangle boundingBox = parent.getBounds();
        
        if(this.preferredSize == null){
            this.preferredSize = new Dimension();
        }
            this.preferredSize.height = boundingBox.height;
            this.preferredSize.width = boundingBox.width;
        
        System.out.println("Parent Bounds: "+parent.getBounds());
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
                    // don't change bounds if there are intersections
                    minEast = -1;
                    minSouth = -1;
                    minWest = -1;
                    minNorth = -1;
                    System.out.println("Intersects "+siblingBounds);
                }
                else{
                    // check if sibling is right of us
                    minEast = getMin(bounds.getTopRight().x, bounds.getTopRight().y, bounds.getBottomRight().y,
                                 siblingBounds.getTopLeft().x, siblingBounds.getTopLeft().y, siblingBounds.getBottomLeft().y, minEast);
                }
            }
            // now adjust bounds according to the minimal possible value
            if(minEast >= 0)
                bounds.width = minEast - bounds.x;
            
            // check south side
            for (IFigure sibling : children) {
                if(sibling == child) continue;
                Rectangle siblingBounds = sibling.getBounds();
                    minSouth = getMin(bounds.getBottomRight().y, bounds.getBottomLeft().x, bounds.getBottomRight().x,
                            siblingBounds.getTopRight().y, siblingBounds.getTopLeft().x, siblingBounds.getTopRight().x, minSouth);
                }
            if(minSouth >= 0)
                bounds.height = minSouth - bounds.y;

            // check north side
            for (IFigure sibling : children) {
                if(sibling == child) continue;
                Rectangle siblingBounds = sibling.getBounds();
                    minNorth = getMax(bounds.getTopLeft().y, bounds.getBottomLeft().x, bounds.getBottomRight().x,
                            siblingBounds.getBottomLeft().y, siblingBounds.getTopLeft().x, siblingBounds.getTopRight().x, minNorth);
                }
            // make sure the south border stays at the old position
            if(minNorth >= 0){
                bounds.height += bounds.y - minNorth;
                bounds.y = minNorth;
            }
            
            // check west side
            for (IFigure sibling : children) {
                if(sibling == child) continue;
                Rectangle siblingBounds = sibling.getBounds();
                    minWest = getMax(bounds.getTopLeft().x, bounds.getTopLeft().y, bounds.getBottomLeft().y,
                            siblingBounds.getTopRight().x, siblingBounds.getTopRight().y, siblingBounds.getBottomRight().y, minWest);
                }
            // make sure the south border stays at the old position
            if(minWest >= 0){
                bounds.width += bounds.x - minWest;
                bounds.x = minWest;
            }
            
            // reapply the new bounds
            System.out.println(" New: "+bounds);
            child.setBounds(bounds);
        }
    }
    
    /**
     * Given the values of an actual child and of one sibling, decide whether
     * the sibling influences the amount of stretching by returning
     * the minimal value to which it might be stretched.
     * @param myValToChange the actual coordinate to be stretched (either x or y)
     * @param myVal1 first reference value to determine whether the sibling is 
     *               affecting the child or not
     * @param myVal2 second reference value to determine whether the sibling is 
     *               affecting the child or not
     * @param siblingValToChange the corresponding coordinate of the sibling
     * @param siblingVal1 first reference value to determine whether the sibling 
     *                     is affecting the child or not
     * @param siblingVal2 second reference value to determine whether the 
     *                    sibling is affecting the child or not
     * @param minVal Default value if the sibling is not affecting the child
     * @return Minimum of the child's value and the sibling's value iff 
     *        the sibling is affecting the child
     */
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
    
    /**
     * Given the values of an actual child and of one sibling, decide whether
     * the sibling influences the amount of stretching by returning
     * the maximal value to which it might be stretched.
     * @param myValToChange the actual coordinate to be stretched (either x or y)
     * @param myVal1 first reference value to determine whether the sibling is 
     *               affecting the child or not
     * @param myVal2 second reference value to determine whether the sibling is 
     *               affecting the child or not
     * @param siblingValToChange the corresponding coordinate of the sibling
     * @param siblingVal1 first reference value to determine whether the sibling 
     *                     is affecting the child or not
     * @param siblingVal2 second reference value to determine whether the 
     *                    sibling is affecting the child or not
     * @param maxVal Default value if the sibling is not affecting the child
     * @return Maximum of the child's value and the sibling's value iff 
     *        the sibling is affecting the child
     */
    int getMax(int myValToChange, int myVal1, int myVal2, int siblingValToChange, int siblingVal1, int siblingVal2, int maxVal){
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
                if(siblingValToChange > maxVal)
                    return siblingValToChange;
            }
        }
        return maxVal;
    }
    
    /**
     * Calculate the bounding box of the figures in the given list.
     * @param children the list of figures
     * @return bounding box of the list of figure
     */
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
