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

    private int originalStyle = -1;

    private int style = -1;

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
     * @param eObject
     *            the EObject to highlight
     * @param editor
     *            the editor to highlight in
     */
    public StateActivityHighlightEffect(final EObject eObject, final DiagramEditor editor) {
        EditPart editPart = ModelingUtil.getEditPart(editor.getDiagramEditPart(), eObject);
        if (editPart instanceof GraphicalEditPart) {
            targetFigure = ((GraphicalEditPart) editPart).getFigure();
            if (targetFigure.getChildren().size() == 1) {
                targetFigure = (IFigure) targetFigure.getChildren().get(0);
            }
        }
    }

    /**
     * Create a new instance for the given edit part using the given color.
     * 
     * @param eObject
     *            the EObject to highlight
     * @param editor
     *            the editor to highlight in
     * @param lineStyle
     *            the line style to use for borders (black/white mode)
     */
    public StateActivityHighlightEffect(final EObject eObject, final DiagramEditor editor,
            final int lineStyle) {
        this(eObject, editor);
        style = lineStyle;
        color = null;
    }

    /**
     * Create a new instance for the given edit part using the given color.
     * 
     * @param eObject
     *            the EObject to highlight
     * @param editor
     *            the editor to highlight in
     * @param color
     *            the color to use for highlighting
     * @param lineStyle
     *            the line style to use for borders (black/white mode)
     */
    public StateActivityHighlightEffect(final EObject eObject, final DiagramEditor editor,
            final Color highlightColor, final int lineStyle) {
        this(eObject, editor, highlightColor);
        style = lineStyle;
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
        this(eObject, editor);
        color = highlightColor;
    }

    /**
     * {@inheritDoc}
     */
    public void execute() {
        if (targetFigure != null) {
            if (targetFigure instanceof Shape) {
                Shape shape = (Shape) targetFigure;
                // line width
                if (originalWidth == -1) {
                    originalWidth = shape.getLineWidth();
                    shape.setLineWidth(Math.min(originalWidth + widthIncrease, widthMax));
                }
                // line style, black & white mode
                if (originalStyle == -1) {
                    originalStyle = shape.getLineStyle();
                }
                if (style != -1) {
                    shape.setLineStyle(style);
                } else {
                    shape.setLineStyle(originalStyle);
                }
            }

            // papyrus line width
            if (targetFigure.getBorder() instanceof RoundedRectangleBorder && originalWidth == -1) {
                originalWidth = ((RoundedRectangleBorder) targetFigure.getBorder()).getWidth();
                ((RoundedRectangleBorder) targetFigure.getBorder()).setWidth(Math.min(originalWidth
                        + widthIncrease, widthMax));
            }

            // color
            if (originalColor == null) {
                originalColor = targetFigure.getForegroundColor();
            }
            if (color != null) {
                targetFigure.setForegroundColor(color);
                for (Object child : targetFigure.getChildren()) {
                    if (child instanceof WrappingLabel) {
                        ((WrappingLabel) child).setForegroundColor(originalColor);
                    }
                }
            } else {
                targetFigure.setForegroundColor(originalColor);
            }
            targetFigure.repaint();
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
        if (targetFigure instanceof Shape && originalStyle != -1) {
            ((Shape) targetFigure).setLineStyle(originalStyle);
        }
        if (targetFigure.getBorder() instanceof RoundedRectangleBorder && originalWidth != -1) {
            ((RoundedRectangleBorder) targetFigure.getBorder()).setWidth(originalWidth);
        }
        targetFigure.repaint();
        originalColor = null;
        originalWidth = -1;
        originalStyle = -1;
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
                    originalStyle = otherEffect.originalStyle;
                    return this;
                }
            }
        }
        return null;
    }

}
