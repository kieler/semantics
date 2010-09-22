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
package de.cau.cs.kieler.kvid.ui.displays;

import java.awt.image.BufferedImage;

import org.eclipse.draw2d.LineBorder;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
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
import de.cau.cs.kieler.core.ui.util.CoreUiUtil;
import de.cau.cs.kieler.kvid.KvidUtil;
import de.cau.cs.kieler.kvid.data.DataObject;
import de.cau.cs.kieler.kvid.data.KvidUri;
import de.cau.cs.kieler.kvid.datadistributor.DataDistributor;
import de.cau.cs.kieler.kvid.datadistributor.RuntimeConfiguration;
import de.cau.cs.kieler.kvid.visual.GmfImageFigure;
import de.cau.cs.kieler.kvid.visual.complex.AbstractDataDisplayEditPart;

/**
 * EditPart which handles ScopeNodes.
 * These are Nodes, which displays scopes drawn by the Ptolemy scope drawing tools
 * as images.
 * 
 * @author jjc
 *
 */
public class ScopeEditPart extends AbstractDataDisplayEditPart {
    
    /** The URI of the referred model element. */
    private KvidUri referredObjectURI;
    
    /** The {@link Plot} instance which actually draws the scopes. */
    private Plot plot;
    
    /** The {@link GmfImageFigure} which holds the current scope as an image. */
    private GmfImageFigure currentScope;
    
    /** Variable whch stores how many steps have been displayed by now. */
    private int steps = 0;
    
    /** Default height of a ScopeNode. */
    private static final int PLOT_HEIGHT = 200;
    
    /** Default width of a ScopeNode. */
    private static final int PLOT_WIDTH = 200;
    
    /**
     * Constructor which initializes all necessary functions for scope drawing.
     * 
     * @param view The view connected to this edit part
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public ScopeEditPart(final View view) {
        super(view);
        
        DataDistributor.getInstance().registerDataListener(this);
        
        //Setup of the scope drawing tool
        plot = new Plot();
        plot.setBars(true);
        plot.setXLabel("Step");
        plot.setYLabel("Value");
        plot.setSize(PLOT_WIDTH, PLOT_HEIGHT);
        
        //Check the connected object and try to use it as a data source
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
            referredObjectURI = new KvidUri(KvidUtil.fragmentUri2PtolemyUri(
                    ModelingUtil.getFragmentUri(model), model.eResource()));
        }
    }

    /* (non-Javadoc)
     * @see org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart#createNodeFigure()
     */
    @Override
    protected NodeFigure createNodeFigure() {
        //Export plot as an image and display it
        BufferedImage image = plot.exportImage();
        ImageData data = CoreUiUtil.convertAWTImageToSWT(image);
        currentScope = new GmfImageFigure(new org.eclipse.swt.graphics.Image(
                Display.getCurrent(), data));
        WrapperNodeFigure container = new WrapperNodeFigure(currentScope);
        container.setBorder(new LineBorder());
        return container;
    }

    /**
     * Associate this node with a new model element by it's URI.
     * 
     * @param uri The referredObjectURI to set
     */
    public void setReferredObjectURI(final KvidUri uri) {
        
        this.referredObjectURI = uri;
        DataDistributor.getInstance().getDataObjectByURI(uri).setSaveHistory(true);
        
        if (referredObjectURI != null) {
            DataObject data = DataDistributor.getInstance().getDataObjectByURI(referredObjectURI);
            
            //Setup plot and load possible already existing history values
            for (int i = 0; i < data.getHistoryLength(); i++) {
                try  {
                    double value = Double.parseDouble(data.getData());
                    plot.addPoint(0, i, value, false);
                } catch (NumberFormatException nfex) {
                    //value is not usable by this element, ignore it
                }
                steps++;
            }
            plot.fillPlot();
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
            //Check the connected object and try to use it as a data source
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
                String ptolemyUri = KvidUtil.fragmentUri2PtolemyUri(
                        ModelingUtil.getFragmentUri(model), model.eResource());
                referredObjectURI = new KvidUri(ptolemyUri);
            }
            try {
                DataDistributor.getInstance().getDataObjectByURI(referredObjectURI).setSaveHistory(true);
            } catch (NullPointerException nex) {
                return;
                // Ignore this, only appears when there is no data for the
                // element to which this is connected.
                //Nothing should hapen then, only the scope stays empty
            }
        }
        
        //Process the new data
        DataObject dataObject = DataDistributor.getInstance().getDataObjectByURI(referredObjectURI);
        try {
            plot.addPoint(0, steps, Double.valueOf(dataObject.getData().toString()), false);
        } catch (NumberFormatException nfex) {
            //data is not usable by this element, ignore it
        }
        steps++;
        
        //Update drawing
        refreshPlot();
    }
    
    
    /**
     * Method that handles refreshment of the plot.
     */
    private void refreshPlot() {
        plot.fillPlot();
        plot.repaint();
        BufferedImage image = plot.exportImage();
        ImageData data = CoreUiUtil.convertAWTImageToSWT(image);
        getFigure().remove(currentScope);
        currentScope = new GmfImageFigure(new org.eclipse.swt.graphics.Image(
                Display.getCurrent(), data));
        getFigure().add(currentScope);
        currentScope.setBorder(new LineBorder());
        PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
            public void run() {
                try {
                    refreshVisuals();
                } catch (NullPointerException nex) {
                    //Happens only when the EditPart is deleted while still in use
                    //Can be ignored, since the EditPart and it's visuals are discarded anyway
                }
            }
        });
    }
    
    /* (non-Javadoc)
     * @see org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart#removeNotify()
     */
    @Override
    public void removeNotify() {
        super.removeNotify();
        //When the visual part is deleted, we don't want to receive data anymore
        DataDistributor.getInstance().removeDataListener(this);
    }
    


    /**
     * {@inheritDoc}
     */
    @Override
    public void notifyChanged(final Notification notification) {
        super.notifyChanged(notification);
        if (notification.getFeature() instanceof EAttribute) {
            EAttribute changedAttribute = (EAttribute) notification.getFeature();
            if (changedAttribute.getName().equals("width")) {
                if (notification.getNewIntValue() >= 0) {
                    plot.setSize(notification.getNewIntValue(), plot.getSize().height);
                    refreshPlot();
                }
            } else if (changedAttribute.getName().equals("height")) {
                if (notification.getNewIntValue() >= 0) {
                    plot.setSize(plot.getSize().width, notification.getNewIntValue());
                    refreshPlot();
                }
            }
        }
    }
    
    
    /**
     * {@inheritDoc}
     */
    public void triggerWrapup() {
        plot.clear(0);
        steps = 0;
        try {
            final int waitForScopeDrawingTime = 100;
            Thread.sleep(waitForScopeDrawingTime);
        } catch (InterruptedException e) {
            //Won't be interrupted, so there's no need of handling
            e.printStackTrace();
        }
        if (RuntimeConfiguration.getInstance()
                .currentValueOfProperty(DisplayFactory.CLEAR_SCOPES)
                .equals("visualization finishes")) {
            refreshPlot();
        }
    }
    
}
