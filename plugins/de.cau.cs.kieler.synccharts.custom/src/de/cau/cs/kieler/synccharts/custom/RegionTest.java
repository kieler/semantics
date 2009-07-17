/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
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
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

/**
 * Simple test window that can be executed as a pure Java application
 * to test Region figures.
 * @author haf
 *
 */
public class RegionTest extends ApplicationWindow {

    /**
     * @param parentShell
     */
    public RegionTest(Shell parentShell) {
        super(parentShell);
    }

    
    /* (non-Javadoc)
     * @see org.eclipse.jface.window.Window#createContents(org.eclipse.swt.widgets.Composite)
     */
    @Override
    protected Control createContents(Composite parent) {
        Composite composite = new Composite(parent, SWT.NULL);
        composite.setLayout(new FillLayout());
        
        Canvas canvas = new Canvas(composite, SWT.NULL);
        
        LightweightSystem lws = new LightweightSystem(canvas);
        RectangleFigure parentFigure = new RectangleFigure();
        parentFigure.setBounds(new Rectangle(0,0,400,400));
        //parentFigure.setLayoutManager(new wLayout());
        lws.setContents(parentFigure);
        
        NeighborAwareOpenRectangleFigure region1 = new NeighborAwareOpenRectangleFigure();
        region1.setFill(false);
        region1.setLineWidth(2);
        region1.setLineStyle(Graphics.LINE_DASH);
        region1.setForegroundColor(ColorConstants.gray);
        Rectangle bounds = new Rectangle(100,100,200,200); 
        region1.setBounds(bounds);
        region1.setDrawSides(true, true, true, true);
        parentFigure.add(region1);
        
        NeighborAwareOpenRectangleFigure region2 = new NeighborAwareOpenRectangleFigure();
        region2.setFill(false);
        region2.setLineWidth(2);
        region2.setLineStyle(Graphics.LINE_DASH);
        region2.setForegroundColor(ColorConstants.gray);
        Rectangle bounds2 = new Rectangle(300,100,200,200); 
        region2.setBounds(bounds2);
        region2.setDrawSides(true, true, true, true);
        parentFigure.add(region2);

        NeighborAwareOpenRectangleFigure region3 = new NeighborAwareOpenRectangleFigure();
        region3.setFill(false);
        region3.setLineWidth(2);
        region3.setLineStyle(Graphics.LINE_DASH);
        region3.setForegroundColor(ColorConstants.gray);
        Rectangle bounds3 = new Rectangle(500,100,200,200); 
        region3.setBounds(bounds3);
        region3.setDrawSides(true, true, true, true);
        parentFigure.add(region3);
        
        NeighborAwareOpenRectangleFigure region4 = new NeighborAwareOpenRectangleFigure();
        region4.setFill(false);
        region4.setLineWidth(2);
        region4.setLineStyle(Graphics.LINE_DASH);
        region4.setForegroundColor(ColorConstants.gray);
        Rectangle bounds4 = new Rectangle(150,300,400,50); 
        region4.setBounds(bounds4);
        region4.setDrawSides(true, true, true, true);
        parentFigure.add(region4);
        
        return composite;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
            RegionTest window = new RegionTest(null);
            window.setBlockOnOpen(true);
            window.open();
    }

}
