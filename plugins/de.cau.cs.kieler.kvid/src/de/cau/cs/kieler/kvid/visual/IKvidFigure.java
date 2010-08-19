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

import org.eclipse.draw2d.IFigure;

import de.cau.cs.kieler.kvid.data.DataObject;

/**
 * Interface for figures, which will process and draw the data themselves.
 * 
 * @author jjc
 *
 */
public interface IKvidFigure extends IFigure {
    
    /**
     * Update the displayed data and create new visuals.
     * 
     * @param thedata The updated data
     */
    void updateData(DataObject thedata);

}
