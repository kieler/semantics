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
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;

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
 * 
 */
public class AttributeAwareStateFigure extends AttributeAwareFigure {

    private static final int INIT_LINE_WIDTH = 4;
    
    /**
     * The constructor.
     * 
     * @param e The edit part the figure is supposed to watch.
     */
    public AttributeAwareStateFigure(final EditPart e) {
        super();

        // Register edit part
        this.setModelElementAndRegisterFromEditPart(e);

        // Create all needed figures
        //  - complex state
        RoundedRectangle normalStateFigure = new RoundedRectangle();
        normalStateFigure.setCornerDimensions(new Dimension(
                StateLayout.MIN_WIDTH, StateLayout.MIN_HEIGHT));
        normalStateFigure.setFill(false);
        normalStateFigure.setLineWidth(1);
        normalStateFigure.setForegroundColor(ColorConstants.black);
                
        //  - simple state
        RoundedRectangle normalNChildrenStateFigure = new RoundedRectangle();
        normalNChildrenStateFigure.setCornerDimensions(new Dimension(
                StateLayout.MIN_WIDTH, StateLayout.MIN_HEIGHT));
        normalNChildrenStateFigure.setFill(false);
        normalNChildrenStateFigure.setLineWidth(1);
        normalNChildrenStateFigure.setForegroundColor(ColorConstants.black);
        
        // - initial state
        RoundedRectangle initialStateFigure = new RoundedRectangle();
        initialStateFigure.setCornerDimensions(new Dimension(
                StateLayout.MIN_WIDTH, StateLayout.MIN_HEIGHT));
        initialStateFigure.setFill(false);
        initialStateFigure.setLineWidth(INIT_LINE_WIDTH);
        initialStateFigure.setForegroundColor(ColorConstants.black);

        RoundedRectangle initialNChildrenStateFigure = new RoundedRectangle();
        initialNChildrenStateFigure.setCornerDimensions(new Dimension(
                StateLayout.MIN_WIDTH, StateLayout.MIN_HEIGHT));
        initialNChildrenStateFigure.setFill(false);
        initialNChildrenStateFigure.setLineWidth(INIT_LINE_WIDTH - 1);
        initialNChildrenStateFigure.setForegroundColor(ColorConstants.black);

        // - finalState
        RoundedRectangle finalStateFigure = new DoubleRoundedRectangle();
        finalStateFigure.setCornerDimensions(new Dimension(
                StateLayout.MIN_WIDTH, StateLayout.MIN_HEIGHT));
        finalStateFigure.setFill(false);
        finalStateFigure.setLineWidth(1);
        finalStateFigure.setForegroundColor(ColorConstants.black);

        RoundedRectangle finalNChildrenStateFigure = new DoubleRoundedRectangle();
        finalNChildrenStateFigure.setCornerDimensions(new Dimension(
                StateLayout.MIN_WIDTH, StateLayout.MIN_HEIGHT));
        finalNChildrenStateFigure.setFill(false);
        finalNChildrenStateFigure.setLineWidth(1);
        finalNChildrenStateFigure.setForegroundColor(ColorConstants.black);

        //  - conditional state
        ConditionalStateFigure conditionalStateFigure = new ConditionalStateFigure();

        // Set default and current figure
        setDefaultFigure(normalStateFigure);
        setCurrentFigure(normalNChildrenStateFigure);

        // Create all needed conditions
        ICondition typeNormal = new FeatureValueCondition(SyncchartsPackage.eINSTANCE
                .getState_Type(), StateType.NORMAL);
        ICondition typeConditional = new FeatureValueCondition(SyncchartsPackage.eINSTANCE
                .getState_Type(), StateType.CONDITIONAL);
//        FeatureValueCondition typeReference = new FeatureValueCondition(SyncchartsPackage.eINSTANCE
//                .getState_Type(), StateType.REFERENCE);
//        FeatureValueCondition typeTextual = new FeatureValueCondition(SyncchartsPackage.eINSTANCE
//                .getState_Type(), StateType.TEXTUAL);

        ICondition flagInitial = new FeatureValueCondition(SyncchartsPackage.eINSTANCE
                .getState_IsInitial(), true);
        ICondition flagFinal = new FeatureValueCondition(SyncchartsPackage.eINSTANCE
                .getState_IsFinal(), true);

        ICondition noChildren = new ListSizeCondition(SyncchartsPackage.eINSTANCE
                .getState_Regions(), 0);
        ICondition noSignals = new ListSizeCondition(SyncchartsPackage.eINSTANCE
                .getState_Signals(), new Integer(0));
        ICondition noEntryActions = new ListSizeCondition(SyncchartsPackage.eINSTANCE
                .getState_EntryActions(), new Integer(0));
        ICondition noInnerActions = new ListSizeCondition(SyncchartsPackage.eINSTANCE
                .getState_InnerActions(), new Integer(0));
        ICondition noExitActions = new ListSizeCondition(SyncchartsPackage.eINSTANCE
                .getState_ExitActions(), new Integer(0));

        // Combine conditions in compound conditions
        ICondition normalNCSF = new CompoundCondition(new ICondition[] {
                typeNormal, noChildren, noSignals, noEntryActions, noInnerActions, noExitActions
        });

        ICondition initialNCSF = new CompoundCondition(new ICondition[] {
                typeNormal, flagInitial, noChildren, noSignals, noEntryActions, noInnerActions,
                noExitActions
        });

        ICondition finalNCSF = new CompoundCondition(new ICondition[] {
                typeNormal, flagFinal, noChildren, noSignals, noEntryActions, noInnerActions,
                noExitActions
        });

        // Add all conditional figures to the list
        addConditionalFigure(conditionalStateFigure, typeConditional);
        addConditionalFigure(initialNChildrenStateFigure, initialNCSF);
        addConditionalFigure(initialStateFigure, flagInitial);
        addConditionalFigure(finalNChildrenStateFigure, finalNCSF);
        addConditionalFigure(finalStateFigure, flagFinal);
        addConditionalFigure(normalNChildrenStateFigure, normalNCSF);

        // check conditions
        notifyChanged(null);
    }

    /**
     * Returns the preferred size of the figure. Here it is the same as the
     * minimum size.
     * 
     * @param hint width hint
     * @param hint2 height hint
     * @return The preferred size of the figure.
     */
//    @Override
//    public Dimension getPreferredSize(final int hint, final int hint2) {
//        return getMinimumSize(hint, hint2);
//    }

    /**
     * {@inheritDoc}
     */
    public boolean isAdapterForType(final Object type) {
        return State.class == type;
    }

}
