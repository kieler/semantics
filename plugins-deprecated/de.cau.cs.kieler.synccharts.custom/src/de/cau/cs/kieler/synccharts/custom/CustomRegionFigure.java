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

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;

/**
 * This class represents the attribute aware region figures, which are grey
 * dashed boxes.It extends NeighborAwareOpenRectangleFigure in order to reduce the
 * number of border lines that have to be drawn and make the diagram clearer.
 * 
 * @author schm
 * @author haf
 * @kieler.ignore (excluded from review process)
 */
public class CustomRegionFigure extends NeighborAwareOpenRectangleFigure {

    private static final int DASH_BLACK = 10;
    private static final int DASH_WHITE = 5;
    private static final int NO_DRAW_MARGIN = 10;
    
    /**
     * The constructor.
     */
    public CustomRegionFigure() {
        super();

        setFill(false);
        setLineWidth(1);
        setLineStyle(Graphics.LINE_CUSTOM);
        float[] fs = {DASH_BLACK, DASH_WHITE};
        setLineDash(fs);
        setForegroundColor(ColorConstants.gray);

        setNoDrawMargin(NO_DRAW_MARGIN);
        setSiblingLevel(2);
    }
    
}
