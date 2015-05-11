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
package de.cau.cs.kieler.kico.transformation;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.kico.KielerCompilerContext;

/**
 * An instance of this class represents a registered hook which can run during compilation
 * manipulating the model in between transformations.
 * 
 * @author cmot
 * @kieler.design 2015-03-09 proposed
 * @kieler.rating 2015-03-09 proposed yellow
 * 
 */
public abstract class AbstractHook implements IHook {

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * This method may be overridden to optionally supply a human readable name for this processor.
     * The default implementation will return the id in place of the name.
     * 
     * @return the name
     */
    public String getName() {
        return getId();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public EObject copy(EObject model, KielerCompilerContext context) {
        return null;
    }
    
    

}
