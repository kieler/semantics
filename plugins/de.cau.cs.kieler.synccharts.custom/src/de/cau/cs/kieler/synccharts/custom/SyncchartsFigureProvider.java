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

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.Smoothness;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;

import de.cau.cs.kieler.core.model.figures.DoubleRoundedRectangle;
import de.cau.cs.kieler.core.model.gmf.figures.layout.container.Cell;
import de.cau.cs.kieler.core.model.gmf.figures.layout.container.ExtendedTable;
import de.cau.cs.kieler.karma.IRenderingProvider;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.custom.layout.SyncChartsConfiguration;

/**
 * This class provides figures for the graphical synccharts representation.
 * 
 * @author ckru
 * 
 */
public class SyncchartsFigureProvider implements IRenderingProvider {

    private static class RoundedRectangleWithBorder extends RoundedRectangle {

        /**
         * @see Shape#outlineShape(Graphics)
         */
        @Override
        protected void fillShape(final Graphics graphics) {
            graphics.fillRoundRectangle(getBounds(), corner.width, corner.height);

            float lineInset = Math.max(1.0f, getLineWidthFloat()) / 2.0f;
            int inset1 = (int) Math.floor(lineInset);
            int inset2 = (int) Math.ceil(lineInset);

            Rectangle r = Rectangle.SINGLETON.setBounds(getBounds());
            r.x += inset1;
            r.y += inset1;
            r.width -= inset1 + inset2;
            r.height -= inset1 + inset2;

            graphics.drawRoundRectangle(r, Math.max(0, corner.width - (int) lineInset),
                    Math.max(0, corner.height - (int) lineInset));
        }

    }

    /** line width for initial states. */
    private static final int INIT_LINE_WIDTH = 4;
    /** line width for initial final states. */
    private static final float INIT_FINAL_LINE_WIDTH = 2.1f;
    /** The size of the sign signifying reference states. */
    private static final int REFERENCE_SIGN_WIDTH = 17;
    /** The vertical offset inside the state for the sign. */
    private static final int REFERENCE_SIGN_OFFSET = 20;

    private SyncChartsConfiguration layouts = new SyncChartsConfiguration();

    /**
     * {@inheritDoc}
     */
    public IFigure getDefaultFigure() {
        return createNormalFigure();
    }

    /**
     * {@inheritDoc}
     */
    public IFigure getFigureByString(final String input, final IFigure oldFigure,
            final EObject object, final EditPart part) {

        this.setLineStyle(part);

        if (input.equals("normalState")) {
            return createNormalFigure();
        } else if (input.equals("initialState")) {
            return createInitialFigure();
        } else if (input.equals("finalState")) {
            return createFinalFigure();
        } else if (input.equals("conditional")) {
            return createConditionalFigure();
        } else if (input.equals("initialFinalState")) {
            return createInitialFinalFigure();
        } else if (input.equals("simpleInitialFinalRefState")) {
            return createInitialFinalReferenceFigure(true);
        } else if (input.equals("simpleInitialRefState")) {
            return createInitialReferenceFigure(true);
        } else if (input.equals("simpleFinalRefState")) {
            return createFinalReferenceFigure(true);
        } else if (input.equals("simpleRefState")) {
            return createNormalReferenceFigure(true);
        } else if (input.equals("initialFinalRefState")) {
            return createInitialFinalReferenceFigure(false);
        } else if (input.equals("initialRefState")) {
            return createInitialReferenceFigure(false);
        } else if (input.equals("finalRefState")) {
            return createFinalReferenceFigure(false);
        } else if (input.equals("refState")) {
            return createNormalReferenceFigure(false);
        } else {
            // FIXME throw a more specific exception
            throw new RuntimeException(input + "wasn't found in figureProvider");
        }
    }

