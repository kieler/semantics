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
 * 
 *****************************************************************************/
package de.cau.cs.kieler.core.model.figures;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * An interface for figures which have a rounded rectangle shape and need to
 * provide a connection anchor.
 * 
 * @author mri
 * @kieler.ignore (excluded from review process)
 */
public interface IRoundedRectangleAnchorableFigure extends IFigure {

    /**
     * Returns the rounded rectangles corner dimensions.
     * 
     * @return the corner dimensions
     */
    Dimension getCornerDimensions();

    /**
     * Returns the rounded rectangles bounds.
     * 
     * @return the bounds
     */
    Rectangle getRoundedRectangleBounds();
}
