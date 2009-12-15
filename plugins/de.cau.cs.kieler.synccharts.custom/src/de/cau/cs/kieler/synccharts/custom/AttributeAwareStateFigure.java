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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;

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
        Condition typeNormal = new Condition(SyncchartsPackage.eINSTANCE
                .getState_Type(), StateType.NORMAL);
        Condition typeConditional = new Condition(SyncchartsPackage.eINSTANCE
                .getState_Type(), StateType.CONDITIONAL);
//        Condition typeReference = new Condition(SyncchartsPackage.eINSTANCE
//                .getState_Type(), StateType.REFERENCE);
//        Condition typeTextual = new Condition(SyncchartsPackage.eINSTANCE
//                .getState_Type(), StateType.TEXTUAL);

        Condition flagInitial = new Condition(SyncchartsPackage.eINSTANCE
                .getState_IsInitial(), true);
        Condition flagFinal = new Condition(SyncchartsPackage.eINSTANCE
                .getState_IsFinal(), true);

        Condition noChildren = new SizeCondition(SyncchartsPackage.eINSTANCE
                .getState_Regions(), new Integer(0));
        Condition noSignals = new SizeCondition(SyncchartsPackage.eINSTANCE
                .getState_Signals(), new Integer(0));
        Condition noEntryActions = new SizeCondition(SyncchartsPackage.eINSTANCE
                .getState_EntryActions(), new Integer(0));
        Condition noInnerActions = new SizeCondition(SyncchartsPackage.eINSTANCE
                .getState_InnerActions(), new Integer(0));
        Condition noExitActions = new SizeCondition(SyncchartsPackage.eINSTANCE
                .getState_ExitActions(), new Integer(0));

        // Combine conditions in lists
        List<Condition> normalNCSF = new LinkedList<Condition>();
        normalNCSF.add(typeNormal);
        // normalNCSF.add(flagNormal);
        normalNCSF.add(noChildren);
        normalNCSF.add(noSignals);
        normalNCSF.add(noEntryActions);
        normalNCSF.add(noInnerActions);
        normalNCSF.add(noExitActions);

        List<Condition> initialNCSF = new LinkedList<Condition>();
        initialNCSF.add(typeNormal);
        initialNCSF.add(flagInitial);
        initialNCSF.add(noChildren);
        initialNCSF.add(noSignals);
        initialNCSF.add(noEntryActions);
        initialNCSF.add(noInnerActions);
        initialNCSF.add(noExitActions);

        List<Condition> finalNCSF = new LinkedList<Condition>();
        finalNCSF.add(typeNormal);
        finalNCSF.add(flagFinal);
        finalNCSF.add(noChildren);
        finalNCSF.add(noSignals);
        finalNCSF.add(noEntryActions);
        finalNCSF.add(noInnerActions);
        finalNCSF.add(noExitActions);

        List<Condition> initialSF = new LinkedList<Condition>();
        initialSF.add(flagInitial);

        List<Condition> finalSF = new LinkedList<Condition>();
        finalSF.add(flagFinal);

        List<Condition> conditionalSF = new LinkedList<Condition>();
        conditionalSF.add(typeConditional);

        // Add all conditional figures to the list
        List<ConditionalFigure> figureList = getConditionalFigureList();
        figureList.add(new ConditionalFigure(conditionalSF,
                conditionalStateFigure));
        figureList.add(new ConditionalFigure(initialNCSF,
                initialNChildrenStateFigure));
        figureList.add(new ConditionalFigure(initialSF,
                initialStateFigure));
        figureList.add(new ConditionalFigure(finalNCSF,
                finalNChildrenStateFigure));
        figureList.add(new ConditionalFigure(finalSF,
                finalStateFigure));
        figureList.add(new ConditionalFigure(normalNCSF,
                normalNChildrenStateFigure));

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
