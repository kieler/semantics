/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.ui.figures.layout;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;

/**
 * A border item locator for entity and port labels.
 * 
 * @author msp
 */
public class LabelLocator extends BorderItemLocator {

    /**
     * Creates a label locator.
     * 
     * @param parent
     *            the parent figure
     * @param side
     *            the side
     */
    public LabelLocator(final IFigure parent, final int side) {
        super(parent, side);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rectangle getValidLocation(final Rectangle proposedLocation, final IFigure borderItem) {
        Rectangle location = new Rectangle(proposedLocation);
        if (proposedLocation.x == 0 && proposedLocation.y == 0) {
            Rectangle parentBorder = getParentBorder();
            Dimension offset = getBorderItemOffset();
            Dimension size = borderItem.getSize();
            switch (getPreferredSideOfParent()) {
            case PositionConstants.EAST:
                location.x = parentBorder.x + parentBorder.width - offset.width;
                location.y = parentBorder.y + (parentBorder.height - size.height) / 2;
                break;
            case PositionConstants.WEST:
                location.x = parentBorder.x - size.width + offset.width;
                location.y = parentBorder.y + (parentBorder.height - size.height) / 2;
                break;
            case PositionConstants.NORTH:
                location.x = parentBorder.x + (parentBorder.width - size.width) / 2;
                location.y = parentBorder.y - size.height + offset.height;
                break;
            default:
                location.x = parentBorder.x + (parentBorder.width - size.width) / 2;
                location.y = parentBorder.y + parentBorder.height - offset.height;
            }
        } else {
            int side = findClosestSideOfParent(proposedLocation, getParentBorder());
            Point newTopLeft = locateOnBorder(location.getTopLeft(), side, 0, borderItem);
            location.setLocation(newTopLeft);
        }
        if (location.getSize().isEmpty()) {
            location.setSize(borderItem.getPreferredSize());
        }
        return location;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void relocate(final IFigure borderItem) {
        Rectangle validLocation = getValidLocation(getConstraint(), borderItem);
        borderItem.setBounds(validLocation);
    }

}
