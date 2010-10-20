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
package de.cau.cs.kieler.core.model.effects;

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
import de.cau.cs.kieler.core.ui.util.MonitoredOperation;

/**
 * A simple transient highlighting effect. Can change line colors, line styles, and line widths for
 * Shapes and NodeFigures.
 * 
 * 
 * @author mmu
 * 
 */
public class HighlightEffect extends AbstractEffect {

    private IFigure targetFigure;

    private GraphicalEditPart targetEditPart;

    private int originalWidth = -1;

    private int widthIncrease = 1;

    // SUPPRESS CHECKSTYLE NEXT MagicNumber
    private int widthMax = 5;

    private int originalStyle = -1;

    private int style = -1;

    private Color originalColor;

    private Color color = ColorConstants.red;

    private boolean highlightChildren = false;

    private boolean changeWidth = true;

    /**
     * Create a new instance for the given edit part using the given color.
     * 
     * @param eObject
     *            the EObject to highlight
     * @param editor
     *            the editor to highlight in
     */
    public HighlightEffect(final EObject eObject, final DiagramEditor editor) {
        EditPart editPart = ModelingUtil.getEditPart(editor.getDiagramEditPart(), eObject);
        if (editPart instanceof GraphicalEditPart) {
            targetEditPart = (GraphicalEditPart) editPart;
            targetFigure = targetEditPart.getFigure();
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
    public HighlightEffect(final EObject eObject, final DiagramEditor editor, final int lineStyle) {
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
     * @param highlightColor
     *            the color to use for highlighting
     * @param lineStyle
     *            the line style to use for borders (black/white mode)
     */
    public HighlightEffect(final EObject eObject, final DiagramEditor editor,
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
    public HighlightEffect(final EObject eObject, final DiagramEditor editor,
            final Color highlightColor) {
        this(eObject, editor);
        color = highlightColor;
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
     * @param children
     *            true if labels should be highlighted in the given color as well
     */
    public HighlightEffect(final EObject eObject, final DiagramEditor editor,
            final Color highlightColor, final boolean children) {
        this(eObject, editor, highlightColor);
        highlightChildren = children;
    }

    /**
     * {@inheritDoc}
     */
    public void execute() {
        MonitoredOperation.runInUI(new Runnable() {
            public void run() {
                if (targetFigure == null) {
                    return;
                }

                if (targetFigure instanceof Shape) {
                    Shape shape = (Shape) targetFigure;
                    // line width
                    if (changeWidth && originalWidth == -1) {
                        originalWidth = shape.getLineWidth();
                        shape.setLineWidth(Math.min(originalWidth + widthIncrease, widthMax));
                    } else if (!changeWidth && originalWidth != -1) {
                        shape.setLineWidth(originalWidth);
                        originalWidth = -1;
                    }
                    // line style, black & white mode
                    if (style != -1) {
                        if (originalStyle == -1) {
                            originalStyle = shape.getLineStyle();
                        }
                        shape.setLineStyle(style);
                    } else if (originalStyle != -1) {
                        shape.setLineStyle(originalStyle);
                    }
                }

                // Papyrus
                if (targetFigure.getBorder() instanceof RoundedRectangleBorder) {
                    if (changeWidth && originalWidth == -1) {
                        originalWidth = ((RoundedRectangleBorder) targetFigure.getBorder())
                                .getWidth();
                        ((RoundedRectangleBorder) targetFigure.getBorder()).setWidth(Math.min(
                                originalWidth + widthIncrease, widthMax));
                    }
                    if (style != -1) {
                        if (originalStyle == -1) {
                            originalStyle = ((RoundedRectangleBorder) targetFigure.getBorder())
                                    .getStyle();
                        }
                        ((RoundedRectangleBorder) targetFigure.getBorder()).setStyle(style);
                    }
                }

                // color
                if (originalColor == null) {
                    originalColor = targetFigure.getForegroundColor();
                }
                if (color != null) {
                    targetFigure.setForegroundColor(color);
                    if (highlightChildren) {
                        for (Object o : targetEditPart.getChildren()) {
                            if (o instanceof GraphicalEditPart) {
                                // potential issue: original color of children may be different?
                                ((GraphicalEditPart) o).getFigure().setForegroundColor(color);
                            }
                        }
                    } else {
                        for (Object child : targetFigure.getChildren()) {
                            if (child instanceof WrappingLabel) {
                                ((WrappingLabel) child).setForegroundColor(originalColor);
                            }
                        }
                    }
                } else {
                    targetFigure.setForegroundColor(originalColor);
                }
            }
        }, true); // TODO investigate whether false works - would be massively faster
        // targetFigure.repaint();
    }

    @Override
    public void undo() {
        MonitoredOperation.runInUI(new Runnable() {
            public void run() {
                if (targetFigure == null) {
                    return;
                }

                if (originalColor != null) {
                    targetFigure.setForegroundColor(originalColor);
                    if (highlightChildren) {
                        for (Object o : targetEditPart.getChildren()) {
                            if (o instanceof GraphicalEditPart) {
                                ((GraphicalEditPart) o).getFigure().setForegroundColor(
                                        originalColor);
                            }
                        }
                    }
                }

                if (targetFigure instanceof Shape) {
                    if (originalWidth != -1) {
                        ((Shape) targetFigure).setLineWidth(originalWidth);
                    }
                    if (originalStyle != -1) {
                        ((Shape) targetFigure).setLineStyle(originalStyle);
                    }
                }

                if (targetFigure.getBorder() instanceof RoundedRectangleBorder) {
                    if (originalWidth != -1) {
                        ((RoundedRectangleBorder) targetFigure.getBorder()).setWidth(originalWidth);
                    }
                    if (originalStyle != -1) {
                        ((RoundedRectangleBorder) targetFigure.getBorder()).setStyle(originalStyle);
                    }
                }

                // targetFigure.repaint();

                originalColor = null;
                originalWidth = -1;
                originalStyle = -1;

            }
        }, true);

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

    /**
     * Specify whether the outline width is increased during highlight or not.
     * 
     * @param change
     *            true if width shall be increased
     */
    public void setChangeWidth(final boolean change) {
        changeWidth = change;
    }

    /**
     * Set the line width increase.
     * 
     * @param newIncrease
     *            new line width increase in pixel
     */
    public void setWidthIncrease(final int newIncrease) {
        widthIncrease = newIncrease;
    }

    /**
     * Set the maximum line width.
     * 
     * @param newMaximum
     *            new maximum line width in pixel
     */
    public void setWidthMaximum(final int newMaximum) {
        widthMax = newMaximum;
    }

    @Override
    public boolean isMergeable() {
        return true;
    }

    @Override
    public IEffect merge(final IEffect other) {
        if (other instanceof HighlightEffect) {
            HighlightEffect otherEffect = (HighlightEffect) other;
            if (otherEffect.targetFigure == targetFigure) {
                originalColor = otherEffect.originalColor;
                originalWidth = otherEffect.originalWidth;
                originalStyle = otherEffect.originalStyle;
                return this;
            }
        } else if (other instanceof UndoEffect) {
            IEffect undo = ((UndoEffect) other).getEffect();
            if (undo instanceof HighlightEffect) {
                HighlightEffect otherEffect = (HighlightEffect) undo;
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
