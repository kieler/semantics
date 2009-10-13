/******************************************************************************
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
        
        NeighborAwareOpenRectangleFigure region1 = getNewRectangle(10, 10, 20, 20);
        parentFigure.add(region1);
        
        NeighborAwareOpenRectangleFigure region2 = getNewRectangle(40, 40, 20, 20);
        parentFigure.add(region2);
        
        NeighborAwareOpenRectangleFigure region3 = getNewRectangle(70, 5, 20, 70);
        parentFigure.add(region3);
        
        NeighborAwareOpenRectangleFigure region4 = getNewRectangle(5, 80, 80, 20);
        parentFigure.add(region4);
        
        NeighborAwareOpenRectangleFigure region5 = getNewRectangle(10, 120, 20, 20);
        parentFigure.add(region5);
        
        NeighborAwareOpenRectangleFigure region6 = getNewRectangle(40, 130, 20, 20);
        parentFigure.add(region6);
        
        parentFigure.setLayoutManager(new StretchingXYLayout());
        
        return composite;
    }
    
    NeighborAwareOpenRectangleFigure getNewRectangle(int x, int y, int width, int height){
        NeighborAwareOpenRectangleFigure rect = new NeighborAwareOpenRectangleFigure();
        rect.setFill(false);
        rect.setLineWidth(2);
        rect.setLineStyle(Graphics.LINE_DASH);
        rect.setForegroundColor(ColorConstants.gray);
        Rectangle bounds4 = new Rectangle(x,y,width,height); 
        rect.setBounds(bounds4);
        rect.setDrawSides(true, true, true, true);
        return rect;
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
            RegionTest window = new RegionTest(null);
            //window.getShell().setFullScreen(true);//Size(500, 500);
            window.setBlockOnOpen(true);
            window.open();
    }

}
