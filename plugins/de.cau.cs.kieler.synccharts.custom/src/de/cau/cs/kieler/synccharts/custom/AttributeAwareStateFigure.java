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
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.core.ui.figures.AttributeAwareSwitchFigure;
import de.cau.cs.kieler.core.ui.figures.DoubleRoundedRectangle;
import de.cau.cs.kieler.core.ui.util.FeatureValueCondition;
import de.cau.cs.kieler.core.ui.util.ListSizeCondition;
import de.cau.cs.kieler.core.util.CompoundCondition;
import de.cau.cs.kieler.core.util.ICondition;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.StateType;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

/**
 * This class represents attribute aware state figures.
 * 
 * @kieler.rating 2010-01-27 proposed yellow msp
 * @author schm
 * @author msp
 */
@SuppressWarnings("unchecked")
public class AttributeAwareStateFigure extends AttributeAwareSwitchFigure {

    /** line width for initial states. */
    private static final int INIT_LINE_WIDTH = 4;

    private static final ICondition<EObject> COND_NORMAL = new FeatureValueCondition(
            SyncchartsPackage.eINSTANCE.getState_Type(), StateType.NORMAL);
    private static final ICondition<EObject> COND_CONDITIONAL = new FeatureValueCondition(
            SyncchartsPackage.eINSTANCE.getState_Type(), StateType.CONDITIONAL);
    private static final ICondition<EObject> COND_REFERENCE = new FeatureValueCondition(
            SyncchartsPackage.eINSTANCE.getState_Type(), StateType.REFERENCE);
    private static final ICondition<EObject> COND_TEXTUAL = new FeatureValueCondition(
            SyncchartsPackage.eINSTANCE.getState_Type(), StateType.TEXTUAL);

    private static final ICondition<EObject> COND_INITIAL = new FeatureValueCondition(
            SyncchartsPackage.eINSTANCE.getState_IsInitial(), true);
    private static final ICondition<EObject> COND_FINAL = new FeatureValueCondition(
            SyncchartsPackage.eINSTANCE.getState_IsFinal(), true);
    private static final ICondition<EObject> COND_NOT_INITIAL = new FeatureValueCondition(
            SyncchartsPackage.eINSTANCE.getState_IsInitial(), false);
    private static final ICondition<EObject> COND_NOT_FINAL = new FeatureValueCondition(
            SyncchartsPackage.eINSTANCE.getState_IsFinal(), false);

    private static final ICondition<EObject> COND_NOREGIONS = new ListSizeCondition(
            SyncchartsPackage.eINSTANCE.getState_Regions(), 0);
    private static final ICondition<EObject> COND_NOSIGNALS = new ListSizeCondition(
            SyncchartsPackage.eINSTANCE.getScope_Signals(), 0);
    private static final ICondition<EObject> COND_NOENTRYACT = new ListSizeCondition(
            SyncchartsPackage.eINSTANCE.getScope_EntryActions(), 0);
    private static final ICondition<EObject> COND_NOINSIDEACT = new ListSizeCondition(
            SyncchartsPackage.eINSTANCE.getScope_InnerActions(), 0);
    private static final ICondition<EObject> COND_NOEXITACT = new ListSizeCondition(
            SyncchartsPackage.eINSTANCE.getScope_ExitActions(), 0);

    private static final ICondition<EObject> COND_SIMPLE = new CompoundCondition<EObject>(
            new ICondition[] { COND_NORMAL, COND_NOREGIONS, COND_NOSIGNALS,
                    COND_NOENTRYACT, COND_NOINSIDEACT, COND_NOEXITACT });

    private static final ICondition<EObject> COND_SIMPLE_REF = new CompoundCondition<EObject>(
            new ICondition[] { COND_REFERENCE, COND_NOREGIONS, COND_NOSIGNALS,
                    COND_NOENTRYACT, COND_NOINSIDEACT, COND_NOEXITACT });

