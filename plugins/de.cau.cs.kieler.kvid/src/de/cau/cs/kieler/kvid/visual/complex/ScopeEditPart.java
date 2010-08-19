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
 */
package de.cau.cs.kieler.kvid.visual.complex;


import java.awt.image.BufferedImage;

import org.eclipse.draw2d.LineBorder;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.WrapperNodeFigure;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import ptolemy.plot.Plot;
import de.cau.cs.kieler.core.model.util.ModelingUtil;
import de.cau.cs.kieler.kvid.KvidUtil;
import de.cau.cs.kieler.kvid.data.DataObject;
import de.cau.cs.kieler.kvid.datadistributor.DataDistributor;
import de.cau.cs.kieler.kvid.datadistributor.IDataListener;
import de.cau.cs.kieler.kvid.visual.GmfImageFigure;

/**
 * @author jjc
 *
 */
public class ScopeEditPart extends ShapeNodeEditPart implements IDataListener {
    
    private String referredObjectURI;
    
    private Plot plot;
    
    private GmfImageFigure currentScope;
    
    private int steps = 0;
    
    private static final int PLOT_HEIGHT = 200;
    
    private static final int PLOT_WIDTH = 200;
    
    /**
     * 
     * @param view The view connected to this edit part
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public ScopeEditPart(final View view) {
        super(view);
        DataDistributor.getInstance().registerDataListener(this);
        plot = new Plot();
        plot.setBars(true);
        plot.setXLabel("Step");
        plot.setYLabel("Value");
        plot.setSize(PLOT_WIDTH, PLOT_HEIGHT);
        EList list = view.getSourceEdges();
        list.addAll(view.getTargetEdges());
        if (list.size() == 1) {
            Connector con = (Connector) list.get(0);
            Node connected;
            if (con.getSource() != view) {
                connected = (Node) con.getSource();
            } else {
                connected = (Node) con.getTarget();
            }
            EObject model = connected.getElement();
            referredObjectURI = KvidUtil.fragmentUri2PtolemyUri(
                    ModelingUtil.getFragmentUri(model), model.eResource());
        }
    }

    /* (non-Javadoc)
     * @see org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart#createNodeFigure()
     */
    @Override
    protected NodeFigure createNodeFigure() {
               
        BufferedImage image = plot.exportImage();
        ImageData data = KvidUtil.convertAWTImageToSWT(image);
        currentScope = new GmfImageFigure(new org.eclipse.swt.graphics.Image(
                Display.getCurrent(), data));
        WrapperNodeFigure container = new WrapperNodeFigure(currentScope);
        container.setBorder(new LineBorder());
        return container;
    }

    /**
     * @param uri the referredObjectURI to set
     */
    public void setReferredObjectURI(final String uri) {
        this.referredObjectURI = uri;
        DataDistributor.getInstance().getDataObjectByURI(uri).setSaveHistory(true);
        if (referredObjectURI != null) {
            DataObject data = DataDistributor.getInstance().getDataObjectByURI(referredObjectURI);
            plot.setXRange(0, data.getHistoryLength());
            double[] values = new double[data.getHistoryLength()];
            double maxValue = Double.NEGATIVE_INFINITY;
            double minValue = Double.POSITIVE_INFINITY;
            for (int i = 0; i < data.getHistoryLength(); i++) {
                double currentValue = Double.valueOf(data.getHistoryValue(i).toString()); 
                values[i] = currentValue;
                if (currentValue < minValue) {
                    minValue = currentValue;
                }
                if (maxValue < currentValue) {
                    maxValue = currentValue;
                }
            }
            if (0 < minValue) {
                minValue = 0;
            }
            plot.setYRange(minValue, maxValue);
            for (int i = 0; i < values.length; i++) {
                plot.addPoint(0, i, values[i], false);
                steps++;
            }
        }
    }
    

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void triggerDataChanged() {
        
        //Check if information is relevant for this edit part
        IEditorPart activeEditor = KvidUtil.getActiveEditor();
        if (activeEditor instanceof DiagramEditor) {
            if (!((DiagramEditor) activeEditor).getDiagramEditDomain()
                    .equals(this.getDiagramEditDomain())) {
                return;
            }
        } else {
            return;
        }
        
        if (referredObjectURI == null
                || DataDistributor.getInstance().getDataObjectByURI(
                        referredObjectURI) == null) {
            View view = this.getNotationView();
            EList list = view.getSourceEdges();
            list.addAll(view.getTargetEdges());
            if (list.size() == 1) {
                Connector con = (Connector) list.get(0);
                Node connected;
                if (con.getSource() != view) {
                    connected = (Node) con.getSource();
                } else {
                    connected = (Node) con.getTarget();
                }
                EObject model = connected.getElement();
                System.out.println(((InternalEObject) model).eContainingFeature().toString());
                referredObjectURI = KvidUtil.fragmentUri2PtolemyUri(
                        ModelingUtil.getFragmentUri(model), model.eResource());
            }
            DataDistributor.getInstance().getDataObjectByURI(referredObjectURI).setSaveHistory(true);
        }
        DataObject dataObject = DataDistributor.getInstance().getDataObjectByURI(referredObjectURI);
        plot.addPoint(0, steps, Double.valueOf(dataObject.getData().toString()), false);
        steps++;
        plot.fillPlot();
        plot.repaint();
        BufferedImage image = plot.exportImage();
        ImageData data = KvidUtil.convertAWTImageToSWT(image);
        getFigure().remove(currentScope);
        currentScope = new GmfImageFigure(new org.eclipse.swt.graphics.Image(
                Display.getCurrent(), data));
        getFigure().add(currentScope);
        currentScope.setBorder(new LineBorder());
        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
            public void run() {
                refreshVisuals();
            }
        });
    }
    
    /* (non-Javadoc)
     * @see org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart#removeNotify()
     */
    @Override
    public void removeNotify() {
        super.removeNotify();
        DataDistributor.getInstance().removeDataListener(this);
    }

    /**
     * {@inheritDoc}
     */
    public void triggerWrapup() {
        plot.clear(0);
        steps = 0;
        plot.repaint();
    }
    
}
