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

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @author haf
 * 
 */
public class NeighborAwareOpenRectangleFigure extends OpenRectangleFigure {

    private int siblingLevel = 1;

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

    @Override
    public void setBounds(Rectangle rect) {
        super.setBounds(rect);
    }

    @Override
    public void realRepaint() {
        super.realRepaint();
        allCheck();
    }

    public void setSiblingLevel(int level) {
        this.siblingLevel = level;
    }

}
