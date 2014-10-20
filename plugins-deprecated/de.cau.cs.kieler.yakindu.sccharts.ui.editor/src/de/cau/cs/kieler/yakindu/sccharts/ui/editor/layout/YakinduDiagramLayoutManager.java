/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.sccharts.ui.editor.layout;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.yakindu.sct.ui.editor.editor.StatechartDiagramEditor;
import org.yakindu.sct.ui.editor.editor.figures.StateFigure;
import org.yakindu.sct.ui.editor.editparts.StatechartDiagramEditPart;

import de.cau.cs.kieler.kiml.gmf.GmfDiagramLayoutManager;

/**
 * Diagram layout manager specialization for Yakindu State Charts.
 * 
 * Added dependencies:
 * de.cau.cs.kieler.kiml.ui
 * de.cau.cs.kieler.kiml.gmf
 * 
 * @kieler.design proposed by cmot
 * @kieler.rating proposed yellow 2013-07-19 
 * @authorcmot
 */
public class YakinduDiagramLayoutManager extends GmfDiagramLayoutManager {

    /**
     * Calc insets.
     *
     * @param parent the parent
     * @param child the child
     * @return the insets
     */
    public Insets calcSpecificInsets(final IFigure parent, final IFigure child) {
        Insets result = new Insets(0);
        IFigure currentChild = child;
        IFigure currentParent = child.getParent();
        Point coordsToAdd = null;
        boolean isRelative = false;
        // follow the chain of parents in the figure hierarchy up to the given parent figure
        while (currentChild != parent && currentParent != null) {
            if (currentParent.isCoordinateSystem()) {
                // the content of the current parent is relative to that figure's position
                isRelative = true;
                result.add(currentParent.getInsets());
                if (coordsToAdd != null) {
                    // add the position of the previous parent with local coordinate system
                    result.left += coordsToAdd.x;
                    result.top += coordsToAdd.y;
                }
                coordsToAdd = currentParent.getBounds().getLocation();
            } else if (currentParent == parent && coordsToAdd != null) {
                // we found the top parent, and it does not have local coordinate system,
                // so subtract the parent's coordinates from the previous parent's position
                Point parentCoords = parent.getBounds().getLocation();
                result.left += coordsToAdd.x - parentCoords.x;
                result.top += coordsToAdd.y - parentCoords.y;
            }
            currentChild = currentParent;
            currentParent = currentChild.getParent();
        }
        if (!isRelative) {
            // there is no local coordinate system, so just subtract the coordinates
            Rectangle parentBounds = parent.getBounds();
            currentParent = child.getParent();
            Rectangle containerBounds = currentParent.getBounds();
            result.left = containerBounds.x - parentBounds.x;
            result.top = containerBounds.y - parentBounds.y;
        }
        // In theory it would be better to get the bottom and right insets from the size.
        // However, due to the inpredictability of Draw2D layout managers, this leads to
        // bad results in many cases, so a fixed insets value is more stable.
        System.out.println(currentChild.getClass().getName());
        if (currentChild instanceof NodeFigure) {
            result.left = result.left - 2;
            result.right = result.left - 5;
            result.bottom = result.left - 0;
        }
        else {
            result.right = result.left;
            result.bottom = result.left;
        }
        return result;
    }
    
    /**
     * {@inheritDoc}
     */
    public boolean supports(final Object object) {
        return (object instanceof StatechartDiagramEditor || object instanceof StatechartDiagramEditPart);
    }

    

}
