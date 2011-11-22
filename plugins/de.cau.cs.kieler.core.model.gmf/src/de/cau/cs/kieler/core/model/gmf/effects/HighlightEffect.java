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
package de.cau.cs.kieler.core.model.gmf.effects;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.Shape;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.RoundedRectangleBorder;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.IWorkbenchPart;

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.core.kivi.IEffect;
import de.cau.cs.kieler.core.kivi.UndoEffect;
import de.cau.cs.kieler.core.model.GraphicalFrameworkService;
import de.cau.cs.kieler.core.ui.util.MonitoredOperation;

/**
 * A simple transient highlighting effect. Can change line colors, line styles, and line widths for
 * Shapes and NodeFigures.
 * 
 * @author mmu
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

    private Map<IFigure, Color> originalColor = new HashMap<IFigure, Color>();

    private Color color = ColorConstants.red;

    private Map<IFigure, Color> originalBackgroundColor = new HashMap<IFigure, Color>();

    private Color backgroundColor;

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
    public HighlightEffect(final EObject eObject, final IWorkbenchPart editor) {
        EditPart editPart = GraphicalFrameworkService.getInstance().getBridge(editor)
                .getEditPart(editor, eObject);
        if (editPart instanceof GraphicalEditPart) {
            targetEditPart = (GraphicalEditPart) editPart;
            targetFigure = targetEditPart.getFigure();
            if (targetFigure instanceof NodeFigure && targetFigure.getChildren().size() >= 1) {
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
    public HighlightEffect(final EObject eObject, final IWorkbenchPart editor, final int lineStyle) {
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
    public HighlightEffect(final EObject eObject, final IWorkbenchPart editor,
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
     *            the color to use for highlighting
     * @param background
     *            the color to use for painting the background
     * @param lineStyle
     *            the line style to use for borders (black/white mode)
     */
    public HighlightEffect(final EObject eObject, final IWorkbenchPart editor,
            final Color highlightColor, final Color background, final int lineStyle) {
        this(eObject, editor, highlightColor, lineStyle);
        backgroundColor = background;
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
    public HighlightEffect(final EObject eObject, final IWorkbenchPart editor,
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
     * @param background
     *            the color to use for painting the background
     */
    public HighlightEffect(final EObject eObject, final IWorkbenchPart editor,
            final Color highlightColor, final Color background) {
        this(eObject, editor, highlightColor);
        backgroundColor = background;
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
    public HighlightEffect(final EObject eObject, final IWorkbenchPart editor,
            final Color highlightColor, final boolean children) {
        this(eObject, editor, highlightColor);
        highlightChildren = children;
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
     * @param background
     *            the color to use for painting the background
     * @param children
     *            true if labels should be highlighted in the given color as well
     */
    public HighlightEffect(final EObject eObject, final IWorkbenchPart editor,
            final Color highlightColor, final Color background, final boolean children) {
        this(eObject, editor, highlightColor, children);
        backgroundColor = background;
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
                if (targetFigure instanceof DefaultSizeNodeFigure) {
                	targetFigure = (IFigure)((DefaultSizeNodeFigure) targetFigure).getChildren().get(0);
                if (targetFigure instanceof BorderedNodeFigure) {
                    BorderedNodeFigure bnf = (BorderedNodeFigure) targetFigure;
                    if (bnf.getChildren().size() > 0) {
                        targetFigure = (IFigure) bnf.getChildren().get(0);
                        if (targetFigure instanceof DefaultSizeNodeFigure) {
                            DefaultSizeNodeFigure dsnf = (DefaultSizeNodeFigure) targetFigure;
                            if (dsnf.getChildren().size() > 0) {
                                targetFigure = (IFigure) dsnf.getChildren().get(0);
                            }
                        }
                    }

                    if (changeWidth && originalWidth == -1) {
                        originalWidth = bnf.getLineWidth();

                        // bnf.setLineWidth(Math.min(
                        // originalWidth + widthIncrease, widthMax));
                    }
                    if (style != -1) {
                        if (originalStyle == -1) {
                            originalStyle = bnf.getLineStyle();
                        }
                        bnf.setLineStyle(style);
                    }
                    bnf.repaint();
                }
                }

                // foreground color
                if (color != null) {
                    setColor(targetFigure, color, true);
                    if (highlightChildren) {
                        for (Object o : targetEditPart.getChildren()) {
                            if (o instanceof GraphicalEditPart) {
                                setColor(((GraphicalEditPart) o).getFigure(), color, true);
                            }
                        }
                    }
                } else {
                    resetColor(targetFigure, true);
                }
                // background color
                if (backgroundColor != null) {
                    setColor(targetFigure, backgroundColor, false);
                    if (highlightChildren) {
                        for (Object o : targetEditPart.getChildren()) {
                            if (o instanceof GraphicalEditPart) {
                                setColor(((GraphicalEditPart) o).getFigure(), backgroundColor, false);
                            }
                        }
                    }
                } else {
                    resetColor(targetFigure, false);
                }
            }
        }, true);
    }

    @Override
    public void undo() {
        MonitoredOperation.runInUI(new Runnable() {
            public void run() {
                if (targetFigure == null) {
                    return;
                }
                // Papyrus case
                if (targetFigure instanceof BorderedNodeFigure) {
                    BorderedNodeFigure bnf = (BorderedNodeFigure) targetFigure;
                    if (bnf.getChildren().size() > 0) {
                        targetFigure = (IFigure) bnf.getChildren().get(0);
                        if (targetFigure instanceof DefaultSizeNodeFigure) {
                            DefaultSizeNodeFigure dsnf = (DefaultSizeNodeFigure) targetFigure;
                            if (dsnf.getChildren().size() > 0) {
                                targetFigure = (IFigure) dsnf.getChildren().get(0);
                            }
                        }
                    }
                }

                // reset foreground and background color
                resetColor(targetFigure, true);
                resetColor(targetFigure, false);
                if (highlightChildren) {
                    for (Object o : targetEditPart.getChildren()) {
                        if (o instanceof GraphicalEditPart) {
                            resetColor(((GraphicalEditPart) o).getFigure(), true);
                            resetColor(((GraphicalEditPart) o).getFigure(), false);
                        }
                    }
                }

                // reset width and line style
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

                originalColor = null;
                originalBackgroundColor = null;
                originalWidth = -1;
                originalStyle = -1;

            }
        }, false);
    }
    
    /**
     * Set the color of the given figure.
     * 
     * @param figure a figure
     * @param c the new color
     * @param foreground true for foreground, false for background
     */
    private void setColor(final IFigure figure, final Color c, final boolean foreground) {
        if (foreground) {
            if (!originalColor.containsKey(figure)) {
                originalColor.put(figure, figure.getForegroundColor());
            }
            figure.setForegroundColor(c);
        } else {
            if (!originalBackgroundColor.containsKey(figure)) {
                originalBackgroundColor.put(figure, figure.getBackgroundColor());
            }
            figure.setBackgroundColor(c);
        }
    }
    
    /**
     * Reset the given figure to its original color.
     * 
     * @param figure a figure
     * @param foreground true for foreground, false for background
     */
    private void resetColor(final IFigure figure, final boolean foreground) {
        if (foreground) {
            Color c = originalColor.get(figure);
            if (c != null) {
                figure.setForegroundColor(c);
            }
        } else {
            Color c = originalBackgroundColor.get(figure);
            if (c != null) {
                figure.setBackgroundColor(c);
            }
        }
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
                originalBackgroundColor = otherEffect.originalBackgroundColor;
                originalWidth = otherEffect.originalWidth;
                originalStyle = otherEffect.originalStyle;
                return this;
            }
        } else if (other instanceof UndoEffect) {
            IEffect undo = ((UndoEffect) other).getEffect();
            if (undo instanceof HighlightEffect) {
                HighlightEffect otherEffect = (HighlightEffect) undo;
                if (otherEffect.targetFigure == targetFigure) {
                    // TODO: FIXME bad hack
                    if (otherEffect.targetFigure instanceof BorderedNodeFigure) {
                        BorderedNodeFigure bnf = (BorderedNodeFigure) otherEffect.targetFigure;
                        IFigure border = bnf.getBorderItemContainer();
                        while (border.getChildren().size() > 0) {
                            border.getChildren().remove(0);
                        }
                    }
                    originalColor = otherEffect.originalColor;
                    originalBackgroundColor = otherEffect.originalBackgroundColor;
                    originalWidth = otherEffect.originalWidth;
                    originalStyle = otherEffect.originalStyle;
                    return this;
                }
            }
        }
        return null;
    }

}
