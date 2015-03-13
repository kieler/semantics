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
package de.cau.cs.kieler.kico.ui.klighd;

import de.cau.cs.kieler.kico.Feature;
import de.cau.cs.kieler.kico.Transformation;

/**
 * This is a wrapper class so that transformations can be used seamles as Features in the diagram synth.    
 * 
 * @author cmot
 *
 */
public class TransformationFeature extends Feature {
    
    private Transformation transformation;

    //-------------------------------------------------------------------------
    
    public TransformationFeature(Transformation transformation) {
        this.transformation = transformation;
    }
    
    //-------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    public String getId() {
        return transformation.getId();
    }

    //-------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return transformation.getName();
    }


}
