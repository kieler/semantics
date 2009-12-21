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
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.core.ui.figures.AttributeAwareSwitchFigure;
import de.cau.cs.kieler.core.ui.figures.DoubleRoundedRectangle;
import de.cau.cs.kieler.core.ui.util.CompoundCondition;
import de.cau.cs.kieler.core.ui.util.FeatureValueCondition;
import de.cau.cs.kieler.core.ui.util.ICondition;
import de.cau.cs.kieler.core.ui.util.ListSizeCondition;
import de.cau.cs.kieler.synccharts.StateType;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.State;

/**
 * This class represents attribute aware state figures.
 * 
 * @author schm
 * @author msp
 */
public class AttributeAwareStateFigure extends AttributeAwareSwitchFigure {

    /** line width for initial states. */
    private static final int INIT_LINE_WIDTH = 4;
    
    private static final ICondition COND_NORMAL = new FeatureValueCondition(
            SyncchartsPackage.eINSTANCE.getState_Type(), StateType.NORMAL);
    private static final ICondition COND_CONDITIONAL = new FeatureValueCondition(
            SyncchartsPackage.eINSTANCE.getState_Type(), StateType.CONDITIONAL);
//    private static final ICondition COND_REFERENCE = new FeatureValueCondition(
//            SyncchartsPackage.eINSTANCE.getState_Type(), StateType.REFERENCE);
//    private static final ICondition COND_TEXTUAL = new FeatureValueCondition(
//            SyncchartsPackage.eINSTANCE.getState_Type(), StateType.TEXTUAL);

    private static final ICondition COND_INITIAL = new FeatureValueCondition(
            SyncchartsPackage.eINSTANCE.getState_IsInitial(), true);
    private static final ICondition COND_FINAL = new FeatureValueCondition(
            SyncchartsPackage.eINSTANCE.getState_IsFinal(), true);

    private static final ICondition COND_NOREGIONS = new ListSizeCondition(
            SyncchartsPackage.eINSTANCE.getState_Regions(), 0);
    private static final ICondition COND_NOSIGNALS = new ListSizeCondition(
            SyncchartsPackage.eINSTANCE.getState_Signals(), 0);
    private static final ICondition COND_NOENTRYACT = new ListSizeCondition(
            SyncchartsPackage.eINSTANCE.getState_EntryActions(), 0);
    private static final ICondition COND_NOINSIDEACT = new ListSizeCondition(
            SyncchartsPackage.eINSTANCE.getState_InnerActions(), 0);
    private static final ICondition COND_NOEXITACT = new ListSizeCondition(
            SyncchartsPackage.eINSTANCE.getState_ExitActions(), 0);
    
    private static final ICondition COND_SIMPLE = new CompoundCondition(new ICondition[] {
            COND_NORMAL, COND_NOREGIONS, COND_NOSIGNALS, COND_NOENTRYACT,
            COND_NOINSIDEACT, COND_NOEXITACT
    });
    private static final ICondition COND_SIMPLE_INITIAL = new CompoundCondition(new ICondition[] {
            COND_INITIAL, COND_SIMPLE
    });
    private static final ICondition COND_SIMPLE_FINAL = new CompoundCondition(new ICondition[] {
            COND_FINAL, COND_SIMPLE
    });
    
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

        // Set default and current figure
        setDefaultFigure(normalFigure);

        // Add all conditional figures to the list
        addConditionalFigure(conditionalFigure, COND_CONDITIONAL);
        addConditionalFigure(initialFigure, COND_SIMPLE_INITIAL);
        addConditionalFigure(initialFigure, COND_INITIAL);
        addConditionalFigure(finalFigure, COND_SIMPLE_FINAL);
        addConditionalFigure(finalFigure, COND_FINAL);
        addConditionalFigure(normalFigure, COND_SIMPLE);
    }
    
    /**
     * Create a figure for normal states.
     * 
     * @return a figure for normal states
     */
    private IFigure createNormalFigure() {
        RoundedRectangle figure = new RoundedRectangle();
        figure.setCornerDimensions(new Dimension(
                StateLayout.MIN_WIDTH, StateLayout.MIN_HEIGHT));
        figure.setFill(false);
        figure.setLineWidth(1);
        figure.setForegroundColor(ColorConstants.black);
        return figure;
    }
    
    /**
     * Create a figure for initial states.
     * 
     * @return a figure for initial states.
     */
    private IFigure createInitialFigure() {
        RoundedRectangle figure = new RoundedRectangle();
        figure.setCornerDimensions(new Dimension(
                StateLayout.MIN_WIDTH, StateLayout.MIN_HEIGHT));
        figure.setFill(false);
        figure.setLineWidth(INIT_LINE_WIDTH);
        figure.setForegroundColor(ColorConstants.black);
        return figure;
    }
    
    /**
     * Create a figure for final states.
     * 
     * @return a figure for final states
     */
    private IFigure createFinalFigure() {
        RoundedRectangle figure = new DoubleRoundedRectangle();
        figure.setCornerDimensions(new Dimension(
                StateLayout.MIN_WIDTH, StateLayout.MIN_HEIGHT));
        figure.setFill(false);
        figure.setLineWidth(1);
        figure.setForegroundColor(ColorConstants.black);
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
    protected void checkState(final EObject object) {
        LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof StateLayout && object instanceof State) {
            ((StateLayout)layoutManager).checkSize(this, (State)object);
        }
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void setBounds(final Rectangle rect) {
        Notifier target = getTarget();
        if (target instanceof State) {
            State state = (State) target;
            if (state.getType() == StateType.CONDITIONAL) {
                if (rect.width != StateLayout.COND_WIDTH || rect.height != StateLayout.COND_HEIGHT) {
                    rect.width = StateLayout.COND_WIDTH;
                    rect.height = StateLayout.COND_HEIGHT;
                    getParent().setBounds(rect);
                }
            }
        }
        super.setBounds(rect);
    }

}