    private static final ICondition<EObject> COND_INITIAL_FINAL_STATE = new CompoundCondition<EObject>(
            new ICondition[] { COND_INITIAL, COND_FINAL });
    private static final ICondition<EObject> COND_INITIAL_STATE = new CompoundCondition<EObject>(
            new ICondition[] { COND_INITIAL, COND_NOT_FINAL });
    private static final ICondition<EObject> COND_FINAL_STATE = new CompoundCondition<EObject>(
            new ICondition[] { COND_NOT_INITIAL, COND_FINAL });

    private static final ICondition<EObject> COND_SIMPLE_REF_INITIAL_FINAL = new CompoundCondition<EObject>(
            new ICondition[] { COND_SIMPLE_REF, COND_INITIAL_FINAL_STATE });
    private static final ICondition<EObject> COND_SIMPLE_REF_INITIAL = new CompoundCondition<EObject>(
            new ICondition[] { COND_SIMPLE_REF, COND_INITIAL_STATE });
    private static final ICondition<EObject> COND_SIMPLE_REF_FINAL = new CompoundCondition<EObject>(
            new ICondition[] { COND_SIMPLE_REF, COND_FINAL_STATE });

    private static final ICondition<EObject> COND_REF_INITIAL_FINAL = new CompoundCondition<EObject>(
            new ICondition[] { COND_REFERENCE, COND_INITIAL_FINAL_STATE });
    private static final ICondition<EObject> COND_REF_INITIAL = new CompoundCondition<EObject>(
            new ICondition[] { COND_REFERENCE, COND_INITIAL_STATE });
    private static final ICondition<EObject> COND_REF_FINAL = new CompoundCondition<EObject>(
            new ICondition[] { COND_REFERENCE, COND_FINAL_STATE });

    private static final ICondition<EObject> COND_SIMPLE_INITIAL_FINAL = new CompoundCondition<EObject>(
            new ICondition[] { COND_SIMPLE, COND_INITIAL_FINAL_STATE });
    private static final ICondition<EObject> COND_SIMPLE_INITIAL = new CompoundCondition<EObject>(
            new ICondition[] { COND_SIMPLE, COND_INITIAL_STATE });
    private static final ICondition<EObject> COND_SIMPLE_FINAL = new CompoundCondition<EObject>(
            new ICondition[] { COND_SIMPLE, COND_FINAL_STATE });

    private static final ICondition<EObject> COND_COMPLEX_INITIAL_FINAL = new CompoundCondition<EObject>(
            new ICondition[] { COND_INITIAL_FINAL_STATE });
    private static final ICondition<EObject> COND_COMPLEX_INITIAL = new CompoundCondition<EObject>(
            new ICondition[] { COND_INITIAL_STATE });
    private static final ICondition<EObject> COND_COMPLEX_FINAL = new CompoundCondition<EObject>(
            new ICondition[] { COND_FINAL_STATE });

