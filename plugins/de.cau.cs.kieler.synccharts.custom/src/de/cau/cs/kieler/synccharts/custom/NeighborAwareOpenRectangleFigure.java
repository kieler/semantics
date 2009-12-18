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

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;

/**
 * An OpenRectangleFigure that draws only its outline sides under certain
 * conditions. It iterates its sibling figures and determines which are
 * neighbors on which sides and how far they are away.
 * <p>
 * In general it draws only its east and south border. Even then only iff at the
 * corresponding side there is a neighbor. If there is no neighbor (e.g. if the
 * figure is at the lower bottom of its parent) then the side is not drawn.
 * <p>
 * If the neighbors are too far away, the corresponding site still gets drawn to
 * get clear bounds if the children are laid out sparsely.
 * 
 * @author haf
 */
public class NeighborAwareOpenRectangleFigure extends OpenRectangleFigure {

    private static final int DEF_MARGIN = 10;
    
    /** Determine on which hierarchy level siblings are expected. */
    private int siblingLevel = 1;
    /** Margin size for rectangle lines. */
    private int margin = DEF_MARGIN;

    /**
     * Iterate your siblings and determine if they are neighbors and on what
     * sides and how far away. Configure your side drawing accordingly.
     */
    public void checkNeighbors() {
        this.setNorth(false);
        this.setEast(false);
        this.setSouth(false);
        this.setWest(false);

        IFigure parent = this;
        for (int i = siblingLevel; i > 0; i--) {
            parent = parent.getParent();
        }

        if (parent != null) {
            List<?> siblings = parent.getChildren();
            Rectangle myBounds = this.getBounds();
            Rectangle herBounds = null;
            int northDistance = Integer.MAX_VALUE;
            int westDistance = Integer.MAX_VALUE;
            int eastDistance = Integer.MAX_VALUE;
            int southDistance = Integer.MAX_VALUE;
            for (Object sibling : siblings) {
                if (sibling != this && sibling instanceof IFigure) {
                    herBounds = ((IFigure) sibling).getBounds();
                    // check if the sibling is east or south and only then draw the border
                    if (myBounds.getTopRight().x <= herBounds.getTopLeft().x) {
                        this.setEast(true);
                    }
                    if (myBounds.getBottomLeft().y <= herBounds.getTopLeft().y) {
                        this.setSouth(true);
                    }
                    // check if there is also something west or north. Then
                    // we check if it is too far away so it would make sense
                    // to draw the border
                    int dist = myBounds.getTopLeft().x
                            - herBounds.getTopRight().x;
                    if (dist >= 0 && westDistance > dist) {
                        westDistance = dist;
                    }
                    dist = myBounds.getTopLeft().y
                            - herBounds.getBottomRight().y;
                    if (dist >= 0 && northDistance > dist) {
                        northDistance = dist;
                    }
                    // check how far we are from the border
                    dist = myBounds.getTopLeft().x;
                    if (dist >= 0 && westDistance > dist) {
                        westDistance = dist;
                    }
                    dist = myBounds.getTopLeft().y;
                    if (dist >= 0 && northDistance > dist) {
                        northDistance = dist;
                    }
                    dist = parent.getClientArea().getBottomRight().x
                            - myBounds.getBottomRight().x;
                    if (dist >= 0 && eastDistance > dist) {
                        eastDistance = dist;
                    }
                    dist = parent.getClientArea().getBottomRight().y
                            - myBounds.getBottomRight().y;
                    if (dist >= 0 && southDistance > dist) {
                        southDistance = dist;
                    }
                }
            }
            // don't draw if we are too near (either parent border or neighbor)
            if (westDistance < Integer.MAX_VALUE && westDistance > this.margin) {
                this.setWest(true);
            }
            if (northDistance < Integer.MAX_VALUE
                    && northDistance > this.margin) {
                this.setNorth(true);
            }
            if (eastDistance < Integer.MAX_VALUE && eastDistance > this.margin) {
                this.setEast(true);
            }
            if (southDistance < Integer.MAX_VALUE
                    && southDistance > this.margin) {
                this.setSouth(true);
            }
        }
    }

