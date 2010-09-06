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

import org.eclipse.gmf.runtime.draw2d.ui.render.RenderedImage;
import org.eclipse.gmf.runtime.draw2d.ui.render.figures.ScalableImageFigure;

import de.cau.cs.kieler.kvid.data.DataObject;

/**
 * Figure who use a scalable image for visualization.
 * 
 * @author jjc
 * @deprecated Use {@link GmfImageFigure} instead
 *
 */
public class GmfGraphicsFigure extends ScalableImageFigure implements IKvidFigure {
    
    /** Reference to the currently displayed data. */
    private DataObject data;

    /**
     * Constructor which expects a {@link RenderedImage}.
     * Use the {@link RenderedImageFactory} to receive one from an image file. 
     * 
     * @param thedata The {@link DataObject} to display with this figure
     * @param image The image which will be used for display
     */
    public GmfGraphicsFigure(final DataObject thedata, final RenderedImage image) {
        super(image, true, true, true);
        this.data = thedata;
    }
   
    /**
     * {@inheritDoc}
     */
    public void updateData(final DataObject thedata) {
        this.data = thedata;       
    }
    
    /**
     * {@inheritDoc}
     */
    public DataObject getData() {
        return data;
    }
    
    /**
     * {@inheritDoc}
     */
    public IKvidFigure copy() {
        DataObject dataCopy = new DataObject(data.getUri(), data.getData().toString());
        return new GmfFigure(dataCopy);
    }

}