    private void setLineStyle(final EditPart part) {

        if (part instanceof IGraphicalEditPart) {
            final IGraphicalEditPart gPart = (IGraphicalEditPart) part;

            AbstractEMFOperation emfOp = new AbstractEMFOperation(gPart.getEditingDomain(),
                    "set line color",
                    Collections.singletonMap(Transaction.OPTION_UNPROTECTED, true)) {
                @Override
                protected IStatus doExecute(final IProgressMonitor monitor, final IAdaptable info)
                        throws ExecutionException {
                    Style style = gPart.getPrimaryView().getStyle(
                            NotationPackage.Literals.LINE_STYLE);
                    if (style != null && style instanceof LineStyle) {
                        LineStyle lineStyle = (LineStyle) style;
                        lineStyle.setLineColor(SWT.COLOR_BLACK);
                    }
                    return Status.OK_STATUS;
                }
            };

            try {
                // execute above operation
                OperationHistoryFactory.getOperationHistory().execute(emfOp, null, null);
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Creates a figure for normal reference states. *
     * 
     * @param simple
     *            true if the state is simple, false if not
     * 
     * @return the figure
     */
    private IFigure createNormalReferenceFigure(final boolean simple) {
        RoundedRectangle figure = createRoundedRectangleReferenceFigure(simple);
        makeNormalState(figure);
        return figure;
    }

    /**
     * Creates a figure for reference states that are initial.
     * 
     * @param simple
     *            true if the state is simple, false if not
     * 
     * @return the figure
     */
    private IFigure createInitialReferenceFigure(final boolean simple) {
        RoundedRectangle figure = createRoundedRectangleReferenceFigure(simple);
        makeInitialState(figure);
        return figure;
    }

    /**
     * Creates a figure for reference states that are final.
     * 
     * @param simple
     *            true if the state is simple, false if not
     * @return the figure
     */
    private IFigure createFinalReferenceFigure(final boolean simple) {
        RoundedRectangle figure = createDoubleRoundedRectangleReferenceFigure(simple);
        makeFinalState(figure);
        return figure;
    }

    /**
     * Creates a figure for reference states that are initial and final.
     * 
     * @param simple
     *            true if the state is simple, false if not
     * @return the figure
     */
    private IFigure createInitialFinalReferenceFigure(final boolean simple) {
        RoundedRectangle figure = createDoubleRoundedRectangleReferenceFigure(simple);
        makeInitialFinalState(figure);
        return figure;
    }

    /**
     * Create a figure for reference States using a double rounded rectangle as basis.
     * 
     * @param simple
     *            true if the state is simple, false if not
     * @return a figure for reference States
     */
    private RoundedRectangle createDoubleRoundedRectangleReferenceFigure(final boolean simple) {
        RoundedRectangle figure = new DoubleRoundedRectangle() {
            @Override
            protected void outlineShape(final Graphics graphics) {
                int distance = Math.max(lineWidth + 1, BORDER_WIDTH);
                Rectangle rect = new Rectangle();
                Rectangle bounds = getBounds();
                rect.x = bounds.x + lineWidth / 2;
                rect.y = bounds.y + lineWidth / 2;
                rect.width = bounds.width - lineWidth;
                rect.height = bounds.height - lineWidth;
                // calculate corners according to current dimensions
                int cornerWidth = Math.min(corner.width, bounds.width);
                int cornerHeight = Math.min(corner.height, bounds.height);

                graphics.drawRoundRectangle(rect, cornerWidth, cornerHeight);
                // Draw the second rectangle inside the first one
                rect.x += distance;
                rect.y += distance;
                rect.width -= 2 * distance;
                rect.height -= 2 * distance;
                graphics.drawRoundRectangle(rect, cornerWidth - distance * BORDER_WIDTH,
                        cornerHeight - distance * BORDER_WIDTH);

                setUpReferenceState(graphics, rect, simple);
            }
        };
        return figure;
    }

    /**
     * Set up the outline of a shape to look like a reference figure.
     * 
     * @param graphics
     *            the graphics object
     * @param r
     *            the basic rectangle
     * @param simple
     *            true if the state is simple, false if not
     */
    private void setUpReferenceState(final Graphics graphics, final Rectangle r,
            final boolean simple) {
        if (simple) {
            int refX = r.x + r.width / 2 - REFERENCE_SIGN_WIDTH / 2;
            int refY = r.y + r.height - REFERENCE_SIGN_OFFSET;

            drawAtSymbol(graphics, refX, refY);
        } else {
            int refX = r.x + r.width - REFERENCE_SIGN_WIDTH - 2 - 2;
            int refY = r.y + 2 + 2;

            drawAtSymbol(graphics, refX, refY);
        }
    }

    /**
     * Draw a 'at' symbol on a white background.
     * 
     * @param graphics
     *            the graphics object
     * @param x
     *            the top left x
     * @param y
     *            the top left y
     */
    private void drawAtSymbol(final Graphics graphics, final int x, final int y) {
        graphics.setForegroundColor(ColorConstants.white);
        graphics.fillOval(x, y, REFERENCE_SIGN_WIDTH, REFERENCE_SIGN_WIDTH);
        graphics.setForegroundColor(ColorConstants.black);
        graphics.drawString("@", x + 2, y);
    }

    /**
     * Create a figure for reference States using a rounded rectangle as basis.
     * 
     * @param simple
     *            true if the state is simple, false if not
     * @return a figure for reference States
     */
    private RoundedRectangle createRoundedRectangleReferenceFigure(final boolean simple) {
        RoundedRectangle figure = new RoundedRectangle() {
            @Override
            protected void outlineShape(final Graphics graphics) {
                float lineInset = Math.max(1.0f, getLineWidthFloat()) / 2.0f;
                int inset1 = (int) Math.floor(lineInset);
                int inset2 = (int) Math.ceil(lineInset);

                Rectangle r = Rectangle.SINGLETON.setBounds(getBounds());
                r.x += inset1;
                r.y += inset1;
                r.width -= inset1 + inset2;
                r.height -= inset1 + inset2;

                graphics.drawRoundRectangle(r, Math.max(0, corner.width - (int) lineInset),
                        Math.max(0, corner.height - (int) lineInset));

                setUpReferenceState(graphics, r, simple);
            }
        };
        return figure;
    }

    /**
     * Apply the normal state properties to a rounded rectangle figure.
     * 
     * @param figure
     *            the figure to change
     */
    private void makeNormalState(final RoundedRectangle figure) {
        figure.setCornerDimensions(new Dimension(StateLayout.MIN_WIDTH, StateLayout.MIN_HEIGHT));
        figure.setFill(true);
        figure.setOpaque(false);
        figure.setLineWidth(1);
        figure.setForegroundColor(ColorConstants.black);
        figure.setBackgroundColor(ColorConstants.white);
    }

    /**
     * Apply the initial state properties to a rounded rectangle figure.
     * 
     * @param figure
     *            the figure to change
     */
    private void makeInitialState(final RoundedRectangle figure) {
        makeNormalState(figure);
        figure.setLineWidth(INIT_LINE_WIDTH);
    }

    /**
     * Apply the initialFinal state properties to a rounded rectangle figure.
     * 
     * @param figure
     *            the figure to change
     */
    private void makeInitialFinalState(final RoundedRectangle figure) {
        makeNormalState(figure);
        figure.setLineWidthFloat(INIT_FINAL_LINE_WIDTH);
    }

    /**
     * Apply the final state properties to a rounded rectangle figure.
     * 
     * @param figure
     *            the figure to change
     */
    private void makeFinalState(final RoundedRectangle figure) {
        makeNormalState(figure);
    }

    /**
     * Create a figure for normal states.
     * 
     * @return a figure for normal states
     */
    private IFigure createNormalFigure() {
        RoundedRectangle figure = new RoundedRectangleWithBorder();
        makeNormalState(figure);
        return figure;
    }

    /**
     * Create a figure for initial states.
     * 
     * @return a figure for initial states.
     */
    private IFigure createInitialFigure() {
        RoundedRectangle figure = new RoundedRectangleWithBorder();
        makeInitialState(figure);
        return figure;
    }

    /**
     * Create a figure for final states.
     * 
     * @return a figure for final states
     */
    private IFigure createInitialFinalFigure() {
        RoundedRectangle figure = new DoubleRoundedRectangle();
        makeInitialFinalState(figure);
        return figure;
    }

    /**
     * Create a figure for final states.
     * 
     * @return a figure for final states
     */
    private IFigure createFinalFigure() {
        RoundedRectangle figure = new DoubleRoundedRectangle();
        makeFinalState(figure);
        return figure;
    }

    /**
     * Create a figure for final states.
     * 
     * @return a figure for final states
     */
    private IFigure createConditionalFigure() {
        return new ConditionalStateFigure();
    }

    /**
     * {@inheritDoc}
     */
    public LayoutManager getLayoutManagerByString(final String input,
            final LayoutManager oldLayoutManager, final EObject object) {

        if (oldLayoutManager instanceof StateLayout) {
            StateLayout stateLayout = (StateLayout) oldLayoutManager;
            stateLayout.setModelElement(object);
        }

        /*
         * StateLayout.AbstractSyncChartsConfiguration layout = new SyncChartsConfiguration(); if
         * (oldLayoutManager instanceof StateLayout && object instanceof State) { State state =
         * (State) object; StateLayout stateLayout = ((StateLayout) oldLayoutManager); ExtendedTable
         * newLayout; if (input.startsWith("simpleNormal")) { newLayout = layouts.simpleStateLayout;
         * } else if (input.startsWith("complexNormal")) {
         * setIsEmptyValues(layouts.complexStateLayout, state); newLayout =
         * layouts.complexStateLayout; } else if (input.startsWith("reference")) {
         * setIsEmptyValues(layouts.referenceStateLayout, state); newLayout =
         * layouts.referenceStateLayout; } else if (input.startsWith("conditional")) {
         * setIsEmptyValues(layouts.conditionalStateLayout, state); newLayout =
         * layouts.conditionalStateLayout; } else if (input.startsWith("textual")) {
         * setIsEmptyValues(layouts.complexStateLayout, state); newLayout =
         * layouts.complexStateLayout; } else { newLayout = layouts.simpleStateLayout; } if
         * (input.endsWith("/final")) { newLayout.padding(DoubleRoundedRectangle.BORDER_WIDTH); }
         * else { newLayout.padding(0); } stateLayout.setCorrespondingLayout(newLayout); }
         */
        return oldLayoutManager;
    }

    /** Define isEmpty-value for every graphical element. */
    private void setIsEmptyValues(final ExtendedTable layout, final State state) {
        for (int row = 0; row < layout.table.length; row++) {
            for (int column = 0; column < layout.table[row].length; column++) {
                Cell cell = layout.table[row][column];
                cell.isEmpty = isEmptyCell(cell.figure, state);
            }
        }
    }

    /** the layout elements resp. the indices of the children */
    public static final int STATELABEL = 0;
    public static final int POLYLINE = 1;
    // public static final int BODYTEXT = 2;
    public static final int INTERFACEDECL = 2;
    public static final int SIGNALS = 3;
    public static final int ENTRYACTIONS = 4;
    public static final int INSIDEACTIONS = 5;
    public static final int EXITACTIONS = 6;
    public static final int SUSPENDTRIGGER = 7;
    public static final int REGION = 8;

    /**
     * Method defines for every graphical element if it will be painted or hidden. It does so by
     * checking constraints for the associated model elements.
     */
    private boolean isEmptyCell(final int figureConstant, final State state) {
        boolean isEmpty = false;
        switch (figureConstant) {
        case STATELABEL:
            isEmpty = false;
            break;
        case INTERFACEDECL:
            isEmpty = state.getInterfaceDeclaration() == null
                    || state.getInterfaceDeclaration().length() == 0;
            break;
        // case BODYTEXT:
        // isEmpty = state.getBodyText() == null
        // || state.getBodyText().isEmpty();
        // break;
        case SIGNALS:
            isEmpty = (state.getSignals().size() == 0 && state.getVariables().size() == 0);
            break;
        case ENTRYACTIONS:
            isEmpty = state.getEntryActions().size() == 0;
            break;
        case INSIDEACTIONS:
            isEmpty = state.getInnerActions().size() == 0;
            break;
        case EXITACTIONS:
            isEmpty = state.getExitActions().size() == 0;
            break;
        case SUSPENDTRIGGER:
            isEmpty = state.getSuspensionTrigger() == null;
            break;
        case REGION:
            isEmpty = (state.getRegions().size() == 0 && state.getBodyText().size() == 0);
            break;

        default:
            isEmpty = false;
            break;
        }
        return isEmpty;
    }

    /**
     * {@inheritDoc}
     */
    public BorderItemLocator getBorderItemLocatorByString(final String input, final IFigure parent,
            final Object locator, final EObject object, CollapseStatus collapseStatus) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public Dimension getSizeByString(final String input, final EObject object, final EditPart part) {
        return null;
    }
}
