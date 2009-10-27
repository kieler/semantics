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
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ShapeCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

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

    boolean containsRegions;
    boolean containsSignals;
    boolean containsVariables;
    boolean containsEntryActions;
    boolean containsInnerActions;
    boolean containsExitActions;
    boolean containsSuspensionTrigger;

    /**
     * The constructor
     * 
     * @param e
     *            The edit part the figure is supposed to watch.
     */
    // This is the figure for states
    public AttributeAwareStateFigure(EditPart e) {
        super();

        // Register edit part
        this.setModelElementAndRegisterFromEditPart(e);
        layout = new StateLayout();
        

        // Create all needed figures
        // complex state
        RoundedRectangle normalStateFigure = new RoundedRectangle();
        normalStateFigure.setCornerDimensions(new Dimension(
                StateLayout.MIN_WIDTH, StateLayout.MIN_HEIGHT));
        normalStateFigure.setFill(false);
        normalStateFigure.setLineWidth(1);
        normalStateFigure.setForegroundColor(ColorConstants.black);
                
        // simple state
        RoundedRectangle normalNChildrenStateFigure = new RoundedRectangle();
        normalNChildrenStateFigure.setCornerDimensions(new Dimension(
                StateLayout.MIN_WIDTH, StateLayout.MIN_HEIGHT));
        normalNChildrenStateFigure.setFill(false);
        normalNChildrenStateFigure.setLineWidth(1);
        normalNChildrenStateFigure.setForegroundColor(ColorConstants.black);
        

        RoundedRectangle initialStateFigure = new RoundedRectangle();
        initialStateFigure.setCornerDimensions(new Dimension(
                StateLayout.MIN_WIDTH, StateLayout.MIN_HEIGHT));
        initialStateFigure.setFill(false);
        initialStateFigure.setLineWidth(4);
        initialStateFigure.setForegroundColor(ColorConstants.black);

        RoundedRectangle initialNChildrenStateFigure = new RoundedRectangle();
        initialNChildrenStateFigure.setCornerDimensions(new Dimension(
                StateLayout.MIN_WIDTH, StateLayout.MIN_HEIGHT));
        initialNChildrenStateFigure.setFill(false);
        initialNChildrenStateFigure.setLineWidth(3);
        initialNChildrenStateFigure.setForegroundColor(ColorConstants.black);

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

        ConditionalStateFigure conditionalStateFigure = new ConditionalStateFigure();
        conditionalStateFigure.setFill(true);
        conditionalStateFigure.setLineWidth(1);
        conditionalStateFigure.setForegroundColor(ColorConstants.black);
        conditionalStateFigure.setBackgroundColor(ColorConstants.black);

        // Set default and current figure
        this.setDefaultFigure(normalStateFigure);
        this.setCurrentFigure(normalNChildrenStateFigure);

        // Create all needed conditions
        Condition kindNormal = new Condition(SyncchartsPackage.eINSTANCE
                .getState_Type(), StateType.NORMAL);
        Condition kindPseudo = new Condition(SyncchartsPackage.eINSTANCE
                .getState_Type(), StateType.CONDITIONAL);
        Condition kindReference = new Condition(SyncchartsPackage.eINSTANCE
                .getState_Type(), StateType.REFERENCE);
        Condition kindTextual = new Condition(SyncchartsPackage.eINSTANCE
                .getState_Type(), StateType.TEXTUAL);

        // Condition flagNormal = new
        // Condition(SyncchartsPackage.eINSTANCE.getState_StateFlag(),
        // tateFlag.NORMAL);
        Condition flagInitial = new Condition(SyncchartsPackage.eINSTANCE
                .getState_IsInitial(), true);
        Condition flagFinal = new Condition(SyncchartsPackage.eINSTANCE
                .getState_IsFinal(), true);

        Condition noChildren = new SizeCondition(SyncchartsPackage.eINSTANCE
                .getState_Regions(), new Integer(0));
        Condition noSignals = new SizeCondition(SyncchartsPackage.eINSTANCE
                .getState_Signals(), new Integer(0));
        Condition noEntryActions = new SizeCondition(
                SyncchartsPackage.eINSTANCE.getState_EntryActions(),
                new Integer(0));
        Condition noInnerActions = new SizeCondition(
                SyncchartsPackage.eINSTANCE.getState_InnerActions(),
                new Integer(0));
        Condition noExitActions = new SizeCondition(SyncchartsPackage.eINSTANCE
                .getState_ExitActions(), new Integer(0));

        // Combine conditions in lists
        List<Condition> normalNCSF = new LinkedList<Condition>();
        normalNCSF.add(kindNormal);
        // normalNCSF.add(flagNormal);
        normalNCSF.add(noChildren);
        normalNCSF.add(noSignals);
        normalNCSF.add(noEntryActions);
        normalNCSF.add(noInnerActions);
        normalNCSF.add(noExitActions);

        List<Condition> initialNCSF = new LinkedList<Condition>();
        initialNCSF.add(kindNormal);
        initialNCSF.add(flagInitial);
        initialNCSF.add(noChildren);
        initialNCSF.add(noSignals);
        initialNCSF.add(noEntryActions);
        initialNCSF.add(noInnerActions);
        initialNCSF.add(noExitActions);

        List<Condition> finalNCSF = new LinkedList<Condition>();
        finalNCSF.add(kindNormal);
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

        List<Condition> pseudoSF = new LinkedList<Condition>();
        pseudoSF.add(kindPseudo);

        // Add the figures that are to be drawn, when all the conditions
        // in the list are fulfilled
        ConditionalFigure normalNCCF = new ConditionalFigure(normalNCSF,
                normalNChildrenStateFigure);
        ConditionalFigure initialNCCF = new ConditionalFigure(initialNCSF,
                initialNChildrenStateFigure);
        ConditionalFigure finalNCCF = new ConditionalFigure(finalNCSF,
                finalNChildrenStateFigure);
        ConditionalFigure initialCF = new ConditionalFigure(initialSF,
                initialStateFigure);
        ConditionalFigure finalCF = new ConditionalFigure(finalSF,
                finalStateFigure);
        ConditionalFigure pseudoCF = new ConditionalFigure(pseudoSF,
                conditionalStateFigure);

        // Add all ConditionalFigures to the figure's list
        conditionalFigureList = new LinkedList<ConditionalFigure>();
        conditionalFigureList.add(pseudoCF);
        conditionalFigureList.add(initialNCCF);
        conditionalFigureList.add(initialCF);
        conditionalFigureList.add(finalNCCF);
        conditionalFigureList.add(finalCF);
        conditionalFigureList.add(normalNCCF);

        // check conditions
        notifyChanged(null);
    }



    /**
     * Returns the preferred size of the figure. Here it is the same as the
     * minimum size.
     * 
     * @return The preferred size of the figure.
     */
    // The preferred size is the same as the minimum size
    @Override
    public Dimension getPreferredSize(int hint, int hint2) {
        return getMinimumSize(hint, hint2);
    }

    /**
     * Retrieve the name of a compartment.
     * 
     * @param child
     *            The compartment to retrieve the name from.
     * @return The name of the compartment.
     */
    // Method to retrieve a compartment's name
    private String getName(ShapeCompartmentFigure child) {
        if ((child.getChildren() != null) && (child.getChildren().size() > 0)
                && (child.getChildren().get(0) instanceof IFigure)) {
            IFigure rcf = (IFigure) child.getChildren().get(0);
            if ((rcf.getChildren() != null) && (rcf.getChildren().size() > 0)
                    && (rcf.getChildren().get(0) instanceof WrappingLabel)) {
                WrappingLabel label = (WrappingLabel) rcf.getChildren().get(0);
                return label.getText();
            }
        }
        return "";
    }

    /**
     * Lookup which compartments have contents
     * 
     * @param state
     *            The state for which the compartments have to be checked.
     */
    // Method to lookup which compartments have contents
    private void retrieveContents(State state) {
        containsRegions = false;
        containsSignals = false;
        containsVariables = false;
        containsEntryActions = false;
        containsInnerActions = false;
        containsExitActions = false;
        containsSuspensionTrigger = false;

        if ((state.getRegions() != null && state.getRegions().size() > 0)) {
            containsRegions = true;
        }
        if ((state.getSignals() != null && state.getSignals().size() > 0)) {
            containsSignals = true;
        }
        if ((state.getEntryActions() != null && state.getEntryActions().size() > 0)) {
            containsEntryActions = true;
        }
        if ((state.getInnerActions() != null && state.getInnerActions().size() > 0)) {
            containsInnerActions = true;
        }
        if ((state.getExitActions() != null && state.getExitActions().size() > 0)) {
            containsExitActions = true;
        }
        /*
         * if ((state.getVariables() != null && state.getVariables().size() >
         * 0)) { containsVariables = true; }
         */
        if (state.getSuspensionTrigger() != null) {
            containsSuspensionTrigger = true;
        }
    }

    /**
     * Check whether a state is simple or complex.
     * 
     * @param state
     *            The state to check
     * @return True if simple, otherwise false.
     */
    // Method to decide whether a state is simple
    private boolean isSimple(State state) {
        if ((state.getRegions() == null || state.getRegions().size() == 0)
                && (state.getSignals() == null || state.getSignals().size() == 0)
                && (state.getEntryActions() == null || state.getEntryActions()
                        .size() == 0)
                && (state.getInnerActions() == null || state.getInnerActions()
                        .size() == 0)
                && (state.getExitActions() == null || state.getExitActions()
                        .size() == 0)) {
            return true;
        }
        return false;
    }

}
