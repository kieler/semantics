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
import org.eclipse.gef.EditPart;

/**
 * This class represents the attribute aware region figures, which are grey
 * dashed boxes.
 * <p>
 * It is not really an AttributeAwareFigure, but only provides the same
 * constructor to be able to be used the same way from the GMF templates.
 * <p>
 * Instead, it extends NeighborAwareOpenRectangleFigure in order to reduce the
 * number of border lines that have to be drawn and make the diagram clearer.
 * 
 * @author schm
 * @author haf
 * 
 */
public class AttributeAwareRegionFigure extends NeighborAwareOpenRectangleFigure {

    private static final int DASH_BLACK = 10;
    private static final int DASH_WHITE = 5;
    private static final int NO_DRAW_MARGIN = 10;
    
    /**
     * The constructor. Actually the figures for regions do not need to be
     * attribute aware, but if they were not, the code templates would not work
     * since we cannot distinguish different classes in code templates
     * (at least I can't).
     * 
     * @param e The edit part the figure is supposed to watch.
     */
    public AttributeAwareRegionFigure(final EditPart e) {
        super();

        this.setFill(false);
        this.setLineWidth(1);
        this.setLineStyle(Graphics.LINE_CUSTOM);
        float[] fs = {DASH_BLACK, DASH_WHITE};
        this.setLineDash(fs);
        this.setForegroundColor(ColorConstants.gray);

        this.setNoDrawMargin(NO_DRAW_MARGIN);
        this.setSiblingLevel(2);
    }
    
}