    /**
     * Indicate that all sibling shall check for their neighbors. This is likely
     * be called whenever this figure has been modified (e.g. moved) and all
     * siblings have to be checked whether this is still a neighbor or not.
     */
    public void allCheck() {
        IFigure parent = this;
        for (int i = siblingLevel; i > 0; i--) {
            parent = parent.getParent();
        }
        if (parent != null) {

            List<?> siblings = parent.getChildren();
            for (Object sibling : siblings) {
                if (sibling instanceof IFigure) {
                    List<?> children = ((IFigure) sibling).getChildren();
                    for (int i = siblingLevel - 1; i > 0; i--) {
                        if (children.size() >= 1) {
                            Object child = children.get(0);
                            if (child instanceof IFigure) {
                                children = ((IFigure) child).getChildren();
                            }
                            if (child instanceof NeighborAwareOpenRectangleFigure) {
                                ((NeighborAwareOpenRectangleFigure) child)
                                        .checkNeighbors();
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Overriding the realRepaint() method in order to trigger a check for
     * neighborhood for all siblings whenever this figure is modified.
     */
    @Override
    public void realRepaint() {
        super.realRepaint();
        allCheck();
    }

    /**
     * Overriding shouldRepaint to test whether the sides must be checked again.
     * Will return true either if this bounds have changed or the bounds of the
     * "real" parent.
     * 
     * @return true if the figure should repaint
     */
    @Override
    public boolean shouldRepaint() {
        Rectangle r = Rectangle.SINGLETON.setBounds(getBounds());
        if (getPreBounds() == null || !r.equals(getPreBounds())) {
            setPreBounds(r.getCopy());
            return true;
        } else {
            // find the "real" parent and not only the plate on which the
            // region is drawn
            IFigure myParent = this;
            while (myParent != null
                    && !(myParent instanceof ShapeCompartmentFigure)) {
                myParent = myParent.getParent();
            }
            if (myParent != null) {
                Rectangle parentBounds = myParent.getBounds();
                if (getPreParentBounds() == null
                        || !parentBounds.equals(getPreParentBounds())) {
                    setPreParentBounds(parentBounds.getCopy());
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Set the hierarchy level on which this figure searches for sibling
     * neighbors. In a complex context (e.g. in the Eclipse Graphical Editing
     * Framework or Graphical Modeling Framework) the
     * NeigborAwareOpenRectangleFigures might be nested in an additional parent.
     * Like:
     * <ul>
     *   <li>Parent Figure</li>
     *   <li><ul>
     *     <li>DefaultSizeNodeFigure</li>
     *     <li><ul>
     *         <li>NeighborAwareOpenRectangleFigure</li>
     *     </ul></li>
     *     <li>DefaultSizeNodeFigure</li>
     *     <li><ul>
     *       <li>NeighborAwareOpenRectangleFigure</li>
     *     </ul></li>
     *     <li>DefaultSizeNodeFigure</li>
     *     <li><ul>
     *       <li>NeighborAwareOpenRectangleFigure</li>
     *     </ul></li>
     *     <li>...</li>
     *   </ul></li>
     * </ul>
     * 
     * Hence this siblingLevel tells the figure not only look into its parent,
     * but the corresponding amount of levels up in the hierarchy and just then
     * dive back into it. For simplicity this only covers the simple trees like
     * shown above and not arbitrary trees.
     * 
     * @param level
     *            the hierarchy level which shall be used to find sibling
     *            elements.
     */
    public void setSiblingLevel(final int level) {
        this.siblingLevel = level;
    }

    /**
     * Set the margin from either the border of the parent or siblings at which
     * the corresponding sides shall be drawn no matter what. This can help to
     * clarify a nodes bounds if it is too far away from its neighbors or the
     * parent bounds.
     * 
     * @param themargin the desired margin.
     */
    public void setNoDrawMargin(final int themargin) {
        this.margin = themargin;
    }
}
