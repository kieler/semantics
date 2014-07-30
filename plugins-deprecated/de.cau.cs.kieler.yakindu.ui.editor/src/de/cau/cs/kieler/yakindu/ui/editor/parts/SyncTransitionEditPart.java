/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.ui.editor.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.draw2d.ui.internal.figures.ConnectionLayerEx;
import org.eclipse.gmf.runtime.draw2d.ui.internal.routers.RectilinearRouter;
import org.eclipse.swt.SWT;
import org.yakindu.sct.ui.editor.editor.figures.TransitionFigure;

import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition;
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType;

/**
 * 
 * The SyncTransition editpart. This class extends the TransitionEditPart class to allow switching
 * between the three diferent transition types (weak abort, strong abort, and normal termination).
 * 
 * cmot added isImmediate-Visualization 7.6.2013
 * 
 * @author wah, cmot
 * @kieler.rating green 2013-04-13
 * 
 */
public class SyncTransitionEditPart extends SplineTransitionEditPart {

    // @Override
    protected Connection createConnectionFigure() {
        SplineTransitionFigure transition = (SplineTransitionFigure) super.createConnectionFigure();
        updateTransitionSourceDecorator(transition);
        updateTransitionTargetDecorator(transition);

        transition.setConnectionRouter(new RectilinearRouter());
        transition.setRoutingStyles(true, true);
        transition.setSplineMode(SplineTransitionFigure.SPLINE_CUBIC);

        return transition;
    }

    // protected Connection createConnectionFigure() {
    // // TransitionFigure transition = (TransitionFigure) super
    // // .createConnectionFigure();
    // // transition.set
    //
    // primaryShape = new TransitionFigure();
    //
    // // SyncTransitionEditPart.this.updateFigure(figure);
    //
    // if (primaryShape instanceof SplineConnection) {
    // ((SplineConnection) primaryShape).setSplineMode(SyncGraphDiagramEditorPlugin
    // .getInstance().getPreferenceStore().getInt(SplineConnection.PREF_SPLINE_MODE));
    // }
    // return primaryShape;
    // }

    /**
     * Returns the TransitionFigure.
     * 
     * @return the TransitionFigure
     */
    private TransitionFigure getPrimaryShape() {
        return (TransitionFigure) getFigure();
    }

    @Override
    protected void handleNotificationEvent(Notification notification) {
        updateTransitionSourceDecorator(getPrimaryShape());
        updateTransitionTargetDecorator(getPrimaryShape());
        getPrimaryShape().repaint();
        super.handleNotificationEvent(notification);
    }

    /**
     * Update the source decorator (red circle for strong abortion, green triangle for normal
     * termination, and no decorator for weak abortion).
     * 
     * @param The
     *            transition figure
     */
    private void updateTransitionSourceDecorator(TransitionFigure transition) {
        EObject element = resolveSemanticElement();
        if (element instanceof SyncTransition) {
            TransitionType type = ((SyncTransition) element).getType();
            switch (type) {
            case WEAKABORT:
                transition.setSourceDecoration(null);
                break;
            case NORMALTERMINATION:
                transition.setSourceDecoration(TransitionDecorator
                        .createNormalTerminationDecoration(getMapMode().DPtoLP(
                                TransitionDecorator.LINE_WIDTH)));
                break;
            case STRONGABORT:
                transition.setSourceDecoration(TransitionDecorator
                        .createStrongAbortDecoration(getMapMode().DPtoLP(
                                TransitionDecorator.LINE_WIDTH)));
                break;
            }
        }
    }

    /**
     * Update the target decorator if the transition is a History Transition. The target decorator
     * is set to a circle decorator having the letter H in the middle. This is done if a transition
     * is set to a history transition.
     * 
     * @param The
     *            transition figure
     */
    private void updateTransitionTargetDecorator(TransitionFigure transition) {
        EObject element = resolveSemanticElement();
        if (element instanceof SyncTransition) {
            boolean isHistory = ((SyncTransition) element).isIsHistory();
            boolean isImmediate = ((SyncTransition) element).isIsImmediate();
            if (isHistory) {
                transition.setTargetDecoration(TransitionDecorator.createHistoryTargetDecoration());
            } else {
//                transition.setTargetDecoration(TransitionDecorator
//                        .createTransitionTargetDecoration());
                transition.setTargetDecoration(createArrowDecoration());
                transition.setLineWidth(2);
            }
            if (isImmediate) {
                transition.setLineDash(new float[] { 8.0f, 5.0f });
                transition.setLineStyle(SWT.LINE_CUSTOM);
            } else {
                transition.setLineStyle(SWT.LINE_SOLID);
            }
        }
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

    // /**
    // * @generated
    // */
    // public class TransitionFigure extends SplineConnection {
    //
    // /**
    // * @generated
    // */
    // private WrappingLabel fFigureTransitionTriggersAndEffectsFigure;
    // /**
    // * @generated
    // */
    // private WrappingLabel fFigureTransitionPriorityFigure;
    //
    // /**
    // * @generated
    // */
    // public TransitionFigure() {
    //
    // createContents();
    // }
    //
    // /**
    // * @generated
    // */
    // private void createContents() {
    //
    // fFigureTransitionTriggersAndEffectsFigure = new WrappingLabel();
    // fFigureTransitionTriggersAndEffectsFigure.setText("");
    // fFigureTransitionTriggersAndEffectsFigure.setTextWrap(true);
    //
    // this.add(fFigureTransitionTriggersAndEffectsFigure);
    //
    // fFigureTransitionPriorityFigure = new WrappingLabel();
    // fFigureTransitionPriorityFigure.setText("");
    //
    // // fFigureTransitionPriorityFigure.setFont(FFIGURETRANSITIONPRIORITYFIGURE_FONT);
    //
    // this.add(fFigureTransitionPriorityFigure);
    //
    // }
    //
    // /**
    // * @generated
    // */
    // public WrappingLabel getFigureTransitionTriggersAndEffectsFigure() {
    // return fFigureTransitionTriggersAndEffectsFigure;
    // }
    //
    // /**
    // * @generated
    // */
    // public WrappingLabel getFigureTransitionPriorityFigure() {
    // return fFigureTransitionPriorityFigure;
    // }
    //
    // }
    //
    // /**
    // * @generated
    // */
    // static final Font FFIGURETRANSITIONPRIORITYFIGURE_FONT = new Font(Display.getCurrent(),
    // "Sans",
    // 7, SWT.NORMAL);

}
