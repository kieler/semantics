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

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;

/**
 * A Layout similar to the FlowLayout, however, it will set a minimum size according to its
 * children's preffered sizes. It could be used to place Text Labels into som other figure. The parent
 * then will get the size of the bounding box of the text labels.
 * 
 * @author haf
 * @kieler.ignore (excluded from review process)
 */
public class ListLayout extends FlowLayout {

    @Override
    protected Dimension calculatePreferredSize(final IFigure container, final int wHint,
        final int hHint) {
        int width = 0;
        int height = 0;

        for (Object child : container.getChildren()) {
            if (child instanceof IFigure) {
                Dimension d = ((IFigure) child).getPreferredSize();
                if (this.isHorizontal()) {
                    width += d.width;
                    if (height < d.height) {
                        height = d.height;
                    }
                } else {
                    height += d.height;
                    if (width < d.width) {
                        width = d.width;
                    }
                }
            }
        }
        return new Dimension(width, height);
    }

}
