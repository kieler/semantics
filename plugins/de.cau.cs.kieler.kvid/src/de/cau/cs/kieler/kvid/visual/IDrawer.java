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

import java.util.HashMap;

import de.cau.cs.kieler.kvid.data.DataObject;
import de.cau.cs.kieler.kvid.data.KvidUri;

/**
 * A drawer which will draw the data on the UI somehow.
 * Implement this to support a different UI than eclipse with GMF.
 * 
 * @author jjc
 *
 */
public interface IDrawer {
    
    /**
     * Draws the given data to the UI.
     * 
     * @param dataSet The data to visualize on the UI
     */
    void draw(HashMap<KvidUri, DataObject> dataSet);
    
    /**
     * Removes KViD drawings from the UI.
     */
    void clearDrawing();

}
