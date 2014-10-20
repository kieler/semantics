/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
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
 * @author cmot
 * @kieler.design 2014-03-11 proposed
 * @kieler.rating 2014-03-11 proposed yellow

 *
 */
public class TransformationWrapper extends Transformation {

    /**
     * {@inheritDoc}
     */
    public EObject transform(EObject eObject, KielerCompilerContext context) {
        return null;
    }

}
