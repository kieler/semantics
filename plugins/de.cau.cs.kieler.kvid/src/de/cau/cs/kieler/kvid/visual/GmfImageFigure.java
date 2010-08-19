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

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.swt.graphics.Image;

/**
 * @author jjc
 *
 */
public class GmfImageFigure extends ImageFigure {
    
    /**
     * Constructor for a figure which shows an image.
     * 
     * @param theimage The image to be displayed
     */
    public GmfImageFigure(final Image theimage) {
        super(theimage);
    }   
    
}
