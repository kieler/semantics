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
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;

import de.cau.cs.kieler.core.ui.util.CompoundCondition;
import de.cau.cs.kieler.core.ui.util.FeatureValueCondition;
import de.cau.cs.kieler.core.ui.util.ICondition;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.TransitionType;

/**
 * This class represents attribute aware transition figures.
 * 
 * @author schm
 */
public class AttributeAwareTransitionFigure extends AttributeAwareConnection {

    /**
     * The constructor.
     * 
     * @param e The edit part the figure is supposed to watch.
     */
    public AttributeAwareTransitionFigure(final EditPart e) {
        super();
        this.setModelElementAndRegisterFromEditPart(e);

        this.setForegroundColor(ColorConstants.black);
        this.setBackgroundColor(ColorConstants.black);
        this.setLineWidth(2);

        // Create all needed conditions
        FeatureValueCondition kindWeakAbort = new FeatureValueCondition(SyncchartsPackage.eINSTANCE
                .getTransition_Type(), TransitionType.WEAKABORT);
        FeatureValueCondition kindStrongAbort = new FeatureValueCondition(SyncchartsPackage.eINSTANCE
                .getTransition_Type(), TransitionType.STRONGABORT);
        FeatureValueCondition kindNormalTermination = new FeatureValueCondition(
                SyncchartsPackage.eINSTANCE.getTransition_Type(), TransitionType.NORMALTERMINATION);
        FeatureValueCondition isHistory = new FeatureValueCondition(SyncchartsPackage.eINSTANCE
                .getTransition_IsHistory(), true);

        // Combine them in compound conditions
        ICondition weakAbortHistorySF = new CompoundCondition(new ICondition[] {
                kindWeakAbort, isHistory
        });

        ICondition strongAbortHistorySF = new CompoundCondition(new ICondition[] {
                kindStrongAbort, isHistory
        });
        
        ICondition normalTerminationHistorySF = new CompoundCondition(new ICondition[] {
                kindNormalTermination, isHistory
        });

        // Add all decorations with associated conditions to the figure's list
        addConditionalDecoration(createWeakAbortionDecoration(), createArrowDecoration(),
                kindWeakAbort);
        addConditionalDecoration(createStrongAbortionDecoration(), createArrowDecoration(),
                kindStrongAbort);
        addConditionalDecoration(createNormalTerminationDecoration(), createArrowDecoration(),
                kindNormalTermination);
        addConditionalDecoration(createWeakAbortionDecoration(), createHistoryDecoration(),
                weakAbortHistorySF);
        addConditionalDecoration(createStrongAbortionDecoration(), createHistoryDecoration(),
                strongAbortHistorySF);
        addConditionalDecoration(createNormalTerminationDecoration(), createHistoryDecoration(),
                normalTerminationHistorySF);

        // Set default and current look
        setDefaultDecoration(createWeakAbortionDecoration(), createArrowDecoration());
        setSourceDecoration(createWeakAbortionDecoration());
        setTargetDecoration(createArrowDecoration());

        // check conditions
        notifyChanged(null);
    }

    private static final int STRONG_ABORT_SIZE = 2;
    private static final double SRTONG_ABORT_SCALE = 2.0;
    
    /**
     * Create the strong abortion decoration.
     * 
     * @return The decoration.
     */
    private static RotatableDecoration createStrongAbortionDecoration() {
        PolygonDecoration circleDecoration = new CircleDecoration();
        circleDecoration.setLineWidth(1);
        circleDecoration.setForegroundColor(ColorConstants.black);
        circleDecoration.setBackgroundColor(ColorConstants.red);
        PointList circleDecorationPoints = new PointList();
        circleDecorationPoints.addPoint(STRONG_ABORT_SIZE, STRONG_ABORT_SIZE);
        circleDecorationPoints.addPoint(-STRONG_ABORT_SIZE, -STRONG_ABORT_SIZE);
        circleDecoration.setTemplate(circleDecorationPoints);
        circleDecoration.setScale(SRTONG_ABORT_SCALE, SRTONG_ABORT_SCALE);
        return circleDecoration;
    }

