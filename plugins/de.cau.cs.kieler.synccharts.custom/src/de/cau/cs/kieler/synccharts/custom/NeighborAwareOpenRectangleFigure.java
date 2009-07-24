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

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * An OpenRectangleFigure that draws only its outline sides under certain
 * conditions. It iterates its sibling figures and determines which are
 * neighbors on which sides and how far they are away.
 * <p>
 * In general it draws only its east and south border. Even then only iff 
 * at the corresponding side there is a neighbor. If there is no neighbor (e.g.
 * if the figure is at the lower bottom of its parent) then the side is not
 * drawn.
 * <p>
 * If the neighbors are too far away, the corresponding site still gets drawn
 * to get clear bounds if the children are laid out sparsely.
 *  
 * @author haf
 * 
 */
public class NeighborAwareOpenRectangleFigure extends OpenRectangleFigure {

    /**
     * Determine on which hierarchy level siblings are expected.
     */
    private int siblingLevel = 1;

    /**
     * Iterate your siblings and determine if they are neighbors and on
     * what sides and how far away. Configure your side drawing accordingly.
     */
    public void checkNeighbors() {
        this.north = false;
        this.east = false;
        this.south = false;
        this.west = false;

        IFigure parent = this;
        for (int i = siblingLevel; i > 0; i--) {
            parent = parent.getParent();
        }

        if (parent != null) {
            List siblings = parent.getChildren();
            Rectangle myBounds = this.getBounds();
            Rectangle herBounds = null;
            for (Object sibling : siblings) {
                if (sibling != this && sibling instanceof IFigure) {
                    herBounds = ((IFigure) sibling).getBounds();
                    if (myBounds.getTopRight().x <= herBounds.getTopLeft().x)
                        this.east = true;
                    if (myBounds.getBottomLeft().y <= herBounds.getTopLeft().y)
                        this.south = true;
                }
            }
        }
    }

    /**
     * Indicate that all sibling shall check for their neighbors. This is 
     * likely be called whenever this figure has been modified (e.g. moved) and
     * all siblings have to be checked whether this is still a neighbor or not.
     */
    public void allCheck() {
        IFigure parent = this;
        for (int i = siblingLevel; i > 0; i--) {
            parent = parent.getParent();
        }
        if (parent != null) {

            List siblings = parent.getChildren();
            for (Object sibling : siblings) {
                if (sibling instanceof IFigure) {
                    List children = ((IFigure) sibling).getChildren();
                    for (int i = siblingLevel - 1; i > 0; i--) {
                        if (children.size() >= 1) {
                            Object child = children.get(0);
                            if (child instanceof IFigure)
                                children = ((IFigure) child).getChildren();
                            if (child instanceof NeighborAwareOpenRectangleFigure)
                                ((NeighborAwareOpenRectangleFigure) child)
                                .checkNeighbors();
                        }
                    }
                }
            }
        }
    }

    /**
     * Overriding the realRepaint() method in order to trigger a check
     * for neighborhood for all siblings whenever this figure is modified.
     */
    @Override
    public void realRepaint() {
        super.realRepaint();
        allCheck();
    }

    /**
     * Set the hierarchy level on which this figure searches for sibling
     * neighbors. In a complex context (e.g. in the Eclipse Graphical Editing
     * Framework or Graphical Modeling Framework) the 
     * NeigborAwareOpenRectangleFigures might be nested in an additional parent.
     * Like:
     * <ul>
     *  <li>Parent Figure </li>
     *  <li>
     *          <ul>
     *                  <li>DefaultSizeNodeFigure</li>
     *                  <li> 
     *                  <ul>
     *                  <li> NeighborAwareOpenRectangleFigure</li>
     *                  </ul>
     *                  </li>
     *                  <li>DefaultSizeNodeFigure</li>
     *                  <li> 
     *                  <ul>
     *                  <li> NeighborAwareOpenRectangleFigure</li>
     *                  </ul>
     *                  </li>
     *                  <li>DefaultSizeNodeFigure</li>
     *                  <li> 
     *                  <ul>
     *                  <li> NeighborAwareOpenRectangleFigure</li>
     *                  </ul>
     *                  </li>
     *                  <li>...</li>
     *          </ul>
     *   </li>
     * </ul>
     * 
     * Hence this siblingLevel tells the figure not only look into its parent,
     * but the corresponding amount of levels up in the hierarchy and just then 
     * dive back into it. For simplicity this only covers the simple trees like
     * shown above and not arbitrary trees.
     * 
     * @param level the hierarchy level which shall be used to find
     *        sibling elements.
     */
    public void setSiblingLevel(int level) {
        this.siblingLevel = level;
    }

}
