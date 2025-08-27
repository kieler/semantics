/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time & Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.transformations;

import org.eclipse.emf.ecore.EObject;

/**
 * Interface for transformation classes<br/>
 * 
 * @author ssm
 * @kieler.design 2014-01-14 proposed 
 * @kieler.rating 2014-01-14 proposed yellow
 *
 */
public abstract class AbstractModelTransformation {
    
    /** 
     * Call this method to invoke the transformation.
     * 
     * @param eObject
     *          an arbitrary model
     * @return Returns the transformed model.
     */
    public abstract EObject transform(EObject eObject);
    
}
