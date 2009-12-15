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
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.TransitionType;

/**
 * This class represents attribute aware transition figures.
 * 
 * @author schm
 * 
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
        Condition kindWeakAbort = new Condition(SyncchartsPackage.eINSTANCE
                .getTransition_Type(), TransitionType.WEAKABORT);
        Condition kindStrongAbort = new Condition(SyncchartsPackage.eINSTANCE
                .getTransition_Type(), TransitionType.STRONGABORT);
        Condition kindNormalTermination = new Condition(SyncchartsPackage.eINSTANCE
                .getTransition_Type(), TransitionType.NORMALTERMINATION);
        Condition isHistory = new Condition(SyncchartsPackage.eINSTANCE
                .getTransition_IsHistory(), true);

        // Combine them in lists
        List<Condition> weakAbortHistorySF = new LinkedList<Condition>();
        weakAbortHistorySF.add(kindWeakAbort);
        weakAbortHistorySF.add(isHistory);

        List<Condition> strongAbortHistorySF = new LinkedList<Condition>();
        strongAbortHistorySF.add(kindStrongAbort);
        strongAbortHistorySF.add(isHistory);

        List<Condition> normalTerminationHistorySF = new LinkedList<Condition>();
        normalTerminationHistorySF.add(kindNormalTermination);
        normalTerminationHistorySF.add(isHistory);

        List<Condition> weakAbortSF = new LinkedList<Condition>();
        weakAbortSF.add(kindWeakAbort);

        List<Condition> strongAbortSF = new LinkedList<Condition>();
        strongAbortSF.add(kindStrongAbort);

        List<Condition> normalTerminationSF = new LinkedList<Condition>();
        normalTerminationSF.add(kindNormalTermination);

        // Add the looks that are to be displayed when all the conditions in
        // the list are true
        ConditionalConnectionLook weakAbortHistoryCF = new ConditionalConnectionLook(weakAbortHistorySF,
                createWeakAbortionDecoration(), createHistoryDecoration());
        ConditionalConnectionLook strongAbortHistoryCF = new ConditionalConnectionLook(
                strongAbortHistorySF, createStrongAbortionDecoration(), createHistoryDecoration());
        ConditionalConnectionLook normalTerminationHistoryCF = new ConditionalConnectionLook(
                normalTerminationHistorySF, createNormalTerminationDecoration(),
                createHistoryDecoration());

        ConditionalConnectionLook weakAbortCF = new ConditionalConnectionLook(weakAbortSF,
                createWeakAbortionDecoration(), createArrowDecoration());
        ConditionalConnectionLook strongAbortCF = new ConditionalConnectionLook(strongAbortSF,
                createStrongAbortionDecoration(), createArrowDecoration());
        ConditionalConnectionLook normalTerminationCF = new ConditionalConnectionLook(
                normalTerminationSF, createNormalTerminationDecoration(), createArrowDecoration());

        // Add all ConditionalConnectionLooks to the figure's list
        List<ConditionalConnectionLook> figureList = getConditionalFigureList();
        figureList.add(weakAbortHistoryCF);
        figureList.add(strongAbortHistoryCF);
        figureList.add(normalTerminationHistoryCF);
        figureList.add(weakAbortCF);
        figureList.add(strongAbortCF);
        figureList.add(normalTerminationCF);

        // Set default and current look
        this.setDefaultLook(weakAbortCF);
        this.setLook(weakAbortCF);

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
