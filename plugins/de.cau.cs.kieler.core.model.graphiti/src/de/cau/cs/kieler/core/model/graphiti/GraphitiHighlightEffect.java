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
package de.cau.cs.kieler.core.model.graphiti;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.graphiti.ui.internal.figures.GFAbstractShape;
import org.eclipse.swt.graphics.Color;

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.core.kivi.IEffect;
import de.cau.cs.kieler.core.kivi.UndoEffect;
import de.cau.cs.kieler.core.model.GraphicalFrameworkService;
import de.cau.cs.kieler.core.model.IGraphicalFrameworkBridge;
import de.cau.cs.kieler.core.ui.util.MonitoredOperation;
import de.cau.cs.kieler.core.util.Pair;

/**
 * A simple transient highlighting effect. Can change line colors, line styles,
 * and line widths for Shapes and NodeFigures.
 * 
 * 
 * @author soh
 * 
 */
@SuppressWarnings("restriction")
public class GraphitiHighlightEffect extends AbstractEffect {

    private static Map<GFAbstractShape, Pair<Color, Color>> originalColors =
            new HashMap<GFAbstractShape, Pair<Color, Color>>();

    private AbstractGraphicalEditPart targetEditPart;

    private int originalWidth = -1;

    private int originalStyle = -1;

    private Color originalColor;

    private Color color = ColorConstants.red;

    private Color originalBackgroundColor;

    private Color backgroundColor;

    /**
     * Create a new instance for the given edit part using the given color.
     * 
     * @param eObject
     *            the EObject to highlight
     * @param editor
     *            the editor to highlight in
     */
    public GraphitiHighlightEffect(final EObject eObject,
            final DiagramEditor editor) {
        IGraphicalFrameworkBridge bridge =
                GraphicalFrameworkService.getInstance().getBridge(editor);
        EditPart editPart = bridge.getEditPart(editor, eObject);
        if (editPart instanceof AbstractGraphicalEditPart) {
            targetEditPart = (AbstractGraphicalEditPart) editPart;
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
     * FIXME the line style is not implemented yet
     */
    public GraphitiHighlightEffect(final EObject eObject,
            final DiagramEditor editor, final int lineStyle) {
        this(eObject, editor);
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
     * FIXME the line style is not implemented yet
     */
    public GraphitiHighlightEffect(final EObject eObject,
            final DiagramEditor editor, final Color highlightColor,
            final int lineStyle) {
        this(eObject, editor, highlightColor);
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
     * FIXME the line style is not implemented yet
     */
    public GraphitiHighlightEffect(final EObject eObject,
            final DiagramEditor editor, final Color highlightColor,
            final Color background, final int lineStyle) {
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
    public GraphitiHighlightEffect(final EObject eObject,
            final DiagramEditor editor, final Color highlightColor) {
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
    public GraphitiHighlightEffect(final EObject eObject,
            final DiagramEditor editor, final Color highlightColor,
            final Color background) {
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
     *            true if labels should be highlighted in the given color as
     *            well
     */
    public GraphitiHighlightEffect(final EObject eObject,
            final DiagramEditor editor, final Color highlightColor,
            final boolean children) {
        this(eObject, editor, highlightColor);
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
     *            true if labels should be highlighted in the given color as
     *            well
     */
    public GraphitiHighlightEffect(final EObject eObject,
            final DiagramEditor editor, final Color highlightColor,
            final Color background, final boolean children) {
        this(eObject, editor, highlightColor, children);
        backgroundColor = background;
    }

    /**
     * {@inheritDoc}
     */
    public void execute() {
        MonitoredOperation.runInUI(new Runnable() {

            public void run() {
                if (targetEditPart == null) {
                    return;
                }

                IFigure figure = targetEditPart.getFigure();

                if (figure instanceof GFAbstractShape) {
                    GFAbstractShape f = (GFAbstractShape) figure;
                    originalColor = f.getForegroundColor();
                    originalBackgroundColor = f.getBackgroundColor();
                    applyColorRec(f);
                }
            }

            private void applyColorRec(final GFAbstractShape f) {
                applyColor(f);
                List<?> children = f.getChildren();
                for (Object o : children) {
                    if (!(o instanceof Label)) {
                        GFAbstractShape child = (GFAbstractShape) o;
                        applyColor(child);
                    }
                }
            }

            private void applyColor(final GFAbstractShape f) {
                if (!originalColors.containsKey(f)) {
                    originalColors.put(
                            f,
                            new Pair<Color, Color>(f.getForegroundColor(), f
                                    .getBackgroundColor()));
                }
                if (backgroundColor != null) {
                    f.setBackgroundColor(backgroundColor);
                }
                if (color != null) {
                    f.setForegroundColor(color);
                }
            }
        }, true);
    }

    @Override
    public void undo() {
        MonitoredOperation.runInUI(new Runnable() {
            public void run() {
                if (targetEditPart == null) {
                    return;
                }

                IFigure figure = targetEditPart.getFigure();
                if (figure instanceof GFAbstractShape) {
                    GFAbstractShape f = (GFAbstractShape) figure;
                    applyColorRec(f);
                }
                originalColor = null;
                originalBackgroundColor = null;
                originalWidth = -1;
                originalStyle = -1;

            }

            private void applyColorRec(final GFAbstractShape f) {
                applyColor(f);
                List<?> children = f.getChildren();
                for (Object o : children) {
                    if (!(o instanceof Label)) {
                        GFAbstractShape child = (GFAbstractShape) o;
                        applyColor(child);
                    }
                }
            }

            private void applyColor(final GFAbstractShape f) {
                Pair<Color, Color> colors = originalColors.remove(f);
                if (colors != null) {
                    f.setBackgroundColor(colors.getSecond());
                    f.setForegroundColor(colors.getFirst());
                }
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

    @Override
    public boolean isMergeable() {
        return true;
    }

    @Override
    public IEffect merge(final IEffect other) {
        if (other instanceof GraphitiHighlightEffect) {
            GraphitiHighlightEffect otherEffect =
                    (GraphitiHighlightEffect) other;
            if (otherEffect.targetEditPart == targetEditPart) {
                originalColor = otherEffect.originalColor;
                originalBackgroundColor = otherEffect.originalBackgroundColor;
                originalWidth = otherEffect.originalWidth;
                originalStyle = otherEffect.originalStyle;
                return this;
            }
        } else if (other instanceof UndoEffect) {
            IEffect undo = ((UndoEffect) other).getEffect();
            if (undo instanceof GraphitiHighlightEffect) {
                GraphitiHighlightEffect otherEffect =
                        (GraphitiHighlightEffect) undo;
                if (otherEffect.targetEditPart == targetEditPart) {
                    originalColor = otherEffect.originalColor;
                    originalBackgroundColor =
                            otherEffect.originalBackgroundColor;
                    originalWidth = otherEffect.originalWidth;
                    originalStyle = otherEffect.originalStyle;
                    return this;
                }
            }
        }
        return null;
    }

}
