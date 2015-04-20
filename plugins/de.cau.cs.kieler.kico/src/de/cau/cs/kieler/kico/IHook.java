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
 * This interface defines what a concrete hook is. A hook is an EObject processing or
 * observation unit that is invoked before/after each transformation, processor or snapshot.
 * 
 * @author cmot
 * @kieler.design 2015-03-09 proposed
 * @kieler.rating 2015-03-09 proposed yellow
 * 
 */
public interface IHook {

    /**
     * Must supply a unique ID to identify this hook.
     * 
     * @return the string
     */
    public String getId();

    // -------------------------------------------------------------------------

    /**
     * Optionally supply a human readable name for this hook. If null is returned then the id
     * will be used in place of the name.
     * 
     * @return the string
     */
    public String getName();

    // -------------------------------------------------------------------------

    /**
     * Is invoked before each transformation. An EObject can be modified or inspected.
     * 
     * @return the list
     */
    public EObject preTransformation(EObject model);

    // -------------------------------------------------------------------------

    /**
     * Is invoked after each transformation. An EObject can be modified or inspected.
     * 
     * @return the list
     */
    public EObject postTransformation(EObject model);

    // -------------------------------------------------------------------------
    

    /**
     * Is invoked before each processor. An EObject can be modified or inspected.
     * 
     * @return the list
     */
    public EObject preProcessor(EObject model);

    // -------------------------------------------------------------------------

    /**
     * Is invoked after each processor. An EObject can be modified or inspected.
     * 
     * @return the list
     */
    public EObject postProcessor(EObject model);

    // -------------------------------------------------------------------------
    

    /**
     * Is invoked before each snapshot. An EObject can be modified or inspected.
     * 
     * @return the list
     */
    public EObject preSnapshot(EObject model);

    // -------------------------------------------------------------------------

    /**
     * Is invoked after each snapshot. An EObject can be modified or inspected.
     * 
     * @return the list
     */
    public EObject postSnapshot(EObject model);

    // -------------------------------------------------------------------------
    
}
