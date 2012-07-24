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
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.swt.SWT;

import de.cau.cs.kieler.core.model.figures.CircleDecoration;
import de.cau.cs.kieler.karma.IRenderingProvider;

/**
 * Figure provider for SyncCharts connections.
 * 
 * @author ckru
 * @kieler.ignore (excluded from review process)
 */
public class SyncchartsConnectionFigureProvider implements IRenderingProvider {

    /**
     * {@inheritDoc}
     */
    public IFigure getFigureByString(final String input, final IFigure oldFigure,
            final EObject object, final EditPart part) {
        
        this.setLineStyle(part);
        
        if (oldFigure instanceof PolylineConnection) {
            PolylineConnection splineFigure = (PolylineConnection) oldFigure;
            splineFigure.setForegroundColor(ColorConstants.black);
            splineFigure.setBackgroundColor(ColorConstants.black);
            splineFigure.setLineWidth(2);
            if (input.equals("termination")) {
                splineFigure.setSourceDecoration(createTerminationDecoration());
                splineFigure.setTargetDecoration(createArrowDecoration());
            } else if (input.equals("strongAbort")) {
                splineFigure.setSourceDecoration(createStrongAbortDecoration());
                splineFigure.setTargetDecoration(createArrowDecoration());
            } else if (input.equals("weakAbort")) {
                splineFigure.setSourceDecoration(null);
                splineFigure.setTargetDecoration(createArrowDecoration());
            } else if (input.equals("terminationHistory")) {
                splineFigure.setSourceDecoration(createTerminationDecoration());
                splineFigure.setTargetDecoration(createHistoryDecoration());
            } else if (input.equals("strongAbortHistory")) {
                splineFigure.setSourceDecoration(createStrongAbortDecoration());
                splineFigure.setTargetDecoration(createHistoryDecoration());
            } else if (input.equals("weakAbortHistory")) {
                splineFigure.setSourceDecoration(null);
                splineFigure.setTargetDecoration(createHistoryDecoration());     
            }
            return splineFigure;
        }
        return oldFigure;
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
     * {@inheritDoc}
     */
    public IFigure getDefaultFigure() {
        // TODO Auto-generated method stub
        return null;
    }

    private static final int STRONG_ABORT_SIZE = 2;
    private static final double SRTONG_ABORT_SCALE = 2.0;

    /**
     * Create the strong abortion decoration.
     * 
     * @return The decoration.
     */
    private static RotatableDecoration createStrongAbortDecoration() {
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

    private static final int TERMINATION_SIZE = 2;
    private static final double TERMINATION_X_SCALE = 4.0;
    private static final double TERMINATION_Y_SCALE = 2.5;

    /**
     * Create the normal termination decoration.
     * 
     * @return The decoration.
     */
    private RotatableDecoration createTerminationDecoration() {
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

    private static final int HISTORY_SIZE = 3;
    private static final double HISTORY_SCALE = 2.2;
    private static final float H_REL_SIZE = 0.4f;

    /**
     * Create the history decoration.
     * 
     * @return The decoration.
     */
    private RotatableDecoration createHistoryDecoration() {
        CircleDecoration historyDecoration = new CircleDecoration() {
            protected void outlineShape(final Graphics g) {
                super.outlineShape(g);
                Rectangle bounds = getBounds();
                int hsize = (int) (H_REL_SIZE * bounds.width);
                int vsize = (int) (H_REL_SIZE * bounds.height);
                int size = hsize < vsize ? hsize : vsize;
                int topy = bounds.y + (bounds.height - size) / 2;
                int leftx = bounds.x + (bounds.width - size) / 2;
                g.setForegroundColor(ColorConstants.black);
                g.drawLine(leftx, topy, leftx, topy + size);
                g.drawLine(leftx + size, topy, leftx + size, topy + size);
                g.drawLine(leftx, topy + size / 2, leftx + size, topy + size / 2);
            }
        };
        historyDecoration.setLineWidth(2);
        historyDecoration.setForegroundColor(ColorConstants.black);
        historyDecoration.setBackgroundColor(ColorConstants.lightGray);
        PointList historyDecorationPoints = new PointList();
        historyDecorationPoints.addPoint(HISTORY_SIZE, HISTORY_SIZE);
        historyDecorationPoints.addPoint(-HISTORY_SIZE, -HISTORY_SIZE);
        historyDecoration.setTemplate(historyDecorationPoints);
        historyDecoration.setScale(HISTORY_SCALE, HISTORY_SCALE);
        return historyDecoration;
    }

    public LayoutManager getLayoutManagerByString(final String input,
            final LayoutManager oldLayoutManager, final EObject object) {
        // TODO Auto-generated method stub
        return oldLayoutManager;
    }

    public LayoutManager getDefaultLayoutManager() {
        // TODO Auto-generated method stub
        return null;
    }

    public BorderItemLocator getBorderItemLocatorByString(final String input, final IFigure parent,
            final Object locator, final EObject object, final CollapseStatus collapseStatus) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public Dimension getSizeByString(final String input, final EObject object, final EditPart part) {
        return null;
    }

}
