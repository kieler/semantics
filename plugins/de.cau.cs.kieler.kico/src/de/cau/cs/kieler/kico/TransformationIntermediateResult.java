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
package de.cau.cs.kieler.kico;

import org.eclipse.emf.ecore.EObject;

/**
 * This class holds information about the intermediate results of transformations.
 * 
 * @kieler.design 2015-03-09 proposed
 * @kieler.rating 2015-03-09 proposed yellow
 * @author cmot
 * 
 */
public class TransformationIntermediateResult extends IntermediateResult {

    /**
     * Instantiates a new transformation intermediate result.
     */
    public TransformationIntermediateResult() {
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new transformation intermediate result.
     * 
     * @param initialModel
     *            the initial model
     */
    public TransformationIntermediateResult(EObject initialModel) {
        this.setId("");
        this.setResult(initialModel);
        this.setDuration(0);
    }
    
    // -------------------------------------------------------------------------

}
