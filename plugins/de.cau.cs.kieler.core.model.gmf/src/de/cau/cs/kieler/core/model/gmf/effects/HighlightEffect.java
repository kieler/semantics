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
import org.eclipse.draw2d.Shape;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderedNodeFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.RoundedRectangleBorder;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.FillStyle;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.core.kivi.IEffect;
import de.cau.cs.kieler.core.kivi.UndoEffect;
import de.cau.cs.kieler.core.model.GraphicalFrameworkService;

/**
 * A simple transient highlighting effect. Can change line colors, line styles, and line widths for
 * Shapes and NodeFigures.
 * 
 * @author mmu
 */
public class HighlightEffect extends AbstractEffect {

    /** the figure that receives highlighting. */
    private IFigure targetFigure;
    /** the edit part that receives highlighting. */
    private GraphicalEditPart targetEditPart;
    /** the original line width of the target figure. */
    private int originalWidth = -1;
    /** how much to increase the line width of the target figure. */
    private int widthIncrease = 1;
    /** the maximal value for line width. 
     * SUPPRESS CHECKSTYLE NEXT MagicNumber */
    private int widthMax = 5;
    /** the original line style of the target figure. */
    private int originalStyle = -1;
    /** the new line style. */
    private int lineStyle = -1;
    /** the original foreground colors of the affected figures. */
    private Map<IFigure, Color> originalColor = new HashMap<IFigure, Color>();
    /** the new foreground highlight color. */
    private Color foregroundColor;
    /** the original background colors of the affected figures. */
    private Map<IFigure, Color> originalBackgroundColor = new HashMap<IFigure, Color>();
    /** the new background highlight color. */
    private Color backgroundColor;
    /** true if direct children such as labels should be highlighted in the given color as well. */
    private boolean highlightChildren = false;
    /** whether the line width should be changed. */
    private boolean changeWidth = true;
    /** true if highlighting should be persistent. */
    private boolean persistent = false;
    /** the command used for persistent highlighting. */
    private HighlightCommand highlightCommand;

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
            this.targetEditPart = (GraphicalEditPart) editPart;
            this.targetFigure = targetEditPart.getFigure();
            if (targetFigure instanceof NodeFigure && targetFigure.getChildren().size() >= 1) {
                targetFigure = (IFigure) targetFigure.getChildren().get(0);
            }
        }
        this.foregroundColor = ColorConstants.red;
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
        this.lineStyle = lineStyle;
        this.foregroundColor = null;
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
        this.lineStyle = lineStyle;
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
        this.backgroundColor = background;
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
     */
    public HighlightEffect(final EObject eObject, final IWorkbenchPart editor,
            final Color highlightColor) {
        this(eObject, editor);
        this.foregroundColor = highlightColor;
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
     */
    public HighlightEffect(final EObject eObject, final IWorkbenchPart editor,
            final Color highlightColor, final Color background) {
        this(eObject, editor, highlightColor);
        this.backgroundColor = background;
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
     * @param children
     *            true if labels should be highlighted in the given color as well
     */
    public HighlightEffect(final EObject eObject, final IWorkbenchPart editor,
            final Color highlightColor, final boolean children) {
        this(eObject, editor, highlightColor);
        this.highlightChildren = children;
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
     * @param children
     *            true if labels should be highlighted in the given color as well
     */
    public HighlightEffect(final EObject eObject, final IWorkbenchPart editor,
            final Color highlightColor, final Color background, final boolean children) {
        this(eObject, editor, highlightColor, children);
        this.backgroundColor = background;
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
     * @param children
     *            true if labels should be highlighted in the given color as well
     * @param persistent
     *            true if highlighting should be persistent
     */
    public HighlightEffect(final EObject eObject, final IWorkbenchPart editor,
            final Color highlightColor, final Color background, final boolean children,
            final boolean persistent) {
        this(eObject, editor, highlightColor, background, children);
        this.persistent = persistent;
    }

    /**
     * {@inheritDoc}
     */
    public void execute() {
        if (persistent && targetEditPart instanceof IGraphicalEditPart) {
            IGraphicalEditPart gmfEditPart = (IGraphicalEditPart) targetEditPart;
            TransactionalEditingDomain editingDomain = gmfEditPart.getEditingDomain();
            highlightCommand = new HighlightCommand(editingDomain, gmfEditPart.getNotationView());
            editingDomain.getCommandStack().execute(highlightCommand);
        } else {
            applyHighlight();
        }
    }
    
    /**
     * Apply the highlight state by directly manipulating the target figure.
     */
    private void applyHighlight() {
        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
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
                    if (lineStyle != -1) {
                        if (originalStyle == -1) {
                            originalStyle = shape.getLineStyle();
                        }
                        shape.setLineStyle(lineStyle);
                    } else if (originalStyle != -1) {
                        shape.setLineStyle(originalStyle);
                    }
                }

                // Papyrus
                if (targetFigure instanceof DefaultSizeNodeFigure) {
                    targetFigure = (IFigure) ((DefaultSizeNodeFigure) targetFigure)
                            .getChildren().get(0);
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
                        if (lineStyle != -1) {
                            if (originalStyle == -1) {
                                originalStyle = bnf.getLineStyle();
                            }
                            bnf.setLineStyle(lineStyle);
                        }
                        bnf.repaint();
                    }
                }

                // foreground color
                if (foregroundColor != null) {
                    setColor(targetFigure, foregroundColor, true);
                    if (highlightChildren) {
                        for (Object o : targetEditPart.getChildren()) {
                            if (o instanceof GraphicalEditPart) {
                                setColor(((GraphicalEditPart) o).getFigure(), foregroundColor, true);
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
                                setColor(((GraphicalEditPart) o).getFigure(), backgroundColor,
                                        false);
                            }
                        }
                    }
                } else {
                    resetColor(targetFigure, false);
                }
            }
        });
    }

    @Override
    public void undo() {
        if (persistent && highlightCommand != null) {
            IGraphicalEditPart gmfEditPart = (IGraphicalEditPart) targetEditPart;
            TransactionalEditingDomain editingDomain = gmfEditPart.getEditingDomain();
            highlightCommand.undo = true;
            editingDomain.getCommandStack().execute(highlightCommand);
        } else {
            undoHighlight();
        }
    }
    
    /**
     * Reset the highlight state by directly manipulating the target figure.
     */
    private void undoHighlight() {
        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
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
        });
    }

    /**
     * Set the color of the given figure.
     * 
     * @param figure
     *            a figure
     * @param c
     *            the new color
     * @param foreground
     *            true for foreground, false for background
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
     * @param figure
     *            a figure
     * @param foreground
     *            true for foreground, false for background
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
        foregroundColor = c;
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

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMergeable() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IEffect merge(final IEffect other) {
        if (other instanceof HighlightEffect) {
            HighlightEffect otherEffect = (HighlightEffect) other;
            if (otherEffect.targetFigure == this.targetFigure) {
                this.originalColor = otherEffect.originalColor;
                this.originalBackgroundColor = otherEffect.originalBackgroundColor;
                this.originalWidth = otherEffect.originalWidth;
                this.originalStyle = otherEffect.originalStyle;
                if (this.highlightCommand != null && otherEffect.highlightCommand != null) {
                    this.highlightCommand.oldForegroundColor = otherEffect.highlightCommand
                            .oldForegroundColor;
                    this.highlightCommand.oldBackgroundColor = otherEffect.highlightCommand
                            .oldBackgroundColor;
                }
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
                    this.originalColor = otherEffect.originalColor;
                    this.originalBackgroundColor = otherEffect.originalBackgroundColor;
                    this.originalWidth = otherEffect.originalWidth;
                    this.originalStyle = otherEffect.originalStyle;
                    return this;
                }
            }
        }
        return null;
    }
    
    /**
     * A command for persistently changing an object style.
     */
    private class HighlightCommand extends RecordingCommand {
        
        private View view;
        private boolean undo = false;
        private Integer oldForegroundColor;
        private Integer oldBackgroundColor;
        
        public HighlightCommand(final TransactionalEditingDomain domain, final View view) {
            super(domain, "Highlight Effect");
            this.view = view;
        }

        /**
         * {@inheritDoc}
         */
        @SuppressWarnings("unchecked")
        @Override
        protected void doExecute() {
            if (undo) {
                LineStyle nlineStyle = (LineStyle) view.getStyle(
                        NotationPackage.eINSTANCE.getLineStyle());
                if (nlineStyle != null) {
                    if (oldForegroundColor == null) {
                        view.getStyles().remove(nlineStyle);
                    } else {
                        nlineStyle.setLineColor(oldForegroundColor);
                    }
                }
                FillStyle nfillStyle = (FillStyle) view.getStyle(
                        NotationPackage.eINSTANCE.getFillStyle());
                if (nfillStyle != null) {
                    if (oldBackgroundColor == null) {
                        view.getStyles().remove(nfillStyle);
                    } else {
                        nfillStyle.setFillColor(oldBackgroundColor);
                    }
                }
            } else {
                if (foregroundColor != null) {
                    LineStyle nlineStyle = (LineStyle) view.getStyle(
                            NotationPackage.eINSTANCE.getLineStyle());
                    if (nlineStyle == null) {
                        nlineStyle = NotationFactory.eINSTANCE.createLineStyle();
                        view.getStyles().add(nlineStyle);
                    } else {
                        oldForegroundColor = nlineStyle.getLineColor();
                    }
                    nlineStyle.setLineColor(translate(foregroundColor));
                }
                if (backgroundColor != null) {
                    FillStyle nfillStyle = (FillStyle) view.getStyle(
                            NotationPackage.eINSTANCE.getFillStyle());
                    if (nfillStyle == null) {
                        nfillStyle = NotationFactory.eINSTANCE.createFillStyle();
                        view.getStyles().add(nfillStyle);
                    } else {
                        oldBackgroundColor = nfillStyle.getFillColor();
                    }
                    nfillStyle.setFillColor(translate(backgroundColor));
                }
            }
        }
        
    }
    
    /**
     * Translate an SWT color to GMF format.
     * 
     * @param color a color
     * @return the color code
     */
    private static int translate(final Color color) {
        // SUPPRESS CHECKSTYLE NEXT MagicNumber
        return color.getRed() << 16 | color.getGreen() << 8 | color.getBlue();
    }

    @Override
    public String getName() {
        return "HighlightEffect";
    }
    
}
