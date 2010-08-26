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
package de.cau.cs.kieler.synccharts.kivi;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.gef.GraphicalEditPart;

import de.cau.cs.kieler.kivi.core.impl.AbstractEffect;

/**
 * A simple transient highlighting effect.
 * 
 * @author mmu
 * 
 */
public class StateActivityHighlightEffect extends AbstractEffect {

    private GraphicalEditPart editPart;
    private RectangleFigure highlightFigure;

    /**
     * Default constructor.
     */
    public StateActivityHighlightEffect() {

    }

    /**
     * Create a new instance for the given edit part.
     * 
     * @param e
     *            the edit part to highlight
     */
    public StateActivityHighlightEffect(final GraphicalEditPart e) {
        editPart = e;
    }

    @Override
    public void execute() {
        if (highlightFigure == null) {
            highlightFigure = new RectangleFigure();
            highlightFigure.setLineWidth(2);
            highlightFigure.setForegroundColor(ColorConstants.red);
            highlightFigure.setBounds(editPart.getFigure().getBounds());
            highlightFigure.setOpaque(true);
            highlightFigure.setFill(false);

            editPart.getFigure().add(highlightFigure);
        } else {
            highlightFigure.setForegroundColor(ColorConstants.blue);
        }
    }

    @Override
    public void undo() {
        if (highlightFigure != null) {
            editPart.getFigure().remove(highlightFigure);
            highlightFigure = null;
        }
    }

}