    /**
     * The constructor.
     */
    public AttributeAwareStateFigure() {
        super();

        // Create all needed figures
        IFigure normalFigure = createNormalFigure();
        IFigure initialFigure = createInitialFigure();
        IFigure finalFigure = createFinalFigure();
        IFigure conditionalFigure = new ConditionalStateFigure();
        IFigure initialFinalFigure = createInitialFinalFigure();
        /* create even more normal figures to trigger layoutmanager via 
         * notifyChanged if statetype changed */
        IFigure referenceFigure = createNormalReferenceFigure(false);
        IFigure referenceInitFigure = createInitialReferenceFigure(false);
        IFigure referenceFinalFigure = createFinalReferenceFigure(false);
        IFigure referenceInitFinalFigure = createInitialFinalReferenceFigure(false);
        IFigure simpleReferenceFigure = createNormalReferenceFigure(true);
        IFigure simpleReferenceInitFigure = createInitialReferenceFigure(true);
        IFigure simpleReferenceFinalFigure = createFinalReferenceFigure(true);
        IFigure simpleReferenceInitFinalFigure = createInitialFinalReferenceFigure(true);
        IFigure textualfigure = createNormalFigure();

        // Set default and current figure
        setDefaultFigure(normalFigure);

        // Add all conditional figures to the list
        addConditionalFigure(conditionalFigure, COND_CONDITIONAL);
        addConditionalFigure(simpleReferenceInitFinalFigure,
                COND_SIMPLE_REF_INITIAL_FINAL);
        addConditionalFigure(simpleReferenceInitFigure, COND_SIMPLE_REF_INITIAL);
        addConditionalFigure(simpleReferenceFinalFigure, COND_SIMPLE_REF_FINAL);
        addConditionalFigure(simpleReferenceFigure, COND_SIMPLE_REF);
        addConditionalFigure(referenceInitFinalFigure, COND_REF_INITIAL_FINAL);
        addConditionalFigure(referenceInitFigure, COND_REF_INITIAL);
        addConditionalFigure(referenceFinalFigure, COND_REF_FINAL);
        addConditionalFigure(referenceFigure, COND_REFERENCE);
        addConditionalFigure(initialFinalFigure, COND_SIMPLE_INITIAL_FINAL);
        addConditionalFigure(initialFinalFigure, COND_COMPLEX_INITIAL_FINAL);
        addConditionalFigure(initialFigure, COND_SIMPLE_INITIAL);
        addConditionalFigure(initialFigure, COND_COMPLEX_INITIAL);
        addConditionalFigure(finalFigure, COND_SIMPLE_FINAL);
        addConditionalFigure(finalFigure, COND_COMPLEX_FINAL);
        addConditionalFigure(textualfigure, COND_TEXTUAL);
        addConditionalFigure(normalFigure, COND_SIMPLE);
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
     * Create a figure for reference States using a double rounded rectangle as
     * basis.
     * 
     * @param simple
     *            true if the state is simple, false if not
     * @return a figure for reference States
     */
    private RoundedRectangle createDoubleRoundedRectangleReferenceFigure(
            final boolean simple) {
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
                graphics.drawRoundRectangle(rect, cornerWidth - distance
                        * BORDER_WIDTH, cornerHeight - distance * BORDER_WIDTH);

                setUpReferenceState(graphics, rect, simple);
            }
        };
        return figure;
    }

    /** The size of the sign signifying reference states. */
    private static final int REFERENCE_SIGN_WIDTH = 17;

    /** The vertical offset inside the state for the sign. */
    private static final int REFERENCE_SIGN_OFFSET = 20;

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
    private void setUpReferenceState(final Graphics graphics,
            final Rectangle r, final boolean simple) {
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
    private RoundedRectangle createRoundedRectangleReferenceFigure(
            final boolean simple) {
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

                graphics.drawRoundRectangle(r,
                        Math.max(0, corner.width - (int) lineInset),
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
        figure.setCornerDimensions(new Dimension(StateLayout.MIN_WIDTH,
                StateLayout.MIN_HEIGHT));
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

    /** The line width for states that are both initial and final. */
    private static final float INIT_FINAL_LINE_WIDTH = 2.1f;

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
     * {@inheritDoc}
     */
    public boolean isAdapterForType(final Object type) {
        return State.class == type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setBounds(final Rectangle rect) {
        Notifier target = getTarget();
        LayoutManager layoutManager = getLayoutManager();
        if (target instanceof State && layoutManager instanceof StateLayout) {
            ((StateLayout) layoutManager).checkNewSize(this, (State) target,
                    rect);
        }
        super.setBounds(rect);
    }

    /**
     * Directly set the bounds of this figure, without further checks.
     * 
     * @param rect
     *            the new bounds
     */
    public void setBoundsDirect(final Rectangle rect) {
        super.setBounds(rect);
    }

}
