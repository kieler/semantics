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
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.WrapperNodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import ptolemy.plot.Plot;
import de.cau.cs.kieler.kvid.KvidUtil;
import de.cau.cs.kieler.kvid.visual.GmfImageFigure;

/**
 * @author jjc
 *
 */
public class DataDisplayEditPart extends ShapeNodeEditPart {

    /**
     * 
     * @param view The view connected to this edit part
     */
    public DataDisplayEditPart(final View view) {
        super(view);
    }

    /* (non-Javadoc)
     * @see org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart#createNodeFigure()
     */
    @Override
    protected NodeFigure createNodeFigure() {
        //RenderedImage image = 
        //    RenderedImageFactory.getInstance(
        //            "/home/jjc/workspace/kieler/de.cau.cs.kieler.kvid/images/drawing.svg");
        //GmfGraphicsFigure figure = new GmfGraphicsFigure(new DataObject("muh", "3"), image);
        //GmfFigure figure = new GmfFigure(new DataObject("muh", "42"));
        Plot plot = new Plot();
        plot.setTitle("Sample plot");
        plot.setYRange(-4, 4);
        plot.setXRange(0, 100);
        plot.setXLabel("time");
        plot.setYLabel("value");
        plot.addYTick("-PI", -Math.PI);
        plot.addYTick("-PI/2", -Math.PI / 2);
        plot.addYTick("0", 0);
        plot.addYTick("PI/2", Math.PI / 2);
        plot.addYTick("PI", Math.PI);
        plot.setMarksStyle("none");
        plot.setImpulses(true);
        boolean first = true;
        for (int i = 0; i <= 100; i++) {
            double xvalue = i;

            // NOTE: jdk 1.3beta has a bug exhibited here.
            // The value of the second argument in the calls
            // to addPoint() below is corrupted the second
            // time that this method is called.  The print
            // statement below shows that the value is
            // correct before the call.
            // System.out.println("x value: " + xvalue);
            // For some bizarre reason, this problem goes
            // away when this code is executed in the event
            // dispatch thread.
            plot.addPoint(0, xvalue, 5 * Math.cos((Math.PI * i) / 20),
                    !first);
            plot.addPoint(1, xvalue, 4.5 * Math.cos((Math.PI * i) / 25),
                    !first);
            plot.addPoint(2, xvalue, 4 * Math.cos((Math.PI * i) / 30),
                    !first);
            plot.addPoint(3, xvalue, 3.5 * Math.cos((Math.PI * i) / 35),
                    !first);
            plot.addPoint(4, xvalue, 3 * Math.cos((Math.PI * i) / 40),
                    !first);
            plot.addPoint(5, xvalue, 2.5 * Math.cos((Math.PI * i) / 45),
                    !first);
            plot.addPoint(6, xvalue, 2 * Math.cos((Math.PI * i) / 50),
                    !first);
            plot.addPoint(7, xvalue, 1.5 * Math.cos((Math.PI * i) / 55),
                    !first);
            plot.addPoint(8, xvalue, 1 * Math.cos((Math.PI * i) / 60),
                    !first);
            plot.addPoint(9, xvalue, 0.5 * Math.cos((Math.PI * i) / 65),
                    !first);
            first = false;
         } // for
        
        BufferedImage image = plot.exportImage();
        ImageData data = KvidUtil.convertAWTImageToSWT(image);
        GmfImageFigure figure = new GmfImageFigure(new org.eclipse.swt.graphics.Image(Display.getCurrent(), data));
        WrapperNodeFigure container = new WrapperNodeFigure(figure);
        container.setBorder(new LineBorder());
        return container;
    }
    
}
