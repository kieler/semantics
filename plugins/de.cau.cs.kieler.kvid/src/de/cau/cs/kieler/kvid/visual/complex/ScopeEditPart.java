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
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.LineBorder;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.WrapperNodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import ptolemy.plot.Plot;
import de.cau.cs.kieler.kvid.KvidUtil;
import de.cau.cs.kieler.kvid.data.DataObject;
import de.cau.cs.kieler.kvid.data.IDataListener;
import de.cau.cs.kieler.kvid.datadistributor.DataDistributor;
import de.cau.cs.kieler.kvid.visual.GmfImageFigure;

/**
 * @author jjc
 *
 */
public class ScopeEditPart extends ShapeNodeEditPart implements IDataListener {
    
    private String referredObjectURI;
    
    private Plot plot;
    
    private GmfImageFigure currentScope;
    
    public static List<ScopeEditPart> instances = new LinkedList<ScopeEditPart>();
    
    /**
     * 
     * @param view The view connected to this edit part
     */
    public ScopeEditPart(final View view) {
        super(view);
        instances.add(this);
        plot = new Plot();
        plot.setSize(200, 200);
    }

    /* (non-Javadoc)
     * @see org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart#createNodeFigure()
     */
    @Override
    protected NodeFigure createNodeFigure() {
               
        BufferedImage image = plot.exportImage();
        ImageData data = KvidUtil.convertAWTImageToSWT(image);
        currentScope = new GmfImageFigure(new org.eclipse.swt.graphics.Image(Display.getCurrent(), data));
        WrapperNodeFigure container = new WrapperNodeFigure(currentScope);
        container.setBorder(new LineBorder());
        return container;
    }

    /**
     * @param referredObjectURI the referredObjectURI to set
     */
    public void setReferredObjectURI(String URI) {
        this.referredObjectURI = URI;
        DataDistributor.getInstance().getDataObjectByURI(URI).setSaveHistory(true);
        DataDistributor.getInstance().getDataObjectByURI(URI).registerDataListener(this);
        if (referredObjectURI != null) {
            DataObject data = DataDistributor.getInstance().getDataObjectByURI(referredObjectURI);
            plot.setBars(true);
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
            plot.setXLabel("Step");
            plot.setYLabel("Value");
            for (int i = 0; i < values.length; i++) {
                plot.addPoint(0, i, values[i], false);
            }
        }
    }
    
    /* (non-Javadoc)
     * @see de.cau.cs.kieler.kvid.data.IDataListener#triggerDataChanged()
     */
    public void triggerDataChanged() {
        if (referredObjectURI != null) {
            DataObject data = DataDistributor.getInstance().getDataObjectByURI(referredObjectURI);
            plot.setBars(true);
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
            plot.setXLabel("Step");
            plot.setYLabel("Value");
            for (int i = 0; i < values.length; i++) {
                plot.addPoint(0, i, values[i], false);
            }
        }
        plot.repaint();
        BufferedImage image = plot.exportImage();
        ImageData data = KvidUtil.convertAWTImageToSWT(image);
        getFigure().remove(currentScope);
        currentScope = new GmfImageFigure(new org.eclipse.swt.graphics.Image(Display.getCurrent(), data));
        getFigure().add(currentScope);
        getFigure().setBorder(new LineBorder());
        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
            public void run() {
                refreshVisuals();
            }
        });
    }
    
    
    
}
