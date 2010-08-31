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
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.graphics.Color;

import de.cau.cs.kieler.kivi.core.impl.AbstractEffect;

/**
 * A simple transient highlighting effect.
 * 
 * @author mmu
 * 
 */
public class StateActivityHighlightEffect extends AbstractEffect {

    private IFigure targetFigure;

    private Color originalColor;

    private Color color = ColorConstants.red;

    /**
     * Default constructor.
     */
    public StateActivityHighlightEffect() {

    }

    /**
     * Create a new instance for the given edit part using the given color.
     * 
     * @param e
     *            the edit part to highlight
     * @param c
     *            the color to use for highlighting
     */
    public StateActivityHighlightEffect(final GraphicalEditPart e, final Color c) {
        color = c;
        targetFigure = e.getFigure();
        if (targetFigure.getChildren().size() > 0) {
            targetFigure = (IFigure) targetFigure.getChildren().get(0);
        }
    }

    @Override
    public void execute() {
        originalColor = targetFigure.getForegroundColor();
        targetFigure.setForegroundColor(color);
        for (Object child : targetFigure.getChildren()) {
            if (child instanceof WrappingLabel) {
                ((WrappingLabel) child).setForegroundColor(originalColor);
            }
        }
    }

    @Override
    public void undo() {
        if (targetFigure != null && originalColor != null) {
            targetFigure.setForegroundColor(originalColor);
        }
    }
}
