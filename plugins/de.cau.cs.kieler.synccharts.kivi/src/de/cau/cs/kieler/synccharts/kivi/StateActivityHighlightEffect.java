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
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;

import de.cau.cs.kieler.kivi.core.impl.AbstractEffect;

/**
 * A simple transient highlighting effect.
 * 
 * @author mmu
 * 
 */
public class StateActivityHighlightEffect extends AbstractEffect {

    private GraphicalEditPart graphicalEditPart;
    private ShapeEditPart shapeEditPart;

    private RectangleFigure highlightFigure;

    private int counter = 0;

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
        graphicalEditPart = e;
        if (e instanceof ShapeEditPart) {
            shapeEditPart = (ShapeEditPart) e;
        }
    }

    @Override
    public void execute() {
        if (shapeEditPart != null) {
            execute(shapeEditPart);
        } else {
            execute(graphicalEditPart);
        }
        counter++;
    }

    private void execute(final ShapeEditPart editPart) {
        // TODO
    }

    private void execute(final GraphicalEditPart editPart) {
        if (highlightFigure == null) {
            highlightFigure = new RectangleFigure();
            highlightFigure.setLineWidth(2);
            highlightFigure.setForegroundColor(ColorConstants.red);
            highlightFigure.setBounds(graphicalEditPart.getFigure().getBounds());
            highlightFigure.setOpaque(true);
            highlightFigure.setFill(false);

            graphicalEditPart.getFigure().add(highlightFigure);
        } else {
            highlightFigure.setForegroundColor(ColorConstants.blue);
        }
    }

    @Override
    public void undo() {
        if (shapeEditPart != null) {
            undo(shapeEditPart);
        } else {
            undo(graphicalEditPart);
        }
    }

    private void undo(final ShapeEditPart editPart) {
        // TODO
    }

    private void undo(final GraphicalEditPart editPart) {
        if (highlightFigure != null) {
            graphicalEditPart.getFigure().remove(highlightFigure);
            highlightFigure = null;
        }
    }

}