    /**
     * Create the weak abortion decoration.
     * 
     * @return The decoration.
     */
    private RotatableDecoration createWeakAbortionDecoration() {
        PolygonDecoration pointDecoration = new PolygonDecoration();
        pointDecoration.setForegroundColor(ColorConstants.black);
        pointDecoration.setBackgroundColor(ColorConstants.black);
        PointList pointDecorationPoints = new PointList();
        pointDecorationPoints.addPoint(0, 0);
        pointDecoration.setTemplate(pointDecorationPoints);
        return pointDecoration;
    }

    private static final int TERMINATION_SIZE = 2;
    private static final double TERMINATION_X_SCALE = 4.0;
    private static final double TERMINATION_Y_SCALE = 2.5;
    
    /**
     * Create the normal termination decoration.
     * 
     * @return The decoration.
     */
    private RotatableDecoration createNormalTerminationDecoration() {
        PolygonDecoration triangleDecoration = new PolygonDecoration();
        triangleDecoration.setLineWidth(1);
        triangleDecoration.setForegroundColor(ColorConstants.black);
        triangleDecoration.setBackgroundColor(ColorConstants.green);
        PointList triangleDecorationPoints = new PointList();
        triangleDecorationPoints.addPoint(0, TERMINATION_SIZE);
        triangleDecorationPoints.addPoint(-TERMINATION_SIZE, 0);
        triangleDecorationPoints.addPoint(0, -TERMINATION_SIZE);
        triangleDecoration.setTemplate(triangleDecorationPoints);
        triangleDecoration.setScale(TERMINATION_X_SCALE, TERMINATION_Y_SCALE);
        return triangleDecoration;
    }

    private static final int ARROW_SIZE = 10;
    private static final double ARROW_X_SCALE = 1.0;
    private static final double ARROW_Y_SCALE = 0.5;
    
    /**
     * Create the arrow decoration.
     * 
     * @return The decoration.
     */
    private RotatableDecoration createArrowDecoration() {
        PolygonDecoration arrowDecoration = new PolygonDecoration();
        PointList arrowDecorationPoints = new PointList();
        arrowDecorationPoints.addPoint(-ARROW_SIZE, ARROW_SIZE);
        arrowDecorationPoints.addPoint(1, 0);
        arrowDecorationPoints.addPoint(-ARROW_SIZE, -ARROW_SIZE);
        arrowDecorationPoints.addPoint(-ARROW_SIZE / 2, 0);
        arrowDecoration.setTemplate(arrowDecorationPoints);
        arrowDecoration.setScale(ARROW_X_SCALE, ARROW_Y_SCALE);
        return arrowDecoration;
    }

    private static final int HISTORY_SIZE = 2;
    
    /**
     * Create the history decoration.
     * 
     * @return The decoration.
     */
    private RotatableDecoration createHistoryDecoration() {
        CircleDecoration historyDecoration = new CircleDecoration() {
            protected void outlineShape(final Graphics g) {
                super.outlineShape(g);
                Rectangle ovalBounds = getBoundsFromPoints();
                g.setForegroundColor(ColorConstants.black);
                g.drawString("H", ovalBounds.x + 2, ovalBounds.y - 2);
            }
        };
        historyDecoration.setLineWidth(2);
        historyDecoration.setForegroundColor(ColorConstants.black);
        historyDecoration.setBackgroundColor(ColorConstants.gray);
        PointList historyDecorationPoints = new PointList();
        historyDecorationPoints.addPoint(HISTORY_SIZE / 2, HISTORY_SIZE);
        historyDecorationPoints.addPoint(-HISTORY_SIZE / 2, -HISTORY_SIZE);
        historyDecoration.setTemplate(historyDecorationPoints);
        return historyDecoration;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isAdapterForType(final Object type) {
        return Transition.class == type;
    }
    
}
