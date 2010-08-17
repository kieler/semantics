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
package de.cau.cs.kieler.kvid.visual;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.render.RenderedImage;
import org.eclipse.gmf.runtime.draw2d.ui.render.figures.ScalableImageFigure;

import de.cau.cs.kieler.kvid.data.DataObject;

/**
 * 
 * @author jjc
 *
 */
public class GmfGraphicsFigure extends ScalableImageFigure implements IKvidFigure {
    
    DataObject data;

    public GmfGraphicsFigure(DataObject thedata, RenderedImage image) {
        super(image, true, true, true);
        this.data = thedata;
        this.setBounds(new Rectangle(500, 500, 100, 100));
    }
   
    public void updateData(DataObject thedata) {
        this.data = thedata;       
    }

}
