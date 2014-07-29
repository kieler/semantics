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
package de.cau.cs.kieler.core.model.gmf.figures.layout;

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
 * @kieler.ignore (excluded from review process)
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
    
    /** whether the locator should handle the parents as ports. */
    private boolean portBehavior;
    
    /**
     * Sets whether the locator should handle the parents as ports.
     * 
     * @param theportBehavior the port behavior status
     */
    public void setPortBehavior(final boolean theportBehavior) {
        this.portBehavior = theportBehavior;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void relocate(final IFigure borderItem) {
        // gmf sets the constraint to 0,5 if no user constraint is set.
        // SUPPRESS CHECKSTYLE NEXT MagicNumber
        if (this.getConstraint().x == 0 && this.getConstraint().y == 5) {
            Rectangle validLocation = getValidLocation(null, borderItem);
            borderItem.setBounds(validLocation);
        } else {
            Point absoluteLocation = this.getAbsoluteToBorder(this.getConstraint().getLocation());
            borderItem.setBounds(new Rectangle(absoluteLocation, borderItem.getPreferredSize()));
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rectangle getValidLocation(final Rectangle proposedLocation, final IFigure borderItem) {
        Rectangle location = proposedLocation == null ? new Rectangle()
                : new Rectangle(proposedLocation);
        if (location.getSize().isEmpty()) {
            location.setSize(borderItem.getPreferredSize());
        }
        if (location.x == 0 && location.y == 0) {
            locate(location);
        } else {
            //location.setLocation(proposedLocation.getLocation().getCopy());
            int side = findClosestSideOfParent(proposedLocation, getParentBorder());
            Point newTopLeft = locateOnBorder(location.getLocation(), side, 0, borderItem);
            location.setLocation(newTopLeft);
        }
        return location;
    }
    
    /**
     * Find a suitable location for the given border item.
     * 
     * @param location the rectangle where the new location is written to
     * @param borderItem a border item
     */
    private void locate(final Rectangle location) {
        Rectangle parentBorder = getParentBorder();
        Dimension offset = getBorderItemOffset();
        if (portBehavior) {
            Rectangle nodeBorder = getParentFigure().getParent().getParent().getParent().getBounds();
            switch (calcPortSide(nodeBorder, parentBorder)) {
            case PositionConstants.EAST:
                location.x = parentBorder.x - offset.width;
                location.y = parentBorder.y + parentBorder.height - offset.height / 2;
                break;
            case PositionConstants.WEST:
                location.x = parentBorder.x + parentBorder.width - location.width + offset.width;
                location.y = parentBorder.y + parentBorder.height - offset.height / 2;
                break;
            case PositionConstants.NORTH:
                location.x = parentBorder.x + (parentBorder.width - location.width) / 2;
                location.y = parentBorder.y - location.height + offset.height;
                break;
            default:
                location.x = parentBorder.x + (parentBorder.width - location.width) / 2;
                location.y = parentBorder.y + parentBorder.height - offset.height;
            }
        } else {
            switch (getPreferredSideOfParent()) {
            case PositionConstants.EAST:
                location.x = parentBorder.x + parentBorder.width - offset.width;
                location.y = parentBorder.y + (parentBorder.height - location.height) / 2;
                break;
            case PositionConstants.WEST:
                location.x = parentBorder.x - location.width + offset.width;
                location.y = parentBorder.y + (parentBorder.height - location.height) / 2;
                break;
            case PositionConstants.NORTH:
                location.x = parentBorder.x + (parentBorder.width - location.width) / 2;
                location.y = parentBorder.y - location.height + offset.height;
                break;
            default:
                location.x = parentBorder.x + (parentBorder.width - location.width) / 2;
                location.y = parentBorder.y + parentBorder.height - offset.height;
            }
        }
    }
    
    /**
     * Calculates a side for the given port.
     * 
     * @param nodeBounds bounds of the parent node
     * @param portBounds bounds of the port
     * @return the port side
     */
    private static int calcPortSide(final Rectangle nodeBounds, final Rectangle portBounds) {
        int portx = portBounds.x + portBounds.width / 2;
        int porty = portBounds.y + portBounds.height / 2;
        if (portx <= nodeBounds.x) {
            return PositionConstants.WEST;
        } else if (portx >= nodeBounds.x + nodeBounds.width) {
            return PositionConstants.EAST;
        } else if (porty <= nodeBounds.y) {
            return PositionConstants.NORTH;
        } else if (porty >= nodeBounds.y + nodeBounds.height) {
            return PositionConstants.SOUTH;
        } else {
            return PositionConstants.NSEW;
        }
    }

}
