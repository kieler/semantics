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

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.render.RenderedImage;
import org.eclipse.gmf.runtime.draw2d.ui.render.factory.RenderedImageFactory;
import org.eclipse.gmf.runtime.draw2d.ui.render.figures.ScalableImageFigure;

import de.cau.cs.kieler.core.ui.figures.DoubleRoundedRectangle;
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
            final EObject object) {
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
            throw new RuntimeException(input + "wasn't found in figureProvider");
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
        figure.setFill(false);
        figure.setLineWidth(1);
        figure.setForegroundColor(ColorConstants.black);
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
        RoundedRectangle figure = new RoundedRectangle();
        makeNormalState(figure);
        return figure;
    }

    /**
     * Create a figure for initial states.
     * 
     * @return a figure for initial states.
     */
    private IFigure createInitialFigure() {
        RoundedRectangle figure = new RoundedRectangle();
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
        /*
        if (oldLayoutManager instanceof StateLayout) {
            StateLayout stateLayout = (StateLayout) oldLayoutManager;
            if (object instanceof State) {
                State state = (State) stateLayout.getModelElement();//object;
                if (input.equals("simpleNormal")) {
                    stateLayout.setCorrespondingLayout(layouts.simpleStateLayout);
                } else if (input.equals("complexNormal")) { 
                    stateLayout.setIsEmptyValues(layouts.complexStateLayout, state);
                    stateLayout.setCorrespondingLayout(layouts.complexStateLayout);
                } else if (input.equals("conditional")) {
                    stateLayout.setIsEmptyValues(layouts.conditionalStateLayout, state);
                    stateLayout.setCorrespondingLayout(layouts.conditionalStateLayout);
                } else if (input.equals("reference")) {
                    stateLayout.setIsEmptyValues(layouts.referenceStateLayout, state);
                    stateLayout.setCorrespondingLayout(layouts.referenceStateLayout);
                } else if (input.equals("textual")) {
                    stateLayout.setIsEmptyValues(layouts.complexStateLayout, state);
                    stateLayout.setCorrespondingLayout(layouts.complexStateLayout);
                } else {
                    stateLayout.setCorrespondingLayout(layouts.simpleStateLayout);
                }
                /*
                if (state.isIsFinal()) {
                    stateLayout.getCorrespondingLayout(null).padding(
                            DoubleRoundedRectangle.BORDER_WIDTH);
                } else {
                    stateLayout.getCorrespondingLayout(null).padding(0);
                }
                /
            }
        
        }
        */
        // TODO Auto-generated method stub
        return oldLayoutManager;
    }

    /**
     * {@inheritDoc}
     */
    public LayoutManager getDefaultLayoutManager() {
        // TODO Auto-generated method stub
        return null;
    }

    public BorderItemLocator getBorderItemLocatorByString(String input) {
        // TODO Auto-generated method stub
        return null;
    }
}
