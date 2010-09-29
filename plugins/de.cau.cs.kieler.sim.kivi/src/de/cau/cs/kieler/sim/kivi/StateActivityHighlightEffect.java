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
package de.cau.cs.kieler.sim.kivi;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.draw2d.ui.figures.RoundedRectangleBorder;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.graphics.Color;

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.core.kivi.IEffect;
import de.cau.cs.kieler.core.kivi.UndoEffect;
import de.cau.cs.kieler.core.model.util.ModelingUtil;

/**
 * A simple transient highlighting effect.
 * 
 * @author mmu
 * 
 */
public class StateActivityHighlightEffect extends AbstractEffect {

    private IFigure targetFigure;

    private int originalWidth = -1;

    private int widthIncrease = 1; // TODO parameterize

    private int widthMax = 5; // TODO parameterize

    private Color originalColor;

    private Color color;

    /**
     * Default constructor.
     */
    public StateActivityHighlightEffect() {

    }

    /**
     * Create a new instance for the given edit part using the given color.
     * 
     * @param eObject
     *            the EObject to highlight
     * @param editor
     *            the editor to highlight in
     */
    public StateActivityHighlightEffect(final EObject eObject, final DiagramEditor editor) {
        this(eObject, editor, ColorConstants.red);
    }

    /**
     * Create a new instance for the given edit part using the given color.
     * 
     * @param eObject
     *            the EObject to highlight
     * @param editor
     *            the editor to highlight in
     * @param highlightColor
     *            the color to highlight the state with
     */
    public StateActivityHighlightEffect(final EObject eObject, final DiagramEditor editor,
            final Color highlightColor) {
        color = highlightColor;
        EditPart editPart = ModelingUtil.getEditPart(editor.getDiagramEditPart(), eObject);
        if (editPart instanceof GraphicalEditPart) {
            targetFigure = ((GraphicalEditPart) editPart).getFigure();
            if (targetFigure.getChildren().size() == 1) {
                targetFigure = (IFigure) targetFigure.getChildren().get(0);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    public void execute() {
        if (targetFigure != null) {
            if (originalColor == null) {
                originalColor = targetFigure.getForegroundColor();
            }
            if (targetFigure instanceof Shape && originalWidth == -1) {
                originalWidth = ((Shape) targetFigure).getLineWidth();
                ((Shape) targetFigure).setLineWidth(Math.min(originalWidth + widthIncrease,
                        widthMax));
            }
            // papyrus
            if (targetFigure.getBorder() instanceof RoundedRectangleBorder && originalWidth == -1) {
                originalWidth = ((RoundedRectangleBorder) targetFigure.getBorder()).getWidth();
                ((RoundedRectangleBorder) targetFigure.getBorder()).setWidth(Math.min(originalWidth
                        + widthIncrease, widthMax));
                targetFigure.repaint();
            }

            targetFigure.setForegroundColor(color);
            for (Object child : targetFigure.getChildren()) {
                if (child instanceof WrappingLabel) {
                    ((WrappingLabel) child).setForegroundColor(originalColor);
                }
            }
        }
    }

    @Override
    public void undo() {
        if (targetFigure != null && originalColor != null) {
            targetFigure.setForegroundColor(originalColor);
        }
        if (targetFigure instanceof Shape && originalWidth != -1) {
            ((Shape) targetFigure).setLineWidth(originalWidth);
        }
        if (targetFigure.getBorder() instanceof RoundedRectangleBorder && originalWidth != -1) {
            ((RoundedRectangleBorder) targetFigure.getBorder()).setWidth(originalWidth);
            targetFigure.repaint();
        }
        originalColor = null;
        originalWidth = -1;
    }

    /**
     * Set the color to use for highlighting.
     * 
     * @param c
     *            the color
     */
    public void setColor(final Color c) {
        color = c;
    }

    @Override
    public boolean isMergeable() {
        return true;
    }

    @Override
    public IEffect merge(final IEffect other) {
        if (other instanceof StateActivityHighlightEffect) {
            StateActivityHighlightEffect otherEffect = (StateActivityHighlightEffect) other;
            if (otherEffect.targetFigure == targetFigure) {
                return this;
            }
        } else if (other instanceof UndoEffect) {
            IEffect undo = ((UndoEffect) other).getEffect();
            if (undo instanceof StateActivityHighlightEffect) {
                StateActivityHighlightEffect otherEffect = (StateActivityHighlightEffect) undo;
                if (otherEffect.targetFigure == targetFigure) {
                    originalColor = otherEffect.originalColor;
                    originalWidth = otherEffect.originalWidth;
                    return this;
                }
            }
        }
        return null;
    }

}
