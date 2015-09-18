/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.klighd;

import de.cau.cs.kieler.core.kgraph.KLabel;
import de.cau.cs.kieler.klighd.labels.AbstractKlighdLabelManager;

/**
 * @author ybl
 *
 */
public class FilterLabelsBesidesTransNumberManager extends AbstractKlighdLabelManager{

    /**
     * {@inheritDoc}
     */
    @Override
    public String resizeLabel(KLabel label, double targetWidth) {
        String labelText= label.getText().trim();
        String startNumber=labelText.substring(0, 1);
        try{
            Integer.parseInt(startNumber);
        }catch(NumberFormatException e){
            return "";
        }
        return startNumber+".";
    }
    
    

}
